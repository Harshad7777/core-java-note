/*
Q29. Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2
*/

import java.util.Scanner;
public class findquotientandremainder_29
{
 public static void main(String x[])
 {
	Scanner sc = new Scanner(System.in);
 
	double dividend, divisor;
	
	System.out.println("enter basic divisor: ");
	divisor = sc.nextInt();
	
	System.out.println("enter the dividend :");
	dividend = sc.nextInt();
	
	double Quotient = dividend/divisor;
	
	double remainder = dividend%divisor;
	
	System.out.println("after divison dividend by divisor Quotient is"+Quotient);
	System.out.println("after divison dividend by divisor remainder is"+remainder);
 }
}

/* >javac findquotientandremainder.java

>java findquotientandremainder
enter basic divisor:
3
enter the dividend :
20
after divison dividend by divisor Quotient is 6.666666666666667
after divison dividend by divisor remainder is 2.0 */
