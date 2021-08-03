package Arrays;
/*
Created by Vamsi on 7/27/21 at 8:15 AM
*/

public class IsPalindrome {

    public  static void isPalindrome(int x){

        int temp = x;
        int reversed = 0;
        while(x > reversed){
            int pop = x%10;
            x /= 10;
            reversed = (reversed * 10 ) +pop;
        }
        System.out.println("Temp is: "+temp);
        System.out.println("X is :" +x );
        System.out.println("Reversed is : " +reversed);

        if( temp == reversed || temp/10 ==  reversed) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        int input = 121;
        String txtInput = "mom";

        isPalindrome(input);
    }
}
