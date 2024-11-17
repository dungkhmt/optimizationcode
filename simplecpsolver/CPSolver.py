import sys 


class Var:
 def __init__(self,ID,D,name):
  self.Domain = D 
  self.name = '[' + str(ID) + ']' + name 
  self.ID = ID
 def Remove(self,v):
  #remove value v from the domain
  self.Domain.remove(v) 

 def Empty(self):
  return len(self.Domain) == 0 
 
 def SetValue(self,v):
  self.D = set()
  self.D.add(v)
  
 def ToString(self):
  return self.name + '/' + str(len(self.Domain))
  
 def Clone(self):
  D = set()
  for v in self.D:
   D.add(v)
  var = Var(self.ID,D,self.name)
  return var 

class Domain:
 def __init__(self,variables):
  if variables == None:
   return
  self.variables = variables 
  self.domains = []
  self.map = {}
  for i in range(len(variables)):
   x = variables[i]
   self.map[x] = i
   #print('Domain map[',x.name,'] = ',i)
   
   D = set()
   for v in x.Domain:
    D.add(v) 
   self.domains.append(D) 
 #def __init__(self):
 # self.domains = []
 def GetDomain(self,x):
  i = self.map[x]
  return self.domains[i] 
 
  
 def Clone(self):
  D = Domain(None)
  D.domains = []
  for d in self.domains:
   domain = set()
   for v in d:
    domain.add(v)
   D.domains.append(domain)
  D.map = self.map  
  #i = D.map[self.variables[3]]
  #print('Domain.Clone test map i = ',i)
  return D 
 def ToString(self):
  s = ''
  for i in range(len(self.domains)):
   s = s + 'D[' + str(i) + ']:'
   for v in self.domains[i]:
    s = s + str(v) + ','
  return s 
  
class Eq:
 def __init__(self,X, a, Y, b, name):
  # constraint: X = aY + b 
  self.X = X 
  self.a = a
  self.Y = Y 
  self.b = b
  self.name = name + '[' + X.name + ' = ' + str(a) + '*' + Y.name + '+' + str(b) + ']'
  self.vars = [X, Y]

 def GetVariables(self):
  return self.vars 
 def HasVariable(self,x):
  return x == self.X or x == self.Y 
  
 def Satisfy(self,vx,vy):
  return vx == self.a*vy + self.b 

 def GetOtherVariable(self,x):
  if x == self.X:
   return self.Y 
  elif x == self.Y:
   return self.X
  else:
   return None 
  
class Neq:
 def __init__(self,X, a, Y, b, name):
  # constraint: X != aY + b 
  self.X = X 
  self.a = a
  self.Y = Y 
  self.b = b
  self.name = name + '[' + X.name + ' != ' + str(a) + '*' + Y.name + '+' + str(b) + ']'
  self.vars = [X, Y]

 def GetVariables(self):
  return self.vars 
 def HasVariable(self,x):
  return x == self.X or x == self.Y 
  
 def Satisfy(self,vx,vy):
  return vx != self.a*vy + self.b 

 def GetOtherVariable(self,x):
  if x == self.X:
   return self.Y 
  elif x == self.Y:
   return self.X
  else:
   return None 


class Leq:
 def __init__(self, X, Y, D,name):
  # X <= Y + D
  self.X = X
  self.Y = Y
  self.D = D   
  self.name = name + '(' + X.name + ' <= ' + Y.name + ' + ' + str(D) + ')'
  self.vars = [X,Y]
  
 def GetVariables(self):
  return self.vars 
 def HasVariable(self,x):
  return x == self.X or x == self.Y 
  
 def Satisfy(self,vx,vy):
  return vx <= vy + self.D 

 def GetOtherVariable(self,x):
  if x == self.X:
   return self.Y 
  elif x == self.Y:
   return self.X
  else:
   return None 
   

class CPModel:
 def __init__(self):
  self.variables = []
  self.constraints = []
  
 def Close(self):
  self.domains = Domain(self.variables)
  
  
 def AddVar(self,var):
  self.variables.append(var)
 def AddConstraint(self, constraint):
  self.constraints.append(constraint)
 
 def SetValue(self,x,v):
  i = self.domains.map[x]
  #print('SetValue(',x.ToString(),v,'), i = ',i)
  self.domains.domains[i] = set()
  self.domains.domains[i].add(v)  
 
 def GetValue(self,x):
  i = self.domains.map[x]
  val = 0
  for v in self.domains.domains[i]:
   return v 
  return None 
  
 def GetVarByID(self, ID):
  for x in self.variables:
   if x.ID == ID:
    return x 
  return None 
 
 def SelectNonSingletonVariable(self):
  for x in self.variables:
   if len(self.domains.GetDomain(x)) > 1:
    return x 
  return None 
  
 def Solution(self):
  for x in self.variables:
   if len(self.domains.GetDomain(x)) != 1:
    return False 
  return True   
  
 def Fail(self):
  for x in self.variables:
   #if len(x.Domain) == 0:
   if len(self.domains.GetDomain(x)) == 0:   
    return True 
  return False 
  
 def ToString(self):
  #s = ''
  #for x in self.variables:
  # s = s + x.ToString()
  #return s
  return self.domains.ToString()  
  
 def Clone(self):
  #variables = []
  #for v in self.variables:
  # variables.append(v)
  m = CPModel()
  m.variables = self.variables
  m.constraints = self.constraints
  m.domains = self.domains.Clone()
  #i = m.domains.map[self.variables[2]]
  #print('Model.Clone i = ',i)
  #for v in self.variables:
  # m.AddVar(v)
  #for c in self.constraints:
  # m.AddConstraint(c)
   
  return m 

  
class Propagator:
 def __init__(self):
  #self.constraints = []
  self.Q = []
  return 
  
 #def Add(self,constraint):
 # self.constraints.append(constraint)
 
 def Contains(self,x,c):
  for [xi,ci] in self.Q:
   if x == xi and c == ci:
    return True 
  return False 
  
    
  
 def AC3(self, model):
  self.Q = []
  for c in model.constraints:
   for x in model.variables:
    if c.HasVariable(x):
     self.Q.append([x,c])
     #print('AC3, Init Push ',x.name,c.name)
    
  while len(self.Q) > 0:
   [x,c] = self.Q.pop(0)
   #print('AC3, LOOP, start ReviseAC3',model.ToString())
   change = self.ReviseAC3(x,c, model)
   #print('AC3, LOOP, finish ReviseAC3',model.ToString())
   
   if change:
    #if x.Empty():
    if len(model.domains.GetDomain(x)) == 0:
     return False 
    for c1 in model.constraints:
     if c1 != c:
      if c1.HasVariable(x):
       y = c1.GetOtherVariable(x)
       if not self.Contains(y,c1):
        self.Q.append([y,c1])
        #print('AC3,model = ',model.ToString(),' PUSH(',y.ToString(),c1.name,')')
        
  return True  
  
  
 def ReviseAC3(self,x,c,model):
  #print('ReviseAC3 x = ',x.name,'c = ',c.name)
  change = False 
  vars = c.GetVariables()
  y = c.GetOtherVariable(x)
  #print('ReviseAC3 x = ',x.name,x.Domain,'c = ',c.name,'y = ',y.name,y.Domain)
  
  DX = model.domains.GetDomain(x)
  DY = model.domains.GetDomain(y)
  #print('ReviseAC3:',DX,DY)
  
  R = [] 
  #for vx in x.Domain:
  for vx in DX:
   found = False
   #print('ReviseAC3 consider value ',vx,' of ',x.name)
   #for vy in y.Domain:
   for vy in DY:
    if x == c.X:    
     if c.Satisfy(vx,vy):
      found = True
      #print('ReviseAC3 consider value ',vx,' of ',x.name,' EXIST value ',vy,' of ',y.name)   
      break
    elif x == c.Y:
     if c.Satisfy(vy,vx):
      found = True 
      #print('ReviseAC3 consider value ',vx,' of ',x.name,' EXIST value ',vy,' of ',y.name)   
      break
     
   if found == False:
    R.append(vx)
    #x.Remove(vx)
    #print('ReviseAC3 x = ',x.name,'c = ',c.name,' to be removed ',vx)
    change = True
  
  for v in R:
   #x.Remove(v)
   DX.remove(v)
   #print('ReviseAC3 x = ',x.name, 'c =',c.name,' Remove ',v)   
  return change     

class CPSolver:
 def __init__(self, propagator, model):
  self.propagator = propagator 
  self.model = model
  self.numberSolutions = 0
  self.solutions = []
  
 def OnSolution(self, model):
  solution = []
  for x in model.variables:
   d = model.domains.GetDomain(x)
   solution.append([x,model.GetValue(x)])
  self.solutions.append(solution)
  
 def OnFail(self):
  return  
 def Search(self, maxSol = None):
  S = [] # init a stack containing sub-problems in the branching 
  m0 = self.model.Clone()
  #print('Search init, Clone m0 = ',m0.ToString())
  S.append(m0)
  #prop = Propagator()
  self.numberSolutions = 0 
  while len(S) > 0:
   m = S.pop()
   x = m.SelectNonSingletonVariable()
   #print('LOOP POP x = ',x.ToString())
   for v in x.Domain:
    cm = m.Clone()
    y = cm.GetVarByID(x.ID)
    #print('LOOP cm get Var(',x.ID,' y = ',y.ToString())
    #y.SetValue(v) 
    cm.SetValue(y,v)
    #print('Before propagation, cm = ',cm.ToString())
    self.propagator.AC3(cm)
    #print('After propagation, cm = ',cm.ToString())
    if cm.Solution():
     self.numberSolutions += 1    
     #print('Solution ',self.numberSolutions,cm.ToString())
     self.OnSolution(cm)
     if len(self.solutions) >= maxSol:
      return 
    elif cm.Fail():
     #print('Fail ',cm.ToString())
     self.OnFail()
    else:
     S.append(cm) 
     
     
class NQueen:
 def __init__(self, n):
  self.n = n 
 def Solve(self):
  variables = []
  model = CPModel()
  prop = Propagator()
  D = set()
  for v in range(1,self.n+1):
   D.add(v)
  for i in range(self.n):
   x = Var(i+1,D,'X(' + str(i+1) + ')')
   variables.append(x)
   model.AddVar(x)  
  
  for i in range(1,self.n):
   xi = variables[i-1]
   for j in range(i+1,self.n+1):
    xj = variables[j-1]
    c1 = Neq(xi,1,xj,0,'Neq')
    c2 = Neq(xi,1,xj,j-i,'Neq')
    c3 = Neq(xi,1,xj,i-j,'Neq')
    model.AddConstraint(c1)
    model.AddConstraint(c2)
    model.AddConstraint(c3)
      
  model.Close() 
  solver = CPSolver(prop, model)
  solver.Search()
 
class SudokuSolver(CPSolver):
 def __init__(self,propagator,model):
  super().__init__(propagator,model)
 
 def SetMapVar(self,mapVar2Index):
  self.mapVar2Index = mapVar2Index 
  
 def OnSolution(self,model):
  print('SudokuSolver OnSolution')
  solution = []
  for x in model.variables:
   d = model.domains.GetDomain(x)
   solution.append([x,model.GetValue(x)])
  self.solutions.append(solution)
  T = [[0 for i in range(9)] for j in range(9)]
  for [z,v] in solution:
   [i,j] = self.mapVar2Index[z]
   T[i][j] = v 
  
  for i in range(9):
   for j in range(9):
    print(T[i][j], end = ' ')
   print('')
  print('---------------')  
    
class Sudoku:
 def __init__(self):
  self.variables = []
  D = set()
  for i in range(1,10):
   D.add(i)
  
  model = CPModel()
  x = {}
  self.mapVar2Index = {}
  id = 0  
  for i in range(9):
   for j in range(9):
    id = id + 1
    z = Var(id,D,'x[' + str(i+1) + ',' + str(j+1) + ']')
    #self.variables.append(     
    x[i,j] = z
    model.AddVar(z)
    self.mapVar2Index[z] = [i,j]
    
  for i in range(9):
   for j1 in range(8):
    for j2 in range(j1+1,9):
     c1 = Neq(x[i,j1],1,x[i,j2],0,'Neq')
     model.AddConstraint(c1)
     c2 = Neq(x[j1,i],1,x[j2,i],0,'Neq')
     model.AddConstraint(c2)
  
  for I in range(3):
   for J in range(3):
    for i1 in range(3):
     for j1 in range(3):
      for i2 in range(3):
       for j2 in range(3):
        if (i1 < i2) or (i1 == i2 and j1 < j2):
         c = Neq(x[3*I+i1,3*J+j1],1,x[3*I+i2,3*J+j2],0,'Neq')
         model.AddConstraint(c) 
         
  model.Close() 
  prop = Propagator()
  solver = SudokuSolver(prop,model)# CPSolver(prop, model)
  solver.SetMapVar(self.mapVar2Index)
  solver.Search(100)
  '''
  T = [[0 for i in range(9)] for j in range(9)]
  for s in solver.solutions:
   for [z,v] in s:
    [i,j] = self.mapVar2Index[z]
    T[i][j] = v 
  
   for i in range(9):
    for j in range(9):
     print(T[i][j], end = ' ')
    print('')
   print('---------------')  
  ''' 
    
def Run():
 [n] = [int(x) for x in sys.stdin.readline().split()]
 variables = []

 model = CPModel()
 propagator = Propagator()

 for i in range(n):
  line = [int(x) for x in sys.stdin.readline().split()]
  D = set()
  for j in range(len(line)):
   D.add(line[j])
  var = Var(i+1,D,'X(' + str(i+1) + ')') # constructor of Vars 
  variables.append(var)
  model.AddVar(var)

#print('variables = ',len(variables))

#[m] = [int(x) for x in sys.stdin.readline().split()]
#for k in range(m):
 k = 0
 while True:
  line = [x for x in sys.stdin.readline().split()]
  if line[0] == 'LEQ':
   [i,j,d] = [int(x) for x in line[1:]]
   c = Leq(variables[i-1],variables[j-1],d,'Leq(' + str(k+1) + ')')
   model.AddConstraint(c) 
  elif line[0] == 'EQ':
   [i,j,a,b] = [int(x) for x in line[1:]]
   c = Eq(variables[i-1],a,variables[j-1],b,'Eq(' + str(k+1) + ')')
   model.AddConstraint(c)
  elif line[0] == '#':
   break 
  
  k = k + 1 
 
 model.Close() 
 solver = CPSolver(propagator, model)
 solver.Search()
 
 
#Q = NQueen(8)
#Q.Solve() 

S = Sudoku()