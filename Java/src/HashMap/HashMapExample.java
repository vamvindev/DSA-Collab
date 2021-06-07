package HashMap;
/*
Created by Vamsi on 6/6/21 at 12:11 PM
*/

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> exercises = new HashMap<>();
        exercises.put("chest", 12 );
        exercises.put("legs", 40 );



        System.out.println(exercises);
        System.out.println(exercises.hashCode());

        Integer a = exercises.get("legs");
        System.out.println(a);


    }
}
