//Q14. Write a java program to check whether a number is palindrome or not.


import java.util.*;
public class palindromeornot_14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int temp = n;
		int rem, rev=0;
		do
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}while(n!=0);
		
		if(temp==rev)
		System.out.println("Palindrome Number");
		else
		System.out.println("Not Palindrome Number");
	}
}