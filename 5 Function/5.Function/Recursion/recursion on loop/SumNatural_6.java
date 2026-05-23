/* Q6. Write a java program to find the sum of all natural numbers between 1 to n. */

import java.util.*;
public class SumNatural_6
 {
	
    static int sum(int n) 
	{
        if(n == 0)
			return 0;
		
        return n + sum(n - 1);
    }
	 public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter n: ");
        int n = sc.nextInt();
		System.out.println("Sum = " + sum(n));
		
    }
    
}

/* 
| Function Call | Condition Checked            | Return Value | Explanation             |
| ------------- | ---------------------------- | ------------ | ----------------------- |
| `sum(5)`      | n ≠ 0 → go to recursive call | `5 + sum(4)` | Calls itself with n = 4 |
| `sum(4)`      | n ≠ 0 → go to recursive call | `4 + sum(3)` | Calls itself with n = 3 |
| `sum(3)`      | n ≠ 0 → go to recursive call | `3 + sum(2)` | Calls itself with n = 2 |
| `sum(2)`      | n ≠ 0 → go to recursive call | `2 + sum(1)` | Calls itself with n = 1 |
| `sum(1)`      | n ≠ 0 → go to recursive call | `1 + sum(0)` | Calls itself with n = 0 |
| `sum(0)`      | n == 0 → return 0            | 0            | Base case reached |
 */
 

/* sum(1) = 1 + 0 = 1
sum(2) = 2 + 1 = 3
sum(3) = 3 + 3 = 6
sum(4) = 4 + 6 = 10
sum(5) = 5 + 10 = 15 */


/* java SumNatural_6.java
Enter n: 5
Sum = 15 */