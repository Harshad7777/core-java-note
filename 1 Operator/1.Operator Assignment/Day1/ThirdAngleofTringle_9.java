// Q4. Write a java program to enter two angles of a triangle and find the third angle. 

import java.util.*;
public class ThirdAngleofTringle_9
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter first angle:");
		double angle1 = sc.nextDouble();

		System.out.println("enter second angle:");
		double angle2 = sc.nextDouble();

		double angle3 = 180 - ( angle1 + angle2 );

		System.out.println("third angle of triangle :"+angle3);
	}
}

// javac Day2.java
// java Day2      
// enter first angle:
// 30
// enter second angle:
// 60
// third angle of triangle :90.0

