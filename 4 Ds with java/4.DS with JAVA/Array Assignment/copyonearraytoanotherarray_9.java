/* 
Q4. Write a java program to copy one array to another array.
Input:
Array1 = {5, 10, 15, 20}
Output:
Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment.

 */
import java.util.*;
public class copyonearraytoanotherarray9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
	    int size = sc.nextInt();
		//array 1
		int a[] = new int[size];
		
		System.out.println("enter " + size +" element" );
		for(int i=0; i<size; i++)
			{
				a[i] = sc.nextInt();
			}
			
			// 2 array
			int b[] = new int [size];

			//
			for(int i=0; i<size; i++)
				{
					b[i]=a[i];
				}
			
			System.out.print("Array2 = { ");	
			for(int i=0; i<size; i++)
				{
					System.out.print(b[i]+" ");	
				}
			System.out.print("} ");	
	}	
}	
/* 
>java copyonearraytoanotherarray9.java
enter the size
5
enter 5 element
1
2
3
4
5
Array2 = { 1 2 3 4 5 } */
