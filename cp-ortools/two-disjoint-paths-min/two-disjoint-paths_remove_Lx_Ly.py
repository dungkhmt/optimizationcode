import sys 
from ortools.sat.python import cp_model

def Input():
 [n,m] = [int(x) for x in sys.stdin.readline().split()]
 E = []
 
 InA = [[] for i in range(n+1)]

  
 for i in range(m):
  [u,v,w] = [int(x) for x in sys.stdin.readline().split()]
  OutA[u].append([v,w])
  InA[v].append([u,w])
  E.append([u,v,w])
  E.append([v,u,w])
  
 return n,m,InA,OutA,E 

n,m,InA,OutA,E = Input()

model = cp_model.CpModel()

#define decision variables
x = {}
y = {}
#Lx = {}
#Ly = {}

for [i,j,w] in E:
 x[i,j] = model.NewIntVar(0,1,'x(' + str(i) + ',' + str(j) + ')')
 y[i,j] = model.NewIntVar(0,1,'y(' + str(i) + ',' + str(j) + ')')

MAX = 0
for [i,j,w] in E:
 MAX = MAX + w 
MAX = MAX//2 

obj = model.NewIntVar(0,MAX,'obj')

s = 1 
t = n 

''' 
for i in range(1,n+1):
 Lx[i] = model.NewIntVar(0,MAX,'Lx(' + str(i) + ')')
 Ly[i] = model.NewIntVar(0,MAX,'Ly(' + str(i) + ')')
'''

# constraints 
for i in range(1,n+1):
 if i != s and i != t:
  model.Add(sum(x[j,i] for [j ,w] in InA[i]) == sum(x[i,j] for [j ,w] in OutA[i])) 
  model.Add(sum(y[j,i] for [j ,w] in InA[i]) == sum(y[i,j] for [j ,w] in OutA[i])) 

model.Add(sum(x[s,j] for [j,w] in OutA[s]) == 1)
model.Add(sum(x[j,t] for [j,w] in InA[t]) == 1)
model.Add(sum(y[s,j] for [j,w] in OutA[s]) == 1)
model.Add(sum(y[j,t] for [j,w] in InA[t]) == 1)
'''
# x(i,j) = 1 => Lx[j] = Lx[i] + c(i,j)
for [i,j,w] in E:
 b = model.NewBoolVar('')
 model.Add(x[i,j] == 1).OnlyEnforceIf(b)
 model.Add(x[i,j] != 1).OnlyEnforceIf(b.Not())
 model.Add(Lx[j] == Lx[i] + w).OnlyEnforceIf(b)
 
# y(i,j) = 1 => Ly[j] = Ly[i] + c(i,j)
for [i,j,w] in E:
 b = model.NewBoolVar('')
 model.Add(y[i,j] == 1).OnlyEnforceIf(b)
 model.Add(y[i,j] != 1).OnlyEnforceIf(b.Not())
 model.Add(Ly[j] == Ly[i] + w).OnlyEnforceIf(b)
'''

# disjoint constraint x(i,j) + y(i,j) <= 1
for [i,j,w] in E:
 model.Add(x[i,j] + y[i,j] <= 1)

# objective function
#model.Minimize(Lx[t] + Ly[t])  
obj = 0
for [i,j,w] in E:
 obj += (x[i,j] + y[i,j])*w 
model.Minimize(obj)


solver = cp_model.CpSolver()
solver.parameters.max_time_in_seconds = 5.0
status = solver.Solve(model)

if status == cp_model.OPTIMAL or status == cp_model.FEASIBLE:
 print(solver.Value(obj))
 #print(solver.Value(Lx[t]) + solver.Value(Ly[t]))
 '''
 for [i,j,w] in E:
  if solver.Value(x[i,j]) > 0:
   print(x[i,j])
   
 for [i,j,w] in E:
  if solver.Value(y[i,j]) > 0:
   print(y[i,j])
 '''   
else:
 print('NOT_FEASIBLE') 
 