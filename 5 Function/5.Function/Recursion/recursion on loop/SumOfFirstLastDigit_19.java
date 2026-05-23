
/*  Q19. Find the Sum of First and Last Digit (Using Recursion) */

import java.util.*;

public class SumOfFirstLastDigit_19
{
    static int firstDigit(int num)
    {
        if (num < 10)
            return num;
        return firstDigit(num / 10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int last = num % 10;
        int first = firstDigit(num);

        int sum = first + last;

        System.out.println("First digit: " + first);
        System.out.println("Last digit: " + last);
        System.out.println("Sum of first and last digit: " + sum);
    }
}
/* 
java SumOfFirstLastDigit_19.java
Enter a number: 123
First digit: 1
Last digit: 3
Sum of first and last digit: 4
 */