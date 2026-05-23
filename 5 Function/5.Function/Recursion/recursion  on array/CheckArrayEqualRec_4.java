/* Q4.Write a Java program to check if two arrays are equal (same elements in same order) using a function.
Example Input:
a = {1, 2, 3, 4}
b = {1, 2, 3, 4}
Output:
Arrays are equal.

 */
 
import java.util.*;

public class CheckArrayEqualRec_4 

{
    static boolean areEqual(int a[], int b[], int index) 
	
	{
        if (a.length != b.length) //base case
            return false;
			
        if (index == a.length) 
            return true;
		
        if (a[index] != b[index])
            return false;
		
        return areEqual(a, b, index + 1);
    }

    public static void main(String[] args) 
	
	{
        int a[] = {1, 2, 3, 4};
        int b[] = {1, 2, 3, 4};

        System.out.println(areEqual(a, b, 0)
                ? "Arrays are equal."
                : "Arrays are not equal.");
    }
}

/* | Call | index | a[index] | b[index] | Comparison               | Result        |
| ---- | ----- | -------- | -------- | --------------------------- | ------------- |
| 1    | 0     | 1        | 1        | Equal                       | Calls next    |
| 2    | 1     | 2        | 2        | Equal                       | Calls next    |
| 3    | 2     | 3        | 3        | Equal                       | Calls next    |
| 4    | 3     | 4        | 4        | Equal                       | Calls next    |
| 5    | 4     | —        | —        | index == length → Base case | Return `true` | 
*/


/* java CheckArrayEqualRec_4.java
Arrays are equal. */

