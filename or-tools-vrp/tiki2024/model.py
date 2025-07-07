from enum import Enum

from ortools.constraint_solver import routing_enums_pb2
from ortools.constraint_solver import pywrapcp

# Đặt tên cho các DIMENSION trong mô hình OR TOOLS
TIME_DIMENSION = 'TIME'
LOAD_DIMENSION = 'LOAD'

# Giá trị tối đa của thời gian đi mỗi chuyến.
# Bài toán không có ràng buộc này nhưng OR-Tools yêu cầu dimension phải có nên được đặt là một số lớn.
INT64_MAX = (1 << 63) - 1
TIME_MAX = INT64_MAX

# Hệ số của thời gian lộ trình dài nhất trong hàm mục tiêu
TIME_COEFFICIENT_ALPHA = 10000


class PickupAction(Enum):
    PICKUP_CONTAINER = 0
    PICKUP_CONTAINER_TRAILER = 1


class DropAction(Enum):
    DROP_CONTAINER = 0
    DROP_CONTAINER_TRAILER = -1


def string2action(s: str):
    if s == 'PICKUP_CONTAINER':
        return PickupAction.PICKUP_CONTAINER
    if s == 'PICKUP_CONTAINER_TRAILER':
        return PickupAction.PICKUP_CONTAINER_TRAILER
    if s == 'DROP_CONTAINER':
        return DropAction.DROP_CONTAINER
    if s == 'DROP_CONTAINER_TRAILER':
        return DropAction.DROP_CONTAINER_TRAILER


class Request:
    def __init__(self, request_id, size, pickup_node, pickup_action, pickup_time, drop_node, drop_action, drop_time):
        self.request_id = request_id
        self.size = size
        self.pickup_node = pickup_node
        self.pickup_action = pickup_action
        self.pickup_time = pickup_time
        self.drop_node = drop_node
        self.drop_action = drop_action
        self.drop_time = drop_time


class Truck:
    def __init__(self, truck_id, depot):
        self.truck_id = truck_id
        self.depot = depot


class Problem:
    node_count: int
    truck_count: int
    request_count: int
    __distances: list[list[int]]
    trucks = list[Truck]
    requests = list[Request]
    trailer_node: int
    trailer_time: int

    # Đọc instance từ file text, định dạng file theo mô tả trong Hackathon
    def __init__(self, filename: str):
        with open(filename) as file:
            self.node_count = int(file.readline().split(' ')[1])
            file.readline()

            self.__distances = [[0 for _ in range(self.node_count)] for __ in range(self.node_count)]
            self.trucks = []
            self.requests = []

            for i in range(self.node_count):
                for j in range(self.node_count):
                    self.__distances[i][j] = int(file.readline().split(' ')[2])

            _, trailer_node, trailer_time = file.readline().split(' ')
            self.trailer_node = int(trailer_node)
            self.trailer_time = int(trailer_time)

            _, truck_count = file.readline().split(' ')
            self.truck_count = int(truck_count)

            for i in range(self.truck_count):
                truck_id, depot = map(int, file.readline().split(' '))
                self.trucks.append(Truck(truck_id, depot))

            while True:
                line = file.readline()
                if line.strip() == '#':
                    break

                _, request_id, size, pickup_node, pickup_action, pickup_time, drop_node, drop_action, drop_time = line.split(
                    ' ')

                self.requests.append(
                    Request(
                        int(request_id),
                        int(size),
                        int(pickup_node),
                        string2action(pickup_action),
                        int(pickup_time),
                        int(drop_node),
                        string2action(drop_action),
                        int(drop_time)
                    )
                )

            self.request_count = len(self.requests)

    # Trả về khoảng cách giữa 2 nút của bài toán
    def distance(self, from_node, to_node):
        return self.__distances[from_node - 1][to_node - 1]


# Để mô hình bài toán bằng OR-Tools, mỗi phần pickup và drop
# của một request là một điểm đến (nút) trong mô hình.
# Sau đây, nút trong mô hình được gọi là model_node, các nút thực tế
# của problem gọi là problem_node

# Đánh số [0, request_count) làm model_node ứng với việc pickup lần lượt các request 1, 2, ...
# Đánh số [request_count, 2*request_count) làm model_node ứng với việc drop các request 1, 2, ...
# Đánh số [2*request_count, 2*request_count + truck_count) làm model_node ứng với depot của xe 1, 2, ...


# Trả về số nút có trong mô hình
# Bằng problem.request_count nút nhận + problem.request_count nút trả + problem.truck_count nút làm depot xe
def model_node_count(problem: Problem):
    return 2 * problem.request_count + problem.truck_count


# Trả về list các nút có vai trò pickup trong mô hình
def model_pickup_nodes(problem: Problem):
    return list(range(problem.request_count))


# Trả về list các nút có vai trò drop trong mô hình
def model_delivery_nodes(problem: Problem):
    return list(range(problem.request_count, 2 * problem.request_count))


# Trả về list các nút có vai trò làm depot cho truck trong mô hình
def model_truck_depot_nodes(problem: Problem):
    return list(range(2 * problem.request_count, 2 * problem.request_count + problem.truck_count))


# Trả về liệu nút model_node của mô hình có phải nút nhận container không
def is_pickup_node(model_node: int, problem: Problem):
    return model_node < problem.request_count


# Trả về liệu nút model_node của mô hình có phải nút trả container không
def is_drop_node(model_node: int, problem: Problem):
    return problem.request_count <= model_node < 2 * problem.request_count


# Trả về liệu nút model_node của mô hình có phải nút depot cho truck không
def is_truck_depot_node(model_node: int, problem: Problem):
    return 2 * problem.request_count <= model_node < 2 * problem.request_count + problem.truck_count


# Trả về Request ứng với model_node trong problem
# Lỗi nếu model_node không ứng với Request nào trong problem
def get_request(model_node: int, problem: Problem) -> Request:
    if is_pickup_node(model_node, problem):
        return problem.requests[model_node]
    if is_drop_node(model_node, problem):
        return problem.requests[model_node - problem.request_count]

    raise IndexError(f'model_node={model_node} không ứng với request nào.')


# Nếu model_node là depot xe tải thì trả về xe tải xuất phát từ model_node
def get_truck(model_node: int, problem: Problem) -> Truck:
    if is_truck_depot_node(model_node, problem):
        return problem.trucks[model_node - 2 * problem.request_count]

    raise IndexError(f'model_node={model_node} không ứng với truck nào.')


# Trả về liệu khi rời model_node thì xe có TRAILER không
# Nếu đi từ PICKUP hoặc DROP_CONTAINER thì chắc chắn lúc rời có trailer
# Nếu đi từ DEPOT hoặc DROP_CONTAINER_TRAILER thì không có trailer
def has_trailer_after_leave_node(model_node: int, problem: Problem) -> bool:
    if is_truck_depot_node(model_node, problem):
        return False
    if is_pickup_node(model_node, problem):
        return True

    drop_action = get_request(model_node, problem).drop_action

    if drop_action == DropAction.DROP_CONTAINER:
        return True

    return False


# Trả về liệu có cần TRAILER để phục vụ model_node không
# Nếu đi tới DEPOT hoặc PICKUP_CONTAINER_TRAILER thì không cần trailer
# Nếu đi tới PICKUP_CONTAINER hoặc DROP_CONTAINER thì cần trailer
def need_trailer_to_serve_node(model_node: int, problem: Problem) -> bool:
    if is_truck_depot_node(model_node, problem):
        return False
    if is_drop_node(model_node, problem):
        return True

    pickup_action = get_request(model_node, problem).pickup_action

    if pickup_action == PickupAction.PICKUP_CONTAINER:
        return True

    return False


# Chuyển giữa model_node và problem_node
# Nếu model_node là PICKUP/DROP đơn thì trả về nút giao/trả đơn trong problem
def model_node_to_problem_node(model_node: int, problem: Problem):
    if is_pickup_node(model_node, problem):
        return get_request(model_node, problem).pickup_node
    if is_drop_node(model_node, problem):
        return get_request(model_node, problem).drop_node
    if is_truck_depot_node(model_node, problem):
        return get_truck(model_node, problem).depot

    raise IndexError(f'model_node={model_node} không nằm trong khoảng hợp lệ.')


# Trả về khoảng cách để đi từ model_node này tới model_node kia
# Khoảng cách này tính cả khoảng cách đi tới nút TRAILER nếu cần lấy/trả TRAILER
def model_node_distance(from_model_node: int, to_model_node: int, problem: Problem):
    has_trailer = has_trailer_after_leave_node(from_model_node, problem)
    need_trailer = need_trailer_to_serve_node(to_model_node, problem)

    need_to_go_to_trailer_node = ((has_trailer and not need_trailer)
                                  or (not has_trailer and need_trailer))

    from_problem_node = model_node_to_problem_node(from_model_node, problem)
    to_problem_node = model_node_to_problem_node(to_model_node, problem)

    if need_to_go_to_trailer_node:
        return (problem.distance(from_problem_node, problem.trailer_node)
                + problem.distance(problem.trailer_node, to_problem_node))
    else:
        return problem.distance(from_problem_node, to_problem_node)


# Trả về khoảng thời gian từ lúc tới from node, tới khi tới model_node
# Bao gồm cả thời gian phục vụ tại from và thời gian lấy/trả trailer nếu có
def model_node_time_between(from_model_node: int, to_model_node: int, problem: Problem):
    has_trailer = has_trailer_after_leave_node(from_model_node, problem)
    need_trailer = need_trailer_to_serve_node(to_model_node, problem)

    need_to_go_to_trailer_node = (has_trailer and not need_trailer) or (not has_trailer and need_trailer)

    extra_time = 0
    if is_pickup_node(from_model_node, problem):
        extra_time += get_request(from_model_node, problem).pickup_time
    elif is_drop_node(from_model_node, problem):
        extra_time += get_request(from_model_node, problem).drop_time

    if need_to_go_to_trailer_node:
        extra_time += problem.trailer_time

    return extra_time + model_node_distance(from_model_node, to_model_node, problem)


# Tạo ra RoutingModel cho bài toán TIKI đầu vào
def solve(problem: Problem, search_parameters):
    index_manager = pywrapcp.RoutingIndexManager(
        model_node_count(problem),
        problem.truck_count,
        model_truck_depot_nodes(problem),
        model_truck_depot_nodes(problem)
    )

    model = pywrapcp.RoutingModel(index_manager)

    def distance_callback(from_index, to_index):
        from_model_node = index_manager.IndexToNode(from_index)
        to_model_node = index_manager.IndexToNode(to_index)

        return model_node_distance(from_model_node, to_model_node, problem)

    def time_callback(from_index, to_index):
        from_model_node = index_manager.IndexToNode(from_index)
        to_model_node = index_manager.IndexToNode(to_index)

        return model_node_time_between(from_model_node, to_model_node, problem)

    def load_callback(from_index):
        from_model_node = index_manager.IndexToNode(from_index)

        if is_pickup_node(from_model_node, problem):
            return get_request(from_model_node, problem).size
        if is_drop_node(from_model_node, problem):
            return -get_request(from_model_node, problem).size

        return 0

    # Đăng ký callback
    distance_callback_index = model.RegisterTransitCallback(distance_callback)
    time_callback_index = model.RegisterTransitCallback(time_callback)
    load_callback_index = model.RegisterUnaryTransitCallback(load_callback)

    # Thêm và truy xuất các DIMENSION
    model.AddDimension(load_callback_index, 0, 40, True, LOAD_DIMENSION)
    model.AddDimension(time_callback_index, 0, TIME_MAX, True, TIME_DIMENSION)

    load_dimension = model.GetDimensionOrDie(LOAD_DIMENSION)
    time_dimension = model.GetDimensionOrDie(TIME_DIMENSION)

    # Thiết lập hàm mục tiêu
    model.SetArcCostEvaluatorOfAllVehicles(distance_callback_index)
    time_dimension.SetGlobalSpanCostCoefficient(TIME_COEFFICIENT_ALPHA)

    # Thêm ràng buộc PICKUP và DELIVERY
    for pickup_node in model_pickup_nodes(problem):
        pickup_index = index_manager.NodeToIndex(pickup_node)
        drop_index = index_manager.NodeToIndex(pickup_node + problem.request_count)

        model.AddPickupAndDelivery(pickup_index, drop_index)
        model.solver().Add(model.VehicleVar(pickup_index) == model.VehicleVar(drop_index))
        model.solver().Add(time_dimension.CumulVar(pickup_index) <= time_dimension.CumulVar(drop_index))

    # Ngay trước khi phục vụ nút với PICKUP_CONTAINER_TRAILER thì LOAD = 0
    for model_node in model_pickup_nodes(problem):
        index = index_manager.NodeToIndex(model_node)

        if get_request(model_node, problem).pickup_action == PickupAction.PICKUP_CONTAINER_TRAILER:
            model.solver().Add(load_dimension.CumulVar(index) == 0)

    # Ngay trước khi phục vụ nút với DROP_CONTAINER_TRAILER thì LOAD = size của chính request đó
    for model_node in model_delivery_nodes(problem):
        index = index_manager.NodeToIndex(model_node)

        if get_request(model_node, problem).drop_action == DropAction.DROP_CONTAINER_TRAILER:
            model.solver().Add(load_dimension.CumulVar(index) == get_request(model_node, problem).size)

    solution = model.SolveWithParameters(search_parameters)

    print_solution(solution, problem, index_manager, model)


def print_solution(solution, problem: Problem, index_manager, model):
    time_dimension = model.GetDimensionOrDie(TIME_DIMENSION)

    print(f"Giá trị hàm mục tiêu: {solution.ObjectiveValue()}")
    print(f"Điểm: {1000000000 - solution.ObjectiveValue()}")
    print()

    for truck_index in range(problem.truck_count):
        if not model.IsVehicleUsed(solution, truck_index):
            print(f"Lộ trình xe {truck_index}: Rỗng\n")
            continue

        index = model.Start(truck_index)
        output = f"Lộ trình xe: {truck_index}: "

        while not model.IsEnd(index):
            time_var = time_dimension.CumulVar(index)

            output += f" {index_manager.IndexToNode(index)} (time: {solution.Value(time_var)}) -> "
            index = solution.Value(model.NextVar(index))

        output += f"{index_manager.IndexToNode(index)} (time: {solution.Value(time_dimension.CumulVar(index))})"

        print(output)


if __name__ == '__main__':
    search_parameters = pywrapcp.DefaultRoutingSearchParameters()
    search_parameters.local_search_metaheuristic = routing_enums_pb2.LocalSearchMetaheuristic.GUIDED_LOCAL_SEARCH
    search_parameters.time_limit.FromSeconds(10)
    search_parameters.log_search = True

    solve(Problem('dataset/10.4.10.txt'), search_parameters)
