package ch06.lists;

// @author Michael Kester
import java.util.*;

public class E6_41C {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        ArraySortedList l = new ArraySortedList();

        while (true) {
            System.out.print("Enter a description of a product: ");
            String s = kb.nextLine();

            System.out.print("Enter the cost of that product: ");
            String a = kb.nextLine();
            double d = Double.parseDouble(a);

            Product p = new Product(s, d);
            l.add(p);

            System.out.print("Is that all of the products? ('yes' to stop): ");
            String resp = kb.nextLine();
            if (resp.equalsIgnoreCase("yes")) {
                break;
            }
        }
        System.out.println("Product " + l);

        System.out.println("Enter a price range.");
        while (true) {
            System.out.println("Lower bound?");
            String a = kb.nextLine();
            double d = Double.parseDouble(a);

            System.out.println("Upper bound?");
            String b = kb.nextLine();
            double c = Double.parseDouble(b);

            System.out.printf("The products from $%.2f to $%.2f are: %n"
                    + Product.pRange(l, d, c) + "%n", d, c);

            System.out.print("Check another range? ('no' to stop): ");
            String resp = kb.nextLine();
            if (resp.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
