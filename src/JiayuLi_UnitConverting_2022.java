/*
    Jiayu Li
    April 2, 2022
    AP CS A
    This is an application that allow users to convert from various units to another.
 */

import java.util.Scanner;

public class JiayuLi_UnitConverting_2022 {
    public static void main(String[] args) {
        //init variables and scanner
        int selection = 0;
        double input = 0;
        Scanner in = new Scanner(System.in);

        //conversion factors and unit names
        double[] conversionFactors = {2.54, 30, 0.91, 1.6};
        String[][] units = {{"inches", "centimeters"},
                {"feet", "centimeters"},
                {"yards", "meters"},
                {"miles", "kilometers"}};

        //instructions
        System.out.println("What are you converting to and from?: ");
        System.out.println("1. Inches to Centimeters      2. Centimeters to Inches \n" +
                "3. Feet to Centimeters        4. Centimeters to Feet \n" +
                "5. Yards to Meters            6. Meters to Yards \n" +
                "7. Miles to Kilometers        8. Kilometers to Miles");

        try {
            //record selection
            selection = Integer.parseInt(in.nextLine());

            //divided by even and odd selection numbers
            if (selection % 2 == 0) { //even
                System.out.println("Please enter your number in " + units[selection / 2 - 1][1] + " first: ");
                input = Double.parseDouble(in.nextLine());
                System.out.println(input + " " + units[selection / 2 - 1][1] + " is " + Math.round((input / conversionFactors[selection / 2 - 1]) * 100.0) / 100.0 + " " + units[selection / 2 - 1][0]);
            } else { //odd
                System.out.println("Please enter your number in " + units[(selection + 1) / 2 - 1][0] + " first: ");
                input = Double.parseDouble(in.nextLine());
                System.out.println(input + " " + units[(selection + 1) / 2 - 1][0] + " is " + Math.round((input * conversionFactors[(selection + 1) / 2 - 1]) * 100.0) / 100.0 + " " + units[(selection + 1) / 2 - 1][1]);

            }
        } catch (Exception e) {
            System.out.println("You have not entered an integer or a proper number, please try again.");
            System.exit(1);
        }
    }
}
