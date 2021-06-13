package Misc;
/*
Created by Vamsi on 6/12/21 at 3:12 PM

Staircase detail

This is a staircase of size :

   #
  ##
 ###
####
Its base and height are both equal to . It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size .

Function Description

Complete the staircase function in the editor below.

staircase has the following parameter(s):

int n: an integer
Print

Print a staircase as described above.

Input Format

A single integer, , denoting the size of the staircase.

Sample Input

6
Sample Output

     #
    ##
   ###
  ####
 #####
######
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.

*/

public class Staircase {

    public static void main(String[] args) {
        int counter=0;
        int n = 5;
        System.out.println("=================Right Aligned Staircase===============");
        //Total n lines will be printed
        for(int i = 0; i < n; i++)
        {
            //incrementing counter on every iteration
            counter++;
            //Printing spaces n-1 times since last line shouldn't have spaces
            for(int k = n-1; k > i; k--)
            {
                System.out.print(" ");
            }
            //Printing #'s n times
            for(int j = 0; j <= counter-1; j++)
            {
                System.out.print("#");
            }
            //Going to next line on every iteration
            System.out.print("\n");
        }
        //Trying to print a left aligned staircase
        System.out.println("=================Left Aligned Staircase===============");
        int counter2 = 0;
        for(int i = 0; i < n; i++)
        {
            //incrementing counter on every iteration
            counter2++;
            //Printing #s n times on each iteration
            for(int j = 0 ; j < counter2 ; j++)
            {
                System.out.print("#");
            }
            //Going to next line on every iteration
            System.out.print("\n");
        }


    }
}

/*
Output

=================Right Aligned Staircase===============
    #
   ##
  ###
 ####
#####
=================Left Aligned Staircase===============
#
##
###
####
#####

 */
