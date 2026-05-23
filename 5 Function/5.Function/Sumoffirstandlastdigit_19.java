/* Q19. Write a java program to find the sum of the first and last digit of a number. */

import java.util.*;
public class Sumoffirstandlastdigit_19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		sum(num);
	}
	public static void sum(int num)
	{
		int lastdigit = num%10;
		
		int firstdigit = num;
		while(firstdigit>=10)
		{
			firstdigit = firstdigit/10;
		}
		System.out.println("sum of first and last digit "+(firstdigit+lastdigit));
	}
}
/* 
java Sumoffirstandlastdigit_19.java
enter the number
101
sum of first and last digit 2 */