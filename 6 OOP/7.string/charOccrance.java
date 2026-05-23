// Q.2 Write a program to read a string from user and find the occurance of a given character in given string.

import java.util.*;

public class charOccrance {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Enter a character to find its occurance:");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < str.length(); i++) 
            {
            if (str.charAt(i) == ch) 
                {
                    count++;
                }
        }
        System.out.println("The character '" + ch + "' occurs " + count + " times in the string.");
    }
}

// Enter a string:
// harshad
// Enter a character to find its occurance:
// h
// The character 'h' occurs 2 times in the string.
