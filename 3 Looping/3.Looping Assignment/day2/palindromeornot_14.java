/*
Q14. Write a java program to check whether a number is palindrome or not.
*/

import java.util.*;
public class palindromeornot_14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int originalnum = num;
		int reversenum = 0;
		
		while(num !=0)
		{
			   //get last digit
			reversenum = reversenum * 10 + (num % 10);//Build reversed number
			num/=10; //remove last digit
			
		}
		if(originalnum == reversenum)
		{
			System.out.println("given number is palindrome");
		}
		else
		{
			System.out.println("given number is not palindrome");
		}
		
	}
}
/*

>javac palindromeornot14.java
>java palindromeornot14
enter the number
121
given number is palindrome

*/

