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
//I'm using this geeks for geeks solution as it requires me to print the Arraylist
//https://practice.geeksforgeeks.org/problems/k-largest-elements3736/1#

    public static void main(String[] args) {

            int[] arr = new int[]{23, 456, 2, 456, 2};
            int n = 4; //Size of the array
            int k = 2; // number of largest numbers to be printed



        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();
        for( int i = 0; i < n; i++){
            //Checking if the size of the heap is equal to K
            if(minHeap.size() == k){
                //if top element is smaller than arr[i], we pop the front
                //element from priority queue and push arr[i] in priority queue.
                if(minHeap.peek() < arr[i])
                {
                    minHeap.poll();
                    minHeap.add(arr[i]);
                }//else we just push arr[i] in priority queue.
                else
                {
                    minHeap.add(arr[i]);
                }
            }
            //while priority queue is not empty, we keep storing the top element
            //in list and keep popping it from the priority queue.
            while(!minHeap.isEmpty()){
                list.add(minHeap.peek());
                System.out.println(list.size());
                minHeap.poll();
            }
            Collections.reverse(list);

        }




    }
}
