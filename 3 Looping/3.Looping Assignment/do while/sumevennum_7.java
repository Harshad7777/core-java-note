/*
Q7. Write a java program to find the sum of all even numbers between 1 to n.
*/

import java.util.*;
public class sumevennum7
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of n:");
		int n = sc.nextInt();
		int i=2;
		int sum =0;
		
		while(n>=i)
		{
			sum = sum +i;
			//System.out.println(i+"");
			i+=2;
		}
		System.out.println(sum+" is a sum of even numbers between 1 to "+n);
	}
}
/* 
>javac sumevennum7.java
>java sumevennum7
enter value of n:
10
30 is a sum of even numbers between 1 to 10 */