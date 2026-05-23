//Q13. Write a java program to enter a number and print its reverse.


import java.util.*;
public class reversenumber_13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int rem, rev=0;
		do
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}while(n!=0);
		System.out.println("Reverse Number is: "+rev);
		
	}
}