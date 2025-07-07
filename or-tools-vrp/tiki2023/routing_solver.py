import functools
import sys

from ortools.constraint_solver import pywrapcp, routing_enums_pb2

from problem import Problem
from solution import analyze_solution_quality

FLOAT_SCALING_FACTOR = 1e5
WAIT_TIME_MAX = int(24 * 3600 * FLOAT_SCALING_FACTOR)

TIME_DIMENSION = "TIME"
WEIGHT_DIMENSION = "WEIGHT"
VOLUME_DIMENSION = "VOLUME"


def solve(problem: Problem, search_parameters):
    index_manager = pywrapcp.RoutingIndexManager(
        2 * problem.request_count + problem.truck_count,
        problem.truck_count,
        list(range(2 * problem.request_count, 2 * problem.request_count + problem.truck_count)),
        list(range(2 * problem.request_count, 2 * problem.request_count + problem.truck_count))
    )

    model = pywrapcp.RoutingModel(index_manager)

    def model_node_to_problem_node(model_node):
        if 0 <= model_node < problem.request_count:
            return problem.requests[model_node].pickup_hub
        if problem.request_count <= model_node < 2 * problem.request_count:
            return problem.requests[model_node - problem.request_count].drop_hub
        if 2 * problem.request_count <= model_node < 2 * problem.request_count + problem.truck_count:
            return problem.trucks[model_node - 2 * problem.request_count].depot

        raise IndexError(f'Nút {model_node} không tồn tại trong mô hình')

    def model_node_service_time(model_node):
        if 0 <= model_node < problem.request_count:
            return problem.requests[model_node].pickup_service_time
        if problem.request_count <= model_node < 2 * problem.request_count:
            return problem.requests[model_node - problem.request_count].drop_service_time

        return 0

    def create_time_callback(truck_id):
        @functools.lru_cache(maxsize=None)
        def time_callback(from_index, to_index):
            from_model_node = index_manager.IndexToNode(from_index)
            to_model_node = index_manager.IndexToNode(to_index)

            from_problem_node = model_node_to_problem_node(from_model_node)
            to_problem_node = model_node_to_problem_node(to_model_node)

            time = model_node_service_time(from_model_node)
            time += problem.distance(from_problem_node, to_problem_node) / problem.trucks[truck_id].velocity
            return int(FLOAT_SCALING_FACTOR * time)

        return time_callback

    def weight_callback(from_index):
        from_model_node = index_manager.IndexToNode(from_index)

        if 0 <= from_model_node < problem.request_count:
            result = problem.requests[from_model_node].weight
        elif problem.request_count <= from_model_node < 2 * problem.request_count:
            result = -problem.requests[from_model_node - problem.request_count].weight
        else:
            result = 0

        return int(FLOAT_SCALING_FACTOR * result)

    def volume_callback(from_index):
        from_model_node = index_manager.IndexToNode(from_index)

        if 0 <= from_model_node < problem.request_count:
            result = problem.requests[from_model_node].volume
        elif problem.request_count <= from_model_node < 2 * problem.request_count:
            result = -problem.requests[from_model_node - problem.request_count].volume
        else:
            result = 0

        return int(FLOAT_SCALING_FACTOR * result)

    time_callback_indices = [
        model.RegisterTransitCallback(create_time_callback(truck_id)) for truck_id in range(problem.truck_count)
    ]

    weight_callback_index = model.RegisterUnaryTransitCallback(weight_callback)
    volume_callback_index = model.RegisterUnaryTransitCallback(volume_callback)

    model.AddDimensionWithVehicleTransitAndCapacity(
        time_callback_indices,
        WAIT_TIME_MAX,
        [int(FLOAT_SCALING_FACTOR * truck.end_time) for truck in problem.trucks],
        False,
        TIME_DIMENSION
    )

    model.AddDimensionWithVehicleCapacity(
        weight_callback_index,
        0,
        [int(FLOAT_SCALING_FACTOR * truck.capacity) for truck in problem.trucks],
        True,
        WEIGHT_DIMENSION
    )

    model.AddDimensionWithVehicleCapacity(
        volume_callback_index,
        0,
        [int(FLOAT_SCALING_FACTOR * truck.volume) for truck in problem.trucks],
        True,
        VOLUME_DIMENSION
    )

    time_dimension: pywrapcp.RoutingDimension = model.GetDimensionOrDie("TIME")

    # Pickup and Delivery
    for pickup_node in range(problem.request_count):
        pickup_index = index_manager.NodeToIndex(pickup_node)
        drop_index = index_manager.NodeToIndex(pickup_node + problem.request_count)

        model.AddPickupAndDelivery(pickup_index, drop_index)
        model.solver().Add(model.VehicleVar(pickup_index) == model.VehicleVar(drop_index))
        model.solver().Add(time_dimension.CumulVar(pickup_index) <= time_dimension.CumulVar(drop_index))

    # Time window
    for pickup_node in range(problem.request_count):
        request = problem.requests[pickup_node]
        pickup_index = index_manager.NodeToIndex(pickup_node)
        time_dimension.CumulVar(pickup_index).SetRange(
            int(FLOAT_SCALING_FACTOR * request.start_pickup_time),
            int(FLOAT_SCALING_FACTOR) * request.end_pickup_time
        )

    for drop_node in range(problem.request_count, 2 * problem.request_count):
        request = problem.requests[drop_node - problem.request_count]
        drop_index = index_manager.NodeToIndex(drop_node)
        time_dimension.CumulVar(drop_index).SetRange(
            int(FLOAT_SCALING_FACTOR * request.start_drop_time),
            int(FLOAT_SCALING_FACTOR * request.end_drop_time)
        )

    for depot_node in range(2 * problem.request_count, 2 * problem.request_count + problem.truck_count):
        truck = problem.trucks[depot_node - 2 * problem.request_count]
        depot_index = index_manager.NodeToIndex(depot_node)
        time_dimension.CumulVar(depot_index).SetRange(
            int(FLOAT_SCALING_FACTOR * truck.start_time),
            int(FLOAT_SCALING_FACTOR * truck.end_time)
        )

    # Disjunction, Objective
    for pickup_node in range(2 * problem.request_count):
        model.AddDisjunction([index_manager.NodeToIndex(pickup_node)], int(1e17 / problem.request_count / 2))

    model.SetFixedCostOfAllVehicles(int(1e14 / problem.truck_count))
    time_dimension.SetSpanCostCoefficientForAllVehicles(1)

    # Solve
    solution = model.SolveWithParameters(search_parameters)

    print(model.status())
    print_solution(problem, index_manager, model, solution)

    return to_solution(problem, index_manager, model, solution)


def print_solution(problem, manager, model, solution):
    time_dimension = model.GetDimensionOrDie(TIME_DIMENSION)
    weight_dimension = model.GetDimensionOrDie(WEIGHT_DIMENSION)
    volume_dimension = model.GetDimensionOrDie(VOLUME_DIMENSION)

    print(f"Objective: {solution.ObjectiveValue()}")
    print(f"Score: {(1e17 - solution.ObjectiveValue())/1e8}")

    for vehicle_id in range(problem.truck_count):
        print(f"Route for vehicle {vehicle_id}:")

        if not model.IsVehicleUsed(solution, vehicle_id):
            print("Vehicle Unused\n")
            continue

        index = model.Start(vehicle_id)

        while True:
            time_var = time_dimension.CumulVar(index)
            weight_var = weight_dimension.CumulVar(index)
            volume_var = volume_dimension.CumulVar(index)

            print(f"{manager.IndexToNode(index)}"
                  f", time: {solution.Value(time_var)}"
                  f", weight: {solution.Value(weight_var)}"
                  f", volume: {solution.Value(volume_var)}"
                  )

            index = solution.Value(model.NextVar(index))

            if model.IsEnd(index):
                time_var = time_dimension.CumulVar(index)
                weight_var = weight_dimension.CumulVar(index)
                volume_var = volume_dimension.CumulVar(index)

                print(f"{manager.IndexToNode(index)}"
                      f", time: {solution.Value(time_var)}"
                      f", weight: {solution.Value(weight_var)}"
                      f", volume: {solution.Value(volume_var)}"
                      )

                print()
                break


def to_solution(problem, manager, model: pywrapcp.RoutingModel, solution):
    result = []

    for vehicle_id in range(problem.truck_count):
        if not model.IsVehicleUsed(solution, vehicle_id):
            result.append([])
            continue

        index = model.Start(vehicle_id)
        index = solution.Value(model.NextVar(index))

        route = []
        while not model.IsEnd(index):
            node = manager.IndexToNode(index)
            if node < problem.request_count:
                route.append(node)
            else:
                route.append(node - problem.request_count)

            index = solution.Value(model.NextVar(index))

        result.append(route)

    return result


if __name__ == '__main__':
    prb = Problem('datasets/sample.txt')

    param = pywrapcp.DefaultRoutingSearchParameters()
    param.local_search_metaheuristic = routing_enums_pb2.LocalSearchMetaheuristic.GUIDED_LOCAL_SEARCH
    param.time_limit.FromSeconds(5)
    param.log_search = True

    sol = solve(prb, param)
    print(sol)
    analyze_solution_quality(sol, prb)
