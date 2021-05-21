package LinkedListProblem;
import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.List;

/*
You are given two linked-lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. 
Add the two numbers and return it as a linked list.

Example:
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

Explanation: 342 + 465 = 807.
*/


class LinkedListReverseAddition{

    //head of the list
    Node head;

    //Linked List Node. This inner class is static so that main() can access it
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }//constructor
    }

    public void printList(){
        Node n = head;
        while ( n !=null){
            System.out.println(n.data+" ");
            n = n.next;
        }
    }


   //Method to create a SLL with three nodes
    public static void main(String[] args) {

        //Creating two LinkedLists
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        l1.head = new Node(1);
        Node l1Second = new Node(2);
        Node l1Third = new Node(3);

        //Link first node to the second node
        l1.head.next = l1Second;
        //Link second node to the third node
        l1Second.next = l1Third;

        //Adding integers to the linkedLists using add()
        l1.add(2);
        l1.add(4);
        l1.add(3);
        l2.add(5);
        l2.add(6);
        l2.add(4);

        //Printing out the list
        System.out.println("The list l1 has these elements: "+l1);
        System.out.println("The list l1 has these elements: "+l2);

    }
}