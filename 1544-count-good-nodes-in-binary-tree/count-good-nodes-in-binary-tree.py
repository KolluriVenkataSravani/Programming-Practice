# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def goodNodes(self, root: TreeNode) -> int:
        count=0
        def depth(root,maxx):
            nonlocal count
            if not root:
                return None
            if root.val>=maxx:
                count+=1
            maxx=max(maxx,root.val)
            ldepth=depth(root.left,maxx)
            rdepth=depth(root.right,maxx)
        depth(root,float('-inf'))
        return count