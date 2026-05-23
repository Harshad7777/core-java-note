/* Q16. Write a java program to find power of a number. */

import java.util.*;
public class Powerofnumber_16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the base :");
		int b = sc.nextInt();
		
		System.out.println("enter the power :");
		int p = sc.nextInt();
		
		power(b, p);
	}
    public static void power(int b,int p)
	{
		int i=1;
		int sum =1;
		while( p>=i)
		{	
			sum = sum*b;
			
			//System.out.println("");
			i++;
		}
		System.out.println("power of a number is "+sum);
	}
}

/* java Powerofnumber_16.java
enter the base :
5
enter the power :
5
power of a number is 3125 */