/* Q3. Write a program with a class MaxFinder having overloaded max() methods that return the largest value among:
two integers,
three integers, and
two double values. */


import java.util.*;

public class MaxFinder_3
{
	static int max(int a, int b)
	{
		return (a>b)?a:b;
	}
	
	static int max(int a, int b, int c )
	{
		if(a>=b && a>=c)
		{
			return a;
		}
		else if(b>=a && b>=c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	
	static double max(double a, double b)
	{
		return (a>b)?a:b;
	}
	
	public static void main(String x[])
	{
		System.out.println("max of (10,20) : "+max(10,20));
		System.out.println("max of (10,20,30) :"+max(10,20,30));
		System.out.println("max of (10.2,20.2) :"+max(10.2,20.2));
		
	}



/* java MaxFinder_3.java
max of (10,20) : 20
max of (10,20,30) :30
max of (10.2,20.2) :20.2 */