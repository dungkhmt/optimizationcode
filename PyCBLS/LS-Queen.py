import random as rd 

class VarIntLS:
 def __init__(self,D,value,name):
  self.Domain = D 
  self.name = name
  self.Value = value
  self.constraints = []
  
 def SetValue(self,v):
  self.Value = v 
 
 def GetValue(self):
  return self.Value 
  
class Neq:
 def __init__(self,X,Y,name):
  self.X = X
  self.Y = Y
  self.name = name
  self.violations = 0
  if X.GetValue() == Y.GetValue():
   self.violations = 1 
  X.constraints.append(self)
  Y.constraints.append(self)
  
 def Contains(self, Z):
  if Z == self.X or Z == self.Y:
   return True 
  else:
   return False 
   
 def GetSwapDelta(self, X, Y):
  #print(self.name,'::GetSwapDleta(',X.name,Y.name,')')
  if X == self.X and Y == self.Y or X == self.Y and Y == self.X:
   return 0
  if self.Contains(X):
   return self.GetAssignDelta(X, Y.GetValue())
  elif self.Contains(Y):
   return self.GetAssignDelta(Y, X.GetValue())
  else:
   return 0  


 def GetAssignDelta(self, X, v):
  if X != self.X and X != self.Y:
   return 0
  nv = 0
  if X == self.X:
   if v == self.Y.GetValue():
    nv = 1
  elif X == self.Y:
   if v == self.X.GetValue():
    nv = 1
  return nv - self.violations 
  
  
 def Violations(self):
  return self.violations
 
 def Propagate(self, Z, v):
  # update violations when variable Z is assigned by a value v 
  #print('Neq:' + self.name + ' Propagate(',X.name,v,')')
  if Z == self.X:
   if v == self.Y.GetValue():
    self.violations = 1
   else:
    self.violations = 0
  elif Z == self.Y:
   if v == self.X.GetValue():
    self.violations = 1
   else:
    self.violations = 0   
 
 def Check(self):
  v = 0
  if self.X.GetValue() == self.Y.GetValue():
   v = 1
  if v != self.violations:
   print(self.name,'::Check Failed, X = ',self.X.GetValue(),'Y = ',self.Y.GetValue(),'violations = ',self.violations)
   
   return False 
  return True    
 def ToString(self):
  return self.name + ', violations = ' + str(self.violations) 
 
class AllDifferent:
 def __init__(self, X, w):
  # semantic: X[i] + w[i] != X[j] + w[j]
  # violation definition (value-based): o[v]: occurences of value v in {X[1] + w[1], X[2] + w[2], ... X[n] + w[n]}
  # violations[v] is the violations for value v: violations[v] = max(o[v]-1,0)
  # violations of AllDifferent = sum{violations[v] | all v in domain(X[i] + w[i])}
  # Example domain(X[i]) = {1,2,3}, w[1..5] = [1,2,3,4,1] -> domain(X[i] + w[i]) = {2,3,...,7}
  # with solution X[1..5] = [1,2,2,1,1] -> X[i] + w[i] = [1+1,2+2,2+3,1+4,1+1] = [2,4,5,5,2]
  # In [2,4,5,5,2]: o[2] = 2, o[3] = 0, o[4] = 1, o[5] = 2, o[6] = 0, o[7] = 0
  # -> violations[2] = 1, violations[3] = 0, violations[4] = 0, violations[5] = 1
  # violations[6] = 0, violations[7] = 0
  # -> AllDifferent(2,4,5,5,6) = 1 + 0 + 0 + 1 + 0 + 0 = 2
  
  self.X = X
  self.w = w
  self.violations = 0
  self.map = {}
  self.N = len(X)
  self.min_domain = 1e9
  self.max_domain = 1-1e9 
  self.o = [o for v in range(self.min_doamin,self.max_domain+1)] #o[v] is the occurrences of v
  
  for i in range(N):
   self.map[X[i]] = i 
   
    
 def Contains(self, Z):
  return self.map[Z] >= 0 and self.map[Z] < self.N
   
 def GetSwapDelta(self, X, Y):
  #print(self.name,'::GetSwapDleta(',X.name,Y.name,')')
    

 def GetAssignDelta(self, X, v):
  
  
 def Violations(self):
  return self.violations
 
 def Propagate(self, Z, v):
  # update violations when variable Z is assigned by a value v 
  #print('Neq:' + self.name + ' Propagate(',X.name,v,')')

class LSQueen:
 # AllDifferent(X[1], X[2],..., X[n])
 # AllDifferent(X[1] + 1, X[2] + 2, ..., X[n] + n)
 # AllDifferent(X[1] - 1, X[2] - 2, ..., X[n] - n)
 def __init__(self,n):
  self.n = n 
  
 
class ConstraintSystem:
 def __init__(self):
  self.constraints = [] 
 def AddConstraint(self,c):
  self.constraints.append(c)

 def GetAssignDelta(self, X, v):
  delta = 0
  for c in X.constraints:
   delta += c.GetAssignDelta(X,v)
  return delta 
  
 def GetSwapDelta(self, X, Y):
  #print('CS.GetSwapDelta(',X.name,Y.name,')')
  delta = 0
  C = set()
  for c in X.constraints:
   C.add(c)
  for c in Y.constraints:
   C.add(c)  
  for c in C: 
   delta += c.GetSwapDelta(X,Y)
   
  return delta 
  
 def Propagate(self, X, v):
  for c in X.constraints:
   c.Propagate(X,v)
   
   
  self.violations = 0
  for c in self.constraints:
   self.violations += c.Violations()  
  return 
  
 def Violations(self):
  return self.violations 
  
 def Close(self):
  self.violations = 0
  for c in self.constraints:
   self.violations += c.Violations()
  return  

 def ToString(self):
  s = ''
  for c in self.constraints:
   s = s + c.ToString() + '\n'
  return s 
  
 def Check(self):
  for c in self.constraints:
   if c.Check() == False:
    print('CS::Check failed')
    return False 
  return True   
   
