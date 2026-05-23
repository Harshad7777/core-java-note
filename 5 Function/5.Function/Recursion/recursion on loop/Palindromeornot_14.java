/* Q14. Write a java program to check whether a number is palindrome or not.
 */


import java.util.*;
public class Palindromeornot_14
{
    // Recursive function to reverse a number
    static int reverseNum(int num, int rev)
    {
        // Base case
        if (num == 0)
            return rev;

        // Recursive case
        int digit = num % 10;
        return reverseNum(num / 10, rev * 10 + digit);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int reversed = reverseNum(num, 0);

        if (num == reversed)
            System.out.println(num + " is a Palindrome number.");
        else
            System.out.println(num + " is NOT a Palindrome number.");
    }
}

/*

>javac palindromeornot14.java
>java palindromeornot14
enter the number
121
given number is palindrome

*/

