/*
Q29. Write a java program to display 1 to nth Prime Number.
*/
//0 and 1 are not print neumber
//i start from 2
import java.util.*;
public class PrimeCheck1tonth_29
{
	 public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" enter nth number check all prime number before that");
		
		int num = sc.nextInt(); //10
        
		int count = 0;
		for(int i=2; i<=num; i++) //i=3
		{
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
	
			if(count==2)
			{
				System.out.println(i);
				count=0;
			}
			else
			{
				count=0;
			}
		}
	}
}
/*
>javac PrimeCheck1tonth29.java
>java PrimeCheck1tonth29
 enter nth number check all prime number
10
2
3
5
7
*/
