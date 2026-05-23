/*
Q31. Write a Java program to check whether a number is even or odd. 
*/

import java.util.*;
public class numberevenorodd_31
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter number");
			int num = sc.nextInt();
			
			if(num%2 == 0)
			{
				System.out.println("given number is even");
			}
			else
			{
				System.out.println("given number is odd");
			}
		}
	}
/* 	
>javac numberevenorodd.java
>java numberevenorodd
enter number
10
given number is even

>java numberevenorodd
enter number
11
given number is odd	

 */