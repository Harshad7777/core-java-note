/* Q7. Write a java program to find the sum of all even numbers between 1 to n.
 */


import java.util.*;
public class sumofallevennaturalnumton_7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of n");
		int n =sc.nextInt();
		
		sumofallevennaturalnumton(n);
	}
		
		public static void sumofallevennaturalnumton(int n)
		{
			int i=1;
			int sum = 0;
			while( i<=n)	
			{
				if(i%2==0)
				{
					sum = sum + i;		
				}
				i++;
			}
			System.out.println("sum of all even number of 1 to "+n+ " is "+sum);
		}	
}	
/* 
import java.util.*;
public class sumofallevennaturalnumton_7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter value of n");
		int n =sc.nextInt();
		
		int result = getsumofallevennaturalnumton(n);
		System.out.println("sum of all even num from 1 to "+ n +" is :"+result);
	}
		
		public static int getsumofallevennaturalnumton(int n)
		{
			int i=1;
			int sum =0;
			while( i<=n)	
			{
				if(i%2==0)
				{
					sum = sum + i;		
				}
				i++;
			}
			return sum;
		}	
}	
 */
/* java sumofallevennaturalnumton_7.java
enter value of n
4
sum of all even number of 1 to 4 is 6 */
	

