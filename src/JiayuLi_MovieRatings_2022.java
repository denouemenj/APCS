/*
 * Jiayu Li
 * 2022/02/09
 * Rounds decimal movie rating to the nearest integer
 */

import java.util.Scanner;

public class JiayuLi_MovieRatings_2022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Please enter your movie rating (as a decimal): ");
            double inputRating = Double.parseDouble(scan.nextLine()); //define input number

            System.out.println("Rating rounded: "+ (int)Math.round(inputRating)); //rounding and printing answer
        } catch (Exception e) {
            System.out.println("You did not enter a number, please try again."); //in case of not number being entered
            main(null);
        }
    }
}
