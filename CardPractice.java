import java.util.*;
public class CardPractice {
        
        ArrayList<Card> cards = new ArrayList<Card>();

    String[] values = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] suit = {"Club", "Spade", "Diamond", "Heart"};

    static boolean firstThread = true;
    public deck2(){
        for (int i = 0; i<suit.length; i++) {
            for(int j=0; j<values.length; j++){
                this.cards.add(new Card(suit[i],values[j]));
            }
        }
        //shuffle the deck when its created
        Collections.shuffle(this.cards);

    }

    public ArrayList<Card> getDeck(){
        return cards;
    }

    public static void main(String[] args){
        deck2 deck = new deck2();

        //print out the deck.
        System.out.println(deck.getDeck());
    }

}


//separate class

public class Card {


    private String suit;
    private String value;


    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }
    public Card(){}
    public String getSuit(){
        return suit;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }
    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }

    public String toString(){
        return "\n"+value + " of "+ suit;

    }
    
}
