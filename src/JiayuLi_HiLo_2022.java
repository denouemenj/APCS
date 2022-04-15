/*
    Jiayu Li
    April 2, 2022
    AP CS A
    HiLo game application for players to guess if the computer generated number is high or low and give assigned points accordingly.
 */

import java.util.Random;

public class JiayuLi_HiLo_2022 {
    //instance variables
    private int score;
    private int riskPoints;
    private String guess;
    private int randomNum;

    //constructor
    public JiayuLi_HiLo_2022() {
        this.score = 1000;
    }

    //record guess by player
    public void makeGuess(String guess) {
        this.guess = guess;
    }

    //record bet by player
    public void placeBet(int riskPoints) {
        this.riskPoints = riskPoints;
    }

    //generate random integer between 1 and 13
    public void generateRandom() {
        Random rand = new Random();
        randomNum = rand.nextInt(13) + 1;
    }

    //return random number in class
    public int getRandom() {
        return randomNum;
    }

    //check if the guess is correct
    public boolean checkGuess() {
        if ((guess.equals("low") && randomNum <= 6) || (guess.equals("high") && randomNum > 7)) {
            return true;
        }
        return false;
    }

    //updates the points according to the guess and bet placed
    public void updatePoints() {
        if (checkGuess()) {
            this.score += riskPoints * 2;
        } else {
            this.score -= riskPoints;
        }
    }

    //point printer
    public void showCurrentPoints() {
        System.out.println("You have " + score + " right now.");
    }

    public int getPoint() {
        return score;
    }

}
