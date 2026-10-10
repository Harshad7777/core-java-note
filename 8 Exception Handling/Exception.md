---

# ✅ Exception in Java (Correct Explanation)

### 🔹 What is an Exception?

An **exception** is an event that occurs during program execution (runtime) which **disrupts the normal flow of the program**.

---

### 🔹 What is Exception Handling?

**Exception handling** is a mechanism to:

* detect runtime errors
* handle them properly
* prevent program termination

👉 **Goals of Exception Handling:**

* Identify runtime errors
* Maintain normal program flow
* Provide meaningful error messages
* Execute alternative logic when an error occurs-

---

# ✅ Types of Exceptions in Java

### 1. Checked Exceptions

* Checked at **compile time**
* Must be handled using `try-catch` or `throws`
* Example: `IOException`, `SQLException`

👉 ✔ Correction:
They **do not occur at compile time**, but are **checked by the compiler**

---

### 2. Unchecked Exceptions

* Occur at **runtime**
* Not checked by compiler
* Example:

  * `ArithmeticException`
  * `NullPointerException`
  * `ArrayIndexOutOfBoundsException`

---

### 3. Errors

* Serious problems
* Cannot be handled by programmer
* Example: `OutOfMemoryError`, `StackOverflowError`

---
If  we want to work with exception in java so JAVA provide some inbuilt classes and interfaces to us for handle the different types of exceptions 

---

# ✅ Exception Hierarchy in Java

At the top of the hierarchy:

### 🔹 `java.lang.Throwable`

* It is the **parent class of all errors and exceptions**
* Anything that can be thrown in Java must be a subclass of `Throwable`

---

# 🔻 Two Main Categories

## 1. 🔴 Error (`java.lang.Error`)

* Represents **serious problems**
* Caused by JVM/system
* **Cannot be handled by programmer**

### Examples:

* `OutOfMemoryError`
* `StackOverflowError`
* `InternalError`

👉 ✔ Used for **system-level failures**

---

## 2. 🔵 Exception (`java.lang.Exception`)

* Represents **problems that can be handled**
* Occur during program execution

---

# 🔻 Types of Exceptions

## ✅ 1. Checked Exceptions

* Checked at **compile time**
* Must be handled using `try-catch` or `throws`

### Examples:

* `IOException`
* `SQLException`
* `ClassNotFoundException`
* `InterruptedException`

👉 ✔ Compiler forces handling

---

## ✅ 2. Unchecked Exceptions (Runtime Exceptions)

* Occur at **runtime**
* Not checked by compiler
* Subclass of `RuntimeException`

### Examples:

* `ArithmeticException`
* `NullPointerException`
* `ArrayIndexOutOfBoundsException`
* `StringIndexOutOfBoundsException`
* `InputMismatchException`

👉 ✔ Caused due to **programming mistakes**

---

# 📌 Important Structure (From Your Diagram)

```
Throwable
│
├── Error
│    ├── OutOfMemoryError
│    ├── StackOverflowError
│    └── ...
│
└── Exception
     │
     ├── Checked Exceptions
     │     ├── IOException
     │     ├── SQLException
     │     └── ...
     │
     └── RuntimeException (Unchecked)
           ├── ArithmeticException
           ├── NullPointerException
           ├── ArrayIndexOutOfBoundsException
           └── ...
```

---

# ⚠️ Key Points (Exam Ready)

✔ `Throwable` is the root class
✔ `Error` → cannot be handled
✔ `Exception` → can be handled
✔ Checked → compile-time checking
✔ Unchecked → runtime errors

---

# 🎯 Simple Memory Trick

👉 **Throwable → Error + Exception**
👉 **Exception → Checked + Unchecked**




---

# ✅ Keywords in Exception Handling

### 🔹 1. try

* Used to write code that may cause an exception

```java
try {
   int a = 10 / 0;
}
```

---
Note: single try can have more than one catch block. 

### 🔹 2. catch

* Handles the exception

```java
//catch(exceptionType ref)
catch(ArithmeticException e) {
   System.out.println("Cannot divide by zero");
}
```

---

### 🔹 3. finally

* Always executes (exception occurs or not)
* Used for cleanup (closing DB, files, etc.)

Q. Is it true finally used for exception handling or finally handling the exception?
No finally cannot handle the exception just execute code written in finally block in any situation 

---

### 🔹 4. throw

* Used to **manually throw an exception**

```java
throw new ArithmeticException("Custom Error");
```

---

# ✅ throw Keyword (Correct Explanation)

* Used to **manually create and throw an exception**
* Can throw:

  * Built-in exceptions
  * User-defined exceptions

### 🔹 Syntax:

```java
throw new ExceptionType("message");
```

---

# ✅ Q1. What is a User Defined Exception?

👉 A **user-defined exception** is a custom exception created by the programmer by extending:

* `Exception` (checked) OR
* `RuntimeException` (unchecked)

---

# ✅ Q2. Why do we need User Defined Exceptions?

✔ When:

* No suitable built-in exception exists
* Need **custom error messages**
* Need **application-specific validation**

👉 Example:

* Voting system (age < 18)
* Banking system (insufficient balance)

---

# ✅ Q3. How to Create User Defined Exception?

👉 Step 1: Create class
👉 Step 2: Extend Exception or RuntimeException

---

# ✅ Example 1 (Your Example Improved)

```java
class VoterException extends RuntimeException {
    VoterException(String msg) {
        super(msg);
    }
}
```

---

# ✅ Example 2 (Complete Program)

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

---

# 💥 Output Cases

### Case 1:

```text
Input: 15
Output: Exception → You are not eligible for voting
```

### Case 2:

```text
Input: 20
Output: You can vote
```

---

# 🧠 Important Points

✔ `throw` → used inside method
✔ Throws **one exception at a time**
✔ Requires **object creation**

---

# 🔥 throw vs throws (Quick Revision)

| throw                   | throws                    |
| ----------------------- | ------------------------- |
| Used to throw exception | Used to declare exception |
| Inside method           | In method signature       |
| One exception           | Multiple exceptions       |

---

# 🎯 Final Simple Definition (Exam Ready)

👉 **throw:** Used to explicitly throw an exception object
👉 **User-defined exception:** Custom exception created by extending Exception class

---


---

### 🔹 5. throws

* Declares exceptions in method signature

```java
class Div
 {
    void setValue(int x, int y) 
    {
        int z = x / y;
        System.out.println("Division is " + z);
    }
}
public class CheckVoterApplication {
    public static void main(String x[]) {
        try {
            Div d = new Div();
            d.setValue(10, 2);
        }
        catch(Exception ex) {
            System.out.println("Error is " + ex);
        }
    }
}

```

---

# ✅ Common Exceptions Examples

### 🔸 ArithmeticException

```java
Scanner xyz = new Scanner(System.in);
int a, b, c;

System.out.println("Enter two values");
a = xyz.nextInt();
b = xyz.nextInt();

try {
    c = a / b;   // ⚠️ risky line
    System.out.println("division is " + c);
}
catch(ArithmeticException ex) {
    System.out.println("Error is " + ex);
}

System.out.println("Logic1");
System.out.println("Logic2");
System.out.println("Logic3");
```

---

### 🔸 NullPointerException

```java
static int a[];

public static void main(String x[]) {
    try {
      //   a = new int[5];   // ✅ allocate memory
        a[0] = 100;
        System.out.println(a[0]);
    }
    catch(Exception ex) {
        System.out.println("Error is " + ex);
    }
}
```

---

### 🔸 ArrayIndexOutOfBoundsException

```java
import java.util.*;
public class ExApplication 
{   public static void main(String x[])
	{ 
	try{
	   int a[]=new int[2]; //index=  0 , 1
	   a[0]=100;
	   a[1]=200;
	   a[2]=300; //try to store value greater than size of array using index 
	   System.out.println(a[2]);
	}
      catch(ArrayIndexOutOfBoundsException ex)
       { System.out.println("Array limit cross");
       }	
    }
}

```

---

### 🔸 NumberFormatException

```java
import java.util.*;
public class TestNumFormApp
{
   public static void main(String x[])
   {  
     try{
       String s="1234 ";
	   int val=Integer.parseInt(s);
	   System.out.println(val);
     }
    catch(NumberFormatException ex)
    { System.out.println("Error is "+ex);
     }
   }
}

```

---

### 🔸 NegativeArraySizeException

```java
public class Test {
    public static void main(String[] args) {
        try {
            int size = -5;
            int arr[] = new int[size];
        }
        catch(NegativeArraySizeException ex) {
            System.out.println("Array size cannot be negative");
        }
    }
}
```

---

### 🔸 StringIndexOutOfBoundsException

```java
public class Test {
    public static void main(String[] args) {
        try {
            String s = "Java";
            System.out.println(s.charAt(10));
        }
        catch(StringIndexOutOfBoundsException ex) {
            System.out.println("Invalid index for string");
        }
    }
}
```

---

# ✅ Multiple Catch Example

```java
try {
   int a = 10 / 0;
}
catch(ArithmeticException e) {
   System.out.println(e);
}
catch(Exception e) {
   System.out.println("General Exception");
}
```

---

# ✅ Important Notes (Corrected)

✔ A single `try` can have multiple `catch` blocks
✔ `Exception` is the parent class of most exceptions
✔ `finally` does NOT handle exceptions — it only executes code

---
Q. Can we use try catch finally at the same time?
Yes we can use try catch and finally at same but the sequence should be first write try , then catch and after that finally like as given below 
When we try and catch finally at same time then finally always execute after catch means not execute first before exception 

import java.util.*;
public class TestNumFormApp
{  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
       int a,b,c;
	  try{
		System.out.println("Enter two values");
		a=xyz.nextInt();
		b=xyz.nextInt();
		c=a/b;
		System.out.println("Division is "+c);
	  }
	  catch(Exception ex)
	  { System.out.println("Error is "+ex);
	  }
	  finally
	  { System.out.println("I can execute every time");
	  }
   }
}

---

# ✅ catch vs finally

| catch                             | finally                   |
| --------------------------------- | ------------------------- |
| Handles exception                 | Does not handle exception |
| Executes only if exception occurs | Executes always           |
| Requires exception parameter      | No parameter              |

---

# ✅ final vs finally vs finalize()

| Keyword    | Use                                                |
| ---------- | -------------------------------------------------- |
| final      | constant variable / prevent override / inheritance |
| finally    | block used in exception handling                   |
| finalize() | method called during garbage collection            |

---

# ✅ User Defined Exception

### 🔹 What is it?

Custom exception created by developer.

### 🔹 Example:

```java
class VoterException extends RuntimeException {
    VoterException(String msg) {
        super(msg);
    }
}
```

---

### 🔹 Usage:

```java
if(age < 18) {
   throw new VoterException("Not eligible for voting");
}
```

---

# ✅ throws vs throw (Corrected)

| throw                            | throws                       |
| -------------------------------- | ---------------------------- |
| Used to throw exception manually | Declares exceptions          |
| Used inside method               | Used in method signature     |
| One exception at a time          | Multiple exceptions possible |

---

# ✅ Try-with-Resources (Java 7)

Automatically closes resources:

```java
Try with resource bundle 
________________________________________________________________________
Try with resource bundle is concept launch JDK 1.7 where we can pass reference of class as parameter in try block.

import java.util.*;
public class ExeApplication
{   public static void main(String x[])
	{
	    
	   try(Scanner xyz  = new Scanner(System.in)){
	      System.out.println("Enter two values");
		  int a=xyz.nextInt();
		  int b=xyz.nextInt();
		  int c=a/b;
		  System.out.println("division "+c);
	   }
	   catch(ArithmeticException | InputMismatchException   ex)
	   { System.out.println("Division is "+ex);
	   }
	}
}

```
---


