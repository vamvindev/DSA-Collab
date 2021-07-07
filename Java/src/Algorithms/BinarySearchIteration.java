package Algorithms;
/*
Created by Vamsi on 6/22/21 at 8:48 PM
*/

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BinarySearchIteration {

    public static void main(String[] args) {

        List<Integer> inputList = new ArrayList<>();
        int l;
        int h;
        int mid;
        int key;

        for(int i = 0; i < inputList.size(); i++){
            l = 0;
            h = inputList.size();

            while(l <= h){

                if(l == h){
                    System.out.println(+l);
                }else{
                    mid = (l+h)/2;
//                    if(key[i] == mid){
//                        System.out.println(mid);
//                    }else if(mid > l) {
//                        l = mid+1;
//                    }
                }



            }


        }




    }



}
