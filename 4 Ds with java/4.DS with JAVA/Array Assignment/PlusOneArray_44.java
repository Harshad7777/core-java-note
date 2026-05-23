/*
Q9. You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits. 

Example 1: 
Input: digits = [1,2,3]    
Output: [1,2,4] 
Explanation: The array represents the integer 123. 
Incrementing by one gives 123 + 1 = 124. 
Thus, the result should be [1,2,4]. 

Example 2: 
Input: digits = [4,3,2,1]   
Output: [4,3,2,2] 
Explanation: The array represents the integer 4321. 
Incrementing by one gives 4321 + 1 = 4322. 
Thus, the result should be [4,3,2,2]. 
 */
 import java.util.*;
public class PlusOneArray_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        int a[] = new int[size];

        System.out.println("Enter digits:");
        for (int i = 0; i < size; i++) a[i] = sc.nextInt();

        // Process from last digit
        for (int i = size - 1; i >= 0; i--) 
		{
            if (a[i] < 9) {
                a[i] += 1;  // no carry, done
                break;
            } else {
                a[i] = 0;   // carry over
            }
        }

        // If first digit is 0, we need extra space (e.g., 999 -> 1000)
        if (a[0] == 0) {
            int[] result = new int[size + 1];
            result[0] = 1;
            a = result;
        }

        // Print in exact format [1,2,4]
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) System.out.print(",");
        }
        System.out.println("]");
    }
}
