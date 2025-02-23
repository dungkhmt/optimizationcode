from ortools.linear_solver import pywraplp

def Input():
    n = int(input()) #number of jobs
    r = {}
    d = {}
    t = list()
    for i in range(n):
        num_task = int(input()) #nummber of tasks of a job
        list_in4 = list(map(int, input().split()))
        for j in range(num_task):
            t.append([list_in4[3*j],i,j])
            r[i,j] = list_in4[3*j + 1]
            d[i,j] = list_in4[3*j + 2]

    max_time = sum(d[i,j] for (i,j) in r)
    #print(max_time)
    
    return n, t, r, d, max_time

def solve():
    solver = pywraplp.Solver.CreateSolver("GLOP")
    n, t, r, d, max_time = Input()
    #print(t)
    #print(r)
    #print(d)
    X = {}
    Z = {}
    Y = solver.IntVar(0, max_time, "obj")
    for [id,i,j] in t:
        #print([i,j])
        X[i,j] = solver.IntVar(0, max_time, f"X[{i},{j}]")
    
    for [id,i1,j1] in t:
        for [id,i2,j2] in t:
            if [i1,j1] != [i2,j2]:
                Z[i1,j1,i2,j2] = solver.BoolVar(f"Z[{i1},{j1},{i2},{j2}]")

    #C1
    for [id,i,j] in t:
        if [id+1,i,j+1] in t:
            solver.Add(X[i,j] + d[i,j] <= X[i,j+1])

    #C2
    for [id,i1,j1] in t:
        for [id,i2,j2] in t:
            if [i1,j1] != [i2,j2]:
                solver.Add(Z[i1,j1,i2,j2] + Z[i2,j2,i1,j1] >= 1)
                solver.Add(Z[i1,j1,i2,j2] + Z[i2,j2,i1,j1] <= 1)
    
    #C3
    for [id,i1,j1] in t:
        for [id,i2,j2] in t:
            if i1 != i2 and r[i1,j1] == r[i2,j2]:
                solver.Add(1000*(1 - Z[i1,j1,i2,j2]) + X[i2,j2] >= X[i1,j1] + d[i1,j1])

    #C4
    for [id,i,j] in t:
        solver.Add(Y >= X[i,j] + d[i,j])
    
    #Solve
    solver.Minimize(Y)
    status = solver.Solve()
    if status == pywraplp.Solver.OPTIMAL:
        print(n)
        #print(solver.Objective().Value())
        m = max(r[i,j] for [id,i,j] in t)
        for l in range(m+1):
            #print(l)
            list_job = list()
            for [id,i,j] in t:
                if r[i,j] == l:
                    list_job.append([id,i,j,X[i,j].solution_value()])
            list_job.sort(key = lambda x: x[3])
            for k in range(len(list_job)):
                print(f"{list_job[k][0]}", end=" ")
            
            print()

    else:
        print("NO SOLUTION")

solve()