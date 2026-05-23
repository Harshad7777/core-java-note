/*
Q47. Write a java program to find the maximum between two numbers.
*/
import java.util.*;
public class maximumbtweentwonumbers_47
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter first numbers");
		int a = sc.nextInt();
		
		System.out.println("enter second numbers");
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(a +" is  grater than the " +b);
		}
		else 
		{
			System.out.println( b +" is  grater than the " +a);
		}	
	}
}

> javac maximumbtweentwonumbers.java

> java maximumbtweentwonumbers
enter first numbers
10
enter second numbers
20
20 is  grater than the 10
