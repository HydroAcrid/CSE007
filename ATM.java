public class ATM{
public static void main(String[] args) {
    boolean receipt;
    String name; 
    char middleName; //when using two words to define a variable always uppercase the first character in the second word
    int pin;
    double amountDeposit;
    double amountWithdraw = 0;
    long acctNum;
    double feeTotal;
    boolean fee; 
    final double checkFee = 1.5; //constant for every 25 dollars withdrawn we will apply 1.5 dollar fee 
    int transactionCount = 0;

    System.out.println("ATM System");
    System.out.println("Enter your account number");
    System.out.println("Enter your pin");
    System.out.println("1. Check Balance");
    System.out.println("2. Get Cash");
    System.out.println("3. Deposit");
    System.out.println("Enter the number above of the type transaction");
    amountWithdraw = 100.00;
    amountDeposit = 200.00;
    feeTotal = amountWithdraw / 25 * checkFee;
    System.out.println("Fee total is " + feeTotal);
    transactionCount = transactionCount + 1;   //transactionCount++; this does the exact same process 
    transactionCount++;
    transactionCount--; //Subtracts one from transactionCount
    System.out.println("Number of transactions: " + transactionCount); 
    System.out.println("Number of transactions: " + transactionCount++); //post increment transactionCount will print the number before the increment
    System.out.println("Number of transactions: " + transactionCount);
    System.out.println("Number of transactions: " + ++transactionCount);
    amountDeposit = 3;
    System.out.println(amountDeposit);
    pin = (int) amountWithdraw;
    











    }
}