/* 
Q2. Write a program in java to find the majority element of an array ?

	A majority element in an array of size n is an element that appears more than n/2 times (and

	hence there is at most one such element).

	Expected Output:

	The given array is: 4  8  4  6  7  4  4  8

	There are no Majority Elements in the given array 
	*/
	
import java.util.*;
public class majorityelementofarray17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter " +size+ " elemnt");
		for(int i=0; i<size; i++)
			{
				a[i] = sc.nextInt(); 
			}
			
		int majorityElement = -1;
	// pick up each element
		for(int i=0; i<size; i++)
			{
				int count = 0;
				// find match	
				for(int j=0; j<size; j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				// chack majoritey
				if(count>size/2)
				{
					majorityElement = a[i];
					break;
				}
			}

		//print given array
		System.out.println(" The given array is: ");	
		for(int i=0; i<size; i++)
			{
				System.out.println(a[i]+" ");
			}
		System.out.println();

		if(majorityElement !=-1)
			{
				System.out.println("Majority Elements : "+majorityElement);
			}
		else
			{
				System.out.println("There are no Majority Elements in the given array ");
			}
	}
}
/* 
>java majorityelementofarray17.java
enter size
8
enter 8 elemnt
8 8 4 6 7 4 4 8

The given array is:
8
8
4
6
7
4
4
8

There are no Majority Elements in the given array
 */
 /* 
>java majorityelementofarray17.java
enter size
8
enter 8 elemnt
4 5 4 5 4
4 4 4 4
 The given array is:
4
5
4
5
4
4
4
4

Majority Elements : 4 */