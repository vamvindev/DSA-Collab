package Stacks;
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
Created by Vamsi on 6/15/21 at 2:56 PM
*/

public class BalancedParanthesisHackerRank {

    static class Result {

        /*
         * Complete the 'isBalanced' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String isBalanced(String s) {
            Stack<Character> stack = new Stack<> ();


            for(int i = 0; i < s.length(); i++){
                char x = s.charAt(i);
                if(x=='(' || x == '{' || x == '[')
                {
                    stack.push(x);
                }
                else
                {
                    if(stack.isEmpty())
                    {
                        return "NO";
                    }
                    else
                    {
                        char pop_val = stack.pop();
                        if(x==')' &&  pop_val != '(')
                        {
                            return "NO";
                        }
                        else if(x=='}' &&  pop_val != '{')
                        {
                            return "NO";
                        }
                        else if(x==']' &&  pop_val != '[')
                        {
                            return "NO";
                        }
                    }
                }
            }
            if(stack.isEmpty())
            {
                return "YES";
            }
            else
            {
                return "NO";
            }
        }
    }


    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int t = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, t).forEach(tItr -> {
                try {
                    String s = bufferedReader.readLine();

                    String result = Result.isBalanced(s);

                    bufferedWriter.write(result);
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
            bufferedWriter.close();
        }
    }


}
