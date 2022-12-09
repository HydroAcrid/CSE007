/*
Kevin Dotel
9/15/21
CSE 7: Lab 1
This is the addition practice program. 
*/

import java.util.Random;
import java.util.Scanner;
public class AdditionPractice {
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        int num1;
        int num2;
        int answer;
        int guess;

        //Random integers 
        Random rand = new Random();
        num1 = rand.nextInt(9) + 1;
        num2 = rand.nextInt(9) + 1; 

        System.out.println("Your integers are " + num1 + " + " + num2);
        System.out.println("What does " + num1 + " + " + num2 + " = ?");
        guess = scnr.nextInt();
        answer = num1 + num2;

        if (guess == answer) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }




        




    }
    
}
