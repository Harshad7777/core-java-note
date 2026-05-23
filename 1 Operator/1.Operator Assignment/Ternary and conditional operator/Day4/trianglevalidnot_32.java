/*
Q32. Write a Java program to check whether a triangle is valid or not.

A triangle is valid if the sum of any two sides is greater than the third side.
That means:
a + b > c 
a + c > b
b + c > a
*/

import java.util.*;
public class trianglevalidnot_32
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter number");
			int a = sc.nextInt();
			
			System.out.println("enter number");
			int b = sc.nextInt();
			
			System.out.println("enter number");
			int c = sc.nextInt();
			
			if(a +b > c && b + c > a && a + c >b)
			{
				System.out.println("triangle is valid");
			}
			else
			{
				System.out.println("triangle is not valid");
			}
		}
	}
	
/* 
>javac trianglevalidnot.java
>java trianglevalidnot
enter number
3
enter number
4
enter number
5
triangle is valid 
*/
	