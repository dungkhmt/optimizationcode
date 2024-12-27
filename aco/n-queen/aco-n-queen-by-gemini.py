import random
import math

class AntColonyOptimization:
    def __init__(self, n, num_ants, alpha, beta, rho, iterations):
        self.n = n
        self.num_ants = num_ants
        self.alpha = alpha  # Influence of pheromone
        self.beta = beta    # Influence of heuristic information
        self.rho = rho      # Evaporation rate of pheromone
        self.iterations = iterations
        self.pheromone = [[1.0 / n for _ in range(n)] for _ in range(n)]

    def heuristic_information(self, board, row, col):
        # A simple heuristic: Count the number of attacks from the current position
        attacks = 0
        for i in range(row):
            if board[i] == col:
                attacks += 1
            if abs(board[i] - col) == abs(i - row):
                attacks += 1
        return 1.0 / (attacks + 1)

    def construct_solution(self, ant):
        board = [-1] * self.n
        for i in range(self.n):
            probabilities = []
            for j in range(self.n):
                if j not in board:
                    pheromone_value = self.pheromone[i][j] ** self.alpha
                    heuristic_value = self.heuristic_information(board, i, j) ** self.beta
                    probabilities.append(pheromone_value * heuristic_value)
            total = sum(probabilities)
            probabilities = [p / total for p in probabilities]
            col = random.choices(range(self.n), weights=probabilities)[0]
            board[i] = col
        return board

    def update_pheromone(self, solutions):
        for i in range(self.n):
            for j in range(self.n):
                self.pheromone[i][j] *= (1 - self.rho)
                for solution in solutions:
                    if solution[i] == j:
                        self.pheromone[i][j] += 1.0 / len(solutions)

    def solve(self):
        best_solution = None
        best_fitness = -1
        for _ in range(self.iterations):
            solutions = []
            for _ in range(self.num_ants):
                solution = self.construct_solution([])
                fitness = self.n - sum(self.heuristic_information(solution, i, solution[i]) for i in range(self.n))
                solutions.append(solution)
                if fitness > best_fitness:
                    best_fitness = fitness
                    best_solution = solution
            self.update_pheromone(solutions)
        return best_solution, best_fitness

# Example usage
n = 8
aco = AntColonyOptimization(n, 50, 1, 2, 0.5, 100)
best_solution, best_fitness = aco.solve()
print("Best solution:", best_solution)
print("Best fitness:", best_fitness)