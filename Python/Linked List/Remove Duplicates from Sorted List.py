# Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

# Example 1
# Input: head = [1,1,2]
# Output: [1,2]

# Example 2
# Input: head = [1,1,2,3,3]
# Output: [1,2,3]

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        
        cur = head.next
        prev = head
        
        while head != None:
            if cur.val == prev.val:
                prev.next = cur.next
                cur = cur.next
            
            else:
                prev = prev.next
                cur = cur.next
        return head
        
        
#        Initiliaze the previous value and the current value        
#        While the list is not None
#                 If the current value is equal to the previous value
#                       Assign the current's "next" as the previous's "next"
#                       Assign current's "next" as the current value
#                 Assign previou's next as previous
#                 Assign current's next as the current value
#        return the list

#     !     @
# [1, 1, 2, 3, 3]