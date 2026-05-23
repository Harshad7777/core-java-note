/* Q17. Write a java program to find all factors of a number.
 */

import java.util.*;

public class FactorsOfNumber_17
{
    // Recursive function to print all factors of num
    static void findFactors(int num, int i)
    {
        // Base case: stop when i > num
        if (i > num)
            return;

        // Check if i is a factor
        if (num % i == 0)
            System.out.println(i);

        // Recursive call for next number
        findFactors(num, i + 1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Factors of " + num + " are:");
        findFactors(num, 1);
    }
}

/* java FactorsOfNumber_17.java
Enter a number: 10
Factors of 10 are:
1
2
5
10
 */