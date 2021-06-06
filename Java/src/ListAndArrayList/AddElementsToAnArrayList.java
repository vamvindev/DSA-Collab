package ListAndArrayList;/*
Created by Vamsi on 6/6/21 at 12:23 AM
*/

import java.util.*;

public class AddElementsToAnArrayList {

    public static void main(String[] args) {

        List<String> animals= new ArrayList<>();
        int index = animals.indexOf("Giraffe");


//        String searchItem = animals.get(indexx);

        animals.add("Lion");
        animals.add("Giraffe");
        animals.add("Monkey");
        animals.add("Elephant");
        animals.add("Zebra");


        System.out.println("Is the animals List Empty? " + animals.isEmpty());
        System.out.println("Animals List size ist " + animals.size());
        System.out.println("List has these values : " + animals);
        System.out.println("Get 2nd item : " + animals.get(1));


        System.out.println("Removing item 2: " + animals.remove(1));
        System.out.println("index of Giraffe is : " + index + " Because it's removed hehe");


        //order of operations matter. If this below boolean and int are declared before adding items, the element is never present
        int index2 = animals.indexOf("Lion");
        boolean doesAnimalExists = animals.contains("Lion");
        System.out.println("Is Lion in the list? : " + doesAnimalExists);
        System.out.println("index of Lion is : " + index2 );
        String searchItem = animals.get(index2);
        System.out.println("The element at index 1 is : " + searchItem);

        //List Iterator
        ListIterator<String> animalsListIterator  = animals.listIterator();
        while (animalsListIterator.hasNext()){
            String currItem = animalsListIterator.next();
            System.out.println("currItem is : " + currItem);
            if (currItem == "Elephant" ) {
                System.out.println("Yea it does have Elephant, and it's index is: " + animals.indexOf("Elephant"));
                animalsListIterator.remove();
                System.out.println("Removed this " +currItem+ " from the list");
            }
        }
        //Printing the list from end to Beginning

        while(animalsListIterator.hasPrevious()){
            String currItemPrev = animalsListIterator.previous();
            System.out.println("Printing list backwards: " + currItemPrev);
        }
        System.out.println("Size of the animals list after removal : + " + animals.size() + " List has these values : " + animals);
        animals.clear();
        System.out.println("Size of the animals list after clearing : + " + animals.size() + " List has these values : " + animals);
        System.out.println("Animals List hashCode " + animals.hashCode());


        //Just an Array list
        List<Integer> primeNumbers = new ArrayList<Integer>();

        primeNumbers.add(2);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(11);

        int primeNumberIndex = primeNumbers.indexOf(5);
        boolean doesPrimeExists = primeNumbers.contains(3);
        System.out.println("Is 3 ins the list? : " + doesPrimeExists);
        System.out.println("Index ot 3 is : " + primeNumberIndex);
        System.out.println("Prime Numbers List : " + primeNumbers);
    }



}
