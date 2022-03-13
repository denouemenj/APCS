/*
 * Jiayu Li
 * 2022/02/23
 * This is the tester class for JiayuLi_GradingCS_2022, which allows the user to input certain student's grade.
 */

import java.util.Arrays;
import java.util.Scanner;

public class JiayuLi_GradingCSTest_2022 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // scanner init

        try {
            //instruction
            System.out.println("Please enter the information and grade of the student you would like to calculate the grade for, any unsorted information will lead the program to exit.");

            //record name
            System.out.println("Name of the student: ");
            String name = in.nextLine();

            //record quiz grades into array
            System.out.println("All five quiz grade of the student (out of 10), spacing each grade by a space. For example: 9 8 4 5 4");
            String[] beforeQuizScores = in.nextLine().split(" ");
            double[] quizScores = Arrays.stream(beforeQuizScores).mapToDouble(Double::parseDouble).toArray(); //record into array
            if (quizScores.length != 5) { //check if array is not right size
                System.out.println("you have entered something wrong, please restart the program to try again.");
                System.exit(0);
            }

            //record midterm grade
            System.out.println("the midterm exam score of the student (out of 50): ");
            double midtermScore = Double.parseDouble(in.nextLine());

            //record final exam grade
            System.out.println("the final exam score of the student (out of 100): ");
            double finalScore = Double.parseDouble(in.nextLine());

            //init student object
            JiayuLi_GradingCS_2022 student = new JiayuLi_GradingCS_2022(quizScores, midtermScore, finalScore);

            String[] grades = student.gradeCalculator(); //record calculated final grade

            //prints result
            System.out.println(name + "'s grade is " + grades[0] + ", which falls in the " + grades[1] + " tier.");

            //asks if would like to enter more student information
            System.out.println("Would you like to enter the information of another student? (y/n): ");
            if (in.nextLine().equalsIgnoreCase("y")) { //if yes
                main(null);
            } else {
                System.out.println("ok..see you next time.");
                System.exit(0);  //exit if entered anything else than y
            }

        } catch (Exception e) { //if error
            System.out.println("you have entered something wrong, please restart the program to try again."); //error message
            System.exit(0); //exit
        }
    }
}
