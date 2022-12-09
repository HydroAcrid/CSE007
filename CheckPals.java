/*
Kevin Dotel
9/24/21
CSE 7: Lab 1
This is the CheckPals program.
*/


import java.util.Scanner;
public class CheckPals {
    public static void main(String[] args) {
       
        Scanner scnr = new Scanner(System.in);
        String firstString;
        int length = 0;
        Boolean palindromeCheck = true;

        //Intro
        System.out.println("Welcome to Kevin's palindrome guesser!");
        System.out.println("Input a message: ");

        //String Recognizer
        firstString = scnr.nextLine();
        length = firstString.length();

        for(int indexStart = 0; indexStart < length; indexStart++) {

            if(firstString.charAt(indexStart) != firstString.charAt(length-1-indexStart)) {
            System.out.println(firstString + " is not a palindrome");
            palindromeCheck = false; 
            break;

            }
        }
        
        if(palindromeCheck) {
            System.out.println(firstString + " is a palindrome. Nice!");
        }




        





    }
    
}
