/* 
Q5. Problem:
 Given an integer array, find the next greater element for each element using a stack.
 If no greater element exists, print -1 for that position.
Example:
 Input: {4, 5, 2, 25}
 Output: {5, 25, 25, -1}
Logic Explanation :
Traverse from right to left.
Use a stack to keep track of greater elements.
For each element:

Pop smaller elements from the stack.
If the stack is not empty, its top is the next greater element.
Push the current element to the stack. 
*/
imprt java.util.*;
public class NextGreaterElement_5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array:");
		int n = sc.nextInt();
		
		int arr{} = new int[]
	}
}
/* import java.util.*;

public class NextGreaterElement_5 
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

        int result[] = new int[n];
        int stack[] = new int[n]; // manual stack
        int top = -1;

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) 
		{
            // Pop smaller elements
            while (top != -1 && stack[top] <= arr[i]) {
                top--;
            }

            // If stack is not empty, top is next greater
            if (top != -1)
                result[i] = stack[top];
            else
                result[i] = -1;

            // Push current element
            stack[++top] = arr[i];
        }

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

 */