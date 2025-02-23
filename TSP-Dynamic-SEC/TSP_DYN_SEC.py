import sys
from ortools.linear_solver import pywraplp

def input():
 [N] = [int(x) for x in sys.stdin.readline().split()]
 d = []
 d.append([])
 for i in range(N):
  r = [int(x) for x in sys.stdin.readline().split()]
  r.insert(0,0)
  d.append(r)
 return N, d

def CreateVariables(solver):
 X = [[solver.IntVar(0,1,'X(' + str(i) + ',' + str(j) + ')') for i in range(N+1)] for j in range(N+1)]
 return X
	
def TSP_SEC(SECs):
 solver = pywraplp.Solver.CreateSolver('CBC')
 #SECs is the set of sub-tours
 X = CreateVariables(solver)
 for i in range(1,N+1):
  c = solver.Constraint(1,1)
  for j in range(1,N+1):
   if i != j:
    c.SetCoefficient(X[i][j],1)
  c = solver.Constraint(1,1)
  for j in range(1,N+1):
   if i != j:
    c.SetCoefficient(X[j][i],1)
				
 for S in SECs:# explore all sub-tour sets S, post a SEC associated with S
  c = solver.Constraint(0,len(S) - 1)
  for i in S:
   for j in S:
    if i != j:
     c.SetCoefficient(X[i][j],1)
 obj = solver.Objective()
 for i in range(1,N+1):
  for j in range(1,N+1):
   obj.SetCoefficient(X[i][j],d[i][j])
			
 res_stat = solver.Solve()
 if res_stat != pywraplp.Solver.OPTIMAL:
  print('Cannot find optimal for sub-problem')
  return None
 else:
  #print('optimal value sub-problem = ',solver.Objective().Value())
  #printX(X)
	
  s = [[X[i][j].solution_value() for i in range(N+1)] for j in range(N+1)]	
  return s	

def findNext(solution, current, cand):
 for i in cand:
  if solution[current][i] > 0:
   return i
 return -1 # not found
	
def getFirst(S):
 for i in S:
  return i
		
def ExtractSubTour(solution):# solution is 0-1 matrix: solution[i,j] = 1: Tour traverses (i,j)
 S = []
 cand = set()
 for i in range(1,N+1):
  cand.add(i)
 while len(cand) > 0:
  current = getFirst(cand)
  T = [] #set() # T is the sequence of points of the sub-tour under construction
  T.append(current) #T.add(current)
  cand.remove(current)
  while True:
   next = findNext(solution,current,cand)
   if next == -1:	
    break
   T.append(next) #T.add(next)
   cand.remove(next)
   current = next
  S.append(T)

 return S
'''	
def printX(solution):	
	for i in range(1,N+1):
		for j in range(1,N+1):
			#if X[i][j].solution_value() > 0:
			if solution[i][j] > 0:		
				print(i,' -> ',j)
'''
def TSP():
 #solver = pywraplp.Solver.CreateSolver('TSP','CBC')
 SECs = []
 while True:
  solution = TSP_SEC(SECs)
  if solution == None:
   print('Not feasible')
   break
  S = ExtractSubTour(solution)
  #print(S)		
  #print('Number of sub-tours = ',len(S))
  #if S == None:
  if len(S) == 1:
   #print('Found optimal solution')
   opt_tour = S[0]
   print(len(opt_tour))
   for e in opt_tour:
    print(e, end = ' ')
   break
		
  for Si in S:
   SECs.append(Si)

N, d = input()
TSP()