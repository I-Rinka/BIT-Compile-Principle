
size=1000

matrix1 = [[i+1 for i in range(size)] for j in range(size)]
matrix2 = [[i+1 for i in range(size)] for j in range(size)]

ans = [[0 for i in range(size)] for j in range(size)]

for i in range(size):
    for j in range(size):
        tmp=0
        for n in range(size):
            tmp+=matrix1[i][n]*matrix2[n][j]
        ans[i][j]=tmp

print(ans)