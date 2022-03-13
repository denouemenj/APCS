/*
 * Jiayu Li
 * 2022/02/23
 * This class is the tester class for the JiayuLi_HockeyGameSimulator_2022 class. It will ask information of the players from the user and create player objects according to the inputted information.
 */

import java.util.Scanner;

public class JiayuLi_HockeyGameSimulatorTest_2022 {
    public static void main(String[] args) {
        //tester method
        Scanner in = new Scanner(System.in); //scanner init
        boolean isSyntaxGood = false; //while loop breaker

        System.out.println("You will be instructed to enter the information of players including their name, number, and team, so you can play game"); //instruction for user
        System.out.println("How many player is there?:"); //ask for how many players are there

        int numberPlayer = 0; //init the variable for the number of players

        while (!isSyntaxGood) { //error catching, specifically if the input was not a number
            try {
                numberPlayer = Integer.parseInt(in.nextLine());
                isSyntaxGood = true;
            } catch (Exception e) {
                System.out.println("You have not entered a number please try again: "); //error message
            }
        }

        isSyntaxGood = false; //set variable for the next error testing

        JiayuLi_HockeyGameSimulator_2022[] players = new JiayuLi_HockeyGameSimulator_2022[numberPlayer]; //create class array to store multiple player's information, the number of items is equal to the number of players entered

        System.out.println(numberPlayer + " players, please enter their information as below instructed."); //instruction for inputting information

        for (int i = 0; i < numberPlayer; i++) {
            //repeats how many players there is and ask for their info individually

            System.out.println("Please enter the name of player " + (i + 1) + ":"); //ask for name of player
            String inName = in.nextLine(); //record name of player

            System.out.println("Please enter the number of player " + (i + 1) + ":"); //ask for player number
            int inNumber = 0; //init player number variable

            while (!isSyntaxGood) { //catching errors, specifically if the input is not a number
                try {
                    inNumber = Integer.parseInt(in.nextLine()); //record player number
                    isSyntaxGood = true;
                } catch (Exception e) {
                    System.out.println("You have not entered a number please try again: "); //error message
                }
            }

            isSyntaxGood = false; //reset error variable

            System.out.println("Please enter the team of the player: "); //ask for player team name
            String inTeam = in.nextLine(); //record player team name

            JiayuLi_HockeyGameSimulator_2022 player = new JiayuLi_HockeyGameSimulator_2022(inName, inNumber, inTeam); //creating new players object
            players[i] = player; //storing player object into the JiayuLi_HockeyGameSimulator_2022 players array
        }

        System.out.println("Now you have entered all the players you have, what do you want them to do? Enter the sequence which you entered that player followed by a space and the action you want them todo (pass or shot). For example, I want the 5th player I have entered to do a shoot, so I would enter '5 shoot' below: "); //instruction for next step

        while (true) { //catching error
            try {
                String[] answer = in.nextLine().split(" "); //separate input by space character into action and player number
                switch (answer[1]) {
                    case "pass":
                        players[Integer.parseInt(answer[0]) - 1].pass(); //call for the pass method
                        System.out.println("would you like to enter something again? (y/n)"); //instruction if user wants to enter another action
                        determineExit(in.nextLine());
                        break;
                    case "shot":
                        players[Integer.parseInt(answer[0]) - 1].shoot(); //call for the shoot method
                        System.out.println("would you like to enter something again? (y/n)"); //instruction if user wants to enter another action
                        determineExit(in.nextLine());
                        break;
                    default:
                        System.out.println("You have entered something other than pass or shot, please try again: "); //in case entered another action other than pass or shoot
                }
            } catch (Exception e) {
                System.out.println("You have entered something wrong, please try again: "); //in case user had entered a non-valid number
            }
        }
    }

    public static void determineExit(String choice) {
        //determines if the user wants to exit program or keep going
        if (choice.equalsIgnoreCase("y")) { //if entered y
            System.out.println("Again, enter the number assigned and the action you want them to take: ");
        } else {
            System.out.println("ok..see you next time.");
            System.exit(0);  //exit if entered anything else than y
        }
    }
}
