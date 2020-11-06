package e422.pkg;

// @author Michael Kester
import java.util.*;

public class Palindrome2 {

    static boolean isPalindromeIter(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println("Palindrome2.java");
        System.out.println("Checks to see if inputted word/phrase is a "
                + "palindrome not using recursion (iterative method).");

        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a word/phrase to check to see if it's a "
                    + "palindrome.");
            String s = kb.nextLine();
            s = s.toLowerCase();
            s = s.replaceAll("\\W", "");
            if (isPalindromeIter(s)) {
                System.out.println("Palindrome = TRUE");
            } else {
                System.out.println("Palindrome = FALSE");
            }
            System.out.print("Check another word/phrase? ('no' to stop): ");
            String resp = kb.nextLine();
            if (resp.equals("no")) {
                break;
            }
        }
    }
}
