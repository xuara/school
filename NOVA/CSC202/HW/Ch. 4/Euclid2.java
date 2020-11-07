package e427h.pkg;

// @author Michael
import java.util.*;

public class Euclid2 {

    static int gcd(int m, int n) {
        int gcd = 1;

        if (m > n) {
            for (int i = n; i >= 1; i--) {
                if (m % i == 0 && n % i == 0) {
                    return i;
                }
            }
        } else {
            for (int j = m; j >= 1; j--) {
                if (m % j == 0 && n % j == 0) {
                    return j;
                }
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println("Euclid2.java");
        System.out.println("Greatest common divisor program not using recursion"
                + " (iterative method).");

        Scanner conIn = new Scanner(System.in);
        int c = 1;

        while (c >= 0) {
            System.out.println("Input a pair of positive integers: ");
            System.out.print("Input the first number: ");
            int a = conIn.nextInt();
            System.out.print("Input the second number: ");
            int b = conIn.nextInt();

            System.out.print("Greatest common divisor of " + a + " and " + b
                    + " is: " + gcd(a, b) + "\n");
            System.out.print("Continue? (input any negative number to stop): ");
            c = conIn.nextInt();
            System.out.println();

        }
    }
}
