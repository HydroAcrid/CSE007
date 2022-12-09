/*
Kevin Dotel
9/10/21
CSE 7: Lab 1
This is a program used to test seasons. This uses IF statements.
*/

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;
public class SeasonsIf {
   public static void main(String[] args) {

    Scanner scnr = new Scanner(System.in);
    String month;
    int day;

    System.out.println("Enter a date (String, int): ");
    month = scnr.next();
    day = scnr.nextInt();
    System.out.println("You have inputted " + month + " " + day);

    //Spring
    if(month.equals("March") && (day > 19) && (day > 0) && (day <= 31)) {
        System.out.println(month + " " + day + " falls during spring.");
    } 
    else if(month.equals("April") && (day <= 31) && (day > 0)) {
        System.out.println(month + " " + day + " falls during spring.");
    }
    else if(month.equals("May") && (day <= 31) && (day > 0)) {
        System.out.println(month + " " + day + " falls during spring.");
    }
    else if(month.equals("June") && (day < 21) && (day > 0)) {
        System.out.println(month + " " + day + " falls during spring.");
    }

    //Summer 
    else if(month.equals("June") && (day > 21) && (day > 0) && (day <= 30)) {
        System.out.println(month + " " + day + " falls during summer.");
    }
    else if(month.equals("July") && (day <= 31) && (day > 0)) {
        System.out.println(month + " " + day + " falls during summer.");
    }
    else if(month.equals("August") && (day <= 31) && (day > 0)) {
        System.out.println(month + " " + day + " falls during summer.");
    }
    else if(month.equals("September") && (day <= 21) && (day > 0)) {
        System.out.println(month + " " + day + " falls during summer.");
    }
    
    //Autumn
    else if(month.equals("September") && (day >= 22) && (day > 0) && (day <= 30)) {
        System.out.println(month + " " + day + " falls during autumn.");
    }
    else if(month.equals("October") && (day <= 31) && (day > 0)) {
        System.out.println(month + " " + day + " falls during autumn.");
    }
    else if(month.equals("November") && (day <= 30) && (day > 0)) {
        System.out.println(month + " " + day + " falls during autumn.");
    }
    else if(month.equals("December") && (day <= 20) && (day > 0)) {
        System.out.println(month + " " + day + " falls during autumn");
    }


    //Winter
    else if(month.equals("December") && (day >= 21) && (day > 0) && (day <= 31)) {
        System.out.println(month + " " + day + " falls during winter");
    }
    else if(month.equals("January") && (day <= 31) && (day > 0)) {
        System.out.println(month + " " + day + " falls during winter.");
    }
    else if(month.equals("February") && (day <= 29) && (day > 0)) {
        System.out.println(month + " " + day + " falls during winter.");
    }
    else if(month.equals("March") && (day <= 19) && (day > 0)) {
        System.out.println(month + " " + day + " falls during winter.");
    }
    else {
        System.out.println("You inputted an invalid date.");
    }



 




    


       






   } 
}
