/* Q8. Write a java program to display top three value from array.

	Sample Input: [78, 90, 90, 86, 85, 92, 70, 92]
	Expected Output: 92, 90, 86
 */

import java.util.*;
public class displaytopthreevalue_43
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		int i,j;
	
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter "+size+" elements");
		for( i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		 // Bubble sort in descending order

		
		for( i=0; i<size-1; i++)
		{
			for(j=0; j<size-i-1; j++)
			{
				if(a[j]<a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
				}
			}	
		}
		
		//Compare 70 & 92 → swap → [92, 92, 90, 90, 86, 85, 78, 70]
		
		System.out.println("top three uniqe value :");
		int count = 0;
		System.out.print(a[0]);
		count =1;
		for(i=1; i<size && count<3 ; i++)
		{
			// only print if different from previous
			if(a[i] != a[i-1]) 
			{
				System.out.print(","+a[i]);
				count++;
			}
		}
		
	}
}

/* enter the size
8
enter 8 elements
78 90 90 86 85 92 70 92
top three uniqe value :
92,90,86 */