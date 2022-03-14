/*
 * Jiayu Li
 * 2022/03/13
 * This program let users to enter three numbers and out the smallest out of those.
 */

import java.util.Scanner;

public class JiayuLi_ThreeNumbers_2022 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //scanner init

        System.out.println("This is a program that outputs the smallest out of the three numbers you enter"); //direction
        try { //in case the user do not enter a proper number
            //input directions
            System.out.println("Please enter the first number: ");
            int firstNum = Integer.parseInt(in.nextLine());
            System.out.println("please enter the second number: ");
            int secondNum = Integer.parseInt(in.nextLine());
            System.out.println("Please enter the third number: ");
            int thirdNum = Integer.parseInt(in.nextLine());

            System.out.println("The smallest number is " + findSmallNum(firstNum, secondNum, thirdNum) + "."); //print result
        } catch (Exception e) {
            System.out.println("You have entered something wrong, please try again.");
        }
    }

    public static int findSmallNum(int num1, int num2, int num3) {
        int smallest = num1; //default num1 in case all num are equal

        //there are more effective methods but we are using compound boolean expressions as asked
        if (num1 < num2 && num1 < num3) { //if num1 is smaller than num2 and num3
            smallest = num1;
        } else if ((num2 < num1 && num2 < num3) || (num2 == num3 && num1 > num2)) { //if num2 is smaller than num1 and num3 or if num2=num3
            smallest = num2;
        } else if (num3 < num1 && num3 < num2) { //if num3 is smaller than num1 and num2
            smallest = num3;
        }

        return smallest;
    }
}
