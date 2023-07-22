'''
Let F(S) denote the number of distinct elements in the array S. For example, F([1,2,3,2])=3,F([1,2])=2.
You are given an array A containing N integers. Find if it is possible to divide the elements of the array A into two arrays B and C such that :
Every element of the array A belongs either to array B or to array C.
F(B)=F(C).
'''
# cook your dish here
t=int(input())
for tc in range(t):
    n=int(input())
    lst=list(map(int,input().split()))
    s=set(lst)
    distinct=len(s)
    if((n%2!=0) and (n==distinct)):
        print("No")
    else:
        print("Yes")
