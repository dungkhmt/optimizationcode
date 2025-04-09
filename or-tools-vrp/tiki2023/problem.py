from dataclasses import dataclass

from utility import hhmmss_to_second


@dataclass
class Truck:
    depot: int
    start_time: int
    end_time: int
    capacity: float
    volume: float
    velocity: float

    def __init__(self, s: str):
        depot, start_time, end_time, capacity, volume, velocity = s.split(' ')
        self.depot = int(depot)
        self.start_time = hhmmss_to_second(start_time)
        self.end_time = hhmmss_to_second(end_time)
        self.capacity = float(capacity)
        self.volume = float(volume)
        self.velocity = float(velocity) / 3.6


@dataclass
class Request:
    pickup_hub: int
    drop_hub: int
    weight: float
    volume: float
    start_pickup_time: int
    end_pickup_time: int
    pickup_service_time: int
    start_drop_time: int
    end_drop_time: int
    drop_service_time: int

    def __init__(self, s: str):
        (pickup_hub,
         drop_hub,
         weight,
         volume,
         pickup_service_time,
         drop_service_time,
         start_pickup_time,
         end_pickup_time,
         start_drop_time,
         end_drop_time) = s.split(' ')

        self.pickup_hub = int(pickup_hub)
        self.drop_hub = int(drop_hub)
        self.weight = float(weight)
        self.volume = float(volume)
        self.start_pickup_time = hhmmss_to_second(start_pickup_time)
        self.end_pickup_time = hhmmss_to_second(end_pickup_time)
        self.pickup_service_time = int(pickup_service_time)
        self.start_drop_time = hhmmss_to_second(start_drop_time)
        self.end_drop_time = hhmmss_to_second(end_drop_time)
        self.drop_service_time = int(drop_service_time)


class Problem:
    node_count: int
    truck_count: int
    request_count: int

    _distances: list[list[int]]
    trucks: list[Truck]
    requests: list[Request]

    def __init__(self, filename):
        with open(filename) as file:
            self.node_count = int(file.readline())
            self._distances = []
            for _ in range(self.node_count):
                self._distances.append(list(map(int, file.readline().strip().split(' '))))

            self.truck_count = int(file.readline())
            self.trucks = []
            for _ in range(self.truck_count):
                self.trucks.append(Truck(file.readline().strip()))

            self.request_count = int(file.readline())
            self.requests = []
            for _ in range(self.request_count):
                self.requests.append(Request(file.readline().strip()))

    def distance(self, from_node: int, to_node: int):
        return self._distances[from_node - 1][to_node - 1]
