package e711.pkg;
// @author Michael Kester

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice1 = new Invoice("A625", "hammer", 1, 8.99);
        Invoice invoice2 = new Invoice("C458", "nail", 13, 0.66);
        Invoice invoice3 = new Invoice("Z248", "screw", -5, -5.2);

        //displays info on invoice1
        System.out.printf("%s %s(s) @ $%.2f each: $%.2f%n", invoice1.getQuant(),
                invoice1.getPartDesc(), invoice1.getPrice(),
                invoice1.getInvoiceAmount());
        //displays info on invoice2
        System.out.printf("%s %s(s) @ $%.2f each: $%.2f%n", invoice2.getQuant(),
                invoice2.getPartDesc(), invoice2.getPrice(),
                invoice2.getInvoiceAmount());
        //displays info on invoice3
        System.out.printf("%s %s(s) @ $%.2f each: $%.2f%n", invoice3.getQuant(),
                invoice3.getPartDesc(), invoice3.getPrice(),
                invoice3.getInvoiceAmount());
        //displays the total
        System.out.printf("Total: $%.2f%n%n",
                (invoice1.getInvoiceAmount()
                        + invoice2.getInvoiceAmount()
                        + invoice3.getInvoiceAmount()));

    }//end main    
} //end class InvoiceTest
