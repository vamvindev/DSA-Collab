package Sets;
/*
Created by Vamsi on 6/10/21 at 10:54 PM

Input: arr[] = {0, -1, 2, -3, 1}
        sum = -2
Output: -3, 1
If we calculate the sum of the output,
1 + (-3) = -2

Input: arr[] = {1, -2, 1, 0, 5}
       sum = 0
Output: -1
No valid pair exists.

*/

import java.util.HashSet;

public class TwoSumsUsingHashSet {
    static void printPairs(int A[], int sum){

        HashSet<Integer> input = new HashSet<Integer>();
        for(int i = 0; i < A.length; i++){
            int temp = sum - A[i];
            if(input.contains(temp)){
                System.out.println("The Target is: " + sum + "" +
                        ", the numbers adding upto it are: " + temp +", " + A[i]);
            }
            input.add(A[i]);
        }
    }

    public static void main(String[] args) {
        int A[] = { 1, 4, 4, -2, 45, -6, -10, 8 };
        int n = 2;
        printPairs(A, n);
    }

}

/*
Output
The Target is: 2, the numbers adding upto it are: 4, -2
The Target is: 2, the numbers adding upto it are: -6, 8
 */
