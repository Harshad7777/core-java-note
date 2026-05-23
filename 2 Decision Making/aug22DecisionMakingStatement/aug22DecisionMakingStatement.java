// Code Chef Practice Assignment

// Problem Statement First 

// The chef has to travel to another place. For this, he can avail any one of two cab services.
// •	The first cab service charges XX rupees.
// •	The second cab service charges YY rupees.
// The chef wants to spend the minimum amount of money. Which cab service should Chef take?
// Input Format
// •	The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
// Output Format
// For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.
// You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).
// Constraints
// 1<=T<=100
// 1<X<Y<=100
// Sample 1:
// Input	Output:
// 3
// 30 65        First 
// 42 42        Any
// 90  50        Second
// Explanation:
// Test case 11: The first cab service is cheaper than the second cab service.
// Test case 22: Both the cab services have the same price.
// Test case 33: The second cab service is cheaper than the first cab service.

//-------------1 code--------------------------------------------------------------------/

// import java.util.*;

// public class aug22DecisionMakingStatement {
//     public static void main(String x[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter first cab service charges (XX rupees): ");
//         int firstCab = sc.nextInt();

//         System.out.println("Enter second cab service charges (YY rupees): ");
//         int secondCab = sc.nextInt();

//         if (firstCab < secondCab) 
//         {
//             System.out.println("The first cab service is cheaper than the second cab service.");
//         } 
//         else if (firstCab > secondCab) 
//         {
//             System.out.println("The second cab service is cheaper than the first cab service.");
//         } 
//         else 
//         {
//             System.out.println("Both cab services have the same charges.");
//         }

      
//     }
// }

//-------------1  output -------------------------------------------------------------------//

// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement                            
// Enter first cab service charges (XX rupees): 
// 100
// Enter second cab service charges (YY rupees): 
// 50 
// The second cab service is cheaper than the first cab service.

// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// Enter first cab service charges (XX rupees): 
// 50
// Enter second cab service charges (YY rupees): 
// 100
// The first cab service is cheaper than the second cab service.

// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// Enter first cab service charges (XX rupees): 
// 100
// Enter second cab service charges (YY rupees): 
// 100
// Both cab services have the same charges.


//--------------------------2 problem---------------------------/

// Problem Statement Second

// Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote increases the volume by 1 while pressing the volume down button decreases the volume by 1. Chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.
// Input Format
// •	The first line contains a single integer TT - the number of test cases. Then the test cases follow.
// •	The first and only line of each test case contains two integers XX and YY - the initial volume and final volume of the TV.
// •	
// Output Format
// For each test case, output the minimum number of times Chef has to press a button to change the volume from XX to YY.
// Constraints 
// 1<=T <=100
// 1<=X<=Y<=100

// Sample1

// Input		Output
// 2
// 50 54 		4
// 12 10		2

// Explanation:
// Test Case 1: Chef can press the volume up button 4 times to increase the volume from 50 to 54.
// Test Case 2: Chef can press the volume down button  2 times to decrease the volume from 12 to 10.

//------------------------------2code----------------------------------------------------//

// import java.util.*;

// public class aug22DecisionMakingStatement 
// {
//     public static void main(String x[]) 
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Chef can press the volume up button ");
//         int up = sc.nextInt();

//         System.out.println("Chef can press the volume down button  ");
//         int down = sc.nextInt();


//         int vol = up-down;
//         int dec = down-up;

//         if (vol > dec) 
//         {
//             System.out.println("Chef can press the volume down button " + vol + " times to decrease the volume.");
//         } 
//         else 
//         {
//             System.out.println("Chef can press the volume up button " + dec + " times to increase the volume.");
//         } 
//     }
// }

//-----------------------------------2output------------------------------------------------//

// PS C:\Users\harsh\Downloads\java course notes\java> javac aug22DecisionMakingStatement.java    
// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// Chef can press the volume up button
// 50
// Chef can press the volume down button
// 54
// Chef can press the volume up button 4 times to increase the volume.

// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// Chef can press the volume up button
// 12
// Chef can press the volume down button  
// 10
// Chef can press the volume down button 2 times to decrease the volume.

//--------------------------------------------3problem-------------------------------------//

// Problem Statement 3
// Problem
// Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
// Calculate Pooja's account balance after an attempted transaction.
// Input
// Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
// Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
// Output
// Output the account balance after the attempted transaction, given as a number with two digits of precision. If there is not enough money in the account to complete the transaction, output the current bank balance.
// Example - Successful Transaction
// Input:
// 30 120.00
// Output:
// 89.50
// Example - Incorrect Withdrawal Amount (not multiple of 5)
// Input:
// 42 120.00
// Output:
// 120.00
// Example - Insufficient Funds
// Input:
// 300 120.00
// Output:
// 120.00

//--------------------------------3 code-----------------------------------------//

// import java.util.Scanner;

// public class aug22DecisionMakingStatement 
// {
//     public static void main(String x[]) 
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter account balance");
//         double balance = sc.nextDouble();

//         System.out.println("enter withdrawal amount ");
//         double withdraw = sc.nextDouble();

//         double newBalance = (balance - withdraw)-0.50;

//         if(withdraw % 5 == 0 && newBalance >= 0)
//         {
//             System.out.println("Successful Transaction "+newBalance);
//         }

//         else if(withdraw % 5 !=0)
//         {
//             System.out.println("Incorrect Withdrawal Amount (not multiple of 5)" +balance);
//         } 

//         else
//         {
//             System.out.println("Insufficient Funds "+balance);


//         }
//     }
// }

// //--------------------------3 output---------------------------------------------------//

// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// enter account balance
// 120
// enter withdrawal amount 
// 30
// Successful Transaction89.5

// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// enter account balance
// 120
// enter withdrawal amount 
// 42
// Incorrect Withdrawal Amount (not multiple of 5)

// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// enter account balance
// 120
// enter withdrawal amount 
// 300
// Insufficient Funds


//------------------------------------4 problem------------------------------------------//

// Example4
// Problem
// Ezio can manipulate at most XX number of guards with the apple of Eden.
// Given that there are YY number of guards, predict if he can safely manipulate all of them.
// Input Format
// First line will contain TT, number of test cases. Then the test cases follow.
// Each test case contains of a single line of input, two integers XX and YY.
// Output Format
// For each test case, print text {YES} YES if it is possible for Ezio to manipulate all the guards. Otherwise, print  text {NO} NO.

// You may print each character of the string in uppercase or lowercase 
// (For example, the strings text {Yes} YeS, text {yEs} yEs, \text {yes}yes and \text {YES}YES will all be treated as identical).

// Constraints
// 1<=T<=100
// 1<=X<=Y

// Sample1
// _______________
// Input				Output
//  3
// 5    7				NO
// 6    6				YES
// 9    1				YES

// Explanation:
// Test Case 11: Ezio can manipulate at most 55 guards. Since there are 77 guards, he cannot manipulate all of them.

// Test Case 22: Ezio can manipulate at most 66 guards. Since there are 66 guards, he can manipulate all of them.

// Test Case 33: Ezio can manipulate at most 99 guards. Since there is only 11 guard, he can manipulate the guard.

//---------------------------4 code ----------------------------------------------------------//

// import java.util.Scanner;

// public class aug22DecisionMakingStatement 
// {
//     public static void main(String x[]) 
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("XX number of guards");
//         double xx = sc.nextDouble();

//         System.out.println("YY number of guard");
//         double yy = sc.nextDouble();

//         if (xx >= yy ) 
//         {
//             System.out.println("YES");
//         } 
//         else 
//         {
//             System.out.println("NO");
//         }
//     }
// }

//___________________4 output------------------------------------------------------//

// PS C:\Users\harsh\Downloads\java course notes\java> javac aug22DecisionMakingStatement.java
// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement      
// XX number of guards
// 5
// YY number of guard
// 7
// NO

// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// XX number of guards
// 6
// YY number of guard
// 6
// YES

// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// XX number of guards
// 9
// YY number of guard
// 1
// YES

//-----------------------5 problem------------------------------------------------//

// Assignment5

// Problem
// To access CRED programs, one needs to have a credit score of 750750 or more.
// Given that the present credit score is XX, determine if one can access CRED programs or not.
// If it is possible to access CRED programs, output \text{YES}YES, otherwise output \text{NO}NO.
// Input Format
// The first and only line of input contains a single integer XX, the credit score.
// Output Format
// Print text{YES}YES if it is possible to access CRED programs. Otherwise, print \text{NO}NO.
// You may print each character of the string in uppercase or lowercase (for example, the strings text{YeS}YeS, \texttt{yEs}yEs, \texttt{yes}yes and \texttt{YES}YES will all be treated as identical).

// Constraints
// 0<=X<=1000

// Subtasks
// •	Subtask 1 (100 points): Original constraints.
// Sample1
// Input					Output
// 823					YES

// Explanation:
// Since 823 > 750 , it is possible to access CRED programs.

// Sample2
// Input					Output
// 251					No

// Explanation
// Since 251 < 750	  it is not possible to access CRED Programs

//-------------------------5 code --------------------------------------------------------------//

// import java.util.Scanner;

// public class aug22DecisionMakingStatement 
// {
//     public static void main(String x[]) 
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter your credit score:");
//         double creditScore = sc.nextDouble();

//         if (creditScore >= 750) 
//         {
//             System.out.println("YES");
//         } 
//         else 
//         {
//             System.out.println("NO");
//         }
//     }
// }

//___________________5 output--------------------------------------------------//

// PS C:\Users\harsh\Downloads\java course notes\java> javac aug22DecisionMakingStatement.java
// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// Enter your credit score:
// 823
// YES

// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// Enter your credit score:
// 251
// NO

//---------------------------------------------- 6 problem ------------------------------------------------//
// Assignment 6
// Problem
// There is a group of NN friends who wish to enroll in a course together. The course has a maximum capacity of MM students that can register for it. If there are KK other students who have already enrolled in the course, determine if it will still be possible for all the NN friends to do so or not.
// Input Format
// •	The first line contains a single integer TT - the number of test cases. Then the test cases follow.
// •	Each test case consists of a single line containing three integers NN, MM and KK - the size of the friend group, the capacity of the course and the number of students already registered for the course.
// •	Output Format
// •	For each test case, output Yes if it will be possible for all the NN friends to register for the course. Otherwise output No.
// •	You may print each character of Yes and No in uppercase or lowercase (for example, yes, yEs, YES will be considered identical).

// Constraints
// 1<=N<=M <=100
// 0<=K<=M
// Sample1
// Input				Output
// 2	50	27		Yes	
// 5	40	38		NO
// 100	100	0		Yes

// Explanation:
// Test Case 1: The 22 friends can enroll in the course as it has enough seats to accommodate them and the  27  other students at the same time.

// Test Case 2: The course does not have enough seats to accommodate the 55 friends and the 3838 other students at the same time.

//-------------------------------6 code --------------------------//
// import java.util.*;
// public class aug22DecisionMakingStatement 
// {
//     public static void main(String x[])
//     {
//         Scanner sc = new Scanner(System.in);        
//         System.out.println("enter students already registered for the course.");
//         int Ae = sc.nextInt();

//         System.out.println("enter capacity of the course");
//         int c = sc.nextInt();

//         System.out.println("enter friends who want to enroll in the course");
//         int We = sc.nextInt();

//           if(c>=Ae+We)
//           {
//             System.out.println("yes");
//           }
//           else
//           {
//               System.out.println("no");
//           }
//     }
// }
//------------------------- 6output------------------------//
// PS C:\Users\harsh\Downloads\java course notes\java> javac aug22DecisionMakingStatement.java
// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// enter students already registered for the course.      
// 2
// enter capacity of the course
// 50
// enter friends who want to enroll in the course
// 27
// yes


// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// enter students already registered for the course.
// 5
// enter capacity of the course
// 40
// enter friends who want to enroll in the course
// no


// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// enter students already registered for the course.
// 100
// enter capacity of the course
// 100
// enter friends who want to enroll in the course
// 0
// yes


// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// enter students already registered for the course.
// 5
// enter capacity of the course
// 40
// enter friends who want to enroll in the course
// 38
// no


// PS C:\Users\harsh\Downloads\java course notes\java> java aug22DecisionMakingStatement
// enter students already registered for the course.
// 100
// enter capacity of the course
// 100
// enter friends who want to enroll in the course
// 0
// yes

//-----------------------7 problem --------------------//
// Assignment 7

// A study has shown that playing a musical instrument helps in increasing one's IQ by 77 points. Chef knows he can't beat Einstein in physics, but he wants to try to beat him in an IQ competition.
// You know that Einstein had an IQ of 170170, and Chef currently has an IQ of XX.
// Determine if, after learning to play a musical instrument, Chef's IQ will become strictly greater than Einstein's.
// Print "Yes" if it is possible for Chef to beat Einstein, else print "No" (without quotes).
// You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).
// Input Format
// •	The first and only line of input will contain a single integer XX, the current IQ of Chef.

// Output Format
// •	For each testcase, output in a single line "Yes" or "No"
// •	You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).

// Constraints
// 100<=X<=169

// Sample1
// Input			Output
// 165			Yes

// Explanation
// After learning a musical instrument, Chef's final IQ will be 165+7=172. Since 172 >= 170 Chef can beat Einstein.
// Sample2
// Input			Output
// 120			No

// Explanation:
// After learning a musical instrument, Chef's final IQ will be 120+7=127120+7=127. Since 127    127<170, Chef cannot beat Einstein

//--------------------------7 code-------------------------//

// import java.util.Scanner;
// public class aug22DecisionMakingStatement 
// {
//     public static void main(String x1[]) 
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter iq of chefs");
//         int x = sc.nextInt();

//         if(x+7>170)
//         {
//             System.out.println("yes");
//         }

//         else
//         {
//             System.out.println("no");
//         }
//     }
// }

//------------------------------7output--------------------------------//
// C:\Program Files\Java\jdk-24\bin>javac aug22DecisionMakingStatement.java

// C:\Program Files\Java\jdk-24\bin>java aug22DecisionMakingStatement
// enter iq of chefs
// 165
// yes

// C:\Program Files\Java\jdk-24\bin>java aug22DecisionMakingStatement
// enter iq of chefs
// 120
// no

//----------------------------------second set ---------------------------//
// Second Set
// Example1

// Write a java program to check whether an alphabet is vowel or consonant using if else. How to check vowels and consonants using if else in java programming. Java Program to input a character from user and check whether it is vowel or consonant. Logic to check vowel or consonant in java programming.
// Example
// Input
// Input character: a
// Output
// 'a' is vowel


//-----------------------------------1code-----------------------------//

// import java.util.*;
// public class Aug22DecisionMakingStatement
// {
//     public static void main (String x[])
//     {
//         Scanner sc = new Scanner (System.in);
		
// 		System.out.println("enter the character");
		
// 		char ch = sc.next().charAt(0);
		
// 		if( ch=='a' |ch=='e'| ch=='i'| ch=='o' |ch=='u'|
// 			ch=='A' |ch=='e'| ch=='i'| ch=='O' |ch=='u')
// 		{
// 			System.out.println("'"+ch+"'is vowel");
// 		}
// 		else
// 		{
// 			System.out.println("'"+ch+"'is vowel");
// 		}
// }
// }

//------------------------------------1output-----------------------------//

// C:\Program Files\Java\jdk-24\bin>javac Aug22DecisionMakingStatement.java

// C:\Program Files\Java\jdk-24\bin>java Aug22DecisionMakingStatement
// enter the character
// a
// 'a'is vowel
//----------------------------------2 problem ---------------------------//
Example2
Write a C program to check whether a triangle is valid or not if angles are given using if else. How to check whether a triangle can be formed or not, if its angles are given using if else in C programming. Logic to check triangle validity if angles are given in C program.
Example
Input 
Input first angle: 60
Input second angle: 30
Input third angle: 90
Output
The triangle is valid

//-----------------------------------2code-----------------------------//
import java.util.*;
public class Aug22DecisionMakingStatement
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter first angle = ");
		int A = sc.nextInt();
		
		System.out.println("enter second angle = ");
		int B = sc.nextInt();
		
		System.out.println("enter third angle = ");
		int C = sc.nextInt();
		
		if(A+B+C==180)
		{
			System.out.println("The triangle is valid");
		}
		else
		{
			System.out.println("The triangle is not valid");
		}
	}
}
//------------------------------------2output-----------------------------//


C:\Program Files\Java\jdk-24\bin>javac Aug22DecisionMakingStatement.java

C:\Program Files\Java\jdk-24\bin>java Aug22DecisionMakingStatement
enter first angle =
60
enter second angle =
30
enter third angle =
90
The triangle is valid

//----------------------------------3problem ---------------------------//
//-----------------------------------3code-----------------------------//
//------------------------------------3output-----------------------------//

//----------------------------------4problem ---------------------------//
//-----------------------------------4code-----------------------------//
//------------------------------------4output-----------------------------//

//----------------------------------5problem ---------------------------//
//-----------------------------------5code-----------------------------//
//------------------------------------5output-----------------------------//


//----------------------------------6problem ---------------------------//
//-----------------------------------6code-----------------------------//
//------------------------------------6output-----------------------------//

//----------------------------------7problem ---------------------------//
//-----------------------------------7code-----------------------------//
//------------------------------------7output-----------------------------//

//----------------------------------8problem ---------------------------//
//-----------------------------------8code-----------------------------//
//------------------------------------8output-----------------------------//

//----------------------------------9problem ---------------------------//
//-----------------------------------9code-----------------------------//
//------------------------------------9output-----------------------------//

//----------------------------------10problem ---------------------------//
//-----------------------------------10code-----------------------------//
//------------------------------------10output -----------------------------//

//----------------------------------11problem ---------------------------//
// Example11
// An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
// •	1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
// •	2nd data, Total number of wheels = W
// The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
// Example :
// Input :
// •	200  -> Value of V
// •	540   -> Value of W
// Output :
// •	TW =130 FW=70 
// Explanation:
// 130+70 = 200 vehicles
// (70*4)+(130*2)= 540 wheels
// Constraints :
// •	2<=W
// •	W%2=0
// •	V<W
// Print “INVALID INPUT” , if inputs did not meet the constraints.
// The input format for testing 
// The candidate has to write the code to accept two positive numbers separated by a new line.
// •	First Input line – Accept value of V.
// •	Second Input line- Accept value for W.

//-----------------------------------11code-----------------------------//


// import java.util.*;
// public class aug22DecisionMakingStatement
// {
//     public static void main (String x[])
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter value of v");
//         int V =sc.nextInt();

//         System.out.println("enter value of w");
//         int W = sc.nextInt();

//        if(2<=W && W%2==0 && V<W)
//         {
// 			int f = W/2 -V;
//             int t = V-f;
//             System.out.println("total two wheelers = "+t);
//             System.out.println("total four wheelers ="+f);
//         }
//         else
//         {
//           System.out.println("INVALID INPUT");

//         };
//     }
// }

// C:\Program Files\Java\jdk-24\bin>javac aug22DecisionMakingStatement.java

// C:\Program Files\Java\jdk-24\bin>java aug22DecisionMakingStatement
// enter value of v
// 200
// enter value of w
// 540
// total two wheelers = 130
// total four wheelers =70

// C:\Program Files\Java\jdk-24\bin>java aug22DecisionMakingStatement
// enter value of v
// 199
// enter value of w
// 541
// INVALID INPUT
//------------------------------------11output-----------------------------//

//----------------------------------12problem ---------------------------//
//-----------------------------------12code-----------------------------//
//------------------------------------12output-----------------------------//

//----------------------------------13problem ---------------------------//
//-----------------------------------13code-----------------------------//
//------------------------------------13output-----------------------------//

//----------------------------------14problem ---------------------------//
//-----------------------------------14code-----------------------------//
//------------------------------------14output-----------------------------//

//----------------------------------15problem ---------------------------//
//-----------------------------------15code-----------------------------//
//------------------------------------15output-----------------------------//






