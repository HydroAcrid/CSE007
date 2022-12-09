/*
Kevin Dotel
9/10/21
CSE 7: Lab 1
This is the switch statement version for the seasons assignment.
*/

import java.util.Scanner;
public class SeasonsSwitch { 
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String month;
        String tern;
        int day;
        
        
        System.out.println("Enter a date (String, int): ");
        month = scnr.next();
        day = scnr.nextInt();
        System.out.println("You have inputted " + month + " " + day);

        
        //Spring
        switch (month) { 
            case "March": tern = (day > 19) && (day > 0) && (day <= 31) ? month + " " + day + " falls during spring."
                : (day <= 19) && (day > 0) ? month + " " + day + " falls during winter."
                : "You inputted an invalid date.";
                System.out.println(tern);
                break;
            case "April": tern = (day <= 31) && (day > 0) ? month + " " + day + " falls during spring."
                : "You inputted an invalid date.";
                System.out.println(tern);
                break;
            case "May": tern = (day <= 31) && (day > 0) ? month + " " + day + " falls during spring."
                : "You inputted an invalid date.";
                System.out.println(tern);
                break;
            case "June": tern = (day < 21) && (day > 0) ? month + " " + day + " falls during spring."
                : (day > 21) && (day > 0) && (day <= 30) ? month + " " + day + " falls during summer."
                : "You inputted an invalid date.";
                break;
            case "July": tern = (day <= 31) && (day > 0) ? month + " " + day + " falls during summer."
                : "You inputted an invalid date.";
                System.out.println(tern);
                break;
            case "August": tern = (day <= 31) && (day > 0) ? month + " " + day + " falls during summer."
                : "You inputted an invalid date.";
                System.out.println(tern);
                break;
            case "September": tern = (day <= 21) && (day > 0) ? month + " " + day + " falls during summer."
                : (day >= 22) && (day > 0) && (day <= 30) ? month + " " + day + " falls during autumn."
                : "You inputted an invalid date.";
                System.out.println(tern);
                break;
            case "October": tern = (day <= 31) && (day > 0) ? month + " " + day + " falls during autumn."
                : "You inputted an invalid date.";
                System.out.println(tern);
                break;
            case "November": tern = (day <= 30) && (day > 0) ? month + " " + day + " falls during autumn."
                : "You inputted an invalid date.";
                System.out.println(tern);
                break;
            case "December": tern = (day <= 20) && (day > 0) ? month + " " + day + " falls during autumn."
                : (day >= 21) && (day > 0) && (day <= 31) ? month + " " + day + " falls during winter."
                : "You inputted an invalid date.";
                System.out.println(tern);
                break;
            case "January": tern = (day <= 31) && (day > 0) ? month + " " + day + " falls during winter."
                : "You inputted an invalid date.";
                System.out.println(tern);
                break;
            case "February": tern = (day <= 29) && (day > 0) ? month + " " + day + " falls during winter."
                : "You inputted an invalid date.";
                System.out.println(tern);
                break;
            default: System.out.println("You inputted an invalid date.");

                

        

            


            







        }
      
        







    }
    
}
