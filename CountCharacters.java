/*
Kevin Dotel
10/13/21
CSE 7: Week 5 Homework
This is the CountCharacters program.
*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class CountCharacters {

    static void selectionSort(String sort[], int x) {
        for(int i = 0; i < x - 1; i++) {
            int minIndex = i;
            String minSort = sort[i];

            for(int j = i + 1; j < x; j++) {
                if(sort[j].compareTo(minSort) < 0) {
                    minSort = sort[j];
                    minIndex = j;
                }
            }

            if(minIndex != i) {
                String temp = sort[minIndex];
                sort[minIndex] = sort[i];
                sort[i] = temp;
            }
        }

    }
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        String input = " " ;
        int counts1 = new int[26];
        char [] message = new char[input.length()];
        char [] alphabet1 = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        //int [] counts = new int[26];
        int count = 0;
        char character = ' ' ;
        //int x = input.length;

        char[] counts = new char[26] ;     
        for(char ch = 'a'; ch <= 'z'; ++ch) //provides the alphabet into the alphabet array 
        {
            alphabet1[ch-'a']=ch ;
        } 
        
        //Intro
        System.out.println("Welcome to Kevin's CountCharacters program! Lots of fun!!");

        //Input detection
        System.out.println("Please input a word or phrase.");
        input = scnr.nextLine() ;
        System.out.println("Letter          Count") ;

        //Loop used to detect both count and alphabet arrays
        for (int i = 0; i < counts.length; i++) 
        {   count = 0 ;
            for (int j = 0; j < input.length(); j++) {
                character = input.charAt(j) ;
                if (character == alphabet1[i]) {
                    count++ ;
                }
            }

            //Prints out the alphabet and the count of each letter
            System.out.println(alphabet1[i] + "\t\t" + count) ;
            
        }

        //Selection Sort code     
        for(int i=0; i < counts.length -1; i++){
            int indexMin = i;
            char min = counts[i];
                for(int j=i+1; j < counts.length; j++){
                    if(min > counts[j]){
                    min = counts[j];
                    indexMin = j;
                        }
                }
            if(indexMin != i){
            counts[indexMin] = counts[i];
            counts[i] = min;
            }
            System.out.println(counts[i]);
        }
        
        


    /*
        //Array sorting code
        selectionSort(sort, x);
        for(int i = 0; i < x; i++) {
            System.out.println(i + ": " + alphabet1[i]);
        }
    */

    /*
        //Array Sorting Code 
        for(int i = 0; i < x; i++)
    {
        System.out.println(i+": "+alphabet1[i]);
    }
    System.out.println();
 
    selectionSort(sort, x);
 
    System.out.println("Sorted array is");
     
    // Printing the array after sorting
    for(int i = 0; i < x; i++)
    {
        System.out.println(i+": "+alphabet1[i]);
    }
    */



        
        /*

        //String Input 
        System.out.println("Please input a word or phrase.");
        input = scnr.nextLine();

        //Loop to detect characters and alphabet
        for(int i = 0; i < input.length(); i++) {
            message[i] = input.charAt(i);
        }

        //Loop that counts each character excluding spaces
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) != ' ') 
            count++;
            counts[i] = count;
        }
        System.out.println("Character count is: " + count);

        

        //Loop to print array
        for(char r : message) {
            System.out.println(r);
        }
        */


    }

    

    
}
