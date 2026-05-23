/*
Q27. Write a java program to Check If a Number Is a Happy Number or Not.
Example : A number is called happy if it leads to 1 after a sequence of steps where in each step number is replaced by the sum of squares of its digit, that is if we start with Happy Number and keep replacing it with digits square sum, we reach 1.
        	Input: n = 19
        	Output: True
        	19 is Happy Number,
        	1^2 + 9^2 = 82
        	8^2 + 2^2 = 68
        	6^2 + 8^2 = 100
        	1^2 + 0^2 + 0^2 = 1
        	As we reached 1, 19 is a Happy Number.
*/

import java.util.*;
	public class HappyNumberorNo_27
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter number ");
			int n = sc.nextInt();
			
			int num = n; 
			
			while(n!=1 && n!=4)
			{
				int sum = 0;
				
				while(n!= 0) //19
				{
					int digit = n%10; //9
					sum+=digit*digit; //9*9=81
					n/=10; //1
				}
				
			    n = sum;
				System.out.println("next value = "+n) ;
			}
			
			if(n==1)
			{
				System.out.println("Happy Number = "+num) ;
			}
			else
			{
				System.out.println("NOt Happy Number = "+num) ;
			}
		}
	}
	
/* C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\day2>java HappyNumberorNo27.java
enter number
19
next value = 82
next value = 68
next value = 100
next value = 1
Happy Number = 19
 */
 /* 
 public class HappyNumberRange {

    // Method to check happy number
    static boolean isHappy(int n) {
        int slow = n, fast = n;

        // Floyd's cycle detection
        do {
            slow = sumOfSquares(slow);              // Move 1 step
            fast = sumOfSquares(sumOfSquares(fast)); // Move 2 steps
        } while (slow != fast);

        return slow == 1; // If meeting point is 1 → happy number
    }

    // Method to calculate sum of squares of digits
    static int sumOfSquares(int n) {
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Happy Numbers from 1 to 1000:");

        for (int i = 1; i <= 1000; i++) {
            if (isHappy(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
 */