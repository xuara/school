package e126.pkg;

// @author Michael Kester
import java.util.*;

public class PolynomialApp {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Input a polynomial by typing degree then "
                + "coefficient from highest degree to lowest.");

        int deg = kb.nextInt();
        Polynomial poly = new Polynomial(deg);

        int coeff = kb.nextInt();
        poly.setCoefficient(deg, coeff);

        int coeff2 = kb.nextInt();
        poly.setCoefficient(2, coeff2);

        int coeff3 = kb.nextInt();
        poly.setCoefficient(1, coeff3);

        int coeff4 = kb.nextInt();
        poly.setCoefficient(0, coeff4);

        System.out.print("The current polynomial is: ");
        poly.displayPoly();

        System.out.print("Enter a value> ");
        float eval = kb.nextFloat();
        System.out.println("The result is " + poly.evaluate(eval));
        System.out.print("Continue?> ");
        String resp = kb.next();
        while (resp.equals("Yes") || resp.equals("yes")) {
            System.out.print("Enter a value> ");
            float eval2 = kb.nextFloat();
            System.out.println("The result is " + poly.evaluate(eval2));
            System.out.print("Continue?> ");
            resp = kb.next();
        }

    }
}
