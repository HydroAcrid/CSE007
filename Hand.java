/*
Kevin Dotel
12/4/21
CSE 7: HW
This is the Card program
*/
public class Hand extends Card {
    
    private Card[] hand; 

    public Hand() {
    }

    public Hand(int size) {
        hand = new Card[size];
    }

    public String displayHand(Card[] deck) {
        int count = 0;
        System.out.println("Hand");
        do {
            for (int i = 0; i < 5; i++) {
                hand[i] = deck[0];
                System.out.print(hand[i]);
                for (int j = 0; j < deck.length - 1; j++) {
                    deck[j] = deck[j+1];
                    ++count;
                }
            }
        }while(count < 2);

        return hand;

    }


    //There is a hand array
    //a card must be added into this array 
    public String addCard(Card[] deck) { //Finish this one later  //Update: Maybe this works? Ill see later

        int count = 0;
        System.out.println("Hand");
        do {
            for (int i = 0; i < 5; i++) {
                hand[i] = deck[0];
                System.out.print(hand[i]);
                for (int j = 0; j < deck.length - 1; j++) {
                    deck[j] = deck[j+1];
                    ++count;
                }
            }
        }while(count < 1);

        return hand;

    }

    public String getSoftValue(Card[] hand) {

        int score;

        for (int i = 0; i < 5; i++) {
            String deckValue1 = hand[i].substring(1,2); 
            System.out.println(deckValue1);

        switch (deckValue1) {
            case "2" :
                score += 2;
                break;
            case "3" :
                score += 3;
                break;
            case "4" :
                score += 4;
                break;
            case "5" :
                score += 5;
                break;
            case "6" :
                score += 6;
                break;
            case "7" :
                score += 7;
                break;
            case "8" :
                score += 8;
                break;
            case "9" :
                score += 9;
                break;
            case "10":
            case "J" :
            case "Q" :
            case "K" :
                score += 10;
                break;
            case "A":
                score += 11;
                break;
        }
    }

    System.out.println("The value of current hand is: " + score);

        return score;
    }

    public String getHardValue(Card[] hand) {

        int score;

        for (int i = 0; i < 5; i++) {
            String deckValue1 = hand[i].substring(1,2); 
            System.out.println(deckValue1);

        switch (deckValue1) {
            case "2" :
                score += 2;
                break;
            case "3" :
                score += 3;
                break;
            case "4" :
                score += 4;
                break;
            case "5" :
                score += 5;
                break;
            case "6" :
                score += 6;
                break;
            case "7" :
                score += 7;
                break;
            case "8" :
                score += 8;
                break;
            case "9" :
                score += 9;
                break;
            case "10":
            case "J" :
            case "Q" :
            case "K" :
                score += 10;
                break;
            case "A":
                score += 1;
                break;
        }
    }

    System.out.println("The value of current hand is: " + score);

        return score;
    }





    




    

    


    
}
