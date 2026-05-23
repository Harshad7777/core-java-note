// Q6. Write a java program to enter marks of five subjects and calculate total marks and percentage.

import java.util.*;
public class TotalMarksandPercentage_11
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter marks of subject 1:");
		double sub1 = sc.nextDouble();

		System.out.println("enter marks of subject 2:");
		double sub2 = sc.nextDouble();

		System.out.println("enter marks of subject 3:");
		double sub3 = sc.nextDouble();

		System.out.println("enter marks of subject 4:");
		double sub4 = sc.nextDouble();

		System.out.println("enter marks of subject 5:");
		double sub5 = sc.nextDouble();

		double total = sub1 + sub2 + sub3 + sub4 + sub5;
		double percentage = (total / 500) * 100;

		System.out.println("total marks :"+total);
		System.out.println("percentage :"+percentage);
	}
}

// PS C:\Users\harsh\Downloads\java course notes\java> javac Day2.java    
// PS C:\Users\harsh\Downloads\java course notes\java> java Day2      
// enter marks of subject 1:
// 70
// enter marks of subject 2:
// 70
// enter marks of subject 3:
// 80
// enter marks of subject 4:
// 90
// enter marks of subject 5:
// 95
// total marks :405.0
// percentage :81.0