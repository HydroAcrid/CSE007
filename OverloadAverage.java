/*
Kevin Dotel
10/23/21
CSE 7: Participation  
This is the OverloadAverage program. 
*/

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Scanner;
public class OverloadAverage {
    public static void main(String[] args) {
        Random rand = new Random();
        boolean correct = true;
        Scanner scnr = new Scanner(System.in);
        double [] doubleArray = {5.6, 7.8, 2.3, 8.6};
        int [] intArray = {4, 7, 8, 10, 15, 100, 75};
        int intAverage = findAverage(intArray);
        System.out.println("The int average is: " + intAverage);
        double doubleAverage = findAverage(doubleArray);
        System.out.println("The double average is: " + doubleAverage);

        //Intro
        System.out.println("Welcome to Kevin's OverloadAverage program! So much fun!");

        //Number selection
        System.out.println("Please enter a number between 2 and 25.");
        int intLength = getInt(scnr);

        //'i' or 'd' selection
        System.out.println("Please input one of these options: ");
        System.out.println("i. int array");
        System.out.println("d. double array");
        System.out.println("q. quit");


        do {
            String option = scnr.next();
            if(option.equals("i")) {
                System.out.println("You have chosen i");
                //Place int randomizer method here
                int [] newIntArray = getIntArray(intLength);
                intAverage = findAverage(newIntArray);
                System.out.println("The average is: " + intAverage);
                printMenu();
            }
            else if(option.equals("d")) {
                System.out.println("You have chosen d");
                //Place double randomizer method here
                double [] newDoubleArray = getDoubleArray(intLength);
                doubleAverage = findAverage(newDoubleArray);
                System.out.println("The average is: " + doubleAverage);
                printMenu();
            }
            else if(option.equals("q")) {
                System.out.println("Goodbye!");
                correct = false;
            }
            else {
                System.out.println("Please input a valid option");
            }

        }while(correct); 


    }

    //option i method
    public static int [] getIntArray(int intLength) {
        int [] intArray = new int[intLength];

        Random rand = new Random();
        int i;
        for(i = 0; i < intArray.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            intArray[i] = randomNum;
            System.out.println(intArray[i] + " " ); 
        }
        return intArray;

    }

    //option d method 
    public static double [] getDoubleArray(int intLength) {
        double [] doubleArray = new double[intLength];

        Random rand = new Random();
        for(int i = 0; i < doubleArray.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            doubleArray[i] = randomNum;
            System.out.println(doubleArray[i] + " " );

        }
        return doubleArray;


    }


    //Menu method
    public static void printMenu() {
        System.out.println("Please input one of these options: ");
        System.out.println("i. int array");
        System.out.println("d. double array");
        System.out.println("q. quit");
    }

    //Input validation method for 2-25
    public static int getInt(Scanner scnr) {
         boolean buggin = false;
         int intValue = 0;

         do {
             if(!scnr.hasNextInt()) {
                 System.out.println("You did not enter an integer value");
                 scnr.nextLine();
             }
             else {
                 intValue = scnr.nextInt();
                 if((intValue < 2) || (intValue > 25)) {
                     System.out.println("You did not enter a valid selection. Please input a number between 2 and 25 .");
                     scnr.nextLine();

                 }
                 else {
                     buggin = true;
                 }
                 
             }

         }while(!buggin);

         return intValue;
    }

    public static double findAverage(double [] numbers) {
        double total = 0;
        for(int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        return total / numbers.length;

    }

    public static int findAverage(int [] numbers) {
        int total = 0;
        for(int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        return total / numbers.length;

    }
    
}
