package e421.pkg;

import java.util.*;
// @author Michael

public class SquareRoot {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the number to approximate a square root: ");
        double n = kb.nextDouble();

        System.out.print("Enter the approximation: ");
        double a = kb.nextDouble();

        System.out.print("Enter the tolerance: ");
        double t = kb.nextDouble();

        System.out.println("Recursively: " + sqrRoot(n, a, t));
        System.out.println("Non-recursively: " + squareRoot(n, a, t));
    }

    // recursive method
    public static double sqrRoot(double num, double approx, double tol) {
        double a = (((approx * approx) + num) / (2 * approx));
        if (Math.abs((approx * approx) - num) <= tol) {
            return approx;
        } else {
            return sqrRoot(num, a, tol);
        }
    }

    // iterative method
    public static double squareRoot(double num, double approx, double tol) {
        while (Math.abs((approx * approx) - num) > tol) {
            approx = ((approx * approx) + num) / (2 * approx);
        }
        return approx;
    }
}
