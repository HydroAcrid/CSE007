/*
Kevin Dotel
9/18/21
CSE 7: Lab 1
This is the Average program.
*/
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
   // must declare variables before using
   // declaring and initializing the Scanner Class
   Scanner myScanner = new Scanner(System.in);
   boolean correct = true; 
   int number;
   int i = 0;
   int total = 0;
   double average = 0;  

    
    // reads input for integers.
    while(i < 5) {
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
    }
    System.out.println("Your average is: " + total / 5);
    
    
   
   








   /*
   String name;      // showing an example of String
   char middleName;  // when using two words to define a variable alwasy uppercase the first character in the second workd
   int pin;  
   int transType;  
   
   // variables used for calculations should often be intialized to zero at the time declaration
   double amountDeposit = 0;   
   double amountWithdraw = 0;
   long acctNum;  // the long datatype allows us to store larger numbers
   double feeTotal = 0;
   boolean fee;
   final double checkFee = 1.5; //constant for every 25 dollars withdrawn we will apply 1.5 dollar fee
   int transactionCount = 0;
   double acctBalance = 1000;   
   boolean correct = true;

   // this begins the code for the ATM menu system
       System.out.println("ATM System");
   do{ 
       System.out.println("Enter your account number");
       correct = myScanner.hasNextLong();
       if(!correct) {
           System.out.println("You did not eneter an integer value");
       }
       else {
           acctNum = myScanner.nextLong(); // reads a long value from the terminal
       }
   }   while(!correct); 
       System.out.println("Enter your pin");
       pin = myScanner.nextInt(); // reads an integer value from the terminal
       
   
       //do loop to continue to display the menu until the user chooses option 
      /* do{ 
           System.out.println("1. Check Balance");
           System.out.println("2. Get Cash");
           System.out.println("3. Deposit");
           System.out.println("4. Exit");
           System.out.println("Enter your choice");
           transType = myScanner.nextInt(); // reads an integer value from the terminal
           if(transType == 1){
               System.out.println("You entered check Balance");
           }
           else if(transType == 2){
               System.out.println("You entered get cash");
           }
           else if(transType == 3){
               System.out.println("You entered make deposit");
           }
           else if (transType == 4){
               System.out.println("Goodbye");
           }   
           else{
               System.out.println("Invalid Transaction");
           }  
       } while (transType != 4);
       */



    }
    
}
