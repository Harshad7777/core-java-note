/* Q1. Write a Java program to create a class AreaCalculator that uses function overloading to calculate the area of:
a circle using radius,
a rectangle using length and breadth, and
a triangle using base and height.
Use methods:
void area(int r)
void area(int l, int b)
void area(double b, double h) */

import java.util.*;

public class AreaCalculator_1
{
    static void area(int radius)
    {
        double circle = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + circle);
    }

    static void area(int l, int b)
    {
        int rectangle = l * b;
        System.out.println("Area of Rectangle: " + rectangle);
    }

    static void area(double base, double height)
    {
        double triangle = 0.5 * base * height;
        System.out.println("Area of Triangle: " + triangle);
    }

    // Main method
    public static void main(String x[])
    {
        area(5);        
        area(4, 5);   
        area(6d, 5d);   
    }
}
/* 
java sumofinteger_2.java
Area of Circle: 10.0
Area of Rectangle: 15
Area of Triangle: 11.0
 */