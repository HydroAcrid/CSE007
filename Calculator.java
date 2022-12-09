/*
Kevin Dotel
11/10/21
CSE 7: Lab 9 
This is my Calculator program
*/
import java.util.*;
public class Calculator {
    private double value;
    private static int operation = 0;
    Scanner scnr = new Scanner(System.in);

    public Calculator() {
        value = 0;
    }

    public double getDouble(Scanner scnr) {
        boolean buggin = false;
        int input;

        do {
            input = 0;
            if(!scnr.hasNextInt()) {
                System.out.println("You did not enter an integer value.");
                scnr.nextLine();
            }
            else {
                input = scnr.nextInt();
                buggin = true;
            }

        }while(!buggin);

        return input;
    }

    public void add (double value) {
        this.value += value;
        operation++;
    }

    public void subtract (double value) {
        this.value -= value;
        operation++;
    }

    public void multiply (double value) {
        this.value *= value;
        operation++;
    }

    public void divide (double value) {
        this.value /= value;
        operation++;
    }

    public void clear() {
        value = 0;
    }

    public double getValue() {
        return value;
    }

    public static int getOperations() {
        return operation;
    }

    
    
}
