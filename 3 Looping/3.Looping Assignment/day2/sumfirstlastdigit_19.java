/*
Q19. Write a java program to find the sum of the first and last digit of a number.
*/

import java.util.*;
public class sumfirstlastdigit_19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt();
		
		//last digit
		int last = num%10;
		
		//first digit
		int firstdigit = num;
		while(firstdigit>=10)
		{
			firstdigit = firstdigit/10;
		}
		
		System.out.println(num +" sum of first and last digit : "+(firstdigit+last));
	}
}


/* >javac sumfirstlastdigit19.java

>java sumfirstlastdigit19
enter number
12345
12345 sum of first and last digit : 6 */
