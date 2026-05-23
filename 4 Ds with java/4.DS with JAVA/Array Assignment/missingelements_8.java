/* 
Q3. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.

 */

import java.util.*;
public class  missingelements8
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		// input
		System.out.println("enter " + size +" elements" );
		for(int i=0; i<size; i++)
		{
			a[i]= sc.nextInt();
		}
		
	//	find the max in array	
		System.out.println("max value from array" );
		
		int max = a[0];
		for(int i=0; i<size; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		System.out.println(max);
		
		//Find missing elements
        System.out.println("Missing Elements:");
        for(int j = 1; j <= max; j++) {
            boolean found = false;
            for(int i = 0; i < a.length; i++) {
                if(a[i] == j) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                System.out.print(j + " ");
            }
        }
    }
}


