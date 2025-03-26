import numpy as np
from ortools.linear_solver import pywraplp

INF = 1e9
print(INF)
def solve_lp_max(A,b,c):
	'''
	min f(x) = cx
	s.t. Ax = b
	x >= 0
	'''
	m,n = A.shape
	print('n = ',n,'m=',m)
	solver = pywraplp.Solver.CreateSolver('ex','GLOP')
	inf = solver.infinity()										
	x = [solver.NumVar(0.0,inf,'x(' + str(i) + ')') for i in range(n)]
	for i in range(m):
		ctr = solver.Constraint(b[i],b[i],'c' + str(i))
		for j in range(n):
			ctr.SetCoefficient(x[j],A[i,j])
	
	obj = solver.Objective()
	for i in range(n):
		obj.SetCoefficient(x[i],c[i])
	obj.SetMaximization()
	
	solver.Solve()
	result_status = solver.Solve()

	assert result_status == pywraplp.Solver.OPTIMAL

	print('Optimal objective value = %f' % solver.Objective().Value())

		
def step(A,c,r):
	n,m = A.shape
	
	#print('rows = ',n,' cols = ',m)
	pivot = A[r,c]
	#for j in range(m):
	#	A[r,j] = A[r,j]/pivot
	A[r,:] = A[r,:]/pivot	
	for i in range(n):
		if i != r:
			A[i,:] = A[i,:] - A[i,c]*A[r,:]
	return A


def FindMinIndex(T,m,n,basic_indices):
	min_d = INF
	i = -1
	for j in range(n):
		if not j in basic_indices:
			if T[m,j] < min_d:
				min_d = T[m,j]
				i = j
	return i
def FindBasicIndexForRow(i,T,m,n,basic_indices):
	for j in basic_indices:
		if T[i,j] == 1:
			return j
	return -1

def FindRowForBasicIndex(i,T,m,n):
	for j in range(m):
		if T[j,i] == 1:
			return j
	return -1;
	
def solveTabular(T,basic_indices):
	rows,cols = T.shape
	m = rows - 1
	n = cols - 2
	
	'''
	T is the tabular, with set of basic indices basic_indices
	m is the number of equality constraints
	n is the number of variables
	RHS = T[0:m-1,cols-1] which is >= 0
	B = T[0:m-1,basic_indices] is unit matrix
	'''
	
	stop = False	
	while stop == False:
		i = FindMinIndex(T,m,n,basic_indices)
		
		print('select min index = ',i,' min_d = ',T[m,i])
		if T[m,i] >= 0:
			print('Optimal Condition Reached!!')
			stop = True
			return 'OPTIMALITY',T
			break
			
		unbounded = True
		for j in range(m):
			if T[j,i] > 0:
				unbounded = False
				break
		if unbounded:
			return 'UNBOUNDED',None
			break
			
		eval = [INF if T[j,i] <= 0 else T[j,n+1]/T[j,i] for j in range(m)]
		print('eval = ',eval)
		j = np.argmin(eval)
		print('select row j = ',j)
		T = step(T,i,j)
		
		idx = FindBasicIndexForRow(j,T,m,n,basic_indices)
		#replace idx by a new one i
		basic_indices.remove(idx)
		basic_indices.add(i)
		
		print('Update, T = ',T)
		print('Update, basic_indices = ',basic_indices)
		print('----------------')
	
def TwoPhaseSolve(A,b,c):
	'''
	max f(x) = cx
	Ax = b
	x >= 0
	'''
	m,n = A.shape
	print('TwoPhaseSolve: A = ',A,'b = ',b,'c = ',c)
	for i in range(m):
		if b[i] < 0:
			A[i,:] = -A[i,:]
			b[i] = -b[i]
	print('After normalize b, A = ',A,' b = ',b)		
	
	#phase1
	A1 = np.zeros((m+1,n+m+2), dtype='double')
	A1[0:m,0:n] = A
	for i in range(m):
		A1[m,n+i] = 1
		A1[i,n+i] = 1
	A1[m,n+m] = 1
	for i in range(m):
		A1[i,n+m+1] = b[i]
	for i in range(m):
		A1[m,:] = A1[m,:] - A1[i,:]
	print('A1 = ',A1)
	stop = False
	unbounded = False
	#basic_indices [n+i for i in range(m)]
	basic_indices = set()
	for i in range(m):
		basic_indices.add(n+i)
		
	'''	
	def FindMinIndex(basic_indices):
		min_d = INF
		i = -1
		for j in range(n+m):
			if not j in basic_indices:
				if A1[m,j] < min_d:
					min_d = A1[m,j]
					i = j
		return i
	def FindBasicIndexForRow(i,A,basic_indices):
		for j in basic_indices:
			if A[i,j] == 1:
				return j
		return -1
	def FindRowForBasicIndex(i,A):
		for j in range(m):
			if A[j,i] == 1:
				return j
		return -1;
		
	while stop == False:
		#i = np.argmin(A1[m,0:n+m])		
		i = FindMinIndex(basic_indices)
		
		print('select min index = ',i,' min_d = ',A1[m,i])
		if A1[m,i] >= 0:
			break
		unbounded = True
		for j in range(m):
			if A1[j,i] > 0:
				unbounded = False
				break
		if unbounded:
			break
			
		eval = [INF if A1[j,i] <= 0 else A1[j,n+m+1]/A1[j,i] for j in range(m)]
		print('eval = ',eval)
		j = np.argmin(eval)
		print('select row j = ',j)
		A1 = step(A1,i,j)
		
		idx = FindBasicIndexForRow(j,A1,basic_indices)
		#replace idx by a new one i
		basic_indices.remove(idx)
		basic_indices.add(i)
		
		print('Step 1, A1 = ',A1)
		print('Step 1, basic_indices = ',basic_indices)
		
		#break
	'''
	status, A1 = solveTabular(A1,basic_indices)
	print('Finished phase 1, status = ',status,' A1 = ',A1)
	
	
	# remove artificial variables from basic variables
	stop = False	
	while stop == False:
		all_basic_indices_are_real = True
		for i in basic_indices:
			if i >= n:
				all_basic_indices_are_real = False
		if all_basic_indices_are_real:
			#obtain basic variables which are all real variables
			stop = True
			break
			
		found = False
		sel_artificial_basic_index = -1
		sel_real_non_basic_index = -1
		sel_row = -1
		for j in basic_indices:
			if j >= n:# aritificial variable index
				i = FindRowForBasicIndex(j,A1,m,n+m)
				for j1 in range(n):
					if A1[i,j1] > 0:
						found = True
						sel_artifical_basic_index = j
						sel_real_non_basic_index = j1
						sel_row = i
		if not found:
			# all artificial variables in basic variables correspond to 0 row -> remove
			stop = True	
			break

		A1 = step(A1,sel_non_basic_index,sel_row)
	
		
	print('Finish phase 1, A1 = ',A1)
	print('Finish phase 1, n = ',n,'m = ',m)
	print('Finish phase 1, basic_indices = ',basic_indices)
	#phase 2
	A2 = []
	for i in range(m):
		j = FindBasicIndexForRow(i,A1,m,n+m,basic_indices)
		if j < n:
			A2.append(A1[i,0:n+2])
			A2[len(A2)-1][n] = 0
			A2[len(A2)-1][n+1] = A1[i,n+m+1]
	m = len(A2)
	R = np.zeros(n+2,dtype='double')
	A2.append(R)
	A2 = np.array(A2)
	# remove artificial variables from basic_indices
	T = set()
	for i in basic_indices:
		if i >= n:
			T.add(i)
	for i in T:
		basic_indices.remove(i)
	
	print('Init A2 = ',A2)
	print('Init n = ',n,'m = ',m)
	print('Init phase 2, basic_indices = ',basic_indices)
	
	for i in range(n):
		if not i in basic_indices:
			A2[m,i] = -c[i]
			for j in range(m):
				k = FindBasicIndexForRow(j,A2,m,n,basic_indices)
				A2[m,i] = A2[m,i] + A2[j,k]*c[k]
	A2[m,n] = 1			
	for i in range(m):
		k = FindBasicIndexForRow(i,A2,m,n,basic_indices)
		A2[m,n+1] = A2[m,n+1] + A2[i,n+1]*c[k]
	print('A2 = ',A2)
	status, A2 = solveTabular(A2,basic_indices)
	print('Phase 2 finished, status = ',status,' A2 = ',A2)
	
		
'''			
max f(x) = cx
s.t. Ax = b
x >= 0
with:
'''

'''
A = np.array([[1,1,1,1,1],[1,1,2,2,2],[1,1,0,0,0],[0,0,1,1,1]],dtype='double')
b = np.array([5,8,2,3],dtype='double').T
c = np.array([2,1,1,0,0],dtype='double')
'''

A = np.array([[3,-2,1],[2,3,0],[3,1,6]],dtype='double')
b = np.array([5,8,4],dtype='double').T
c = np.array([1,2,-5],dtype='double')


TwoPhaseSolve(A,b,c)

solve_lp_max(A,b,c)
c = -c
solve_lp_max(A,b,c)

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