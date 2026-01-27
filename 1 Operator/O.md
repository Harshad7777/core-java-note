# 1. Introduction to Java

## Q. What is Java?

Java is a high-level, object-oriented programming language.

## Features of Java

### 1. Simple

* Easy to learn and understand
* Syntax is similar to C and C++
* No complex features like pointers

### 2. Object-Oriented

* Everything is based on objects and classes
* Supports OOP concepts:

  * Encapsulation
  * Inheritance
  * Polymorphism
  * Abstraction

### 3. Platform Independent

* Write Once, Run Anywhere
* Java programs run on JVM, not directly on hardware

### 4. Portable

* Java bytecode can run on any system
* No system-dependent features

### 5. Secure

* No use of pointers
* Uses bytecode verification
* Runs inside JVM sandbox

### 6. Robust

* Strong memory management
* Automatic garbage collection
* Good exception handling

### 7. Multithreaded

* Supports multiple threads
* Helps in faster execution and better performance

### 8. High Performance

* Uses Just-In-Time (JIT) compiler
* Faster than traditional interpreted languages

### 9. Distributed

* Supports distributed applications
* Uses technologies like RMI and Web Services

### 10. Dynamic

* Classes are loaded at runtime
* Supports dynamic memory allocation

---

## Q. What is Object-Oriented Programming (OOP)?

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
5. Abstraction & Encapsulation
6. Dynamic Binding
7. Message Passing

**Note:** Java is not purely object-oriented; it implements OOP concepts.

---

# 2. Java Development Environment

## Steps to work with Java

1. Install JDK
2. Create Java program
3. Compile program
4. Run program

## JVM vs JRE vs JDK

| Feature    | JVM                               | JRE                          | JDK                          |
| ---------- | --------------------------------- | ---------------------------- | ---------------------------- |
| Definition | Runs Java bytecode                | Environment to run Java apps | Kit to develop & run Java    |
| Purpose    | Converts bytecode to machine code | Runs Java programs           | Develops and runs programs   |
| Contains   | Only JVM                          | JVM + libraries              | JRE + tools (`javac`, `jar`) |
| Compiler   | ❌ No                              | ❌ No                         | ✅ Yes                        |

---

## Q. What is a Compiler?

A compiler converts `.java` source code into `.class` bytecode.

## Q. What is Bytecode?

Bytecode is platform-independent code executed by the JVM.

### Execution Flow

```
.java → javac → .class → JVM → Machine Code → Output
```

* JVM → Platform Dependent
* Bytecode → Platform Independent
* Java → Platform Independent

---

## Sample Java Application

```java
access specifier class className {
    public static void main(String x[]) {
        // logic
    }
}
```

---

## Access Specifiers in Java

| Modifier  | Same Class | Same Package | Subclass | Other Package |
| --------- | ---------- | ------------ | -------- | ------------- |
| public    | ✅          | ✅            | ✅        | ✅             |
| protected | ✅          | ✅            | ✅        | ❌             |
| default   | ✅          | ✅            | ❌        | ❌             |
| private   | ✅          | ❌            | ❌        | ❌             |

---

## static Keyword

* Belongs to class, not objects
* Saves memory
* Used for main method, constants, utility methods

### Uses

1. Static variables
2. Static methods
3. Static block

---

## void Keyword

* Method returns no value
* Used when result is not required

### Why main is void?

JVM does not expect a return value.

---

## main Method

* Entry point of Java program
* Must be `public static void main(String[] args)`

---

## System.out.println

* `System` → class
* `out` → static PrintStream
* `println()` → prints output

---

## Data Types in Java

### Primitive Data Types

| Type    | Size          | Range                           |
| ------- | ------------- | ------------------------------- |
| byte    | 1             | -128 to 127                     |
| short   | 2             | -32,768 to 32,767               |
| int     | 4             | -2,147,483,648 to 2,147,483,647 |
| long    | 8             | -2^63 to 2^63-1                 |
| float   | 4             | ~7 digits                       |
| double  | 8             | ~15 digits                      |
| char    | 2             | Unicode                         |
| boolean | JVM dependent | true/false                      |

---

### Reference Data Types

* String
* Arrays
* Classes
* Interfaces

---

## Operators in Java

### Types

* Arithmetic
* Assignment
* Relational
* Logical
* Increment / Decrement
* Bitwise
* Conditional

---

## Scanner Class

### Steps

1. Import `java.util.*`
2. Create Scanner object
3. Use methods like `nextInt()`

```java
Scanner sc = new Scanner(System.in);
```

---

## Number System

| System      | Base | Digits   |
| ----------- | ---- | -------- |
| Binary      | 2    | 0,1      |
| Decimal     | 10   | 0-9      |
| Octal       | 8    | 0-7      |
| Hexadecimal | 16   | 0-9, A-F |

---

## Complement

* One's Complement → invert bits
* Two's Complement → one's complement + 1

---

## Bitwise Operators

* & AND
* | OR
* ^ XOR
* ~ NOT
* << Left shift
* > > Right shift

---

## Operator Precedence

Higher precedence executes first.

---

## Conclusion

This document preserves the **original content and logic**, formatted cleanly in Markdown for study, GitHub, or PDF conversion.
