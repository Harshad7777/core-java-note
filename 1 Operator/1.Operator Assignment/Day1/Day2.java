
// Q8. Write a java program to calculate the compound intrest.

import java.util.Scanner;


public class Day2 
{
	public static void main(String x[]) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the amount:");
		double PrincipalAmount = sc.nextDouble();

		System.out.println("enter the intrest:");
		double Intrest = sc.nextDouble();

		System.out.println("enter time:");
		double Time = sc.nextDouble();

		double calculatethesimpleintrest = (PrincipalAmount * Intrest * Time) / 100;

		double Amount = PrincipalAmount * Math.pow((1 + Intrest / 100), Time);
		double compundInterest = Amount - PrincipalAmount;

		System.out.println("simpleintrest is a:" + calculatethesimpleintrest);
		System.out.println("compundInterest is a:" + compundInterest);

	}
}

// 	PS C:\Users\harsh\Downloads\
// 	java course notes\java\
// 	Operator Assignment>
// 	javac Day2.java        
// PS C:\Users\harsh\Downloads\
// 	java course notes\java\
// 	Operator Assignment>
// 	java Day2
// 	enter the amount:10000
//  enter the intrest:12
// 	enter time:4
// 	simpleintrest is a:4800.0
// 	compundInterest is a:5735.193600000006




