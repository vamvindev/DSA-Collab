package ListAndArrayList;
/*
Created by Vamsi on 6/12/21 at 11:44 PM
*/

import java.util.*;

public class MinAndMaxSums {



    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<Integer>();
        arr.add(4);
        arr.add(1);
        arr.add(3);
        arr.add(23);
        arr.add(32);
        //total sum = 63


        Collections.sort(arr);

        long counterMinSum = 0;
        long counterMaxSum = 0;
        for(int i = 0; i < arr.size()-1 ; i ++){
            counterMinSum += arr.get(i);
        }
        System.out.println("Min Sum : " + counterMinSum);
        for(int i = arr.size()-1; i > arr.size()-2 ; i --){
            counterMaxSum += arr.get(i);
        }
        System.out.println("Max Sum : " + counterMaxSum);
    }

}
