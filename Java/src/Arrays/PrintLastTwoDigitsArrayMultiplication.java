package Arrays;
/*
Created by Vamsi on 7/27/21 at 8:39 AM
*/

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PrintLastTwoDigitsArrayMultiplication {
    public static void main(String[] args) {

        List<Integer> ary = new ArrayList<>();
        ary.add(1);
        ary.add(2);
        ary.add(1);
        ary.add(1);
        //Product = 1*2*3*4 =24
        int tempresult = 1;

        if (ary.size() == 0)
            System.out.println("Empty input");
        else {
            for (int j = 0; j < ary.size(); j++) {
                tempresult *= ary.get(j);
            }
            int result = tempresult % 100;
            if (result < 10) {
                System.out.println("0" + result);
            } else
                System.out.println("Final Rsult: " + result);
        }
    }
}




