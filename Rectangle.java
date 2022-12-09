/*
Kevin Dotel
12/4/21
CSE 7: Lab
This is the Rectangle program
*/
import java.util.*;
public class Rectangle extends Shape {

    private double length;
    private double width;
    private static int numRects = 0;

    public Rectangle(){
        numRects++;
    }

    public Rectangle(double length, double width) {
        numRects++;
    }

    public Rectangle(double length, double width, String color, String name) {
        super(color, name);
        this.length = length;
        this.width = width;
        numRects++;
    }

    public int getNumRects() {
        return numRects;
    }

    public double computeArea() {
        double area = length * width;
        setNumArea(area);
        return area;
    }

    public double computePerimeter() {
        double perimeter = 2*(length + width);
        setNumPerimeter(perimeter);
        return perimeter;
    }

    public String toString() {
        return super.toString() + "\n" + "Length: " + length + "\n" + "Width: " + width;
    }

    //Setter methods
    public void setLength(double userLength) {
        length = userLength;
    }

    public void setWidth(double userWidth) {
        width = userWidth;
    }

    




    
}
