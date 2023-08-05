'''
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. 
If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        def reverse(head, k):
            prev = None
            curr = head
            while curr:
                nxt = curr.next
                curr.next = prev
                prev = curr
                curr = nxt
            return prev
        def lengthh(node):
            length = 0
            while node:
                length += 1
                node = node.next
            return length
        length = lengthh(head)
        iterations = length // k
        dummy = ListNode(0)
        dummy.next = head
        prev_tail = dummy
        for i in range(iterations):
            ghead = prev_tail.next
            gtail = ghead
            for j in range(k - 1):
                gtail = gtail.next
            next_ghead = gtail.next
            gtail.next = None
            prev_tail.next = reverse(ghead, k)
            ghead.next = next_ghead
            prev_tail = ghead
        return dummy.next
