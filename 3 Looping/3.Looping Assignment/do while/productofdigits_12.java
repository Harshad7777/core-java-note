//Q12. Write a java program to calculate the product of digits in a number.

import java.util.*;
public class productofdigits_12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int rem, product=1;
		do
		{
			rem=n%10;
			product=product*rem;
			n=n/10;
		}
		while(n!=0);
		System.out.println("Product is: "+product);
		
	}
}