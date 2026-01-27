# LOOP in Java

---

## Q. What is a Loop?

A loop is used when we want to perform a task repeatedly until a specific condition is satisfied.

**Example (Concept):**

If we want to print “Good Morning” 100 times, writing `System.out.println()` 100 times is not practical.
Instead, we use a loop to repeat the statement automatically.

---

## Types of Loops

### 1️⃣ Entry Control Loop

* The condition is checked first.
* If the condition is true, the loop body executes.
* If false, the loop body is skipped.

**Types of Entry Control Loop:**

1. while
2. for
3. Nested Loop

---

## 1️⃣ While Loop

* Entry control loop
* Condition is checked before execution

```java
initialization;
while(condition)
{
    // logic
    // increment / decrement
}
```

### Example 1

```java
public class WLAPP
{
    public static void main(String x[])
    {
        int i;
        i = 1; // initialization
        while(i <= 5) // condition
        {
            System.out.println("good morning");
            i++; // increment
        }
    }
}
```

### Example 2: Print Table of a Number

```java
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
```

### Example: Power Calculation

```java
import java.util.*;
public class PAPP
{
    public static void main (String x[])
    {
        Scanner sc = new Scanner(System.in);

        int base, index, p = 1;
        System.out.println("Enter base and Index");

        base = sc.nextInt();
        index = sc.nextInt();

        int i = 1;
        while(i <= index)
        {
            p = p * base;
            i++;
        }
        System.out.println("Power is " + p);  
    }
}
```

### Example: Perfect Number

```java
import java.util.*;
public class PAPP
{
    public static void main (String x[])
    {
        Scanner sc = new Scanner(System.in);

        int no, sum = 0, i;
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
```

---

## Duck Number & Flag Variable Concept

### Wrong Output Issue

* `if–else` inside loop
* Output prints multiple times

### ✔ Solution: Flag Variable

```java
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
```

---

## Search Digit in a Number

```java
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
```

---

## 2️⃣ For Loop

* Entry control loop
* Suitable when number of iterations is known

```java
for(initialization; condition; increment/decrement)
{
    // statements
}
```

### Valid Forms

```java
for(int i=1; i<=5; i++) {}
for(int i=1; i<=5; ) { i++; }
int i=1;
for(; i<=5; i++) {}
```

---

## 4️⃣ Do-While Loop

* Exit control loop
* Executes at least once

```java
do
{
    // statements
}
while(condition);
```

```java
public class DOAPP
{
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Good Morning");
            i++;
        } while(i < 0);
    }
}
```

---

## Important Components of Any Loop

* **Initialization** – Starting point of loop
* **Condition** – Number of iterations
* **Increment / Decrement** – Step between iterations

---
