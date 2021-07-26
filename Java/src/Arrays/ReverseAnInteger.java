package Arrays;
/*
Created by Vamsi on 7/25/21 at 2:55 PM
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
Example 4:

Input: x = 0
Output: 0

*/

public class ReverseAnInteger {

    public static void main(String[] args) {

        int x = 12345;

        String revX = Integer.toString(x);

        System.out.println(revX.length());
        for(int i = revX.length()-1; i >=0; i--){
            int result = revX.charAt(i);
            System.out.println(result);
        }


    }


}
