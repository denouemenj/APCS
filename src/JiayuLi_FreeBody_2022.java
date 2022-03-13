/*
 * Jiayu Li
 * 2022/02/07
 * Calculate the answer to the following questions:
 * 1. You’re standing at the edge of a cliff and dropping a ball. It takes 10 sec to hit the ground. How high up are you? In other words, what’s the height of the cliff?
 * 2. What is the velocity of the ball when it hits the ground?
 */

public class JiayuLi_FreeBody_2022 {
    public static void main(String[] args) {
        double gConstant = 9.81; //define g constant
        int time = 10; //define time given in the question
        //Question 1; find height
        double height = 0.5 * gConstant * time * time; //h=0.5*g*t^2
        System.out.println("Question: You’re standing at the edge of a cliff and dropping a ball. It takes 10 sec to hit the ground. How high up are you? In other words, what’s the height of the cliff?"); //print question
        System.out.println("Answer: the height would be " + height + " meters."); //print answer

        //Question 2
        double velocity = gConstant * time; //v=g*t
        System.out.println("Question: What is the velocity of the ball when it hits the ground?"); //print question
        System.out.println("Answer: the final velocity would be " + velocity + " m/s."); //print answer

        //the higher the g constant and the time is the higher the height and velocity is.
    }
}
