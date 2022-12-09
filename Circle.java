/*
Kevin Dotel
12/4/21
CSE 7: Activity
This is the Circle program
*/
import java.util.*;
public class Circle extends Shape {

    private double radius;
    private static int numCircle = 0;

    public Circle() {
        numCircle++;
    }

    public Circle (double radius) {
        numCircle++;
    }
    public Circle (double radius, String color, String name) {
        super(color, name);
        this.radius = radius;
        numCircle++;
    }
    
    //Getter and Setter methods

    public int getNumCircle() {
        return numCircle;
    }

    public double computeArea() {
        double area = radius * radius * Math.PI;
        setNumArea(area);
        return area;
    }
    
    public double computePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        setNumPerimeter(perimeter);
        return perimeter; 
    }
    
    public String toString() {
        return super.toString() + "\n" + "Radius: " + radius;
    }

    public void setRaius(double userRadius) {
        radius = userRadius;
    }
    
}
