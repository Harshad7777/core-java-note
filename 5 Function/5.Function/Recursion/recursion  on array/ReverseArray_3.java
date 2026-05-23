/*
 Q3. Write a Java program to reverse an array using a function.
Example Input:
arr = {5, 10, 15, 20, 25}
Output:
Reversed Array: 25 20 15 10 5 */

import java.util.*;

public class ReverseArray_3
{
    // Recursive function to reverse the array
    static void reverseArray(int arr[], int start, int end)
    {
        // Base case: stop when start crosses end
        if (start >= end)
            return;

        // Swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // Recursive call for next pair
        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        reverseArray(arr, 0, n - 1);

        System.out.println("Reversed Array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}

/* 
| Call | start | end | Swap    | Resulting Array     |
| ---- | ----- | --- | ------- | ------------------- |
| 1    | 0     | 4   | 5 ↔ 25  | {25, 10, 15, 20, 5} |
| 2    | 1     | 3   | 10 ↔ 20 | {25, 20, 15, 10, 5} |
| 3    | 2     | 2   | Stop    | {25, 20, 15, 10, 5} | */



/* 
java ReverseArray_3.java
Enter size of array: 5
Enter 5 elements:
5 10 15 20 25
Reversed Array:
25 20 15 10 5 */
