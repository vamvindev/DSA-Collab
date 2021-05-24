# Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

# Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

# Example 1:
# Input: nums = [1,1,2]
# Output: 2, nums = [1,2]

# Example 2:
# Input: nums = [0,0,1,1,1,2,2,3,3,4]
# Output: 5, nums = [0,1,2,3,4]


class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        # Initalize counter
        index = 0 
        
        # While the counter < len(nums) - 1
        while index < len(nums) - 1:

            # If the current element is equal to the element next to it
            if nums[index] == nums[index + 1]:

                # Delete the element from the array 
                del nums[index]

                # Subtract the counter so that we don't miss any elements that has occurred more than twice
                index -= 1
            
            # Add the counter by one if the current element and the next element is not equal
            index += 1
        
        # Return the length of the array
        return len(nums)

        

# Print out the length of the array and the array itself
x = Solution()
print(x.removeDuplicates([0,0,1,1,1,2,2,3,3,4]))

