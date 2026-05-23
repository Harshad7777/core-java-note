/* Q10. Write a java program to count the number of digits in a number. */

import java.util.*;

public class CountDigits_10
{
   
    static int countDigits(int n)
    {
        // Handle negative numbers
        if (n < 0)
            n = -n;

        // Base case
        if (n == 0)
            return 0;

        // Recursive case
        return 1 + countDigits(n / 10);
    }
	
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
			
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
			
        System.out.println("Total digits: " + countDigits(num));
    }
}
/* 
| Function Call     | n    | Return               |
| ----------------- | ---- | -------------------- |
| countDigits(4567) | 4567 | 1 + countDigits(456) |
| countDigits(456)  | 456  | 1 + countDigits(45)  |
| countDigits(45)   | 45   | 1 + countDigits(4)   |
| countDigits(4)    | 4    | 1                    |
| **Total:**        |      | 4                    |
 */


/* java CountDigits_10.java
Enter a number: 13
Total digits: 2 */