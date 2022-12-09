import java.util.Scanner;
import java.util.Arrays;
public class MidtermEx {

    public static void main(String[] args) {
        
            System.out.println("What size 1d array would you like?");
            Scanner scnr = new Scanner(System.in);
            int size = scnr.nextInt();
            System.out.println("Enter 1 for a random array, " +
            "2 for an array in ascending order and " +
            "3 for an array in descending order.");
            int arrayType = scnr.nextInt();
            int[] arrayToPlay = new int[size];
            if (arrayType == 1) {
            arrayToPlay = randomArray1d(size);
            System.out.println(Arrays.toString(arrayToPlay));
            }
            else if (arrayType == 2) {
            arrayToPlay = ascendArray1d(size);
            System.out.println(Arrays.toString(arrayToPlay));
            }
            else if (arrayType == 3) {
            arrayToPlay = reverseArray1d(size);
            System.out.println(Arrays.toString(arrayToPlay));
            }
            System.out.println("What number would you like to search for?");
            int key = scnr.nextInt();
            int index = linearSearch1d(arrayToPlay,key);
            if (index != -1) {
            System.out.println("Your key was found at index " + index);
            }
            else {
            System.out.println("Your key was not found");
            }
            if (arrayType == 2) {
            System.out.println("Performing a binary search on your sorted array.");
            index = binarySearch1d(arrayToPlay,key);
            if (index != -1) {
            System.out.println("Your key was found at index " + index);
            }
            else {
            System.out.println("Your key was not found");
            }
            }
            System.out.println("Enter the number of rows in your 2D array: ");
            int rows = scnr.nextInt();
            System.out.println("Enter the number of columns in your 2D array: ");
            int cols = scnr.nextInt();
            int[][] randomArray2dim = randomArray2d(rows,cols);
            for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(randomArray2dim[i]));
            }
            System.out.println("Enter a number to search for in your 2D array: ");
            key = scnr.nextInt();
            int[] indexArray = linearSearch2d(randomArray2dim,key);
            if (indexArray[0] != -1) {
            System.out.println("Your key was found in row " +
            indexArray[0] + ", column " + indexArray[1] );
            }
            //else {System.out.println("Your key was not found");}}}
        
    }
    
}
