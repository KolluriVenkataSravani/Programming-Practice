'''
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same 
structure and node values of subRoot and false otherwise.
A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. 
The tree tree could also be considered as a subtree of itself.
'''
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
def sametree(self,root,subRoot):
    if not root and not subRoot:
        return True
    if root and subRoot and root.val==subRoot.val:
        return sametree(self,root.left,subRoot.left) and sametree(self,root.right,subRoot.right)
    return False
class Solution:
    def isSubtree(self, root: Optional[TreeNode], subRoot: Optional[TreeNode]) -> bool:
        if not subRoot:
            return True
        if not root:
            return False
        if sametree(self,root,subRoot):
            return True
        return self.isSubtree(root.left,subRoot) or self.isSubtree(root.right,subRoot) 
