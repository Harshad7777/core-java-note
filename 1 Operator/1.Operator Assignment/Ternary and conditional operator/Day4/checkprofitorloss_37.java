/*
Q37. Write a Java program to input cost price and selling price of a product and check profit or loss.
*/


import java.util.*;
public class checkprofitorloss_37
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter cost price");
			int cost = sc.nextInt();
			
			System.out.println("enter selling price");
			int selling = sc.nextInt();
			
			if(cost<selling)
			{
				System.out.println(" profit ");
			}
			else
			{
				System.out.println("loss");
			}
		}
	}

/* >javac checkprofitorloss.java
>java checkprofitorloss
enter cost price
50
enter selling price
100
profit

>java checkprofitorloss
enter cost price
110
enter selling price
100
loss */