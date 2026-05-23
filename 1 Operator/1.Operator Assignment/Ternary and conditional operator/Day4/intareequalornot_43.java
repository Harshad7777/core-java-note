/*
Q43. Write a java program to accept two integers and check whether they are equal or not.
*/

import java.util.*;
public class intareequalornot_43
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your first integers");
		int num1 = sc.nextInt ();
		
		System.out.println("enter your first integers");
		int num2 = sc.nextInt ();
		
		if(num2 == num1)
		{
			System.out.println("given two integers are equal"); 
		}  
		else
		{
			System.out.println("given two integers not are equal");
		}
	}	
}
/* 
>javac intareequalornot.java

>java intareequalornot
enter your first integers
10
enter your first integers
10
given two integers are equal

>java intareequalornot
enter your first integers
10
enter your first integers
20
given two integers not are equal */

