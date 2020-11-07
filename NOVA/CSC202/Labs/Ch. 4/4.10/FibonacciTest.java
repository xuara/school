package e410.pkg;

// @author Michael
import java.util.*;

public class FibonacciTest {

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static int fib(int n) {
        int fold1 = 1; //declares first Fibonacci number
        int fold2 = 1; //declares second Fibonacci number
        int fnew = 1; //declares new Fibonacci number

        //for loop that calculates Fibonacci number
        for (int i = 3; i <= n; i++) {
            fnew = fold1 + fold2;
            fold1 = fold2;
            fold2 = fnew;
        }
        return fnew;
    }

    public static void main(String[] args) {
        System.out.println("Enter a positive integer.");
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println("The " + n + " number in the Fibonacci sequence"
                + " (found recursively) is: " + fibonacci(n) + "\n");

        System.out.println("Enter a positive integer.");
        int nn = kb.nextInt();

        System.out.println("The " + nn + " number in the Fibonacci sequence"
                + " (found non-recursively) is: " + fib(nn));
    }
}

/*
Exercise 4.10, Part D
The recursive method takes much longer to complete than the iterative method,
therefore it is must less efficient than the iterative method.
 */
