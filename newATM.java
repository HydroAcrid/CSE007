/*
Kevin Dotel
9/18/21
CSE 7: Lab 1
This is the ATM2 program.
*/
import java.util.Scanner;
public class newATM{
// all programs begin with a class name. The class name and file name must be the same
//main method required for every java program
public static void main(String [] args){
   // must declare variables before using
   // declaring and initializing the Scanner Class
        Scanner myScanner = new Scanner(System.in);
        boolean receipt;   //used to see if customer wants a receipt
        String name;      // showing an example of String
        char middleName;  // when using two words to define a variable alwasy uppercase the first character in the second workd
        int pin;  
        double transType;  
        
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
               if(correct == false){
                   System.out.println("You did not enter an integer value");
                   myScanner.nextLine();
               }
               else{
                  acctNum = myScanner.nextLong(); // reads a long value from the terminal 
                  myScanner.nextLine();
               }
             } while(!correct);

          //PIN analysis
            do {
                System.out.println("Enter your pin");
                correct = myScanner.hasNextInt();
                if(correct == false){
                    System.out.println("You did not enter an integer value");
                    myScanner.nextLine();
                }
                else {
                pin = myScanner.nextInt();
                } 
            } while(!correct); 

            

            //do loop to continue to display the menu until the user 
            // chooses option
         /*   do{
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
            } while(transType != 4);
*/
//while loop to show the differenct between each type of loop 
 // chooses option

 //created a do while loop in order to detect whether the input is an integer or a character
    do{
        transType = 0;
        
        System.out.println("1. Check Balance");
        System.out.println("2. Get Cash");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        System.out.println("Enter your choice");

        //input analysis
        correct = myScanner.hasNextInt();
        if(!correct) {
            System.out.println("You did not enter an integer value");
            myScanner.nextDouble();
        }
            else {
                transType = myScanner.nextInt();
            
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
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                else {
                    System.out.println("Invalid value entered");
                }   
            }
    }while(!correct);

       




        }
    }
