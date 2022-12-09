/*
Kevin Dotel
10/18/21
CSE 7: HW 6
This is the word tools program.
*/
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class WordTools {
    public static void main(String[] args) {

        boolean correct = true;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Hello! Welcome to Kevin's amazing word tools program!");
        String text = sampleText(scnr);
        printMenu();

        //Option Descision Program
        //String option = scnr.nextLine();

        do {
        String option = scnr.nextLine();   
        if(option.equals("chars")) {
            System.out.println("number of non whitespace characters.");
            System.out.println(getNumofNonWsCharacters(text));
            printMenu();
        }
        else if(option.equals("words")) {
            System.out.println("number of words");
            System.out.println(getNumofWords(text));
            printMenu();
        }
        else if(option.equals("find")) {
            System.out.println("find text");
            System.out.println("Enter a word or phrase to be found: ");
            String word = scnr.nextLine();
            System.out.println(findText(text, word));
            printMenu();
        }
        else if(option.equals("replace")) {
            System.out.println("replace all !'s");
            System.out.println(replaceExclamation(text));
            printMenu();
        }
        else if(option.equals("space")) {
            System.out.println("shorten spaces");
            System.out.println(shortenSpace(text));
            printMenu();
        }
        else if(option.equals("quit")) {
            correct = false;
        }
        else {
                System.out.println("Please input a valid option");
                printMenu();
            }

        }while(correct); 

        
    
    }

    

    //SampleText code 
    public static String sampleText(Scanner scnr) {
        System.out.println("Please enter a sample text.");
        String input = scnr.nextLine();
        System.out.println("You entered: ");
        System.out.println(input);
        return input;
    }

    //Print menu method
    public static void printMenu() {
        System.out.println();
        System.out.println("Menu");
        System.out.println("chars - Number of non-whitespace characters");
        System.out.println("words - Number of words");
        System.out.println("find - Find text");
        System.out.println("replace - Replace all !'s");
        System.out.println("space - Shorten spaces");
        System.out.println("quit - Quit");
        System.out.println();
        System.out.println("Choose an option:");
    }

    //Number of words method
    public static int getNumofWords(String primary) {
        char characters[] = primary.toCharArray();
        int counter = 0;
        boolean correct = true; 
        for(int i =0; i < primary.length(); i++) {
            if(correct == true && characters[i] != ' ') {
                correct = false;
                counter++;
            }
            else {
                if(characters[i] == ' ' && correct == false) {
                    correct = true;
                }
                else {
                    continue;
                }

            }

        }
        System.out.println(String.valueOf(characters));
        System.out.println("Number of words: " + counter);
        return counter;
    }

    //Number of non white space characters method
    public static int getNumofNonWsCharacters(String primary) {
        char characters[] = primary.toCharArray();
        int counter = 0;
        boolean correct = true;
        for(int i = 0; i < primary.length(); i++) {  //for loop that scans the input 
            if(characters[i] == ' ') {
                continue;
            }
            else {
                counter++;
            }
        }
        System.out.println(String.valueOf(characters));
        System.out.println("Number of non-whitespace characters: " + counter);
        return counter;
    }

    //Find text method
    public static int findText(String primary, String secondary) {
        int counter = primary.replaceAll("[^" + secondary + "]", "").length() / secondary.length();

        if(counter > 0) {
            System.out.println("' " + secondary + " '" + "instances in " + primary + ": ");
        }
        else {
            System.out.println("' " + secondary + " '" + " was not found");
            System.out.println("Instances: ");
        }
        return counter;
    }

    //Replace Exclamation code
    public static String replaceExclamation(String primary) {
        String output = " " ;
        char characters[] = primary.toCharArray();
        for(int i = 0; i < primary.length(); i++) { //for loop that scans the input 
            if(characters[i] == '!') {
                output = output + '.';
            }
            else {
                output = output + characters[i];
            }
        }
        return output;
    }

    //Code that shortens the spaces
    public static String shortenSpace(String primary) {
        char characters[] = primary.toCharArray();
        for(int i = 0; i < primary.length(); i++) {  //for loop that scans the input 
            if(characters[i] == ' ' && characters[i + 1] == ' ') {
                characters[i] = '\0';
            }
        }
        primary = String.valueOf(characters);
        return primary;
    }

    
    
}
