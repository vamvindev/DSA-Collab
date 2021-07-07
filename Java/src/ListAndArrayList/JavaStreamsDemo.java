package ListAndArrayList;
/*
Created by Vamsi on 6/25/21 at 9:25 AM
*/

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class JavaStreamsDemo {

    public static void main(String[] args) {


        List<String> houseThings = new ArrayList<>();

        houseThings.add("Chair");
        houseThings.add("Table");
        houseThings.add("Desk");
        houseThings.add("Lamp");

        for(int i = 0; i <houseThings.size(); i++){
            System.out.println("Printing from a for loop: " +houseThings.get(i));
        }
        System.out.println("--------------------------------");

        for (String houseThing : houseThings
             ) {
            System.out.println("Printing from for each loop: " +houseThing);
        }
        System.out.println("--------------------------------");

        Stream<String> listStream = houseThings.stream();

        listStream.forEach((String element ) -> {
            System.out.println("Printing from Stream: " +element);
        }
        );

        System.out.println("--------------------------------");


//        listStream.forEach(System.out::print);
//        System.out.print(" ");
//        listStream.parallelStream().forEach(System.out::print);



    }



}
