/* 1. Maximum Sum Subarray of Size K
Example:
Input: arr = [2, 1, 5, 1, 3, 2], K=3
Output: 9 (subarray [5, 1, 3]) */

import java.util.*;
public class MaximumSumSubarrayofSize3_1
{
	public static void main(String x[])
	  {   
		Scanner xyz  = new Scanner(System.in);
		
		   int a[]=new int[]{2, 1, 5, 1, 3, 2}; 
		   int k=3;
		   int start=0,end=0;
		   int sum=0, max=0;
		   
		   for(int i=0; i<k; i++)
			   { 
					sum = sum + a[i];
			   }
		   max=sum;
		   
		   for(int i=k; i<a.length; i++)
		   {
				 sum = sum + a[i]-a[i-k];
				 if(sum>max)
					 { 
						max=sum;
						start = i-k+1;
						end = i;
						
					 } 
		   }
		   
	   System.out.printf("Sum of max sub array is  %d\n",max);
	   System.out.printf("[");
	   
	   for(int i=start; i<=end;i++)
	   { 
		   System.out.print(a[i]);
		   if(i<end)System.out.print(",");
	   }
	   System.out.printf("]");

   }
}


/*
java MaximumSumSubarrayofSize3_1.java
Sum of max sub array is  9
[5,1,3]
*/
