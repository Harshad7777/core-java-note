// Q.1 Write a program to count the number of vowels and number of consonents in a given string.

import java.util.Scanner;
public class VowelCon
{
    public static void main(String x[])
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int vowelCont = 0;
        int consonantCont = 0;
        
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowelCont++;
            }
            else if(ch >= 'a' && ch <= 'z')
            {
                consonantCont++;
            }
        }
        System.out.println("Number of vowels: " + vowelCont);
        System.out.println("Number of consonants: " + consonantCont);
    }
}

// Enter a string:
// a e i ou a b c
// Number of vowels: 6
// Number of consonants: 2