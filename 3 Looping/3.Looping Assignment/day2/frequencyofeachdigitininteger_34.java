/* 
Q34. Write a java program to find the frequency of each digit in a given integer.

Example Walkthrough

Suppose num = 112358.

Outer loop first checks digit = 0 → scans the whole number, finds 0 → prints Digit 0 → 0 times.

Next, digit = 1 → scans again → finds 2 ones → prints Digit 1 → 2 times.

Next, digit = 2 → finds 1 → prints Digit 2 → 1 time.

Continues until digit 9.
 */

 import java.util.*;
 public class frequencyofeachdigitininteger_34
 {
	 public static void main(String x[])
	 {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("enter number");
		long num = sc.nextLong();
		
		for(int d=0; d<=9; d++) //0 1 2 3 4 5 6 7 8 9
		{
			long temp = num;
			int count = 0;
			
			while(temp !=0)
			{
				long digit = temp%10;
				if(digit==d)
				{
					count++;
				}
				temp/=10;
			}
			System.out.println("digit"+ d +"-->"+ count +"times");
		}
	 }
 }
/*  

 >java frequencyofeachdigitininteger34.java
enter number
12365478987456123
digit0-->0times
digit1-->2times
digit2-->2times
digit3-->2times
digit4-->2times
digit5-->2times
digit6-->2times
digit7-->2times
digit8-->2times
digit9-->1times
 */