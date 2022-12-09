/*
Kevin Dotel
12/4/21
CSE 7: HW
This is the Card program
*/
public class Card {
    
    private String rank; //0-12 (a-k)
    private String suit; //0-3 (C, H, S, D)
    private String[] rankName = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private String[] suitName = {"C", "H", "S", "D"};

    public Card() {
    }

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String[] getRankName() {
        return rankName;
    }

    public String[] getSuitName() {
        return suitName;
    }
    
}
