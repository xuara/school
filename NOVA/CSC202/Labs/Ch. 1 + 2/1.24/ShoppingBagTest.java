package e124.pkg;

// @author Michael Kester
public class ShoppingBagTest {

    public static void main(String[] args) {

        ShoppingBag myBag = new ShoppingBag(5, 9.98, 5.3f);

        System.out.printf("The number of items in the bag is currently: "
                + "%d%n", myBag.getNumItmsInBag());
        System.out.printf("Initial subtotal is: $%.2f%n", myBag.getTotCost());
        System.out.printf("Ihe tax rate is set to : %.1f percent%n%n", 5.3);

        myBag.place(5, 9.99f);
        myBag.place(1, 298.99f);

        System.out.println(myBag.toString());
    }
} //end class ShoppingBagTest
