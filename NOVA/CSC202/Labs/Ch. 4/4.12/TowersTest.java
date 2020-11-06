package e412.pkg;

import java.util.Scanner;

public class TowersTest {

    static int count;

    public static void main(String[] args) {
        System.out.println("(Initially: not using a loop)");

        Scanner conIn = new Scanner(System.in);

        int n; // Number of rings on starting peg.
        System.out.print("Input the number of rings: ");
        if (conIn.hasNextInt()) {
            n = conIn.nextInt();
        } else {
            System.out.println("Error: you must enter an integer.");
            System.out.println("Terminating program.");
            return;
        }

        System.out.println("Towers of Hanoi with " + n + " rings");
        doTowers(n, 1, 2, 3);

        System.out.println("Number of moves required: " + numMoves() + "\n");

        System.out.println("Using a loop:");

        int c = 1;

        while (c >= 0) {
            System.out.print("Input the number of rings: ");
            if (conIn.hasNextInt()) {
                c = conIn.nextInt();
            } else {
                System.out.println("Error: you must enter an integer.");
                System.out.println("Terminating program.");
                return;
            }
            System.out.print("Towers of Hanoi with " + c + " rings\n");
            doTowers(c, 1, 2, 3);

            System.out.println("Number of moves required: " + numMoves()
                    + "\n");
            count = 0;
        }
    }

    public static void doTowers(
            int n, // Number of rings to move
            int startPeg, // Peg containing rings to move
            int auxPeg, // Peg holding rings temporarily
            int endPeg) // Peg receiving rings being moved
    {
        if (n > 0) {
            count++;
            // Move n - 1 rings from starting peg to auxiliary peg
            doTowers(n - 1, startPeg, endPeg, auxPeg);

            /* Move nth ring from starting peg to ending peg
            System.out.println("Move ring " + n + " from peg " + startPeg
                    + " to peg " + endPeg); */
            // Move n - 1 rings from auxiliary peg to ending peg
            doTowers(n - 1, auxPeg, startPeg, endPeg);
        }
    }

    public static int numMoves() {
        return count;
    }
}
