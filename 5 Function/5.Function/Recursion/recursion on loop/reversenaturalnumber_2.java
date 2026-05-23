/* Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop. */

import java.util.*;
public class reversenaturalnumber_2
{
	static void reverse(int n)
	{
		if(n==0)
			return;
		
		System.out.println(n);
		reverse(n-1);
	}
	
	public static void main(String x[])
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the value of n:");
			int n = sc.nextInt();
			
			reverse(n);			
	}
}
/* 
import java.util.*;
public class reversenaturalnumber_2
{
	static void reverse(int n, int i)
	{
		if(i>n)
			return;
		
		reverse(n, i+1);
		System.out.println(i+" ");
	
	}
	
	public static void main(String x[])
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the value of n:");
			int n = sc.nextInt();
			
			reverse(n,1);			
	}
	
	
} */


/* 
java reversenaturalnumber_2.java
enter the value of n:
10
10
9
8
7
6
5
4
3
2
1 */