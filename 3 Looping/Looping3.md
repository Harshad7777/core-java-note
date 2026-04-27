LOOP in Java
--------------------------------------------------------------------
Q. What is a Loop?
--------------------------------------------------------------------
A loop is used when we want to perform a task repeatedly until a specific condition is satisfied.

Example (Concept):

If we want to print “Good Morning” 100 times, writing System.out.println() 100 times is not practical.
Instead, we use a loop to repeat the statement automatically.
--------------------------------------------------------------------
Types of Loops
--------------------------------------------------------------------
1️⃣ Entry Control Loop
--------------------------------------------------------------------
The condition is checked first.
If the condition is true, the loop body executes.
If false, the loop body is skipped.

Types of Entry Control Loop:
1. while
2. for
3. Nested Loop
--------------------------------------------------------------------
1️⃣ While Loop
--------------------------------------------------------------------
Entry control loop
Condition is checked before execution

initialization;
while(condition) 
{
    // logic
    //increment and decrement

}

Example: 1

public class WLAPP
{
    public static void main(String x[])
    {
        int i;
        i=1; //initialization
        while(i<=5)  //condition
        {
            System.out.println("good morning");
            i++; //increment
        }
    }
}

Example 2: Print Table of a Number

import java.util.*;
public class TableAPP 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int no = sc.nextInt();

        int i = 1;
        while(i <= 10) 
        {
            System.out.println(no + " x " + i + " = " + (no * i));
            i++;
        }
    }
}

Example: WAP to input two values consider first value as base and second value as index and calculate its power

import java.util.*;
public class PAPP
{
    public static void main (String x[])
    {
        Scanner sc = new Scanner(System.in);

        int base, index, p=1;
        System.out.println("Enter base and Index");

        base = xyz.nextint();
        index = xyz.nextint();

        i=1;
        while(i<=index)
        {
            p=p*base;
            i++;
        }
        System.out.println("Power is "+p);  
    }
}

Example: WAP to input number and check number is perfect or not?
//6 = 1+2+3

import java.util.*;
public class PAPP
{
    public static void main (String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        int no, sum=0, i;
        System.out.println("Enter number");
        no = sc.nextInt();

        i = 1;
        while (i < no)
        {
            if (no % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        String msg = no == sum ? "Number is perfect" : "NO is not perfect";
        System.out.println(msg);  
    }
}

Example: WAP to input number and check number is duck or not 
1024 - duck
1234  - it is not duck number 

import java.util.*;
public class DAPP
{
    Public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int no, rem;

        System.out.println("Enter number from keybored");
        no = sc.nextInt();

        while(no!=0)
        {
            rem = no%10;
            no=no/10;

            if(rem == 0)
            {
                System.out.println("Number is Duck");
            }
            else
            {
                System.out.println("Number is not Duck");
            }
        }
    }
}

👉 This causes output like:

Number is not Duck
Number is not Duck
Number is Duck
Number is not Duck

❌ Why Your Output Is Wrong
if–else is inside while
Loop runs for every digit
Output prints multiple times

But we expect only ONE final result.
✔ Solution: Use a flag variable and print result after the loop.

Flag Variable Concept

Q. What is a Flag Variable?

A flag variable is a boolean variable (true/false) used to control decision making inside loops and avoid wrong or repeated output.

Why Flag Variable is Needed?
When if-else is used inside a loop, output may print multiple times.
Flag helps us decide final result once, outside the loop.

Steps to Use Flag Variable

1. Declare a boolean variable (flag)
2. Update it inside loop using a single if
3. Check the flag outside the loop

import java.util.*;
public class DAPP 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int no = sc.nextInt();

        boolean flag = false;

        while(no != 0) 
        {
            int rem = no % 10;
            if(rem == 0) 
            {
                flag = true;
            }
            no = no / 10;
        }

        if(flag)
            System.out.println("Number is Duck");
        else
            System.out.println("Number is Not Duck");
    }
}

Search Digit in a Number

import java.util.*;
public class SearchDigitAPP 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int no = sc.nextInt();

        System.out.println("Enter search key:");
        int skey = sc.nextInt();

        boolean flag = false;

        while(no != 0) 
        {
            int rem = no % 10;
            if(rem == skey) 
            {
                flag = true;
            }
            no = no / 10;
        }

        String msg = flag ? "Number found" : "Number not found";
        System.out.println(msg);
    }
}
-----------------------------------------------
2️⃣ For Loop
-----------------------------------------------
Entry control loop
Suitable when number of iterations is known

Syntax
for(initialization; condition; increment/decrement) 
{
    // statements
}
-----------------------------------------------
Different Valid Forms of for Loop
-----------------------------------------------
for(int i=1; i<=5; i++) { }

for(int i=1; i<=5; ) { i++; }

int i=1;
for(; i<=5; i++) { }


Example: Print “Good Morning”
public class FAPP 
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=5; i++) 
        {
            System.out.println("Good Morning");
        }
    }
}

Example: Strong Number
(A number whose sum of factorial of digits equals the number: 145 = 120+24+1) 

import java.util.*;
public class StrongApp
{
    public static void main(String x[])

    Scanner sc = new Scanner(System.in)
    System.out.println();

    int no = sc.nextInt();
    int temp = no, sum = 0;

    for(; no!=0; no = no/10)
    {
        int rem = no%10;
        int fact = 1;

        for(int i=rem; i>0; i--)
        {
            fact = fact * i;
        }
        sum = sum + fact;
    }
    System.out.println(temp == sum ? "Strong Number ": "Not Strong Number");
}

or

import java.util.Scanner;

public class StrongNumber 
{
    static int factorial(int n) 
    {
        int fact = 1;
        for(int i = 1; i <= n; i++) 
        {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while(num > 0) 
        {
            int digit = num % 10;
            sum = sum + factorial(digit);
            num = num / 10;
        }

        if(sum == temp) 
        {
            System.out.println("Strong Number");
        } 
        else 
        {
            System.out.println("Not Strong Number");
        }
    }
}

3️⃣ Nested Loop

Loop inside another loop
Used for tables, matrices, and patterns

Syntax
for() 
{
    for() 
    {
    }
}

Example: Nested Loop
public class NestedLoopAPP 
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=3; i++) 
        {
            for(int j=1; j<=3; j++) 
            {
                System.out.println("I =" + i + " J=" + j);
            }
            System.out.println();
        }
    }
}
output

I=1 J=1
I=1 J=2
I=1 J=3

I=2 J=1
I=2 J=2
I=2 J=3

I=3 J=1
I=3 J=2
I=3 J=3

Example : print all tables between 2 to 10

import java.util.*;
public class FAPP
{  
    public static void main(String x[])throws Exception 
   {    
    for(int i=1; i<=10; i++)
	   { 
        for(int j=2; j<=10; j++)
			{   
                System.out.print(i * j + "\t");
				Thread.sleep(200);
			}
			System.out.print("\n"); // manual new line
	   }
   }
}

output

2	3	4	5	6	7	8	9	10	
4	6	8	10	12	14	16	18	20	
6	9	12	15	18	21	24	27	30	
8	12	16	20	24	28	32	36	40	
10	15	20	25	30	35	40	45	50	
12	18	24	30	36	42	48	54	60	
14	21	28	35	42	49	56	63	70	
16	24	32	40	48	56	64	72	80	
18	27	36	45	54	63	72	81	90	
20	30	40	50	60	70	80	90	100	

Example: WAP to print the following pattern

import java.util.*;
public class FAPP
{  
    public static void main(String x[])throws Exception 
   {   
        for(i = 1; i <= 5; i++)
        {
            for(j = 1; j <= 5; j++)
            {
                System.out.print(j + "\t");
            }
            System.out.print("\n");
        }
   }
}

output

1	2	3	4	5
1	2	3	4	5
1	2	3	4	5
1	2	3	4	5
1	2	3	4	5


public class MAPP
{
    public static void main(String x[])
    {
        int i, j;
        for(i = 1; i <= 5; i++)
        {
            for(j = 1; j <= 5; j++)
            {
                if(i >= j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

✅ Output Produced
*
**
***
****
*****

Example with source code

public class MAPP
{
    public static void main(String x[])
	{
         int i,j;
		for(i=1; i<=5; i++)
		{
		    for(j=1; j<=5; j++)
			{
			    if(i<=j)
				{ 
                    System.out.print("*");
				}
				else
				{ 
                    System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

✅ Output Produced
*****
 ****
  ***
   **
    *

Example: WAP to print the following pattern?
public class MAPP
{
    public static void main(String x[])
	{     
        int i,j;
		for(i=1; i<=5; i++)
		{
		    for(j=1; j<=5; j++)
			{
			    if(i==j || j==6-i)
				{ 
                    System.out.print("*");
				}
				else
				{ 
                    System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}

✅ Output Produced
*   *
 * *
  *
 * *
*   *

Example: WAP to print the following pattern?

public class P4
{
    public static void main(String x[])
    {
        for(int i = 1; i <= 9; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                   String star =
                   ((j >= i && i <= 5) || (j <= 10 - i && i > 5))
                   ? "*"
                   : " ";
                System.out.print(star);
            }
            System.out.print("\n");
        }
    }
}

output

*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****


public class P4
{
    public static void main(String x[])
    {
        for(int i = 1; i <= 9; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                String star =
                    ((i >= j && i <= 5) || (j <= 10 - i && i > 5))
                    ? "*"
                    : " ";

                System.out.print(star);
            }
            System.out.print("\n");
        }
    }
}

*
**
***
****
*****
****
***
**
*

public class P4
{
    public static void main(String x[])
    {
        for(int i = 1; i <= 9; i++)
        {
            for(int j = 1; j <= 10; j++)
            {
                if ( ((i >= j || j >= 11 - i) && i <= 5)
                  || ((j <= 10 - i || j >= i + 1) && i > 5) )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *

public class P7
{  public static void main(String x[])
   {
      int i,j;
	  for(i=1; i<=5; i++)
	  {   
         boolean flag=true;
	     for(j=1; j<=9; j++)
		 {
		     if(j>=6-i && j<=4+i  && flag)
			 { 
               System.out.printf("*");
		       flag=false;
			 }
			 else
			 { 
               System.out.printf(" ");
		       flag=true;
			 }
		 }
		 System.out.printf("\n");
	  }
   
   }
}

    *    
   * *   
  * * *  
 * * * * 
* * * * *

Example : WAP to print the following pattern?

public class P7
{  public static void main(String x[])
   {
      int i,j;
	  for(i=1; i<=9; i++)
	  {   
        for(j=1; j<=9; j++)
		 {  
             if(((j<=6-i || j>=4+i) && i<=5) ||((j<=i-4 || j>=14-i) &&i>5) )
			 { 
                System.out.printf("*");     
			 }
			  
			 else
			 { 
                System.out.printf(" ");
			 }
		 }
		 System.out.printf("\n");
	  }
   }
}

*********
**** ****
***   ***
**     **
*       *
**     **
***   ***
**** ****
*********

Example: WAP to print the following pattern?

for(int i = 1; i <= 5; i++) 
{
    int count = i;
    for(int j = 1; j <= 9; j++) 
    {
        if(j >= 6 - i && j <= 4 + i) 
        {
            System.out.printf("%d", count);
            if(i < 5) 
            {
                ++count;
            } 
            else 
            {
                --count;
            }
        } 
        else 
        {
            System.out.print(" ");
        }
    }
    System.out.print("\n");
}
Example: WAP to print the following pattern?
public class P8
{
    public static void main(String x[])
    {
         for(int i = 1; i <= 5; i++)            // Rows
        {       
            int count = 1;                     // Start count from 1 for each row
            for(int j = 1; j <= 9; j++)        // Columns
            {    
                if(j >= 6 - i && j <= 4 + i)   // Pyramid boundaries
                {   
                    System.out.printf("%2d", count);  
                    if(i < 5) 
                    {                  // For rows 1-4, increment count
                        ++count;
                    }
                    else 
                    {                      // For last row, decrement count (optional tweak)
                        --count;
                    }
                } 
            }
            System.out.print("\n");              // Next row
        }
    }
}

 1
 1 2 3
 1 2 3 4 5
 1 2 3 4 5 6 7
 1 0-1-2-3-4-5-6-7



--------------------------------------------------------------------
2️⃣ Exit Control Loop
--------------------------------------------------------------------
The loop body executes at least once.
Condition is checked after execution.

Type:
1. do-while

4️⃣ Do-While Loop

Exit control loop
Executes at least once, even if condition is false

do 
{
    // statements
} 
while(condition);


public class DOAPP 
{
    public static void main(String[] args) 
    {
        int i = 1;
        do 
        {
            System.out.println("Good Morning");
            i++;
        } 
        while(i < 0);
    }
}

--------------------------------------------------------------------
Important Components of Any Loop
Every loop consists of three essential parts:

Initialization
→ Starting point of the loop
Example: int i = 1;

Condition
→ Determines how many times the loop runs
Example: i <= 5

Increment / Decrement
→ Step or gap between iterations
Example: i++, i--
--------------------------------------------------------------------