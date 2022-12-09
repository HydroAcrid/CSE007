/*
Kevin Dotel
10/6/21
CSE 7: HW 4 
This is the CardGame program. 
*/
import java.util.Random;
import java.util.Scanner;
public class cardGame {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        //Suits club, heart, spade or diamond 
        String[] suitNames = {"C", "H", "S", "D"};
        String[] rankNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int[] deck = new int[52]; 
        String[] hand1 = new String[5];
        String[] hand2 = new String[5];
        int count = 0;

        //Intro
        System.out.println("Welcome to Kevin's Card Game! Tons of Fun!!!");

        //Unshuffled Deck Code 
        System.out.println("Unshuffled deck of cards");
        for(int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        //Displays the deck 
        for(int i = 0; i < 52; i++) {
            String suitName = suitNames[deck[i] / 13]; //By using 13, I was able to match each card combination 
            String rankName = rankNames[deck[i] % 13];
            System.out.print(suitName + rankName + " ");
        }

        //Shuffled Deck Code
        System.out.println();
        System.out.println("Shuffled deck of cards");
        Random rand = new Random();
        int j;

        //Randomizer for deck shuffle
        for(int i = 0; i < deck.length; i++) {
            j = rand.nextInt(deck.length);
            int temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }

        
        //Displays shuffled deck 
        for (int i = 0; i < deck.length; i++) {
            String suit = suitNames[deck[i] / 13];
            String rank = rankNames[deck[i] % 13];
            System.out.print(suit + rank + " ");
            String set = suit + rank;
            //Hand1 Code 
            while(count > deck.length) {
                System.out.println(set);
                count++;
                deck[i] = set;
            }
          }
          


        /*
        //Hand1 Code x
        while(count > deck.length) {
            System.out.println();
            count++;
        }
        */




        



        



    }
    
}
