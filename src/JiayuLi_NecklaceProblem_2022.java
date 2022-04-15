/*
 * Jiayu Li
 * 2022/03/15
 * This program helps the user to create a necklace problem pattern and keep count of how many steps are taken during the process.
 */

import java.util.Scanner;

public class JiayuLi_NecklaceProblem_2022 {
    public static void main(String[] args) {
        //init variables
        Scanner in = new Scanner(System.in);

        //the original numbers entered
        int num1 = 0;
        int num2 = 0;

        //the updating number used in while loop
        int recurNum1;
        int recurNum2;
        int temp;

        //counter
        int cnt = 1;

        System.out.println("An interesting problem in number theory is sometimes called the “necklace problem.” This problem begins with two single-digit numbers. The next number is obtained by adding the first two numbers together and saving only the ones digit. This process is repeated until the “necklace” closes by returning to the original two numbers."); //introduction to the program
        try {
            //record first number
            System.out.println("Please enter the first number: ");
            num1 = Integer.parseInt(in.nextLine());

            //record second number
            System.out.println("Please enter the second number: ");
            num2 = Integer.parseInt(in.nextLine());
        } catch (Exception e) {
            System.out.println("You have not entered an integer, please try again."); //error message
            System.exit(1);
        }

        System.out.println("The two numbers you entered are " + num1 + " and " + num2 + "."); //reconfirm numbers

        recurNum1 = num2;
        recurNum2 = (num1 + num2) % 10; //let recurNum2 be the last number in the sequence after first step

        System.out.print("Pattern: " + num1 + " " + num2 + " " + recurNum2 + " "); //prints out the known pattern already

        //pattern finder
        while (!((num1 == recurNum1) && (num2 == recurNum2))) {
            temp = recurNum1 + recurNum2; //saves the sum between recurNum1 and recurNum2 so those two numbers can be updated later
            recurNum1 = recurNum2;  //moves recurNum1 one place forward in the sequence
            recurNum2 = temp % 10; //find the ones digit
            System.out.print(recurNum2 + " "); //prints
            cnt++;
        }

        System.out.println(); //extra line for styling
        System.out.println("This process repeated for " + cnt + " times."); //conclusion
    }
}
