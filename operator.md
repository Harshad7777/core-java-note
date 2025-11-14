
# **Core Java Notes**

## **Table of Contents**

1. [Language Comparison](#language-comparison)
2. [Access Modifiers](#access-modifiers)
3. [Keywords & Concepts](#keywords--concepts)
4. [Data Types](#data-types)
5. [Operators](#operators)
6. [Input Methods](#input-methods)

---

# **Language Comparison**

## **Python vs Java vs C++**

### **1. Basic Nature**

| Language | Nature |
| -------- | ------ |

# **Data Types**

| Type    | Size    | Example           |
|---------|---------|-------------------|
| int     | 4 bytes | int x = 10;       |
| float   | 4 bytes | float f = 2.3f;   |
| double  | 8 bytes | double d = 3.14;  |
| char    | 2 bytes | char c = 'A';     |
| boolean | 1 bit   | boolean b = true; |
- **Python**: Simple, fewer lines, indentation-based

# **Operators**

## **Arithmetic Operators**

| Operator | Meaning        | Example   |
|----------|---------------|-----------|
| +        | Addition      | a + b     |
| -        | Subtraction   | a - b     |
| *        | Multiplication| a * b     |
| /        | Division      | a / b     |
| %        | Modulus       | a % b     |
x = 10    # int

## **Relational Operators**

| Operator | Meaning           | Example   |
|----------|------------------|-----------|
| ==       | Equal to         | a == b    |
| !=       | Not equal to     | a != b    |
| >        | Greater than     | a > b     |
| <        | Less than        | a < b     |
| >=       | Greater or equal | a >= b    |
| <=       | Less or equal    | a <= b    |
```

## **Logical Operators**

| Operator | Meaning | Example   |
|----------|---------|-----------|
| &&       | AND     | a && b    |
| ||       | OR      | a || b    |
| !        | NOT     | !a        |
| **Python** | Automatic (garbage collector) |

# **Input Methods**

## **1. Using Scanner**

```java
import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s = sc.nextLine();
    }
}
```

## **2. Using BufferedReader**

```java
import java.io.*;

public class InputExample2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        String s = br.readLine();
    }
}
```
| ----------------- | ----------- | ------------------- | ------------------- |
| Typing            | Dynamic     | Static              | Static              |
| Compilation       | Interpreted | Bytecode (JVM)      | Native Machine Code |
| Speed             | Slow        | Medium              | Fast                |
| Memory Management | Automatic   | Automatic           | Manual              |
| Syntax            | Very simple | Verbose             | Complex             |
| Use Cases         | AI, ML, Web | Android, Enterprise | Games, OS, Drivers  |

---

## Feature Comparison Table


# **Access Modifiers**

| Modifier      | Same Class | Same Package | Subclass | Other Packages |
|--------------|:----------:|:------------:|:--------:|:--------------:|
| **public**   | ✅         | ✅           | ✅       | ✅             |
| **protected**| ✅         | ✅           | ✅       | ❌             |
| **default**  | ✅         | ✅           | ❌       | ❌             |
| **private**  | ✅         | ❌           | ❌       | ❌             |

---


# **Keywords & Concepts**

## **static Keyword**

**static** means the member belongs to the class, not objects.

- **Static Variables**: Shared across all objects
- **Static Methods**: Called without object creation
- **Static Block**: Runs once when class loads

## **void Return Type**

**void** means method returns no value.

## **main() Method**

```java
public static void main(String[] args)
```

| Component | Reason |
| --------- | ------ |
| **public** | Accessible by JVM |
| **static** | Called without object |
| **void** | No return value |


---

## System.out.println in Java

Used to print output to the console.

### Structure

| Component | Description |
| --------- | ----------- |
| **System** | A predefined class in java.lang package. Provides access to system-level stuff (input, output, error, etc.) |
| **out** | A static variable of type PrintStream inside System class. Represents the standard output stream (usually the console). |
| **println()** | A method of PrintStream class. Prints text to the console and moves the cursor to the next line. |

# Data Types

## Primitive Data Types

| Data Type | Size | Range |
| --------- | ---- | ----- |
| **byte** | 1 | -128 to 127 |
| **short** | 2 | -32,768 to 32,767 |
| **int** | 4 | -2.1B to 2.1B |
| **long** | 8 | -2 to 2-1 |
| **float** | 4 | 7 digits precision |
| **double** | 8 | 15-16 digits precision |
| **char** | 2 | Unicode character |
| **boolean** | 1 bit | true/false |

---

✅ B) Non-Primitive Data Types (Reference types)

Created by programmers or from libraries.

Examples:

String → "Hello"

Arrays → int[] arr = {1,2,3};

Classes & Objects → Car myCar = new Car();

Interfaces, Enums, etc.

# Operators

## Arithmetic Operators

| Operator | Meaning | Example |
| -------- | ------- | ------- |
| + | Addition | 10 + 5 |
| - | Subtraction | 10 - 5 |
| * | Multiplication | 10 * 5 |
| / | Division | 10 / 5 |
| % | Modulus | 10 % 3 |

## Relational Operators

| Operator | Meaning | Example |
| -------- | ------- | ------- |
| == | Equal to | a == b |
| != | Not equal | a != b |
| > | Greater than | a > b |
| < | Less than | a < b |

## Logical Operators

| Operator | Meaning |
| -------- | ------- |
| && | AND |
| \|\| | OR |
| ! | NOT |

---

# Input Methods

## Method 1: Command Line Arguments

\\\java
public class Test {
    public static void main(String[] args) {
        int qty = Integer.parseInt(args[0]);
    }
}
\\\

## Method 2: Scanner Class

\\\java
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
    }
}
\\\

**Last Updated:** November 13, 2025
