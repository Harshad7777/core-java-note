
/* 
Q6. Write an overloaded function compare() —
Version 1: accepts a single integer array and checks if it is symmetric (first element = last element, etc.).

Version 2: accepts two integer arrays and checks whether both arrays are identical 
(same size and same elements in order).

Example:
Input 1: [1, 2, 3, 2, 1] → Output: Symmetric Array
Input 2: [1, 2, 3], [1, 2, 3] → Output: Arrays are identical
*/

import java.util.*;
public class Compare_6
{
    Version 1: Check if a single array is symmetric
    static void compare(int arr1[])
    {
        boolean isSymmetric = true;
        int n = arr1.length;

        for (int i = 0; i < n / 2; i++)
        {
            if (arr1[i] != arr1[n - 1 - i])
            {
                isSymmetric = false;
                break;
            }
        }

        if (isSymmetric)
            System.out.println("Symmetric Array");
        else
            System.out.println("Not a Symmetric Array");
    }

   Version 2: Check if two arrays are identical
    static void compare(int arr2[], int arr3[])
    {
        if (arr2.length != arr3.length)
        {
            System.out.println("Arrays are not identical");
            return;
        }

        boolean isIdentical = true;
        for (int i = 0; i < arr2.length; i++)
        {
            if (arr2[i] != arr3[i])
            {
                isIdentical = false;
                break;
            }
        }

        if (isIdentical)
            System.out.println("Arrays are identical");
        else
            System.out.println("Arrays are not identical");
    }

   Main method
    public static void main(String x[])
    {
        int arr1[] = {1, 2, 3, 2, 1};
        int arr2[] = {1, 2, 3};
        int arr3[] = {1, 2, 3};

        compare(arr1);        // Check symmetric
        compare(arr2, arr3);  // Check identical
    }
} 

/*  
java Compare_6.java
Symmetric Array
Arrays are identical */



/* import java.util.*;
public class Compare_6
{
	static boolean compare(int a[])
	{
		boolean flag = false;
		
		int start=0, end=a.length-1;
		for(int i=0; i<a.length/2; i++)
		{
			if(a[start++]==a[end--])	
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	
	static boolean compare(int b[], int c[])
	{
		boolean flag = false;
		if(b.length!=c.length)
			return false;
		
		for(int i=0; i<b.length; i++)
		{
				if(b[i]==c[i])
				{
					flag = true;
				}
				else
				{
					flag = false;
					break;
				}
		}
		
		return flag;
	} 

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the size of array function 1: ");
		int size1 = sc.nextInt();
		
		int a[] = new int[size1];
		
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<size1; i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		boolean res1 = compare(a);
		
		if(res1)
			System.out.print("Symmetric Array");
		else
			System.out.print("Asymmetric Array");
		
		System.out.println("\nenter the two size of array function 2: ");
		int size2 = sc.nextInt();
		int size3 = sc.nextInt();
		
		int b[] = new int[size2];
		int c[] = new int[size3];
		
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<size2; i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<size3; i++)
		{
			c[i]=sc.nextInt();
		}
		
		boolean res2 = compare(b, c);
		
		if(res2)
			System.out.print("Arrays are identical");
		else
			System.out.print("Arrays are not identical");
	}
} */

