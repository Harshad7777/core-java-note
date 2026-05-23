/*
Q22. Write a program to find first and last digit of a number without using loop in three digit.
*/

import java.util.*;
public class firstandlastdigit_22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter three digit number");
		int digit = sc.nextInt();
		
		int first = (digit/100);
		int last = (digit%10);
		
		System.out.println("First digit = " + first);
        System.out.println("Last digit = " + last);
	}
}

/* >javac firstandlastdigit.java

>java firstandlastdigit
enter three digit number
123
First digit = 1
Last digit = 3 */