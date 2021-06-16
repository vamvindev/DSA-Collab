package Arrays;
/*
Created by Vamsi on 6/15/21 at 10:01 AM
*/

public class test {

    public static void main(String[] args) {
        try
        {
            Float f1 = 3.0F;
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x+b+d);
        }catch (NumberFormatException e){
            System.out.println("bad number");
        }
    }
}
