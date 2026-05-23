/* Q7. Create an overloaded function analyze() —
Version 1: accepts one array and displays all unique (non-repeating) elements.


Version 2: accepts two arrays and prints all common elements between them.
Input 1: [2, 3, 2, 4, 5] → Output: Unique: 3, 4, 5  
Input 2: [1, 2, 3], [3, 4, 5] → Output: Common: 3
 */
/* 
Q7. Create an overloaded function analyze() —
Version 1: accepts one array and displays all unique (non-repeating) elements.
Version 2: accepts two arrays and prints all common elements between them.

Input 1: [2, 3, 2, 4, 5] → Output: Unique: 3, 4, 5  
Input 2: [1, 2, 3], [3, 4, 5] → Output: Common: 3
*/

import java.util.*;

public class ArrayCommon_7
{
    // Version 1 — Show unique elements
    static void analyze(int a[])
    {
        System.out.print("Unique elements: ");
        for (int i = 0; i < a.length; i++)
        {
            int count = 0;
            for (int j = 0; j < a.length; j++)
            {
                if (a[i] == a[j])
                    count++;
            }

            if (count == 1)
                System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Version 2 — Show common elements between two arrays
    static void analyze(int b[], int c[])
    {
        System.out.print("Common elements: ");
        for (int i = 0; i < b.length; i++)
        {
            for (int j = 0; j < c.length; j++)
            {
                if (b[i] == c[j])
                {
                    System.out.print(b[i] + " ");
                    break;  // avoid duplicates
                }
            }
        }
        System.out.println();
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        // First array (for version 1)
        System.out.print("Enter the size of array (version 1): ");
        int size1 = sc.nextInt();
        int a[] = new int[size1];
        System.out.print("Enter the elements of array 1: ");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        // Two arrays (for version 2)
        System.out.print("Enter the size of array (version 2 - first array): ");
        int size2 = sc.nextInt();
        System.out.print("Enter the size of array (version 2 - second array): ");
        int size3 = sc.nextInt();

        int b[] = new int[size2];
        int c[] = new int[size3];

        System.out.print("Enter elements of first array: ");
        for (int i = 0; i < b.length; i++)
        {
            b[i] = sc.nextInt();
        }

        System.out.print("Enter elements of second array: ");
        for (int i = 0; i < c.length; i++)
        {
            c[i] = sc.nextInt();
        }

        System.out.println();
        analyze(a);
        analyze(b, c);
    }
}

/* java ArrayCommon_7.java
Enter the size of array (version 1): 5
Enter the elements of array 1: 2 3 2 4 5
Enter the size of array (version 2 - first array): 3
Enter the size of array (version 2 - second array): 3
Enter elements of first array: 1 2 3
Enter elements of second array: 3 4 5

Unique elements: 3 4 5
Common elements: 3
 */