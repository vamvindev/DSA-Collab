package LinkedListImplementation;


public class Runner {

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();

        //inserting the elements using insert method
        l1.insert(18);
        l1.insert(0);
        l1.insert(-23);
        l1.insert(-43);


        //inserting element at the start of the list
        l1.insertAtStart(-100);

        //inserting elements at a certain index
        l1.insertAt(0,53);
        l1.insertAt(3,143);

        //printing the list
        l1.show(l1.head);

        //Deleting the element
        System.out.println("-------Printing the list after deletion------");
        l1.deleteAt(3);
        l1.show(l1.head);

        System.out.println("Given Linked list");
        l1.show(l1.head);
    }
}
