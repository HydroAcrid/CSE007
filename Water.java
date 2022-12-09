/*
Kevin Dotel
8/30/21
CSE 7: Lab 1
This is the tempConverter2 assignment

Planning:
On a notebook, I wrote down formulas to integrate into the program
I then separated each calculation into sections for readibility. For example:
Number of toilets:
    Population / 10 
Quantity of water saved: 
    Old toilets: 15 liters * 24 flushes
    New toilets: 2 liters * 24 flushes 
I then translated these notes into code and integrated them into the program.
*/


import java.util.Scanner;

public class Water {
public static void main(String[] args) {


//Scanner Input
Scanner scnr = new Scanner(System.in);
System.out.println("Enter the campus population: ");    
int population = scnr.nextInt();

//Liters per day for old toilet
int toilets = population / 10;
int literPerDayOld = toilets * 360; 

//Liters per day for new toilet
int literPerDayNew = literPerDayOld - (toilets * 48);
System.out.println("Quantity of water saved: " + literPerDayNew);

//Cost of installing toitlets
double newToiletCost = toilets * 100;
System.out.println("Cost of installing new toilets $" + newToiletCost);

//Yearly cost of water before 
double literPerYear1 = 131400; 
double yearlyLiters = literPerYear1 * toilets; 
double gallon1 = yearlyLiters / 3.785;
double toiletCost = gallon1 * 0.02;
String toiletCostF = String.format("%.2f", toiletCost);
System.out.println("Yearly cost of water before: $" + toiletCostF); 

//Yearly cost of water after 
double literPerYear2 = 17520;
double yearlyLiters1 = literPerYear2 * toilets;
double gallon2 = yearlyLiters1 / 3.785;
double toiletCost1 = gallon2 * 0.02; 
String toiletCostF1 = String.format("%.2f", toiletCost1);
System.out.println("Yearly cost of water after: $" + toiletCostF1);

//Final Saving
double finalCost = toiletCost - toiletCost1 - newToiletCost;
String finalCostF = String.format("%.2f", finalCost);
System.out.println("Final cost: $" + finalCostF);












}
}
