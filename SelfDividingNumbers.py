'''
A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.
Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
'''
class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        lst1=[]
        def selfdiv(num):
            i=0
            n=num
            while num>0:
                i=num%10
                if i==0:
                    return False
                if n%i!=0:
                    return False
                num=num//10
            return True
        for i in range(left,right+1):
            if selfdiv(i):
                lst1.append(i)
        return lst1
