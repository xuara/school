package e230.pkg;

// @author Michael Kester
public class DeckofCardsTest {

    public static void main(String[] args) {

        DeckofCards deck = new DeckofCards(); // constructs a deck of cards

        System.out.println(deck); // prints the initial state of the deck

        // shuffles the deck then draws a card 7 times
        for (int a = 7; a > 0; a--) {
            deck.shuffle();
            System.out.println("By being dealt the card at the top of the deck, "
                    + "you draw: " + deck.dealCard());
        }
    }
}
