# Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

# Note that you must do this in-place without making a copy of the array.

# Example 1:
# Input: nums = [0,1,0,3,12]
# Output: [1,3,12,0,0]

# Example 2:
# Input: nums = [0]
# Output: [0]

class Solution(object):
    def moveZeroes(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        
        position = 0
        
        for x in range(len(nums)):
            element = nums[x]
            if element != 0:
                nums[x], nums[position] = nums[position], nums[x]
                position += 1
  

# Initialize a position that keeps track of elements

# For each element in the array
#     Create a placeholder to keep track of the elements
#     If the element != 0
#         Swap the index of the placeholder with the non-zero element
#         Increment the position value 



