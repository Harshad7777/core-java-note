/* Q4. A peak element is greater than or equal to its neighbors. Given an array, find the index of any one peak element using binary search.


Example: Input: arr = [1,3,20,4,1,0] → Output: 2 (20 is a peak).


Explanation: Check middle element. If arr[mid] is greater than neighbors → peak found. Otherwise, move towards the side that has a greater neighbor.
 */

import java.util.*;
public class PeakElementBinarySearch_4
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int peakIndex = findPeak(arr, n);
        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }

    static int findPeak(int arr[], int n) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if mid is a peak
            boolean leftOk = (mid == 0) || (arr[mid] >= arr[mid - 1]);
            boolean rightOk = (mid == n - 1) || (arr[mid] >= arr[mid + 1]);

            if (leftOk && rightOk)
                return mid;

            // If left neighbor is greater, go left
            if (mid > 0 && arr[mid - 1] > arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1; // Should never reach here
    }
}
