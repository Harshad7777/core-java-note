/* Q1. Write a java program to count the frequency of each element in a given array.
Input:
Array = {1, 2, 2, 3, 3, 3, 4}
Output:
 1 → 1 time
 2 → 2 times
 3 → 3 times
 4 → 1 time
Explanation:
For each element, count how many times it occurs in the array using nested traversal.

 */
import java.util.*;

public class countfrequencyofeachelement16	
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("enter size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println ("enter " + size + " element" ) ;
		for(int i=0; i<size; i++)
			{
				a[i] = sc.nextInt();
			}
			
		boolean visited [] = new boolean[size];
		System.out.println ("element frequencies : ") ;
		for(int i=0; i<size; i++)
			{
				if(visited[i])
				{
					continue;
				}	
				
				int count = 1;
				for(int j=i+1; j<size; j++)
				{
					
					if(a[i]==a[j])
					{
						count++;
						visited[j] = true;
					}
				}
				System.out.println(a[i]+ "  --> " + count +" time");
			}
	}
}
