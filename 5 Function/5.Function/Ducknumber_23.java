/* Q23. Write a java program to Check Number Is Duck Number or Not.

Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers */


import java.util.*;
public class Ducknumber_23
{
	 public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println(" enter duck number contain at lest one zero");
		int num = sc.nextInt(); //1021
		
		ducknumber(num);
	}
	public static void ducknumber(int num)
	{
		boolean flage = false;
		int rem = 0;
		
	
		int temp = num;
		
		while(num!=0)
		{
			rem = num%10;  // 1,2,0true,1,0;
			num = num/10;  //102,10,1,0;
			
			if(rem ==0) //0==come flag become true
			{
				flage = true;
				
			}
		}
			num = temp;
			if(flage)    //flag true print first condition
				{
					System.out.println(num+ " is a duck number");
				}
			else
				{
					System.out.println(num+" is a not duck number");
				}
		
	}
}

/*
>javac ducknumber23.java
>java ducknumber23
 enter duck number contain at lest one zero
1021
1021 is a duck number

*/

