'''
A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
'''
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
def depth(root):
    if not root:
        return 0
    ldepth = depth(root.left)
    rdepth = depth(root.right)
    return max(ldepth, rdepth) + 1

class Solution(object):
    def maxDepth(self, root):
        return depth(root)
