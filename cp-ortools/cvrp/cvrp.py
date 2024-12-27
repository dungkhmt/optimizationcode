import sys
from ortools.sat.python import cp_model

def Input():
 [n,K,Q] = [int(x) for x in sys.stdin.readline().split()]
 td = [int(x) for x in sys.stdin.readline().split()]
 C = []
 for i in range(n+1):
  r = [int(x) for x in sys.stdin.readline().split()]
  C.append(r)
 
 d = [0]
 for i in td:
  d.append(i)
 return n,K,Q,C,d 


n,K,Q,C,d = Input()
#print(C)
#print(d) 

model = cp_model.CpModel()
x = {}
In = [set() for i in range(n+1)]
Out = [set() for i in range(n+1)]

for i in range(n+1):
 for j in range(n+1):
  if i != j:
   #x[i,j] = model.NewIntVar(0,1,'')
   In[i].add(j)
   Out[i].add(j)
   
for i in range(n+1):
 for j in Out[i]:
  x[i,j] = model.NewIntVar(0,1,'')

D = sum(d)
load = {}
for i in range(n+1):
 load[i] = model.NewIntVar(0,D,'')
 
 
for i in range(1,n+1):
 model.Add(sum(x[i,j] for j in Out[i]) == 1)
 model.Add(sum(x[j,i] for j in In[i]) == 1)

# x[i,j] = 1 -> load[j] = load[i] + d[j]
for i in range(n+1):
 for j in Out[i]:
  if j > 0:
   b = model.NewBoolVar('')
   model.Add(x[i,j] == 1).OnlyEnforceIf(b)
   model.Add(x[i,j] != 1).OnlyEnforceIf(b.Not())  
   model.Add(load[j] == load[i] + d[j]).OnlyEnforceIf(b)

for i in range(1,n+1):
 model.Add(load[i] <= Q)
 
obj = 0
for i in range(n+1):
 for j in Out[i]:
  obj += x[i,j]*C[i][j] 


model.Minimize(obj)
  
solver = cp_model.CpSolver()
solver.parameters.max_time_in_seconds = 5.0
status = solver.Solve(model)

if status == cp_model.OPTIMAL or status == cp_model.FEASIBLE:
 print(solver.Value(obj))
 '''
 for i in range(n+1):
  for j in Out[i]:
   if solver.Value(x[i,j]) > 0:
    print(i,j)
 '''   
else:
 print('NOT_FEASIBLE') 
 
 
