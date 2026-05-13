from ortools.linear_solver import pywraplp
import sys 

def input_f(filename):
 with open(filename,'r') as f:   
  [K,N] = [int(x)for x in f.readline().split()]
  Q = [int(x)for x in f.readline().split()]
  d = [int(x)for x in f.readline().split()]
  d = [0] + d
  
  c = []
  for i in range(N+1):
   row = [int(x)for x in f.readline().split()]
   c.append(row)
  return K,N,Q,d,c 

def input_stdin():
 [K,N] = [int(x)for x in sys.stdin.readline().split()]
 Q = [int(x)for x in sys.stdin.readline().split()]
 d = [int(x)for x in sys.stdin.readline().split()]
 d = [0] + d
 
 c = []
 for i in range(N+1):
  row = [int(x)for x in sys.stdin.readline().split()]
  c.append(row)
 return K,N,Q,d,c 
  
#K,N,Q,d,c = input_f('cvrp.txt')
#K,N,Q,d,c = input_f('cvrp-3-7.txt')
#K,N,Q,d,c = input_f('cvrp-2-10.txt')
#K,N,Q,d,c = input_f('cvrp-3-10.txt')
K,N,Q,d,c = input_stdin()


solver = pywraplp.Solver.CreateSolver('SCIP')

#define decision variables
X = dict()
for k in range(K):
 for i in range(N+1):
  for j in range(N+1):
   X[k,i,j] = solver.IntVar(0,1,'X('+str(k) + ','+ str(i) + ',' + str(j) + ')')
   
SD = sum(d)
   
U = dict()
for i in range(N+1):
 for k in range(K):
  U[i,k] = solver.IntVar(0,SD,'U(' + str(i) + ',' + str(k) + ')')
  
#constraints
for i in range(1,N+1):
 solver.Add(sum(X[k,i,j] for k in range(K) for j in range(N+1)) == 1)
 solver.Add(sum(X[k,j,i] for k in range(K) for j in range(N+1)) == 1)

# if truck k enters point i then it leaves the point i
for i in range(1,N+1):
 for k in range(K):
  solver.Add(solver.Sum(X[k,i,j] for j in range(N+1) if i != j) == solver.Sum(X[k,j,i] for j in range(N+1) if i != j))
  
for k in range(K):
 solver.Add(sum(X[k,0,i] for i in range(N+1)) <= 1)
 
for k in range(K):
 for i in range(N+1):
  solver.Add(X[k,i,i] == 0)     

# chanelling constraint: X[k,i,j] = 1 => U[j,k] = U[i,k] + d[j]
M = SD*2
for k in range(K):
 for i in range(N+1):
  for j in range(1,N+1):
   cstr1 = solver.Constraint(d[j] - M,SD)
   cstr1.SetCoefficient(U[j,k],1)
   cstr1.SetCoefficient(U[i,k],-1)
   cstr1.SetCoefficient(X[k,i,j],-M)
   
   cstr2 = solver.Constraint(-SD,M+d[j])
   cstr2.SetCoefficient(U[j,k],1)
   cstr2.SetCoefficient(U[i,k],-1)
   cstr2.SetCoefficient(X[k,i,j],M)
   
   
# capacity constraints
for k in range(K):
 for i in range(N+1):
  solver.Add(U[i,k] <= Q[k])
  
# objective
solver.Minimize(sum(c[i][j]*X[k,i,j] for k in range(K)for i in range(N+1)for j in range(N+1)))

status = solver.Solve()

def extract_route(k):
 cur = -1
 for i in range(N+1):
  if X[k,0,i].solution_value() > 0:
   cur = i
   break 
 route = [cur]
 def find_next(k,cur):
  for j in range(N+1):
   if X[k,cur,j].solution_value() > 0:
    return j 
  return -1
 
 while cur > 0:
  next_point = find_next(k,cur)
  if next_point > 0:
   route.append(next_point)
  cur = next_point
 return route 
 
def print_solution_routes():
 print(K)
 for k in range(K):
  r = extract_route(k)
  print(len(r),end = ' ')
  print(*r)
  
def print_solution():
 print('objective ',solver.Objective().Value())   
 for k in range(K):
  print('Route[',k,']:')
  for i in range(N+1):
   for j in range(N+1):
    if X[k,i,j].solution_value() > 0:
     print('(',k,',',i,',',j,')')
  
  for i in range(N+1):
   print('U[',i,',',k,'] = ',U[i,k].solution_value())      
if status == pywraplp.Solver.OPTIMAL:
 #print_solution()
 print_solution_routes()
else:
 print("The problem does not have an optimal solution.")  
   