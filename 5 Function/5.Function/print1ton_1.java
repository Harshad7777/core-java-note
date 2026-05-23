/* Q1. Write a java program to print all natural numbers from 1 to n. using while loop */

import java.util.*;
public class print1ton_1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter n:");
		int n = sc.nextInt();
		
		
		System.out.println("natural number from 1 to "+n+" are: ");
		printNumbers(n);
	}
	
	public static void printNumbers(int n)
		{
			int i=1;
			while(i<=n)
			{
				System.out.println(i);	
				i++;
			}
		}	
}
/* java print1ton_1.java
enter n:10
natural number from 1 to 10 are:
1
2
3
4
5
6
7
8
9
10 */
