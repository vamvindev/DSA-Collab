/*
You are given two linked-lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

Explanation: 342 + 465 = 807.
*/


import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListReverseAddition{

    public static void main(String[] args) {

        //Starting with two empty LinkedLists
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        //Adding integers to the linkedLists using add()
        l1.add(2);
        l1.add(4);
        l1.add(3);
        l2.add(5);
        l2.add(6);
        l2.add(4);

        //Traversing through LLs different approaches

        System.out.println("+++++++Iterative approach++++++");
        for(int i = 0; i<l1.size();i++){
            System.out.println(l1.get(i));
        }System.out.println("-----");
        for(int j = 0; j<l2.size();j++){
            System.out.println(l2.get(j));
        }

        System.out.println("+++++++ListIterator approach++++++");
        ListIterator listIterator = l1.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("-----");
        ListIterator listIterator2 = l2.listIterator();
        while (listIterator2.hasNext()){
            System.out.println(listIterator2.next());
        }

        System.out.println("+++++++Java 8 for each approach++++++");
        l1.forEach(System.out::println);
        System.out.println("-----");
        l2.forEach(System.out::println);

        //Reverse traversing

    }
}