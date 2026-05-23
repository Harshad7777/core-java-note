// Q.5 Write a program to check whether a given string is palindrome or not

import java.util.*;
public class Palindrome
{
    public static void main (String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        String reversedString = "";  
        
        for(int i=str.length()-1; i>=0; i--)
        {
            reversedString = reversedString + str.charAt(i);
        }
        if(str.equals(reversedString))
        {
            System.out.println("The string is a palindrome.");
        }
        else
        {
            System.out.println("The string is not a palindrome.");
        }
    }
}

// Enter a string:
// harah
// The string is a palindrome.