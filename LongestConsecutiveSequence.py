'''
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
'''
class Solution:
    def longestConsecutive( self,nums: List[int]) -> int:
        if not nums:
            return 0
        length, clength = 1, 1
        s = list(set(nums))
        s.sort()
        for i in range(len(s) - 1):
            if s[i + 1] - s[i] == 1:
                clength += 1
            else:
                clength = 1
            if clength > length:
                length = clength
        return length
