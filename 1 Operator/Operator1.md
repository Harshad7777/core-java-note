# Java Notes: Operators and Basic Concepts

## Table of Contents
- [1. Introduction to Java](#1-introduction-to-java)
- [2. Java Development Environment](#2-java-development-environment)
- [3. Sample Application](#3-sample-application)
- [4. Data Types in Java](#4-data-types-in-java)
- [5. Operators in Java](#5-operators-in-java)
- [6. Keyboard Input in Java](#6-keyboard-input-in-java)
- [7. Scanner Class](#7-scanner-class)
- [8. Number System](#8-number-system)
- [9. One’s Complement and Two’s Complement](#9-ones-complement-and-twos-complement)
- [10. Bitwise Operations](#10-bitwise-operations)
- [11. Operator Precedence](#11-operator-precedence)
- [12. Final Notes](#12-final-notes)

## 1. Introduction to Java

### Q. What is Java?
Java is a high-level, object-oriented programming language.

### Disadvantages of Java
1. Slower performance
   - Java uses the JVM, which converts bytecode into machine code at runtime.

2. High memory usage
   - JVM, garbage collection, and libraries require extra resources.

3. Complex code (verbose)
   - Java requires more lines of code than Python for simple tasks.

4. Limited hardware control
   - Java cannot directly interact with hardware.

5. Large application size
   - Java programs may be larger than lightweight alternatives.

### Features of Java
1. Simple
   - Easy to learn and understand.
   - Syntax is similar to C and C++.
   - No complex features like pointers.

2. Object-oriented
   - Everything is based on objects and classes.
   - Supports encapsulation, inheritance, polymorphism, and abstraction.

3. Platform independent
   - Write once, run anywhere.
   - Java programs run on JVM, not directly on hardware.

4. Portable
   - Java bytecode can run on any system.

5. Secure
   - No pointers.
   - Uses bytecode verification.
   - Runs inside JVM sandbox.

6. Robust
   - Strong memory management.
   - Automatic garbage collection.
   - Good exception handling.

7. Multithreaded
   - Supports multiple threads.
   - Better performance for concurrent tasks.

8. High performance
   - Uses JIT compiler.
   - Faster than traditional interpreted languages.

9. Distributed
   - Supports distributed applications.
   - Uses technologies like RMI and web services.

10. Dynamic
    - Classes are loaded at runtime.
    - Supports dynamic memory allocation.

### Q. What is Object-Oriented Programming (OOP)?
OOP is a programming paradigm based on objects and classes.

### Pillars of OOP
1. Inheritance
2. Polymorphism
3. Abstraction
4. Encapsulation

### Features of OOP in Java
1. Class
2. Object
3. Inheritance
4. Polymorphism
5. Abstraction and Encapsulation
6. Dynamic Binding
7. Message Passing

> Note: Java is not purely object-oriented, but it implements OOP concepts.

---

## 2. Java Development Environment

### Steps to work with Java
1. Install JDK
2. Create Java program
3. Compile the program
4. Run the program

### JVM vs JRE vs JDK

| Feature | JVM | JRE | JDK |
| --- | --- | --- | --- |
| Definition | Virtual machine that runs Java bytecode | Environment to run Java applications | Complete toolkit to develop and run Java applications |
| Purpose | Runs Java programs | Runs Java programs | Develops and runs Java programs |
| Contains | JVM only | JVM + libraries | JRE + compiler and tools |
| User | End users/runtime | End users | Developers |
| Compiler | No | No | Yes (`javac`) |
| Example | Runs `.class` files | Runs JRE-based apps | Used to create `.java` → `.class` → output |

### Q. What is a compiler?
A compiler converts Java source code (`.java`) into bytecode (`.class`).

### Q. What is bytecode?
Bytecode is machine-understandable code executed by the JVM. It makes Java platform-independent.

### Q. Why does Java develop bytecode?
Java uses bytecode to achieve platform independence.

```text
(source code).java file → javac compiler → .class (bytecode)
.class file → JVM → machine code → output
```

- JVM is platform dependent.
- Bytecode is platform independent.
- Java is platform independent because of bytecode and JVM.

### How to install JDK
https://www.oracle.com/in/java/technologies/downloads/#java24

### Difference between C++, Java, and Python

| Feature | Python | Java | C++ |
| --- | --- | --- | --- |
| Typing | Dynamic | Static | Static |
| Compilation | Interpreted | Bytecode (JVM) | Native machine code |
| Speed | Slow | Medium | Fast |
| Memory management | Automatic | Automatic | Manual |
| Syntax | Very simple | Verbose | Complex |
| Use cases | AI, ML, Web | Android, Enterprise | Games, OS, Drivers |

---

## 3. Sample Application

```java
public class Demo {
    public static void main(String[] args) {
        // write logic here
    }
}
```

### Access modifiers in Java
Access modifiers decide the restriction level on a class and its members.

| Modifier | Same class | Same package | Subclass | Other packages |
| --- | --- | --- | --- | --- |
| public | ✅ | ✅ | ✅ | ✅ |
| protected | ✅ | ✅ | ✅ | ❌ (unless subclass) |
| default | ✅ | ✅ | ❌ | ❌ |
| private | ✅ | ❌ | ❌ | ❌ |

### 1. public in Java
When something is marked `public`, it is accessible from anywhere in the program.

### 2. What is static?
`static` means it belongs to the class, not to objects.

- Saves memory
- One copy shared across all objects
- Used for constants, utility methods, and `main`

### 3. void
`void` is a return type that means the method does not return any value.

### 4. main
`main` is the entry point of a Java program.

```java
public static void main(String[] args)
```

- `public` → JVM can access it
- `static` → JVM calls it without creating an object
- `void` → no return value required
- `main` → fixed method name
- `String[] args` → stores command-line arguments

### `System.out.println`
```java
System.out.println("Hello");
```

- `System` → predefined class in `java.lang`
- `out` → static variable for standard output
- `println()` → prints text and moves to next line

### Examples of editors
- Notepad
- WordPad
- Notepad++
- Sublime Text
- VS Code
- Atom

### How to compile a Java program
1. Open command prompt
2. Go to the folder where the `.java` file is saved
3. Run: `javac filename.java`
4. Run: `java filename`

---

## 4. Data Types in Java

### Q. What is a data type?
A data type decides the kind of value a variable can store.

### Primitive data types

| Data Type | Size | Range / Notes |
| --- | --- | --- |
| byte | 1 byte | -128 to 127 |
| short | 2 bytes | -32,768 to 32,767 |
| int | 4 bytes | -2,147,483,648 to 2,147,483,647 |
| long | 8 bytes | -2^63 to 2^63 - 1 |
| float | 4 bytes | Approx. 7 decimal digits |
| double | 8 bytes | Approx. 15–16 decimal digits |
| char | 2 bytes | Stores a Unicode character |
| boolean | JVM dependent | true / false |

### Default values

| Data Type | Default Value | Example |
| --- | --- | --- |
| byte | 0 | `byte b = 100;` |
| short | 0 | `short s = 200;` |
| int | 0 | `int x = 1000;` |
| long | 0L | `long l = 100000L;` |
| float | 0.0f | `float f = 3.14f;` |
| double | 0.0d | `double d = 99.99;` |
| char | `\u0000` | `char c = 'A';` |
| boolean | false | `boolean flag = true;` |

### Primitive example
```java
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
```

Output:
```text
Age: 21
Price: 19.99
Grade: A
Passed: true
```

### Referential (reference) data types
Reference data types store the address/reference of memory, not the actual value.

Examples:
- `String`
- Arrays
- Classes and objects
- Interfaces, enums, etc.

```java
public class NonPrimitiveDemo {
    public static void main(String[] args) {
        String name = "Harsh";
        int[] numbers = {1, 2, 3, 4};

        System.out.println("Name: " + name);
        System.out.println("First number: " + numbers[0]);
    }
}
```

Output:
```text
Name: Harsh
First number: 1
```

### Memory size of data types
```java
public class MemSizeApp {
    public static void main(String[] args) {
        int size = Integer.SIZE;
        System.out.println(size / 8);
    }
}
```

- `Integer.SIZE` gives bits
- `size / 8` converts bits to bytes
- So `int` occupies 4 bytes

```java
public class MemSizeApp {
    public static void main(String[] args) {
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("Min value is " + minValue);
        System.out.println("Max value is " + maxValue);
    }
}
```

Output:
```text
Min value is -2147483648
Max value is 2147483647
```

---

## 5. Operators in Java

### 1. Arithmetic operators
Used to perform mathematical calculations.

| Operator | Meaning |
| --- | --- |
| + | Addition |
| - | Subtraction |
| * | Multiplication |
| / | Division |
| % | Modulus / remainder |

### 2. Assignment operators
Used to assign values.

| Operator | Example | Equivalent to |
| --- | --- | --- |
| = | `x = 5` | `x = 5` |
| += | `x += 3` | `x = x + 3` |
| -= | `x -= 2` | `x = x - 2` |
| *= | `x *= 4` | `x = x * 4` |
| /= | `x /= 2` | `x = x / 2` |
| %= | `x %= 3` | `x = x % 3` |

### 3. Relational operators
Return `true` or `false`.

| Operator | Meaning | Example | Result |
| --- | --- | --- | --- |
| == | Equal to | `a == b` | false |
| != | Not equal to | `a != b` | true |
| > | Greater than | `a > b` | true |
| < | Less than | `a < b` | false |
| >= | Greater than or equal to | `a >= 10` | true |
| <= | Less than or equal to | `b <= 5` | true |

### 4. Logical operators
Logical operators combine conditions and work on boolean values.

- `&&` → Logical AND
- `||` → Logical OR
- `!` → Logical NOT

### 5. Increment and decrement operators
Used to increase or decrease a value by 1.

| Operator | Meaning |
| --- | --- |
| ++ | Increment by 1 |
| -- | Decrement by 1 |

#### Pre-increment / pre-decrement
Value is updated first, then used.

```java
public class PIAPP {
    public static void main(String[] args) {
        int a = 10, b;
        b = ++a;
        System.out.printf("A=%d\tB=%d\n", a, b);
    }
}
```

#### Post-increment / post-decrement
Value is used first, then updated.

```java
public class PIAPP {
    public static void main(String[] args) {
        int a = 10, b;
        b = a++;
        System.out.printf("A=%d\tB=%d\n", a, b);
    }
}
```

### 6. Conditional (ternary) operator
```java
condition ? expression1 : expression2;
```

- If the condition is true → first expression runs
- If false → second expression runs

```java
public class PIAPP {
    public static void main(String[] args) {
        int a = 11, b = 20;
        String msg = a > b ? "A is Greater" : "B is Greater";
        System.out.println(msg);
    }
}
```

### 7. Bitwise operators
Bitwise operators work on bits (0 and 1).

| Operator | Meaning |
| --- | --- |
| & | AND |
| | | OR |
| ^ | XOR |
| ~ | NOT |
| << | Left shift |
| >> | Right shift |
| >>> | Unsigned right shift |

---

## 6. Keyboard Input in Java

There are two main ways:
1. Command-line arguments
2. `Scanner` class

### Command-line arguments
```java
public class PIAPP {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String msg = a > b ? "A is Greater" : "B is Greater";
        System.out.println(msg);
    }
}
```

If you try:
```java
int a = args[0];
```
It will fail because `args[0]` is a `String`, not an `int`.

### Type casting / conversion
Use:
```java
Integer.parseInt(String)
```

```java
public class PIAPP {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String msg = a > b ? "A Is Greater" : "B is Greater";
        System.out.println(msg);
    }
}
```

Example:
```java
public class PIAPP {
    public static void main(String[] args) {
        int qty = Integer.parseInt(args[0]);
        int rate = Integer.parseInt(args[1]);
        int total = qty * rate;
        int gstAmt = total * 18 / 100;
        total = total + gstAmt;
        System.out.printf("Total is %d\n", total);
    }
}
```

### Salary calculation example
```java
public class PIAPP {
    public static void main(String[] args) {
        int bs = Integer.parseInt(args[0]);
        int da = bs * 30 / 100;
        int hra = bs * 30 / 100;
        int total = bs + da + hra;

        System.out.printf("Total salary is %d\n", total);
    }
}
```

### Profit/loss example
```java
public class PLAPP {
    public static void main(String[] args) {
        int sp = Integer.parseInt(args[0]);
        int cp = Integer.parseInt(args[1]);
        String msg = sp > cp ? "Profit : " + (sp - cp) : "Loss : " + (sp - cp);
        System.out.printf("%s", msg);
    }
}
```

---

## 7. Scanner Class

### Package and import
A package is a collection of related classes and interfaces.

```java
import java.util.Scanner;
```

or

```java
import java.util.*;
```

### Create `Scanner` object
```java
Scanner xyz = new Scanner(System.in);
```

### Common methods of `Scanner`
- `nextInt()`
- `nextFloat()`
- `nextDouble()`
- `nextLong()`
- `nextLine()`
- `nextShort()`
- `nextByte()`

### Example
```java
import java.util.*;

public class SAPP {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter two values");
        a = xyz.nextInt();
        b = xyz.nextInt();
        c = a + b;

        System.out.printf("Addition is %d\n", c);
    }
}
```

### Reverse a 3-digit number
```java
import java.util.*;

public class NRA {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter number from keyboard");
        int no = xyz.nextInt();

        System.out.printf("Before Reverse is %d\n", no);
        no = (no % 10) * 100 + ((no / 10) % 10) * 10 + no / 100;
        System.out.printf("After Reverse is %d\n", no);
    }
}
```

### Swap first and last digits of a 4-digit number
```java
import java.util.*;

public class SFLAPP {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        int no, first, last;

        System.out.print("Enter four digit number: ");
        no = xyz.nextInt();

        System.out.printf("\nBefore swap digit %d\n", no);
        last = no % 10;
        first = no / 1000;
        no = no / 10;
        no = no % 100;
        last = last * 1000;
        no = no * 10;
        no = last + no + first;

        System.out.printf("After Swap digit %d\n", no);
    }
}
```

### Sum of digits of a 4-digit number
```java
import java.util.*;

public class SFLAPP {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        int no, rem, sum = 0;

        System.out.print("Enter four digit number: ");
        no = xyz.nextInt();

        rem = no % 10;
        no = no / 10;
        sum = sum + rem;

        rem = no % 10;
        no = no / 10;
        sum = sum + rem;

        rem = no % 10;
        no = no / 10;
        sum = sum + rem;

        rem = no % 10;
        no = no / 10;
        sum = sum + rem;

        System.out.printf("Sum is %d\n", sum);
    }
}
```

---

## 8. Number System

### Types of number system
1. Binary → base 2 (`0, 1`)
2. Decimal → base 10 (`0 to 9`)
3. Octal → base 8 (`0 to 7`)
4. Hexadecimal → base 16 (`0 to 9, A to F`)

### Binary number system
- Contains only `0` and `1`
- Base is `2`
- Example: `(10101)_2`

### Decimal number system
- Contains digits `0 to 9`
- Base is `10`
- Example: `(1234)_{10}`

### Octal number system
- Contains digits `0 to 7`
- Base is `8`
- Example: `(12345)_8`

### Hexadecimal number system
- Contains `0 to 15`
- After 9, use `A, B, C, D, E, F`
- Base is `16`
- Example: `(45678A)_{16}`

### Summary table

| Number System | Base | Digits Used |
| --- | --- | --- |
| Binary | 2 | 0, 1 |
| Decimal | 10 | 0–9 |
| Octal | 8 | 0–7 |
| Hexadecimal | 16 | 0–9, A–F |

### Decimal to binary conversion
Steps:
1. Divide by 2
2. Write remainder
3. Repeat until quotient becomes 0
4. Read remainders from bottom to top

Example: `5` → `0101`

| Division | Quotient | Remainder |
| --- | --- | --- |
| 5 ÷ 2 | 2 | 1 |
| 2 ÷ 2 | 1 | 0 |
| 1 ÷ 2 | 0 | 1 |

Result: `101` in binary, written as `0101`

---

## 9. One’s Complement and Two’s Complement

### One’s complement
Invert each bit:
- `0 → 1`
- `1 → 0`

Example:
```text
0101
1010
```

### Two’s complement
- Find one’s complement
- Add `1`

Example:
```text
0101
1010
+ 0001
-----
1011
```

Result: `1011`

---

## 10. Bitwise Operations

### AND operation (`&`)
If both inputs are 1, output is 1; otherwise 0.

| A | B | A & B |
| --- | --- | --- |
| 0 | 0 | 0 |
| 0 | 1 | 0 |
| 1 | 0 | 0 |
| 1 | 1 | 1 |

```java
public class BAPP {
    public static void main(String[] args) {
        int a = 5, b = 6, c;
        c = a & b;
        System.out.printf("C is %d\n", c);
    }
}
```

### OR operation (`|`)
If any input is 1, output is 1.

| A | B | A | B |
| --- | --- | --- |
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 1 |

```java
public class BAPP {
    public static void main(String[] args) {
        int a = 15, b = 14, c;
        c = a | b;
        System.out.printf("C is %d\n", c);
    }
}
```

### XOR operation (`^`)
If inputs are different, result is 1; if same, result is 0.

| A | B | A ^ B |
| --- | --- | --- |
| 0 | 0 | 0 |
| 0 | 1 | 1 |
| 1 | 0 | 1 |
| 1 | 1 | 0 |

```java
public class BAPP {
    public static void main(String[] args) {
        int a = 15, b = 14, c;
        c = a ^ b;
        System.out.printf("C is %d\n", c);
    }
}
```

### Left shift (`<<`)
Formula:
```text
a << n = a × 2^n
```

Example:
```java
public class BAPP {
    public static void main(String[] args) {
        int a = 5, b;
        b = a << 2;
        System.out.printf("B is %d\n", b);
    }
}
```

Binary:
```text
00000101 << 2 = 00010100
```

Result: `20`

### Right shift (`>>`)
Formula:
```text
a >> n = a ÷ 2^n
```

Example:
```java
public class BAPP {
    public static void main(String[] args) {
        int a = 20, b;
        b = a >> 2;
        System.out.printf("B is %d\n", b);
    }
}
```

Binary:
```text
00010100 >> 2 = 00000101
```

Result: `5`

---

## 11. Operator Precedence

Operator precedence decides the order of execution in an expression.

| Priority | Operators | Associativity |
| --- | --- | --- |
| 1 | `()`, `[]`, `.`, post `++`, post `--` | Left to right |
| 2 | pre `++`, pre `--`, unary `+`, unary `-`, `!`, `~` | Right to left |
| 3 | `*`, `/`, `%` | Left to right |
| 4 | `+`, `-` | Left to right |
| 5 | `<<`, `>>`, `>>>` | Left to right |
| 6 | `<`, `>`, `<=`, `>=` | Left to right |
| 7 | `==`, `!=` | Left to right |
| 8 | `&` | Left to right |
| 9 | `^` | Left to right |
| 10 | `|` | Left to right |
| 11 | `&&` | Left to right |
| 12 | `||` | Left to right |
| 13 | `?:` | Right to left |
| 14 | `=`, `+=`, `-=`, `*=`, `/=` | Right to left |

Example:
```java
public class OAPP {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x++ == 6 && ++x == 8);
    }
}
```

Output:
```text
true
```

### Example with increment and precedence
```java
public class OAPP {
    public static void main(String[] args) {
        int x = 6;
        int b = x++ + ++x + x;

        System.out.printf("x = %d\tb = %d\n", x, b);
    }
}
```

Output: `x = 8, b = 22`

### Another example
```java
public class OAPP {
    public static void main(String[] args) {
        int a, b = 2;
        a = 5 * 2 + 5 + ++b >> 2 & 6 ^ 7 << 2;
        System.out.printf("a=%d; b=%d\n", a, b);
    }
}
```

Priority order used:
1. `++` (pre)
2. `*`
3. `+`
4. `>>`, `<<`
5. `&`
6. `^`

Calculation:
```text
5*2+5+3>>2 & 6^7<<2
10+5+3>>2 & 6^7<<2
15+3>>2 & 6^7<<2
18 >> 2 & 6 ^ 7 << 2
4 & 6 ^ 7 << 2
4 & 6 ^ 28
4 ^ 28
24
```

---

## 12. Final Notes

- Java is platform independent due to bytecode + JVM.
- `JVM` is platform dependent.
- `JRE` is for running Java applications.
- `JDK` is for developing and running Java applications.
- `main` is the starting point of every Java program.
- Operators are used to perform computations and comparisons.
- `Scanner` helps take input from the keyboard.

























