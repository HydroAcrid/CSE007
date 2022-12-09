/*
Kevin Dotel
12/4/21
CSE 7: Lab
This is the ShapeTest program
*/
import java.util.*;
import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {

        //Variables
        String option;
        Scanner scnr = new Scanner(System.in);
        Shape[] shapeArray = new Shape[5];
        String[] shapeNames = {"Circle", "Rectangle", "Triangle"};
        String[] shapeColors = {"Red", "Purple", "Blue", "Green","Orange","Yellow"};
        String[] shapeNameName = {"Tyler","Freddy","Carl","Kevin","Jason","Alec"};


        //Shape code for predecided variables
        Shape sh = new Shape("Blue", "shape");
        System.out.println(sh.toString());
        System.out.println("Area is: " + sh.computeArea());
        System.out.println("Perimeter is: " + sh.computePerimeter());
        System.out.println("Shape number: " + sh.getNumShapes());
        shapeArray[0] = sh;

        //Circle code for predecided variables
        Circle cr = new Circle(2, "Red", "Circle");
        System.out.println(cr.toString());
        System.out.println("Area is: " + cr.computeArea());
        System.out.println("Perimeter is: " + cr.computePerimeter());
        System.out.println("Circle number: " + cr.getNumCircle());
        shapeArray[1] = cr;

        //Triangle code for predecided variables
        Triangle tr = new Triangle(5,4,2,1,"Purple", "Triangle");
        System.out.println(tr.toString());
        System.out.println("Area is: " + tr.computeArea());
        System.out.println("Perimeter is: " + tr.computePerimeter());
        System.out.println("Triangle number: " + tr.getNumTriangle());
        shapeArray[2] = tr;

        //Rectangle code for predecided variables
        Rectangle re = new Rectangle(4,2,"Green","Rectangle");
        System.out.println(re.toString());
        System.out.println("Area is: " + re.computeArea());
        System.out.println("Perimeter is: " + re.computePerimeter());
        System.out.println("Rectangle number: " + re.getNumRects());
        System.out.println("Shape number: " + re.getNumShapes());
        shapeArray[3] = re;

        //Intro
        System.out.println("Hello, welcome to Kevin Dotel's Shape Program! So much fun!!!");
        System.out.println("Please select an option: ");
        System.out.println("C - Circle");
        System.out.println("T - Triangle");
        System.out.println("R - Rectangle");
        System.out.println("Z - Random Shape");
        

        //Choice for shapes
        String choice = getString(scnr);
        if(choice.equals("c")) {
            getCircle(scnr);
        }
        else if(choice.equals("t")) {
            getTriangle(scnr);
        }
        else if(choice.equals("r")) {
            getRectangle(scnr);
        }
        else if(choice.equals("z")) {
            getRandShape(shapeNames, shapeColors, shapeNameName);
        }


    }

    public static void getShape() { //Is this even actually needed? 
    }

    //Circle code for inputted variables
    public static void getCircle(Scanner scnr) {
        int intChoice = 0;
        Circle userCircle = new Circle();
        System.out.println("You are in getCircle");
        System.out.println("Enter the radius: ");
        intChoice = getInt(scnr);
        userCircle.setRaius(intChoice);
        System.out.println("Enter the color: ");
        String colorChoice = getStringColor(scnr);
        userCircle.setColor(colorChoice);
        System.out.println("Enter the name: ");
        userCircle.setName(scnr.next());
       
        System.out.println(userCircle.toString());
        System.out.println("Area is: " + userCircle.computeArea());
        System.out.println("Perimeter is: " + userCircle.computePerimeter());
        System.out.println("Circle number: " + userCircle.getNumCircle());
        System.err.println("Shape number: " + userCircle.getNumShapes());
        System.out.println("Total area is: " + userCircle.getNumArea());
        System.out.println("Total perimeter is: " + userCircle.getNumPerimeter());

        

    }

    //Triangle code for inputted variables
    public static void getTriangle(Scanner scnr) {
        int intChoice = 0;
        Triangle userTriangle = new Triangle();
        System.out.println("You are in getTriangle");
        System.out.println("Enter the base: ");
        intChoice = getInt(scnr);
        userTriangle.setBase(intChoice);
        System.out.println("Enter the height: ");
        intChoice = getInt(scnr);
        userTriangle.setHeight(intChoice);
        System.out.println("Enter length 1: ");
        intChoice = getInt(scnr);
        userTriangle.setLength1(intChoice);
        System.out.println("Enter length 2: ");
        intChoice = getInt(scnr);
        userTriangle.setLength2(intChoice);
        System.out.println("Enter the color: ");
        String colorChoice = getStringColor(scnr);
        userTriangle.setColor(colorChoice);
        System.out.println("Enter the name: ");
        userTriangle.setName(scnr.next());

        System.out.println(userTriangle.toString());
        System.out.println("Area is: " + userTriangle.computeArea());
        System.out.println("Perimeter is: " + userTriangle.computePerimeter());
        System.out.println("Triangle number: " + userTriangle.getNumTriangle());
        System.out.println("Shape number: " + userTriangle.getNumShapes());
        System.out.println("Total area is: " + userTriangle.getNumArea());
        System.out.println("Total perimeter is: " + userTriangle.getNumPerimeter());



    }

    //Rectangle code for inputted variables
    public static void getRectangle(Scanner scnr) {
        int intChoice = 0;
        Rectangle userRect = new Rectangle();
        System.out.println("You are in getRectangle");
        System.out.println("Enter the length: ");
        intChoice = getInt(scnr);
        userRect.setLength(intChoice);
        System.out.println("Enter the width: ");
        intChoice = getInt(scnr);
        userRect.setWidth(intChoice);
        System.out.println("Enter the color(red, green, or blue): ");
        String colorChoice = getStringColor(scnr);
        userRect.setColor(colorChoice);
        System.out.println("Enter the name: ");
        userRect.setName(scnr.next());

        System.out.println(userRect.toString());
        System.out.println("Area is: " + userRect.computeArea());
        System.out.println("Perimeter is: " + userRect.computePerimeter());
        System.out.println("Rectangle number: " + userRect.getNumRects());
        System.out.println("Shape number: " + userRect.getNumShapes());
        System.out.println("Total area is: " + userRect.getNumArea());
        System.out.println("Total perimeter is: " + userRect.getNumPerimeter());

    }

    //Random shape code for inputted variables
    public static void getRandShape(String[] shapeNames, String[] shapeColors, String[] shapeNameName) {

        Random random1 = new Random();
        int index1 = random1.nextInt(shapeNames.length);
        System.out.println(shapeNames[index1]);

        Random random2 = new Random();
        int index2 = random2.nextInt(shapeColors.length);
        System.out.println(shapeColors[index2]);
        String color = shapeColors[index2];

        Random random3 = new Random();
        int index3 = random3.nextInt(shapeNameName.length);
        System.out.println(shapeNameName[index3]);
        String name = shapeNameName[index3];

        switch(shapeNames[index1]){
            case "Rectangle":
            System.out.println("Rectangle has been chosen");
            getRandRectangle(random1, color, name);
            break;
            case "Circle":
            System.out.println("Circle has been chosen");
            getRandCircle(random2, color, name);
            break;
            case "Triangle":
            System.out.println("Triangle has been chosen");
            getRandTriangle(random3, color, name);
            break;
        }

    }

    //Random color for inputted variables
    public static String getRandColor(String[] shapeColors) {
        Random random = new Random();
        int index = random.nextInt(shapeColors.length);
        //System.out.println(shapeColors[index]);
        String color = shapeColors[index];

        return color;

    }

    //Random name for inputted variables
    public static String getRandName(String[] shapeNameName) {
        Random random = new Random();
        int index = random.nextInt(shapeNameName.length);
        //System.out.println(shapeNameName[index]);
        String name = shapeNameName[index];

        return name;

    }

    //Random rectangle code
    public static void getRandRectangle(Random rand, String color, String name) {

        int intChoice = 0;
        Rectangle randRect = new Rectangle();
        //System.out.println("Get random length");
        intChoice = rand.nextInt(101);
        randRect.setLength(intChoice);  
        //System.out.println("Get random width");
        intChoice = rand.nextInt(101);
        randRect.setWidth(intChoice);
        //System.out.println("Color");
        randRect.setColor(color);
        //System.out.println("Name");
        randRect.setName(name);

        System.out.println(randRect.toString());
        System.out.println("Area is: " + randRect.computeArea());
        System.out.println("Perimeter is: " + randRect.computePerimeter());
        System.out.println("Rectangle number: " + randRect.getNumRects());
        System.out.println("Shape number: " + randRect.getNumShapes());
        System.out.println("Total area is: " + randRect.getNumArea());
        System.out.println("Total perimeter is: " + randRect.getNumPerimeter());

    }

    //Random circle code
    public static void getRandCircle(Random rand, String color, String name) {

        int intChoice = 0;
        Circle randCircle = new Circle();
        //System.out.println("radius: ");
        intChoice = rand.nextInt(101);
        randCircle.setRaius(intChoice);
        //System.out.println("Color");
        randCircle.setColor(color);
        //System.out.println("Name");
        randCircle.setName(name);

        System.out.println(randCircle.toString());
        System.out.println("Area is: " + randCircle.computeArea());
        System.out.println("Perimeter is: " + randCircle.computePerimeter());
        System.out.println("Circle number: " + randCircle.getNumCircle());
        System.out.println("Shape number: " + randCircle.getNumShapes());
        System.out.println("Total area is: " + randCircle.getNumArea());
        System.out.println("Total perimeter is: " + randCircle.getNumPerimeter());


    }

    //Random triangle code
    public static void getRandTriangle(Random rand, String color, String name) {

        int intChoice = 0;
        Triangle randTriangle = new Triangle();
        //System.out.println("The base");
        intChoice = rand.nextInt(101);
        randTriangle.setBase(intChoice);
        //System.out.println("The height");
        intChoice = rand.nextInt(101);
        randTriangle.setHeight(intChoice);
        //System.out.println("Length 1");
        intChoice = rand.nextInt(101);
        randTriangle.setLength1(intChoice);
        //System.out.println("Length 2");
        intChoice = rand.nextInt(101);
        randTriangle.setLength2(intChoice);
        //System.out.println("The color");
        randTriangle.setColor(color);
        //System.out.println("The name");
        randTriangle.setName(name);

        System.out.println(randTriangle.toString());
        System.out.println("Area is: " + randTriangle.computeArea());
        System.out.println("Perimeter is: " + randTriangle.computePerimeter());
        System.out.println("Triangle number: " + randTriangle.getNumTriangle());
        System.out.println("Shape number: " + randTriangle.getNumShapes());
        System.out.println("Total area is: " + randTriangle.getNumArea());
        System.out.println("Total perimeter is: " + randTriangle.getNumPerimeter());


    }

    //Input Validation
    //Pre: Scanner is inputted in order to gain a valid integer
    //Post: Int is outputted and placed in any method calling for an integer
    public static int getInt(Scanner scnr) {
        boolean buggin = false;
        int intValue = 0;
    
        do {
            if(!scnr.hasNextInt()) {
                System.out.println("You did not enter an integer value");
                scnr.nextLine();
            }
            else {
                intValue = scnr.nextInt();
                buggin = true;
                // if((intValue < 2) || (intValue > 25)) {
                //     System.out.println("You did not enter a valid selection. Please input a number between 2 and 25 .");
                //     scnr.nextLine();

                // }
                // else {
                //     buggin = true;
                // }
                
            }

        }while(!buggin);

        return intValue;
   }

   //Input validation for Strings. This is used to choose an option.
   //Pre: Takes in scanner to get String inout validation
   //Post: Returns the letter chosen in order to iniatiate either getCircle, getTriangle, getRectangle, or getRandom functions 
   public static String getString(Scanner scnr) {
       boolean buggin = false;
       String choice;
       int length = 0;
       
       do{
            String stringValue = scnr.next();
            choice = stringValue.substring(0,1).toLowerCase();
 
           switch(choice) {
               case "c":
               System.out.println("Circle has been chosen");
               buggin = true;
               break;
               case "t":
               System.out.println("Triangle has been chosen");
               buggin = true;
               break;
               case "r":
               System.out.println("Rectangle has been chosen");
               buggin = true;
               break;
               case "z":
               System.out.println("Random has been chosen");
               buggin = true;
               break;
               default:
               System.out.println("Invalid input. Please try again.");
               break;
           }

       }while(!buggin);

       return choice;
   }

   //This is a method used to get the color of the manually inputted shape
   //Pre: Scanner is inputted in order to choose a color
   //Post: Color is returned in order to decide shape color
   public static String getStringColor(Scanner scnr) {
    boolean buggin = false;
    String choice;
    int length = 0;
    
    do{
         String stringValue = scnr.next();
         choice = stringValue;

        switch(choice) {
            case "red":
            System.out.println("Red has been chosen");
            buggin = true;
            break;
            case "blue":
            System.out.println("Blue has been chosen");
            buggin = true;
            break;
            case "green":
            System.out.println("Green has been chosen");
            buggin = true;
            break;
            default:
            System.out.println("Invalid input. Please try red, blue, or green.");
            break;
        }

        }while(!buggin);

        return choice;
    }
}
