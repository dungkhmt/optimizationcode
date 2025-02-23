import sys
from ortools.linear_solver import pywraplp

def input(filename):
 with open(filename,'r') as f:
  [m,n] = [int(x) for x in f.readline().split()]
 
  # read the preference list 
  P = []
  for i in range(m):
   r = [int(x)-1 for x in f.readline().split()]
   P.append(r)
  
  # read conflicting courses 
  [K] = [int(x) for x in f.readline().split()]
  B = []
  for k in range(K):
   [i,j] = [int(x) for x in f.readline().split()]
   B.append([i-1,j-1])
  
  return m,n,P,B 

m,n,P,B = input('BCA.txt')
#print(m,n)
#print(P)
#print(B)

#create a solver
solver = pywraplp.Solver.CreateSolver('SCIP')
INF = solver.infinity()

#define decision variables: x(t,i) = 1 means that teacher i is assigned to course j 
x = [[solver.IntVar(0,1,'x(' + str(t) + ',' + str(i) + ')') for i in range(n)] for t in range(m)]
#print(x)
y = [solver.IntVar(0,n,'y(' + str(t) + ')') for t in range(m)]
z = solver.IntVar(0,n,'z')

# state constraints

# each course i must be assigned to exactly one teacher
for i in range(n):
 c = solver.Constraint(1,1)
 for t in range(m):
  c.SetCoefficient(x[t][i],1)

for t  in range(m):
 for i in range(n):
  if not(i in P[t]):# explore all courses not in yhe preference list of teacher t
   c = solver.Constraint(0,0)
   c.SetCoefficient(x[t][i],1)   
   
for [i,j] in B: # explore all pairs of 2 conflicting courses (i,j)
 for t in range(m):
  c = solver.Constraint(0,1)
  c.SetCoefficient(x[t][i],1)
  c.SetCoefficient(x[t][j],1)


# constraint linking x and y: y[t] = \sum_{i in 0..n-1} x[t][i]
for t in range(m):
 c = solver.Constraint(0,0)
 for i in range(n):
  c.SetCoefficient(x[t][i],1)
 c.SetCoefficient(y[t],-1)

# constraint linking y and z: z >= r[t], forall t 
for t in range(m):
 c = solver.Constraint(0,INF)
 c.SetCoefficient(z,1)
 c.SetCoefficient(y[t],-1)

# state objective function

obj = solver.Objective()
obj.SetCoefficient(z,1)

obj.SetMinimization()

status = solver.Solve()
if status != pywraplp.Solver.OPTIMAL:
 print('no optimal solution')
else:
 print('obj = ',solver.Objective().Value()) 

for t in range(m):
 for i in range(n):
  print(x[t][i],' = ',x[t][i].solution_value()) 