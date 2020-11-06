package e230.pkg;

// @author Michael Kester
public interface DeckofCardsInterface {

    public void shuffle();
    // shuffles the deck of cards and resets deal
    // to beginning of deck

    public int cardsLeft();
    // returns number of undealt cards

    public Card dealCard();
    // if all cards dealt, shuffles cards
    // returns next card

    public String toString();
    // returns a string representing the entire deck of cards
}
