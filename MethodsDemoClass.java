
import java.util.Scanner;
public class MethodsDemoClass {
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter 2 ints");
        //int x = myScanner.nextInt(); 
        int x = getInt(myScanner);
        //int y = myScanner.nextInt(); 
        int y = getInt(myScanner);
        printEvenInRange(x, y);
        System.out.println("Done!");
    }

    public static void printEvenInRange(int a, int b) {
        if((a == b) || (a > b)) {
            System.out.println("Not a valid range");
            return;
        }
        else {
            for(int i = a; i <= b; i++) {
                if(findEven(i)) {
                    System.out.println(i + "\t");
                }
            }
        }
    }

    public static boolean findEven(int num) {
        return (num % 2 == 0);
    }

    public static int getInt(Scanner myScanner) {
        boolean correct = true;
        int output = 0;
        do {
            correct = myScanner.hasNextInt();
            if (correct == false) {
                System.out.println("You did not enter an integer value.");
                myScanner.nextLine();
            }
            else {
                output = myScanner.nextInt();
            }

        }while(!correct);

        return output;
    }








}
