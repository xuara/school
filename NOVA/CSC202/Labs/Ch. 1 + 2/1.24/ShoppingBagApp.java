package e124.pkg;

// @author Michael Kester
import java.util.*;

public class ShoppingBagApp {

    public static void main(String[] args) {
        int input = 1;
        int count = 0;
        float cost = 0;
        double subTot = 0;
        double totCost = 0;

        Scanner kb = new Scanner(System.in);

        ShoppingBag theBag = new ShoppingBag(count, cost, 6);

        while (input != 0) {
            System.out.print("Enter count (use 0 to stop): ");
            if ((input = kb.nextInt()) != 0) {
                count += input;
                System.out.print("Enter cost: ");
                cost = kb.nextFloat();
                theBag.place(input, cost);
                subTot = theBag.getTotCost();
                totCost = theBag.totalCost();
            }
        }

        System.out.printf("The bag contains %d items. The retail cost of the "
                + "items is $%.2f.%n", count, subTot);
        System.out.printf("The total cost of the items is $%.2f.%n", totCost);
    }
}
