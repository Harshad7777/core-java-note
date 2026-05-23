/* Q4. Write a program in java to find the smallest missing element from a sorted array?
		
Expected Output :
		The given array is : 0 1 3 4 5 6 7 9
		The missing smallest element is: 2


 */import java.util.*;
public class smallestmissingelement19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in)
		
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		
		System.out.println("enter the" +size+" element");
		for(int i=0; i<size; i++)
			{
				a[i] = sc.nextInt();
			}
			
			
		//logic
		
		int missingval = -1;
		for(int i=0; i<size; i++)
			{
				a[i] = sc.nextInt();
			}
		
	}
}












import java.util.*;

public class SmallestMissingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Input elements
        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print given array
        System.out.print("The given array is: ");
        for (int i = 0; i < n; i++) 
		{
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Find smallest missing element
        int missing = -1;
        for (int i = 0; i < n; i++) 
		{
            if (arr[i] != i) 
			{
                missing = i;
                break;
            }
        }

        // If no element missing inside the range
        if (missing == -1) {
            missing = n;
        }

        System.out.println("The missing smallest element is: " + missing);
    }
}
