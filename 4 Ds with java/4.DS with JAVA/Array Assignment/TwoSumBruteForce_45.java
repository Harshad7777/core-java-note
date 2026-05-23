/*Q10. Given an array of integers nums and an integer target, return indices of the two numbers 
such that they add up to target. 
You may assume that each input would have exactly one solution, and you may not use the 
same element twice. 
You can return the answer in any order. 
Example 1: 
Input: nums = [2,7,11,15], target = 9   
Output: [0,1] 
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]. 
Example 2: 
Input: nums = [3,2,4], target = 6   
Output: [1,2]
*/ 
import java.util.*;
public class TwoSumBruteForce_45
{
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("enter size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter "+size+" element");
		for(i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter target");
		int target = sc.nextInt();
	
        for ( i = 0; i < a.length; i++) 
		{
            for ( j = i + 1; j < a.length; j++) 
			{
                if (a[i] + a[j] == target) 
				{
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}

/* 
enter size
4
enter 4 element
2 7 11 15
enter target
9
[0,1]
 */


/* 
public class TwoSumBruteForce {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}

 */