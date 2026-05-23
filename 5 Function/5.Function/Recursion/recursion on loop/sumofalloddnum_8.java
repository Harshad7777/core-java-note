/* Q8. Write a java program to find the sum of all odd numbers between 1 to n. */

import java.util.*;
public class sumofalloddnum_8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the number :");
		int n = sc.nextInt();
		
		System.out.println("sum :"+sum(n));
	}
	static int sum(int n)
	{
		if (n==0)
			return 0;
		
		if(n%2!=0)
			return n + sum(n-1); //for odd
		
		else
			return sum (n-1);  //for even	
	}
}

/* java sumofalloddnum_8.java
enter the number :10
sum :25 */