/*
Q36. Write a Java program to check whether character is alphabetic or not.
*/

import java.util.*;
public class alphabeticornot_36
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter any character");
			char ch = sc.next().charAt(0);
			
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
			{
				System.out.println(ch +" is an Alphabet ");
			}
			else
			{
				System.out.println( ch +" is an not Alphabet");
			}
		}
	}
/* 	
>javac alphabeticornot.java
>java alphabeticornot
enter any character
A
A is an not Alphabet

>java alphabeticornot
enter any character
1
1 is an not Alphabet */