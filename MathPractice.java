/*
Kevin Dotel
9/15/21
CSE 7: Lab 1
This is the math practice program.
*/

import java.util.Random;
import java.util.Scanner;
public class MathPractice {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        int num1;
        int num2;
        int answer;
        int guess;
        int choice1;

        while(true) { 
            System.out.println("Welcome to the Math Program!");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Quit Program");
            System.out.println("Enter your choice");

            choice1 = scnr.nextInt();
            //Addition
            if (choice1 == 1){
                num1 = rand.nextInt(9) + 1;
                num2 = rand.nextInt(9) + 1;

                System.out.println("You have selected: Addition");
                System.out.println("What does " + num1 + " + " + num2 + " = ?");
                guess = scnr.nextInt();
                answer = num1 + num2;

                if (guess == answer) {
                System.out.println("Correct");
                    }
                else {
                System.out.println("Incorrect");
                    }
            }
            //Subtraction
            else if(choice1 == 2){
                num1 = rand.nextInt(9) + 1;
                num2 = rand.nextInt(9) + 1;

                System.out.println("You have selected: Subtraction");
                System.out.println("What does " + num1 + " - " + num2 + " = ?");
                guess = scnr.nextInt();
                answer = num1 - num2;

                if (guess == answer) {
                System.out.println("Correct");
                    }
                else {
                System.out.println("Incorrect");
                    }
            }
            //Multiplication
            else if(choice1 == 3){
                num1 = rand.nextInt(9) + 1;
                num2 = rand.nextInt(9) + 1;

                System.out.println("You have selected: Multiplication");
                System.out.println("What does " + num1 + " * " + num2 + " = ?");
                guess = scnr.nextInt();
                answer = (num1 * num2);

                if (guess == answer) {
                System.out.println("Correct");
                    }
                else {
                System.out.println("Incorrect");
                    }
                }

            //Division
            else if(choice1 == 4){
                num1 = rand.nextInt(9) + 1;
                num2 = rand.nextInt(9) + 1;

                System.out.println("You have selected: Division");
                System.out.println("What does " + num1 + " / " + num2 + " = ?");
                guess = scnr.nextInt();
                answer = (num1 / num2);

                if (guess == answer) {
                System.out.println("Correct");
                    }
                else {
                System.out.println("Incorrect");
                    }
            }

            //exit
            else if(choice1 == 5){
                System.out.println("Goodbye!");
                System.exit(0);
            }



        }



    }
    
}
