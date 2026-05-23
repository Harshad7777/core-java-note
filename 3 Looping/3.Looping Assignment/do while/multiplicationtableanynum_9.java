/*
Q9. Write a java program to print a multiplication table of any number.
*/

import java.util.*;
public class multiplicationtableanynum9
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter n: ");
		int n = sc.nextInt();
		
		int i = 1;
		
		while(i<=10)
		{
			System.out.println(n+" x "+i+" = "+(n * i));
			i++;
		}
	}
}

/* 
>javac multiplicationtableanynum9.java

>java multiplicationtableanynum9
enter n:
10
10 x 1 = 10
10 x 2 = 20
10 x 3 = 30
10 x 4 = 40
10 x 5 = 50
10 x 6 = 60
10 x 7 = 70
10 x 8 = 80
10 x 9 = 90
10 x 10 = 100 */