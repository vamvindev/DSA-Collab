package HashMap;
/*
Created by Vamsi on 6/13/21 at 7:03 PM


Given two strings, determine if they share a common substring. A substring may be as small as one character.

Example
s1 = 'and'
s2 = 'art'

These share the common substring a.

s1 = 'cat'
s2 = 'be'

These do not share a substring.

Function Description

Complete the function twoStrings in the editor below.

twoStrings has the following parameter(s):

string s1: a string
string s2: another string
Returns
string: either YES or NO

Sample Input

2
hello
world
hi
world
Sample Output

YES
NO

*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;;

public class CompareSubstrings {

    public static void main(String[] args) {

        String s1 = "artBe";
        String s2 = "ads";
        char[] s1c = s1.toCharArray();
        char[] s2c = s2.toCharArray();

        HashSet<Character> s1Set = new HashSet<>();
        HashSet<Character> s2Set = new HashSet<>();
        for (char c : s1c) {
            s1Set.add(c);
        }System.out.println("Set1: "+ s1Set);

        for (char c : s2c) {
            s2Set.add(c);
        }System.out.println("Set22 :"+ s2Set);
        //Union of set1 & set2, it will retain all the common elements
        s1Set.retainAll(s2Set);

        System.out.println("Test after retaining: "+s1Set);
        if(!s1Set.isEmpty()){
            System.out.println("Yes");
        }else
            System.out.println("No");

            }
        }


/*
Output : Set1: [a, r, B, t, e]
Set22 :[a, s, d]
Test after retaining: [a]
Yes
 */

