/* 
Kevin Dotel
8/27/21
CSE 7: Lab 1 
This program is for arithmitec operations
*/

public class MPG {
public static void main(String[] args) {
    
double gasTrip1 = 8.2;
double gasTrip2 = 13.7;
double milesTrip1 = 178;
double milesTrip2 = 342;

double mpg1, mpg2, mpgTotal;

    System.out.println("Trip 1 covered " + milesTrip1 + " miles");
    System.out.println("Trip 2 covered " + milesTrip2 + " miles");
    System.out.println("Trip 1 used " + gasTrip1 + " gallons of gas");
    System.out.println("Trip 2 used " + gasTrip2 + " gallons of gas");

mpg1 = milesTrip1 / gasTrip1;
mpg2 = milesTrip2 / gasTrip2;
mpgTotal = (milesTrip1 + milesTrip2) / (gasTrip1 + gasTrip2);

    System.out.println("The miles per gallon for trip 1 was " + mpg1);
    System.out.println("The miles per gallon for trip 2 was " + mpg2);
    System.out.println("The miles per gallon for the combined trips was " + mpgTotal);

    
}   
}
