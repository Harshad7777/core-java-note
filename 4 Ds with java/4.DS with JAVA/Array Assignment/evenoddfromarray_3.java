/* Q3. Write a Java program to display even & odd values from an array.
Input:
 Array Size = 6
 Array Elements = 11 20 33 42 55 60
Output:
 Even Values = 20 42 60
 Odd Values = 11 33 55
Explanation:
Traverse the array element by element.
If an element is divisible by 2, it is even. Otherwise, it is odd.
Separate lists are displayed for even and odd values.
 */

/*  import java.util.*;
 
 public class evenoddfromarray3
 {
	 public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		// input size
		System.out.println("enter size");
		int size = sc.nextInt();
		
		// create an array size
		 int arr[] = new int[size];
		
		// input
			System.out.println("enter "+size+" element");
			for(int i=0; i<size; i++)
			{
				arr[i]=sc.nextInt();
			}
			
			//output
			System.out.println("Even Values");	
	     
			for(int i=0; i<size; i++)
			{
				if(arr[i]%2==0)
				{
					System.out.println(arr[i]);	
				}
				
			}
			System.out.println("odd Values");
			
			for(int  i=0; i<size; i++)
			{
				if(arr[i]%2==1)
				{
					System.out.println(arr[i]);	
				}
			}
	}
 } */
 
 /* 
>java evenoddfromarray3.java
enter size
6
enter 6 element
11
20
33
42
55
60
Even Values
20
42
60
odd Values
11
33
55

> */

import java.util.*;
public class evenoddfromarray3
{
	public static void main(String x[])
	{
		int a[], i;
		a = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter values");
		for(i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("even values : ");
		for(i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" ");
			}
		}
		
		System.out.println("odd values : ");
		for(i=0;i<a.length; i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]+" ");
			}
		}
		
		
	}
}