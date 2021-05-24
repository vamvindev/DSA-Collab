# Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

# Example 1:

# Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
# Output: 6
# Explanation: [4,-1,2,1] has the largest sum = 6.

# Example 2:

# Input: nums = [1]
# Output: 1

# Example 3:

# Input: nums = [5,4,-1,7,8]
# Output: 23

class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
#       Start at index 1 so that we can compare the previous element as we iterate through the array
        for x in range(1, len(nums)):
        
#           If the previous element is positive
            if nums[x - 1] > 0:
        
#               Add the current element with the previous element
                nums[x] += nums[x - 1]
    
#       Return the max sum
        return max(nums)

x = Solution()
print(x.maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))
print(x.maxSubArray([1]))
print(x.maxSubArray([5,4,-1,7,8]))