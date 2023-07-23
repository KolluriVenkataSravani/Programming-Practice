'''
You are given a positive integer X. Your task is to tell whether there exist two positive integers a and b (a>0,b>0) such that 2⋅a+2⋅b+a⋅b=X
If there exist positive integers a and b satisfying the above condition print YES, otherwise print NO.
'''
# cook your dish here
try:
    t=int(input())
    while(t):
        x=int(input())
        j=0
        k=int(x**0.5)
        for i in range(1,k):
            if((x-2*i)%(i+2)== 0 and (x!=2*i)):
                j=j+1
                break
        if(j!=0):
            print("YES")
        else:
            print("NO")
except:
    pass
