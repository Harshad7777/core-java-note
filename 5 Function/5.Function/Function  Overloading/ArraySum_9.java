/*Q9. Overload a function pairSum() —
Version 1: accepts one array and prints all pairs whose sum is even.
Version 2: accepts two arrays and prints all pairs (one from each array) whose sum is divisible by 5.
Input 1: [1,2,3,4] → Output: (1,3), (2,4)  
Input 2: [1,2,3], [7,8,9] → Output: (1,9), (2,8), (3,7)
*/

import java.util.*;
public class ArraySum_9
{
	static void pairSum(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if((a[i]+a[j])%2==0)
				{
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
	}


	static void pairSum(int b[], int c[])
	{
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<c.length; j++)
			{
				if((b[i]+c[j])%5==0)
				{
					System.out.println(b[i]+","+c[j]);
				}
			}
		}
	}
	
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array version 1: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the elements in arr: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the two size of array version 2: ");
		int size2 = sc.nextInt();
		int size3 = sc.nextInt();
		int b[] = new int[size2];
		int c[] = new int[size3];
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.print("enter the element arr 2: ");
		for(int i=0; i<c.length; i++)
		{
			c[i]=sc.nextInt();
		}
		
		
		pairSum(a);
		pairSum(b, c);
	}
}