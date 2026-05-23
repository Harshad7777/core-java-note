/* Q18.Median of two Sorted Arrays of Different Sizes
Given two sorted arrays, a[] and b[], the task is to find the median of these sorted arrays.
Assume that the two sorted arrays are merged and then median is selected from the combined
array.

Examples:
Input: a[] = [-5, 3, 6, 12, 15], b[] = [-12, -10, -6, -3, 4, 10]
Output: 3
Explanation: The merged array is [-12, -10, -6, -5 , -3, 3, 4, 6, 10, 12, 15]. 
So the median of the merged array is 3.
Input: a[] = [1, 12, 15, 26, 38], b[] = [2, 13, 17, 30, 45, 60]
Output: The median is 11.
Explanation : The merged array is [1, 2, 12, 13, 15, 17, 26, 30, 38, 45, 60]. 
So the median of the merged array is 17.
Input: a[] = [], b[] = [2, 4, 5, 6]
Output: The median is 4.5
Explanation: The merged array is [2, 4, 5, 6]. The total number of elements are even,
 so there are two middle elements. Take the average between the two: (4 + 5) / 2 = 4.5
Your Task : you have to create class name as Median with constructor and some methods
given below 
Median(int a[],int b[]): this constructor help us to accept two array as parameter 
float getMedian(): this function can find the median of an array and return its result. */

import java.util.*;
class Median
{
	private int[] a;
	private int[] b;
	
	//
	public void setvalue(int a[], int b[])
	{
		this.a = a;
		this.b = b;
	}
	
	public float getMedian()
	{
		//merged
		int m = a.length;
		int n = b.length;
		
		int [] me = new int[m+n];
		int k=0;
		
		for(int i = 0; i < m; i++)
			me[k++]=a[i];
		
		for(int i = 0; i < n; i++)
			me[k++]=b[i];
		
		//sort logics //selection sort
		for(int i = 0; i<me.length; i++)
		{
			for(int j = i+1; j <me.length; j++)
			{
				if(me[i]>me[j])
				{
					int temp = me[i];
					me[i]=me[j];
					me[j]=temp;
				}
			}
		}
		
		int size = me.length;
		//odd
		if(size%2!=0)
			return me[size/2];
		
		
		//even
		return(me[size/2] + me[size/2-1])/2.0f;	
	}
}

public class MedianMain_18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array 1:");
		int size1 = sc.nextInt();
		int a[] = new int[size1];
		
		System.out.println("enter the value of array 1 :");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the size of array 2:");
		int size2 = sc.nextInt();
		int b[] = new int[size2];
		
		System.out.println("enter the value of array a :");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		/* int a[] = {-5, 3, 6, 12, 15};
		int b[] = {-12, -10, -6, -3, 4, 10}; */
		
		Median m = new Median();
		
		m.setvalue(a,b);
		
		float res = m.getMedian();
		System.out.println("Median = "+res);
	}
}
/* java MedianMain_18.java
enter the size of array 1:
5
enter the value of array 1 :
-5 3 6 12 15
enter the size of array 2:
6
enter the value of array a :
-12 -10 -6 -3 4 10
Median = 3.0 */
