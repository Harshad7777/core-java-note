/*
Q11. Write a java program to calculate the sum of digits in a number.
*/

import java.util.*;
public class sumofdigitsinnum_11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while (num != 0)
		{
			sum += num % 10;
			num/=10;
		}
			System.out.println("sum of digits are :"+sum);
	}
}

/*

>javac sumofdigitsinnum11.java

>java sumofdigitsinnum11
enter number
1234
sum of digits are :10
*/