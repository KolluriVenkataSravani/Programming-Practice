'''
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.
'''
class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        dic={}
        ans=0
        for i in nums:
            if i in dic:
                return i
            dic[i]=1
        return -1
