/*
Q22. Write a java program to Check Number Is Perfect Number or Not.
Example : perfect number, a positive integer that is equal to the sum of its proper divisors. The smallest perfect number is 6,which is the sum of 1, 2, and 3. Other perfect numbers are 28, 496, and 8,128.
*/

import java.util.*;

public class perfectnumber_22 
{
    public static void main(String x[] ) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        
        int num = sc.nextInt();
		
        int sum = 0;
        
		
        for (int i = 1; i <= num / 2; i++)
			{
            if (num % i == 0) 
			{
                sum += i;
				System.out.println(i + " are divisor "); // print divisor
            }
        }
        
        // Check perfect number
        if (sum == num) 
		{
            System.out.println(num + " is a perfect number");
        } else 
		{
            System.out.println(num + " is not a perfect number");
        }
    }
}
/* 
java perfectnumber_22.java
Enter the number:
6
1 are divisor
2 are divisor
3 are divisor
6 is a perfect number

 */