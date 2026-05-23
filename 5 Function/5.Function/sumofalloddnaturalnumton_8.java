/* Q8. Write a java program to find the sum of all odd numbers between 1 to n.
 */

import java.util.*;
public class sumofalloddnaturalnumton_8

{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of n");
		int n =sc.nextInt();
		
		sumofalloddnaturalnumton(n);
	}
		
		public static void sumofalloddnaturalnumton(int n)
		{
			int i = 1;
			int sum = 0;
			while( i<=n)	
			{
				if(i%2!=0)
				{
					sum = sum + i;		
				}
				i++;
			}
			System.out.println("sum of all odd number of 1 to "+n+ " is "+sum);
		}	
}
/* 
java sumofalloddnaturalnumton_8.java
enter value of n
10
sum of all odd number of 1 to 10 is 25 */