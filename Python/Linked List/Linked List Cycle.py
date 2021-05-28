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
        # Used Floyd's hare and tortoise algorithm.
        # How it works:
        #   The rabbit starts one node away from the turtle (turtle starts at the head)
        #   The turtle moves at each node while the rabbit moves faster than the turtle by 2 nodes
        #   If the turtle and the rabbit encounter at the same position, there's a cycle


        try:
            # Assign the turtle at the head and the rabbit to the next 
            turtle = head
            rabbit = head.next
            
            # While the turtle is not at the same position as rabbit,
            while turtle is not rabbit:

                # Make the turtle move to the next node
                turtle = turtle.next

                # Make the rabbit move to the next, next node
                rabbit = rabbit.next.next 
            
            # If they meet at the same node, then there's a cycle
            return True 
        except:

            # If there is no cycle, then return false.
            return False
            
