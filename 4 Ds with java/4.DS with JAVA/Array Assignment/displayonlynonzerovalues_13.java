/* 
Q8. Write a java program to display only non-zero values from an array.
Input : Array = {1, 0, 5, 0, 7, 0, 9}
Output : Non-zero elements = {1, 5, 7, 9}
Explanation :
Traverse the array and print only elements that are not equal to zero.

*/
import java.util.*;
public class displayonlynonzerovalues13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		//input array
		System.out.println("enter "+ size + " elements");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
	
		System.out.println("Non-zeroelements = {");
		for(int i=0; i<size; i++)
		{
			if(a[i]!=0)
				{
					System.out.print(a[i]+" ");
				}
			
		}
		System.out.println("}");
		
		
	}
}
