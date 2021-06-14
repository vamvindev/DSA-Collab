package HashMap;
/*
Created by Vamsi on 6/13/21 at 5:26 PM


Given an input string, write a function that returns the Run Length Encoded string for the input string.
For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6”
*/

import Trees.BinaryTreeInversion;

import java.util.HashMap;
import java.util.Map;

public class RunLengthEncoding{

    public static void main(String[] args) {

        String input = "wwwwaaadeACDSBBBxxxxxx";
        char[] inputC = input.toCharArray();

        Map<Character, Integer> inputData = new HashMap<>();

        for (char c : inputC) {
            if (inputC != null) {
                if (inputData.containsKey(c)) {
                    int counter = inputData.get(c);
                    counter++;
                    inputData.put(c, counter);
                } else
                    inputData.put(c, 1);
            }else System.out.println("Input is null");
        }
        System.out.println("Encoded Statement: "+inputData);
    }
}
//TODO : Incorrect output need to fix this
/*
Output 1 :
Encoded Statement: {a=5, d=1, e=1, w=3, x=10}

Output 2 :
Encoded Statement: {a=3, d=1, e=1, w=4, x=6}
Values are correct, but not in the expected order

Input 3: wwwwaaadeACDSBBBxxxxxx
Output 3 : {a=3, A=1, B=3, C=1, S=1, d=1, D=1, e=1, w=4, x=6}

Expected : w4a3d1e1x6
 */