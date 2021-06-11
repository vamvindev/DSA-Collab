package HashMap;
/*
Created by Vamsi on 6/10/21 at 11:24 PM


Given nums = [2, 7, 11, 15], target = 9.

The output should be [0, 1].
Because nums[0] + nums[1] = 2 + 7 = 9.
*/

import java.util.HashMap;
import java.util.Map;

public class TwoSumsPrintIndexesHashMap {


    public static void main(String[] args) {

        int[] nums = new int[] {-2,-7,-4,-4,-6,11,15};
        int target = -8;

        Map<Integer, Integer> printIndexes = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(printIndexes.containsKey(complement)){
                System.out.println("The target is: " + target + ", numbers adding up to it are: " + complement + ", " + nums[i] +
                        ", their indexes are: " + printIndexes.get(complement) +", " + i);
            }else{
                printIndexes.put(nums[i], i);
            }
        }
    }
}

/*
Output
The target is: -8, numbers adding up to it are: -4, -4, their indexes are: 2, 3
The target is: -8, numbers adding up to it are: -2, -6, their indexes are: 0, 4
 */
