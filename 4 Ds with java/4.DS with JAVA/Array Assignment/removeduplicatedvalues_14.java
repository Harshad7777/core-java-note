/*
 Q9.  Write a java program to remove duplicated values from arrays.
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, thus avoiding duplicates. 

*/

import java.util.*;
public class removeduplicatedvalues14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of array");
		int size = sc.nextInt();
		
		int a[]= new int[size];
		
		int result[] = new int[size];
		int i,j,k=0;
		//input
		System.out.println("enter "+size+"element");
		for( i=0; i<size; i++)
			{
				a[i] = sc.nextInt();
			}
			
		//logic	
		for( i=0; i<size; i++)
			{
				int flag = 0;
					
					for(j=0; j<k; j++)
					{
						if(a[i]==result[j])
						{
							flag = 1;
						}
					}
					if(flag==0)
					{
						result[k]=a[i];
						k++;
					}
			 }
			 System.out.println("array without duplicate elements");
			 for(i=0; i<k; i++)
				 System.out.print(" "+result[i]);
	
	}
}
