Decision Making Statements in Java
------------------------------------------------------------------
Q. What is a Decision Making Statement?
------------------------------------------------------------------

A decision making statement allows a program to take decisions based on certain conditions. These statements help the program to execute different code blocks depending on whether a condition is true or false.

🔹 Conditional operators (like ?:) can handle only single-line logic.

🔹 For multiple lines of logic, decision making statements are used.
------------------------------------------------------------------
Types of Decision Making Statements
------------------------------------------------------------------
1. Si1mple if statement
2. If-else statement
3. Nested if statement
4. Else-if ladder
5. Switch statement
------------------------------------------------------------------
1️⃣ Simple if Statement
------------------------------------------------------------------
	The simplest form of decision making.
	Executes a block of code only if a condition is true.
	No else or else-if involved.

Example: Check if a number is even using simple if.

import java.util.*;
public class SimpleIfExample 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        if(num % 2 == 0) 
		{
            System.out.println("Number is EVEN");
        }
    }
}
------------------------------------------------------------------
2️⃣ If-Else Statement
------------------------------------------------------------------
Used when there are two opposite possibilities.
Executes one block if condition is true and another block if condition is false.

Example: Check if a number is even or odd.

import java.util.*;
public class EOAPP 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int no = sc.nextInt();

        if(no % 2 == 0) 
		{
            System.out.println("Number is EVEN");
        } 
		else 
		{
            System.out.println("Number is ODD");
        }
    }
}
------------------------------------------------------------------
Q. What is ASCII Code?
------------------------------------------------------------------
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
------------------------------------------------------------------
3️⃣ Else-If Ladder
------------------------------------------------------------------
	Used when there are multiple conditions.
	Executes the first true condition block and ignores the rest.

	Example: Find the greatest of three numbers.

import java.util.*;
public class AAPP 
{
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three values:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b && a > c) 
		{
            System.out.println("A is Greater");
        } 
		else if(b > a && b > c) 
		{
            System.out.println("B is Greater");
        } 
		else 
		{
            System.out.println("C is Greater");
        }
    }
}
------------------------------------------------------------------
4️⃣ Nested If Statement
------------------------------------------------------------------
	If inside another if is called a nested if.
	Useful when multiple conditions depend on a previous condition.

Example: Eligibility check based on student ID and score.

import java.util.*;
public class NIFAPP 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student ID:");
        int id = sc.nextInt();

        if(id >= 1 && id <= 100) 
		{
            System.out.println("Enter score:");
            int score = sc.nextInt();

            if(score > 70) 
			{
                System.out.println("Eligible for prize");
            } 
			else 
			{
                System.out.println("Eligible for certificate");
            }
        } 
		else 
		{
            System.out.println("You are not a registered candidate");
        }
    }
}

Example: Find the greatest of three numbers using nested if.

import java.util.*;
public class GTAPP 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three values:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b) 
		{
            if(a > c) 
			{
                System.out.println("A is Greater");
            } 
			else 
			{
                System.out.println("C is Greater");
            }
        } 
		else 
		{
            if(b > c) 
			{
                System.out.println("B is Greater");
            } 
			else 
			{
                System.out.println("C is Greater");
            }
        }
    }
}
------------------------------------------------------------------
5️⃣ Switch Statement
------------------------------------------------------------------
Ideal for menu-driven or choice-based programs.
Executes a block matching the value of a variable.
Example: Simple calculator (addition or multiplication).

Example: Check if a character is a vowel or consonant.

import java.util.*;
public class SWAPP 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("1: Addition\n2: Multiplication");
        System.out.println("Enter two values:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        switch(choice)
		 {
            case 1:
                System.out.printf("Addition is %d\n", a + b);
                break;
            case 2:
                System.out.printf("Multiplication is %d\n", a * b);
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}

Example: WAP to input character from keyboard and check character is vowel or consonant 

import java.util.*;
public class VCAPP 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.nextLine().charAt(0);

        if((ch >= '0' && ch <= '9') || (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')))) 
		{
            System.out.println("Not a vowel or consonant, it is a digit or special symbol");
        } 
		else 
		{
            if(ch >= 'A' && ch <= 'Z') 
			{
                ch = (char)(ch + 32); // Convert to lowercase
            }

            switch(ch) 
			{
                case 'a': case 'e': case 'i': case 'o': case 'u':
                    System.out.println("Vowel");
                    break;

                default:
                    System.out.println("Consonant");
            }
        }
    }
}

