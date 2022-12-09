import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimAverage1 {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        Random rand = new Random();
        boolean correct = true; 
        double [] doubleArray = new double[10];
        int [] intArray = new int[10];
        int intAverage = findAverage(intArray);
        double doubleAverage = findAverage(doubleArray);
        

        //Intro 
        System.out.println("Hello, welcome to Kevin's MultiDimAvergae program! This is too epic!!!");

        //Number intro
        System.out.println("Please enter number of columns: 2 - 25");
        int intLength = getInt(scnr);
        System.out.println("Please enter number of rows: 2 - 25");
        int columnLength = getInt(scnr);
        
        //'i' or 'd' selection
        System.out.println("Please input one of these options: ");
        System.out.println("i. int multidimensional array");
        System.out.println("d. double multidimensional array");
        System.out.println("q. quit");

        do {
            String option = scnr.next();
            if(option.equals("i")) {
                System.out.println("You have chosen i");
                //Place int randomizer method here
                int [][] newIntArray = getIntArray(intLength, columnLength);
                intAverage = findAverage(newIntArray);
                System.out.println("The average is: " + intAverage);
                printMenu();
            }
            else if(option.equals("d")) {
                System.out.println("You have chosen d");
                //Place double randomizer method here
                double [][] newDoubleArray = getDoubleArray(intLength, columnLength);
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
                    System.out.println("You did not enter a valid selection. Please input a number between 2 and 25");
                    scnr.nextLine();
                }
                else {
                    buggin = true;
                }
            }

        }while(!buggin);

        return intValue;
    }


    //option i method
    public static int [][] getIntArray(int intLength, int columnLength) {
        int [] intArray = new int[intLength];
        int [][] intMulti = new int[intLength][columnLength];

        Random rand = new Random();
        int i;
        for(i = 0; i < intMulti.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            intMulti[i][i] = randomNum;
            System.out.println(intMulti[i][i] + " " ); 
        }
        return intMulti;
    }

    //option d method 
    public static double [][] getDoubleArray(int intLength, int columnLength) {
        double [] doubleArray = new double[intLength];
        double [][] doubleMulti = new double[intLength][columnLength];

        Random rand = new Random();
        for(int i = 0; i < doubleMulti.length; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            doubleMulti[i][i] = randomNum;
            System.out.println(doubleMulti[i][i] + " " );

        }
        return doubleMulti;
    }

    //Menu method
    public static void printMenu() {
        System.out.println("Please input one of these options: ");
        System.out.println("i. int array");
        System.out.println("d. double array");
        System.out.println("q. quit");
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
