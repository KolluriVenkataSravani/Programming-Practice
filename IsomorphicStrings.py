'''
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving 
the order of characters. No two characters may map to the same character, but a character may map to itself.
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if(len(s)!=len(t)):
            return False
        s_t={}
        t_s={}
        for i in range(len(s)):
            if s[i] in s_t:
                if(s_t[s[i]]!=t[i]):
                    return False
            else:
                if t[i] in t_s:
                    return False
                s_t[s[i]]=t[i]
                t_s[t[i]]=s[i]
        return True
