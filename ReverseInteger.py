'''
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
'''
class Solution:
    def reverse(self, x: int) -> int:
        ans = int(str(abs(x))[::-1]) * (-1 if x < 0 else 1)
        return ans if -2**31 <= ans < 2**31 else 0
