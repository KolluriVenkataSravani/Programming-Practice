'''
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
'''
class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        nums=set(nums)
        n=len(nums)
        for i in range(n+1):
            if  i not in nums:
                return i
