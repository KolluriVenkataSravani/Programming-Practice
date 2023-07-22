'''
You are given two positive integers. You need to construct two different binary strings (i.e, they are strings which consist of only 0s and 1s), 
which satisfy these two conditions:
Both the strings should be palindromes.
Each string should have exactly A 0s, and exactly B 1s in them.
Output Yes if two such different binary strings can be constructed and No otherwise.
'''
# cook your dish here
t=int(input())
for tc in range(t):
    (a,b)=map(int,input().split())
    if(a%2!=0 and b%2!=0 or a==1 or b==1):
        print("No")
    else:
        print("Yes")
