/* Q6. Write a java program to find the sum of all natural numbers between 1 to n.
 */

import java.util.*;
public class sumofallnaturalnumfrom1ton_6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n :");
		int n = sc.nextInt();
		
		System.out.println("sum of all natural num from 1 to "+n+" is :");
		sumofallnaturalnumfrom1ton();
		
	}
	public static void sumofallnaturalnumfrom1ton(){
		int i=1;
		int sum = 0;
		
		while(i<=n)
		{
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
	}			
}
/* 
import java.util.*;

public class SumOfAllNaturalNumFrom1ToN_6 
{
    public static void main(String[] args) 
	{
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


/* java sumofallnaturalnumfrom1ton_6.java
Enter n :10
sum of all natural num from 1 to 10 is :
55 */