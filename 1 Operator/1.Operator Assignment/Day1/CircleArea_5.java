/* 
Q 5. Write a java program to enter radius of a circle and find its diameter,area and circumference.
		Formula :-
					diameter=2 * radius;
					circumference = 2 * 3.14 * radius;
					area = 3.14 * radius * radius;
*/

public class CircleArea_5
{
	public static void main(String x[])
	{
		double radius = Double.parseDouble(x[0]);
		
		double diameter= 2 * radius;
		double circumference= 2*3.14*radius;
		double area = 3.14 * radius *radius;
		
		System.out.println("diameter:"+diameter);
		System.out.println("circumference:"+circumference);
		System.out.println("area:"+area);
	}
}


/*
C:\Program Files\Java\jdk-24\bin>javac Day1.java
C:\Program Files\Java\jdk-24\bin>java Day1 10
diameter:20.0
circumference:62.800000000000004
area:314.0
*/
