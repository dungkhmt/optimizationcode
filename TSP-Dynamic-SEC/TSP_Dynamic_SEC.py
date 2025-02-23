from ortools.linear_solver import pywraplp
import numpy as np
import random as rd
import sys
#points are numered 0,1,...,n-1
def input(filename):
	with open(filename) as f:
		[n] = [int(x) for x in f.readline().split()]
		d = []
		for i in range(n):
			r = [int(x) for x in f.readline().split()]
			d.append(r)
		d = np.array(d,dtype='double')
		return n, d
def inputStdIn():
	[n] = [int(x) for x in sys.stdin.readline().split()]
	d = []
	for i in range(n):
		r = [int(x) for x in sys.stdin.readline().split()]
		d.append(r)
	d = np.array(d,dtype='double')
	return n, d
	
def genData(filename,n):
	f = open(filename,'w')
	f.write(str(n) + '\n')
	for i in range(n):
		line = ''
		for j in range(n):
			w = rd.randint(1000,10000)
			if i == j:
				w = 0
			line = line + str(w) + ' '
			f.write(str(w) + ' ')
		#f.write(line + '\n')
		f.write('\n')
	f.close()
	
filename = 'tsp-10.txt'	
#genData(filename,50)
	
#n,d = input(filename)
#print('d = ',d)
#print('n = ',n)		

		
def printSolutionX(x):
	for i in range(n):
		for j in range(n):
			if i != j:
				if x[i,j].solution_value() == 1:
					print(i,' -> ',j)

def printSolutionY(y):
	for i in range(n):
		for j in range(n):
			if i != j:
				if y[i,j] == 1:
					print(i,' -> ',j)

def createSolverAndvariables():
	solver = pywraplp.Solver.CreateSolver('SCIP')
	x = [[solver.IntVar(0,1,'x(' + str(i) + ',' + str(j) + ')') for i in range(n)] for j in range(n)]
	
	x = np.array(x)
	
	return solver,x
	
def createBalanceFlowConstraint(solver,x):
	for i in range(n):
		cstr = solver.Constraint(1,1)
		for j in range(n):
			if i != j:
				cstr.SetCoefficient(x[i,j],1)
		cstr = solver.Constraint(1,1)
		for j in range(n):
			if i != j:
				cstr.SetCoefficient(x[j,i],1)
				
	
	
def solveDynSEC(SECs):
	solver,x = createSolverAndvariables()
	createBalanceFlowConstraint(solver,x)
	
	#create sub-tour-elimination constraints in the list SECs
	for C in SECs:
		cstr = solver.Constraint(0,len(C) - 1)
		for i in C:
			for j in C:
				if i != j: 
					cstr.SetCoefficient(x[i,j],1)
	
	obj = solver.Objective()
	for i in range(n):
		for j in range(n):
			if i != j:
				obj.SetCoefficient(x[i,j],d[i,j])
				
	rs = solver.Solve()
	
	y = np.array([[0 for i in range(n)] for j in range(n)])
	for i in range(n):
		for j in range(n):
			if i != j and x[i,j].solution_value() > 0:
				y[i,j] = 1
				
	return y, solver.Objective().Value()

	
def findNext(s,y):
	for i in range(n):
		if i != s and y[s,i] == 1:
			return i;
	return -1#not found
	
def extractCycle(s,y):
	C = []
	C.append(s)
	while True:
		i = findNext(s,y)
		if i == -1:
			return None
		if i in C:
			return C
		C.append(i)
		s = i
		
	return None
	
def solveTSP():
	SECs = []
	while True:
		y,opt = solveDynSEC(SECs)
		printSolutionY(y)
		print('found obj = ',opt)
		#break
		
		# start to discover sub-tours of the solutions
		mark = [False for v in range(n)]
		for s in range(n):
			if mark[s] == False:
				C = extractCycle(s,y)# will be a list of points
				print('Find sub-tour ',C,' len = ',len(C))
				if len(C) == n:
					#print('Optimal solution found!!!!!')
					return C # optimal solution found (global tour)
				
				SECs.append(C)
				for v in C:
					mark[v] = True
	return None
		
def printSolution(T):
	print(len(T))
	#print(T)
	for i in range(len(T)):
		print(T[i] + 1, end = ' ')
		
		
#n,d = inputStdIn()		
n,d = input('tsp-100.txt')
res = solveTSP()
printSolution(res)
					