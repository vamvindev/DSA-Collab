# Given head, the head of a linked list, determine if the linked list has a cycle in it.

# There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

# Return true if there is a cycle in the linked list. Otherwise, return false.

# Example 1
# Input: head = [3,2,0,-4], pos = 1
# Output: true
# Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).

# Example 2:
# Input: head = [1,2], pos = 0
# Output: true
# Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.

# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def hasCycle(self, head):
        """
        :type head: ListNode
        :rtype: bool
        """
        # For this problem, I used the Floyd's Turtle and Hare algorithm.

        # Set turtle and rabbit to head
        turtle = head
        rabbit = head
        
        # While the rabbit and turtle are not pointed to none
        while rabbit != None and turtle != None:
            
            # If the rabbit and the turtle are at the same position, this means that there's a cycle, so return true
            if rabbit == turtle:
                return True 
            
            # If not, make the rabbit move the next two nodes, and the turtle the next node
            rabbit = rabbit.next.next
            turtle = turtle.next
        
        # If there is no cycle, then return false
        return False 

