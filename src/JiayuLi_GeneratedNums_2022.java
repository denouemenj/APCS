/*
    Jiayu Li
    April 2, 2022
    AP CS A
    This is an application that generates a 101 element array based on the sum of the digits of the according index.
 */

public class JiayuLi_GeneratedNums_2022 {
    public static void main(String[] args) {
        //init a 101 length array
        int[] array = new int[101];

        //header
        System.out.format("%5s%15s%n", "Index", "Number");

        //looping for 101 times, generates and prints out the array
        for (int i = 0; i < 101; i++) {
            array[i] = i + sumDigits(i);
            System.out.format("%5s%15s%n", i, array[i]);
        }
    }

    //calculates the sum of the digits of a given number
    static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        return sum;
    }

}
