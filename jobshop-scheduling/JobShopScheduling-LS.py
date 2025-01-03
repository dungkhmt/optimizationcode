
import random

class JobShopScheduling:
    def __init__(self, jobs, machines):
        self.jobs = jobs
        self.machines = machines
        self.schedule = []
        self.best_schedule = None
        self.best_makespan = float('inf')

    def initialize_schedule(self):
        self.schedule = []
        for job in self.jobs:
            job_schedule = []
            for task in job:
                machine, duration = task
                job_schedule.append((machine, duration, random.randint(0, 100)))
            self.schedule.append(job_schedule)

    def calculate_makespan(self, schedule):
        machine_times = [0] * self.machines
        job_times = [0] * len(schedule)
        
        for i, job in enumerate(schedule):
            for task in job:
                machine, duration, start_time = task
                end_time = max(machine_times[machine], job_times[i]) + duration
                machine_times[machine] = end_time
                job_times[i] = end_time
        
        return max(machine_times)

    def local_search(self):
        self.initialize_schedule()
        current_schedule = self.schedule
        current_makespan = self.calculate_makespan(current_schedule)
        
        while True:
            neighbors = self.generate_neighbors(current_schedule)
            best_neighbor = min(neighbors, key=self.calculate_makespan)
            best_neighbor_makespan = self.calculate_makespan(best_neighbor)
            
            if best_neighbor_makespan < current_makespan:
                current_schedule = best_neighbor
                current_makespan = best_neighbor_makespan
                
                if current_makespan < self.best_makespan:
                    self.best_schedule = current_schedule
                    self.best_makespan = current_makespan
            else:
                break

    def generate_neighbors(self, schedule):
        neighbors = []
        
        for i in range(len(schedule)):
            for j in range(len(schedule[i])):
                neighbor = [list(job) for job in schedule]
                neighbor[i][j] = (neighbor[i][j][0], neighbor[i][j][1], random.randint(0, 100))
                neighbors.append(neighbor)
        
        return neighbors

    def print_best_schedule(self):
        if self.best_schedule is None:
            print("No valid schedule found.")
            return
        
        print("Best Schedule:")
        for i, job in enumerate(self.best_schedule):
            print(f"Job {i+1}:")
            for task in job:
                print(f"  Machine {task[0]}, Duration {task[1]}, Start Time {task[2]}")
        print(f"Best Makespan: {self.best_makespan}")

# Example usage
jobs = [
    [(0, 3), (1, 2), (2, 2)],
    [(0, 2), (2, 1), (1, 4)],
    [(1, 4), (2, 3)]
]
machines = 3

jss = JobShopScheduling(jobs, machines)
jss.local_search()
jss.print_best_schedule()
