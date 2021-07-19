package Arrays;

// Java program to find second largest
// element in an array
import org.w3c.dom.ls.LSOutput;

import java.util.*;
/*
Created by Vamsi on 7/14/21 at 2:46 PM
*/

public class SecondLargestElement {

// Function to print the
// second largest elements

        static void print2largest(int arr[],
                                  int arr_size)
        {
            int i, first, second;

            // There should be
            // atleast two elements
            if (arr_size < 2)
            {
                System.out.printf(" Invalid Input ");
                return;
            }

            // Sort the array
            Arrays.sort(arr);

            System.out.println("Sorted array: "+arr);
//             Start from second last element
//             as the largest element is at last
            for (i = arr_size - 2; i >= 0; i--)
            {
                // If the element is not
                // equal to largest element
                if (arr[i] != arr[arr_size - 1])
                {
                    System.out.printf("The second largest " +
                            "element is %d\n", arr[i]);
                    return;
                }
            }

            System.out.printf("There is no second " +
                    "largest element\n");
            System.out.println(arr_size);
            System.out.println(arr[arr_size-2]);
        }

        // Driver code
        public static void main(String[] args)
        {
            int arr[] = {12, 35, 1, 10, 34, 35};
            int n = arr.length;
            print2largest(arr, n);
        }
}
