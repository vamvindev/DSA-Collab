package Arrays;
/*
Created by Vamsi on 6/15/21 at 10:01 AM
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {

    public static  void main(String[] args) {
//        try
//        {
//            Float f1 = 3.0F;
//            int x = f1.intValue();
//            byte b = f1.byteValue();
//            double d = f1.doubleValue();
//            System.out.println(x+b+d);
//        }catch (NumberFormatException e){
//            System.out.println("bad number");


            List<Integer> arr = new ArrayList<>();
            int k = 1;
            arr.add(98);
            arr.add(1);
            arr.add(8);
            arr.add(12838);
            arr.add(123);
            Collections.sort(arr);
        System.out.println(arr);


            for(int i = arr.size(); i <= k; i--){
                System.out.println(arr.get(i));
            }

        }
}
