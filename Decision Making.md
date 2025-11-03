🔹 Decision-Making Statements in Java

Decision-making statements are used in Java to perform different actions based on conditions. They allow programs to follow conditional logic, i.e., to make decisions depending on certain conditions being true or false.

🔹 Why not just use the conditional (ternary) operator?

The conditional (ternary) operator ?: can be used for simple, single-line decisions:

🔹Simple if condition 
________________________________________________________________
If we think about simple if statement we write if without else or else  if

🔹 If else : if else statement is used for when we have condition and condition is exactly opposite of each other then we can use if else statement

🔹Q. What is ASCII Code?

ASCII stands for American Standard Code for Information Interchange.
It is a character encoding standard that assigns a unique number (decimal) to every character, symbol, and control key on the keyboard.

Computers store characters internally as numbers, and ASCII is one standard that defines which number corresponds to which character.

There are 256 ASCII codes in total (0–255).
| Characters         | ASCII Range (Decimal)                |
| ------------------ | ------------------------------------ |
| Uppercase letters  | A = 65 → Z = 90                      |
| Lowercase letters  | a = 97 → z = 122                     |
| Digits             | 0 = 48 → 9 = 57                      |
| Control characters | 0 → 31 (like newline, tab)           |
| Special symbols    | 32 → 47, 58 → 64, 91 → 96, 123 → 126 |
char ch = 'A';
int ascii = (int) ch; // typecasting char to int
System.out.println("ASCII of " + ch + " = " + ascii);
🔹 Else if ladder statement
🔹 Else if ladder means when we have multiple conditions and every condition want to execute as independent condition then we can use else if ladder
🔹import java.util.*;
public class AAPP
{   public static void main(String x[])
	{    Scanner xyz  = new Scanner(System.in);
		 System.out.println("Enter three values");
		 int a=xyz.nextInt();
		 int b=xyz.nextInt();
		 int c=xyz.nextInt();
		 
		 if(a>b && a>c)
		 { System.out.println("A is Greater");
		 }
		 else if(b>a && b>c)
		 { System.out.println("B is Greater");
		 }
		 else{
			  System.out.println("C is Greater");
		 }
		 
	}
}
🔹 Nested if statement 
_______________________________________________________________
Nested if statement means if within if called as nested if statement

🔹import java.util.*;
public class NIFAPP
{  public static void main(String x[])
   {  Scanner xyz=  new Scanner(System.in);
      int id,score;
	  System.out.println("Enter the id of student");
	  id=xyz.nextInt();
	  if(id>=1 && id<=100)
	  { System.out.println("Enter score");
	     score=xyz.nextInt();
		 if(score>70)
		 { System.out.println("Eligible for price");
		 }
		 else{
		   System.out.println("eligible for certificate");
		 }
	  }
	  else
	  { System.out.println("You are not registered candidate");
	  }
   }
}
🔹Switch statement 
______________________________________________________
Switch statement is used  for create  menu driven application or choice based application

🔹Example with source code

import java.util.*;
public class SWAPP
{   public static void main(String x[])
	{   Scanner xyz = new Scanner(System.in);
	    int choice,a,b;
		System.out.println("1:Addition");
		System.out.println("2:Multiplication");
		System.out.println("Enter two values");
		a=xyz.nextInt();//10
		b=xyz.nextInt(); //20
		System.out.println("Enter your choice");
		choice=xyz.nextInt(); //2
		switch(choice) //switch(3)
		{
		   case 1:
		    System.out.printf("Addition is %d\n",a+b);
		   break;
		   case 2:
		       System.out.printf("Multiplication is %d\n",a*b);
		   break;
		   default:
		   System.out.println("Wrong choice");
		}
	}
}

🔹 Q. What is LOOP?

🔹 Loop means if we want to perform some task repeatedly, it is called a loop.

Example: we want to good morning message 100 times need to write 100 printf 
So better way you can use single printf 100 times and for that we can use looping statement

🔹 There are two types of loop
___________________________________________________________
Entry control loop : entry control loop means a loop first checks the condition and after that decides whether the loop will be executed or not called as entry control loop.
  
There are two types of entry control loop
While 	
For 

Exit control loop : exit control loop means first execute the loop and after that check the condition called exit control loop.
Do while loop