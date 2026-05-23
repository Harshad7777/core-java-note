/* Q3. Write a program in java to rotate an array by N positions ?

	Expected Output:

	The given array is: 0  3  6  9  12  14  18  20  22  25  27

	From 4th position the values of the array are: 12 14 18 20 22 25 27 
	Before 4th position the values of the array are: 0  3  6  9 
	After rotating from 4th position the array is:

	12 14 18 20 22 25 27 0 3  6 9
	 */
import java.util.*;
public class rotateanarraybyNpositions18
{
	public static void main  (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		int size = sc.nextInt();
		
		
		//input array
		System.out.println("enter "+size+ " element	: ");
		for(int i=0; i<=size; i++)
			{
				a[i] = sc.nextInt90;
			}
			
	}
	
}
/* 
import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input rotation position
        System.out.print("Enter the position from where to rotate: ");
        int pos = sc.nextInt();

        // Print given array
        System.out.print("The given array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print from pos to end
        System.out.print("From " + pos + "th position the values of the array are: ");
        for (int i = pos; i < n; i++) {
            System.out.print(arr[i] + " ");
        } 
        System.out.println();

        // Print before pos
        System.out.print("Before " + pos + "th position the values of the array are: ");
        for (int i = 0; i < pos; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Print rotated array
        System.out.println("After rotating from " + pos + "th position the array is:");
        for (int i = pos; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < pos; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
*/
