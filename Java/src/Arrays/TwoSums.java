package Arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class TwoSums {

    public static void main(String[] args) {

        int nums[] = new int[] {0, -1, 2, -3, 1};
        int numss[] = new int[] {2,5,3};
        int target = -2;
        int i,j;
        System.out.println("Unsorted Input Array: " +nums);
        Arrays.stream(nums).sorted();

//TODO : This fails for negative integers. Need to Fix it.
        //parsing through the array ascending order
        for(i=0; i < nums.length;i++) {
            System.out.println("Sorted Input Array: " +nums[i]);
//            System.out.println("Asc. --> The number is " + nums[i] + " and it's index is: " + i);
            //parsing through the array descending order
            for (j = i+1; j < nums.length; j++) {
//                System.out.println("Desc. --> The number is " + nums[j] + " and it's index is: " + j);
                if (nums[j] == target - nums[i]) {
                    System.out.println( "The target is: " + target + ", numbers summing the target are: " + nums[i] + ", " + nums[j] + ". Their indexes are:[" + i + "," + j + "]");
                }
            }
        }
//        System.out.println("The target is: " + target + ", unfortunately there are no combinations that add up to the target.");
    }
}

/*
Output

The target is: 6, numbers summing the target are: 2, 4. Their indexes are:[1,2]
 */