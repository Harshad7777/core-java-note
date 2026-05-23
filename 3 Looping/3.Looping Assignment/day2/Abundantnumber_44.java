// Q44. Write a Java program to find all Abundant numbers up to n.
 // An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
 // Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 → sum = 16 > 12.
// Explanation:
 // Use nested loops: outer for numbers from 1 to n; inner for finding proper divisors and summing them. Compare sum with the number.

import java.util.*;

public class Abundantnumber_44 
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt(); 

        for (int i = 1; i <= num; i++) 
        {
            int sum = 0;

            // Find proper divisors of i
            for (int j = 1; j <= i / 2; j++)
            {
                if (i % j == 0) 
                {
                    sum += j; 
                }
            }

            // Check abundant number
            if (sum > i)
            {
                System.out.println(i + " is Abundant Number (Sum of divisors = " + sum + ")");
            }
        }	
    }
}



/* 
⭐ Important Number
### i = 18

Divisors:
1 → sum = 1
2 → sum = 3
3 → sum = 6
4 → skip
5 → skip
6 → sum = 12
7 → skip
8 → skip
9 → sum = 21

Sum = 21
21 > 18? ✅ YES → Print 18 */

/* 

Enter number:
12
12 is Abundant Number (Sum of divisors s= 16)*/