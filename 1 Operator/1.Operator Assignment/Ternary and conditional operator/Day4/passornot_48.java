/*
Q48. Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.
*/

import java.util.*;
public class passornot_48
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter students score");
		int Score = sc.nextInt();
		
		
		if(Score>=40)
		{
			System.out.println("student pass in exam");
		}
		else 
		{
			System.out.println( "student fail in exam");
		}	
	}
}
/* 
>javac passornot.java
>java passornot
enter students score
34
student fail in exam

>java passornot
enter students score
40

 */