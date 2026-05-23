 /*
Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.
*/

import java.util.*;
public class naturalfromnto1_2
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of n");
		int n = sc.nextInt();
		
		int i=1;
		
		do
		{
			System.out.println(+n );
			--n;
		}
		while(n>=1);
	}
}
/* 
>javac naturalfromnto1.java
>java naturalfromnto1
enter value of n
5
5
4
3
2
1
 */