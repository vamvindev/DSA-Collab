package Sets;
/*
Created by Vamsi on 7/11/21 at 8:25 PM
*/

import org.junit.platform.commons.util.StringUtils;

import java.util.HashSet;

public class RemoveDuplicatesInAString {


    public static void main(String[] args) {

        String input = "appapple";

        char[] charInput = input.toCharArray();

        HashSet<Character> s = new HashSet<>();

        for ( char c : charInput
             ) {
            s.add(c);
        }




        String result = s.toString().replaceAll("\\,|\\[|\\]|\\s", "");
//        "\\,|\\[|\\]|\\s", ""
        System.out.println("To String : "+result);
        System.out.println(s);


    }


}
