package Arrays;
/*
Created by Vamsi on 7/5/21 at 2:11 PM
*/

public class twoDArrayDemo {

    public static void main(String[] args) {

        int [][] numbers= new int[][] { { 1, 1, 0, 0, 1},
                                        { 0, 1, 0, 0, 1 },
                                        { 1, 0, 0, 1, 1 },
                                        { 0, 0, 0, 0, 0 },
                                        { 1, 0, 1, 0, 1 } };;

        System.out.println(numbers[0][1]);
        System.out.println("--------------------");
        System.out.println("Length of the array is :  "+numbers.length);
        for(int i = 0; i < numbers.length; i++){
            if(i != 0){
                System.out.println(",");
            }
            for (int j = 0; j < numbers.length; j++){
                System.out.print(+numbers[i][j]);
            }
        }
      }
    }
