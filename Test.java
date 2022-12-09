/*
Kevin Dotel
8/30/21
CSE 7: Lab 1
This is an assingment to correct coding mistakes
*/

public class Test {
public static void main(String[] args) {
    
//Variables and constants
final int dollar = 100, quarter = 25; //no capital "f"
int dollars, quarters; //put semicolon
double money;      //I got rid of the "2"
money = 23.68;

//processing
int amount = ( (int) money * 100); //removed "(" from money
dollars = amount / dollar;
amount = amount % dollar;
quarters = amount / quarter; //reverse bracket

//output
System.out.println("Dollars= " + dollars + " Quarters= " + quarters); //Needed quotes 











}
}
