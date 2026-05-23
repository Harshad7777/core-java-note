/* 4. Count Distinct Elements in Every Window of Size K
Example:
Input: arr = [1, 2, 1, 3, 4, 2, 3], K=4
Output: [3, 4, 4, 3] */

import java.util.*;

public class CountDistinctWithoutHashSet_4
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter window size k: ");
        int k = sc.nextInt(); 
        
        // Loop for each window
        for (int i = 0; i <= n - k; i++)
        {
            int distinctCount = 0;
            
            // Check elements in current window
            for (int j = i; j < i + k; j++)
            {
                boolean isDistinct = true;

                // Check if arr[j] appeared before in this window
                for (int p = i; p < j; p++)
                {
                    if (arr[j] == arr[p])
                    {
                        isDistinct = false;
                        break;
                    }
                }

                // If not appeared before, count it as distinct
                if (isDistinct)
                {
                    distinctCount++;
                }
            }

            System.out.print(distinctCount + " ");
        }
    }
}
/* 

java CountDistinctWithoutHashSet_4.java
Enter size of array: 7
Enter 7 elements:
1 2 1 3 4 2 3
Enter window size k:
4
3 4 4 3 

*/