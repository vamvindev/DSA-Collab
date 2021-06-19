package Heaps;
/*
Created by Vamsi on 6/18/21 at 9:41 PM
*/

import java.util.*;

public class HeapDemo {

    public static void main(String[] args) {

        int[] arr = new int[]{8, 100, 98, 10, 2, 15, 45, 25, 76, 3, 9, 1, 63};
        int k = 3;

        PriorityQueue<Integer> heapDemo = new PriorityQueue<>();

        //Iterating through the array to add it to the heap
        for (int ar : arr) {
            heapDemo.add(ar);
            System.out.println("Added the element : "+ ar + " to PQ, Now the PQ is: "+heapDemo);
        }
        System.out.println("After adding all the elements to the PQ : "+heapDemo);
        System.out.println("Size of the PQ : "+heapDemo.size());
        System.out.println("Checking if PQ is empty using pq.isEmpty() : "+heapDemo.isEmpty());
        System.out.println("Using PQ.Peek() to find the Root of PQ : " +heapDemo.peek());
        System.out.println("What does PQ.poll() do? :" +heapDemo.poll());
        System.out.println("PQ after polling : " +heapDemo);

        //Removing elements from the heap
            while(!heapDemo.isEmpty())
            {
                System.out.println("Removing Elements :" +heapDemo.remove()+" ");
            }
        System.out.println("After removing the elements, the size of PQ is : "+heapDemo.size()+
                " And is the PQ empty?: "+heapDemo.isEmpty()+ ", What does the PQ has now? :" +heapDemo);
    }
}

/*
Output
Added the element : 8 to PQ, Now the PQ is: [8]
Added the element : 100 to PQ, Now the PQ is: [8, 100]
Added the element : 98 to PQ, Now the PQ is: [8, 100, 98]
Added the element : 10 to PQ, Now the PQ is: [8, 10, 98, 100]
Added the element : 2 to PQ, Now the PQ is: [2, 8, 98, 100, 10]
Added the element : 15 to PQ, Now the PQ is: [2, 8, 15, 100, 10, 98]
Added the element : 45 to PQ, Now the PQ is: [2, 8, 15, 100, 10, 98, 45]
Added the element : 25 to PQ, Now the PQ is: [2, 8, 15, 25, 10, 98, 45, 100]
Added the element : 76 to PQ, Now the PQ is: [2, 8, 15, 25, 10, 98, 45, 100, 76]
Added the element : 3 to PQ, Now the PQ is: [2, 3, 15, 25, 8, 98, 45, 100, 76, 10]
Added the element : 9 to PQ, Now the PQ is: [2, 3, 15, 25, 8, 98, 45, 100, 76, 10, 9]
Added the element : 1 to PQ, Now the PQ is: [1, 3, 2, 25, 8, 15, 45, 100, 76, 10, 9, 98]
Added the element : 63 to PQ, Now the PQ is: [1, 3, 2, 25, 8, 15, 45, 100, 76, 10, 9, 98, 63]
After adding all the elements to the PQ : [1, 3, 2, 25, 8, 15, 45, 100, 76, 10, 9, 98, 63]
Size of the PQ : 13
Checking if PQ is empty using pq.isEmpty() : false
Using PQ.Peek() to find the Root of PQ : 1
What does PQ.poll() do? :1
PQ after polling : [2, 3, 15, 25, 8, 63, 45, 100, 76, 10, 9, 98]
Removing Elements :2
Removing Elements :3
Removing Elements :8
Removing Elements :9
Removing Elements :10
Removing Elements :15
Removing Elements :25
Removing Elements :45
Removing Elements :63
Removing Elements :76
Removing Elements :98
Removing Elements :100
After removing the elements, the size of PQ is : 0 And is the PQ empty?: true, What does the PQ has now? :[]
 */