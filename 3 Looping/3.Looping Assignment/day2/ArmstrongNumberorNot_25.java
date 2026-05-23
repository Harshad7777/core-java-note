/*
Q25. Write a java program to Check Number Is Armstrong Number or Not.
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
*/

import java.util.*;
public class ArmstrongNumberorNot_25
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt(); //153
		 
		int count = 0;
		int sum = 0;
		int temp = num ;
		
		while(num>0) 
		{
			num = num/10; //153, 15, 1
			count++;  //1,2,3
		}
		
		num = temp;
		while(num>0)
		{	
			int digit = num % 10;  //3,5,1
			
			int digitpower = 1;
			
			for(int i=1; i<=count; i++)
				{
					digitpower = digitpower * digit;
				}
			sum = sum + digitpower;
			num/=10;
		}
		
		if(sum == temp)
		{
			System.out.println( temp +" Armstrong Number ");
		}
		else
		{
			System.out.println(temp +" not Armstrong Number ");
		}
	}
}

/* Digits = 1, 5, 3
Number of digits = 3

1³ + 5³ + 3³
= 1 + 125 + 27
= 153  ✅ */

/*
import java.util.*;

public class ArmstrongNumberorNot25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt(); // e.g. 153
        int temp = num;  

        int count = 0;
        int sum = 0;

        // Step 1: count digits
        int n = num;
        while (n > 0) {
            n = n / 10;
            count++;
        }

        // Step 2: calculate sum of digit^count using loop
        n = num;
        while (n > 0) {
            int digit = n % 10;

            int digitpower = 1; // reset for each digit
            for (int i = 1; i <= count; i++) {
                digitpower *= digit; // multiply digit by itself count times
            }

            sum += digitpower;
            n /= 10;
        }

        // Step 3: check Armstrong
        if (sum == temp) {
            System.out.println(temp + " is an Armstrong Number");
        } else {
            System.out.println(temp + " is NOT an Armstrong Number");
        }
    }
}

*/


/* java ArmstrongNumberorNot_25.java
enter number
153
153 Armstrong Number */	
