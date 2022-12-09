/*
Kevin Dotel
12/4/21
CSE 7: HW
This is the BlackJack program
*/
import java.util.*;
public class BlackJack {
    
    
    // private static Deck[] deck = new Deck[52];
    // private static Card[] hand = new Card[5];
    // private static Card rank = new Card[52];
    // private static Card suit = new Card[52];


    public static void main(String[] args) {
        //Variables
        Scanner scnr = new Scanner(System.in);
        String[] dk = new String[52];
        String[] rankName = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"}; //rank.getRankName();
        String[] suitName = {"C", "H", "S", "D"}; //suit.getSuitName();
        int count = 0;
        Deck[] deck = new Deck[52];

        //Intro
        System.out.println("Welcome to Kevin's BlackJack Simulator! So much fun!!!");

        //Unshuffled Card Deck Section
        
        System.out.println("The unshuffled deck: ");
        for (int i = 0; i < suitName.length; i++) {
            for (int j = 0; j < rankName.length; j++) {
                dk[count] = suitName[i] + rankName[j] + " ";
                System.out.print(dk[count]);
                count++;
            }
        }

        //Shuffled Card Deck Section
        Deck deck1 = new Deck();
        System.out.println();
        System.out.println("The shuffled deck: ");
        deck1.shuffle();







    }
}
