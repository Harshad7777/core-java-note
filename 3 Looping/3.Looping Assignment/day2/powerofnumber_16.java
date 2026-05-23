/*
Q16. Write a java program to find power of a number.
*/

import java.util.*;
public class powerofnumber_16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the base :");
		int b = sc.nextInt();
		
		System.out.println("enter the power :");
		int p = sc.nextInt();
		
		int i=1;
		int sum = 1;
		while( p>=i)
		{	
			sum = sum*b;
			
			//System.out.println("");
			i++;
		}
		System.out.println("power of a number is "+sum);
	}
}
/* 
>javac powerofnumber16.java

>java powerofnumber16
enter the base :
2
enter the power :
2
power of a number is 4 */