/* Date :- 27-09-2025
Q1. Replace All Elements Divisible by 3 with -1.
Input: [3, 6, 7, 9, 10]
Output: [-1, -1, 7, -1, 10]


Explanation:
 Elements divisible by 3 are 3, 6, 9. These are replaced with -1. Other elements remain unchanged.
 */
import java.util.*;
public class ReplaceAllElementsDivisibleby3_26
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
			if(a[i]%3==0)
			{
				a[i]=-1;
			}
		}
		
		System.out.print("Output :");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+", ");
		}	
	}
}
/* 

C:\Users\harsh\Downloads\java course notes\java\4.DS with JAVA\Array Assignment>java ReplaceAllElementsDivisibleby3_25.java
enter size
5
enter 5 elements
3 6 5 6 10
Output :-1, -1, 5, -1, 10
*/
 