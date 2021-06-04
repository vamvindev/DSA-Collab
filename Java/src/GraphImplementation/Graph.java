//package GraphImplementation;
//
//import java.security.AllPermission;
//import java.util.ArrayList;
//import java.util.Stack;
//
//
//// Requires the Node class with generics and arbitrary number of connections
//// (that's the third one in Node.java)
//
//public class Graph {
//        public static void main(String[] args) {
//            Node<String> A = new Node<String>("A");
//            Node<String> B = new Node<String>("B");
//            Node<String> C = new Node<String>("C");
//            Node<String> D = new Node<String>("D");
//            Node<String> E = new Node<String>("E");
//            Node<String> F = new Node<String>("F");
//
//            A.setNeighbors(new Node[] {B,C,D});
//            B.setNeighbors(new Node[] {A,F});
//            C.setNeighbors(new Node[] {A,D,E});
//            D.setNeighbors(new Node[] {A,C,F});
//            E.setNeighbors(new Node[] {C});
//            F.setNeighbors(new Node[] {B,D});
//
//            DFS(B);
//            DFS(D);
//        }
//
//        public static void DFS(Node start) {
//            ArrayList<Node> visited = new ArrayList<Node>();
//            Stack<Node> stack = new Stack<Node>();
//            stack.push(start);
//
//            while (!stack.empty()) {
//                Node current = stack.pop();
//                if (!visited.contains(current)) {
//                    System.out.print(current.getData() + ", ");
//                    visited.add(current);
//                    Node[] neighbors = current.getNeighbors();
//                    for (int i=neighbors.length-1; i>=0; i--) {
//                        stack.push( neighbors[i] );
//                    }
//                }
//            }
//
//            System.out.println("");
//        }
//    }
//}
