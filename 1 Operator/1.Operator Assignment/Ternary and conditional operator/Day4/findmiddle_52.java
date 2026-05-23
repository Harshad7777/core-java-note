/*
Q52. Problem:
Write a Java program using the conditional (ternary) operator to find the middle value among three distinct integers p, q, and r.
Example Input:
p = 10, q = 20, r = 15
*/
import java.util.*;

public class FindMiddle_52
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (p): ");
        int p = sc.nextInt();

        System.out.print("Enter second number (q): ");
        int q = sc.nextInt();

        System.out.print("Enter third number (r): ");
        int r = sc.nextInt();

        int middle =
            ((p > q && p < r) || (p > r && p < q)) ? p :
            ((q > p && q < r) || (q > r && q < p)) ? q :  
            r;

        System.out.println("Middle value among three distinct integers is " + middle);
    }
}

/* 
>java findmiddle52.java
enter first number
10
enter second number
20
enter third number
15
Middle value among three distinct integers is 15
 */

