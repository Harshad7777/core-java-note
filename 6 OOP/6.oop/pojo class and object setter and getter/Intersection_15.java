/* Q15. Intersection of two Arrays
Given two arrays a[] and b[], the task is find intersection of the two arrays. Intersection of two arrays is
said to be elements that are common in both arrays. The intersection should not count duplicate
elements and the result should contain items in any order.

Input: a[] = {1, 2, 1, 3, 1},  b[] = {3, 1, 3, 4, 1}
Output: {1,  3}

Explanation: 1 and 3 are the only common elements and we need to print only one occurrence of
common elements
Input: a[] = {1, 1, 1},  b[] = {1, 1, 1, 1, 1}
Output: {1}

Explanation: 1 is the only common element present in both the arrays.
Input: a[] = {1, 2, 3},  b[] = {4, 5, 6}
Output: {}

Explanation: No common element in both the arrays.
Your Task is : Note you have to create class name as Intersection with two methods 
void setArray(int a[],int b[]): this function is used for accept two array as parameter 
Int [] getIntersection(): this function can find the intersection of array and return it. */

import java.util.*;

class Intersection 
{
	private int []a;
	private int []b;
	
	public void setArray(int a[], int b[])
	{
		this.a = a;
		this.b = b;
	}
	public void getIntersection()
	{
		boolean visit[] = new boolean[a.length];
		
		for(int i=0; i<a.length; i++)
		{
			if(visit[i])
			
				continue;
				
				for(int m=i; m<a.length;m++)
				{
					if(a[i]==a[m])
					{
						visit[m]=true;
					}
				}
				
				for(int j=0; j<b.length; j++)
				{
					if(a[i]==b[j])
					{
						System.out.print(a[i]+" ");
						break;
					}
				}
		}
	}
}

public class Intersection_15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[4];
		int b[] = new int[4];
		
		System.out.print("enter element in array in 1");
		
		for(int i =0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.print("enter element in array in 2");
		
		for(int i =0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
			
		}
		
		Intersection it = new Intersection();
		it.setArray(a,b);
		it.getIntersection();
	}
}

/* java Intersection_15.java
enter element in array in 1
1 2 1 3 1
enter element in array in 2
3 1 3  4 1
1 3 */
