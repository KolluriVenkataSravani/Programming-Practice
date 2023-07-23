'''
In the current semester, you have taken X RTP courses, Y Audit courses and Z Non-RTP courses.
The credit distribution for the courses are:
4 credits for clearing each RTP course.
2 credits for clearing each Audit course.
No credits for clearing a Non-RTP course.
Assuming that you cleared all your courses, report the number of credits you obtain this semester.
'''
t=int(input())
for tc in range(t):
    (x,y,z)=map(int,input().split())
    c=4*x+2*y+0*z
    print(c)
