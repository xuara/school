package e124.pkg;

// @author Michael
public class ShoppingBag {

    private int numItmsInBag;
    private int itmsInBag;
    private double subTot;
    private float taxRate;

    //ShoppingBag constructor that accepts 3 parameters + taxrate as float param
    public ShoppingBag(int numItmsInBag, double subTot, float taxRate) {
        if (numItmsInBag >= 0) {
            this.numItmsInBag = numItmsInBag;
            this.itmsInBag = numItmsInBag;
        } else {
            System.out.println("Invalid input: number of items in bag must be "
                    + "greater than zero.");
        }
        if (subTot >= 0.0) {
            this.subTot = (subTot * numItmsInBag);
        } else {
            System.out.printf("Invalid input: the total cost must be greater "
                    + "than zero.%n");
        }
        if (taxRate >= 0) {
            this.taxRate = taxRate;
        } else {
            System.out.printf("Invalid input: the tax rate must be greater than"
                    + " zero.%n");
        }
    }

    //transformer method that places items with a cost attribute in the bag
    public void place(int itmsInBag, float itmCost) {
        System.out.printf("%d item(s) placed in the bag at $%.2f each.%n",
                itmsInBag, itmCost);
        this.itmsInBag = itmsInBag;
        numItmsInBag += itmsInBag;
        this.subTot += (itmsInBag * itmCost);
    }

    //method to return total cost before tax
    public double getTotCost() {
        return subTot;
    }

    //method to return total cost with tax
    public double totalCost() {
        return (getTotCost() * ((taxRate / 100) + 1));
    }

    @Override
    public String toString() {
        return String.format("%n%s%d%n%s%.2f%n%s%.2f", "Total number of items "
                + "in the bag is: ", getNumItmsInBag(), "The subtotal of "
                + "everything in the bag is: $", getTotCost(), "The "
                + "total cost of everything in the bag is: $", totalCost());
    }

    public int getNumItmsInBag() {
        return numItmsInBag;
    }

    public int getItmsInBag() {
        return itmsInBag;
    }

} //end class ShoppingBag
