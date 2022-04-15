/*
 * Jiayu Li
 * 2022/03/14
 * This program allows users to enter two numbers and gives the user the greatest common factor of those two numbers.
 */

import java.util.Scanner;

public class JiayuLi_GreatestCommonFactor_2022 {
    public static void main(String[] args) {
        //init variables and scanner
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("This program will help you find the common factor between two positive integers: "); //instruction
        try {
            //record first number
            System.out.println("Please enter the first positive integer: ");
            num1 = Integer.parseInt(in.nextLine());

            //record second number
            System.out.println("Please enter the second positive integer: ");
            num2 = Integer.parseInt(in.nextLine());

        } catch (Exception e) { //error
            System.out.println("You have not entered a integer, please try again."); //error message
            System.exit(1); //exit
        }

        //in case the user have not entered a positive number, cannot be in a try catch statement because the unreachable code error
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("You have not entered a positive number, please try again."); //direction
            System.exit(1); //exit
        }

        System.out.println("The greatest common factor between " + num1 + " and " + num2 + " is " + gcf(num1, num2)); //print the entered numbers and the gcf
    }

    public static int gcf(int num1, int num2) {
        //calculates the greatest common factor between two numbers
        //done so using a function so it wont change the value in main
        int max = Math.abs(num1); //find bigger out of the two num
        int min = Math.abs(num2); //find smaller out of the two num

        //finding GCF using euclid's algorithm
        while (max > 0) {
            if (max < min) {
                int x = max;
                max = min;
                min = x;
            }
            max %= min;
        }

        return min; //return the gcf
    }
}
