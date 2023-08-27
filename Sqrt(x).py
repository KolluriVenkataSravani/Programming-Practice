'''
Given a non-negative integer x, return the square root of x rounded down to 
the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
'''
class Solution:
    def mySqrt(self, x: int) -> int:
        if x == 0 or x == 1:
            return x
        l, r = 1, x
        while l <= r:
            m = l + (r - l) // 2
            if m * m == x:
                return m
            elif m * m < x:
                l = m + 1
            else:
                r = m - 1 
        return r
