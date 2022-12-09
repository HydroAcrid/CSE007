/*
Kevin Dotel
10/7/21
CSE 7: HW 4 
This is the CardGame program. 
*/

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class TrueCardGame {
    public static void main(String[] args) {

        int choice = 0;
    do {
        Scanner scnr = new Scanner(System.in);
        //Suits club, heart, spade or diamond 
        String[] suitNames = {"C", "H", "S", "D"};
        String[] rankNames = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int num = suitNames.length * rankNames.length;
        String[] deck = new String[num]; 
        String[] hand1 = new String[5];
        String[] hand2 = new String[5];
        int count = 0;
        int f;
        int score1 = 0;
        int score2 = 0;
        String deckValue1;
        String deckValue2;
        
    
        //Intro
        System.out.println("Welcome to Kevin's Card Game! Tons of Fun!!!");

        
        //Unshuffled Deck Code 
        System.out.println("Unshuffled deck of cards");
        for (int i = 0; i < suitNames.length; i++) {
            for (int j = 0; j < rankNames.length; j++) {
                deck[count] = suitNames[i] + rankNames[j] + " ";
                System.out.print(deck[count]);
                count++;
            }
        }
        
        //Randomizer 
        Random rand = new Random();

        for(int i = 0; i < deck.length; i++) {
            f = rand.nextInt(deck.length);
            String temp = deck[i];
            deck[i] = deck[f];
            deck[f] = temp;

        }

        //Shuffled Deck Code
        System.out.println();
        System.out.println("Shuffled deck of cards");
        for (int i = 0; i < num; i++) {
            System.out.print(deck[i]);
        }

        //Hand1 Code 
        System.out.println();
        System.out.println("Hand 1");
        do{
        for (int i = 0; i < 5; i++) {
            hand1[i] = deck[0];
            System.out.print(hand1[i]);
            for (int j = 0; j < deck.length - 1; j++) {
                deck[j] = deck[j+1];
                ++count;
            }
        }

        //Hand2 Code 
        System.out.println();
        System.out.println("Hand 2");
        for (int i = 0; i < 5; i++) {
            hand2[i] = deck[0];
            System.out.print(hand2[i]);
            for (int j = 0; j < deck.length - 1; j++) {
                deck[j] = deck[j + 1];
                ++count;
            }
        }
        }while(count < 5);

        //First index value for Hand 1
        System.out.println();
        for (int i = 0; i < 5; i++) {
            deckValue1 = hand1[i].substring(1,2); //What the fuck? Why does this make it work
            System.out.println(deckValue1);

        switch (deckValue1) {
            case "2" :
                score1 += 2;
                break;
            case "3" :
                score1 += 3;
                break;
            case "4" :
                score1 += 4;
                break;
            case "5" :
                score1 += 5;
                break;
            case "6" :
                score1 += 6;
                break;
            case "7" :
                score1 += 7;
                break;
            case "8" :
                score1 += 8;
                break;
            case "9" :
                score1 += 9;
                break;
            case "10":
            case "J" :
            case "Q" :
            case "K" :
                score1 += 10;
                break;
            case "A":
                score1 += 11;
                break;
        }
    }
        System.out.println("Hand 1 score is: " + score1);

        //Second index value for Hand2
        for (int i = 0; i < 5; i++) {
            deckValue2 = hand2[i].substring(1,2); //What the fuck? Why does this make it work
            System.out.println(deckValue2);

        switch (deckValue2) {
            case "2" :
                score2 += 2;
                break;
            case "3" :
                score2 += 3;
                break;
            case "4" :
                score2 += 4;
                break;
            case "5" :
                score2 += 5;
                break;
            case "6" :
                score2 += 6;
                break;
            case "7" :
                score2 += 7;
                break;
            case "8" :
                score2 += 8;
                break;
            case "9" :
                score2 += 9;
                break;
            case "10":
            case "J" :
            case "Q" :
            case "K" :
                score2 += 10;
                break;
            case "A":
                score2 += 11;
                break;   
            default:
                System.out.println("does not work");
        }
    }
        System.out.println("Hand 2 score is: " + score2);

        //Score Calculation
        if(score1 > score2) {
            System.out.println("Hand 1 is the winner!");
        }
        else if(score1 < score2) {
            System.out.println("Hand 2 is the winner!");
        }
        else {
            System.out.println("The winner is neither! Error, no card is the winner becuase the first element cannot be read for some reason.");
        }

        //Play Again Question 
        System.out.println("Would you like to play again?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        choice = scnr.nextInt();
    
    }while(choice == 1);

        

    }
    
}
