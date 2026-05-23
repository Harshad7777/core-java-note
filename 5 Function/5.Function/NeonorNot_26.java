/*
Q26. Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
*/
// num = 9
// sqar = 9*9=81 
// sqar digits addition = 8+1 =9
//num = sqar digits addition 9=9
//true neon number 

import java.util.*;
public class NeonorNot_26
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt(); //9
		
		NeonorNo(num);
	}
	public static void NeonorNo(int num)
	{
		int square = num * num; //9*9=81
		
		int sum = 0;
		
		while(square>0)
		{
			sum += square %10; //1,8
			square/=10; //8,0
		}
		
		if(sum==num)
		{
			System.out.println(num+" number is neon");
		}
		else
		{
			System.out.println(num+" number is not neon ");
		}
	}
}


/* >javac NeonorNot26.java
>java NeonorNot26
enter number
9
9 number is neon */

