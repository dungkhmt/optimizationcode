from ortools.constraint_solver import pywrapcp, routing_enums_pb2

from problem import Problem
from solution import analyze_routes, analyze_solution_quality

import routing_solver

if __name__ == '__main__':
    problem = Problem('datasets/50.50.1000.txt')

    param = pywrapcp.DefaultRoutingSearchParameters()
    param.local_search_metaheuristic = routing_enums_pb2.LocalSearchMetaheuristic.GUIDED_LOCAL_SEARCH
    param.time_limit.FromSeconds(450)
    param.log_search = True

    solution = routing_solver.solve(problem, param)

    analyze_routes(solution, problem)
    analyze_solution_quality(solution, problem)
