# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        first = head

        # Find kth node from the beginning
        for _ in range(k - 1):
            first = first.next

        # Find kth node from the end
        fast = first
        second = head

        while fast.next:
            fast = fast.next
            second = second.next

        # Swap values
        first.val, second.val = second.val, first.val

        return head