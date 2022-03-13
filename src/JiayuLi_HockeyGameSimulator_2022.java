/*
 * Jiayu Li
 * 2022/02/23
 * This class simulates a hockey game by using the println function to output the action of chosen players along with their information (e.g., team, player number, name).
 */

public class JiayuLi_HockeyGameSimulator_2022 { //init the JiayuLi_HockeyGameSimulator_2022 class

    //instance variables
    String name;
    int number;
    String team;

    public JiayuLi_HockeyGameSimulator_2022(String inName, int inNumber, String inTeam) {
        //constructor
        //params: inName, inNumber, inTeam
        //return:none
        name = inName;
        number = inNumber;
        team = inTeam;
    }

    public void pass() {
        //prints the pass action
        System.out.println(name + " " + number + " from " + team + " just passed.");
    }

    public void shoot() {
        //prints the shoot action
        System.out.println(name + " " + number + " from " + team + " just made a shoot.");
    }
}
