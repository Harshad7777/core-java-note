/*
Q12. Write a java program to calculate the product of digits in a number.
*/

import java.util.*;
public class productofdigitinnumber_12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		int multi =1;
		
		while(num !=0)
		{
			multi *= num%10;
			num/=10;
		}
		System.out.println(""+multi);
	}
}

/*
>javac productofdigitinnumber12.java
>java productofdigitinnumber12
enter the number
123
6

>java productofdigitinnumber12
enter the number
1234
24
*/