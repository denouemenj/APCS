/*
 * Jiayu Li
 * 2022/03/15
 * This program helps the user to check if their password is valid (at least 8 characters long; only consists of letters and digits).
 */

import java.util.Scanner;

public class JiayuLi_PasswordChecker_2022 {

    public static void main(String[] args) {

        //init scanner and variables
        Scanner in = new Scanner(System.in);
        String pw;

        System.out.println("Your password must be at least 8 characters long and only consists of letters and digits.");

        //record entered password
        System.out.println("Please enter your password: ");
        pw = in.nextLine();

        //check pw
        if (pw.length() <= 8) { //check length
            System.out.println("Your password have less than or equal to 8 characters, please enter something else.");
            System.exit(1);
        } else if (!pw.matches("[a-zA-Z0-9]+")) { //check invalid characters
            System.out.println("Your password have invalid character(s) other than letters and numbers.");
            System.exit(1);
        } else { //valid
            System.out.println("You have entered a proper password.");
        }
    }
}
