'''
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans=set()
        n,p,z=[],[],[]
        for i in nums:
            if i<0:
                n.append(i)
            elif i>0:
                p.append(i)
            else:
                z.append(i)
        N,P=set(n),set(p)
        if z:
            for i in P:
                if -i in N:
                    ans.add((-i,0,i))
        if len(z)>=3:
            ans.add((0,0,0))
        for i in range(len(n)):
            for j in range(i+1,len(n)):
                s=-1*(n[i]+n[j])
                if s in P:
                    ans.add(tuple(sorted([n[i],n[j],s])))
        for i in range(len(p)):
            for j in range(i+1,len(p)):
                s = -1*(p[i]+p[j])
                if s in N:
                    ans.add(tuple(sorted([p[i],p[j],s])))
        return ans
        
