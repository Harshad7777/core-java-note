/*
Q1. Write a java program to print all natural numbers from 1 to n. using while loop
*/


import java.util.*;
public class printallnaturalnum1ton_1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of n");
		int n = sc.nextInt();
		
		int i=1;
	
		do
		{
			System.out.print(i+ " ");
			i++;
		}
		while(i<=n);
	}
}


/* 
>java printallnaturalnum1ton_1.java
enter value of n
10
1 2 3 4 5 6 7 8 9 10 */