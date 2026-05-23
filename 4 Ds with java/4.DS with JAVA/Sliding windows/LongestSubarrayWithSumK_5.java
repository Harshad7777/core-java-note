/* 5. Longest Subarray with Sum K (positive numbers) Example: Input: arr = [4, 1, 1, 1, 2, 3, 5], K=5 Output: 4 (subarray [1,1,1,2])
 */
import java.util.*;
public class LongestSubarrayWithSumK_5 
{
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);

        int a[] = new int[]{4, 1, 1, 1, 2, 3, 5};
        int k = 5;

        int left = 0, sum = 0, maxLen = 0;
        int start = 0, end = 0;

        for (int right = 0; right < a.length; right++) {
            sum += a[right];

            // Shrink window from left if sum > k
            while (sum > k && left <= right) {
                sum -= a[left];
                left++;
            }

            // If sum == k, check window length
            if (sum == k) {
                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = left;
                    end = right;
                }
            }
        }

        // Print longest subarray
        System.out.print("Longest subarray with sum " + k + " = [");
        for (int i = start; i <= end; i++) {
            System.out.print(a[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("]");
        System.out.println("Length = " + maxLen);
    }
}


	
/* java LongestSubarrayWithSumK_5.java
Enter size of array: 7s
Enter 7 elements:
4 1 1 1 2 3 5
Enter value of K: 5
Longest subarray length = 4 */

