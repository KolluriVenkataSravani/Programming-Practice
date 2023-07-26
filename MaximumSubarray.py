'''
Given an integer array nums, find the subarray with the largest sum, and return its sum.
'''
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curSum = maxSum = nums[0]
        for num in nums[1:]:
            curSum = max(curSum, 0) + num
            maxSum = max(maxSum, curSum)

        return maxSum
