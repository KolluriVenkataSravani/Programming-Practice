'''
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
'''
class Solution:
    def reverse(nums, start, end):
        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start += 1
            end -= 1
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = k % n  
        Solution.reverse(nums, 0, n - 1)
        Solution.reverse(nums, 0, k - 1)
        Solution.reverse(nums, k, n - 1)    
