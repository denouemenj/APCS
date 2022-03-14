/*
 * Jiayu Li
 * 2022/03/13
 * This program tests the battleship class.
 */

public class JiayuLi_ShipTester_2022 {
    public static void main(String[] args) {
        JiayuLi_Battleship_2022 sub = new JiayuLi_Battleship_2022("submarine", 6);
        JiayuLi_Battleship_2022 raft = new JiayuLi_Battleship_2022("raft", 2);
        JiayuLi_Battleship_2022 destroyer = new JiayuLi_Battleship_2022("destroyer", 9);

        System.out.println(sub);
        System.out.println("Sub has power " + sub.getPower());

        System.out.println(raft);
        System.out.println("Raft has power " + raft.getPower());

        System.out.println(destroyer);
        System.out.println("Destroyer has power " + destroyer.getPower());

        System.out.println("\nRaft attacks Sub");
        sub.isAttacked(raft.getPower());
        System.out.println(sub);

        System.out.println("\nDestroyer attacks Raft");
        raft.isAttacked(destroyer.getPower());
        System.out.println(raft);

        System.out.println("\nSub attacks Destroyer");
        destroyer.isAttacked(sub.getPower());
        System.out.println(destroyer);
    }
}
