import sys
from ortools.sat.python import cp_model

def inputFile(filename):
 with open(filename,'r') as f:
  [m,n] = [int(x) for x in f.readline().split()]
 
  # read the preference list 
  P = []
  D = [set() for i in range(n)]
   
  for j in range(m):
   r = [int(x)-1 for x in f.readline().split()]
   P.append(r)
   for i in r[1:]:
    D[i].add(j)
   
  # read conflicting courses 
  [K] = [int(x) for x in f.readline().split()]
  B = []
  for k in range(K):
   [i,j] = [int(x) for x in f.readline().split()]
   B.append([i-1,j-1])
  
  return m,n,P,D,B 

def input():
 f = sys.stdin
 [m,n] = [int(x) for x in f.readline().split()]
 
 # read the preference list 
 P = []
 D = [set() for i in range(n)]
   
 for j in range(m):
  r = [int(x)-1 for x in f.readline().split()]
  P.append(r)
  for i in r[1:]:
   D[i].add(j)
   
 # read conflicting courses 
 [K] = [int(x) for x in f.readline().split()]
 B = []
 for k in range(K):
  [i,j] = [int(x) for x in f.readline().split()]
  B.append([i-1,j-1])
  
 return m,n,P,D,B 

m,n,P,D,B = inputFile('BCA.txt')
#m,n,P,D,B = input()

#print(m,n)
#print(P)
#print(B)

#create a solver

model = cp_model.CpModel()

#define decision variables: u(i,j) = 1 means that teacher j is assigned to course i 

x = {}
y = {}
u = {}
for i in range(n):
 x[i] = model.NewIntVarFromDomain(cp_model.Domain.FromValues(list(D[i])),'x(' + str(i) + ')')
for j in range(m):
 y[j] = model.NewIntVar(0,n,'y(' + str(j) + ')')

for i in range(n):
 for j in range(m):
  u[i,j] = model.NewIntVar(0,1,'')
  
z = model.NewIntVar(0,n,'z')
 
# constraints
for [i,j] in B:
 model.Add(x[i] != x[j])
 
# x[i] = j => u[i,j] = 1 
for i in range(n):
 for j in range(m):
  #b = model.NewBoolVar('b')
  #model.Add(x[i] == j).OnlyEnforceIf(b)
  #model.Add(x[i] != j).OnlyEnforceIf(b.Not())
  #model.Add(u[i,j]==1).OnlyEnforceIf(b)
  model.Add(x[i] == j).OnlyEnforceIf(u[i,j])
  model.Add(x[i] != j).OnlyEnforceIf(u[i,j].Not())

for j in range(m):
 model.Add(y[j] == sum(u[i,j] for i in range(n)))
 model.Add(y[j] <= z)  
 #model.Add(z >= sum(u[i,j] for i in range(n)))

model.Minimize(z)

solver = cp_model.CpSolver()
solver.parameters.max_time_in_seconds = 5.0
status = solver.Solve(model)

def PrintSolutionDetail():
 print('objective = ',solver.Value(z))
 for i in range(n):
  print(x[i],' = ',solver.Value(x[i]))
 for j in range(m):
  print('Courses assigned to teacher ',(j+1),': ',end = ' ')
  for i in range(n):
   if solver.Value(x[i]) == j:
    print((i+1),end = ' ')
  print(' (load = ',solver.Value(y[j]),')') 
 
if status == cp_model.OPTIMAL or status == cp_model.FEASIBLE:
 print(solver.Value(z)) 
 PrintSolutionDetail()
else:
 print(-1)
 #print('NOT_FEASIBLE') 
 