package e230.pkg;

// @author Michael Kester
public class Card {

    final static int CLUBS = 1, DIAMONDS = 2, HEARTS = 3, SPADES = 4;

    final static int ACE = 1, JACK = 11, QUEEN = 12, KING = 13;

    final int rank, suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return getRankString() + " of " + getSuitString()+"\n";
    }

    public int getRank() {
        return rank;
    }

    public int getSuit() {
        return suit;
    }

    public String getSuitString() {
        switch (suit) {
            default:
                return "NOT A VALID SUIT";
            case CLUBS:
                return "Clubs";
            case DIAMONDS:
                return "Diamonds";
            case HEARTS:
                return "Hearts";
            case SPADES:
                return "Spades";
        }
    }

    public String getRankString() {
        switch (rank) {
            default:
                return "NOT A VALID RANK";
            case 1:
                return "Ace";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
        }
    }
}
