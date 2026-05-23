/* Q7. Write a java program to merge two arrays.

	Input - First Array :- 1 2 3 4 5
             	  Second Array :-  6 7 8 9 10 
	Output - 1 10 2 9 3 8 4 7 5 6
 */
import java.util.*;
public class mergetwoarrayss_42
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		int i,j;
		//array1
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter "+size+" elements");
		for( i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		//array 2
		System.out.println("enter the size1");
		int size1 = sc.nextInt();
		
		int b[] = new int[size1];
		
		System.out.println("enter "+size1+" elements");
		for( i=0; i<size1; i++)
		{
			b[i] = sc.nextInt();
		}
		
	
		System.out.println("after merge array become : ");
		
		for(i=0; i<size; i++)
		{	
				System.out.print(a[i]+ " " );
				System.out.print(b[size1 - 1 -i]+ " ");
			
		}
	}
}
/* 
System.out.println("after merge array become : ");
int minSize = (size < size1) ? size : size1;

// Interleave common elements
for(i = 0; i < minSize; i++)
{
    System.out.print(a[i] + " ");
    System.out.print(b[size1 - 1 - i] + " ");
}

// Print remaining elements of first array
for(i = minSize; i < size; i++) System.out.print(a[i] + " ");

// Print remaining elements of second array (in reverse)
for(i = size1 - 1 - minSize; i >= 0; i--) System.out.print(b[i] + " ");

 */