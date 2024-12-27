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
  D = [[] for i in range(m)]
  for i in range(m):
   r = [int(x) for x in f.readline().split()]
   for j in range(1,len(r)):
    D[i].append(r[j]-1) #deplacement of indices from 0,1,2,. . .,
   
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




class LNSSolver:
 def __init__(self,n,m,D,C):
  self.n = n 
  self.m = m 
  self.D = D 
  self.C = C 
  self.best = None
  self.bestScore = 1e9 
  self.x = [0 for i in range(n)] # x[i] is the teacher assign to course i

 def GenInitialSolution(self):
   
 def Solve(self):
  
  return  None 
  
  
#n,m,D,C = Input()
n,m,D,C = InputFile('test1.txt')
PrintData()  
solver = LNSSolver(n,m,D,C,10,10)


solver.Solve()  