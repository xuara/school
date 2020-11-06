package ch05.queues;

// @author Michael Kester
import java.util.*;

public class ArrayUnbndQueueTest {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        //Exercise 5.23
        ArrayUnbndQueue maluq = new ArrayUnbndQueue();
        ArrayUnbndQueue femuq = new ArrayUnbndQueue();

        while (true) {
            System.out.print("Input a gender and name (x done to quit) > ");
            String resp = kb.nextLine();
            if (resp.equals("x done")) {
                break;
            } else if (resp.substring(0, 1).equals("m")) {
                maluq.enqueue(resp.substring(2, resp.length()));
            } else if (resp.substring(0, 1).equals("f")) {
                femuq.enqueue(resp.substring(2, resp.length()));
            } else {
                System.err.print("Incorrect input format.");
            }
        }

        System.out.println("males: " + maluq.toString());
        System.out.println("females: " + femuq.toString());
        // end Exercise 5.23
    }
}
