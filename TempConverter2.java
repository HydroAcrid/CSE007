/*
Kevin Dotel
8/30/21
CSE 7: Lab 1
This is the tempConverter2 assignment
*/
   
import java.util.Scanner;

public class TempConverter2 {
public static void main(String[] args) {

//Temperature Prompt
Scanner scnr = new Scanner(System.in);
System.out.println("Please enter TEMP in degrees FARENHEIT");
double farenheit = scnr.nextDouble();

//Farenheit to celcius
double celcius = (farenheit - 32) * 0.556;
System.out.println("Temperature in celcius is: " + celcius);


 
    







}
}
