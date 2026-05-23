/* Q21.  Write a java program to check Number Is Prime Number or Not. 

Example : A prime number is a number that can only be divided by itself and 1 without remainders.The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.*/

import java.util.*;

public class primeCheck_21
{
	 public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" enter number and chack it is prime or not");
		
		int num = sc.nextInt();
		
		prime(num);
	}
	
	public static void prime(int num)
	{ 
		
		int i = 1;
		int count = 0;
		
		while(i<=num)
		{
			if(num%i == 0)
			{
				count++;
			}
			i++;
		}
		if(count==2)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
}

/* java primeCheck_21.java
enter number and chack it is prime or not
10
not prime */
