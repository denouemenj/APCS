/*
    Jiayu Li
    April 2, 2022
    AP CS A
    Test class for JiayuLi_HiLo_2022.
 */

import java.util.Scanner;

public class JiayuLi_HiLoTest_2022 {
    public static void main(String[] args) {
        //init scanner and player object
        Scanner in = new Scanner(System.in);
        JiayuLi_HiLo_2022 player = new JiayuLi_HiLo_2022();
        int riskPoints = 0;

        //instructions
        System.out.println("Rules: \n" +
                "Numbers 1-6 are low \n" +
                "Numbers 8-13 are high \n" +
                "Number 7 is neither high or low.");

        player.showCurrentPoints(); //print current points

        while (true) {
            //place and record bet
            System.out.println("Please enter your bet: ");

            try {
                riskPoints = Integer.parseInt(in.nextLine().replace(" ", ""));
            } catch (Exception e) { //in case not an integer
                System.out.println("You not entered a number, please try again.");
                System.exit(1);
            }

            //in case the points dont meet requirement
            if (player.getPoint() <= 0 || player.getPoint() < riskPoints) {
                System.out.println("You have zero or negative points or you are tyring to place more risk points than you have. You lost. ");
                System.exit(1);
            }

            player.placeBet(riskPoints);

            //place and record guess
            System.out.println("Predict the outcome (answer other than high or low will be considered as an automatic lost): ");
            player.makeGuess(in.nextLine());

            //generate the random number
            player.generateRandom();

            //check the guess
            System.out.println("The number is " + player.getRandom());
            System.out.println("You " + (player.checkGuess() ? "won." : "loss."));

            //update the points accordingly
            player.updatePoints();

            //print current points again
            player.showCurrentPoints();

            System.out.println("Would you like to play another round? (y/n): "); //ask to play again

            if (in.nextLine().equals("n")) {
                break;
            }
        }

    }
}
