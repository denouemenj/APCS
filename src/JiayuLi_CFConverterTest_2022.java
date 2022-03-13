/*
 * Jiayu Li
 * 2022/02/23
 * This class is the tester class for the JiayuLi_CFConverter_2022 class. It will ask the user to enter the type of temperature they are entering and the value of the temperature, then output the converted result through creating an object using the CFConverter class.
 */

import java.util.Scanner;

public class JiayuLi_CFConverterTest_2022 { //tester class

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //scanner init
        boolean isSyntaxGood = false; //error catching
        double value = 0; //value of the input temperature
        String unit = "°C"; //unit of the converted temperature

        //directions
        System.out.println("================================================================================");
        System.out.println("Welcome. Here are the types of temperature you can enter to convert to another: ");
        System.out.println("1. Celsius                              |                          2. Fahrenheit");
        System.out.println("================================================================================");

        while (!isSyntaxGood) {

            try { //try for invalid enter

                System.out.println("Please enter the numerical value of the temperature you would like to convert: "); //instruction

                value = Double.parseDouble(in.nextLine()); //record the value

                System.out.println("Please enter the corresponded number to choose which type of temperature (celsius or fahrenheit) you are entering: "); //instruction

                int choice = Integer.parseInt(in.nextLine()); //record choice

                if (choice == 1) { //if choose celsius
                    unit = "°F";
                    value = JiayuLi_CFConverter_2022.celsiusToFahrenheit(value);//record converted fahrenheit value
                } else if (choice == 2) { //if choose fahrenheit
                    value = JiayuLi_CFConverter_2022.fahrenheitToCelsius(value); //if choose fahrenheit, record converted value
                } else { //if didnt choose fahrenheit or celsius
                    throw new Exception("Have not entered a valid choice"); //send error
                }

                isSyntaxGood = true; //break loop

            } catch (Exception e) {
                System.out.println("You have entered something wrong, you will be redirected to try again!"); //error message
            }
        }

        System.out.println("your converted temperature is: " + Math.round(value) + unit); //print out rounded result

        System.out.println("Would you like to convert something else? (y/n)");
        if (in.nextLine().equalsIgnoreCase("y")) { //if yes
            main(null);
        } else {
            System.out.println("ok..see you next time.");
            System.exit(0);  //exit if entered anything else than y
        }
    }
}
