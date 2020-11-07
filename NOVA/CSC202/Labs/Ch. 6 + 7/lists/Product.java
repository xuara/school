package ch06.lists;

// @author Michael
public class Product implements Comparable<Product> {

    private String desc;
    private double cost;

    public Product(String desc, double cost) {
        this.desc = desc;
        this.cost = cost;
    }

    public String getDesc() {
        return desc;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("%s @ $%.2f", getDesc(), getCost());
    }

    @Override
    public int compareTo(Product other) {
        if (this.cost < other.cost) {
            return -1;
        } else if (this.cost == other.cost) {
            return 0;
        } else {
            return +1;
        }
    }

    public static String pRange(
            ArraySortedList<Product> pList, double lower, double upper) {
        String z = "";
        pList.reset();
        while (pList.currentPos < pList.size() - 1) {
            Product p = pList.getNext();
            double q = p.getCost();
            if (q >= lower && q <= upper) {
                z += p.getDesc() + " ";
            }
        }
        Product p = pList.getNext();
        double q = p.getCost();
        if (q >= lower && q <= upper) {
            z += p.getDesc() + " ";
        }
        return z;
    }
}
