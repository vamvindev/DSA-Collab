# Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
# An input string is valid if:
# - Open brackets are closed by the same type of brackets.
# - Open brackets are closed in the correct order.
# - Note that an empty string is also considered valid.

# Example:
# Input: "((()))"
# Output: True

# Input: "[()]{}"
# Output: True

# Input: "({[)]"
# Output: False

class Solution:
  def isValid(self, s):
    check_paren = []
    right_paren = [")", "}", "]"]
    left_paren = ["(", "{", "["]

    for paren in s:
        # If there's a right parenthesis, then add it to check_paren
        if paren in left_paren:
            check_paren.append(paren)
        
        # If there's a left parenthesis and check_paren is not empty, then remove last element from check_paren
        elif paren in right_paren and len(check_paren) != 0:
            last_element = check_paren[-1]
            check_paren.remove(last_element)
    
    # If check_paren is not empty, return false
    if len(check_paren) != 0:
        return False
    
    # If check_paren is empty, return true
    else:
        return True
   
# Test Program
s = "()(){(())" 
# should return False
print(Solution().isValid(s))

s = ""
# should return True
print(Solution().isValid(s))

s = "([{}])()"
# should return True
print(Solution().isValid(s))