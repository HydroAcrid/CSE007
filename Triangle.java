/*
Kevin Dotel
12/4/21
CSE 7: Lab
This is the Triangle program
*/
import java.util.*;
public class Triangle extends Shape {
    private double base;
    private double height;
    private double length1;
    private double length2;
    static int numTris = 0;
    public Triangle() {
        super();
        base = 0;
        height = 0;
        length1 = 0;
        length2 = 0;
        numTris++;
    }

    public Triangle (double base, double height, double length1, double length2) {
        this.base = base;
        this.height = height;
        this.length1 = length1;
        this.length2 = length2;
        numTris++;
    }

    public Triangle (double base, double height, double length1, double length2, String color, String name) {
        super(color, name);
        this.base = base;
        this.height = height;
        this.length1 = length1;
        this.length2 = length2;
        numTris++;
    }

    //Getter and Setter methods

    public int getNumTriangle() {
        return numTris;
    }
    
    public double computeArea() {
        double area = (0.5 * base * height);
        setNumArea(area);
        return area;
    }

    public double computePerimeter() {
        double perimeter = length1 + length2 + base;
        setNumPerimeter(perimeter);
        return perimeter;
    }

    public String toString() {
        return super.toString() + "\n" + "Height: " + height + "\n" + "Base: " + base + "\n" + "Length1: " + length1 + "\n" + "Length2: " + length2;
    }

    public void setBase(double userBase) {
        base = userBase;
    }

    public void setHeight(double userHeight) {
        height = userHeight;
    }

    public void setLength1(double userLength1) {
        length1 = userLength1;
    }

    public void setLength2(double userLength2) {
        length2 = userLength2;
    }

    
}
