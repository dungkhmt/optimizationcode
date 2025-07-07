from dataclasses import dataclass
from tabulate import tabulate
from problem import Problem


@dataclass
class Route:
    truck_id: int
    route: list

    def does_contain(self, request_id):
        return 1 if request_id in self.route else 0

    def is_served_by(self, truck_id):
        return 1 if truck_id == self.truck_id else 0


def smallest_end_time(route: Route, problem: Problem):
    truck = problem.trucks[route.truck_id]

    current_time = truck.start_time
    current_hub = truck.depot
    inventory = set()

    for request_id in route.route:
        request = problem.requests[request_id]

        if request_id not in inventory:
            arrival_time = current_time + problem.distance(current_hub, request.pickup_hub) / truck.velocity
            current_time = max(arrival_time, request.start_pickup_time) + request.pickup_service_time

            # print(request_id, arrival_time, current_time)

            current_hub = request.pickup_hub
            inventory.add(request_id)
        else:
            arrival_time = current_time + problem.distance(current_hub, request.drop_hub) / truck.velocity
            current_time = max(arrival_time, request.start_drop_time) + request.drop_service_time

            # print(request_id, arrival_time, current_time)

            current_hub = request.drop_hub
            inventory.remove(request_id)

    return current_time + problem.distance(current_hub, truck.depot) / truck.velocity


def largest_start_time(end_time: float, route: Route, problem: Problem):
    truck = problem.trucks[route.truck_id]

    current_time = end_time

    current_hub = truck.depot
    inventory = set()

    for request_id in reversed(route.route):
        request = problem.requests[request_id]

        if request_id in inventory:
            departure_time = current_time - problem.distance(request.pickup_hub, current_hub) / truck.velocity - request.pickup_service_time
            current_time = min(request.end_pickup_time, departure_time)

            # print(request_id, current_time, departure_time)

            current_hub = request.pickup_hub
            inventory.remove(request_id)
        else:
            departure_time = current_time - problem.distance(request.drop_hub, current_hub) / truck.velocity - request.drop_service_time
            current_time = min(request.end_drop_time, departure_time)

            # print(request_id, current_time, departure_time)

            current_hub = request.drop_hub
            inventory.add(request_id)

    departure_time = current_time - problem.distance(truck.depot, current_hub) / truck.velocity

    return departure_time


def smallest_time(route: Route, problem: Problem):
    _smallest_end_time = smallest_end_time(route, problem)
    return _smallest_end_time - largest_start_time(_smallest_end_time, route, problem)


class TruckState:
    def __init__(self, truck_id, problem: Problem):

        self.id = truck_id
        self.problem = problem

        truck = problem.trucks[truck_id]
        self.depot = truck.depot
        self.end_time = truck.end_time
        self.capacity = truck.capacity
        self.volume = truck.volume
        self.velocity = truck.velocity

        self.current_node = truck.depot
        self.arrival_time = truck.start_time
        self.current_time = truck.start_time
        self.load = 0
        self.volume = 0

        self.inventory = set()

    def validate_and_serve(self, request_id):
        request = self.problem.requests[request_id]

        if request_id not in self.inventory:
            # Đi đến
            self.current_time += self.problem.distance(self.current_node, request.pickup_hub) / self.velocity
            self.arrival_time = self.current_time
            self.current_node = self.problem.requests[request_id].pickup_hub

            # Phục vụ
            if self.current_time < request.start_pickup_time:
                self.current_time = request.start_pickup_time
            if self.current_time > request.end_pickup_time:
                raise AssertionError(
                    f'Xe {self.id} đang ở thời điểm {self.current_time}, không thể nhận đơn {request_id} có thời gian nhận muộn nhất là {request.end_pickup_time}')

            self.current_time += request.pickup_service_time
            self.load += request.weight
            self.volume += request.volume

            self.inventory.add(request_id)
        else:
            # Đi đến
            self.current_time += self.problem.distance(self.current_node, request.drop_hub) / self.velocity
            self.arrival_time = self.current_time
            self.current_node = self.problem.requests[request_id].drop_hub

            # Phục vụ
            if self.current_time < request.start_drop_time:
                self.current_time = request.start_drop_time
            if self.current_time > request.end_drop_time:
                raise AssertionError(
                    f'Xe {self.id} đang ở thời điểm {self.current_time}, không thể trả đơn {request_id} có thời gian trả muộn nhất là {request.end_pickup_time}')

            self.current_time += request.drop_service_time
            self.load -= request.weight
            self.volume -= request.volume

            self.inventory.remove(request_id)

    def time_when_return_depot(self):
        return self.current_time + self.problem.distance(self.current_node, self.depot) / self.velocity


def validate(solution, problem: Problem) -> str:
    # Kiểm tra điều kiện trên từng lộ trình
    for route_id, route in enumerate(solution):
        truck_state = TruckState(route_id, problem)

        # Phục vụ từng đơn một, báo lỗi nếu không thể phục vụ
        for request_id in route:
            try:
                truck_state.validate_and_serve(request_id)
            except AssertionError as error:
                return str(error)

        if truck_state.inventory:
            return f'Xe {route_id} chưa drop các đơn đã nhận sau: {truck_state.inventory}'

        depot_return_time = (truck_state.current_time
                             + problem.distance(truck_state.current_node, truck_state.depot) / truck_state.velocity)

        if depot_return_time > truck_state.end_time:
            return f'Xe {route_id} về depot lúc {depot_return_time}, quá thời gian yêu cầu về kho là {truck_state.end_time}'

    # Kiểm tra ràng buộc trên các lộ trình với nhau: 1 đơn xe này giao rồi thì xe kia thôi
    request_to_truck_dict = {}
    for route_id, route in enumerate(solution):
        for request_id in route:
            if request_id not in request_to_truck_dict.keys():
                request_to_truck_dict[request_id] = route_id
            else:
                if route_id != request_to_truck_dict[request_id]:
                    return f'Request {request_id} đã được xe {request_to_truck_dict[request_id]} giao, xuất hiện lại ở xe {route_id}'

    return 'Nghiệm hợp lệ'


def analyze_routes(solution, problem: Problem):
    header = ['Request ID', 'Action', 'Hub', 'Weight', 'Request Volume', 'Begin Serve Time', 'Arrival Time',
              'End Serve Time',
              'Load', 'Truck Volume']

    for route_id, route in enumerate(solution):
        print(f'Chi tiết lộ trình {route_id}:\n')

        data = []
        truck_state = TruckState(route_id, problem)

        # Thêm xuất phát depot
        data.append(['depot', 'start', truck_state.depot, '-', '-', problem.trucks[route_id].start_time,
                     problem.trucks[route_id].start_time, '-', '0', '0'])

        for request_id in route:
            request = problem.requests[request_id]
            is_pickup = request_id not in truck_state.inventory

            try:
                truck_state.validate_and_serve(request_id)
            except AssertionError as error:
                if is_pickup:
                    data.append([request_id, 'pickup failed', request.pickup_hub, request.weight, request.volume,
                                 request.start_pickup_time,
                                 truck_state.arrival_time, request.end_pickup_time, '-', '-'])
                else:
                    data.append([request_id, 'drop failed', request.drop_hub, request.weight, request.volume,
                                 request.start_drop_time,
                                 truck_state.arrival_time, request.end_drop_time, '-', '-'])

                print(error)
                break

            if is_pickup:
                data.append([request_id, 'pickup', request.pickup_hub, request.weight, request.volume,
                             request.start_pickup_time,
                             truck_state.arrival_time, request.end_pickup_time, truck_state.load, truck_state.volume])
            else:
                data.append(
                    [request_id, 'drop', request.drop_hub, request.weight, request.volume, request.start_drop_time,
                     truck_state.arrival_time, request.end_drop_time, truck_state.load, truck_state.volume])

        # Thêm quay về
        data.append(['depot', 'end', truck_state.depot, '-', '-', '-',
                     truck_state.time_when_return_depot(), truck_state.end_time, '0', '0'])

        print(tabulate(data, header, tablefmt='github'))
        print()


def analyze_solution_quality(solution, problem: Problem):
    request_served = int(sum(len(route) for route in solution) / 2)
    truck_used = sum(1 if route else 0 for route in solution)

    analyze_routes(solution, problem)

    for route_id, route in enumerate(solution):
        truck_state = TruckState(route_id, problem)

    print(f'Trạng thái nghiệm: {validate(solution, problem)}')

    times = [smallest_time(Route(route_id, route), problem) for route_id, route in enumerate(solution)]

    score = 1e9 * request_served / problem.request_count - 1e6 * truck_used / problem.truck_count - sum(times) / 1e3

    print(f'Số đơn giao: {request_served}/{problem.request_count}')
    print(f'Số xe dùng: {truck_used}/{problem.truck_count}')
    print(f'Tổng thời gian: {sum(times)}')

    print(f'Điểm: {score}')


if __name__ == '__main__':
    prb = Problem('datasets/sample.txt')
    sol = [
        [9, 7, 5, 5, 3, 7, 1, 9, 2, 3, 8, 1, 8, 2],
        [4, 6, 0, 4, 0, 6]
    ]

    # analyze_routes(sol, prb)
    analyze_solution_quality(sol, prb)
