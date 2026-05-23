/*
 4. Check whether the given array is a palindrome.
Input: {1, 2, 3, 2, 1}
Output: true


Explanation:
 A palindrome reads the same forward and backward.
 Forward: 1 2 3 2 1
 Backward: 1 2 3 2 1
 Since both are the same, the array is a palindrome.
 
 */
 
import java.util.*;
public class arrayispalindrome29
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[] = new int [size];
		
		System.out.println("enter "+size+" element");
		for(int i=0; i<size; i++)
			{
				a[i] = sc.nextInt();
			}
			
		boolean ispalindrome = true;
		for(int i=0; i<size; i++)
			{
				if(a[i] != a[size-1- i])
				{
					ispalindrome = false;
					break;
				}
			}
		System.out.println(ispalindrome );
		
	}
}
