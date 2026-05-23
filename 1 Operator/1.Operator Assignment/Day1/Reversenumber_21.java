/*
Q21. Write a Java program to reverse a number without using loop.
Input a number: 123 Reverse number: 321
*/

import java.util.*;
public class Reversenumber_21
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0;

        while(temp > 0)
        {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println("Reverse number: " + rev);
    }
}


/* 
>javac Reversenumber.java

>java Reversenumber
Enter an integer:
123
Reverse number 321 */
	