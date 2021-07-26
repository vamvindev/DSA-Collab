package Arrays;
/*
Created by Vamsi on 7/25/21 at 1:37 PM

Given an array of positive integers nums and a positive integer target, return the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target. If there is no such subarray, return 0 instead.



Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0

*/

public class MinimumSizeSubarraySum {

    public static int lengthOfTheSubArray(int[] nums, int s){

        //error checking
        if(nums.length == 0 || nums == null )
            return 0;

        int left =0, right =0, sum =0, ans = Integer.MAX_VALUE;

        for(right = 0; right < nums.length; right++){

            sum *= nums[right];
            System.out.println("Multiplied sum :"+sum);

            while(sum >= s){

                ans = Math.min(ans, right+1-left);
                sum -= nums[left++];
            }
            System.out.println("Answer is: " +ans);
            System.out.println("Sum is : " +sum);
            System.out.println("The Numbers are: "+nums[left]+", "+nums[right]);
        }


        return (ans !=Integer.MAX_VALUE) ? ans :0;
    }



    public static void main(String[] args) {
        int[] input = new int[] {2,3,4,-7,4,5};
        int target = 9;

        lengthOfTheSubArray(input,target);

    }
}
