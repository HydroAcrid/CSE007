/*
Kevin Dotel
12/4/21
CSE 7: HW
This is the Deck program
*/
import java.util.*;
public class Deck extends Card {

    private Card[] deck = new Card[52];
    private int nextCard;

    public Deck() {
    }

    public Deck(Card[] deck) {
    }

    public Card[] getDeck() {
        return deck;
    }

    
    public void shuffle() {
        Random rand = new Random();
        //Randomizer 
        for(int i = 0; i < deck.length; i++) {
            int f = rand.nextInt(deck.length);
            Card temp = deck[i];
            deck[i] = deck[f];
            deck[f] = temp;
        }
        //Shuffled Deck Code 
        // System.out.println();
        // System.out.println("Shuffled deck of cards");
        // for (int i = 0; i < 52; i++) {
        //     System.out.print(deck[i]);
        // }

    }

    public String[] dealCard(Card[] deck) {

        //Variables
        String[] card = new String[1];
        int count = 0;

        //Deals next card
        System.out.println("Next card");
        do {
            for (int i = 0; i < 5; i++) {
                card[i] = deck[0];
                System.out.print(card[i]);
                for (int j = 0; j < deck.length - 1; j++) {
                    deck[j] = deck[j+1];
                    ++count;
                }
            }

        }while(count < 1);

        return card;
    }
    
}
