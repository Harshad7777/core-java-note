/* Q4. Write a Java program to display even & odd index values from an array.
Input:
 Array Size = 6
 Array Elements = 5 10 15 20 25 30
Output:
 Values at Even Index = 5 15 25
 Values at Odd Index = 10 20 30
Explanation:
Index starts from 0.
Even index positions are 0, 2, 4, ….
Odd index positions are 1, 3, 5, ….
We print the values according to their index category.
 */
/* 
import java.util.*;
public class evenoddindexvalues4
{
	 public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter "+size+" element");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Values at Even Index");
		for(int i=0; i<size; i++)
		{
			if(i%2==0)
			{
				System.out.println(arr[i]);
			}
		}
		System.out.println("Values at Odd Index");
		for(int i=0; i<size; i++)
		{
			if(i%2==1)
			{
				System.out.println(arr[i]);
			}
		} 
	}
} */

import java.util.*;
public class evenoddindexvalues4
{
	public static void main(String x[])
	{
		int a[],i;
		a = new int[6];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the values :");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		System.out.print("value at even index :");
		for(i=0; i<a.length; i++)
		{
			if(i%2==0)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		
		System.out.print("value at odd index :");
		for(i=0; i<a.length; i++)
		{
			if(i%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		
	}
}