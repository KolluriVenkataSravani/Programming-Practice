'''
Given a binary tree, determine if it is Height-Balanced
'''
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
import math
class Solution:
    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        def heightt(node):
            if not node:
                return 0
            lheight = heightt(node.left)
            if lheight == -1:
                return -1
            rheight = heightt(node.right)
            if rheight == -1:
                return -1
            if abs(lheight - rheight) > 1:
                return -1
            return max(lheight, rheight) + 1
        
        return heightt(root) != -1
