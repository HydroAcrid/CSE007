import java.util.Random;
import java.util.Scanner;
public class Exam1 {
    public static void main(String[] args) {

String day = "Saturday";
String dayType;
switch (day) {
        case "Monday":
        case "Tuesday":
        case "Wednesday":
        case "Thursday":
        case "Friday":
            dayType = "Weekday";
            break;
        case "Saturday":
        case "Sunday":
            dayType = "Weekend";
            break;
  
        default:
            dayType = "Invalid daytype";
        }

if(day.equals("Monday")) {
  dayType = "Weekday";
}
else if(day.equals("Tuesday")) {
  dayType = "Weekday";
}
else if(day.equals("Wednesday")) {
  dayType = "Weekday";
}
else if(day.equals("Thursday")) {
  dayType = "Weekday";
}
else if(day.equals("Friday")) {
  dayType = "Weekday";
}
else if(day.equals("Saturday")) {
  dayType = "Weekend";
}
else if(day.equals("Sunday")) {
  dayType = "Weekend";
}
else {
  System.out.println("Invalid day type.");
}










        /*
        boolean fact = true;

        for (int i = 0; i < 100; i++) {
            while(i < 100) {
                i++;
                System.out.println(i);
            }
            }
            */
         
                /*
                 double x,u;          
                 double y, z; //Missing semicolon 
                 String sentence = "Hello World";
                 String letter = "a";  
                 y = 2.1; //Y has a decimal so it must be converted to a double instead of an integer. Fixed by making both y and z doubles.               
                 x = 6;
                 z = (double) y;     
                 u = (int) x;       
                 sentence = y + x + sentence; 
                 sentence = letter; 
                 */

                /*
                 int row = 5;
                 int column;
                 for(row = 5; row >= 1; row--){
                   for(column = 1; column <= row; column++){
                     if (row % 2 == 1)
                          System.out.print("< ");
                    else
                         System.out.print("> ");
                 }
                        System.out.println();
                 }
                 */

                 /*
                 int row = 5;
                 int column = 1;
                 for(row = 5; row >= 1; row--){
                   while(column <= row){
                     if (row % 2 == 1)
                          System.out.print("< ");
                    else
                         System.out.print("> ");
                         column++;
                 }
                        System.out.println();
                 }
                 */




               


        
         

              
              




        
    }
    
}
