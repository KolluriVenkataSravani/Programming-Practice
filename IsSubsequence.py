'''
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
A subsequence of a string is a new string that is formed from the original string by 
deleting some (can be none) of the characters without disturbing the relative positions 
of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
'''
class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(s) > len(t):
            return False
        if len(s) == 0:
            return True
        string=0
        for i in range(len(t)):
            if string<=len(s)-1:
                print(s[string])
                if s[string]==t[i]:

                    string+=1
        return  string == len(s)
