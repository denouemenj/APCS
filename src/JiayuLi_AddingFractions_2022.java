/*
 * Jiayu Li
 * 2022/02/07
 * Calculates the sum of two fractions
 */

import java.util.Scanner;

public class JiayuLi_AddingFractions_2022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try { //in case user entered non-integers
            //define inputs
            System.out.print("Please input the numerator of the first fraction (integer only): ");
            int num1 = input.nextInt();
            System.out.print("Please input the denominator of the first fraction (integer only): ");
            int den1 = input.nextInt();
            System.out.print("Please input the numerator of the second fraction (integer only): ");
            int num2 = input.nextInt();
            System.out.print("Please input the denominator of the second fraction (integer only): ");
            int den2 = input.nextInt();

            int[] addedFractions = addFractions(num1, den1, num2, den2); //add fractions
            String simplifiedFraction = simplify(addedFractions[0], addedFractions[1]); //simplify fractions
            System.out.println("The sum of " + num1 + "/" + den1 + " and " + num2 + "/" + den2 + " is " + simplifiedFraction); //print results

        } catch (Exception e) {
            System.out.println("You have entered a non-integer, please try again.");
            main(null); //rerun
        }
    }

    public static int[] addFractions(int num1, int den1, int num2, int den2) {
        int newNum = num1 * den2 + num2 * den1;
        int newDen = den1 * den2;
        return new int[]{newNum, newDen};
    }

    public static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static String simplify(long a, long b) {
        long gcd = gcd(a, b);
        return (a / gcd) + "/" + (b / gcd);
    }
}
