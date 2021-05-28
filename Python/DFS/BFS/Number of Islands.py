# Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

# An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

# Example 1:

# Input: grid = [
#   ["1","1","1","1","0"],
#   ["1","1","0","1","0"],
#   ["1","1","0","0","0"],
#   ["0","0","0","0","0"]
# ]
# Output: 1

class Solution(object):
    def numIslands(self, grid):
        """
        :type grid: List[List[str]]
        :rtype: int
        """
        
#       Counts how many islands there are
        counter = 0
        
#       For each row in the grid
        for row in range(len(grid)):
        
#           For each column in the first element on the grid
            for col in range(len(grid[0])):
        
#               If the current element is 1
                if grid[row][col] == "1":
        
#                   Convert the current element to 0 so that we don't encounter the the element again
                    self.convertToZero(row, col, grid)
    
#                   Count the number of islands
                    counter += 1
        return counter
            
    def convertToZero(self, row, col, grid):
        
#       Checks the boundaries of the grid and the negative indicies
        if row < 0 or col < 0 or row >= len(grid) or col >= len(grid[0]) or grid[row][col] == "0":
            return 
        
#       Assign "1" to "0"
        grid[row][col] = "0"
        
#       Checks the top element
        self.convertToZero(row - 1, col, grid)
    
#       Checks the right element
        self.convertToZero(row, col - 1, grid)
    
#       Checks the bottom element
        self.convertToZero(row + 1, col, grid)
    
#       Checks the left element
        self.convertToZero(row, col + 1, grid)

print(Solution().numIslands([["1","1","0","0","0"], ["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]))