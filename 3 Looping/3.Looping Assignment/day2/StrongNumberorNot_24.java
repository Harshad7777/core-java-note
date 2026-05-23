/*
Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial sum of the digits equals the number itself. 1, 2, 145,
1, 2, 145,
//1!=1*1=1, 2!=2*1=2,3!=3*2*1!=6,
145!=1+4*3*2+5*4*3*2=1+24+120=145
*/


import java.util.*;
public class StrongNumberorNot_24
{
	 public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" enter number");
		
		int sum=0;
		
		int num = sc.nextInt(); //145
		int temp = num;
		
		while(num! = 0)
		{	
			int rem = num % 10; //5
			
			int f = 1;
			while(rem!=0)
			{
			    f=f*rem;
				rem--;
			}
			
			sum+=f;
		
			num/=10;
			
		}
		if(sum==temp)
		{
			System.out.println(temp +" it is a strong number");
		}
		else
		{
			System.out.println(temp + " it is a not strong number");
		}
		
	}	
}		


/*
>javac StrongNumberorNot24.java

>java StrongNumberorNot24
 enter number
145
145 it is a  strong number

*/
			
			
			