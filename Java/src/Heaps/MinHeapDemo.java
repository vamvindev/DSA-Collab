package Heaps;
/*
Created by Vamsi on 6/18/21 at 8:41 PM
Given an array of N positive integers, print k largest elements from the array.

Example 1:

Input:
N = 5, k = 2
arr[] = {12,5,787,1,23}
Output: 787 23
Explanation: First largest element in
the array is 787 and the second largest
is 23.
Example 2:

Input:
N = 7, k = 3
arr[] = {1,23,12,9,30,2,50}
Output: 50 30 23
Explanation: Three Largest element in
the array are 50, 30 and 23.
Your Task:
Complete the function kLargest() that takes the array, N and K as input parameters and returns a list of k largest element in descending order.

Expected Time Complexity: O(N log K)
Expected Auxiliary Space: O(K)

Constraints:
1 ≤ N ≤ 104
K ≤ N
1 ≤ array[i] ≤ 105

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MinHeapDemo {

// I'll use a Priority Queue(PQ) which is by default a Min Heap
// After adding elements to the PQ, I'll make sure that the height is not exceeded K
// If the height is exceeded, I'll removed the elements, so the final remaining elements are the largest

    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        int arr[] = {1,23,12,9,30,2,50};
        int k = 3;
        //Expected output : 50, 30, 23

        for( int ar : arr){
            minHeap.add(ar);
            if(minHeap.size() > k ){
                minHeap.remove();
            }



            Object[] heapList = minHeap.toArray();
            for(Object h : heapList){
                System.out.println(heapList[(int) h]);
            }

        }


    }
}
