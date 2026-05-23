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
			
			HappyNumberorNo(n);
			
		}
		public static void HappyNumberorNo(int n)
		{
			int num = n; 

			while(n!=1 && n!=4)
			{
				int sum = 0;
				
				while(n!= 0) //19
				{
					int digit = n%10; //9 ,1
					sum+=digit*digit; 
					//9*9=81,1*1=1 ==81+1=82
					n/=10;  //1
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
	
|/*  Input | Output       | Explanation                                                    |
| :---- | :----------- | :------------------------------------------------------------- |
| 19    | Happy Number | 1² + 9² = 82 → 8² + 2² = 68 → 6² + 8² = 100 → 1                |
| 4     | Not Happy    | Enters loop → never reaches 1                                  |
| 7     | Happy Number | 7² = 49 → 4² + 9² = 97 → 9² + 7² = 130 → 1³ + 3² + 0² = 10 → 1 |
 */
	
/* C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\day2>java HappyNumberorNo27.java
enter number
19
next value = 82
next value = 68
next value = 100
next value = 1
Happy Number = 19
 */
 
 
 import java.util.*;
 public class Happynumber
 {
	 public static void main(String x[])
	 {
		 Scanner sc = new Scnner
	 }
	 
	 int num = n;
	 while(n!=1 && n!=4)
	 {
		 
	 }
 }