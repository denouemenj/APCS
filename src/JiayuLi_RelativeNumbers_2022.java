/*
 * Jiayu Li
 * 2022/03/13
 * This program let users to enter two numbers and outputs the the relationship between those numbers.
 */

import java.util.Scanner;

public class JiayuLi_RelativeNumbers_2022 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //init scanner
        //init boolean variables
        boolean firIsSmallThanSec = false;
        boolean isEqual = false;
        boolean firIsGreaterThanSec = false;

        // Ask for two numbers
        System.out.println("Please enter the first number: ");
        int firstNum = Integer.parseInt(in.nextLine());
        System.out.println("Please enter the second number: ");
        int secondNum = Integer.parseInt(in.nextLine());

        // Compare the numbers as instructed
        if (firstNum < secondNum) { //if smaller
            firIsSmallThanSec = true;
        } else if (firstNum > secondNum) { //if equal
            firIsGreaterThanSec = true;
        } else { //if bigger
            isEqual = true;
        }

        // Display the results
        System.out.println(firstNum + "<" + secondNum + ":" + firIsSmallThanSec);
        System.out.println(firstNum + "=" + secondNum + ":" + isEqual);
        System.out.println(firstNum + ">" + secondNum + ":" + firIsGreaterThanSec);
    }
}
