/*
 
Q31. Write a java program to display 1 to nth Duck Number.

 */


import java.util.*;
public class Example31
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n = sc.nextInt();
		
		boolean flag=false;
		
		for(int i=1; i<=n; i++)
		{
			int n1=i;
			while(n1!=0)
			{
				if(n1%10==0)
				{	
					flag=true;
					break;
				}
				n1=n1/10;
				
			}
			if(flag)
			{
				System.out.println(i);
				flag = false;
			}
		}	
	}
}
/* 
>java DuckNumber1tonth31.java
enter number
100
10,20,30,40,50,60,70,80,90,100, */