/*Kevin Dotel
9/3/21
CSE 7: Lab 1 
This program is for event checking 
*/

import java.util.Scanner;

public class EvenCheck {
   public static void main(String[] args) {
      Scanner myScanner = new Scanner(System.in);
      int inputNum = myScanner.nextInt();
   
      if ( inputNum % 2 == 0  ) { //fill in the conditional expression to check if inputNum is even (not using any other classes)
        System.out.println(inputNum+ " is an even number.");
      }
      else { //if the inputNum isn't even, then it must be odd
        System.out.println(inputNum+ " is an odd number.");
      } 

      myScanner.close();
   }
}