import sys
import random as rd 
import math 

def Input():
 [n] = [int(x) for x in sys.stdin.readline().split()]
 c = []
 for i in range(n):
  row = [int(x) for x in sys.stdin.readline().split()]
  c.append(row)
  
 return n,c 

def InputEuclide(filename):
 with open(filename,'r') as f:
  [n] = [int(x) for x in f.readline().split()]
  x = [0 for i in range(n)]
  y = [0 for i in range(n)]
  for i in range(n):
   [i,xi,yi] = [int(x) for x in f.readline().split()]
   x[i-1] = xi 
   y[i-1] = yi 
   
  c = [[0 for i in range(n)] for j in range(n)]
  for i in range(n):
   for j in range(n):
    c[i][j] = math.sqrt((x[i]-x[j])**2 + (y[i] - y[j])**2)
  return n,c 
  
#n,c = Input()
n,c = InputEuclide('euclide-31.txt')

#print(c)

class ACO():
 def __init__(self, c, nbAnts: int, generations: int, alpha: float, beta: float, rho: float):
  self.c = c 
  self.n = len(c)
  self.nbAnts = nbAnts
  self.generations = generations
  self.alpha = alpha
  self.beta = beta 
  self.rho = rho 
  self.ants = [Ant(self) for k in range(nbAnts)]
  self.pheromone = [[1/(self.n*self.n) for i in range(self.n)] for j in range(self.n)]
  
 def UpdatePheromone(self):
  for i in range(self.n):
   for j in range(self.n):
    self.pheromone[i][j] *= self.rho  
    for ant in self.ants:
     self.pheromone[i][j] += ant.pheromoneDelta[i][j] 
     
 def Solve(self):
  fBest = float('inf')
  bestRoute = None 
  for g in range(self.generations):
   self.ants = [Ant(self) for k in range(self.nbAnts)]
   for ant in self.ants:
    ant.ConstructRoute()
    if ant.Solution == False:
     continue 
    #print('Generation ',g,' ant.cost = ',ant.cost)
    if ant.cost < fBest:
     fBest = ant.cost 
     bestRoute = [i for i in ant.route] 
     print('Update  best ',fBest)
     
   for ant in self.ants:
    ant.UpdatePheromoneDelta(fBest)
   self.UpdatePheromone() 
  print(self.n)
  for i in bestRoute:
   print((i+1), end = ' ')
   
class Ant():
 def __init__(self, aco: ACO):
  self.aco = aco 
  self.n = aco.n
  self.c = aco.c 
  self.pheromoneDelta = [[0 for i in range(self.n)] for j in range(self.n)]
  self.eta = [[0 if self.c[i][j]==0 else 1/(self.c[i][j]) for i in range(self.n)] for j in range(self.n)]
  self.route = []
  self.Candidates = [i for i in range(n)]
  self.start = rd.randint(0,self.n-1)
  self.current = self.start 
  self.Candidates.remove(self.start)
  self.route.append(self.start)
  self.cost = 0
  
  
 def FindNext(self):
  D = 0
  for i in self.Candidates:
   D += (self.aco.pheromone[self.current][i]**self.aco.alpha)*(self.eta[self.current][i]**self.aco.beta)
  if D <= 0:
   return -1
   
  p = [0 for i in range(self.n)]
  for i in self.Candidates:
   p[i] = (self.aco.pheromone[self.current][i]**self.aco.alpha)*(self.eta[self.current][i]**self.aco.beta)/D 
    
  # apply roulette wheel
  sel = 0
  r = rd.random()
  for i,pi in enumerate(p):
   r -= pi 
   if r <= 0:
    sel = i
    break 
  self.Candidates.remove(sel)
  self.route.append(sel)
  self.cost += self.c[self.current][sel]  
  self.current = sel  
  return sel 
  
 def ConstructRoute(self):
  self.Solution = True 
  for i in range(self.n - 1):
   sel = self.FindNext()
   if sel == -1:
    self.Solution = False 
    return 
  self.cost += self.c[self.current][self.start] 
    
   
 def UpdatePheromoneDelta(self, fBest):
  self.pheromoneDelta = [[0 for i in range(self.n)] for j in range(self.n)]
  for i in range(1,len(self.route)):
   j = self.route[i-1]
   nj = self.route[i]
   self.pheromoneDelta[j][nj] = 1.0/fBest 
   
aco = ACO(c,10,200,1,10,0.5)
aco.Solve()   