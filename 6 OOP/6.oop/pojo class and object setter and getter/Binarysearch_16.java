/*  Q16. Binarysearchsorted array
Your Task
You have to create class name as BinarySearch with two methods 
void setArray(int a[]): this function is used for accept array as parameter 
int getIndex(int key): this function accepts a key for search and return index of search element and
returns -1 when the element is not found and show the element at function calling point using index if
index is not -1 */


import java.util.*;

class BinarySearch
{
	private	int arr[];
	
	//setArray
	
	public void setArray(int a[])
	{
		this.arr = a;
	}
	
	//methods
	public int getIndex(int key)
	{
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high)
		{
			int mid = (low + high)/2;
			
			if(arr[mid]==key)
			{
				return mid;
			}
			else if(key < arr[mid])
			{
				high = mid - 1;
			}
			else
			{
				low = mid + 1;
			}
		}
		return -1;
	}
}

public class Binarysearch_16
{
	public static void main(String x[])
	{
		BinarySearch bs = new BinarySearch();
		
		int a[] = {10, 20, 30, 40, 50};
		
		bs.setArray(a);
		
		int key = 30;
		int index = bs.getIndex(key);
		
		if(index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found!");
	}
}



/* java Binarysearch_16.java
Element found at index: 2 */


