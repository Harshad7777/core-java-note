# Looping in Java

## Table of Contents
- [1. What is a Loop?](#1-what-is-a-loop)
- [2. Types of Loops](#2-types-of-loops)
- [3. While Loop](#3-while-loop)
- [4. For Loop](#4-for-loop)
- [5. Nested Loop](#5-nested-loop)
- [6. Do-While Loop](#6-do-while-loop)
- [7. Important Components of any Loop](#7-important-components-of-any-loop)

## 1. What is a Loop?

A loop is used when we want to perform a task repeatedly until a specific condition is satisfied.

Example:

If we want to print “Good Morning” 100 times, writing `System.out.println()` 100 times is not practical. Instead, we use a loop to repeat the statement automatically.

---

## 2. Types of Loops

### Entry Control Loop
The condition is checked first.
- If the condition is true, the loop body executes.
- If false, the loop body is skipped.

Types of entry control loops:
1. `while`
2. `for`
3. Nested loop

### Exit Control Loop
The loop body executes at least once.
- Condition is checked after execution.

Type:
1. `do-while`

---

## 3. While Loop

Entry control loop.
Condition is checked before execution.

```java
initialization;
while (condition) {
    // logic
    // increment or decrement
}
```

### Example 1
```java
public class WLAPP {
    public static void main(String[] args) {
        int i;
        i = 1; // initialization

        while (i <= 5) { // condition
            System.out.println("Good Morning");
            i++; // increment
        }
    }
}
```

### Example 2: Print table of a number
```java
import java.util.*;

public class TableAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int no = sc.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(no + " x " + i + " = " + (no * i));
            i++;
        }
    }
}
```

### Example: Power calculation
```java
import java.util.*;

public class PAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base, index, p = 1;
        System.out.println("Enter base and index:");

        base = sc.nextInt();
        index = sc.nextInt();

        int i = 1;
        while (i <= index) {
            p = p * base;
            i++;
        }

        System.out.println("Power is " + p);
    }
}
```

### Example: Perfect number
```java
import java.util.*;

public class PAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no, sum = 0, i;
        System.out.println("Enter number");
        no = sc.nextInt();

        i = 1;
        while (i < no) {
            if (no % i == 0) {
                sum = sum + i;
            }
            i++;
        }

        String msg = no == sum ? "Number is perfect" : "Number is not perfect";
        System.out.println(msg);
    }
}
```

### Example: Duck number
A duck number contains at least one zero digit in it.

```java
import java.util.*;

public class DAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no, rem;

        System.out.println("Enter number from keyboard:");
        no = sc.nextInt();

        boolean flag = false;

        while (no != 0) {
            rem = no % 10;
            if (rem == 0) {
                flag = true;
            }
            no = no / 10;
        }

        if (flag)
            System.out.println("Number is Duck");
        else
            System.out.println("Number is Not Duck");
    }
}
```

### Search digit in a number
```java
import java.util.*;

public class SearchDigitAPP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int no = sc.nextInt();

        System.out.println("Enter search key:");
        int skey = sc.nextInt();

        boolean flag = false;

        while (no != 0) {
            int rem = no % 10;
            if (rem == skey) {
                flag = true;
            }
            no = no / 10;
        }

        String msg = flag ? "Number found" : "Number not found";
        System.out.println(msg);
    }
}
```

> Note: A flag variable is used to print the final result only once instead of multiple times inside a loop.

---

## 4. For Loop

Entry control loop.
Suitable when the number of iterations is known.

### Syntax
```java
for (initialization; condition; increment/decrement) {
    // statements
}
```

### Different valid forms of `for` loop
```java
for (int i = 1; i <= 5; i++) { }

for (int i = 1; i <= 5; ) { i++; }

int i = 1;
for (; i <= 5; i++) { }
```

### Example: Print “Good Morning”
```java
public class FAPP {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Good Morning");
        }
    }
}
```

### Example: Strong Number
A strong number is one where the sum of factorials of its digits equals the number.

```java
import java.util.*;

public class StrongNumber {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + factorial(digit);
            num = num / 10;
        }

        if (sum == temp) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }
}
```

---

## 5. Nested Loop

A loop inside another loop is called a nested loop.

Used for tables, matrices, and patterns.

### Syntax
```java
for () {
    for () {
        // statements
    }
}
```

### Example: Nested loop
```java
public class NestedLoopAPP {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("I = " + i + " J = " + j);
            }
            System.out.println();
        }
    }
}
```

### Example: Print multiplication tables from 2 to 10
```java
import java.util.*;

public class FAPP {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.print("\n");
        }
    }
}
```

### Pattern example
```java
public class MAPP {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
```

Output:
```text
*
**
***
****
*****
```

### Pattern example 2
```java
public class MAPP {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i <= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
```

Output:
```text
*****
 ****
  ***
   **
    *
```

### Pattern example 3
```java
public class MAPP {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (i == j || j == 6 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
```

Output:
```text
*   *
 * *
  *
 * *
*   *
```

---

## 6. Do-While Loop

Exit control loop.
The loop body executes at least once, even if the condition is false.

### Syntax
```java
do {
    // statements
} while (condition);
```

### Example
```java
public class DOAPP {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("Good Morning");
            i++;
        } while (i < 0);
    }
}
```

This prints once even though the condition is false after the first execution.

---

## 7. Important Components of any Loop

Every loop consists of three essential parts:

1. Initialization
   - Starting point of the loop
   - Example: `int i = 1;`

2. Condition
   - Determines how many times the loop runs
   - Example: `i <= 5`

3. Increment / Decrement
   - Step or gap between iterations
   - Example: `i++`, `i--`

---

## Quick Summary

- `while` → checks condition before execution
- `for` → used when iteration count is known
- `nested loop` → loop inside loop
- `do-while` → executes at least once
- `flag` → helps control repeated output inside loops
