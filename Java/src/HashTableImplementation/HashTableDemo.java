package HashTableImplementation;
/*
Created by Vamsi on 6/18/21 at 6:17 PM
*/

import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<String, Integer> customers = new Hashtable<>();

        customers.put("Hansel", 100);
        customers.put("Gretel", 200);
        customers.put("Micky", 300);
        customers.put("Mouse", 400);
        customers.put("Tom", 500);
        customers.put("Jerry", 600);
        customers.put("Popeye", 600);
        customers.put("Bluto", 600);
        customers.put("Olive", 600);
        customers.put("Luffy", 600);
        customers.put("Zoro", 600);
        customers.put("Sanji", 600);


            System.out.println(customers);


    }


}
