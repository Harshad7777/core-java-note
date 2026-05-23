/* Q28. Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
 	Input : 1412
	Output : Spy Number
	Explanation :
	sum = (1 + 4 + 1 + 2) = 8
	product = (1 * 4 * 1 * 2) = 8
	since, sum == product == 8

 */
import java.util.*;
public class SpyNumberorNot_28
	{
		public static void main(String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter the number");
			int num = sc.nextInt();
			
			SpyNumberorNot(num);
		}
		public static void SpyNumberorNot(int num)
		{
			int n = num;
			int sum=0;
			int product=1;
			while(n!=0)
			{
				sum += n%10;
				product *= n%10;
				
				n/=10;
			}
			
			if(sum == product)
				{
				System.out.println(num +" Spy Number ");
				}
				else
				{
				System.out.println(num+" not Spy Number ");	
				}
		}
	}

/* 
C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\day2>java SpyNumberorNot28.java
enter the number
1412
1412 Spy Number */