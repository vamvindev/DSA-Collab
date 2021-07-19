package Arrays;
/*
Created by Vamsi on 6/13/21 at 3:35 PM
*/

public class StringReverse {

    public static void main(String[] args) {

        String input = "Hey how are you doing?";

        char[] toArray = input.toCharArray();

        for(int i = toArray.length-1 ; i >= 0 ; i--){
            System.out.print(toArray[i]);
        }



    }

}

//Output : ?gniod uoy era woh yeH