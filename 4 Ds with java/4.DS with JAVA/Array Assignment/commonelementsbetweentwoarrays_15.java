/* Q10. Write a java program to find common elements between two arrays.
Input:
 Array1 = {1, 2, 3, 4, 5}
 Array2 = {3, 4, 5, 6, 7}
Output : Common elements = {3, 4, 5}
Explanation:
Compare each element of Array1 with all  elements of Array2, if match found → it is a common element.
 */
 
import java.util.*;
public class commonelementsbetweentwoarrays15
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		/* int a[] = new int[] {1, 2, 3, 4, 5};
		int a[] = new int[] {3, 4, 5, 6, 7}; */
		
		System.out.print("enter the size array1 :");
		int size1 = sc.nextInt();
		
		int a[] = new int[size1];
		
		System.out.println("Enter " + size1 + " elements of first array:");
        for (int i = 0; i < size1; i++)
			{
				a[i] = sc.nextInt();
			}
		
		System.out.print("enter the size array2 :");
		int size2 = sc.nextInt();
		
		int b[] = new int[size2];
		
		System.out.println("Enter "+size2+ "elements of first array: ");
		for(int i = 0; i<size2; i++)
		{
			b[i] = sc.nextInt();
		}
		
		//logic
	System.out.print(" Common elements = ");

		for(int i=0; i<size1; i++)
			{
				for(int j=0; j<size2; j++)
					{
						if(a[i]==b[j])
						{
							System.out.print(a[i]+ " ");
						}
					}
			}

			
	}
}
/* 
C:\Users\harsh\Downloads\java course notes\java\4.DS with JAVA\Array Assignment>java commonelementsbetweentwoarrays15.java
enter the size array1 :5
Enter 5 elements of first array:
1 2 3 4 5
enter the size array2 :5
Enter 5elements of first array:
3 4 5 6 7
 Common elements = 3 4 5 */