/*
Kevin Dotel
9/18/21
CSE 7: Lab 1
This is the Average2 program.
*/
import java.util.Scanner;
public class Average2 {
    public static void main(String[] args) {
        
    //Variables
   Scanner myScanner = new Scanner(System.in);
   boolean correct = true; 
   int number;
   int total = 0;
   double average = 0;  
   int numberinAverage = 0;
   int countNums = 0;
   int i = 0;
   boolean valid = false; 

    do { //Loop for checking that you inputted an number average
        System.out.println("How many numbers are you inputtinng?");
        correct = myScanner.hasNextInt();
        if (correct == false) {
            System.out.println("Please enter a valid integer");
            myScanner.nextLine();
        }
        else {
            countNums = myScanner.nextInt();
            myScanner.nextLine();
        }
    }while (!correct);

    //Loop for inputting numbers used for average
    while(i < countNums) {
        do {
            System.out.println("Enter a Number");
            correct = myScanner.hasNextInt();
            if(correct == false){
                System.out.println("You did not enter an integer value");
                myScanner.nextLine();
            }
            else {
                number = myScanner.nextInt(); //reads a long value from the terminal
                total = total + number;
                myScanner.nextLine();
            }
        } while(!correct);
        i++;
        //System.out.println(total / countNums);
    }
    System.out.println("Your average is: " + total / countNums);
    
    


    }
    
}
