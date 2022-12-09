/*
Kevin Dotel
9/3/21
CSE 7: Lab 1
This is a program used to test booleans
*/


import java.util.Scanner;

public class BooleanExpressions {

    public static void main(String[] args) {
    
    //Scanner scnr = new Scanner(System.in);
    //System.out.println("Enter balance: "); 
    // double currentBalance = scnr.nextDouble();

    //System.out.println("Enter transaction amount: "); //input
    // double transactionAmt = scnr.nextDouble();
    double currentBalance = 13;
    double transactionAmt = 20;


    boolean a = currentBalance < transactionAmt; 
    boolean b = currentBalance >= transactionAmt;
    boolean c = currentBalance <= transactionAmt;
    boolean d = currentBalance > transactionAmt;
    boolean e = currentBalance == transactionAmt;
    boolean f = currentBalance != transactionAmt;
    boolean g = currentBalance != transactionAmt;
    boolean h = currentBalance == transactionAmt;
    boolean i = currentBalance > transactionAmt;
    boolean j = currentBalance <= transactionAmt;
    boolean k = currentBalance >= transactionAmt;
    boolean l = currentBalance < transactionAmt;
    
    System.out.println( a && !b);
    System.out.println( !c || d); 
    System.out.println( e ^ f);
    System.out.println( g || !h); 
    System.out.println( !i && j);
    System.out.println( k ^ !l); 




}
    
}
