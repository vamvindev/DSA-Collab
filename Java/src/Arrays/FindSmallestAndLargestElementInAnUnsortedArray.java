package Arrays;
/*
Created by Vamsi on 7/19/21 at 11:56 PM
*/

import java.util.Arrays;

public class FindSmallestAndLargestElementInAnUnsortedArray {

    public static void smallestAndLargest(int[] arr, int arrSize){

        Arrays.sort(arr);

        System.out.println("Smallest is: "+arr[0]);
        System.out.println("Larget is: "+arr[arrSize-1]);

        return;
    }



    public static void main(String[] args) {
        int[] input = new int[] {3,21,4,0,11,24,98,37,8};
        int n = input.length;
        smallestAndLargest(input,n);
    }


}
