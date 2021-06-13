package Arrays;
/*
Created by Vamsi on 6/12/21 at 1:11 PM

Given an array of integers, find the sum of its elements.

For example, if the array 1,2,3 so return  6, because 1+2+3.

Function Description

Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.

simpleArraySum has the following parameter(s):

ar: an array of integers
Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers representing the array's elements.

Constraints
0<n ; ar[i] <=1000
Output Format

Print the sum of the array's elements as a single integer.

Sample Input

6
1 2 3 4 10 11
Sample Output

31
Explanation

We print the sum of the array's elements: .

*/

public class SimpleArraySum {

    public static void main(String[] args) {

        int[] ar = new int[] {1,2,3,4,10,11};
        int arSum = 0;
        for (int i = 0; i < ar.length; i++){
                 arSum += ar[i];
            }System.out.println("Total sum is: " +arSum);
        }
    }


    //Output : Total sum is: 31