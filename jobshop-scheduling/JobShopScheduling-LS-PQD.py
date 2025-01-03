import sys

def InputFile(filename):
 with open(filename,'r') as f:
  [n] = [int(x) for x in f.readline().split()]
  Jobs = []
  for i in range(n):
   [T] = [int(x) for x in f.readline().split()]
   #for t in range(T):
   r = [int(x) for x in f.readline().split()]
   tasks = []
   for t in range(T):
    tasks.append([r[2*t],r[2*t+1]])
   Jobs.append(tasks)
  return Jobs 
  
def Input():
 [n] = [int(x) for x in sys.stdin.readline().split()]
 Jobs = []
 for i in range(n):
  [T] = [int(x) for x in sys.stdin.readline().split()]
  #for t in range(T):
  r = [int(x) for x in sys.stdin.readline().split()]
  tasks = []
  for t in range(T):
   tasks.append([r[2*t],r[2*t+1]])
  Jobs.append(tasks)

 return Jobs 

#Jobs = Input()
Jobs = InputFile('test/1-pub.txt')

print(Jobs)

nbNodes = 0
nbJobs = len(Jobs)
nodesOfJob = [[] for j in range(nbJobs)]
nodesOfMachine = {}
durationOfNodes = {}
machines = set()
for j,job in enumerate(Jobs):
 for t,task in enumerate(job):
  machine = task[0]
  machines.add(machine)

for m in machines:
 nodesOfMachine[m] = []
 
for j,job in enumerate(Jobs):
 for t,task in enumerate(job):
  nbNodes += 1
  nodesOfJob[j].append(nbNodes)
  machine = task[0]
  duration = task[1]
  machines.add(machine)
  #print('machine = ',machine)
  #print('nodesOfMachine = ',nodesOfMachine[machine])
  if nodesOfMachine[machine] == None:
   nodesOfMachine[machine] = []
  nodesOfMachine[machine].append(nbNodes) 
  durationOfNodes[nbNodes] = duration
  
for j in range(nbJobs):
 print('nodes of job ',j,' = ',nodesOfJob[j])
for m in machines:
 print('nodes of machine ',m,' = ',nodesOfMachine[m])
for n in range(1,nbNodes+1):
 print('duration[',n,'] = ',durationOfNodes[n])

# solution representation
X = {}
for m in machines:
 X[m] = [i for i in range(len(nodesOfMachine[m]))] # permutation of nodes of the machine m 
 print(X[m])

nodes = range(1,nbNodes+1)

def MakeSpan(X):
 # X is a solution: X[m] is a permutation of jobs (0,1,...) processed on machine m  
 # make-span is the longest path on the dependency graph
 A = {}
 deg = {}
 for v in range(1,nbNodes+1):
  A[v] = set()
  deg[v] = 0
  
 #deg = [0 for i in range(1,nbNodes+1)]
 for j in range(nbJobs):
  for i in range(len(nodesOfJob[j])-1):
   u = nodesOfJob[j][i]
   v = nodesOfJob[j][i+1]
   A[u].add(v)
   deg[v] += 1
 
 for m in machines:
  for i in range(len(X[m])-1):
   iu = X[m][i]
   iv = X[m][i+1]
   u = nodesOfMachine[m][iu]
   v = nodesOfMachine[m][iv]
   A[u].add(v)
   deg[v] += 1

 for v in range(1,nbNodes+1):
  print('A[',v,']=',A[v],'deg[',v,']=',deg[v])      

 Q = []
 topoList = []
 for v in nodes:
  if deg[v] == 0:
   Q.append(v)
 while len(Q) > 0:
  u = Q.pop(0)
  topoList.append(v)
  for v in A[u]:
   deg[v] = deg[v] - 1
   if deg[v] == 0:
    Q.append(v)
    
 F = {} # F[v] is the earlest possible start time of task v 
 for v in nodes:
  F[v] = 0

 makeSpan = 0 
 for u in topoList:
  # fix F[u]
  makeSpan = max(makeSpan,F[u]+durationOfNodes[u])
  for v in A[u]:
   F[v] = max(F[v],F[u] + durationOfNodes[u])
 return makeSpan 
 
obj = MakeSpan(X)  
print('makeSpan = ',obj)

while True:
 minMakeSpan = 1e9 
 sel_m = -1
 sel_i = -1
 sel_j = -1
 for m in machines:
  # explore neighboring permutation of X[m] 
  for i in range(len(X[m])-1):
   for j in range(i+1,len(X[m])):
    oi = X[m][i]
    oj = X[m][j]
    tmp = X[m][i]
    X[m][i] = X[m][j]
    X[m][j] = tmp 
    newMakeSpan = MakeSpan(X)
    X[m][i] = oi
    X[m][j] = oj 
    print('swap ',oi,' and ',oj,' in machine ',m,' new MakeSpan = ',newMakeSpan)
    if newMakeSpan < minMakeSpan:
     sel_m = m 
     sel_i = i 
     sel_j = j 
     minMakeSpan = newMakeSpan 
     
 if minMakeSpan >= obj:
  print('local opt ')
  break 
 tmp = X[sel_m][sel_i]
 X[sel_m][sel_i] = X[sel_m][sel_j]
 X[sel_m][sel_j] = tmp 
 obj = MakeSpan(X)
 print('MOVE: Swap ',sel_m,',',sel_i,',',sel_j,' make-span = ',obj)  