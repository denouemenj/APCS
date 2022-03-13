/*
 * Jiayu Li
 * 2022/02/09
 * Calculates the grand total of night out
 */

import java.util.Scanner;

public class JiayuLi_NightOut_2022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("How much did dinner cost?");
            double dinnerCost = Double.parseDouble(scan.nextLine()); //define dinner cost

            System.out.println("how much mini-golf cost per person?");
            double golfCost = Double.parseDouble(scan.nextLine()); //define mini-golf cost

            System.out.println("How much did dessert cost?");
            double dessertCost = Double.parseDouble(scan.nextLine()); //define dessert cost

            //print results
            System.out.println("----------------------");
            System.out.println("Dinner: " + dinnerCost);
            System.out.println("Mini-Golf: " + golfCost * 2);
            System.out.println("Desserts: " + dessertCost);
            System.out.println("Grand Total: " + (dinnerCost + golfCost * 2 + dessertCost)); //calculate grand total
            System.out.println("----------------------");

        } catch (Exception e) {
            System.out.println("You did not enter a number, please try again.");
            main(null);
        }
    }
}
