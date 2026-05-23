/* Q6. Problem:
 Perform binary search to find the index of a given key in a sorted array.
 If the key is not found, print -1.
Example:
 Input:
 arr = {2, 4, 6, 8, 10, 12}
 key = 10
 Output: Index = 4
Logic Explanation:
Set low = 0, high = arr.length - 1.

Find mid = (low + high) / 2.
If arr[mid] == key, element found.
If arr[mid] < key, search right half.
Else, search left half. */



import java.util.*;
public class BinarySearchExample_6
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter array size :");
		int n = sc.nextInt();
		
		int []arr = new int[n];
		
		System.out.println("enter a array element:");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		//to find skey	
		System.out.println("enter skey value:");
		int skey = sc.nextInt();
		int l=0, r = arr.length-1;
		boolean flag = false;
			int pos = -1;
		while(l<=r)
		{
			int mid = (l+r)/2;
			if (arr[mid]==skey)
			{
				System.out.print("index is :"+mid);
				flag = true;
				break;
			}
			else{
				if(skey>arr[mid])
				{
					l=mid+1;
				}
				else
				r= mid-1;
			}
		}
		if(!flag)
			System.out.print(pos);
	}
}
 