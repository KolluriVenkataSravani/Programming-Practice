'''
A linked list of length n is given such that each node contains an additional random pointer, 
which could point to any node in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, 
where each new node has its value set to the value of its corresponding original node. 
Both the next and random pointer of the new nodes should point to new nodes in the copied 
list such that the pointers in the original list and copied list represent the same list state. 
None of the pointers in the new list should point to nodes in the original list.
'''
"""
# Definition for a Node.
class Node:
    def __init__(self, x: int, next: 'Node' = None, random: 'Node' = None):
        self.val = int(x)
        self.next = next
        self.random = random
"""

class Solution:
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        dic={}
        if not head:
            return None
        curr=head
        while curr:
            val=Node(curr.val)
            dic[curr]=val
            curr=curr.next
        curr=head
        while curr:
            newval=dic[curr]
            newval.next=dic.get(curr.next,None)
            newval.random=dic.get(curr.random,None)
            curr=curr.next
        return dic[head]
