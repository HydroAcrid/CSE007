/*
Kevin Dotel
11/3/21
CSE 7: Midterm 2 
This is the Midterm code 
*/
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;
import java.util.Arrays;
public class Midterm2Code {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        //Input validation method call 
        System.out.println("Enter a length");
        int arrayLength = getInt(scnr);

        //Code for random array
        System.out.println("Your random array is: ");
        int [][] randArray = randArray(arrayLength);
        System.out.println(randArray);

        //Code for mean and method call 
        double mean = getMean(randArray);
        System.out.println("The mean of row 1 is: " + mean);

    }

    public static int getInt(Scanner scnr) { //This input validation code is from a previous homework assignment 
                boolean buggin = false;
                int intValue = 0;
        
                do {
                    if(!scnr.hasNextInt()) {
                        System.out.println("You did not enter an integer value");
                        scnr.nextLine();
                    }
                    else {
                        intValue = scnr.nextInt();
                        if((intValue < 2) || (intValue > 10)) {
                            System.out.println("You did not enter a valid selection. Please input a number between 2 and 10.");
                            scnr.nextLine();
        
                        }
                        else {
                            buggin = true;
                        }
                        
                    }
        
                }while(!buggin);
        
                return intValue;
           }

    public static int [][] randArray(int intValue) {
        int [][] randArray = new int[intValue][intValue];

        for(int i = 0; i < randArray.length; i++) {
            for(int j = 0; j < randArray[i].length; j++) {
            int randNum = ThreadLocalRandom.current().nextInt(1, 100 + 1);
            randArray[i][j] = randNum;
            //randArray[i][j] = (int)(Math.random()*100 +1);
            }

        }
        return randArray;

    }

    public static double getMean(int [][] randArray) { //This was taken from an example done in class
        double avg, sum=0;
        int count = 0;
        for(int j = 0; j < randArray.length; j++){
            for(int i = 0; i<randArray[j].length; i++){
                sum += randArray[j][i];
                count++;
                }
            }
        avg = sum / randArray.length;
        return avg;
    }

    public static double getRange(int [][] randArray) {
        double range = 0;
        for(int k = 0; j < randArray.length; j++) {
            for(int i = 0; i < randArray[j].length; i++) {
                
            }
        }
    }


    
}
