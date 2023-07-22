'''
Chef is given two arrays A and B of length N each.
In one operation Chef can choose one element of A and one element of B and increase them by 1.
More formally: Chef can pick two integers i,j (1≤i,j≤N) and increment A[i] and B[j] by 1.
Determine the minimum number of operations required to make A and B equal.
Output −1 if it is not possible to make A and B equal.
'''
# cook your dish here
t=int(input())
for tc in range(t):
    n=int(input())
    a=[int(x) for x in input().split()]
    b=[int(y) for y in input().split()]
    c=0
    ca=0
    cb=0
    for i in range(n):
        ca+=a[i]
    for i in range(n):
        cb+=b[i]
    for i in range(n):
        if(a[i]>b[i]):
            c+=0
        else:
            c+=b[i]-a[i]
    if(ca==cb):
        print(c)
    else:
        print("-1")
