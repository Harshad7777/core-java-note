/*
Q38. Write a Java program to check whether a year is leap year or not.
*/

import java.util.*;
public class leapyear_38
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter year");
			int year = sc.nextInt();
			
		// Leap year rules:
        // 1. Divisible by 4 → Leap year
        // 2. Divisible by 100 → Not a leap year (unless divisible by 400)
			
			if((year%400==0) || ((year%100 !=0) && (year%4 == 0)))
			{
				System.out.println(year + " is a leap year. ");
			}
			else
			{
				System.out.println(year + " is not a leap year.");
			}
		}
	}
	
/* 	
>javac leapyear.java

>java leapyear
enter year
2024
2024 is a leap year.


>java leapyear
enter year
2025
2025 is not a leap year. */