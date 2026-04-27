1. Introduction to Java

Q. What is Java?
Java is a high-level, object-oriented programming language.

disadvantages of Java 

1. Slower Performance
Reason: Java uses the Java Virtual Machine (JVM) which converts bytecode into machine code at runtime.

2. High Memory Usage
Java programs consume more memory.
JVM, garbage collection, and libraries require extra resources.

3. Complex Code (Verbose)
Java requires more lines of code compared to languages like Python.
Example: simple tasks need class, main method, etc.

4. Limited Hardware Control
Cannot directly interact with hardware.

5. Large Application Size

Features of Java
1.Simple
    Easy to learn and understand.
    Syntax is similar to C and C++.
    No complex features like pointers.

2.Object-Oriented
    Everything is based on objects and classes.
    Supports OOP concepts:
        Encapsulation
        Inheritance
        Polymorphism
        Abstraction

3.Platform Independent
    Write Once, Run Anywhere.
    Java programs run on JVM, not directly on hardware.
 
4.Portable
    Java bytecode can run on any system.
    No system-dependent features.

5.Secure
    No use of pointers.
    Uses bytecode verification.
    Runs inside JVM sandbox.

6.Robust
    Strong memory management.
    Automatic garbage collection.
    Good exception handling.

7.Multithreaded
    Supports multiple threads.
    Helps in faster execution and better performance.

8.High Performance
    Uses Just-In-Time (JIT) compiler.
    Faster than traditional interpreted languages.

9.Distributed
    Supports distributed applications.
    Uses technologies like RMI and Web Services.

10.Dynamic
    Classes are loaded at runtime.
    Supports dynamic memory allocation.
 
Q. What is Object-Oriented Programming (OOP)?
OOP is a programming paradigm based on objects and classes.

Pillars of OOP:
    1. Inheritance
    2. Polymorphism
    3. Abstraction
    4. Encapsulation

Features of OOP in Java:
    1. Class
    2. Object
    3. Inheritance
    4. Polymorphism
    5. Abstraction & Encapsulation
    6. Dynamic Binding
    7. Message Passing

Note:
Java is not purely object-oriented; it is a programming language that implements OOP concepts.
-------------------------------------------------------------------------------
2. Java Development Environment
Steps to work with Java:
1. Install JDK
2. Create Java program
3. Compile program
4. Run program

| Feature        | JVM (Java Virtual Machine)                              | JRE (Java Runtime Environment)                                           | JDK (Java Development Kit)                                                   |

| -------------- | ------------------------------------------------------- | ------------------------------------------------------------------------ | ---------------------------------------------------------------------------- |

| **Definition** | JVM is a virtual machine that runs Java bytecode.       | JRE is a package that provides the environment to run Java applications. | JDK is a complete kit to **develop** and run Java applications.              |

| **Purpose**    | Runs Java programs (converts bytecode to machine code). | Runs Java programs.                                                      | Develops **and** runs Java programs.                                         |

| **Contains**   | - Just the JVM - No compiler or development tools       | - JVM - Java class libraries                                             | - JRE - Development tools like `javac` (compiler), `jar`, `javadoc`, etc.    |
 
| **User**       | End-users or runtime environment.                       | End-users who want to run Java programs.                                 | Developers who want to write Java programs.                                  |

| **Compiler**   | Does **not** have a compiler.                           | Does **not** have a compiler.                                            | Has a compiler (`javac`) to convert Java code to bytecode.                   |

| **Example**    | Runs `.class` files.                                    | Run applications like Minecraft (Java-based).                            | Used to create applications like `.java` → compile → `.class` → run.         |


Q. What is a Compiler?
A compiler converts Java source code (.java) into bytecode (.class).

Q. What is Bytecode?
Bytecode is machine-understandable code executed by the JVM. It makes Java platform-independent.

Q. Why does Java develop Bytecode?
Java develops bytecode to achieve platform independence.

// IMP //
(sourse code).java file → javac compiler → .class (Bytecode)
.class file → JVM → Machine Code(W,M,L) → Output


JVM is platform dependent
JVM is different for different operating systems.
Example:
Windows JVM
Linux JVM
macOS JVM

Bytecode is platform independent
Bytecode is platform independent because it can run on any platform using the appropriate JVM.

Bytecode  → Platform Independent
JVM       → Platform Dependent
Java      → Platform Independent (because of Bytecode + JVM)

How to install JDK
______________________________________________________
https://www.oracle.com/in/java/technologies/downloads/#java24

Q  Difference between C++, Java, and Python

| Feature           | Python 🐍   | Java ☕            | C++ ⚡              |
| ----------------- | ----------- | ------------------- | ------------------- |
| Typing            | Dynamic     | Static              | Static              |
| Compilation       | Interpreted | Bytecode (JVM)      | Native Machine Code |
| Speed             | Slow        | Medium              | Fast                |
| Memory Management | Automatic   | Automatic           | Manual              |
| Syntax            | Very simple | Verbose             | Complex             |
| Use Cases         | AI, ML, Web | Android, Enterprise | Games, OS, Drivers  |

2. sample application

access specifier class className
{
    public static void main(String x[])
    {
        // write here your logic
    }
}

✅ Access specifiers / Modifier are the some keywords which are used to decide restriction levels on a class and its members.

There are major four types of access specifier in JAVA

| Modifier                 | Accessible in Same Class   | Same Package  | Subclass   |  Other Packages      |
| -------------------------| ------------------------   | ------------  | --------   |  ------------------- |
| *public*                 | ✅                        | ✅            | ✅        | ✅                   |
| *protected*              | ✅                        | ✅            | ✅        | ❌ (unless subclass) |
| *default* (no keyword)   | ✅                        | ✅            | ❌        | ❌                   |
| *private*                | ✅                        | ❌            | ❌        | ❌                   |

1. public in Java

When something is marked as public → it is accessible from anywhere in the program (any class, any package).

2. What is static ?

static = belongs to the class, not to objects.
Saves memory (one copy for all).
Used for constants, utility methods, and program entry (main).
So you can access it without creating an object.
 
    🔹 Where we use static?
    1. Static Variables
    Shared across all objects of the class.
    Only one copy exists in memory.

    2. Static Methods
    Can be called without creating an object.

    3. Static Block 
    Runs once when the class is loaded.
    Used for initialization.


3. void ?

void is a return type in Java.
It means the method does not return any value.

If a method is declared void, you just call it for its effect (like printing, updating, etc.), not for getting a result.

//imp//
Note : If you want a result, replace void with the data type and use return.

Why is main method void  ?

public static void main(String[] args)

JVM calls main() to start the program.
JVM doesn’t expect a return value (it only needs the code to run).
That’s why it is void.

4.main?

main = entry point of Java program.
JVM searches for it to start execution.
Must be public static void main(String[] args).

------------------------✅short note---------------------------
public
main Must be accessible by JVM (which is outside your class).
If not public, JVM cannot run it. 

static
JVM calls main without creating an object.
So main must be static.

void
main does not return any value.
JVM doesn’t expect results, it just executes code.

main
The name of the method (fixed keyword).
JVM specifically looks for this name.

String[] args / String x[]
Stores command-line arguments passed when running the program.
----------------------------------------------------------------

🔹 System.out.println in Java

It is used to print output to the console.

1. System(class)
A predefined class in java.lang package.
Provides access to system-level stuff (input, output, error, etc.).

2. out (static variable)
A static variable of type PrintStream inside System class.
Represents the standard output stream (usually the console).

3. println()   (method)
A method of PrintStream class.
Prints text to the console and moves the cursor to the next line.

Examples of Editors:
Notepad
WordPad
Notepad++
Sublime Text
VS Code
Atom

How to compile a Java Program?

1 Open command prompt 
2 Go where java file save (.java)
3 Type the command :  javac filename.java  (source to byte)
4 Run application : java filename

// java filename.java //

-----------------------------------------------------------
DataType in JAVA
-----------------------------------------------------------
Q. What is Data Type?
Data type means deciding what kind of information we want to use in the code.
A data type is used to define the type of data that a variable can hold. 

1️⃣ Primitive Data Type
Primitive data types are those data types that store simple (normal) values directly.
 
| Data Type | Size (in bytes) | Range /Notes                             |
| --------  |------------------------------------------------------------|
| byte      | 1 byte          | -128 to 127                              |
| short     | 2 bytes         | -32,768 to 32,767                        |
| int       | 4 bytes         | -2,147,483,648 to 2,147,483,647          |
| long      | 8 bytes         | -2⁶³ to 2⁶³-1                            |
| float     | 4 bytes         | Approx. 7 decimal digits precision       |
| double    | 8 bytes         | Approx. 15–16 decimal digits precision   |
| char      | 2 bytes         | Stores a Unicode character (0 to 65,535) |
| boolean   | JVM-dependent   | Only true / false (size not strictly defined; treated as 1 bit logically, but often 1 byte in practice for memory alignment) |

| Data Type | Size                  | Default Value | Example              |
| ----------| --------------------- | ------------- | ---------------------|
| *byte*    | 1 byte                | 0             | byte b = 100;        |
| *short*   | 2 bytes               | 0             | short s = 200;       |
| *int*     | 4 bytes               | 0             | int x = 1000;        |
| *long*    | 8 bytes               | 0L            | long l = 100000L;    |
| *float*   | 4 bytes               | 0.0f          | float f = 3.14f;     |
| *double*  | 8 bytes               | 0.0d          | double d = 99.99;    |
| *char*    | 2 bytes (Unicode)     | '\u0000'      | char c = 'A';        |
| *boolean* | 1 bit (JVM dependent) | false         | boolean flag = true; |

 Examples

Primitive Example
public class DataTypesDemo 
{
    public static void main(String[] args) 
    {
        int age = 21;
        double price = 19.99;
        char grade = 'A';
        boolean passed = true;

        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + passed);
    }
}
✅ Output:
Age: 21
Price: 19.99
Grade: A
Passed: true

2️⃣ Referential (Reference) Data Type
    Referential data types are those data types that store the address (reference) of memory, not the actual value.

Created by programmers or from libraries.

Examples:
String → "Hello"
Arrays → int[] arr = {1,2,3};
Classes & Objects → Car myCar = new Car();
Interfaces, Enums, etc.

Example

public class NonPrimitiveDemo 
{
    public static void main(String[] args) 
    {
        String name = "Harsh";
        int[] numbers = {1, 2, 3, 4};
        
        System.out.println("Name: " + name);
        System.out.println("First number: " + numbers[0]);
    }
}

✅ Output:

Name: Harsh
First number: 1

 Q Can we see the memory size of data type in JAVA?
 Yes we can see the memory size of data type in JAVA and Java return memory size in bits format.

 public class MemSizeAPP
{
    public static void main(String x[])
    {
        int size = Integer.SIZE;
        System.out.println(size / 8);
    }
}
size / 8
Since 1 byte = 8 bits
32 / 8 = 4
So, int occupies 4 bytes of memory.

public class MemSizeAPP
{
    public static void main(String x[])
    {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("Min value is " + minValue);
        System.out.println("Max value is " + maxValue);
    }
}

output
Min value is -2147483648
Max value is 2147483647

--------------------------------------------------------------------------

1. What are Operators?
Operators are symbols that perform operations on variables and values.

2. Types of Operators in Java

✅ A) Arithmetic Operators
✅ B) Assignment Operators
✅ C) Relational (Comparison) Operators
✅ D) Logical Operators
✅ E) Increment and Decrement Operators


Arithmetic operators are used to perform mathematical calculations.

| Operator | Meaning             |
| -------- | ------------------- |
| `+`      | Addition            |
| `-`      | Subtraction         |
| `*`      | Multiplication      |
| `/`      | Division            |
| `%`      | Remainder / Modulus |

✅ B) Assignment Operators
Used to assign values.
| Operator | Example  | Equivalent To |
| -------- | -------- | ------------- |
| =        | x = 5    | x = 5         |
| +=       | x += 3   | x = x + 3     |
| -=       | x -= 2   | x = x - 2     |
| *=       | x *= 4   | x = x * 4     |
| /=       | x /= 2   | x = x / 2     |
| %=       | x %= 3   | x = x % 3     |


✅ C) Relational (Comparison) Operators
Return true/false.

|Operator| Meaning             | Example (a=10, b=5) | Result |
|--------| ------------------- | ------------------- | ------ |
| ==     | Equal to            | a == b              | false  |
| !=     | Not equal to        | a != b              | true   |
| >      | Greater than        | a > b               | true   |
| <      | Less than           | a < b               | false  |
| >=     | Greater or equal to | a >= 10             | true   |
| <=     | Less or equal to    | b <= 5              | true   |

✅ D) Logical Operators
A logical operator is used to combine more than one condition, treat them as a single condition, and evaluate the result.
Work on boolean values.

(&&) Logical AND : if all conditions are true then condition is true otherwise condition is false 

(||) Logical OR : if any one condition is true then condition is true otherwise condition is false.

(!) Logical NOT : if condition is true then false and if false then true.

Note: every logical operator works as a logical GATE.

✅ E) Increment and Decrement Operators

Increment and decrement operators are used to increase or decrease the value of a variable by 1.

| Operator | Meaning                  |
| -------- | ------------------------ |
| `++`     | Increases the value by 1 |
| `--`     | Decreases the value by 1 |


Types of Increment and Decrement Operators
There are two types:

1️⃣ Pre-Increment / Pre-Decrement
Value is updated first, then used.
++a;   // Pre-increment
--a;   // Pre-decrement

public class PIAPP
{
    public static void main(String x[])
    {
        int a = 10, b;
        b = ++a;
        System.out.printf("A=%d\tB=%d\n", a, b);
    }
}

2️⃣ Post-Increment / Post-Decrement
Value is used first, then updated.
a++;   // Post-increment
a--;   // Post-decrement

public class PIAPP
{
    public static void main(String x[])
    {
        int a = 10, b;
        b = a++;   // post-increment
        System.out.printf("A=%d\tB=%d\n", a, b);
    }
}

✅ F) Conditional (Ternary) Operator

The conditional operator is used to check a condition and execute one of two expressions based on whether the condition is true or false.

It is mainly used when we have single-line logic instead of using if–else.

condition ? expression1 : expression2;

If the condition is true → expression1 executes
If the condition is false → expression2 executes

public class PIAPP
{
    public static void main(String x[])
    {
        int a = 11, b = 20;
        String msg = a > b ? "A is Greater" : "B is Greater";
        System.out.println(msg);
    }
}

✅ G) Bitwise Operators

Work on bits (0s and 1s).
| Operator | Meaning              | Example (a=5=0101, b=3=0011) | Result |          |       |   |
| -------- | -------------------- | ---------------------------- | ------ | -------- | ----- | - |
| &        | AND                  | a & b → 0101 & 0011          | 1      |          |       |   |
| `/ |     | `                    | OR                           | a      | b→0101   |  0011 | 7 |
| ^        | XOR                  | a ^ b → 0101 ^ 0011          | 6      |          |       |   |
| ~        | NOT (1’s comp)       | ~a                           | -6     |          |       |   |
| <<       | Left shift           | a << 1 (0101 → 1010)         | 10     |          |       |   |
| >>       | Right shift          | a >> 1 (0101 → 0010)         | 2      |          |       |   |
| >>>      | Unsigned right shift | (fills with 0s)              | —      |          |       |   |
 
--------------------------------------------------------------------------------------------------------

If we want to accept from keyboard using java we have two ways 

Using command line argument 
Using Scanner class.

Command line argument is a parameter present in the main function of string array type.

```java

public class PIAPP
{
    public static void main(String x[])
    {
        int a=x[0];    //first input
        int b=x[1];    //second input
        String msg=a>b ? "A is Greater" :"B is Greater";
        System.out.println(msg);
    }
}

C:\Program Files\Java\jdk-24\bin>javac PIAPP.java
PIAPP.java:5: error: incompatible types: String cannot be converted to int
        int a=x[0];
        
PIAPP.java:6: error: incompatible types: String cannot be converted to int
        int b=x[1];

2 errors

C:\Program Files\Java\jdk-24\bin>
```

If we think about the above code we have 2 compile time errors because we have string resource for input and we want to accept input of type integer but cannot store it directly so we get compile time error.

How can we solve this type of error?
_______________________________________________________________________
If we want to solve this type of error we required to perform type conversion 
Or type casting 

Q. What is Type Casting?

Type casting is the process of converting one data type into another data type.

Means according to our code we need to convert string to integer.

How to convert string to integer in JAVA?
_____________________________________________________________________
Syntax:  int variablename =Integer.parseInt(String): 
Here Integer is class and parseInt() is function of Integer class and which is used for convert String to integer in JAVA

``` java
public class PIAPP 
{
    public static void main(String x[])
    {
        int a=Integer.parseInt(x[0]);  //first input
        int b=Integer.parseInt(x[1]);  //second input
        String msg=a>b ? "A Is Greater" : "B is Greater";
        System.out.println(msg);
    }
}

output

C:\Program Files\Java\jdk-24\bin>javac PIAPP.java

C:\Program Files\Java\jdk-24\bin>java PIAPP
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0 at PIAPP.main(PIAPP.java:3)


C:\Program Files\Java\jdk-24\bin>java PIAPP 100 20
A Is Greater

```
```java
public class PIAPP
{  public static void main(String x[])
	{      
	   int qty=Integer.parseInt(x[0]);
	   int rate=Integer.parseInt(x[1]);
	   int total=qty*rate;
	   int gstAmt=total*18/100;
	   total=total+gstAmt;
	   System.out.printf("Total is %d\n",total);
	}
}
```

Example: WAP to input  basic salary of employee and calculate its total salary using a following terms 
da=30%
hra=30%


```java
public class PIAPP
{  public static void main(String x[])
	{      
	   int bs =Integer.parseInt(x[0]);
	   int da= bs * 30/100;
       int hra = bs*30/100;
	   int total=bs + da + hra;
	  
	   System.out.printf("Total  salaryis %d\n",total);
	}
}
```

Example: WAP to input selling price and cost price of item and check seller made profit or loss

Example with source code

```java
public class PLAPP
{   public static void main(String x[])
	{    int sp=Integer.parseInt(x[0]);
		 int cp=Integer.parseInt(x[1]);
		 String msg= sp>cp ? "Profit :"+(sp-cp):"Loss :"+(sp-cp);
	     System.out.printf("%s",msg);
	}
}
```
Note: if we want to accept every input on new line or if we want to accept the input after program run or running phase of code after program run statement i.e java filename 
Then we have one more option known as Scanner class.

---------------------------------------------------------
Steps to work with Scanner class
__________________________________________________________
Q. What is the package?

A package is a collection of related classes and interfaces in Java.

Importing a Package
To use classes or interfaces from a package in a program, we use the import keyword.

import packageName.*;

This statement imports all the classes and interfaces from the specified package.
This is called wildcard import.


Common Classes in java.util.*;
Scanner → Used to take input from keyboard

Date → Represents date and time (legacy)
Time → Represents time (legacy / not commonly used)
ArrayList → Dynamic array implementation
List → Interface for ordered collection
LinkedList → Doubly linked list implementation

           Or

import packagename.membername;
Example: import java.util.Scanner;  

This statement imports only a specific class (Scanner) from the java.util package.

            Or
Inline package import: inline package import is type of package import where we import package but without import keyword.

Syntax: packagename.membername ref = new packagename.membername();

Example: 
 
public class PT
{
    public static void main(String x[])
	{
	    java.sql.Date d = new java.sql.Date(5);
		java.util.Date d1 = new java.util.Date();
		System.out.println("D is  "+d);
		System.out.println("D1 is "+d1);
		 
	}
}

Or

Static package import : Static import is used to import static members (variables and methods) of a class directly into an application.

The main benefit is that we do not need to use the class name every time while accessing static members.

Example 1: Static Import of Math Class
```java
import static java.lang.Math.*;
public class PT
{
    public static void main(String x[])
    {
        double p = PI;       // Math.PI
        double s = sqrt(5);  // Math.sqrt(5)

        System.out.println("PI " + p);
        System.out.println("Square root " + s);
    }
}
Or 
Example 2: Static Import of System Class

import static java.lang.System.*;

public class PT
{
    public static void main(String x[])
    {
        out.println("Good Morning");
        out.println("Good Afternoon");
        out.println("Good Evening");
    }
}
```
-------------------------------------
Create object of Scanner class
______________________________________________________________
Syntax: Scanner ref = new Scanner(System.in);
Example: Scanner xyz = new Scanner(System.in);

Use its method to work with Scanner : Scanner class provide some inbuilt functions or methods to us for work with Scanner class

Methods of Scanner class
___________________________________________________________
int nextInt(): this function is used for accept input of type integer 

float nextFloat(): this function is used for accept input of type float 

double nextDouble(): this function is used for accept input of type double 

long  nextLong(): this function is used for accept type of long 

String nextLine(): this function is used for accept input of type string 

short  nextShort(): this function is used for accept input of type short 

byte nextByte(): this function is used for accept input of type byte 
-------------------------------------------
Example with source 
-------------------------------------------
import java.util.*;//step1
public class SAPP
{
   public static void main(String x[])
   {  
    Scanner xyz= new Scanner(System.in);//step2
        int a,b,c;
	System.out.println("Enter two values");
	a=xyz.nextInt(); //step3
	b=xyz.nextInt();//step3
	c=a+b;
	System.out.printf("Addition is %d\n",c);

   }
}
-----------------------------------------
Example: WAP to input a three digit number and reverse it?
Input: 123
Output: 321

```java
import java.util.*;
public class NRA
{  public static void main(String x[])
   {
       Scanner xyz= new Scanner(System.in);
	   System.out.println("Enter number from keyboard");
	   int no=xyz.nextInt();
	   System.out.printf("Before Reverse is %d\n",no);
	    no = (no%10)*100 + ((no/10)%10)*10 + no/100;
	    System.out.printf("After Reverse is %d\n",no);
   }
}

```
Example: WAP to input a four digit number and swap first and last digit.
Input:1234
Output:4231

import java.util.*;
public class SFLAPP
{   public static void main(String x[])
    {  Scanner xyz = new Scanner(System.in);

	   int no,first,last;
	   System.out.printf("Enter four digit number");
	   no=xyz.nextInt();

	   System.out.printf("\nBefore swap digit %d\n",no);

	   last = no%10;
	   first = no/1000;
	   no = no/10;
	   no = no % 100;
	   last = last*1000;
	   no = no*10;
	   no = last+no+first;
	   System.out.printf("After Swap digit %d\n",no);
	}
}
Or
import java.util.*;
public class SFLAPP
{   public static void main(String x[])
    {  
       Scanner xyz = new Scanner(System.in);
	   int no,first,last;
	   System.out.printf("Enter four digit number");
	   no=xyz.nextInt();

	   System.out.printf("\nBefore swap digit %d\n",no);

	   no =(no%10)*1000 +( (no/10)%100)*10 + (no/1000);
       
	   System.out.printf("\nAfter swap digit %d\n",no);
	}
}

Example: WAP to input four digit number and calculate its digit sum
Input: 1234
Output: 1+2+3+4 = 10

import java.util.*;
public class SFLAPP
{   
    public static void main(String x[])
    {  
       Scanner xyz = new Scanner(System.in);
	   int no, rem, sum=0;
	   System.out.printf("Enter four digit number");
	   no = xyz.nextInt();

	   rem = no%10;
	   no = no/10;
	   sum = sum+rem;
	   
	   rem=no%10;
	   no = no/10;
	   sum=sum+rem;
	   
	   rem=no%10;
	   no = no/10;
	   sum=sum+rem;
	   
	   rem=no%10;
	   no = no/10;
	   sum=sum+rem;
	   
	   System.out.printf("Sum is %d\n",sum);	   
	}
}
-------------------------------------------
Bitwise operator
--------------------------------------------
1.Number System
2.Binary to decimal or decimal to binary 
3.One’s complement and Two’s complement 
4.Bitwise AND,OR,XOR operation 

1. Number System : Number Systems are some techniques to represent human values in computer memory for computer understanding purposes called Number system

-------------------------------------------
Types of Number  System 
______________________________________________
Binary Number System : Binary Number System contain two digits only 0 & 1 so the base of binary number system is 2 

Types of Number System 
_________________________________________________
1️⃣ Binary Number System
Binary Number System contains only two digits: 0 and 1.
So, the base (radix) of the binary number system is 2.

(10101)₂
Here, 2 indicates it is a binary number system.


❓ What is the Purpose of Base in Number System?
The base is used:

a) To identify the number system
b) To perform conversion from one number system to another

2️⃣ Decimal Number System

Decimal Number System contains digits from 0 to 9.
So, the base of the decimal number system is 10.

(1234)₁₀

3️⃣ Octal Number System

Octal Number System contains digits from 0 to 7.
So, the base of the octal number system is 8.

(12345)₈

4️⃣ Hexadecimal Number System

Hexadecimal Number System contains 16 values (0–15).
After 9, letters are used:
| Decimal | Hex |
| ------- | --- |
| 10      | A   |
| 11      | B   |
| 12      | C   |
| 13      | D   |
| 14      | E   |
| 15      | F   |
So, the base of the hexadecimal number system is 16.

Example
(45678A)₁₆
-----------------------------------------------
Summary Table ⭐
| Number System | Base | Digits Used  |
| ------------- | ---- | ------------ |
| Binary        | 2    | 0, 1         |
| Decimal       | 10   | 0 – 9        |
| Octal         | 8    | 0 – 7        |
| Hexadecimal   | 16   | 0 – 9, A – F |
-----------------------------------------------
Conversion between Decimal to Binary
Purpose
-----------------------------------------------
The goal of decimal to binary conversion is to understand how a decimal number is stored in binary form inside computer memory, because computers work only with 0 and 1.

Steps to Convert Decimal to Binary
1. Divide the decimal number by 2
2. Note the remainder
3. Divide the quotient again by 2
4. Repeat until the quotient becomes 0
5. Write all remainders from bottom to top

Example 1️⃣: Convert Decimal 5 into Binary

| Division | Quotient | Remainder |
| -------- | -------- | --------- |
| 5 ÷ 2    | 2        | 1         |
| 2 ÷ 2    | 1        | 0         |
| 1 ÷ 2    | 0        | 1         |

5₁₀ = 0101₂

Example 2️⃣: Convert Decimal 12 into Binary

| Division | Quotient | Remainder |
| -------- | -------- | --------- |
| 12 ÷ 2   | 6        | 0         |
| 6 ÷ 2    | 3        | 0         |
| 3 ÷ 2    | 1        | 1         |
| 1 ÷ 2    | 0        | 1         |

12₁₀ = 1100₂
----------------------------------------------
One’s Complement
----------------------------------------------
One’s complement is a negation operation performed on a binary number.
In one’s complement, each bit is inverted:

0 → 1
1 → 0

Example
Binary number:
0101
One’s complement:
1010
-----------------------------------------------
Two’s Complement
-----------------------------------------------
Two’s complement is obtained by:

1. Finding the one’s complement
2. Adding 1 to the least significant bit (LSB)

Steps to Find Two’s Complement

1.Convert the number into one’s complement
2.Add 1

Example
Binary number:
0101

Step 1: One’s complement
1010

Step 2: Add 1

1010
+  1
-----
1011

✅ Two’s complement = 1011
----------------------------------------------
Binary AND Operation (&)
---------------------------------------------
Rule:
👉 If both inputs are 1, the output is 1, otherwise 0.

Truth Table
| A | B | A & B |
| - | - | ----- |
| 0 | 0 | 0     |
| 0 | 1 | 0     |
| 1 | 0 | 0     |
| 1 | 1 | 1     |

----------------------------------------------
Binary OR Operation (|)
----------------------------------------------
Rule:
👉 If any one input is 1, the output is 1.
👉 If both inputs are 0, the output is 0.

Truth Table

| A | B | A | B |
|-- | --|------ |
| 0 | 0 | 0     |
| 0 | 1 | 1     |
| 1 | 0 | 1     |
| 1 | 1 | 1     |
----------------------------------------------
Binary XOR Operation (^)
----------------------------------------------
Rule:
👉 If inputs are different, output is 1
👉 If inputs are same, output is 0

| A | B | A ^ B |
| - | - | ----- |
| 0 | 0 | 0     |
| 0 | 1 | 1     |
| 1 | 0 | 1     |
| 1 | 1 | 0     |
----------------------------------------------
Bitwise AND
----------------------------------------------
public class BAPP
{
	  public static void main(String x[])
	  {
		    int a,b,c;
			a=5;
			b=6;
			c=a&b;
			System.out.printf("C is %d\n",c);
	  }
}
---------------------------------------------
Bitwise OR
---------------------------------------------
Example with source code 
public class BAPP
{
	  public static void main(String x[])
	  {
		    int a,b,c;
			a=15;
			b=14;
			c=a | b;
			System.out.printf("C is %d\n",c);
	  }
}
---------------------------------------------
XOR Operator
--------------------------------------------
Example with source code 
public class BAPP
{
	  public static void main(String x[])
	  {
		    int a,b,c;
			a=15;
			b=14;
			c = a ^ b;
			System.out.printf("C is %d\n",c);
	  }
}
---------------------------------------------
<< (Left shift  operator)
---------------------------------------------
The left shift operator (<<) shifts the bits of a number to the left by a specified number of positions.
Each left shift by 1 position multiplies the number by 2.

a << n  =  a × 2ⁿ

Example 1️⃣ (From Your Code)
public class BAPP
{
	  public static void main(String x[])
	  {
		    int a,b,c;
			a=5;
			b=a<<2;
			System.out.printf("B is %d\n",b);
	  }
}

Step-by-Step Explanation
Step 1: Convert a into Binary
a = 5
Binary of 5 = 00000101

Step 2: Left Shift by 2
00000101 << 2

Shift bits 2 positions left:
00010100

Step 3: Convert Back to Decimal
00010100₂ = 20₁₀

✅ Output
B is 20

Calculation
5 * 2² = 5 * 4 = 20

----------------------------------------------
Right Shift Operator (>>)
----------------------------------------------
Definition

The right shift operator (>>) shifts the bits of a number to the right by a specified number of positions.

👉 Each right shift by 1 position divides the number by 2.

Formula
a >> n = a ÷ 2ⁿ

public class BAPP
{
    public static void main(String x[])
    {
        int a, b;
        a = 20;
        b = a >> 2;
        System.out.printf("B is %d\n", b);
    }
}

Step-by-Step Explanation
Step 1️⃣ Convert a into Binary
a = 20
Binary = 00010100

Step 2️⃣ Right Shift by 2
00010100 >> 2

Shift bits 2 positions to the right:
00000101

Step 3️⃣ Convert Back to Decimal
00000101₂ = 5₁₀

B is 5

Calculation
72 ÷ 2³ = 72 ÷ 8 = 9
----------------------------------------------
Operator Priority (Precedence)
----------------------------------------------
Operator priority decides the order of execution of operators when more than one operator is present in a single expression.

| Priority | Operators                                  | Associativity  |                |               |
| -------- | ------------------------------------------ | -------------- | -------------- | ------------- |
| 1        | `()`, `[]`, `.` , `++` `--` (post)         | Left to Right  |                |               |
| 2        | `++` `--` (pre), `+` `-` (unary), `!`, `~` | Right to Left  |                |               |
| 3        | `*`, `/`, `%`                              | Left to Right  |                |               |
| 4        | `+`, `-`                                   | Left to Right  |                |               |
| 5        | `<<`, `>>`, `>>>`                          | Left to Right  |                |               |
| 6        | `<`, `>`, `<=`, `>=`                       | Left to Right  |                |               |
| 7        | `==`, `!=`                                 | Left to Right  |                |               |
| 8        | `&` (Bitwise AND)                          | Left to Right  |                |               |
| 9        | `^` (Bitwise XOR)                          | Left to Right  |                |               |
| 10       | `                                          | ` (Bitwise OR) | Left to Right  |               |
| 11       | `&&` (Logical AND)                         | Left to Right  |                |               |
| 12       | `                                          |                | ` (Logical OR) | Left to Right |
| 13       | `?:` (Conditional Operator)                | Right to Left  |                |               |
| 14       | `=`, `+=`, `-=`, `*=`, `/=` etc            | Right to Left  |                |               |

```java
public class OAPP 
{
    public static void main(String x1[]) {
        int x = 6;
        System.out.println(x++ == 6 && ++x == 8);
    }
}
```
That’s why the program prints true.

Q. What will be the output of given code?

```java
public class OAPP
{
    public static void main(String x[])
    {
        int x = 6;

        int b = x++ + ++x + x;

        System.out.printf("x= %d\tb= %d\n", x, b);
    }
}

output:
6+8+8=22
```
```java
public class OAPP
{
    public static void main(String x[])
    {
        int a,b=2;

        a = 5 * 2 + 5 + ++b >> 2 & 6 ^ 7 << 2;

        System.out.printf("a=%d; b=%d\n",a,b);
    }
}
```

priority
1. ++(pre)
2. *
3. +
4. >> <<
5. &
6. ^

calculation

- 5*2+5+3>>2 & 6^7 <<2
- 10+5+3>>2 & 6^7 <<2
- 15+3>>2 & 6^7 <<2
- 18 >> 2 & 6 ^ 7 << 2
- 4 & 6 ^7<<2
- 4&6^28
- 4^28
- 24 

























