/* 
Q7. Replace each element with its factorial.
Input: arr = [3, 4, 5]
Output: arr = [6, 24, 120]
Explanation: For each element, calculate factorial using repeatedmultiplication, and update the array element with this value.
 */
/*  
import java.util.*;
public class FactorialArray32 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("enter " + size + " elements ");
        for (int i = 0; i < size; i++)
			{
            a[i] = sc.nextInt();
        }

        // Replace each element with its factorial
        for (int i = 0; i < size; i++) {
            a[i] = factorial(a[i]);  // call method
        }

        // Print result
        System.out.print("Output: arr = ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Factorial method
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
 */

public class FactorialArray32
{
	public static void main(String x[])
	{
		int a[] = new int[]{3, 4, 5};
		
		for(int i=0; i<a.length; i++)
		{
			int fact=1;
			for(int j=1; j<=a[i]; j++)
			{
				fact=fact*j;
			}

			 a[i] = fact;  
		}
		System.out.print("New Array: ");
		for (int i=0; i<a.length; i++) 
		{
            System.out.print(a[i]+" ");
        }

	}
}

