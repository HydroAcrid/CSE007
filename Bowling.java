import java.util.Arrays;
import java.util.Scanner;
public class Bowling {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        // int [] bowlInput = new int[21];
        // int [] bowlScore = new int[9];
        // int frame10 = 0;
        // int score = 0;
        // int strike = 10;
        // int spare = score + 10;

        // System.out.println("Welcome to Kevin's bowling! So much fun!!!");
        // System.out.println("Please input scores");

        
    
    }

    public static int [] stringToIntArray(Scanner scnr) {

        System.out.println("input scores:");
        String input = scnr.nextLine();

        String [] subStrings = scnr.split(" ");
        int [] inputNum = new int[subStrings.length];

        int counter = 0;
        for(int i = 0; i < subStrings.length; i++) {
            try {
                int n = Integer.parseInt(subStrings[i]);
                if(n < 0 || n > 10) {
                    System.out.println("No no bad");
                    break;
                }
                inputNum[i] = n;
                counter++;
            }
            catch (NumberFormatException e) {
                System.out.println("Error. Please enter valid integer");
                break;
            }

        }
        if(counter != inputNum.length) {
            inputNum = stringToIntArray(scnr);
        }
        else {
            System.out.println(Arrays.toString(inputNum));
        }
        return inputNum;

    }

    public static int [] points(int [] scores) {
        int sum = 0;
        int [] points = new int [10];
        for(int i = 0, j = 0; j < points.length; i++) {
            if(scores[i] == 10) {
                sum += scores[i] + scores[i+1] + scores[i+2];
            }
            else if(scores[i] + scores[i+1] == 10) {
                sum += scores[i] + scores[i+1] + scores[i+2];
                i++;
            }
            else {
                sum += scores[i];
                i++;
            }
            points[j++] = sum;
        }
        return points;
    }

    // public static int getScores(Scanner scnr) {
    //     int frame = 0;
    //     int score = 0;
    //     int length = 10;

    //     for(int i = 0; i < length; i++) {



    //     }
    // }

    
    
}
