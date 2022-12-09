import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

import java.util.Random;
import java.util.Arrays;
public class searchCompare {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int length = 0; 
        char key = ' '; 
        boolean correct = true;

        //ask user for a value between 15 and 50 and validate that it is an integer and a valid number 
        System.out.println("Weclome to Kevin's search and compare program.");
        /*
        while(true){
            int num = scan.nextInt();
            switch(num){
                case num > 15 && num < 50:

                    break;
                default:
                    System.out.println("This is not a valid input");
                    break;
            }
        }
        */
        
        do {
        System.out.println("Please input an integer value between 15 and 50.");
        correct = scan.hasNextInt();
        length = scan.nextInt();
        if(correct == false) {
            System.out.println("You did not enter an integer value");
            scan.nextLine();
        } 
        else {
            while((length < 15) || (length > 50)) {
            //length = scan.nextInt(); 
            if((length > 15) && (length < 50)) {
                length = scan.nextInt();
                scan.nextLine();
            }
            else {
            System.out.println("Integer is not in range");
            System.out.println("Please input an integer value between 15 and 50");
            scan.nextLine();
            }
            }
        }
        }while(!correct);
        
        //length = 25;

        //ask the user for a character between "a" and "z"
        
        do {
            System.out.println("Please enter a lowercase character between a and z");
            String temp = scan.next();
            if (temp.length() == 1 && ('a' <= temp.charAt(0)) && (temp.charAt(0) <= 'z')) {
                System.out.println(temp);
                key = temp.charAt(0);
            }
            else { 
                System.out.println("Invalid input. a to z please.");
                scan.next();
            }
        }while(!correct);
        

        //key = 'k';
        //an array of random characters using the length from the user 
        char[] random = new char[length];
        for (int i = 0; i < length; i++) {
            random[i] = (char) (ran.nextInt(26) + 97);
        }
        System.out.println(Arrays.toString(random));
        Arrays.sort(random);
        //write code to print array random after sort using a for -each loop 
        System.out.println(Arrays.toString(random));

        int linearCounter = 0; 
        boolean found = false; 
        for(int i = 0; i < random.length; i++) {
            linearCounter++;
            if(random[i] == key) {
                found = true;
                break;
            
            }
        }

        
        if (found == true) {
            System.out.println(key + " was found with " + linearCounter + " comparisons");
        }
        else {
            System.out.println(key + " was not found with " + linearCounter + " comparisons");
        }

        //binary search 

        int mid, low, high;
        int binaryCounter = 0;
        low = 0;
        high = random.length -1;
        while (high >= low) {
            binaryCounter++;
            mid = (high + low)/2;
        if (random[mid] < key) {
            low = mid + 1;
        }
        else if (random[mid] > key) {
            high = mid - 1;
        }
        else {
            found = true;
            break;
        }
        }
        if(found == true) {
            System.out.println(key + " was found with " + binaryCounter + " comparisons");
        }
        else {
            System.out.println(key + " was not found with " + binaryCounter + " comparisons");
        }
    



        /*
        long key = 171819;
        int keyIndex = -1;
        for(int index = 0; index < accounts.length; index++) {
                if(accounts[index] == key) {
                        keyIndex = index;
                        break;
                }
        }
        if(keyIndex == -1) {
                System.out.println(key + " was not found");
        }
        else {
                System.out.println(key + " was found at index " + keyIndex);
        }
        */



    
}
}

