/*
 * Jiayu Li
 * 2022/03/14
 * This class allow users to input bases and exponents of a table they want to make and print said table.
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class JiayuLi_PowerTable_2022 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //init scanner
        List<Integer> bases = null;
        List<Integer> exponents = null;

        try {
            System.out.println("What bases do you want yor power table to have? Please separate each number by a space and enter them in numerical form (whole numbers only): "); //directions
            bases = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());  //input -> stream array

            System.out.println("What range of exponents do you want your power table to have? please separate each number by a space and enter them in numerical form (whole numbers only): "); //directions
            exponents = Arrays.stream(in.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList()); //input -> stream array
        } catch (Exception e) {
            System.out.println("You have entered something invalid, please try again.");
            System.exit(1);
        }

        String[][] powerTable = new String[bases.size() + 1][exponents.size() + 1]; //init table

        powerTable[0][0] = "n"; //format

        //init reference row and column
        for (int i = 0; i < exponents.size(); i++) powerTable[0][i + 1] = String.valueOf(exponents.get(i));
        for (int i = 0; i < bases.size(); i++) powerTable[i + 1][0] = String.valueOf(bases.get(i)) + "^n";

        //init table
        for (int i = 1; i <= bases.size(); i++) {
            for (int j = 1; j <= exponents.size(); j++) {
                powerTable[i][j] = String.valueOf((int) Math.pow(bases.get(i - 1), exponents.get(j - 1))); //calculate and record values
            }
        }

        printPowerTable(powerTable); //print table
    }

    public static void printPowerTable(String[][] powerTable) {
        //takes in the power table and print
        int len = powerTable[0].length;
        String format = String.join("", Collections.nCopies(len, "%15s")) + "%n"; //copy format enough times to the length of the column

        for (String[] row : powerTable) System.out.format(format, row); //print

    }
}
