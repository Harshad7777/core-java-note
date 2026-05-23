/*
Q35. Write a Java program to check whether a number is divisible by 5 and 11 or not. 
*/

import java.util.*;
public class numberdivi5and11not_35
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter number");
			int num = sc.nextInt();
			
			if(num%5==0 && num%11==0)
			{
				System.out.println(num +"number is divisible by 5 and 11 ");
			}
			else
			{
				System.out.println( num +" number is not divisible by 5 and 11  ");
			}
		}
	}
/* 	
>javac numberdivi5and11not.java
>java numberdivi5and11not
enter number
55
55number is divisible by 5 and 11 */