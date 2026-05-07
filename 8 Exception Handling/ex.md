# Exception Handling in Java

## Q. What is an Exception?

An Exception is an event that occurs during program execution (runtime) which disturbs the normal flow of the program.

### Definition

Exception is an event which occurs at program runtime and is responsible for disturbing the normal flow of application called an exception.

---

# Q. What is Exception Handling?

Exception handling is a mechanism used to:

* Detect runtime errors
* Prevent abnormal termination of program
* Continue program execution smoothly

## Goals of Exception Handling

1. Detect runtime errors
2. Help developers understand runtime problems
3. Skip problematic code
4. Customize error messages according to project requirements

---

# Types of Exceptions in Java

## 1. Checked Exception

Checked exceptions occur at compile time.

### Purpose

To warn developers about possible exceptions during compilation.

### Examples

* IOException
* SQLException
* ClassNotFoundException

---

## 2. Unchecked Exception

Unchecked exceptions occur at runtime.

### Examples

* ArithmeticException
* NullPointerException
* ArrayIndexOutOfBoundsException

---

## 3. Error

Errors occur at runtime but are not handled by programmers.

### Examples

* StackOverflowError
* OutOfMemoryError

---

# Exception Handling Keywords in Java

Java provides 5 keywords for exception handling:

1. try
2. catch
3. finally
4. throw
5. throws

---

# 1. try Block

The `try` block contains code that may generate an exception.

### Syntax

```java id="try1"
try {
    // risky code
}
```

### Important Points

* Exception-prone code is written inside try block
* JVM creates exception object when exception occurs
* JVM transfers control to catch block

---

# 2. catch Block

The `catch` block handles the exception generated in try block.

### Syntax

```java id="catch1"
catch(ExceptionType ex) {
    // handling code
}
```

---

# Example 1: ArithmeticException

## Explanation

Division by zero generates ArithmeticException.

```java id="arith1"
public class Test {
    public static void main(String args[]) {

        try {
            int a = 10;
            int b = 0;

            int c = a / b;

            System.out.println(c);
        }
        catch(ArithmeticException ex) {
            System.out.println("Error is " + ex);
        }
    }
}
```

---

# Example 2: NullPointerException

## Explanation

Occurs when object reference is null.

```java id="null1"
class ABC {

    void show() {
        System.out.println("I am show");
    }
}

public class ExApplication {

    static ABC a1;

    public static void main(String x[]) {

        try {
            a1.show();
        }
        catch(NullPointerException ex) {
            System.out.println("Error is " + ex);
        }
    }
}
```

---

# Example 3: ArrayIndexOutOfBoundsException

## Explanation

Occurs when array index exceeds array size.

```java id="array1"
public class ExApplication {

    public static void main(String x[]) {

        try {

            int a[] = new int[2];

            a[0] = 100;
            a[1] = 200;

            a[2] = 300;

            System.out.println(a[2]);
        }
        catch(ArrayIndexOutOfBoundsException ex) {

            System.out.println("Array limit crossed");
        }
    }
}
```

---

# Example 4: NumberFormatException

## Explanation

Occurs during invalid String to number conversion.

```java id="num1"
public class TestNumFormApp {

    public static void main(String x[]) {

        try {

            String s = "ABC";

            int val = Integer.parseInt(s);

            System.out.println(val);
        }
        catch(NumberFormatException ex) {

            System.out.println("Error is " + ex);
        }
    }
}
```

---

# Example 5: NegativeArraySizeException

## Explanation

Occurs when array size is negative.

```java id="neg1"
public class Test {

    public static void main(String args[]) {

        try {

            int a[] = new int[-5];
        }
        catch(NegativeArraySizeException ex) {

            System.out.println("Negative array size not allowed");
        }
    }
}
```

---

# Example 6: StringIndexOutOfBoundsException

## Explanation

Occurs when string index exceeds length.

```java id="str1"
public class Test {

    public static void main(String args[]) {

        try {

            String s = "Java";

            System.out.println(s.charAt(10));
        }
        catch(StringIndexOutOfBoundsException ex) {

            System.out.println("Invalid String Index");
        }
    }
}
```

---

# Multiple catch Blocks

A single try block can have multiple catch blocks.

```java id="multi1"
import java.util.*;

public class TestNumFormApp {

    public static void main(String x[]) {

        Scanner xyz = new Scanner(System.in);

        try {

            int a, b, c;

            System.out.println("Enter two values");

            a = xyz.nextInt();
            b = xyz.nextInt();

            c = a / b;

            System.out.println("Division is " + c);
        }
        catch(ArithmeticException ex) {

            System.out.println(ex);
        }
        catch(InputMismatchException ex) {

            System.out.println("Error is " + ex);
        }
    }
}
```

---

# Finally Block

The `finally` block executes whether exception occurs or not.

## Uses

* Close database connection
* Close files
* Cleanup code

```java id="finally1"
public class Test {

    public static void main(String args[]) {

        try {

            int a = 10 / 0;
        }
        catch(Exception ex) {

            System.out.println("Error is " + ex);
        }
        finally {

            System.out.println("I always execute");
        }
    }
}
```

---

# Difference Between catch and finally

| catch                               | finally                   |
| ----------------------------------- | ------------------------- |
| Handles exception                   | Does not handle exception |
| Executes only when exception occurs | Executes always           |
| Requires exception parameter        | No parameter needed       |

---

# final vs finally vs finalize()

| Feature    | Meaning |
| ---------- | ------- |
| final      | Keyword |
| finally    | Block   |
| finalize() | Method  |

---

## final Keyword

Used with:

* Variable → constant
* Method → cannot override
* Class → cannot inherit

---

## finally Block

Executes in every situation.

---

## finalize() Method

Used during garbage collection.

```java id="finalize1"
protected void finalize() {
    System.out.println("Object destroyed");
}
```

---

# throw Keyword

Used to manually throw exception.

```java id="throw1"
public class Test {

    public static void main(String args[]) {

        int age = 15;

        if(age < 18) {

            throw new ArithmeticException("Not eligible for voting");
        }
    }
}
```

---

# User Defined Exception

## Definition

Exception created by developer according to project requirements.

---

# Creating User Defined Exception

```java id="user1"
class VoterException extends RuntimeException {

    VoterException(String msg) {

        super(msg);
    }
}
```

---

# User Defined Exception Example

```java id="user2"
public class VotingApp {

    public static void main(String args[]) {

        int age = 15;

        try {

            if(age < 18) {

                throw new VoterException("You are not eligible for voting");
            }

            System.out.println("Eligible");
        }
        catch(VoterException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
```

---

# throws Keyword

Used with method declaration to handle checked exceptions.

```java id="throws1"
class Div {

    void setValue(int x, int y)
            throws ArithmeticException {

        int z = x / y;

        System.out.println("Division is " + z);
    }
}

public class Test {

    public static void main(String args[]) {

        try {

            Div d = new Div();

            d.setValue(10, 0);
        }
        catch(Exception ex) {

            System.out.println("Error is " + ex);
        }
    }
}
```

---

# Difference Between throw and throws

| throw                     | throws                          |
| ------------------------- | ------------------------------- |
| Used inside method        | Used with method declaration    |
| Throws single exception   | Can declare multiple exceptions |
| Used for manual exception | Used for checked exceptions     |

---

# Try With Resources (JDK 1.7)

Used for automatic resource closing.

```java id="resource1"
import java.util.*;

public class ExeApplication {

    public static void main(String x[]) {

        try(Scanner xyz = new Scanner(System.in)) {

            System.out.println("Enter two values");

            int a = xyz.nextInt();
            int b = xyz.nextInt();

            int c = a / b;

            System.out.println("Division is " + c);
        }
        catch(ArithmeticException | InputMismatchException ex) {

            System.out.println("Error is " + ex);
        }
    }
}
```

---

# Important Notes

1. Exception class is parent of all exception classes
2. Single try can have multiple catch blocks
3. finally always executes
4. Checked exceptions occur at compile time
5. Unchecked exceptions occur at runtime
