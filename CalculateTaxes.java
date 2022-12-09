/*
Kevin Dotel
10/22/21
CSE 7: Lab 7
This is the calculate taxes program. 
*/
import java.util.ArrayList;
import java.util.Scanner;
public class CalculateTaxes {
    public static void main(String[] args) {
        boolean buggin = true;
        Scanner scnr = new Scanner(System.in);

        //Wages method call 
        System.out.println("Input annual wages.");
        double wage = getDouble(scnr);

        //Taxable Interest method call 
        System.out.println("Input taxable interest");
        double interest = getDouble(scnr);

        //Unemployment Compensation method call 
        System.out.println("Input unemployment compensation");
        double unemployComp = getDouble(scnr);

        //Taxes withheld method call 
        System.out.println("Input taxes withheld");
        double withheld = getDouble(scnr);

        //Tax Payer method call 
        int intValue = getInt(scnr);

        //AGI method call 
        double agi = computeAGI(wage, interest, unemployComp);

        //Deduction method call 
        int deduction = getDeduction(intValue);

        //getTaxable method call
        double taxableIncome = getTaxable(deduction, agi);

        //Federal tax method call
        double fedTax = calcTax(taxableIncome, intValue);

        //Taxes due method call
        int taxDue = calcTaxDue(fedTax, withheld);


        
    }

    //Get Double method 
    public static double getDouble(Scanner scnr) {
        boolean buggin = false;
        int doubleValue= 0;
        //System.out.println("Input annual wages.");
        do {
            if(!scnr.hasNextInt()) {
                System.out.println("You did not enter an integer value");
                scnr.nextLine();
            }
            else {

                doubleValue = scnr.nextInt();
                if(doubleValue < 0) {
                    System.out.println("You did not enter a valid integer");
                    scnr.nextLine();
                }
                else {
                    buggin = true;
                }
            
            }

        }while(!buggin);

        return doubleValue;

    }

    //Method to get int
    public static int getInt(Scanner scnr) {
         boolean buggin = false;
         int taxChoice = 0;
         System.out.println("Choose taxpayer status");
         System.out.println("0. dependent");
         System.out.println("1. independent");
         System.out.println("2. married");

         do {
             if(!scnr.hasNextInt()) {
                 System.out.println("You did not enter an integer value");
                 scnr.nextLine();
             }
             else {
                 taxChoice = scnr.nextInt();
                 if((taxChoice < 0) || (taxChoice > 2)) {
                     System.out.println("You did not enter a valid selection. Please selection options 0-2.");
                     scnr.nextLine();

                 }
                 else {
                     buggin = true;
                 }
                 
             }

         }while(!buggin);

         return taxChoice;

    }

    //AGI method 
    public static double computeAGI(double wage, double interest, double unemployComp) {
        double compute = wage + interest + unemployComp; 
        System.out.print("AGI: $" + compute);
        return compute;

    }

    //public static double getDeduction()
    public static int getDeduction(int taxChoice) {
        int deduction = 0; 
        if(taxChoice == 0) {
            deduction = 6000;
        }
        else if(taxChoice == 1) {
            deduction = 12000;
        }
        else if(taxChoice == 2) {
            deduction = 24000;
        }

        System.out.println();
        System.out.println("Deduction: $" + deduction);
        return deduction; 
        
    }

    //Taxable Income method 
    public static double getTaxable(int deduction, double agi) {
        double taxIncome = 0;
        taxIncome = agi - deduction; 

        if(taxIncome < 0) {
            taxIncome = 0;
            System.out.println("Taxable Income: $" + taxIncome);
        }
        else {
            System.out.println("Taxable Income: $" + taxIncome);
        }

        return taxIncome;
    }

    //Total tax calculation
    public static double calcTax(double taxIncome, int intValue) {
        double fedTax = 0;
        double taxA = 0;
        //System.out.println(taxIncome);

        if(intValue == 0 || intValue == 1) {
            if(taxIncome >= 850000) {
                fedTax = 14500 + (.24 * (taxIncome - 85000));
            }
            else if(taxIncome <= 85000) {
                fedTax = 4600 + (.22 * (taxIncome - 40000));
            }
            else if(taxIncome <= 40000) {
                fedTax = 1000 + (.12 * (taxIncome - 10000));
            }
            else {
                fedTax = (.1 * (taxIncome));
            }

        }  
        else if (intValue == 2) {
            if(taxIncome >= 80000) {
                fedTax = 9200 + (.22 * (taxIncome - 80000));
            }
            else if(taxIncome <= 8000) {
                fedTax = 2000 + (.12 * (taxIncome - 20000));
            }
            else {
                fedTax = (.1 * fedTax);
            }
        }
        else {
            System.out.println("error");
        }


        (int) Math.round(fedTax);
        System.out.println("federal tax: $" + fedTax);
        return fedTax;
        
    }

    //Calc tax double method 
    public static int calcTaxDue(double fedTax, double withheld) {
        int taxDue = 0;
        taxDue = (int)fedTax - (int)withheld;
        System.out.println("Amount of taxes due: $" + taxDue);
        
        return taxDue;

    }

    
}
