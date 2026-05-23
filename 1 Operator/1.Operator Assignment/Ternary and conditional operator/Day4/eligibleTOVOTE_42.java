/*
Q42. Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.
*/

import java.util.*;
public class eligibleTOVOTE_42
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter your age");
		int age = sc.nextInt ();
	
		if(age>=18)
		{
			System.out.println("you are eligible to cast your vote");
		}
		else
		{
			System.out.println("you are not eligible to cast your vote");
		}
		}	
}
/* 
>javac eligibleTOVOTE.java
>java eligibleTOVOTE
enter your age
7
you are not eligible to cast your vote

>java eligibleTOVOTE
enter your age
18
you are eligible to cast your vote */