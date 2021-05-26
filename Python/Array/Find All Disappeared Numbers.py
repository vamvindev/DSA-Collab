# Given an array nums of n integers where nums[i] is in the range [1, n]. Return an array of all the integers in the range [1, n] that do not appear in nums.

# Example 1:
# Input: nums = [4,3,2,7,8,2,3,1]
# Output: [5,6]

# Example 2:
# Input: nums = [1,1]
# Output: [2]

class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # For each element in the array,
        for x in range(len(nums)):
            # Get the abosolute value of th element and subtract by one since index starts at 0
            temp = abs(nums[x]) - 1

            # If the temporary number is positive, make that value negative. 
            # If the temporary number is already negative, continue the iteration.
            if nums[temp] > 0:             
                nums[temp] *= -1 
        
        array = []

        # Once we're done converting the positive values, we get the remaining
        # positive values' index plus 1
        for index, value in enumerate(nums):
            if value > 0:
                array.append(index + 1)

        return array  

print(Solution().findDisappearedNumbers([4,3,2,7,8,2,3,1]))