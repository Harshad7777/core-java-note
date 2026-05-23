
/* Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

 */
import java.util.*;
public class reversento1_2
{ 
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number:");
		int n = sc.nextInt();
		System.out.println("reverse natural number form"+n+"1 is:");
		
		reverse(n);
	}
	
	public static void reverse(int n)
	{
			int i=n;
			while(i>=1)
			{
				System.out.println(i);	
				i--;
			}
	}	
}

/* java reversento1_2.java
enter number:
10
reverse natural number form101 is:
10
9
8
7
6
5
4
3
2
1 


		
		
		
	

