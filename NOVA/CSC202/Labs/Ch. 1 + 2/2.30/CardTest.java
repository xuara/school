package e230.pkg;

// @author Michael Kester
public class CardTest {

    public static void main(String[] args) {

        Card a = new Card(13, 3);
        System.out.println("Numbered suit is: " + a.getSuit());
        System.out.println("This card is: " + a);
        System.out.println();

        Card b = new Card(0, 10);
        System.out.println("Numbered suit is: " + b.getSuit());
        System.out.println("This card is: " + b);
        System.out.println();

        Card c = new Card(1, 4);
        System.out.println("Numbered suit is: " + c.getSuit());
        System.out.println("This card is: " + c);
        System.out.println();

        Card d = new Card(22, 2);
        System.out.println("Numbered suit is: " + d.getSuit());
        System.out.println("This card is: " + d);
    }
}
