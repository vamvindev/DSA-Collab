package HashTableImplementation;
/*
Created by Vamsi on 7/25/21 at 7:03 AM

Given a string s, find the length of the longest substring without repeating characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Example 4:

Input: s = ""
Output: 0

*/

import java.util.HashSet;
public class LengthOfLongestSubstring {


    public static int lengthOfUniqueSubstring(String s){

        //error handling for empty inputs
        if( s==null || s.length() == 0){
            System.out.println("Empty Input maan!!");
        }


        //Initiating a Hashset to store the values in the string for future reference
        HashSet<Character> dataSet = new HashSet<>();

        //initiating variables
        int max = 1, left = 0 ;

        //running an outer for loop so that the right pointer traverses through the string until it finds a repeating character
        for(int right = 0; right < s.length(); right++){
            //checking each character in the given string
            char c = s.charAt(right);
            //if the character is in the dataset, we increment the left pointer to remove the character from the set
            while (dataSet.contains(c))
                dataSet.remove(s.charAt(left++));
            dataSet.add(c);
            System.out.println(dataSet);
            //Checking if the subarray is the max length
            max = Math.max(right - left+1, max);
            System.out.println("Length of the string is: "+s.length());
            System.out.println("Max length of the string without repeating characters is: "+max);
        }
 return max;
}


    public static void main(String[] args) {

        String input = "pwwkew";
        lengthOfUniqueSubstring(input);

    }




}
