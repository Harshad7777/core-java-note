/* 
Q2. Create a class Adder that contains overloaded methods named sum() to calculate:
sum of two integers,
sum of three integers, and
sum of two double values.
 */

import java.util.*;
public class sumofinteger_2
{
    static void sum(int a ,int b)
    {
        double sum = a+b;
        System.out.println("sum of two integers: " + sum);
    }

    static void sum (int a, int b , int c)
    {
        int sum = a+b+c;
        System.out.println("sum of three integers: " + sum);
    }

    static void sum(double a, double b)
    {
        double sum = a+b;
        System.out.println("sum of two double values: " + sum);
    }

    // Main method
    public static void main(String x[])
    {
        sum(5,5);        
        sum(5,5,5);     
        sum(6d, 5d);   
    }
}


/* java sumofinteger_2.java
sum of two integers: 10.0
sum of three integers: 15
sum of two double values: 11.0 */