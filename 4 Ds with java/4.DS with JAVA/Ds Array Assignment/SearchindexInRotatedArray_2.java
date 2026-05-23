/* 
Question 2:
Given a sorted array rotated at some pivot (like [6, 7, 1, 2, 3, 4, 5]), search for a number x using binary search.
Example:

arr = [6, 7, 1, 2, 3, 4, 5], x = 3
Output: Found at index 4
 
Explanation:
In rotated arrays, one half (left or right) is always sorted.
Check which half is sorted:

If arr[left] <= arr[mid], left part is sorted.
Else, right part is sorted.

Decide which half to discard based on x.

 */


import java.util.*;

public class SearchindexInRotatedArray_2 
{
    public static void main(String args[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter " + size + " elements in sorted-rotated order:");
        for (int i = 0; i < size; i++) 
		{
            a[i] = sc.nextInt();
        }

        System.out.println("Enter search key:");
        int skey = sc.nextInt();

        int l = 0, r = size - 1;
        int index = -1;

        while (l <= r) 
		{
            int mid = l + (r - l) / 2;

            if (a[mid] == skey) 
			{
                index = mid;
                break;
            }

         else if(a[mid]<skey)
			{
				l = mid+1;
			}
			else
			{
				r = mid-1;
			} 
		}
        if (index != -1) 
		{
            System.out.println("Element found at index " + index);
        } else 
		{
            System.out.println("Element not found");
        }
    }
}

/* Enter size of array:
7
Enter 7 elements in sorted-rotated order:
6 7 1 2 3 4 5
Enter search key:
3
Element found at index 4 */



/* import java.util.*;
public class SearchindexInRotatedArray_2
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter the size");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter the search key.");
		int skey = sc.nextInt();
		
		int l = 0, r = size-1;
		int index = -1;
		
		while(l<=r)
		{
			int mid = l+(r-l)/2;
			
			if(a[mid]==skey)
			{
				index = mid;
				break;
			}
			
			//chack if left array is sorted
			if(a[mid]<skey)
			{
				if(a[l]<a[mid] && skey>a[mid])
				{
					r = mid + 1 ; // leave in left side
				}
				else
				{
					l = mid - 1 ; // key in right side
				}
			}
			//chack if right array is sorted
			
			else
			{
				if(a[r]>skey && skey>a[mid])
				{
					l = mid + 1; //leaves in right side
				}
				else
				{
					r = mid - 1; // leaves in left side
				}
			}
			
			
		}
		if(index !=-1)
		{
			System.out.println("value x found at the = "+index);
		}
		else
		{
			System.out.println("value x not found");
			
		}
	}
}

 */