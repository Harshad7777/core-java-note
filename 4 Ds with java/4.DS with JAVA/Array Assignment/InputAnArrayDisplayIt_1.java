/* Array Assignment
===================================================

Date :- 23-09-2025
Q1. Write a Java program to input an array & display it.
Input:
 Array Size = 5
 Array Elements = 10 20 30 40 50
Output:
 10 20 30 40 50
Explanation:
First, we take the size of the array from the user.
Then, elements are entered one by one into the array.
Finally, using a loop, we display all elements in the same order they were entered.
 */

/*  import java.util.*;
 
 public class InputAnArrayDisplayIt1
 {
	 public static void main(String x[])
	 {
		 Scanner sc = new Scanner(System.in);
		 
		// take array size
		 System.out.println("enter five value in array");
		 int size = sc.nextInt();
		 
		// create array of given size //referencr
		 int arr[] = new int[size];
		 
		// input array elements // becuase array start from the 0 to 4 having 5 places
		 System.out.println("enter "+ size +" elements:");
		  for (int i=0; i<size; i++)
			 {
				 arr[i]=sc.nextInt();
			 }
		 
		// display array
		  System.out.print("Array elements are:"); 
		  for (int i=0; i<size; i++)
			 {
				 System.out.print(arr[i]+" "); 
			 }  
	 }
 } */
 
/* >java InputAnArrayDisplayIt1.java
enter five value in array
5
enter 5 elements:
10
20
30
40
50
Array elements are:10 20 30 40 50 */

import java.util.*;
public class InputAnArrayDisplayIt1
{
	public static void main(String x[])
	{
		int a[];
		a = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  5 value");
		
		
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
			
		}
		
		System.out.println("Display Series");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}