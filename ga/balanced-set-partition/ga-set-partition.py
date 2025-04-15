import sys
import random as rd 
import time

def Input():
 [n,m] = [int(x) for x in sys.stdin.readline().split()]
 w = [int(x) for x in sys.stdin.readline().split()]
 return n,m,w 
 
def InputFile(filename):
 with open(filename,'r') as f:
  [n,m] = [int(x) for x in f.readline().split()]
  w = [int(x) for x in f.readline().split()]
  return n,m,w 
  


def GenerateInitPopulation():
 population = []
 for _ in range(population_size):
  individual = [rd.randint(0,m-1) for i in range(n)]
  population.append(individual)
 return population

def ComputeFitness(individual):
 Weight = [0 for _ in range(m)]
 for i, s in enumerate(individual):
  Weight[s] += w[i]
 return max(Weight) - min(Weight)


 
def Select(fitness, population):
 pop_size = len(population)
 f = [1/fitness[i] for i in range(pop_size)]
 SF = sum(f)  
 probabilities = [f[i]*1.0/SF for i in range(pop_size)]
 #print(probabilities)
 r = rd.random()
 c = 0
 for i in range(len(probabilities)):
  c += probabilities[i]
  if c >= r:
   return population[i]

def CrossOver(p1,p2):
 pos = rd.randint(1,m-1)
 c1 = p1[:pos] + p2[pos:]
 c2 = p2[:pos] + p1[pos:]
 return c1,c2 
 
def mutate(individual, rate = 0.01):
 for i in range(n):
  if rd.random() < rate:
   individual[i] = rd.randint(0,m-1)
   
def UpdatePopulation(population, newPopulations,replacement_rate):
 L = len(population)
 new_pos = int(L*replacement_rate)
 keep_pos = L - new_pos
 return population[:keep_pos] + newPopulations[:new_pos]

 
def Solve(population_size, generations, mutation_rate, replacement_rate, timeLimit):
 best_obj = 1e9 
 
 population = GenerateInitPopulation()
 for g in range(generations):
  t = time.time() - start_time 
  if t > timeLimit:
   break 
   
  fitness = [ComputeFitness(i) for i in population]
  local_best_fitness = min(fitness)
  local_best_index = fitness.index(local_best_fitness)
  local_best_individual = population[local_best_index]
  print(g,'local best fitness = ',local_best_fitness,' best = ',best_obj)
  if local_best_fitness < best_obj:
   best_obj = local_best_fitness
   best_individual = local_best_individual 
   print(g,'update best = ',best_obj)
   
  newPopulations = []
  while len(newPopulations) < population_size:
   p1 = Select(fitness,population)
   p2 = Select(fitness,population)
   
   c1,c2 = CrossOver(p1,p2)
   mutate(c1,mutation_rate)
   mutate(c2,mutation_rate)
   #print('CrossOver p1 = ',p1,'p2 = ',p2,' c1 = ',c1,'c2 = ',c2)
   newPopulations.append(c1)
   newPopulations.append(c2)
  
  newPopulations.sort(key = lambda i: ComputeFitness(i))
  population = UpdatePopulation(population,newPopulations,replacement_rate)
 
 return best_individual 
 
n,m,w = InputFile('test/2.txt')  
#n,m,w = Input()

population_size = 100
generations = 100000
mutation_rate = 0.01
replacement_rate = 0.5
time_limit = 30

start_time = time.time()
best_individual = Solve(population_size, generations, mutation_rate, replacement_rate, time_limit)

print(n)
for i in best_individual:
 print((i + 1), end = ' ')
'''
a = [1,2,3,4,5,6,7]
b = [10,20,30,40,50,60,70]
pos = 3
a1 = a[:pos] + b[pos:]
b1 = b[:pos] + a[pos:]
print(a1,b1)
L = ['dung','ninh','hang','trang']
L1 = rd.choices(L,weights = [1,10,4,2],k = 20)
print(L1)
'''