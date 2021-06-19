package Stacks;/*
Created by Vamsi on 5/26/21 at 10:56 AM
*/

/*
Implement a class for a stack that supports all the regular functions (push, pop) and an additional function of max()
which returns the maximum element in the stack (return None if the stack is empty). Each method should run in constant time.
class MaxStack:
  def __init__(self):
    # Fill this in.

  def push(self, val):
    # Fill this in.

  def pop(self):
    # Fill this in.

  def max(self):
    # Fill this in.

s = MaxStack()
s.push(1)
s.push(2)
s.push(3)
s.push(2)
print s.max()
# 3
s.pop()
s.pop()
print s.max()
# 2
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class StackMaxElement {

    static int maxElement(int[] input) {

        Stack<Integer> s = new Stack<>();


        for(int i = 0; i < input.length; i++){

            s.push(input[i]);

        }

        int x = s.peek();
        StackMaxElement maxx = new StackMaxElement();




        return x;
    }



    public static void main(String[] args) {

        int[] input = new int[] {1,2,3,2};

        System.out.println("The elements are: " +maxElement(input));



    }





}
