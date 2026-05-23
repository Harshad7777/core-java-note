// Q.4 Write a program to reverse the given string

import java.util.*;
public class Reverse
{
    public static void main (String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        String reserveString = "";  
        
        for(int i=str.length()-1; i>=0; i--)
        {
            reserveString = reserveString + str.charAt(i);
        }
        System.out.println("Reversed string: " + reserveString);
    }
}


// Enter a string:
// harshad
// Reversed string: dahsrah