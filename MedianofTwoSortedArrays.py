'''
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).
'''
class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        lst=[]
        nums=nums1+nums2
        nums.sort()
        p=len(nums)//2
        if(len(nums)%2==0):
            median=float((nums[p-1]+nums[p])/2)
        else:
            median=float(nums[p])
        return median
