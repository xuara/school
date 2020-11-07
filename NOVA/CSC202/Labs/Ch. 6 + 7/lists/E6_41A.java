package ch06.lists;

// @author Michael
import java.util.*;

public class E6_41A extends ArraySortedList {

    public static void main(String[] args) {
        int c = 0;
        Scanner kb = new Scanner(System.in);
        ArraySortedList l = new ArraySortedList();

        while (true) {
            System.out.println("Enter name of a country you've visited.");
            String s = kb.nextLine();
            String k = s.toUpperCase();
            if (!l.contains(k)) {
                l.add(k);
                c++;
            }
            System.out.print("Is that all of the contries you've visited?"
                    + " ('yes' to stop): ");
            String resp = kb.nextLine();
            if (resp.equals("yes")) {
                break;
            }
        }

        System.out.println("\nNumber of countries visited: " + c + "\n" + l);
    }
}
