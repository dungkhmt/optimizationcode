import datetime
import math
import random
import math
import numpy as np
import sys


def get_operator(weights):
    nb_ops = len(weights)
    s = []
    s.append(0 + weights[0])
    for i in range(1, nb_ops):
        s.append(s[i - 1] + weights[i])
    r = s[nb_ops - 1] * random.random()
    if 0 <= r <= s[0]:
        return 0
    for i in range(1, nb_ops):
        if s[i - 1] < r <= s[i]:
            return i
    return -1


class CVRP:
    def __init__(self, n, K, Q, demand, D):
        self.n = n  # number of customers
        self.K = K  # number of vehicles
        self.Q = Q  # capacity
        self.D = D  # distance matrix
        self.demand = demand  # demand
        self.x = [i for i in range(self.n + self.K)]  # x[i] is the next point of i
        self.visited = [False for i in range(self.n + self.K)] #status of customers
        self.vh_cap = [0 for i in range(self.K)] #accumulated weight of each vehicle
        self.vh_dis = [0 for i in range(self.K)] #accumulated distance of each vehicle
        self.total_distance = 0
        self.served_cus = 0

        # alns param
        self.nb_insert_ops = 3  # number of insertion operators
        self.nb_removal_ops = 3  # number of removal operators
        self.pti = [1.0 / self.nb_insert_ops for i in range(self.nb_insert_ops)]
        self.ptd = [1.0 / self.nb_removal_ops for i in range(self.nb_removal_ops)]
        self.wi = [1 for i in range(self.nb_insert_ops)]  # number of times used of insertion operators
        self.wd = [1 for i in range(self.nb_removal_ops)]  # number of times used of removal operators
        self.si = [0 for i in range(self.nb_insert_ops)]  # score of insertion operators
        self.sd = [0 for i in range(self.nb_removal_ops)]  # score of removal operators

        self.temperature = 200
        self.cooling_rate = 0.995
        self.lower_removal = int(0.1 * self.n)
        self.upper_removal = int(0.25 * self.n)
        self.sigma1 = 3
        self.sigma2 = 1
        self.sigma3 = -1
        self.rp = 0.01
        self.nw = 1

    # def check_route(self, k):
    #     i = k
    #     dis = 0
    #     while True:
    #         dis += self.D[i][self.x[i]]
    #         if self.x[i] == k:
    #             break
    #         i = self.x[i]
    #     return dis
    def print(self):
        print('x = ', end=' ')
        for i in range(self.n+self.K):
            print('[', i, self.x[i], ']', end=' ')
        print('')
        for k in range(self.K):
            print('dis = ', self.vh_dis[k], ", ")
            i = self.x[k]
            # while i < self.n-1:
            print(k, end=' -> ')
            while i != k:
                print(i, end=' -> ')
                i = self.x[i]
            print(i)
            print('')
        print('total distance = ', self.total_distance)
        print('total served customers = ', self.served_cus)

    def copy_solution(self, x, vh_cap, vh_dis, visited, total_distance, served_cus):
        self.x = [x[i] for i in range(len(x))]
        self.vh_cap = [vh_cap[i] for i in range(len(vh_cap))]
        self.vh_dis = [vh_dis[i] for i in range(len(vh_dis))]
        self.visited = [visited[i] for i in range(len(visited))]
        self.total_distance = total_distance
        self.served_cus = served_cus

    def update_prob(self):
        for i in range(self.nb_insert_ops):
            self.pti[i] = max(0.0, self.pti[i] * (1 - self.rp) + self.rp * self.si[i] / self.wi[i])
        for i in range(self.nb_removal_ops):
            self.ptd[i] = max(0.0, self.ptd[i] * (1 - self.rp) + self.rp * self.sd[i] / self.wd[i])

    def evaluate_add_one_point_2_best_position(self, p, k):  # add point p to route k
        min_delta = 1e10
        best_pos = -1
        if self.x[k] == k:
            return k, self.D[k][p] + self.D[p][k]
        i = k
        while True:
            delta = self.D[i][p] + self.D[p][self.x[i]] - self.D[i][self.x[i]]
            if delta < min_delta:
                min_delta = delta
                best_pos = i
            if self.x[i] == k:
                break
            i = self.x[i]
        return best_pos, min_delta

    def evaluate_remove_one_point(self, p):
        for k in range(self.K):
            if self.x[k] == k: continue
            i = k
            while self.x[i] != k:
                if self.x[i] == p:
                    return k, i, self.D[i][self.x[p]] - self.D[i][p] - self.D[p][self.x[p]]
                i = self.x[i]
        return -1, -1, 0

    def propagate_add_one_point_2_route(self, p, k, pos, delta):
        temp = self.x[pos]
        self.x[pos] = p
        self.x[p] = temp
        self.vh_dis[k] += delta
        self.vh_cap[k] += self.demand[p]
        self.visited[p] = True
        self.served_cus += 1
        self.total_distance += delta

    def propagate_remove_one_point(self, p, k, pos, delta):
        self.x[pos] = self.x[p]
        self.x[p] = -1
        self.vh_dis[k] += delta
        self.vh_cap[k] -= self.demand[p]
        self.visited[p] = False
        self.served_cus -= 1
        self.total_distance += delta

    def first_possible_route_insertion(self):
        for p in range(self.K, self.n + self.K):
            if not self.visited[p]:
                arr = list(np.arange(self.K))
                random.shuffle(arr)
                for k in arr:
                    if self.vh_cap[k] + self.demand[p] <= self.Q:
                        pos, delta = self.evaluate_add_one_point_2_best_position(p, k)
                        if pos != -1:
                            self.propagate_add_one_point_2_route(p, k, pos, delta)
                            break

    def best_possible_route_insertion(self):
        for p in range(self.K, self.n + self.K):
            if not self.visited[p]:
                best_pos = -1
                best_route = -1
                min_delta = 1e10
                for k in range(self.K):
                    if self.vh_cap[k] + self.demand[p] <= self.Q:
                        pos, delta = self.evaluate_add_one_point_2_best_position(p, k)
                        if delta < min_delta:
                            min_delta = delta
                            best_pos = pos
                            best_route = k
                if best_pos != -1:
                    self.propagate_add_one_point_2_route(p, best_route, best_pos, min_delta)

    def second_best_possible_route_insertion(self):
        for p in range(self.K, self.n + self.K):
            if not self.visited[p]:
                best_pos = -1
                best_route = -1
                min_delta = 1e10
                second_pos = -1
                second_route = -1
                second_delta = 1e10
                for k in range(self.K):
                    if self.vh_cap[k] + self.demand[p] <= self.Q:
                        pos, delta = self.evaluate_add_one_point_2_best_position(p, k)
                        if delta < min_delta:
                            second_delta = min_delta
                            second_pos = best_pos
                            second_route = best_route
                            min_delta = delta
                            best_pos = pos
                            best_route = k
                if second_pos != -1:
                    self.propagate_add_one_point_2_route(p, second_route, second_pos, second_delta)
    def random_removal(self):
        nb_remove = random.randint(self.lower_removal, self.upper_removal)
        cnt = 0
        arr = list(np.arange(self.K, self.K + self.n))
        random.shuffle(arr)
        for p in arr:
            if not self.visited[p]: continue
            route, pos, delta = self.evaluate_remove_one_point(p)
            if pos != -1:
                self.propagate_remove_one_point(p, route, pos, delta)
                cnt += 1
            if cnt > nb_remove: break

    def worst_removal(self):
        nb_remove = random.randint(self.lower_removal, self.upper_removal)
        cnt = 0
        while True:
            min_delta = 1e10
            best_pos = -1
            best_route = -1
            best_point = -1
            for p in range(self.K, self.K + self.n):
                if not self.visited[p]: continue
                route, pos, delta = self.evaluate_remove_one_point(p)
                if pos != -1:
                    if delta < min_delta:
                        min_delta = delta
                        best_pos = pos
                        best_route = route
                        best_point = p
            if best_pos != -1:
                self.propagate_remove_one_point(best_point, best_route, best_pos, min_delta)
                cnt += 1
            else:
                break
            if cnt > nb_remove: break

    def route_removal(self):
        nb_remove = random.randint(self.lower_removal, self.upper_removal)
        cnt = 0
        while True:
            arr = list(np.arange(self.K))
            random.shuffle(arr)
            is_removed = False
            for k in arr:
                if self.x[k] == k: continue
                i = self.x[k]
                while i != k:
                    route, pos, delta = self.evaluate_remove_one_point(i)
                    if pos != -1:
                        self.propagate_remove_one_point(i, route, pos, delta)
                        cnt += 1
                        is_removed = True
                    i = self.x[k]
                    if cnt > nb_remove: break
                if cnt > nb_remove: break
            if cnt > nb_remove or is_removed == False: break

    def alns_solver(self, max_time, max_iters):
        start_time = datetime.datetime.now()
        it = 0

        #init solution
        self.first_possible_route_insertion()
        best_x = [self.x[i] for i in range(len(self.x))]
        best_vh_cap = [self.vh_cap[i] for i in range(len(self.vh_cap))]
        best_vh_dis = [self.vh_dis[i] for i in range(len(self.vh_dis))]
        best_visited = [self.visited[i] for i in range(len(self.visited))]
        best_total_distance = self.total_distance
        best_served_cus = self.served_cus
        while it <= max_iters:
            cur_x = [self.x[i] for i in range(len(self.x))]
            cur_vh_cap = [self.vh_cap[i] for i in range(len(self.vh_cap))]
            cur_vh_dis = [self.vh_dis[i] for i in range(len(self.vh_dis))]
            cur_visited = [self.visited[i] for i in range(len(self.visited))]
            cur_total_distance = self.total_distance
            cur_served_cus = self.served_cus

            i_selected_removal = get_operator(self.ptd)
            self.wd[i_selected_removal] += 1
            if i_selected_removal == 0:
                self.random_removal()
            elif i_selected_removal == 1:
                self.worst_removal()
            else:
                self.route_removal()

            i_selected_insertion = get_operator(self.pti)
            self.wi[i_selected_insertion] += 1
            if i_selected_insertion == 0:
                self.first_possible_route_insertion()
            elif i_selected_insertion == 1:
                self.best_possible_route_insertion()
            else:
                self.second_best_possible_route_insertion()

            if self.served_cus > cur_served_cus or \
                (self.served_cus == cur_served_cus and self.total_distance < cur_total_distance):
                if self.served_cus > best_served_cus or \
                        (self.served_cus == best_served_cus and self.total_distance < best_total_distance):
                    best_x = [self.x[i] for i in range(len(self.x))]
                    best_vh_cap = [self.vh_cap[i] for i in range(len(self.vh_cap))]
                    best_vh_dis = [self.vh_dis[i] for i in range(len(self.vh_dis))]
                    best_visited = [self.visited[i] for i in range(len(self.visited))]
                    best_total_distance = self.total_distance
                    best_served_cus = self.served_cus

                    #update score
                    self.si[i_selected_insertion] += self.sigma1
                    self.sd[i_selected_removal] += self.sigma1
                else:
                    self.si[i_selected_insertion] += self.sigma2
                    self.sd[i_selected_removal] += self.sigma2
            else:
                self.si[i_selected_insertion] += self.sigma3
                self.sd[i_selected_removal] += self.sigma3
                if self.served_cus == cur_served_cus:
                    v = math.exp(-(self.total_distance - cur_total_distance) / self.temperature)
                    r = random.random()
                    if r >= v:
                        self.copy_solution(cur_x, cur_vh_cap, cur_vh_dis,
                                           cur_visited, cur_total_distance, cur_served_cus)
            it += 1
            if it % self.nw == 0:
                self.update_prob()
            self.temperature = self.temperature * self.cooling_rate

        self.copy_solution(best_x, best_vh_cap, best_vh_dis, best_visited, best_total_distance, best_served_cus)

def inputFile(filename):
    with open(filename, 'r') as f:
        [n, K, Q] = [int(x) for x in f.readline().split()]
        D = []
        x_cor = []
        y_cor = []
        demand = []
        for i in range(n):
            [xi, yi] = [int(x) for x in f.readline().split()]
            if i == 0:
                for j in range(K):
                    x_cor.append(xi)
                    y_cor.append(yi)
            else:
                x_cor.append(xi)
                y_cor.append(yi)
        for i in range(n):
            [di] = [int(x) for x in f.readline().split()]
            if i == 0:
                for j in range(K):
                    demand.append(di)
            else:
                demand.append(di)
        for i in range(n + K - 1):
            m = []
            for j in range(n + K - 1):
                dis = 0
                if i != j:
                    dis = math.sqrt((x_cor[i] - x_cor[j]) * (x_cor[i] - x_cor[j])
                                    + (y_cor[i] - y_cor[j]) * (y_cor[i] - y_cor[j]))
                m.append(dis)
            D.append(m)
        return n - 1, K, Q, demand, D


n, K, Q, demand, D = inputFile('./S-X-n17-k4.vrp.txt')
app = CVRP(n, K, Q, demand, D)
app.alns_solver(300, 100000)
app.print()
