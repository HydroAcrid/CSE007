import java.util.Scanner;
public class Color {
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        String color;

        System.out.println("Input hexidecimal value: ");
        color = scnr.nextLine();

        if(color.equals("000000")) {
            System.out.println("You have selected the color: black.");
        }
        else if(color.equals("FFFFFF")) {
            System.out.println("You have selected the color: white.");
        }
        else if(color.equals("FF0000")) {
            System.out.println("You have selected the color: red.");
        }
        else if(color.equals("00FF00")) {
            System.out.println("You have selected the color: green.");
        }
        else if(color.equals("0000FF")) {
            System.out.println("You have selected the color: blue.");
        }
        else if(color.equals("FFFF00")) {
            System.out.println("You have selected the color: yellow.");
        }
        else if(color.equals("00FFFF")) {
            System.out.println("You have selected the color: cyan.");
        }
        else if(color.equals("FF00FF")) {
            System.out.println("You have selected the color: magenta.");
        }
        else if(color.equals("820082")) {
            System.out.println("You have selected the color: med. purple.");
        }
        else if(color.equals("B432B4")) {
            System.out.println("You have selected the color: faded purple.");
        }
        else if(color.equals("282828")) {
            System.out.println("You have selected the color: dark grey.");
        }
        else if(color.equals("66FFCC")) {
            System.out.println("You have selected the color: aquamarine.");
        }
        else if(color.equals("FFCCCC")) {
            System.out.println("You have selected the color: pink.");
        }
        else if(color.equals("FF9900")) {
            System.out.println("You have selected the color: orange.");
        }
        else if(color.equals("00FF00")) {
            System.out.println("You have selected the color: lime.");
        }
        else {
            System.out.println("Error. Value inputted not in hexidecimal bank.");
        }

        String sub1 = color.substring(0,2);
        int num1 = Integer.parseInt(sub1,16);
        String sub2 = color.substring(2,4);
        int num2 = Integer.parseInt(sub2,16);
        String sub3 = color.substring(4,6);
        int num3 = Integer.parseInt(sub3,16);


        System.out.println("Hexidecimal converted to decimal: (" + num1 + ", " + num2 + ", " + num3 + ")");
        







    }
}
