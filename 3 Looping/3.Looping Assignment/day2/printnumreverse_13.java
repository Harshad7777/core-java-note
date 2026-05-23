/*
Q13. Write a java program to enter a number and print its reverse.
*/

import java.util.*;
public class printnumreverse_13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int reversenum = 0;
		
		while(num !=0)
		{
			int digit = num % 10; //get last digit
			reversenum = reversenum * 10 + digit;//Build reversed number
			num/=10; //remove last digit
			
		}
		 System.out.println("Reversed number: " +reversenum );
	}
}

/*
>javac printnumreverse13.java

>java printnumreverse13
enter the number
1234
Reversed number: 4321
*/
