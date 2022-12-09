import java.util.Random; 
import java.util.Scanner;
public class Craps {
    public static void main(String[] args) {
        
        //variables
        Scanner scnr = new Scanner(System.in);
        int min = 1;
        int max = 6;
        int random1 = (int)(Math.random()*(max - min + 1) + min);
        int random2 = (int)(Math.random()*(max - min + 1) + min);
        int choice = 0;
        boolean correct = true; 
        int num1 = 0;
        int num2 = 0;
        

        //Intro 
        System.out.println("Welcome to Kevin's Crap Game! Think you got what it takes?");
        System.out.println("Would you like a random dice roll or would you like to input your own dice numbers:?");

        //Question options
        System.out.println("1. Random dice roll");
        System.out.println("2. Choose dice numbers");

        //Initial choice integer recognition
        do {
            correct = scnr.hasNextInt();
            if(correct == false) {
                System.out.println("You did not enter an integer value");
                System.out.println("1. Random dice roll");
                System.out.println("2. Choose dice numbers");
                scnr.nextLine();
            }
            else {
                choice = scnr.nextInt();
                scnr.nextLine();
            }
        } while (!correct);

        //Option Recognition 
        switch (choice) {
            case 1 : System.out.println("You have chosen option 1."); 
                System.out.println("Your numbers are " + random1 + " and " + random2);
                num1 = random1;
                num2 = random2;
                
                //Dice Combinations
                if((num1 == 1) && (num2 == 1)) {
                    System.out.println("You got: Snake Eyes!");
                }
                else if((num1 == 2) && (num2 == 1)) {
                    System.out.println("You got: Ace Deuce!");
                }
                else if((num1 == 2) && (num2 == 2)) {
                    System.out.println("You got: Hard Four!");
                }
                else if((num1 == 3) && (num2 == 1)) {
                    System.out.println("You got: Easy Four!");
                } 
                else if((num1 == 3) && (num2 == 2)) {
                    System.out.println("You got: Fever Five!");
                }
                else if((num1 == 3) && (num2 == 3)) {
                    System.out.println("You got: Hard Six!");
                }
                else if((num1 == 4) && (num2 == 1)) {
                    System.out.println("You got: Fever Five");
                }
                else if((num1 == 4) && (num2 == 2)) {
                    System.out.println("You got: Hard Six!");
                }
                else if((num1 == 4) && (num2 == 3)) {
                    System.out.println("You got: Seven Out!");
                }
                else if((num1 == 4) && (num2 == 4)) {
                    System.out.println("You got: Hard Eight!");
                }
                else if((num1 == 5) && (num2 == 1)) {
                    System.out.println("You got: Hard Six!");
                }
                else if((num1 == 5) && (num2 == 2)) {
                    System.out.println("You got: Seven Out!");
                }
                else if((num1 == 5) && (num2 == 3 )) {
                    System.out.println("You got: Easy Eight!");
                }
                else if((num1 == 5) && (num2 == 4)) {
                    System.out.println("You got: Nine!");
                }
                else if((num1 == 5) && (num2 == 5)) {
                    System.out.println("You got: Hard Ten!");
                }
                else if((num1 == 6) && (num2 == 1)) {
                    System.out.println("You got: Seven Out!");
                }
                else if((num1 == 6) && (num2 == 2)) {
                    System.out.println("You got: Easy Eight!");
                }
                else if((num1 == 6) && (num2 == 3)) {
                    System.out.println("You got: Nine!");
                }
                else if((num1 == 6) && (num2 == 4)) {
                    System.out.println("You got: Easy Ten!");
                }
                else if((num1 == 6) && (num2 == 5)) {
                    System.out.println("You got: Yo-Leven!");
                }
                else if((num1 == 6) && (num2 == 6)) {
                    System.out.println("You got: Boxcards!");
                }
                else {
                    System.out.println("You got: Nothing! Tough Luck!");
                }

            break;
            case 2 : System.out.println("You have chosen option 2.");
                    System.out.println("Please input two numbers from 1 to 6");
                do {  // First Integer recognizer
                    System.out.println("First number: ");
                    correct = scnr.hasNextInt();
                     if(correct == false) {
                        System.out.println("You did not enter a valid integer value");
                            scnr.nextLine();
                        }
                    else {
                        do {
                            System.out.println("Enter a number between 1 and 6: ");
                            num1 = scnr.nextInt();
                        }while (!(num1 < 7) && (num1 > 0) && correct);
                        //num1 = scnr.nextInt(); 
                        //scnr.nextLine();
                        }
                }while(!correct);

                do {  // Second Integer recognizer
                    System.out.println("Second number: ");
                    correct = scnr.hasNextInt();
                     if(correct == false) {
                        System.out.println("You did not enter a valid integer value");
                            scnr.nextLine();
                        }
                    else {
                        do {
                            System.out.println("Enter a number between 1 and 6: ");
                            num2 = scnr.nextInt();
                        }while (!(num2 < 7) && (num2 > 0) && correct);
                        //num2 = scnr.nextInt(); 
                        //scnr.nextLine();
                        }
                }while(!correct);
                System.out.println("Your numbers are " + num1 + " and " + num2);
                //Dice Recognizer
                if((num1 == 1) && (num2 == 1)) {
                    System.out.println("You got: Snake Eyes!");
                }
                else if((num1 == 2) && (num2 == 1)) {
                    System.out.println("You got: Ace Deuce!");
                }
                else if((num1 == 2) && (num2 == 2)) {
                    System.out.println("You got: Hard Four!");
                }
                else if((num1 == 3) && (num2 == 1)) {
                    System.out.println("You got: Easy Four!");
                } 
                else if((num1 == 3) && (num2 == 2)) {
                    System.out.println("You got: Fever Five!");
                }
                else if((num1 == 3) && (num2 == 3)) {
                    System.out.println("You got: Hard Six!");
                }
                else if((num1 == 4) && (num2 == 1)) {
                    System.out.println("You got: Fever Five");
                }
                else if((num1 == 4) && (num2 == 2)) {
                    System.out.println("You got: Hard Six!");
                }
                else if((num1 == 4) && (num2 == 3)) {
                    System.out.println("You got: Seven Out!");
                }
                else if((num1 == 4) && (num2 == 4)) {
                    System.out.println("You got: Hard Eight!");
                }
                else if((num1 == 5) && (num2 == 1)) {
                    System.out.println("You got: Hard Six!");
                }
                else if((num1 == 5) && (num2 == 2)) {
                    System.out.println("You got: Seven Out!");
                }
                else if((num1 == 5) && (num2 == 3 )) {
                    System.out.println("You got: Easy Eight!");
                }
                else if((num1 == 5) && (num2 == 4)) {
                    System.out.println("You got: Nine!");
                }
                else if((num1 == 5) && (num2 == 5)) {
                    System.out.println("You got: Hard Ten!");
                }
                else if((num1 == 6) && (num2 == 1)) {
                    System.out.println("You got: Seven Out!");
                }
                else if((num1 == 6) && (num2 == 2)) {
                    System.out.println("You got: Easy Eight!");
                }
                else if((num1 == 6) && (num2 == 3)) {
                    System.out.println("You got: Nine!");
                }
                else if((num1 == 6) && (num2 == 4)) {
                    System.out.println("You got: Easy Ten!");
                }
                else if((num1 == 6) && (num2 == 5)) {
                    System.out.println("You got: Yo-Leven!");
                }
                else if((num1 == 6) && (num2 == 6)) {
                    System.out.println("You got: Boxcards!");
                }
                else {
                    System.out.println("You got: Nothing! Tough Luck!");
                }
            break;
            default: System.out.println("Error.");
   
        }
                  
        
        



    }
    
}
