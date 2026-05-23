/*
Q33. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 

Equilateral → All sides are equal (a == b && b == c).

Isosceles → Any two sides are equal (a == b || b == c || a == c).

Scalene → All sides are different.
*/
import java.util.*;
public class equilateralisoscalescalene_33
{
    public static void main (String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter number");
        int a = sc.nextInt();
        
        System.out.println("enter number");
        int b = sc.nextInt();
        
        System.out.println("enter number");
        int c = sc.nextInt();
        
        // Check if triangle is valid
        if(a + b > c && b + c > a && a + c > b)
        {
            if(a == b && b == c)
            {
                System.out.println("triangle is equilateral");
            }
            else if(a == b || b == c || c == a)
            {
                System.out.println("triangle is isosceles");
            }
            else
            {
                System.out.println("triangle is scalene");
            }
        }
        else
        {
            System.out.println("triangle is not valid");
        }
    }
}

/* 	
>javac equilateralisoscalescalene.java	
>java equilateralisoscalescalene
enter number
3
enter number
4
enter number
5
triangle is scalene

>java equilateralisoscalescalene
enter number
1
enter number
1
enter number
1
triangle is equilateral */

