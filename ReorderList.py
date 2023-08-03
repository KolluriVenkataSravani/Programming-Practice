'''
You are given the head of a singly linked-list. The list can be represented as:
L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:
L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.
'''
# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverselist(head):
        prev=None
        curr=head
        while curr:
            nxt=curr.next
            curr.next=prev
            prev=curr
            curr=nxt
        return prev

    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        if not head or not head.next:
            return head
        slow,fast=head,head
        while fast.next and fast.next.next:
            slow=slow.next
            fast=fast.next.next
        headrev=Solution.reverselist(slow.next)
        slow.next=None
        curr=head
        while headrev:
            curr1,curr2=curr.next,headrev.next
            curr.next=headrev
            headrev.next=curr1
            curr,headrev=curr1,curr2
        return head
