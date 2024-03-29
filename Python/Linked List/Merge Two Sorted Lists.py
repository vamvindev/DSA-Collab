# Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

# Input: l1 = [1,2,4], l2 = [1,3,4]
# Output: [1,1,2,3,4,4]

# Example 2:
# Input: l1 = [], l2 = []
# Output: []

# Example 3:
# Input: l1 = [], l2 = [0]
# Output: [0]

class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        dummy = current = ListNode(0)

        while l1 and l2:
            if l1.val < l2.val:
                current.next = l1 
                l1 = l1.next 
            else:
                current.next = l2 
                l2 = l2.next 
            current = current.next 
        
        curent.next = l1 or l2 
        return dummy.next
x = Solution()
x.mergeTwoLists([1, 2, 4], [1, 3, 4])