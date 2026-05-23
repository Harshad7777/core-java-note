/*
Q6. Write a java program to find the sum of all natural numbers between 1 to n.
*/

import java.util.*;
public class sumofallnaturalnumton6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of n");
		int n =sc.nextInt();
		
		int i=1;
		int sum = 0;
	
		
		while(i<=n)
		{
			sum += i ;
			i++;
		}
		System.out.println("sum of all natural numbers between 1 to " + n +" is " + sum);
	}
}

/* 
import java.util.*;

public class SumOfAllNaturalNumFrom1ToN_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = getSum(n);
        System.out.println("Sum of all natural numbers from 1 to " + n + " is: " + result);
    }

    public static int getSum(int n) {
        int i = 1;
        int sum = 0;

        while (i <= n) {
            sum = sum + i;
            i++;
        }

        return sum;
    }
} */

/* 
>javac sumofallnaturalnumton6.java
>java sumofallnaturalnumton6
enter value of n
5
sum of all natural numbers between 1 to 5 is 15 */