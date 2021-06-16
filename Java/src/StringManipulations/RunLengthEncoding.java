package StringManipulations;
/*
Created by Vamsi on 6/15/21 at 11:41 PM



Given an input string, write a function that returns the Run Length Encoded string for the input string.
For example, if the input string is “wwwwaaadexxxxxx”, then the function should return “w4a3d1e1x6”
*/

public class RunLengthEncoding {


    public static void main(String[] args) {


        String input = "aaabbbcccdeaaccdedd";
        //checking if string is empty
        if (input.isEmpty()) {
            System.out.println("Empty");
        }

        char[] inputChars = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length() ; i++)
        {
            int counter = 1;
            while (i < input.length()-1 && inputChars[i] == inputChars[i + 1])
            {
                counter++;
                i++;
            }
            sb.append(counter).append(inputChars[i]);
            String output = sb.toString();
//            System.out.print(" "+output);
            System.out.print(counter);
            System.out.print(inputChars[i]);
        }
    }
}
