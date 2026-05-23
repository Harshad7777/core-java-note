/*
Q8. Write a java program to find the sum of all odd numbers between 1 to n.
*/

import java.util.*;
public class sumoddnum8
{
	public static void main (String x[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter value of n:");
		int n = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		while(n>=i)
		{
			sum = sum + i;
			//System.out.println(i+"");
			i+=2;
		}
		System.out.println(sum+" is a sum of odd numbers between 1 to "+n);
	}
}
/* 
>javac sumoddnum8.java
>java sumoddnum8
enter value of n:
10
25 is a sum of odd numbers between 1 to 10 */