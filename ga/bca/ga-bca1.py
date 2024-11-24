import sys
import random as rd 


def Input():
 [m,n] = [int(x) for x in sys.stdin.readline().split()]
 D = [set() for i in range(m)]
 for i in range(m):
  r = [int(x) for x in sys.stdin.readline().split()]
  for j in range(1,len(r)):
   D[i].add(r[j]-1) #deplacement of indices from 0,1,2,. . .,
   
 C = [[0 for i in range(n)] for j in range(n)]
 #return n,m,D,C 
 
 [K] = [int(x) for x in sys.stdin.readline().split()]
 for k in range(K):
  [i,j] = [int(x) for x in sys.stdin.readline().split()]
  C[i-1][j-1] = 1 #deplacement of indices 
  
 return n,m,D,C  

def InputFile(filename):
 with open(filename,'r') as f:
  [m,n] = [int(x) for x in f.readline().split()]
  D = [set() for i in range(m)]
  for i in range(m):
   r = [int(x) for x in f.readline().split()]
   for j in range(1,len(r)):
    D[i].add(r[j]-1) #deplacement of indices from 0,1,2,. . .,
   
  C = [[0 for i in range(n)] for j in range(n)]
  #return n,m,D,C 
 
  [K] = [int(x) for x in f.readline().split()]
  for k in range(K):
   [i,j] = [int(x) for x in f.readline().split()]
   C[i-1][j-1] = 1 #deplacement of indices 
  
  return n,m,D,C  
 
def PrintData():
 for i in range(m):
  print('D[' + str(i) + '] = ',D[i])
  
 for i in range(n):
  print(C[i])




class GASolver:
 def __init__(self,n,m,D,C,generations, population_size):
  self.n = n 
  self.m = m 
  self.D = D 
  self.C = C 
  self.generations = generations 
  self.population_size = population_size 
  self.x = [Chromosome(n,m,D,C) for i in range(population_size)]
  self.best = None
  self.bestScore = 1e9 
  for y in self.x:
   if self.bestScore > y.score:
    self.bestScore = y.score 
    self.best = y     
  
 def Init(self):
  for s in self.x:
   s.ComputeFitness() 
 
 def Print(self):
  for s in self.x:
   print(s.ToString())  
  
 def CrossOver(self, p_chromosome1, p_chromosome2):
  pos = rd.randint(0,n-1) # cut position of chromosome 1 and 2: x1[0......pos.........n]
  c_x1 = [0 for i in range(n)]
  c_x2 = [0 for i in range(n)]
  for i in range(pos):
   c_x1[i] = p_chromosome1.x[i]
   c_x2[i] = p_chromosome2.x[i]
  for i in range(pos,n):    
   c_x1[i] = p_chromosome2.x[i] 
   c_x2[i] = p_chromosome1.x[i]
  
  c_chromosome1 = Chromosome(n,m,D,C)
  c_chromosome2 = Chromosome(n,m,D,C)
  c_chromosome1.x = c_x1 
  c_chromosome2.x = c_x2
  
  return c_chromosome1, c_chromosome2 
 
 def Select(self):
  fitness = [c.score for c in self.x]
  S = sum(fitness)
  probabilities = [c.score*1.0/S for c in self.x]
  #print(probabilities)
  r = rd.random()
  c = 0
  for i in range(len(probabilities)):
   c += probabilities[i]
   if c >= r:
    return i
   
 def FindMinIndex(self, L):
  minScore = 1e9  
  minIndex = -1
  for i in range(len(L)):
   if minScore > L[i].score:
    minIndex = i 
  return minIndex 

 def FindMaxIndex(self, L):
  maxScore = 1-1e9
  maxIndex = -1
  for i in range(len(L)):
   if maxScore < L[i].score:
    maxIndex = i 
  return maxIndex 
  
 def PrintPopulation(self, P):
  for i in P:
   print(i.ToString())
   
 def Solve(self):
  for g in range(self.generations):
   print('Generation ',g,' current population')
   self.PrintPopulation(self.x)
   
   newPopulations = []
   while len(newPopulations) < len(self.x):
    p1 = self.x[self.Select()]
    p2 = self.x[self.Select()]
    #print('select p1 = ',self.x[p1].ToString(),' p2 = ',self.x[p2].ToString())
    c1,c2 = self.CrossOver(p1,p2)
    c1.ComputeFitness()
    c2.ComputeFitness()
    if self.best.score > c1.score:
     self.best = c1 
    if self.best.score > c2.score:
     self.best = c2     
    newPopulations.append(c1)
    newPopulations.append(c2)

   print('GOT new population')
   self.PrintPopulation(newPopulations)
   
   oldBestIndex = self.FindMinIndex(self.x)
   newWorstIndex = self.FindMaxIndex(newPopulations)
   print('process new population, replace newWorst ',newPopulations[newWorstIndex].ToString(),' by oldBest ',self.x[oldBestIndex].ToString())
   
   newPopulations[newWorstIndex] = self.x[oldBestIndex]
   self.x = newPopulations
  print('GA finished, best = ',self.best.ToString()) 
   
class Chromosome:
 def __init__(self,n,m,D,C):
  self.n = n 
  self.m = m 
  self.D = D 
  self.C = C
  self.x = [rd.randint(0,m-1) for i in range(n)]
  self.score = 0
  self.load = [0 for i in range(m)]
  self.ComputeFitness()
  
 def ComputeFitness(self):
  for i in range(self.m):
   self.load[i] = 0
  for i in self.x:
   self.load[i] += 1 
  self.score = max(self.load)   
  
 def ToString(self):
  s = ''
  for i in self.x:
   s = s + str(i) + ' ' 
  s = s + ' fitness = ' + str(self.score) 
  return s 
  
#n,m,D,C = Input()
n,m,D,C = InputFile('test1.txt')
PrintData()  
solver = GASolver(n,m,D,C,10,10)

solver.Init()
solver.Print()
solver.Solve()  