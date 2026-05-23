/*
Q24. Write a java program to Check Number Is Strong Number or Not.
Example : A strong number is one in which the factorial sum of the digits equals the number itself. 1, 2, 145,
*/


import java.util.*;
public class strongNumberorNot_24
{
	 public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" enter number");
		int num = sc.nextInt(); //145
		
		Strongnumber(num);
	}
	public static void Strongnumber(int num)
	{
		int sum=0;

		int temp = num;
		
		while(num!=0)
		{	
			int rem = num % 10; //5
			int f = 1;
			while(rem!=0)
			{
			    f=f*rem;
				/* factorial(5) → 5 × 4 × 3 × 2 × 1 = 120 */
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
			System.out.print
			ln(temp + " it is a not strong number");
		}
		
	}	
}		

/* 145 → 1! + 4! + 5! = 1 + 24 + 120 = 145 ✅
123 → 1! + 2! + 3! = 9 ≠ 123 ❌ */
 

/*
>javac StrongNumberorNot24.java

>java StrongNumberorNot24
 enter number
145
145 it is a  strong number

*/
