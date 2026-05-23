/*Q3. Write a java program to find union array of two unsorted array.
	Input :-  arr1 = [1, 2, 3]  
			  arr2 = [2, 3, 4, 5]
	Output :- [1, 2, 3, 4, 5]
Explanation:
Union combines all elements from both arrays.
Duplicates are removed to keep only unique elements.
*/

import java.util.*;
public class unionoftwoarray_23 
{
    public static void main(String[] args) 
	{
        int[] a = {1, 2, 3};
        int[] b = {2, 3, 4, 5};
        int[] c = new int[a.length + b.length];
        int k = 0;

        // Copy all elements of a[]
        for (int i = 0; i < a.length; i++) 
		{
            c[k++] = a[i]; // 1 2 3
        }

        // Copy all elements of b[]
        for (int i = 0; i < b.length; i++) 
		{
            c[k++] = b[i]; // 1 2 3 2 3 4 5
        }

        // Print unique elements
        System.out.print("Union: ");
        for (int i = 0; i < c.length; i++) 
		{
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) 
			{
                if (c[i] == c[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(c[i] + " ");
            }
        }
    }
}


