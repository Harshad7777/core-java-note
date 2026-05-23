Q10. Overload operation() —
Version 1: accepts one array and prints all distinct elements (self-union).


Version 2: accepts two arrays and prints:

All elements in the intersection, and

All elements in the union.
Input 1: [1,2,2,3,4] → Output: Distinct Elements = [1,2,3,4]
Input 2: [1,2,3], [2,3,4] → Output: Intersection = [2,3], Union = [1,2,3,4]


/* 
Q10. Overload operation() —
Version 1: accepts one array and prints all distinct elements (self-union).
Version 2: accepts two arrays and prints:
    - All elements in the intersection
    - All elements in the union

Input 1: [1, 2, 2, 3, 4] → Output: Distinct Elements = [1, 2, 3, 4]
Input 2: [1, 2, 3], [2, 3, 4] → Output: Intersection = [2, 3], Union = [1, 2, 3, 4]
*/

import java.util.*;

public class OperationOverload_10
{
    // Version 1 — Distinct elements (self-union)
    static void operation(int a[])
    {
        Set<Integer> distinct = new LinkedHashSet<>(); // preserves insertion order
        for (int n : a)
        {
            distinct.add(n);
        }

        System.out.println("Distinct Elements = " + distinct);
    }

    // Version 2 — Intersection and Union
    static void operation(int a[], int b[])
    {
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        // Add elements of arrays to sets
        for (int n : a) set1.add(n);
        for (int n : b) set2.add(n);

        // Intersection
        Set<Integer> intersection = new LinkedHashSet<>(set1);
        intersection.retainAll(set2);

        // Union
        Set<Integer> union = new LinkedHashSet<>(set1);
        union.addAll(set2);

        System.out.println("Intersection = " + intersection);
        System.out.println("Union = " + union);
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Version 1
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int a[] = new int[n1];
        System.out.print("Enter elements of first array: ");
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();

        // Version 2
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int b[] = new int[n2];
        System.out.print("Enter elements of second array: ");
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();

        System.out.println();
        operation(a);       // distinct elements
        operation(a, b);    // intersection and union
    }
}

