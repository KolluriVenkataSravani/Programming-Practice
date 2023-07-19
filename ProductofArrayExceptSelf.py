'''
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        l=len(nums)
        ans=[0]*l
        mul=1
        for i in range(l):
            ans[i]=mul
            mul*=nums[i]
        mul=1
        for i in range(l-1,-1,-1):
            ans[i]*=mul
            mul*=nums[i]
        return ans
