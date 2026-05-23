/* Q7. Write a java program to find the sum of all even numbers between 1 to n. */

import java.util.*;
public class sumofevennum1ton_7
{
    static int sum(int n)
    {
        if(n == 0)
            return 0;

        if(n % 2 == 0)
            return n + sum(n - 1);   // Add even number
        else
            return sum(n - 1);       // Skip odd number
    }
	
	 public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n:");
        int n = sc.nextInt();

        System.out.println("Sum of even numbers: " + sum(n));
    }
}
/* 
java sumofevennum1ton_7.java
Enter value of n:

10
Sum of even numbers: 30 */


