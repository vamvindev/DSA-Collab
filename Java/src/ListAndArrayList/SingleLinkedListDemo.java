package ListAndArrayList;
/*
Created by Vamsi on 7/22/21 at 11:10 PM
*/

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class SingleLinkedListDemo {

    public static void main(String[] args) {

        List<Integer> lList = new LinkedList<>();

        lList.add(10);
        lList.add(20);
        lList.add(30);
        lList.add(40);

        System.out.println(lList.size());

        for(int i = lList.size()-1; i>=0 ;i--){
            System.out.println(lList.get(i));
        }
    }






}
