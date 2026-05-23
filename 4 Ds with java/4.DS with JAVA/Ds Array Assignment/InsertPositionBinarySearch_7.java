/* Q7. Problem :
 In a sorted array, use binary search to find the position where a given key should be inserted to maintain order.
Example:
 Input:
 arr = {1, 3, 5, 6}, key = 2
 Output: Insert Position = 1
Logic Explanation:
Use binary search to find mid.
If key < arr[mid], move high to mid - 1.
If key > arr[mid], move low to mid + 1.
When loop ends, low will be the correct insert position. */


import java.util.*;
public class InsertPositionBinarySearch_7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		System.out.println("enter the value in array");
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the key");
		int key = sc.nextInt();
		
		int l=0, r = a.length-1;
		while(l<=r)
		{
			int mid = (l+r)/2;
			
			if(key < a[mid])
			{
				r = mid-1;
			}
			else
			{
				l = mid + 1 ;
			}
		}
		System.out.println("insert position "+l);	
	}
}

/* \C:\Users\harsh\Downloads\java course notes\java\4.DS with JAVA\Ds Array Assignment>java InsertPositionBinarySearch_7.java
enter the size
4
enter the value in array
1 3 5 6
enter the key
2
insert position 1 */