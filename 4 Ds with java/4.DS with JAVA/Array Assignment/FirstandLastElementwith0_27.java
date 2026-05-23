/* Q2. Replace First and Last Element with 0.
Input:[5, 3, 7, 2]
Output: [0, 3, 7, 0]

Explanation:
 The first element (5) and the last element (2) are replaced with 0. Middle elements remain the same.
 */

import java.util.*;
public class FirstandLastElementwith0_27
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter "+size+" elements");
		for(int i=0; i<size; i++)
			{
				a[i] = sc.nextInt();
			}
		
		//logic
		
		for(int i=0; i<size; i++)
		{
			a[0] = 0 ; //frist
			a[size-1] = 0; //last
		}
		
		System.out.print("Output :");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+", ");
			
		}	
	}
}
/* 
C:\Users\harsh\Downloads\java course notes\java\4.DS with JAVA\Array Assignment>java FirstandLastElementwith0_26.java
enter size
5
enter 5 elements
3 4 5 6 7
Output :0, 4, 5, 6, 0, */