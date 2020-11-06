package e230.pkg;

// @author Michael Kester
public class DeckofCards implements DeckofCardsInterface {

    int cardsUsed, temp;
    private final Card[] DeckofCards;

    // constructor: creates an unshuffld deck of cards, ordered by rank
    public DeckofCards() {
        DeckofCards = new Card[52];
        int i = 0;
        for (int rank = 1; rank <= 13; rank++) {
            for (int suit = 1; suit <= 4; suit++) {
                this.DeckofCards[i] = new Card(rank, suit);
                i++;
            }
        }
    }

    // shuffles the deck of cards and resets deal
    // to beginning of deck
    @Override
    public void shuffle() {
        System.out.println("The deck has been shuffled.\n");
        for (int i = DeckofCards.length - 1; i > 0; i--) {
            int r = (int) (Math.random() * (i + 1));
            Card t = DeckofCards[i];
            DeckofCards[i] = DeckofCards[r];
            DeckofCards[r] = t;
        }
        cardsUsed = 0;
    }

    // returns number of undealt cards
    @Override
    public int cardsLeft() {
        return DeckofCards.length - cardsUsed;
    }

// if all cards dealt, shuffles cards
// returns next card
    @Override
    public Card dealCard() {
        if (cardsUsed == DeckofCards.length) {
            shuffle();
        }
        for (int i = DeckofCards.length - 1; i > 0; i--) {
            temp = i;
            return cardAt(temp);
        }
        cardsUsed++;
        return cardAt(temp);
    }

    // returns a copy of the card at the specified index in DeckifCards array
    public Card cardAt(int index) {
        if (index < 0 | index >= 52) {
            throw new IllegalArgumentException(); // not in array
        } else {
            return new Card(this.DeckofCards[index].getRank(),
                    this.DeckofCards[index].getSuit());
        }
    }

    // returns a string representing the entire deck of cards
    @Override
    public String toString() {
        String printer = "The deck looks like (bottom to top):\n";
        for (int i = 0; i < DeckofCards.length; i++) {
            printer += cardAt(i).toString();
        }
        return printer;
    }
}
