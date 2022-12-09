/*
Kevin Dotel
11/10/21
CSE 7: Lab 9 
This is my CalculatorTest program
*/
import java.util.*;
public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double value1;
        double value2;
        Calculator c = new Calculator();
        Calculator c2 = new Calculator();
        System.out.println("Input x value");
        double x = 10; //getDouble();
        x = c.getDouble(scnr);
        System.out.println("Input y value");
        double y = 5; //getDouble();
        y = c.getDouble(scnr);
        System.out.println("Before any operations: " + c.getValue());
        c.add(7);
        c.getValue();
        System.out.println("Operation 1: " + c.getValue());
        System.out.println("Number of operations so far: " + c.getOperations());
        c.multiply(x);
        System.out.println("Operation 2: " + c.getValue());
        System.out.println("Number of operations so far: " + c.getOperations());
        c.add(y);
        System.out.println("Operation 3: " + c.getValue());
        System.out.println("Number of operations so far: " + c.getOperations());
        c.subtract(13);
        System.out.println("Operation 4: " + c.getValue());
        System.out.println("Number of operations so far: " + c.getOperations());
        c.divide(4);
        System.out.println("Operation 5: " + c.getValue());
        System.out.println("Number of operations so far: " + c.getOperations());
        System.out.println("Value is: " + c.getValue());
        c.clear();
        System.out.println("Cleared value is: " + c.getValue());

        System.out.println("Alright, this is round two for the lab example with doubles x, y, and z");
        System.out.println("Input x value: ");
        x = c.getDouble(scnr);
        System.out.println("Input y value: ");
        y = c.getDouble(scnr);
        System.out.println("Input z value: ");
        double z = c.getDouble(scnr);

        //calculation section 1
        c.add(4);
        System.out.println("Operation 1: " + c.getValue());
        c.multiply(x);
        System.out.println("Operation 2: " + c.getValue());
        c.multiply(x);
        System.out.println("Operation 3: " + c.getValue());
        c.multiply(y);
        System.out.println("Operation 4: " + c.getValue());
        c.subtract(6);
        System.out.println("Operation 5: " + c.getValue());
        //For loop exponent
        for(int i = 0; i < z; i++) {
            c.multiply(x);
        }
        System.out.println("Operation 6: " + c.getValue());
        c.add(3);
        System.out.println("Operation 7: " + c.getValue());
        c.multiply(y);
        value1 = c.getValue();
        System.out.println("Numerator value is: " + value1);
        c.clear();

        //calculation section 2 
        c.add(5);
        System.out.println("Operation 8: " + c.getValue());
        c.multiply(x);
        System.out.println("Operation 9: " + c.getValue());
        c.multiply(y);
        System.out.println("Operation 10: " + c.getValue());
        c.add(7);
        System.out.println("Operation 11: " + c.getValue());
        c.multiply(z);
        System.out.println("Operation 12: " + c.getValue());
        c.subtract(1);
        System.out.println("Operation 13: " + c.getValue());
        value2 = c.getValue();
        System.out.println("Denominator value is: " + value2);
        c.clear();

        //Final calculation
        c.add(value1);
        c.divide(value2);
        System.out.println("Value is: " + c.getValue());
        System.out.println("Number of operations so far: " + c.getOperations());








        


        //For loop exponent example
        for(int i = 0; i < z; i++) {
            c.multiply(x);
        }








        
    }
}
