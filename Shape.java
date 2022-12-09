
/*
Kevin Dotel
12/4/21
CSE 7: Lab
This is the Shape program
*/
import java.util.*;
public class Shape {

    private String color;
    private String name;
    private static int numShapes = 0;
    private static int numArea = 0;
    private static int numPerimeter = 0;

    public Shape() {
        numShapes++;
    }

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
        numShapes++;
    }

    public void setName(String userName) {
        name = userName;
    }

    public void setColor(String userColor) {
        color = userColor;
    }

    public double computeArea() {
        numArea++;
        return 0.0;
    }

    public double computePerimeter(){
        numPerimeter++;
        return 0.0;
    }

    public String toString(){
        return "Color: " + color + "\n" + "Name: " + name;
    }
    
    public int getNumShapes() {
        return numShapes;
    }

    public void setNumArea(double userArea) {
        numArea += userArea;
    }

    public double getNumArea() {
        return numArea;
    }

    public void setNumPerimeter(double userPerimeter) {
        numPerimeter += userPerimeter;
    }

    public double getNumPerimeter() {
        return numPerimeter;
    }





}