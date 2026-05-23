/*

Q34. Write a Java program to check whether a number is positive , negative or zero.

*/


import java.util.*;
public class numberpositivenegativezero_34
	{
		public static void main (String x[])
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter number");
			int num = sc.nextInt();
			
			if (num > 0) 
			{
            System.out.println(num + " is Positive");
			} 
			else if (num < 0) 
			{
            System.out.println(num + " is Negative");
			} 
			else 
			{
            System.out.println("The number is Zero");
			}
    }
}

>javac numberpositivenegativezero.java
>java numberpositivenegativezero
enter number
1
1 is Positive

>java numberpositivenegativezero
enter number
-1
-1 is Negative

>java numberpositivenegativezero
enter number
0
The number is Zero