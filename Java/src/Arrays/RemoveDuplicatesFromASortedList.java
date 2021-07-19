package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Created by Vamsi on 7/19/21 at 6:28 PM
*/
/*
# Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

        # Example 1
        # Input: head = [1,1,2]
        # Output: [1,2]

        # Example 2
        # Input: head = [1,1,2,3,3]
        # Output: [1,2,3]
*/
public class RemoveDuplicatesFromASortedList {


    public static void removeDupes(int[] input) {

        Set<Integer> result = new HashSet<>();

        for (int i = 0; i < input.length; i++) {
            result.add(input[i]);
        }

        System.out.println("By using hashset" + result);

        List<Integer> newList = new ArrayList<>();

        for (int i : input
             ) {
            if(!newList.equals(input[i])){
                newList.add(input[i]);
            }
            System.out.println("Array List" +newList);
        }




    }


    public static void main(String[] args) {

        int[] testInput = new int[] {1,4,2,2,3,4,5,6,5};
        removeDupes(testInput);
    }


}
