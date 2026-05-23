/* Q8. Overload cleanMerge() —
Version 1: accepts one array, removes duplicates, and prints the cleaned array.


Version 2: accepts two arrays, removes duplicates from both, merges them, and prints the final array in ascending order.
Input 1: [1, 2, 2, 3, 3, 4] → Output: [1, 2, 3, 4]
Input 2: [1, 2, 3], [2, 3, 4] → Output: [1, 2, 3, 4]
 */

*/


import java.util.*;
public class ArrayDuplicate_8
{
	static void cleanMerge(int a[])
	{
		boolean visit[] = new boolean[a.length];
		for(int i=0; i<a.length; i++)
		{
			if(visit[i]==true)
				continue;
				
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					visit[j]=true;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
	
	
	static void cleanMerge(int b[], int c[])
	{
		int d[] = new int[b.length+c.length];
		int k=0;
		for(int i=0; i<b.length; i++)
		{
			d[k++]=b[i];
		}
		for(int i=0; i<c.length; i++)
		{
			d[k++]=c[i];
		}
		
		boolean visit[] = new boolean[d.length];
		for(int i=0; i<d.length; i++)
		{
			if(visit[i]==true)
				continue;
				
			for(int j=i+1; j<d.length; j++)
			{
				if(d[i]==d[j])
				{
					visit[j]=true;
				}
			}
			System.out.print(d[i]+" ");
		}	
	}

	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array version 1: ");
		int size1 = sc.nextInt();
		int a[] = new int[size1];
		System.out.print("enter the element arr 1: ");
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
		
		cleanMerge(a);
		cleanMerge(b, c);
	}
}
