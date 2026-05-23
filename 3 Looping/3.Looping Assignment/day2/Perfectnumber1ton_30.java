/* 
Q30.  Write a java program to display 1 to nth Perfect Number.
*/
import java.util.*;

public class Perfectnumber1ton_30
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();
       
        // Loop from 1 to num
        for (int i = 1; i <= num; i++)
        {
            int sum = 0;

            // Find proper divisors of i
            for (int j = 1; j <= i /2; j++)
            {
                if (i % j == 0)
                {
                    sum += j;
                }
            }

            // Check perfect number
            if (sum == i)
            {
                System.out.print(i + " ");
            }
        }
    }
}


/* A Perfect Number is a number whose sum of proper divisors equals the number itself.

Examples:

6 ⇒ 1 + 2 + 3 = 6
28 ⇒ 1 + 2 + 4 + 7 + 14 = 28 */

/* 
>java Perfectnumber1ton30.java
enter number
1000
6 28 496 */