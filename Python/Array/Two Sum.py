# Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# You can return the answer in any order.

# Example 1:
# Input: nums = [2,7,11,15], target = 9
# Output: [0,1]
# Output: Because nums[0] + nums[1] == 9, we return [0, 1].

# Example 2:
# Input: nums = [3,2,4], target = 6
# Output: [1,2]
# Example 3:

# Example 3
# Input: nums = [3,3], target = 6
# Output: [0,1]

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        table = {}

        # Iterates through the array by keeping track of elements and indices
        for count, value in enumerate(nums):
            # Gets the complementary value
            comp = target - value
            # If the complementary value is in the dictionary, then return the two sums.
            if comp in table:
                return [count, table[comp]]
            # If not, create a key-pair value in the dictionary
            table[value] = count 
        
        # If there are no values that match the target, return an empty list.
        return []

x = Solution()
print(x.twoSum([2, 9, 4, 6, 1], 3))
print(x.twoSum([-1, 3, -44, 3, 10], 6))
print(x.twoSum([3,2,4], 6))

