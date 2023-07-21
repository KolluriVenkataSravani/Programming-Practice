'''
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
'''
class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        def is_valid(s):
            stack=[]
            for i in s:
                if i=='(':
                    stack.append(i)
                elif i==')':
                    if not stack or stack[-1]!='(':
                        return False
                    stack.pop()
            return not stack
        def backtrack(s,opencount,closedcount):
            if len(s)==2*n:
                if is_valid(s):
                    ans.append(s)
                return ans
            if opencount<n:
                backtrack(s+'(',opencount+1,closedcount)
            if closedcount<n:
                backtrack(s+')',opencount,closedcount+1)
        ans=[]
        backtrack('',0,0)
        return ans
