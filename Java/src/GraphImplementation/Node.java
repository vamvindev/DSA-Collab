package GraphImplementation;

import java.util.ArrayList;

public class Node<T> {

//    public static void main(String[] args) {
//        Node<String> x = new Node("Hello", null);
//        Node<String> y = new Node(" Graph", x);
//        System.out.println(x.getData()+y.getData());
//
//    }

    private T data;
    private ArrayList<Node> neighbors;

   public Node(T d, Node nx){
       data = d;
       neighbors = new ArrayList<Node>();
   }

   public T getData() { return  data; }

   public void setData(T d) { data = d; }

}

