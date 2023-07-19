'''
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
'''
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count={}
        lst=[]
        ans=[]
        for i in nums:
            if i in count:
                count[i]+=1
            else:
                count[i]=1
        for i in count.values():
            lst.append(i)
        lst.sort()
        lst=lst[-k:]
        for i in lst[:k]:
            for j in count:
                if count[j]==i and j not in ans:
                    ans.append(j)
        return ans
                    
