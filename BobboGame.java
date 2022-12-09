import java.util.Scanner;
import java.util.*;
public class BobboGame {

public static void main(String[] args) {
    System.out.println("How fascinating...");
    System.out.println("You're not supposed to be here and yet you came to me regardless.");
    System.out.println("Tell me, what is your name?");

    //Name Reaction
    Scanner scnr = new Scanner(System.in);
    //String sentence = "Tell me, what is your name?";
    String search1  = "bob";
    String search2 = "jason";
    String search3 = "fabian";
    int choice1 = 0;
    String ask = scnr.next();

    
        if(ask.toString().equals(search1)) {
            System.out.println("Wait bob? Yooo you're cracked my guy.");
        } 
        else if(ask.toString().equals(search2)) {
            System.out.println("Hey Jason I was able to figure this out I'm too good");
        }
        else if(ask.toString().equals(search3)) {
            System.out.println("Yooooo whats up fabian how you doing");
        }
        else {
           System.out.println("huh? that's a pretty weird name.");
        }
    while(true) {
        //First Question
        System.out.println("Anyways " + ask + ", tell me what you're doing here?");
        System.out.println("1. I don't know how I got here.");
        System.out.println("2. I came to find someone.");
        System.out.println("3. I came to find myself.");
        System.out.println("4. I'm outta here!");

        choice1 = scnr.nextInt();
        if(choice1 == 1){
            System.out.println("Really? That's quite unfortunate.");
        }
        else if(choice1 == 4){
            System.out.println("How rude. Get out!");
            System.exit(0);
        }

        int x = 0;
        int y = 0;
        boolean bool1 = true;

        (12 + (int)27.995 % 4 >= 0 ^ (double)1 != (x++) && (++x) != y || !bool1));



    }

        

    


}
}
