/*
Kevin Dotel
8/30/21
CSE 7: Lab 1
This is the tempConverter assignment
*/

import java.util.Scanner;
import java.util.*;

public class TempConverter {
public static void main(String[] args) {
 
//Temperature prompt
Scanner scnr = new Scanner(System.in);
System.out.println("Please enter the TEMP in degrees CELCIUS");
double celcius = scnr.nextDouble();


//celcius to farenheit
double farenheit = 1.8 * celcius + 32;
System.out.println("Temperature to farenheit is: " + farenheit);






}
}
