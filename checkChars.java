import java.util.Arrays;
import java.util.Scanner;
public class checkChars {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);        
        char[]  letters = new char[10];
        boolean correct = true;

        //Intro
        System.out.println("Welcome to Kevin's checkChars program!");

        //Character Input Validation
        do{
            for(int i = 0; i < letters.length; i++) {
            System.out.println("Please input 10 uppercase characters between A-Z ");
            String temp = scnr.next();
            if(temp.length() == 1 && ('A' <= temp.charAt(0)) && (temp.charAt(0) <= 'Z')) {
                letters[i] = temp.charAt(0);
            }
            else {
                System.out.println("Invalid input. A to Z please.");
                scnr.next();
                }
            }
        }while(!correct);


        //Sorted Code
        boolean sorted = true;
        for(int i = 0; i < letters.length - 1; i++) {
            if(letters[i] < letters[i + 1]) {
                sorted = false;
                System.out.println("Chars are not sorted.");
                break;
            }
            else if(letters[i] > letters[i + 1]) {
                System.out.println("Chars are sorted in descending order.");
                break;
            }
            /*
            else if(letters[i] > letters[i - 1]) {
                System.out.println("Chars are sorted in ascending order. ");
                break;
            }
            */
            else {
                System.out.println("Oops! Chars are not sorted.");
                break;
            }
            
        }

    }
    
}
