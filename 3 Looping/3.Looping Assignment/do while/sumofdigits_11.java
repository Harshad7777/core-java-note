//Q11. Write a java program to calculate the sum of digits in a number.


import java.util.*;
public class sumofdigits_11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int rem, sum=0;
		do
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		while(n!=0);
		System.out.println("sum is: "+sum);
		
	}
}