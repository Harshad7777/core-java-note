/* Q45. Write a Java program to print all Pronic numbers between 1 and n.
 A Pronic number is the product of two consecutive integers, i.e., n(n+1).
 Example: 2 (1×2), 6 (2×3), 12 (3×4) etc.
Explanation:
 Use a loop to check for each number from 1 to n. For each, use another loop to find if it can be expressed as x*(x+1).
 */

import java.util.*;

public class Pronicnumber_45 
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();

        System.out.println("Pronic numbers from 1 to " + num + ":");

        for (int i = 1; i <= num; i++) 
        {
            // check if i is pronic
            for (int x1 = 1; x1 * (x1 + 1) <= i; x1++)
            {
                if (i == x1 * (x1 + 1))
                {
                    System.out.println(i);
                    break; // exit inner loop once pronic found
                }
            }
        }
    }
}
/* Example for i = 6
x = 1 → 1×2 = 2
x = 2 → 2×3 = 6 ✔ → print 6 */

/* java Pronicnumber_45.java
Enter number:
100
Pronic numbers from 1 to 100:
2
6
12
20
30
42
56
72
90 */