/* Q30.  Write a java program to display 1 to nth Perfect Number.

 */
import java.util.*;
public class Perfectnumber1ton_30
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt();
		
		Perfectnumber1ton(num);
	}
	public static void Perfectnumber1ton(int num)
	{
		//start from 2 becsuse 1 is not prime number
		for(int i=2; i<=num; i++)
		{
	
			int sum=0;
			for(int j=1; j<=i/2; j++)
			{
				if(i%j==0)
				{
					sum+=j;
					
				}
			}	
				if(sum==i && i!=0)
				{
					System.out.print(i+" ");
					
				}
		}
	}
}

/* 
>java Perfectnumber1ton30.java
enter number
1000
6 28 496 */