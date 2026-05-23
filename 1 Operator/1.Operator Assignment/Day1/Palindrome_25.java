/*
Q25. Write a java program to check whether number is palindrome or not. 
*/

import java.util.Scanner;

public class Palindrome_25
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        int temp = num;
        int rev = 0; 

        while(temp > 0)
        {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        String res = (rev == num) ? "Palindrome" : "Not - Palindrome";
        System.out.println(res);
    }
}

/* >javac Palindrome.java
>java Palindrome
enter the number:
123
Not - Palindrome

>java Palindrome
enter the number:
121
Palindrome */

