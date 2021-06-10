package HashMap;
/*
Created by Vamsi on 6/8/21 at 11:44 PM

Using a logical key inside Hashmap
Storing and getting back an object from a HashMap
Overriding a value in HashMap

Problem :
Run-length encoding
ex 1:
Input : aaabcccddddeee
output : a3b1c3d3e3

ex2 :
Input : Hey, how are you?
Output : H2e2y2o2a1r1u1
*/

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountLettersInASentence {

        public Map<String, Integer> countLetters(String sentence) {

            Map<String, Integer> letterMap = new HashMap<>();

            //iterating through the string by each character
            for (int i = 0; i < sentence.length(); i++) {
                Character c = sentence.charAt(i);

                //If letter is found in the map then increment the counter
                if (letterMap.containsKey(c.toString())) {
                    //geting the value of the letter and putting it to count
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
                System.out.println(entry.getKey() + "," + entry.getValue());
            }
        }


    public static void main(String[] args) {
        CountLettersInASentence counter = new CountLettersInASentence();
        Map<String, Integer> letterMap = counter.countLetters("aaahhhwwllldu,sppiiieekkkcc");
        System.out.println(letterMap);
    }
}
