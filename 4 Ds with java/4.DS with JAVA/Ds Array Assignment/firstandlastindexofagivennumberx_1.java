/* Question 1:
Given a sorted array (may contain duplicates), find the first and last index of a given number x using binary search.
Example:
 arr = [2, 4, 4, 4, 6, 7, 9], x = 4
 Output: First = 1, Last = 3
*/

import java.util.*;

public class firstandlastindexofagivennumberx_1 {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = xyz.nextInt();

        int a[] = new int[size];

        System.out.println("Enter " + size + " values in array (sorted):");
        for (int i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
        }

        System.out.println("Enter search key");
        int skey = xyz.nextInt();

        int first = -1, last = -1;

        // --- First Occurrence ---
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == skey) {
                first = mid;
                r = mid - 1;   // keep going left
            } else if (a[mid] < skey) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        // --- Last Occurrence ---
        l = 0; 
        r = a.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == skey) {
                last = mid;
                l = mid + 1;   // keep going right
            } else if (a[mid] < skey) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        if (first != -1) {
            System.out.println("First occurrence = " + first);
            System.out.println("Last occurrence  = " + last);
        } else {
            System.out.println("Element not found");
        }
    }
}
