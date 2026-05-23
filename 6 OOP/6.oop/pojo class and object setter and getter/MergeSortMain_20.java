/* Q20. Given two sorted arrays, the task is to merge them in a sorted manner.
Examples: 
Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8} 
Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}
Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8} 
Output: arr3[] = {4, 5, 7, 8, 8, 9} 
Your Task: you have to create class name as MergeSort with constructor and methods 
MergeSort(int a[],int []): this function is used for accept two array as parameter 
int[] getMergedArray(): this function is used for return merged array */

import java.util.*;
class MergeSort
{
    private int[] a;
    private int[] b;

    // Constructor
    public MergeSort(int[] a, int[] b)
    {
        this.a = a;
        this.b = b;
    }

    public int[] getMergedArray()
    {
        int m = a.length;
        int n = b.length;

        int[] result = new int[m + n];
        int k = 0;

        // Copy elements of a
        for(int i = 0; i < m; i++)
        {
            result[k++] = a[i];
        }

        // Copy elements of b
        for(int i = 0; i < n; i++)
        {
            result[k++] = b[i];
        }

        // Sort merged array
        for(int i = 0; i < result.length; i++)
        {
            for(int j = i + 1; j < result.length; j++)
            {
                if(result[i] > result[j])
                {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        return result;
    }
}

public class MergeSortMain_20
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array 1:");
        int size1 = sc.nextInt();

        int a[] = new int[size1];
        System.out.println("Enter the elements in arr1:");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the size of array 2:");
        int size2 = sc.nextInt();

        int b[] = new int[size2];
        System.out.println("Enter the elements in arr2:");
        for(int i = 0; i < b.length; i++)
        {
            b[i] = sc.nextInt();
        }

        MergeSort obj = new MergeSort(a, b);
        int merged[] = obj.getMergedArray();

        System.out.println("Merged Sorted Array:");
        for(int val : merged)
        {
            System.out.print(val + " ");
        }
    }
}
/* 
public int[] getMergedArray()
{
    int m = a.length;
    int n = b.length;

    int[] result = new int[m + n];

    int i = 0, j = 0, k = 0;

    // merge like merge-step of merge sort
    while(i < m && j < n)
    {
        if(a[i] < b[j])
            result[k++] = a[i++];
        else
            result[k++] = b[j++];
    }

    // remaining elements
    while(i < m) result[k++] = a[i++];
    while(j < n) result[k++] = b[j++];

    return result;
}
 */