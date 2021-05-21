package LinkedListImplementation;


public class LinkedList {

    //Head of the LL
    Node head;

    //Method to reverse a LinkedList
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }



    //insert method for adding elements to the LL
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;

        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    //Method for inserting an element at the start
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
        }

    //Method for inserting an element at the certain position
    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            insertAtStart(data);
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    //Method for deleting an element at the certain position
    public void deleteAt(int index) {
        if (index == 0) {
            head = head.next;
        } else {
            Node n = head;
            Node n1 = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
    }

    //Method for printing the elements in the list
    public void show(Node node){
//            Node node = head;
        while(node!=null){
                System.out.println("Node Address, printing just for fun: "+node);
                System.out.println(node.data);
                node = node.next;
            }
        }
}
