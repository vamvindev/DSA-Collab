# Given an array nums of size n, return the majority element.
# The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

# Example 1:
# Input: nums = [3,2,3]
# Output: 3

# Example 2:
# Input: nums = [2,2,1,1,1,2,2]
# Output: 2

class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # First, sort the elements
        nums.sort()

        # Since the majority element appears n // 2 times, this means that doing this calculation 
        # would get the index of the majority element.
        return nums[len(nums) // 2]



#         [2, 2, 1, 1, 1, 2, 2]
#         [1, 1, 1, 2, 2, 2, 2] = 2

#         [1, 1, 1, 0, 0, 1]
#         [0, 0, 1, 1, 1, 1] = 1


x = Solution()
print(x.majorityElement([3,2,3]))
print(x.majorityElement([2,2,1,1,1,2,2]))
