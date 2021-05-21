import java.util.LinkedList;

public class TwoSums {

    public static void main(String[] args) {

        int[] nums = new int[] {3,2,4};
        int target = 6;
        int i,j;

        //parsing through the array ascending order
        for(i=0; i < nums.length;i++) {
//            System.out.println("Asc. --> The number is " + nums[i] + " and it's index is: " + i);
            //parsing through the array descending order
            for (j = i+1; j < nums.length; j++) {
//                System.out.println("Desc. --> The number is " + nums[j] + " and it's index is: " + j);
                if (nums[j] == target - nums[i]) {
                    System.out.println( "The target is: " + target + ", numbers summing the target are: " + nums[i] + ", " + nums[j] + ". Their indexes are:[" + i + "," + j + "]");
                }
            }
        }
    }
}
