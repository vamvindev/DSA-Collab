package HashMap;
/*
Created by Vamsi on 6/13/21 at 5:26 PM


Given an input string, write a function that returns the Run Length Encoded string for the input string.
For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6”
*/

import Trees.BinaryTreeInversion;

import java.util.HashMap;
import java.util.Map;

public class RunLengthEncoding {

    public static void main(String[] args) {

        String input = "wwwwaaadexxxxxx";
        char[] inputC = input.toCharArray();
        int counter = 0;

        Map<Character, Integer> inputData = new HashMap<>();

        for (char c : inputC) {
            if (input != null) {
                if (inputData.containsKey(c)) {
                    counter++;
                    inputData.put(c, counter);
                } else
                    inputData.put(c, 1);
            }
        }
        System.out.println("Encoded Statement: "+inputData);
    }
}
//TODO : Incorrect output need to fix this
/*
Output 1 :
Encoded Statement: {a=5, d=1, e=1, w=3, x=10}

Expected : w4a3d1e1x6
 */