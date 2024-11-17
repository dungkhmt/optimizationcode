import sys
class TSP2Opt:
 def __init__(self,d):
  self.d = d 
  self.n = len(d)
  self.x = [i+1 for i in range(self.n)]# x[i] is the next point of i 
  self.x[self.n-1] = 0
  self.dr = [0 for i in range(self.n)]
  self.dl = [0 for i in range(self.n)]
  self.distance = 0
  self.start = 0
  self.Propagate()
  
 def Print(self):
  print('x = ',end = ' ')
  for i in range(self.n):
   print('(',i,self.x[i],')',end = ' ')
  print('') 
  i = self.start
  #while i < self.n-1:
  while self.x[i] != self.start:
   print(i,'['+str(self.dr[i]) + ',' + str(self.dl[i]) + ']', end = ' -> ')
   ni = self.x[i]
   i = ni  
  print(i,'['+str(self.dr[i]) + ',' + str(self.dl[i]) + ']')
  print('distance = ',self.distance)
  

 def Propagate(self):
  self.dr[0] = 0
  self.dl[0] = 0
  i = self.start
  self.distance = 0
  #while i < self.n-1:
  while self.x[i] != self.start:
   self.dr[self.x[i]] = self.dr[i] + d[i][self.x[i]]
   self.dl[self.x[i]] = self.dl[i] + d[self.x[i]][i]
   self.distance += self.d[i][self.x[i]]
   #print('Propagate distance: add d[',i,',',self.x[i],'] = ',self.d[i][self.x[i]],'distance = ',self.distance)
   
   i = self.x[i]   
  self.distance += self.d[i][self.start]
  #print('Propagate distance: final add d[',i,',',0,'] = ',self.d[i][0],'distance = ',self.distance)
  
 def TwoOptMove(self, u, v):
  # pre-condition: u is locaited before v on the route 
  # remove(u, x[u]) and (v, x[v])
  # reconnect (u, v) and (nu, nv)
  # reverse route (nu,...,v)  
  nu = self.x[u]
  nv = self.x[v]
  p = nu
  pp = -1
  np = -1
  while p != nv:
   np = self.x[p]
   self.x[p] = pp
   #print('2-opt ',u,v,' update x[',p,'] = ',pp)
   pp = p 
   p = np 
  self.x[u] = v 
  self.x[nu] = nv 
  #print('2-opt ',u,v,' final update x[',u,'] = ',v,' and x[',nu,'] = ',nv)
  self.Propagate()
  
 def getDistance(self):
  return self.distance 
  
 def Get2OptDelta(self,u,v):
  nu = self.x[u]
  nv = self.x[v]
  duv = self.dr[v] - self.dr[nu]
  dvu = self.dl[v] - self.dl[nu]
  d1 = self.d[u][v] + self.d[nu][nv] - self.d[u][nu] - self.d[v][nv]
  d2 = dvu - duv
  return d1 + d2   
 
 def nearestNeighbor(self, start):
  route = []
  cur = start
  cand = set()
  visited = [False for i in range(self.n)]
  L = 0
  for i in range(self.n):
   if i != start:
    cand.add(i)
  route.append(start)
  visited[start] = True
  #while len(cand) > 0:
  while True:
   minD = 1e9 
   sel = -1 
   #for x in cand:
   for i in range(self.n):
    if visited[i] == False and self.d[cur][i] < minD:
     minD = self.d[cur][i] 
     sel = i 
   if sel == -1:
    break 
    
   cand.remove(sel) 
   route.append(sel)
   visited[sel] = True
   L += self.d[cur][sel]
   cur = sel 
  L += self.d[cur][start]  
  return route, L  
 
 def GenInitialSolution(self):
  minL = 1e9 
  best_route = None 
  best_route, minL = self.nearestNeighbor(0)
  for start in range(1,self.n):
   route, L = self.nearestNeighbor(start)
   if L < minL:
    minL = L 
    best_route = route 
    
  print(best_route,minL)
  #return
  self.start = best_route[0]
  cur = self.start
  for i in best_route:
   if i != self.start:
    self.x[cur] = i
    #print('set x[',cur,'] = ',i)    
    cur = i 
  self.x[cur] = self.start
  self.Propagate()   
  
 def solve(self, maxIter):
  self.GenInitialSolution()
  #print('Init Len = ',self.distance)
  
  # local search
  for iter in range(maxIter):
   u = 0
   minDelta = 1e9 
   sel_u = -1
   sel_v = -1
   while self.x[u] != self.start:
    v = self.x[u]
    while v != self.start:
     delta = self.Get2OptDelta(u,v)
     if delta < minDelta:
      minDelta = delta
      sel_u = u
      sel_v = v 
     v = self.x[v]
    u = self.x[u]
   print('Step ',iter,'minDelta = ',minDelta)
   if minDelta >= 0:   
    break
   self.TwoOptMove(sel_u,sel_v)
   print('Len = ',self.distance)
   #self.Print()
  print(self.n)
  cur = self.start
  while self.x[cur] != self.start:
   print((cur+1), end = ' ')
   cur = self.x[cur] 
  print(cur+1)   
   
def input():
 [n] = [int(x) for x in sys.stdin.readline().split()]
 d = []
 for i in range(n):
  r = [int(x) for x in sys.stdin.readline().split()]
  d.append(r)
 return d  
  
def inputFile(filename):
 with open(filename,'r') as f:
  [n] = [int(x) for x in f.readline().split()]
  d = []
  for i in range(n):
   r = [int(x) for x in f.readline().split()]
   d.append(r)
  return d  
   
#d = inputFile('test/3.txt')
d = input()
  
app = TSP2Opt(d)
#app.Print()  
#app.TwoOptMove(0,4)
#app.Print()  
app.solve(1000)
  