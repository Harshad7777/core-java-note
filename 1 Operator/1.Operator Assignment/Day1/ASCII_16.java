/*
Q16. Write a Java program to print the ASCII value of a given character.
*/

import java.util.*;
public class ASCII_16
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter given character");
        char ch = sc.next().charAt(0);

        int ascii = (int)ch;

        System.out.println("ascii value of " +ch+ " is " +ascii);
    }
}

/* 
enter given character
A
ascii value of A is 65 
*/