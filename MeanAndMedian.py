'''
Chef has two numbers X and Y. Chef wants to find three integers A,B, and C such that:
−1000≤A,B,C≤1000
mean([A,B,C])=X
median([A,B,C])=Y
Can you help Chef find such three integers?
As a reminder, mean([P,Q,R])= (P+Q+R)/3 and median([P,Q,R]) is the element at the 2nd (middle) position after we sort [P,Q,R] in non-decreasing order.
'''
# cook your dish here
t=int(input())
for tc in range(t):
    (x,y)=map(int,input().split())
    b=y
    if((x-y)>0):
        a=y
        b=y
        c=y+3*(x-y)
        print(a,end=" ")
        print(b,end=" ")
        print(c,end=" ")
        print(end="\n")
    else:
        a=y+3*(x-y)
        b=y
        c=y
        print(a,end=" ")
        print(b,end=" ")
        print(c,end=" ")
        print(end="\n")
