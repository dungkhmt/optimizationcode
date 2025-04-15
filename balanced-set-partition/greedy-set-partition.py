n, m = map(int, input().split())
w = list(map(int, input().split()))
w_i = [(w, i) for i, w in enumerate(w)]
w_i.sort(reverse=True)

#print(w_i)
Weight = [0]*m
x = [0]*n

for wi, i in w_i:
    min_idx = 0
    for j in range(1, m):
        if Weight[j] < Weight[min_idx]:
            min_idx = j
    x[i] = min_idx + 1
    Weight[x[i]-1] += wi 
print(n)
print(" ".join(map(str, x)))
