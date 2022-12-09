import java.util.Scanner;
public class WhatDay {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int month = 00;
        int day = 00;
        int year = 0000;
        int yearCode = 0;
        int YY;
        int monthCode = 0;
        int centuryCode = 0;
        int dateNum = 0;
        int leapYearCode;
        int formula;
        int january = 0;
        int february = 3;
        int march = 3;
        int april = 6;
        int may = 1;
        int june = 4;
        int july = 6;
        int august = 2;
        int september = 5;
        int october = 0;
        int november = 3;
        int december = 5;

        

        System.out.println("Welcome to my 'What Day?' program!");

        //Month input 
        do {
            System.out.println("Please input month: ");
            month = scnr.nextInt();

        } while((month < 1) || (month > 12)); 
            

        //Day input
        do {
            System.out.println("Please input day: ");
            day = scnr.nextInt();
        } while((day < 1) || (day > 31)); 

        //Year input
        do {
        System.out.println("Please input year: ");
            year = scnr.nextInt();
        } while((year < 1700) || (year > 2399));

        //Year Code
        YY = year % 100;
        yearCode = (YY + (YY / 4)) % 7;

        //Month Code
        if(month == 1){
            monthCode = january;
        }
        else if(month == 2) {
            monthCode = february;
        }
        else if(month == 3) {
            monthCode = march;
        }
        else if(month == 4) {
            monthCode = april;
        }
        else if(month == 5) {
            monthCode = may;
        }
        else if(month == 6) {
            monthCode = june;
        }
        else if(month == 7) {
            monthCode = july;
        }
        else if(month == 8) {
            monthCode = august;
        }
        else if(month == 9) {
            monthCode = september;
        }
        else if(month == 10) {
            monthCode = october;
        }
        else if(month == 11) {
            monthCode = november;
        }
        else if(month == 12) {
            monthCode = december;
        }
        else {
            System.out.println("error.");
        }

        if((year >= 1700) && (year <= 1799)) {
            centuryCode = 4;
        }
        else if((year >= 1800) && (year <= 1899)) {
            centuryCode = 2;
        }
        else if((year >= 1900) && (year <= 1999)) {
            centuryCode = 0;
        }
        else if((year >= 2000) && (year <= 2099)) {
            centuryCode = 6;
        }
        else if((year >= 2100) && (year <= 2199)) {
            centuryCode = 4;
        }
        else if((year >= 2200) && (year <= 2299)) {
            centuryCode = 2;
        }
        else if((year >= 2300) && (year <= 2399)) {
            centuryCode = 0;
        }

        //Date Number
        dateNum = day;

        //Leap Year Code
        if((year % 4 == 0) && (year % 100 != 0) && (year % 400 == 0)) {
            leapYearCode = -1;
        }
        else {
            leapYearCode = 0;
        }

        formula = (YY + monthCode + centuryCode + dateNum - leapYearCode) % 7;
        System.out.println(formula);

        if(formula == 4) {
           System.out.println("Prof Zilit's birthday was on a thursday!"); 
        }







        


    }
    
}
