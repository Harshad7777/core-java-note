/* Q5. Write a program in java to delete an element at desired position from an array.
	Test Data :

	Input the size of array : 5

	Input 5 elements in the array in ascending order :
	1   2    3    4    5
	
	Input the position where to delete : 3

	Expected Output : The new list is : 1 2 3 5
	 */
import java.util.*;
public class deleteelementatdesiredposition10
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		int size = sc.nextInt();
		
		int a[]= new int[size];
		
		System.out.print("enter "+size+" elements in the array in ascending order :");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		// Input position
        System.out.print("Input the position where to delete: ");
        int pos = sc.nextInt();

        // Check for valid position
        if (pos <= 0 || pos > size) 
		{
            System.out.println("Invalid position!");
        } 
		else 
		{
            // Shift elements left from position
			
            for (int i = pos - 1; i < size - 1; i++) 
			{
                a[i] = a[i + 1];
            }
            size--; // Reduce size since one element deleted

            // Print new list
            System.out.print("The new list is: ");
            for (int i = 0; i < size; i++) 
			{
				    System.out.print(a[i] + " ");
            }
		}
	}
}
