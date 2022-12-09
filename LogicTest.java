/*Kevin Dotel
9/9/21
CSE 7: Lab 1 
This program is for the logic test. 
*/
import java.util.Random;
import java.util.Scanner;

public class LogicTest {
    public static void main(String[] args) {


    

    //random number generator 
    Random rand = new Random();
    int num = rand.nextInt(100) + 1; 
    if ( num % 4 == 0 && num % 9 == 0) {
        num = 1; 
    } 

    boolean randNum = (num % 4 == 0 && num % 9 == 0);
    boolean randNum2 = (num % 4 == 0 || num % 9 == 0);
    boolean randNum3 = (num % 4 == 0 ^ num % 9 == 0);
    boolean answer;


    //Scanner 
    Scanner scnr = new Scanner(System.in);

    System.out.println("Random integer (1-100): " + num); 
    System.out.println("Is " + num + " divisble by 4 and 9?");
    boolean boon = scnr.nextBoolean(); 
    answer = boon == randNum;
    System.out.println("Your guess: " + boon);
    System.out.println("Answer: " + randNum);
    System.out.println("Feedback: your guess was " + answer);

    System.out.println("Is " + num + " divisible by 4 or 9?");
    boon = scnr.nextBoolean();
    answer = boon == randNum2;
    System.out.println("Your guess: " + boon);
    System.out.println("Answer: " + randNum2);
    System.out.println("Feedback: your guess was " + answer);

    System.out.println("Is " + num + " divisible by 4 xor 9?");
    boon = scnr.nextBoolean();
    answer = boon == randNum3;
    System.out.println("Your guess: " + boon);
    System.out.println("Answer: " + randNum3);
    System.out.println("Feedback: your guess was " + answer);
    





    


    //boolean logcial operator 
    

        /*
    System.out.println("!bool1 && !bool2 || bool3 = " + (!bool1 && !bool2 || bool3));
    System.out.println("bool2 || bool4 ^ bool5 = " + (bool2 || bool4 ^ bool5));
    System.out.println("!(bool1 ^ !bool4) && bool2 = " + (!(bool1 ^ !bool4) && bool2));
    System.out.println("bool3 || !(bool5 && bool2 = " + (bool3 || !(bool5 || bool2))); 
    System.out.println("bool1 && (bool4&&bool2) ^ bool5 && bool3 = " + (bool1 && (bool4&&bool2) ^ bool5 && bool3));
        */
    









    }
}
