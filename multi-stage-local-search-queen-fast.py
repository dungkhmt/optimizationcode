import random as rd 

n = 100
x = [0 for i in range(n)]# x[i] is the row index of the queen on column i 

cntR = [0 for r in range(n)] # cntR[r] is the number of queens on row r 
cntD1 = [0 for d in range(0,2*n-1)]# cntD1[d]: the number of queens having row + column = d 
cntD2 = [0 for d in range(0,2*n-1)]# cntD2[d]: the number of queens having row - column + (n-1) = d 
totalViolations = 0 # count the total number of violations  

def violations(v):
 if v <= 1:
  return 0
 return v*(v-1)//2 
 #return max(v-1,0) # if v <= 1 then 0 violation, otherwise, violations = v - 1
 
def violationOf(q):
 row = x[q]
 column = q 
 res = (cntR[row] - 1) + (cntD1[row+column]-1) + (cntD2[row-column+(n-1)]-1) 
 return res #time complexity is O(1)

 
def violationIf(q, r):
 # return new total violations if x[q] is changed with new_row 
 # this function will be called many times when querying the neighborhood at each LS iteration 
 o = x[q] 
 new_violations = totalViolations
 
 new_violations -= violations(cntR[o])
 new_violations += violations(cntR[o]-1)
 new_violations -= violations(cntR[r])
 new_violations += violations(cntR[r]+1)
 
 new_violations -= violations(cntD1[o+q])
 new_violations += violations(cntR[o]-1)
 new_violations -= violations(cntD1[r+q])
 new_violations += violations(cntD1[r+q]+1)
 
 new_violations -= violations(cntD2[o-q+n-1])
 new_violations += violations(cntD2[o-q+n-1]-1)
 new_violations -= violations(cntD2[r-q+n-1])
 new_violations += violations(cntD2[r-q+n-1]+1)
 
 return new_violations
 
def propagate(q,new_row):
 global totalViolations
 if x[q] == new_row:
  return 
 r = x[q]
 totalViolations -= violations(cntR[r])
 cntR[r]-=1
 totalViolations += violations(cntR[r]) 
 totalViolations -= violations(cntR[new_row])
 cntR[new_row]+=1
 totalViolations += violations(cntR[new_row])
 totalViolations -= violations(cntD1[q+r])
 cntD1[q+r]-=1
 totalViolations += violations(cntD1[q+r])
 totalViolations -= violations(cntD1[q+new_row])
 cntD1[q+new_row]+=1
 totalViolations += violations(cntD1[q+new_row])
 totalViolations -= violations(cntD2[r-q+n-1])
 cntD2[r-q+n-1]-=1
 totalViolations += violations(cntD2[r-q+n-1])
 totalViolations -= violations(cntD2[new_row-q+n-1])
 cntD2[new_row-q+n-1]+=1
 totalViolations += violations(cntD2[new_row-q+n-1])
 
def select_most_violating_queen():
 sel_q = -1
 max_v = -1000000
 cand = []# collect all queens having the same (highest) violations in a list cand 
 for i in range(n):
  v = violationOf(i)
  if v > max_v:
   cand = [i]      
   max_v = v
  elif v == max_v:
   cand.append(i)
   
 # select randomly a queen from the cand   
 idx = rd.randint(0,len(cand)-1)
 sel_q = cand[idx]  
 return sel_q  

def select_most_promissing_row(sel_q):
 sel_r = -1
 min_v = 1000000
 old_row = x[sel_q]
 cand = []
 for r in range(n):
  if r != old_row:
   v = violationIf(sel_q, r)# compute new violations if the queen sel_q is moved to new row r 
   if v < min_v:
    cand = [r]
    min_v = v 
   elif v == min_v:
    cand.append(r)

 idx = rd.randint(0,len(cand)-1)
 sel_r = cand[idx] 
 return sel_r 
 
def computeViolations():
 res = 0
 for i in range(n):
  for j in range(i+1,n):
   if x[i] == x[j]:
    res += 1
   if x[i] + i == x[j] + j:
    res += 1
   if x[i]-i == x[j]-j:
    res += 1
 return res
 
def generate_initial_solution():
 global totalViolations
 
 for i in range(n):
  x[i] = rd.randint(0,n-1)   
 
 # compute intial violations 
 for q in range(n):
  r = x[q]
  cntR[r] += 1
  cntD1[r + q] += 1
  cntD2[r-q+(n-1)] += 1
  
 totalViolations = 0
 for r in range(n):
  totalViolations += violations(cntR[r])
 for d in range(2*n-1):
  totalViolations += violations(cntD1[d])
  totalViolations += violations(cntD2[d])
  
  
def print_info():
 for i in range(n):
  print('cntR[',i,'] = ',cntR[i])
  print('cntD1[',x[i]+i,'] = ',cntD1[x[i]+i])
  print('cntD2[',x[i]-i,'] = ',cntD1[x[i]-i+(n-1)])
    
def local_search(maxIterations):
 generate_initial_solution()
 print(x,' initialviolations = ',totalViolations)
 old = totalViolations
 for iter in range(maxIterations):
  sel_q = select_most_violating_queen()
  sel_row = select_most_promissing_row(sel_q)
  #sel_q = 1
  #sel_row = 1
  propagate(sel_q, sel_row) # update information (data structures maintained) when performing a move
  x[sel_q] = sel_row #local move   
  #print('Step ',iter,': x = ',x,' violations = ',totalViolations)
  print('Step ',iter,': violations = ',totalViolations)
  '''
  if totalViolations !=computeViolations():
   print_info()
   print('BUG, totalViolations = ',totalViolations,' recompute = ',computeViolations())
   break
  '''
  if totalViolations == 0:
   break 
   

local_search(10000)   