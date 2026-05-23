/*
 2. Minimum Sum Subarray of Size K
Example:
Input: arr = [2, 1, 5, 1, 3, 2], K=3
Output: 4 (subarray [1, 3, 2]) 
*/

import java.util.*;
public class MinimumSumSubarrayofSize3_2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[]{2, 1, 5, 1, 3, 2};
		int k = 3;
		
		int start = 0 ,end = 0;
		int sum = 0 ,max = 0;
		
		for(int i=0; i<k; i++)
		{
			sum = sum +a[i];
		}
		max = sum;
		
		for(int i=k; i<a.length; i++)
		{
			sum = sum + a[i]-a[i-k];
			if (sum < max)
			{
				max = sum;
				start = i-k+1;
				end=i;
			}
		}
		System.out.println("min sum of sub array"+max);
		
		System.out.printf("[");
		for(int i=start; i<=end; i++)
		{
			System.out.print(a[i]);
			if(i<end)System.out.print(",");
		}
		System.out.printf("]");
	}
}