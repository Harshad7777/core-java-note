/* Q19. Rearrange an array such that arr[i] = i
Given an array of elements of length n, ranging from 0 to n – 1. 
All elements may not be present in the array.
 If the element is not present then there will be -1 present in the array. 
Rearrange the array such that arr[i] = i and if i is not present, display -1 at that place.
Examples: 
Input: arr[] = [-1, -1, 6, 1, 9, 3, 2, -1, 4, -1]
Output: [-1, 1, 2, 3, 4, -1, 6, -1, -1, 9]
Explanation: In range 0 to 9, all except 0, 5, 7 and 8 are present. Hence, we print -1 instead of
them.
Input: arr[] = [0, 1, 2, 3, 4, 5] 
Output: [0, 1, 2, 3, 4, 5]
Explanation: In range 0 to 5, all numbers are present.
Your Task: You have to create class name as ReArrange with constructor and methods 
ReArrange(int a[]): this function is used for accept array as parameter
int [] getReArrange(): this function can rearrange all arrays and return it.
 
*/
import java.util.*;

class ReArrange
{
	private	int[] a;
	
	public ReArrange(int a[])
	{
		this.a = a;
	}

	public int[] getReArrange()
	{
		int n = a.length;
		int result[] = new int[n];
		
		// initialize with -1
		for(int i = 0; i < n; i++)
		{
			result[i] = -1;
		}

		// place elements at correct index
		for(int i = 0; i < n; i++)
		{
			if(a[i] >= 0 && a[i] < n)
			{
				result[a[i]] = a[i];
			}
		}
		return result;
	}
}

public class ReArrangeMain_19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		int n = sc.nextInt();

		int arr[] = new int[n];	
		
		System.out.println("Enter array elements:");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		ReArrange obj = new ReArrange(arr);
		
		int result[] = obj.getReArrange();
		
		System.out.print("Rearranged Array: ");
		for(int val : result)   // FIXED here
		{
			System.out.print(val + " ");
		}
	} 


/* java ReArrangeMain_19.java
Enter the size10
Enter array element: -1 -1 6 1 9 3 2 -1 4 -1
Rearrange Array:-1 1 2 3 4 -1 6 -1 -1 9 */


/* 

| i | a[i] | Valid? | result[a[i]] = a[i] |
| - | ---- | ------ | ------------------- |
| 0 | -1   | No     | skip                |
| 1 | -1   | No     | skip                |
| 2 | 6    | Yes    | result[6] = 6       |
| 3 | 1    | Yes    | result[1] = 1       |
| 4 | 9    | Yes    | result[9] = 9       |
| 5 | 3    | Yes    | result[3] = 3       |
| 6 | 2    | Yes    | result[2] = 2       |
| 7 | -1   | No     | skip                |
| 8 | 4    | Yes    | result[4] = 4       |
| 9 | -1   | No     | skip                |

 */
 