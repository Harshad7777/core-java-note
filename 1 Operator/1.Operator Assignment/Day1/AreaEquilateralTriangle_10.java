// Q5. Write a java program to calculate area of an equilateral triangle.

import java.util.*;
public class AreaEquilateralTriangle_10
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
        
		System.out.println("enter side length:");
		double side = sc.nextDouble();

        double area = (Math.sqrt(3) / 4) * side * side;

		System.out.println("area of equilateral triangle :"+area);
	}
}

// PS C:\Users\harsh\Downloads\java course notes\java> javac Day2.java
// PS C:\Users\harsh\Downloads\java course notes\java> java Day2
// enter side length:
// 10 
// area of equilateral triangle :43.301270189221924
