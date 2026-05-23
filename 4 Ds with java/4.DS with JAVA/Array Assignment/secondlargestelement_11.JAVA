/* 
Q6. Write a java program to give an array, find the second largest element.
Input : Array = {12, 35, 1, 10, 34, 1}
Output : Second largest = 34
Explanation:
First largest is 35, second largest is the next maximum (34). We maintain two variables (largest, secondLargest).

 */

import java.util.*;
public class secondlargestelement11
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		int size = sc.nextInt();
		
		int a[]= new int[size];
		
		System.out.print("enter "+size+" elements :");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		//find first maximum
		int largest, secondLargest;
		
		// initialize largest and second largest with two element
		if(a[0]>a[1]) //12,35
			{
				largest = a[0];
				secondLargest = a[1];
			}
		else
			{
				largest = a[1]; //35
				secondLargest = a[0]; //12
			}
		
		
		
		for(int i=2; i<size; i++)
		{
			if(a[i]>largest) //1>35 //34>35
				{
					secondLargest = largest;
					largest = a[i];
				}
			else if (a[i] > secondLargest && a[i] != largest ) //1>12 && 1!=35 // /34>12 && 34!=35
				{ 
					secondLargest = a[i];
				}
		}
		System.out.println("first largest : " +largest);
		System.out.println("Second largest : " + secondLargest);
		
	}
}

/* 
>java secondlargestelement11.java
enter size
6
enter 6 elements :12 35 1 10 34 1
first largest : 35
Second largest : 34 */


























