import sys
import time 

[n] = [int(x) for x in sys.stdin.readline().split()]
c = []
for i in range(n):
 r = [int(x) for x in sys.stdin.readline().split()]
 c.append(r)
 
cm = int(1e9)
for i in range(n):
 for j in range(n):
  if i != j and cm > c[i][j]:
   cm = c[i][j] 
   
x = [0 for i in range(n)]
visited = [False for i in range(n)]

Cand = [[i for i in range(n)] for j in range(n)]

for i in range(n):
 Cand[i] = sorted(Cand[i], key = lambda x: c[i][x])

'''
for i in range(n):
 print('Cand[',i,']:',end = ' ')
 for j in Cand[i]:
  print('(',j,c[i][j],')',end = ' ')
 print('')
'''
 
def Solution():
 global fmin
 if f + c[x[n-1]][x[0]] < fmin:
  fmin = f + c[x[n-1]][x[0]]
  
def Try(k):
 global f
 #for v in range(n):
 for v in Cand[x[k-1]]:
  if visited[v] == False:
   x[k] = v 
   f = f + c[x[k-1]][v]
   visited[v] = True 
   if k == n-1:
    Solution()
   else:
    if f + cm*(n-k) < fmin:
     Try(k+1)
   visited[v] = False   
   f = f - c[x[k-1]][v]   
   
start_t = time.time()   
x[0] = 0
visited[0] = True 
f = 0
fmin = int(1e9)
Try(1)  
print(fmin) 

end_t = time.time()
print('time = ',(end_t - start_t))