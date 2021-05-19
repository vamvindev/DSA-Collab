public class TwoSums {

    public static void main(String[] args) {

        int[] nums = new int[] {2,7,11,15};
        int target = 9;
        int i,j;

        //parsing through the array ascending order
        for(i=0; i < nums.length;i++) {
            System.out.println("Asc. --> The number is " + nums[i] + " and it's index is: " + i);
            //parsing through the array descending order
            for (j = nums.length - 1; j >= 0; j--) {
                System.out.println("Desc. --> The number is " + nums[j] + " and it's index is: " + j);
                if (nums[i] + nums[j] == target) {
                    System.out.println("The target is: " + target + ", numbers summing the target are: " + nums[i] + ", " + nums[j] + ". Their indexes are:[" + i + "," + j + "]");
                    return; //if condition satisfies kill the loop
                }
            }
        }
    }
}
