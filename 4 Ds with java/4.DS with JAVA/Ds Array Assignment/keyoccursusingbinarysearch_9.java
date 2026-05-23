/* Q9. Problem:
 Given a sorted array, count how many times a given key occurs using binary search.
Example:
 Input: arr = {2, 4, 4, 4, 6, 8}, key = 4
 Output: Count = 3
Logic Explanation:
Use binary search twice —


To find the first occurrence of the key.
To find the last occurrence.
The count = lastIndex - firstIndex + 1.
 */

import java.util.*;
public class keyoccursusingbinarysearch_9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter the sorted array :");
	    for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter key :");
		int key = sc.nextInt();
		
		int l=0,  r = size-1,  first = -1, last=-1;
		
		while(l<=r)
		{
			int mid = (l+r)/2;
			
			if(a[mid] == key)
			{
			
				first=mid;
				r = mid-1;
			}	
			else if( a[mid] < key )
			{
				 l = mid+1;
			}
			else
			{
				r  = mid -1;
			}
		
			
		}
	//
		l=0;
		r = size-1;
		while(l<=r)
		{
			int mid = (l+r)/2;
			
			if(a[mid] == key)
			{
			
				last = mid;
				l = mid+1;
			}	
			else if( a[mid] < key )
			{
				 l = mid+1;
			}
			else
			{
				r  = mid -1;
			}
		
			
		}
		
		if(first == -1)
		{
			System.out.println("key not found!");
		}		
		else
		{
			System.out.println("count = "+(last-first + 1));
		}
		
	}
}

/* C:\Users\harsh\Downloads\java course notes\java\4.DS with JAVA\Ds Array Assignment>java keyoccursusingbinarysearch_9.java
enter size
6
enter the sorted array :
2 4 4 4 6 8
enter key :
4
count = 3 */