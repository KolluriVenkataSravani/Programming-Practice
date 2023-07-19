'''
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
and removing all non-alphanumeric characters, it reads the same forward and backward. 
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
'''
class Solution:
    def isPalindrome(self, s: str) -> bool:
        p = ""
        for i in s:
            if i.isalnum():
                p += i.lower()
        left = 0
        right = len(p) - 1
        while left < right:
            if p[left] == p[right]:
                left += 1
                right -= 1
                continue
            else:
                return False
        return True
