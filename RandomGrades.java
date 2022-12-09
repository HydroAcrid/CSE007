/*
Kevin Dotel
10/14/21
CSE 7: Lab 7
This is the randomn grades lab
*/
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class RandomGrades {
    public static void main(String[] args) {
        //Ask the user for the number value
        //Make the range between 

        Scanner scnr = new Scanner(System.in);
        boolean correct = true;
        int grade = 95;
        int numOfStudents = 5;
        //int[] grades = new int[numOfStudents];
        int range = 0;
        
        /*
        grades[0] = 95;
        grades[1] = 75;
        grades[2] = 100;
        grades[3] = 98;
        grades[4] = 65;

        for(int i = 0; i < grades.length - 1; i++) {
            int indexMax = i;
            int max = grades[i];
            for(int j = i + 1; j < grades.length; j++) {
                if(max < grades[j]) {
                    max = grades[j];
                    indexMax = j;
                }
            }
        if(indexMax != i) {
            grades[indexMax] = grades[i];
            grades[i] = max;
            }
        }
        

        System.out.println(Arrays.toString(grades));

        //Ask user for a grade checking that it is a value between 
        //0-100 and is an integer 
        //next charAt(0) convert to an integer 

        /*
        //Input Validation
        System.out.println("Please input a grade between 0-100");
        do {
            correct = scnr.hasNextInt();
            if(correct == false) {
                System.out.println("You did not enter a valid integer value");
                scnr.nextLine();
                
            }
            else {
                grade = scnr.nextInt();
                while(grade < 0 || grade > 100 && correct == true) {
                    System.out.println("Integer is not in valid range. Please input valid integer between 0-100");
                    grade = scnr.nextInt();
                }
            }
        }while(!correct);
        */

        //Input Validation for CSE Class Size
        System.out.println("Please input class size, between 5-150");
        do {
            correct = scnr.hasNextInt();
            if(correct == false) {
                System.out.println("You did not enter a valid integer value");
                scnr.nextLine();
                
            }
            else {
                numOfStudents = scnr.nextInt();
                while(numOfStudents < 5 || numOfStudents > 150 && correct == true) {
                    System.out.println("Integer is not in valid range. Please input valid integer between 0-100");
                    numOfStudents = scnr.nextInt();
                }
            }
        }while(!correct);

        int[] grades = new int[numOfStudents];


        //Random integers for grades
        Random rand = new Random();
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        //System.out.println(randomNum);
        int r = randomNum;

        System.out.println("Final grades for CSE7: ");
        for(int i = 0; i < grades.length; i++) {
            randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
            r = randomNum;
            grades[i] = r;
            System.out.print(grades[i] + " " );
        }

        //Sorting Descending Order Algorithim
        for(int i = 0; i < grades.length - 1; i++) {
            int indexMax = i;
            int max = grades[i];
            for(int j = i + 1; j < grades.length; j++) {
                if(max < grades[j]) {
                    max = grades[j];
                    indexMax = j;
                }
            }
        if(indexMax != i) {
            grades[indexMax] = grades[i];
            grades[i] = max;
            }
        }

        System.out.println();
        System.out.println("Descending CSE7 Grades: ");
        System.out.println(Arrays.toString(grades));

        //Average course grade code 
        int length = grades.length;
        int sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        double avgGrade = sum / length;
        System.out.println("Average course grade: ");
        System.out.print(avgGrade);

        //Grade / Grade range code 
        int gradeChoice = 0;
        int gradeInput = 0;
        System.out.println();
        System.out.println("Enter a grade / grade range to search for: ");
        System.out.println("1. Enter a numbered grade");
        System.out.println("2. Enter a letter grade");
        //gradeChoice = scnr.nextInt(); 

        //Input validation for option choice
        do {
            correct = scnr.hasNextInt();
            if(correct == false) {
                System.out.println("You did not enter a valid integer value");
                scnr.nextLine();
                
            }
            else {
                gradeChoice = scnr.nextInt();
                while(numOfStudents != 1 || numOfStudents != 2 && correct == true) {
                    System.out.println("Integer is not in valid range. Please input valid integer between 1-2");
                    gradeChoice = scnr.nextInt();
                }
            }
        }while(!correct);

        
        int mid, low, high;
        int keyIndex = -1;
        low = 0;
        high = grades.length - 1;
        int measure = 0;
        

        //binary search to find grade inside the range
        if(gradeChoice == 1) {
            gradeInput = scnr.nextInt();
            while(low <= high) {
                mid = (high + low) / 2;
                if(grades[mid] < gradeInput) {
                    high = mid - 1;
                    measure++;
                }
                else if(grades[mid] > gradeInput) {
                    low = mid + 1;
                    measure++;
                }
                else {
                    keyIndex = mid;
                    measure++;
                    break;
                }
            }
        if(keyIndex != -1) {
            System.out.println(gradeInput + " was located at the index " + keyIndex);
            System.out.println(gradeInput + " took " + measure + " iterations");
        }
        else {
            System.out.println(gradeInput + " was not found in the final grades");
        }
    }

    //suddenly recieved a compilation error and not sure what the reason is. Was unable to test the remaining code 
    if(gradeChoice == 2) {

    }
    
        


        





        





    
        /*
        int mid, low, high;
        int keyIndex = -1;
        int counter = 0;
        low = 0;
        high = random.length -1;
        while (high >= low) {
            mid = (high + low)/2;
        if (grades[mid] < key) {
            low = mid + 1;
        }
        else if (grades[mid] > key) {
            high = mid - 1;
        }
        else {
            keyIndex = mid;
            break;
        }
        }
        if(keyIndex != -1) {
            System.out.println(grade + " was not found at index= " + keyIndex);
        }
        else {
            System.out.println(grade + " was not found in numlist");
        }

        //Linear Search 
        char letterGrade = 'A'; 
        for(int i = 0; i < list.length; i++) {
            if(list[i] >= 90) {
                counterA++;
            }
            else if(list[i] >= 80) {
                counterB++;
        }
            else if(list[i] >= 70) {
                counterC++;
            }
        }
        */
            
                
            
        
        

    }
    
}
