package e422.pkg;

// @author Michael
import java.util.*;

public class Palindrome {

    static boolean isPalindromeRec(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindromeRec(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Palindrome.java");
        System.out.println("Checks to see if inputted word/phrase is a "
                + "palindrome using recursion.");

        Scanner kb = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a word/phrase to check to see if it's a "
                    + "palindrome.");
            String s = kb.nextLine();
            s = s.toLowerCase();
            s = s.replaceAll("\\W", "");
            if (isPalindromeRec(s)) {
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
