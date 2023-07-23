'''
Harsh was recently gifted a book consisting of N pages. Each page contains exactly M words printed on it. 
As he was bored, he decided to count the number of words in the book.
Help Harsh find the total number of words in the book.
'''
# cook your dish here
t=int(input())
for tc in range(t):
    (n,m)=map(int,input().split())
    total=n*m
    print(total)
