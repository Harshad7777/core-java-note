/*Q17. Search for a pair with a given sum in an array.
Given an array arr[] of n integers and a target value, the task is to find whether there is a pair of
elements in the array whose sum is equal to target. This problem is a variation of 2Sum problem.
Examples: 
Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: There is no pair with sum equals to given target.
*/

import java.util.*;

class ArraySum
{
    private int[] a;
    private int target;
    
    public void setArray(int a[], int target)
    {
        this.a = a;
        this.target = target;
    }
    
    public boolean getSum()
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] + a[j] == target)
                {
                    return true;   // pair found
                }
            }
        }
        return false; // no pair found
    }
}

public class PairSearchMain_17
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        int a[] = new int[5];
        
        System.out.print("Enter the elements in array: ");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();
        
        ArraySum as = new ArraySum();
        as.setArray(a, target); //anonymums
        
        boolean res = as.getSum();
        
        if(res)
		{
            System.out.println("true");
			
		}
        else
		{
            System.out.println("false");
			
		}
    } 
}

/* java PairSearchMain_17.java
enter the elements in arr: 0 -1 2 -3 1
enter the target for sum: -2
true */
/* 
import java.util.*;

public class PairWithGivenSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        Arrays.sort(arr);  // Step 1: sort the array
        
        int left = 0;
        int right = arr.length - 1;
        
        // Step 2: use two pointers
        while (left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                return true; // pair found
            }
            else if (sum < target) {
                left++;     // increase sum
            }
            else {
                right--;    // decrease sum
            }
        }
        
        return false; // no pair found
    }
    
    public static void main(String[] args) {
        int[] arr1 = {0, -1, 2, -3, 1};
        int target1 = -2;
        
        int[] arr2 = {1, -2, 1, 0, 5};
        int target2 = 0;
        
        System.out.println(hasPairWithSum(arr1, target1)); // true
        System.out.println(hasPairWithSum(arr2, target2)); // false
    }
}
 */
 
 
/* java PairSearchMain_17.java
Enter the elements in array: 0 -1 2 -3 1
Enter the target sum: -2
true */
