/* 
Q7. Write a program in java to insert an element at desired position from an array.

	Test Data :

	Input the size of array : 6

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to insert : 2
	Value : 200

	Expected Output : The new list is : 1 2 200 3 4 5
 */
import java.util.*;
public class insertelementdesiredposition12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size = sc.nextInt();
		
		int a[] = new int[size+1];  //take a extra space
		
		//input
		System.out.println("enter " + (size-1) +" element");
		for(int i=0; i<size-1; i++)
			{
				a[i]=sc.nextInt();
			}
			
		System.out.println("enter position");
		int pos =  sc.nextInt();
		
		
		System.out.println("Enter value");
		int val =  sc.nextInt();
		
		//for right shift pos-1
		for(int i = size; i>=pos; i-- )
			{
				a[i]=a[i-1];
			}
/* 		a[6] = a[5]   // 0 -> 0
		a[5] = a[4]   // 5 -> last position
		a[4] = a[3]   // 4 -> next
		a[3] = a[2]   // 3 -> next
		a[2] = a[1]   // 2 -> next */

		
		//insert value
		a[pos] = val;
		
		//output
		System.out.print("The new list is :");
		for(int i=0; i<size; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}