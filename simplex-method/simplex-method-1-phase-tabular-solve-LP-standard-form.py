'''
 max f(x) = cx
 s.t. Ax <= b
 b >= 0
 x >= 0
 apply simplex method under the Tabular form one phase (assume RHS b >= 0)
'''

import sys 

INF = 1e9

def input():
 [n,m] = [int(x) for x in sys.stdin.readline().split()]
 c = [int(x) for x in sys.stdin.readline().split()] 
 A = []
 for i in range(m):
  line = [int(x) for x in sys.stdin.readline().split()]
  A.append(line)
 b = [int(x) for x in sys.stdin.readline().split()]

 return n,m,c,A,b 
     
def PrintTabular(T,n,m):
 for i in range(n):
  print('X' + str(i+1),end = '\t')
 print('Z', end = '\t')
 print('RHS')
 
 for i in range(m+1):
  for j in range(n+2):
   print(round(T[i][j],2),end = '\t')
  print('')   

 print('------------------------------------------------------------------------\n') 

def PrintElement(T,i,j):
 print('T[',i,',',j,'] = ',T[i][j],end = ' ')
 
def Rotate(T,r,c,n,m):
 print('Rotate(r = ',r,'c = ',c,')')
 pivot = T[r][c]
 for j in range(n+2):
  T[r][j] = T[r][j]/pivot	
 
 for i in range(m):
  if i != r:
   for j in range(n+2):
    T[i][j] = T[i][j] - T[i][c]*T[r][j]

 for j in range(n+2):
  if j != c:
    T[m][j] = T[m][j] - T[m][c]*T[r][j]
 T[m][c] = 0
 
 return T


def SelectRow(E,m):
 sel_r = -1
 minE = INF 
 for i in range(m):
  if E[i] < minE:
   minE = E[i]
   sel_r = i
 return sel_r 
 
def SelectColumn(T,m,n,basic_indices):
 min_d = INF
 i = -1
 for j in range(n):
  if not j in basic_indices:
   if T[m][j] < min_d:
    min_d = T[m][j]
    i = j
 return i
 
def FindBasicIndexForRow(r,T,m,n,basic_indices):
 for j in basic_indices:
  if T[r][j] == 1:
   return j
 return -1

def FindRowForBasicIndex(c,T,m,n):
 for i in range(m):
  if T[i][c] == 1:
   return i
 return -1;
	


 
def solveTabular(T,basic_indices,n,m):
	
 stop = False	
 print('START.....')
 while stop == False:
  PrintTabular(T,n,m)
  c = SelectColumn(T,m,n,basic_indices)
  
  if T[m][c] >= 0:
   #print('Optimal Condition Reached!!')
   stop = True
   return 'OPTIMALITY',T
   break
	
  print('select column = ',c)    
  unbounded = True
  for j in range(m):
   if T[j][c] > 0:
    unbounded = False
    break
  if unbounded:
   return 'UNBOUNDED',None
   break
			
  eval = [INF if T[j][c] <= 0 else T[j][n+1]/T[j][c] for j in range(m)]
  print('Evaluation = ',eval)
  #r = np.argmin(eval)
  #print('select row j = ',j)
  r = SelectRow(eval,m)
  print('Select Row = ',r)
  idx = FindBasicIndexForRow(r,T,m,n,basic_indices)
  T = Rotate(T,r,c,n,m)
  basic_indices.remove(idx)
  basic_indices.add(c)
		
  #print('Update, T = ',T)
  #print('Update, basic_indices = ',basic_indices)
  #print('----------------')


n,m,c,A,b = input()
for i in range(m):
 c.append(0)

for i in range(m):
 for j in range(m):
  if i == j:
   A[i].append(1)
  else:
   A[i].append(0)

   
basic_indices = set()
for i in range(m):
 basic_indices.add(n+i)

n = n + m

T = []
for i in range(m):
 row = [A[i][j] for j in range(n)]
 row.append(0)
 row.append(b[i])
 T.append(row)
row = [-c[i] for i in range(n)]
row.append(1)
row.append(0)
T.append(row)


rs, T = solveTabular(T,basic_indices,n,m)
#print('rs = ',rs)
if rs == 'OPTIMALITY':
 #print('optimal T')
 #print(T)
 X = [0 for i in range(n)]
 for j in basic_indices:
  for i in range(m):
   if T[i][j] == 1:
    X[j] = T[i][n+1] #b[i]
 
 #n = n-m
 #print(n) 
 for i in range(n):
  print('X'+str(i) + ' = ',X[i],end = ', ') 
else:
 print(rs)    

'''	
A = np.array([[1,1,1,1,1,1,0,0,0,0,5],[1,1,2,2,2,0,1,0,0,0,8],[1,1,0,0,0,0,0,1,0,0,2],[0,0,1,1,1,0,0,0,1,0,3],[-3,-3,-4,-4,-4,0,0,0,0,1,-18]],dtype='double')

rhs = np.array([5,8,2,3,-18],dtype='double')

A1 = A[0:4,0:9]
b1 = rhs[0:4]
c1 = np.array([0,0,0,0,0,1,1,1,1],dtype='double')
print('A1 = ',A1)
print('b1 = ',b1,'c1 = ',c1)
solve_lp(A1,b1,c1)

print(A)
print(rhs)

A = step(A,2,3)
print(A)
print('--------------------')
A = step(A,0,0)
print(A)
'''
