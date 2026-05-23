/* Q18. Write a java program to find the first and last digit of a number. */

import java.util.*;
public class Firstandlastdigit_18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt();
		
		firstandlastdigit(num);
	}
		public static void firstandlastdigit(int num)
		{
			int lastDigit = num % 10;
			int firstDigit = num;
			while (firstDigit >= 10) 
			{
				firstDigit = firstDigit / 10;
			}
			System.out.println("First digit: " + firstDigit);
			System.out.println("Last digit: " + lastDigit);
		
		}
}
/* 
java Firstandlastdigit_18.java
enter number
100
First digit: 1
Last digit: 0 */