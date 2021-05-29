class MinStack(object):

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.min = []
        self.array = []
        

    def push(self, val):
        """
        :type val: int
        :rtype: None
        """
        # If the length of array stack is 0, add the element to both of the array and min stack.
        if len(self.array) == 0:
            self.min.append(val)
        
        # Compare the last element of the array and the given value.
        # Add the minimum value to the min stack.
        # Add the element to the array stack.
        else:
            self.min.append(min(self.min[-1], val))
        self.array.append(val)
      
    def pop(self):
        """
        :rtype: None
        """
        # Remove the last element of min and array stack.
        self.min.pop()
        self.array.pop()
    
    def top(self):
        """
        :rtype: int
        """
        # Return the value of the last element of array stack
        return self.array[-1]
      
    def getMin(self):
        """
        :rtype: int
        """
        # Return the value of the element element of min stack
        return self.min[-1]

    
x = MinStack()
x.push(-2)
x.push(0)
x.push(-3)
print(x.getMin())
x.pop()
print(x.top())
print(x.getMin())        
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()