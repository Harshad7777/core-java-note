/* Q13. Write a java program to enter a number and print its reverse. */

import java.util.*;
public class Printnumreverse_13
{
    // Recursive function to reverse a number
    static int reverseNum(int num, int rev)
    {
        // Base case: when number becomes 0
        if (num == 0)
            return rev;

        // Recursive case: extract last digit and build reverse
        int digit = num % 10;
        return reverseNum(num / 10, rev * 10 + digit);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int reversed = reverseNum(num, 0); // initial rev = 0
        System.out.println("Reversed number: " + reversed);
    }
}



/* java Printnumreverse_13.java
enter the number
123
Reversed number: 321 */