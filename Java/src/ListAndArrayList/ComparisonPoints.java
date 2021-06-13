package ListAndArrayList;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
/*
Created by Vamsi on 6/12/21 at 1:46 PM
*/

public class ComparisonPoints {


    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static void main(String[] args){

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> compPoints = new ArrayList<>();
        //Adding integers to the list
        a.add(1);
        a.add(2);
        a.add(3);

        b.add(2);
        b.add(2);
        b.add(4);
        //Expected : [1,1]

        //Initialized counters to 0
        int aPoints = 0;
        int bPoints = 0;
        //iteration entire array list
        for (int i = 0; i < a.size(); i++) {
            int alicePoints = a.get(i);
            int bobPoints = b.get(i);
            //Enter the condition only if both the points are not equal
            if(alicePoints != bobPoints)
            {
                //if a>b then give a point to a, else to b
                int temp = alicePoints > bobPoints ? aPoints++ : bPoints++;
            }
            //adding incremented points to arraylist
            compPoints.add(aPoints);
            compPoints.add(bPoints);
            //printing out the list
            System.out.println(compPoints);
        }
    }
}
/*
Output
[0, 1]
[0, 1, 0, 1]
[0, 1, 0, 1, 0, 2]

For some reason HackerRank accepted this solution
 */