/* Q36. Write a java program to find HCF (GCD) of two numbers.

You want a Java program to find the HCF (Highest Common Factor), also called GCD (Greatest Common Divisor) of two numbers.

How it works?

HCF is the largest number that divides both numbers exactly.

We only need to check up to the smaller number (min) because a larger divisor than min can’t divide both.

If i divides both a and b (a % i == 0 && b % i == 0), then i is a common divisor.

The loop keeps updating hcf with the largest divisor found.

At the end, hcf is the answer.

✅ Example: a = 36, b = 60

Common divisors = {1, 2, 3, 6, 12}

Largest = 12 → HCF = 12.
 */
/*  
import java.util.*;

public class HCF36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int hcf = 1;

        // Find smaller of two numbers
        int min = (a < b) ? a : b;

        // Check all numbers from 1 to min
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;   // update when common divisor found
            }
        }

        System.out.println("HCF (GCD) of " + a + " and " + b + " is: " + hcf);
    }
}
 */
 
import java.util.*;
 
 public class GCDoftwonumbers_36
 {
	 public static void main(String x[])
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter first num");
		 int a = sc.nextInt();
		 
		 System.out.println("enter second num");
		 int b = sc.nextInt();
		 
		  int hcf = 1;
		 //find min value fron a,b	
		 int min = (a<b) ? a : b;
		 
		 // find all num from to 1 to n
		 for(int i=1; i<=min; i++)
		 {
			
			 if(a%i==0 && b%i==0)
			 {
				hcf = i;
			 }
		}
		System.out.println("HCF (GCD) of " + a + " and " + b + " is: " + hcf);
		 
	 }
 }
 
/*  
 java GCDoftwonumbers_36.java
enter first num
36
enter second num
60
HCF (GCD) of 36 and 60 is: 12 */