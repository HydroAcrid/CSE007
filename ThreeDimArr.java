import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Scanner;
public class ThreeDimArr {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to Kevin's Aarray program! So much fun!!!");
        int random = (getInt(scnr)); 
        System.out.println("Your random int is: " + random);
    }
    
    public static int getInt(Scanner scnr) {
        System.out.println("Input max int");
        int range = scnr.nextInt();
        int random = ThreadLocalRandom.current().nextInt(1, range + 1);
        return random;

    }
}
