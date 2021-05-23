/*Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
        Example 1:
        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        Output: 6
        Explanation: [4,-1,2,1] has the largest sum = 6.

        Example 2:
        Input: nums = [1]
        Output: 1

        Example 3:
        Input: nums = [5,4,-1,7,8]
        Output: 23
*/


public class MaxSubArray {

    public static void main(String[] args) {

        int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        int sum;
        int maximum = nums[0];

        if (nums.length == 1) {
            System.out.println("Max is: " + nums[0]);
        } else {
            //parsing through the array
            for (int i = 0; i < nums.length; i++) {
//                System.out.println("Current Input: " + nums[i]);
                sum = 0;
                for (int j = i; j < nums.length; j++) {
//                    System.out.println("sum value is : " + sum + ", input being added to sum is: " + nums[j]+" initial max value is: "+maximum);
                    sum = sum + nums[j];
//                    System.out.println("The sum value in the loop is: " + sum);
                    maximum = Math.max(maximum, sum);
//                    System.out.println("The maximum value in the loop is: " + maximum);
                }
            }
            System.out.println(">>>>>>>>>>>>>>>>>>The final maximum value is "+ maximum+"<<<<<<<<<<<<<<<<<<<<<<<<<<");
        }
    }
}
