package HashMap;
/*
Created by Vamsi on 6/8/21 at 11:44 PM

Using a logical key inside Hashmap
Storing and getting back an object from a HashMap
Overriding a value in HashMap

Problem :
ex :
Input : Hey, how are you?
Output : H2e2y2o2a1r1u1
*/

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountLettersInASentence {

        public Map<String, Integer> countLetters(String sentence) {
            System.out.println("Input : " +sentence);

            Map<String, Integer> letterMap = new HashMap<>();

            //iterating through the string by each character
            for (int i = 0; i < sentence.length(); i++) {
                Character c = sentence.charAt(i);

                //If letter is found in the map then increment the counter
                if (letterMap.containsKey(c.toString())) {
                    //getting the value of the letter and putting it to count
                    int count = letterMap.get(c.toString());
                    count++;
                    letterMap.put(c.toString(), count);
                    //if letter not found then put in the map
                } else
                    letterMap.put(c.toString(), 1);
            }return letterMap;
        }

        public void printTheLetterCounts(Map<String, Integer> m){
            Collection<Map.Entry<String, Integer>> entrySet = m.entrySet();

            Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();

            while(it.hasNext()){
                Map.Entry<String, Integer> entry = it.next();
                System.out.println("Test Test" + entry.getKey() + "Test Test Test" + entry.getValue());
            }
        }


    public static void main(String[] args) {
        CountLettersInASentence counter = new CountLettersInASentence();
        Map<String, Integer> letterMap = counter.countLetters("This is a test sentence to count the characters");
        System.out.println("Output :" +letterMap);
        System.out.println("Hash Map Size :" +letterMap.size());
        System.out.println("Hash Map Key Set :" +letterMap.keySet());
        System.out.println("Hash Map Values :" +letterMap.values());

    }
}

/*
Input : aaahhhwwllldu,sppiiieekkkcc
Output :{a=3, c=2, d=1, e=2, h=3, i=3, k=3, l=3, ,=1, p=2, s=1, u=1, w=2}

Input :
Output :{}


Input : Lorem Ipsum is simply dummy text of the printing and typesetting industry.
Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown
printer took a galley of type and scrambled it to make a type specimen book. It has survived not only
five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.
It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages,
and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.

Output :{A=1, I=6, L=5, M=1, P=1,  =90, a=28, b=5, c=10, d=16, e=59, f=6, g=11, '=1, h=14, i=32, k=7, l=17, ,=4, m=18,
n=38, .=4, o=25, p=18, 0=3, 1=2, r=24, s=39, t=43, u=17, 5=1, v=5, 6=1, w=6, x=2, y=13, 9=1}

Input : This is a test sentence to count the letter counts

Output :{ =9, a=1, c=3, e=7, h=2, i=2, l=1, n=4, o=3, r=1, s=5, T=1, t=9, u=2}

 */