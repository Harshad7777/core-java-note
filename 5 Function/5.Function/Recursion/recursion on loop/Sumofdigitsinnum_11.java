/* Q11. Write a java program to calculate the sum of digits in a number. */

import java.util.*;
public class Sumofdigitsinnum_11
{
    // Recursive function to find sum of digits
    static int sumOfDigit(int num)
    {
        // Handle negative numbers
        if (num < 0)
            num = -num;

        // Base case: when number becomes 0
        if (num == 0)
            return 0;

        // Recursive case: add last digit + sum of remaining digits
        return (num % 10) + sumOfDigit(num / 10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum = sumOfDigit(num);
        System.out.println("Sum of digits: " + sum);
    }
}


/*

>javac sumofdigitsinnum11.java

>java sumofdigitsinnum11
enter number
1234
sum of digits are :10
*/
