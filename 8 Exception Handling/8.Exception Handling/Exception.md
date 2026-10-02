# Exception Handling in Java

[Overview](#exception-handling-overview) | [Types of Exceptions](#types-of-exceptions) | [Exception Hierarchy](#exception-hierarchy) | [Keywords](#keywords-in-exception-handling) | [throw vs throws](#throw-vs-throws) | [User Defined Exceptions](#user-defined-exception) | [Common Examples](#common-exception-examples) | [Try with Resources](#try-with-resources)

---

## Exception Handling Overview

An exception is an event that occurs during program execution and disrupts the normal flow of the program.

### What is exception handling?

Exception handling is the process of:

- detecting runtime errors
- handling them properly
- preventing abrupt program termination
- continuing the normal flow of the application

### Goals of exception handling

- identify runtime problems
- provide meaningful error messages
- execute alternative logic
- keep the application stable

---

## Types of Exceptions

### 1. Checked Exceptions

- checked by the compiler
- must be handled using `try-catch` or `throws`
- examples: `IOException`, `SQLException`, `ClassNotFoundException`

### 2. Unchecked Exceptions

- occur at runtime
- not checked by the compiler
- examples: `ArithmeticException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`

### 3. Errors

- serious system-level problems
- usually cannot be handled by the programmer
- examples: `OutOfMemoryError`, `StackOverflowError`

> Note: Checked exceptions are not "occurring at compile time"; they are checked by the compiler at compile time.

---

## Exception Hierarchy

At the top of the hierarchy is:

```java
java.lang.Throwable
```

`Throwable` is the parent class of all errors and exceptions.

```java
Throwable
├── Error
│   ├── OutOfMemoryError
│   ├── StackOverflowError
│   └── ...
└── Exception
    ├── Checked Exceptions
    │   ├── IOException
    │   ├── SQLException
    │   └── ...
    └── RuntimeException
        ├── ArithmeticException
        ├── NullPointerException
        ├── ArrayIndexOutOfBoundsException
        └── ...
```

### Error

- represents serious problems
- caused by JVM/system
- generally not recoverable

### Exception

- represents problems that can be handled
- occurs during runtime

### Key points

- `Throwable` is the root class
- `Error` → cannot be handled normally
- `Exception` → can be handled
- checked exceptions → compiler enforces handling
- unchecked exceptions → occur at runtime

---

## Keywords in Exception Handling

### 1. try

Used to write code that may raise an exception.

```java
try
{
    int a = 10 / 0;
}
```

A single `try` block can have multiple `catch` blocks.

### 2. catch

Used to handle the exception.

```java
catch (ArithmeticException e)
{
    System.out.println("Cannot divide by zero");
}
```

### 3. finally

Used for cleanup code.

- always executes whether exception occurs or not
- used to close files, DB connections, etc.

```java
finally
{
    System.out.println("This executes always");
}
```

> `finally` does not handle the exception itself. It only executes the code written in it.

### 4. throw

Used to manually throw an exception.

```java
throw new ArithmeticException("Custom Error");
```

### 5. throws

Used to declare exceptions in the method signature.

```java
void divide() throws ArithmeticException
{
    int a = 10 / 0;
}
```

---

## throw vs throws

| Keyword | Purpose | Used in | Can throw |
| ------- | ------- | ------- | --------- |
| `throw` | manually throw exception | inside method | one exception object |
| `throws` | declare exception | method signature | multiple exceptions |

### Example

```java
class Div
{
    void setValue(int x, int y)
    {
        int z = x / y;
        System.out.println("Division is " + z);
    }
}

public class CheckVoterApplication
{
    public static void main(String[] args)
    {
        try
        {
            Div d = new Div();
            d.setValue(10, 2);
        }
        catch(Exception ex)
        {
            System.out.println("Error is " + ex);
        }
    }
}
```

---

## User Defined Exception

A user-defined exception is a custom exception created by the programmer.

### Why use it?

- no suitable built-in exception exists
- application-specific validation is needed
- custom error messages are required

### Example

```java
import java.util.*;

class VoterException extends RuntimeException
{
    VoterException(String msg)
    {
        super(msg);
    }
}

public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();

        if(age < 18)
        {
            throw new VoterException("You are not eligible for voting");
        }

        System.out.println("You can vote");
    }
}
```

### Output cases

```text
Input: 15
Output: Exception -> You are not eligible for voting
```

```text
Input: 20
Output: You can vote
```

### Important points

- `throw` is used inside method
- it throws one exception at a time
- it requires an object creation

---

## Multiple Catch Example

```java
try
{
    int a = 10 / 0;
}
catch (ArithmeticException e)
{
    System.out.println(e);
}
catch (Exception e)
{
    System.out.println("General Exception");
}
```

### Important notes

- one `try` can have multiple `catch` blocks
- `Exception` is the parent class of most exceptions
- `finally` does not handle exceptions directly

---

## `try`, `catch`, and `finally` together

```java
import java.util.*;

public class TestNumFormApp
{
    public static void main(String[] args)
    {
        Scanner xyz = new Scanner(System.in);
        int a, b, c;

        try
        {
            System.out.println("Enter two values");
            a = xyz.nextInt();
            b = xyz.nextInt();
            c = a / b;
            System.out.println("Division is " + c);
        }
        catch(Exception ex)
        {
            System.out.println("Error is " + ex);
        }
        finally
        {
            System.out.println("I can execute every time");
        }
    }
}
```

> `finally` always executes after `try/catch` block, unless JVM is terminated abruptly.

---

## catch vs finally

| catch | finally |
| ----- | ------- |
| handles exception | does not handle exception |
| executes only when exception occurs | executes always |
| has exception parameter | no parameter |

---

## final vs finally vs finalize()

| Keyword/Method | Use |
| ------------- | --- |
| `final` | constant variable / prevent override / inheritance |
| `finally` | cleanup block in exception handling |
| `finalize()` | method called by garbage collector before destroying an object |

> `finalize()` is deprecated in modern Java.

---

## Common Exception Examples

### 1. ArithmeticException

```java
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        Scanner xyz = new Scanner(System.in);
        int a, b, c;

        System.out.println("Enter two values");
        a = xyz.nextInt();
        b = xyz.nextInt();

        try
        {
            c = a / b;
            System.out.println("division is " + c);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Error is " + ex);
        }
    }
}
```

### 2. NullPointerException

```java
public class Test
{
    static int a[];

    public static void main(String[] args)
    {
        try
        {
            a[0] = 100;
            System.out.println(a[0]);
        }
        catch(Exception ex)
        {
            System.out.println("Error is " + ex);
        }
    }
}
```

### 3. ArrayIndexOutOfBoundsException

```java
import java.util.*;

public class ExApplication
{
    public static void main(String[] args)
    {
        try
        {
            int a[] = new int[2];
            a[0] = 100;
            a[1] = 200;
            a[2] = 300;
            System.out.println(a[2]);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Array limit cross");
        }
    }
}
```

### 4. NumberFormatException

```java
import java.util.*;

public class TestNumFormApp
{
    public static void main(String[] args)
    {
        try
        {
            String s = "1234 ";
            int val = Integer.parseInt(s);
            System.out.println(val);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Error is " + ex);
        }
    }
}
```

### 5. NegativeArraySizeException

```java
public class Test
{
    public static void main(String[] args)
    {
        try
        {
            int size = -5;
            int arr[] = new int[size];
        }
        catch(NegativeArraySizeException ex)
        {
            System.out.println("Array size cannot be negative");
        }
    }
}
```

### 6. StringIndexOutOfBoundsException

```java
public class Test
{
    public static void main(String[] args)
    {
        try
        {
            String s = "Java";
            System.out.println(s.charAt(10));
        }
        catch(StringIndexOutOfBoundsException ex)
        {
            System.out.println("Invalid index for string");
        }
    }
}
```

---

## Try with Resources

Introduced in Java 7, try-with-resources automatically closes resources.

### Example

```java
import java.util.*;

public class ExeApplication
{
    public static void main(String[] args)
    {
        try (Scanner xyz = new Scanner(System.in))
        {
            System.out.println("Enter two values");
            int a = xyz.nextInt();
            int b = xyz.nextInt();
            int c = a / b;
            System.out.println("division " + c);
        }
        catch (ArithmeticException | InputMismatchException ex)
        {
            System.out.println("Division is " + ex);
        }
    }
}
```

### Important point

Try-with-resources automatically closes the resource when the block ends.

---

## Final Revision

- `Exception` is an event that breaks normal execution.
- `Exception Handling` keeps the program safe and stable.
- `try` contains risky code.
- `catch` handles the exception.
- `finally` executes always.
- `throw` manually throws an exception.
- `throws` declares exceptions in method signature.
- custom exceptions are created by extending `Exception` or `RuntimeException`.
- `try-with-resources` helps close resources automatically.
