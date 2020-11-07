package e427h.pkg;

// @author Michael
import java.util.*;

public class Euclid {

    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else if (m < n) {
            return gcd(n, m);
        } else {
            return gcd(n, m % n);
        }
    }

    public static void main(String[] args) {
        System.out.println("Euclid.java");
        System.out.println("Greatest common divisor program using recursion.");

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
