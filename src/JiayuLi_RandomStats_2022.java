/*
    Jiayu Li
    April 2, 2022
    AP CS A
    This is an application that generates random numbers from 0 to 9 for 500 times and record their occurrence.
 */

import java.util.ArrayList;
import java.util.Random;

public class JiayuLi_RandomStats_2022 {
    public static void main(String[] args) {

        //init array, zero by default
        int[] arr = new int[10];
        //init random
        Random ran = new Random();

        //generate teh 500 numbers by random
        for (int i = 0; i < 500; i++) {
            arr[ran.nextInt(10)]++;
        }

        //print header
        System.out.format("%5s%15s%n", "Index", "Occurrence");
        //print index and occurrence recorded
        for (int i = 0; i < 10; i++) {
            System.out.format("%5s%15s%n", i, arr[i]);
        }

    }
}
