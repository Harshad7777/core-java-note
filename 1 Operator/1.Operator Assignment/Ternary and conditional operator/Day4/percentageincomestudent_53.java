/*
Q53. Take percentage and income of a student:
If percentage >= 75 AND income < 200000, print "Eligible"

Else "Not Eligible"
*/

import java.util.*;
public class percentageincomestudent_53
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the percentage");
		double percentage = sc.nextDouble();
		
		System.out.println("enter the income");
		double income = sc.nextDouble ();
		
		if(percentage >= 75 && income < 200000 )
		{
			String Eligible = "Eligible";
		}
		else
		{
			Eligible = " not Eligible ";
		}
		System.out.println("according to percentage and income of a student are" +Eligible);
	}
}

/* >javac percentageincomestudent53.java

>java percentageincomestudent53
enter the percentage
80
enter the income
150000
accordig percentage and income of a student areEligible */
/* 
>java percentageincomestudent53
enter the percentage
60
enter the income
250000
accordig percentage and income of a student are not Eligible */