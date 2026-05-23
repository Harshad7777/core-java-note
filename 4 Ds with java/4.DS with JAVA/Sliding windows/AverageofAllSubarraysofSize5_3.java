/* 
3. Average of All Subarrays of Size K
Example:
Input: arr = [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
Output: [2.2, 2.8, 2.4, 3.6, 2.8] 
*/

import java.util.*;
public class AverageofAllSubarraysofSize5_3
{
	public static void main(String x[])
	{
/* 		Scanner sc = new Scanner(System.in);
		int a[] = new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};

		int sum=0;
		int k = 5;

		for(int i=0; i<k; i++)
		{
			sum = sum +a[i];
		}
		float avg = (float)sum/k;
		
		System.out.printf("%d ----->%f\n",sum,avg);
		for(int i=k; i<a.length; i++)
		{
			sum = sum + a[i]-a[i-k];
				avg = (float)sum/k; 
		System.out.printf("%d ----->%f\n",sum,avg);
		} */
		
		
		
		int a[] = new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
		int k=5;
		int sum=0;
		float avg;
		for(int i=0; i<k; i++)
		{
			sum+=a[i];
		}
		avg = (float)sum/k;
		System.out.println("sum "+sum+" and Average of subarray---->: "+avg+" ");
		
		for(int i=k; i<a.length; i++)
		{
			sum += a[i]-a[i-k];
			avg = (float)sum/k;
		System.out.println("sum "+sum+" and Average of subarray---->: "+avg+" ");
		} 

	}
}
