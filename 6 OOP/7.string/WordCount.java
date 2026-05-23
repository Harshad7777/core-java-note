// Q.3 Write a program to count the number of words in a given string

import java.util.Scanner;
public class WordCount
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        
        int wordCount = 0;
        str = str.trim();  // Remove leading and trailing spaces

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {
                wordCount++;
            }
        }
        System.out.println("Number of words in the string: " + (wordCount + 1));
    }
}

// Enter a String:
// harshad tulshiram rakshe
// Number of words in the string: 3


