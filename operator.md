🔹 1. Basic Nature 
Python → Interpreted, dynamically typed, scripting language.

Java → Compiled to bytecode, runs on JVM (platform independent).

C++ → Compiled directly to machine code (fast, but platform dependent unless recompiled).

🔹2. Syntax

Python → Simple, fewer lines, indentation-based.

Java → Verbose, everything inside a class, strict syntax.

C++ → Complex (mix of low-level + OOP), uses headers, pointers, manual memory handling.

🔹3. Typing System

Python → Dynamically typed (no need to declare variable type).

x = 10    # int
x = "Hi"  # now string, allowed


Java → Statically typed (must declare variable type).

int x = 10; 
String y = "Hi";


C++ → Statically typed (must declare type, but has more control with pointers).

int x = 10; 
string y = "Hi";

🔹 4. Memory Management

Python → Automatic (garbage collector).

Java → Automatic (garbage collector in JVM).

C++ → Manual (programmer must free memory with delete).

🔹 5. Speed

C++ → Fastest (compiled directly to machine code).

Java → Slower than C++ (runs on JVM).

Python → Slowest (interpreted, but easy to write).

🔹 6. Paradigms

Python → Multi-paradigm (procedural, OOP, functional).

Java → Pure OOP (everything inside classes).

C++ → Multi-paradigm (procedural + OOP + low-level features).

🔹 7. Use Cases

Python → AI/ML, Data Science, Web (Django, Flask), scripting, automation.

Java → Enterprise apps, Android apps, banking systems, backend servers.

C++ → System software, game engines, operating systems, embedded systems.

🔹 8. Portability

Python → Runs anywhere (need interpreter installed).

Java → Write Once, Run Anywhere (via JVM).

C++ → Must recompile for each OS (platform dependent).

🔹 9. Example: Add Two Numbers

🔹Python

a = 5
b = 3
print("Sum:", a+b)


🔹Java

public class Add {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("Sum: " + (a+b));
    }
}


🔹C++

#include <iostream>
using namespace std;

int main() {
    int a = 5, b = 3;
    cout << "Sum: " << a+b;
    return 0;
}
| Feature           | Python 🐍   | Java ☕              | C++ ⚡               |
| ----------------- | ----------- | ------------------- | ------------------- |
| Typing            | Dynamic     | Static              | Static              |
| Compilation       | Interpreted | Bytecode (JVM)      | Native Machine Code |
| Speed             | Slow        | Medium              | Fast                |
| Memory Management | Automatic   | Automatic           | Manual              |
| Syntax            | Very simple | Verbose             | Complex             |
| Use Cases         | AI, ML, Web | Android, Enterprise | Games, OS, Drivers  |


| Modifier                   | Accessible in Same Class | Same Package | Subclass | Other Packages      |
| -------------------------- | ------------------------ | ------------ | -------- | ------------------- |
| *public*                 | ✅                        | ✅            | ✅        | ✅                   |
| *protected*              | ✅                        | ✅            | ✅        | ❌ (unless subclass) |
| *default* (no keyword) | ✅                        | ✅            | ❌        | ❌                   |
| *private*                | ✅                        | ❌            | ❌        | ❌                   |
🔹 What is static?

static is a keyword in Java.

It means the member (variable, method, block, or nested class) belongs to the class itself, not to objects.

So you can access it without creating an object.
[06-10-2025 15:33] Harshad: 🔹 Where we use static?
1. Static Variables

Shared across all objects of the class.

Only one copy exists in memory.
[06-10-2025 15:33] Harshad: 2. Static Methods

Can be called without creating an object.
[06-10-2025 15:34] Harshad: 3. Static Block

Runs once when the class is loaded.

Used for initialization.

 ✅ In short:

static = belongs to the class, not to objects.

Saves memory (one copy for all).

Used for constants, utility methods, and program entry (main).

🔹 public in Java

public is an access modifier.

It controls the visibility (who can use/see the class, method, or variable).

When something is marked as public → it is accessible from anywhere in the program (any class, any package).

🔹 What does void mean?

void is a return type in Java.

It means the method does not return any value.

If a method is declared void, you just call it for its effect (like printing, updating, etc.), not for getting a result.
✅ Summary

void = method returns nothing.

Use when method just performs an action (like printing, updating data).

If you want a result, replace void with the data type and use return.
[06-10-2025 15:46] Harshad: Why is main method void?
public static void main(String[] args)


JVM calls main() to start the program.

JVM doesn’t expect a return value (it only needs the code to run).

That’s why it is void.
 ✅ In short:

main = entry point of Java program.

JVM searches for it to start execution.

Must be public static void main(String[] args).
 Breakdown:

public

Must be accessible by JVM (which is outside your class).

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

String[] args

Stores command-line arguments passed when running the program.
🔹 System.out.println in Java

It is used to print output to the console.

Structure:

System

A predefined class in java.lang package.

Provides access to system-level stuff (input, output, error, etc.).

out

A static variable of type PrintStream inside System class.

Represents the standard output stream (usually the console).

println()

A method of PrintStream class.

Prints text to the console and moves the cursor to the next line.
| Data Type   | Size (in bytes) | Range / Notes                                                                                                                        |
| ----------- | --------------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| byte    | 1 byte          | -128 to 127                                                                                                                          |
| short   | 2 bytes         | -32,768 to 32,767                                                                                                                    |
| int     | 4 bytes         | -2,147,483,648 to 2,147,483,647                                                                                                      |
| long    | 8 bytes         | -2⁶³ to 2⁶³-1                                                                                                                        |
| float   | 4 bytes         | Approx. 7 decimal digits precision                                                                                                   |
| double  | 8 bytes         | Approx. 15–16 decimal digits precision                                                                                               |
| char    | 2 bytes         | Stores a Unicode character (0 to 65,535)                                                                                         |
| boolean | JVM-dependent   | Only true / false (size not strictly defined; treated as 1 bit logically, but often 1 byte in practice for memory alignment) |
| Data Type | Size                  | Default Value | Example              |
| ----------| --------------------- | ------------- | -------------------- |
| *byte*    | 1 byte                | 0             | byte b = 100;        |
| *short*   | 2 bytes               | 0             | short s = 200;       |
| *int*     | 4 bytes               | 0             | int x = 1000;        |
| *long*    | 8 bytes               | 0L            | long l = 100000L;    |
| *float*   | 4 bytes               | 0.0f          | float f = 3.14f;     |
| *double*  | 8 bytes               | 0.0d          | double d = 99.99;    |
| *char*    | 2 bytes (Unicode)     | '\u0000'      | char c = 'A';        |
| *boolean* | 1 bit (JVM dependent) | false         | boolean flag = true; |
 ✅ B) Non-Primitive Data Types (Reference types)

Created by programmers or from libraries.

Examples:

String → "Hello"

Arrays → int[] arr = {1,2,3};

Classes & Objects → Car myCar = new Car();

Interfaces, Enums, etc.

🔹 3. Examples
Primitive Example
public class DataTypesDemo {
    public static void main(String[] args) {
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

Non-Primitive Example
public class NonPrimitiveDemo {
    public static void main(String[] args) {
        String name = "Harsh";
        int[] numbers = {1, 2, 3, 4};
        
        System.out.println("Name: " + name);
        System.out.println("First number: " + numbers[0]);
    }
}


✅ Output:

Name: Harsh
First number: 1
1. What are Operators?

Operators are symbols that perform operations on variables and values.
[06-10-2025 16:41] Harshad: 2. Types of Operators in Java
✅ A) Arithmetic Operators
|Operator| Meaning                |Example| Result |
| -------| ---------------------- | ------| ------ |
| ++     | Increment by 1         | a++   | 11     |
| --     | Decrement by 1         | b--   | 4      |
| +      | Unary plus (no change) | +a    | 10     |
| -      | Unary minus (negates)  | -a    | -10    |
| !      | Logical NOT            | !true | false  |
✅ C) Relational (Comparison) Operators

Return true/false.
|Operator| Meaning             | Example (a=10, b=5) | Result |
| -------| ------------------- | ------------------- | ------ |
| ==     | Equal to            | a == b              | false  |
| !=     | Not equal to        | a != b              | true   |
| >      | Greater than        | a > b               | true   |
| <      | Less than           | a < b               | false  |
| >=     | Greater or equal to | a >= 10             | true   |
| <=     | Less or equal to    | b <= 5              | true   |
 ✅ D) Logical Operators

Work on boolean values.
Operator
Meaning
&&
Logical AND : if all conditions are true then condition is true otherwise condition is false 
||
Logical OR : if any one condition is true then condition is true otherwise condition is false.
!
Logical NOT : if condition is true then false and if false then true.
✅ E) Assignment Operators

Used to assign values.
| Operator | Example  | Equivalent To |
| -------- | -------- | ------------- |
| =        | x = 5    | x = 5         |
| +=       | x += 3   | x = x + 3     |
| -=       | x -= 2   | x = x - 2     |
| *=       | x *= 4   | x = x * 4     |
| /=       | x /= 2   | x = x / 2     |
| %=       | x %= 3   | x = x % 3     |
 ✅ F) Bitwise Operators

Work on bits (0s and 1s).
| Operator | Meaning              | Example (a=5=0101, b=3=0011) | Result |          |       |   |
| -------- | -------------------- | ---------------------------- | ------ | -------- | ----- | - |
| &        | AND                  | a & b → 0101 & 0011          | 1      |          |       |   |
| `        | `                    | OR                           | a      | b→0101   | 0011  | 7 |
| ^        | XOR                  | a ^ b → 0101 ^ 0011          | 6      |          |       |   |
| ~        | NOT (1’s comp)       | ~a                           | -6     |          |       |   |
| <<       | Left shift           | a << 1 (0101 → 1010)         | 10     |          |       |   |
| >>       | Right shift          | a >> 1 (0101 → 0010)         | 2      |          |       |   |
| >>>      | Unsigned right shift | (fills with 0s)              | —      |          |       |   |
 ✅ G) Ternary Operator

Shortcut for if-else.

int a = 10, b = 20;
int max = (a > b) ? a : b;
System.out.println("Max = " + max); // 20
 How to input values from keyboard
___________________________________________________________
If we want to accept from keyboard using java we have two ways 

Using command line argument 
Using Scanner class.
[06-10-2025 16:58] Harshad: Command line argument is a parameter present in the main function of string array type.
[06-10-2025 17:10] Harshad: public class PIAPP
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
 Steps to work with Scanner class
_____________________________________________________________
Add java.util package
Q. What is the package?
Example with source 
import java.util.*;//step1
public class SAPP
{
   public static void main(String x[])
   {  Scanner xyz= new Scanner(System.in);//step2
        int a,b,c;
	System.out.println("Enter two values");
	a=xyz.nextInt(); //step3
	b=xyz.nextInt();//step3
	c=a+b;
	System.out.printf("Addition is %d\n",c);  }
}