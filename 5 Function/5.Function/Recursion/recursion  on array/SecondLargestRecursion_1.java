/* Q1. Write a Java program to find the second largest number in an array using a function.
 Example Input:
 arr = {12, 45, 23, 51, 19, 8}
 Output:
 Second Largest: 45
Explanation:
Sort or traverse the array to find the largest and second largest values.

import java.util.*; */

import java.util.*;

public class SecondLargestRecursion_1
{
    // Recursive function to find the largest and second largest numbers
    static void findSecondLargest(int arr[], int index, int[] result)
    {
        // Base case: stop when we reach the end of the array
        if (index == arr.length)
            return;

        int num = arr[index];

        if (num > result[0])  // Update both first and second
        {
            result[1] = result[0];
            result[0] = num;
        }
        else if (num > result[1] && num != result[0])  // Update only second
        {
            result[1] = num;
        }

        // Recursive call for next index
        findSecondLargest(arr, index + 1, result);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] result = {Integer.MIN_VALUE, Integer.MIN_VALUE}; // [largest, secondLargest]

        findSecondLargest(arr, 0, result);

        System.out.println("Second Largest: " + result[1]);
    }
}

/* result[0] → stores the largest number.

result[1] → stores the second largest number.

The recursive function checks one element per call, updating these two values as it goes.

⏱️ Time Complexity: O(n)
💾 Space Complexity: O(n) (due to recursion stack) */
/* 
| Call | index | arr[index] | largest (result[0]) | secondLargest (result[1]) | Action Taken                      |
| ---- | ----- | ---------- | ------------------- | ------------------------- | --------------------------------- |
| 1    | 0     | 12         | -∞ → 12             | -∞ → -∞                   | 12 > -∞ → largest updated         |
| 2    | 1     | 45         | 12 → 45             | -∞ → 12                   | 45 > 12 → both updated            |
| 3    | 2     | 23         | 45                  | 12 → 23                   | 23 < 45 but > 12 → second updated |
| 4    | 3     | 51         | 45 → 51             | 23 → 45                   | 51 > 45 → both updated            |
| 5    | 4     | 19         | 51                  | 45                        | 19 < both → no change             |
| 6    | 5     | 8          | 51                  | 45                        | 8 < both → no change              | */

/* java SecondLargestRecursion_1.java
Enter the size of array: 6
Enter 6 elements:
12 45 23 51 19 8
Second Largest: 45 */
