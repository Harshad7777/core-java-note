/*
Q17. Write a java program to find all factors of a number.
*/

import java.util.*;
public class factorsofnumber_17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the positive number:");
		int num = sc.nextInt();
		
		int factor = 1;
		
		System.out.println("the factor of "+ num +" are: ");
			
		while(num >= factor)
		{	
			if(num % factor == 0)
			{
				System.out.println( factor +"");
			}
			factor++;
		}
	}
}


/* >javac factorsofnumber17.java
>java factorsofnumber17
enter the positive number:
10
the factor of 10 are:
1
2
5
10 */

/*Q17. Write a java program to find all factors of a number.*/

import java.util.*;
public class Example17
{
 public static void main(String x[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number: ");
  
  int n = sc.nextInt();//6

  for(int i=1; i<n; i++)
  {
	  if(n%i==0)
		  System.out.print(i+" ");	  
  }
 }
}