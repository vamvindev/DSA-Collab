# Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

# You must write an algorithm with O(log n) runtime complexity.

# Example 1:
# Input: nums = [1,3,5,6], target = 5
# Output: 2

# Example 2:
# Input: nums = [1,3,5,6], target = 2
# Output: 1

# Example 5:
# Input: nums = [1], target = 0
# Output: 0


class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """

        # My work 

        # For each element in the array
        for x in range(len(nums) - 1):
            # If the element in the array = target
            if nums[x] == target:
                # return the index of the element
                return nums.index(nums[x])
            # If the target is within the current element and the element next to the current elemnt
            elif nums[-1] < target:
                return nums.index(nums[-1]) + 1
            
        # LeetCode Solution (Binary Search)
        # low, high = 0, len(nums) - 1 

        # while low <= high:
        #     mid = (low + high) // 2

        #     if nums[mid] == target:
        #         return mid 
            
        #     elif nums[mid] < target:
        #         low = mid + 1

        #     else:
        #         high = mid - 1 
        # return low

x = Solution()
# print(x.searchInsert([1, 3, 5, 6], 5))
# print(x.searchInsert([1, 3, 5, 6], 2))
print(x.searchInsert([1, 3, 5, 6], 7))
# print(x.searchInsert([1, 3 , 5, 6], 0))
print(x.searchInsert([1], 0))