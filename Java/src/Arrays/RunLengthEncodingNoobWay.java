package Arrays;
/*
Created by Vamsi on 6/13/21 at 6:03 PM


Given an input string, write a function that returns the Run Length Encoded string for the input string.
For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6”
*/

public class RunLengthEncodingNoobWay {

    public static void main(String[] args) {

        String input = "wwwwaaadexxxxxxwww";
        char[] inputC = input.toCharArray();


        for(int i = 0; i < input.length(); i++){
            int counter = 1;
            while(i < input.length()-1 && inputC[i] == inputC[i+1])
            {
            counter++;
            i++;
            }
            System.out.print(inputC[i]+""+counter);
        }

    }
}

//Output : w4a3d1e1x6
//Running one for loop through the array so Time Complexity = O(n) and Space Complexity is O(1) as everything's in place