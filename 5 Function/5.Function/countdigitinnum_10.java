/* Q10. Write a java program to count the number of digits in a number.  */

import java.util.*;
public class countdigitinnum_10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the digit");
		int num  = sc.nextInt();
		
		countdigitinnum(num);
	}
	public static void countdigitinnum(int num)
	{
		int count = 0;

		if(num==0)
		{
			count = 1;
		}
		else
		{
			while(num!=0)
			{
				num=num/10;
				count++;
			}
		}
		System.out.println("count of digit in number is "+count);
		
	}
}
/* 
java countdigitinnum_10.java
enter the digit
10
count of digit in number is 2 */