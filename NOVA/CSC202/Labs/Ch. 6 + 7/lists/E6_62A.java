package ch06.lists;

// @author Michael Kester
import java.io.*;
import java.util.*;
import support.Golfer;

public class E6_62A {

    public static void main(String[] args) throws IOException {
        Scanner conIn = new Scanner(System.in);
        final String FILENAME = "golfers.dat";
        String name;          // golfer name
        int score;            // golfer score
        String skip;  // skip rest of input line after reading integer
        Golfer golfer;

        // Get golfer information from user
        System.out.print("Golfer name: ");
        name = conIn.nextLine();
        System.out.print("Score: ");
        score = conIn.nextInt();
        golfer = new Golfer(name, score);

        // Display results.
        System.out.println();
        System.out.println("This golfer will be saved in " + FILENAME + ":\n");
        System.out.println(golfer);
        System.out.println();

        // Save golfer info to file
        try {
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
                out.writeObject(golfer);
            }
        } catch (Exception e) {
            System.out.println("Unable to save golfer information.");
        }

        //get golfer info
        Golfer golfer2;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("golfers.dat"));

        try {
            golfer2 = (Golfer) in.readObject();
            System.out.println("The name of the golfer is " + golfer2.getName());
            System.out.println("The score of the golfer is " + golfer2.getScore());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error in readObject: " + e);
            System.exit(1);
        }
    }
}
