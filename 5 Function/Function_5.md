# Function in Java

## Quick Navigation
- [What is a Function?](#what-is-a-function)
- [Why Use a Function?](#why-use-a-function)
- [Types of Functions](#types-of-functions)
- [How to Work with a User-Defined Function](#how-to-work-with-a-user-defined-function)
- [Important Rules While Defining a Function](#important-rules-while-defining-a-function)
- [Function Definition Syntax](#function-definition-syntax)
- [How to Call a Function](#how-to-call-a-function)
- [How to Return a Value from a Function](#how-to-return-a-value-from-a-function)
- [Example: Power Function](#example-power-function)
- [Example: Factorial Function](#example-factorial-function)
- [Passing Array to a Function](#passing-array-to-a-function)
- [Function Recursion](#function-recursion)
- [Dynamic Programming](#dynamic-programming)
- [Iteration vs Recursion](#iteration-vs-recursion)

---

## What is a Function?
A function is a block of statements used to write logic once and reuse it multiple times by calling the function.

### Why use a function?
- To reduce code repetition
- To make code easy to read
- To reuse logic
- To make the program modular

### Q. Why use function?
1. Reusability
   - We can define the logic once and reuse it whenever required.

2. Modularity
   - We can divide a large program into smaller functions or sub-modules, which makes code easier to understand, manage, and reuse.

---

## Types of Functions

### 1) Library Function
Library functions are the functions provided by Java for common operations.

Examples:
- `nextInt()`
- `Math.pow()`
- `Math.sqrt()`

### 2) User-Defined Function
User-defined functions are the functions created by the user for their own requirements.

---

## How to Work with a User-Defined Function

### 1) Define Function
Function definition means writing the logic inside a function.
This is where we decide what task the function will perform.

---

## Important Rules While Defining a Function

1. Do not use a semicolon `;` before the opening brace `{`
   - ❌ `public void fun(); { }`
   - ✅ `public void fun() { }`
2. If the function return type is `void`, we cannot use a return keyword with a value.
   - `return;` is allowed, but not required.
3. If the function return type is not `void`, then:
   - We must use the `return` keyword.
   - We must return a value.
   - When a function returns a value, the value must be stored at the calling point.
4. After the `return` statement, no code is executed.
   - Code written after `return` is unreachable.

---

## Function Definition Syntax

```java
accessSpecifier returnType functionName(datatype variable, datatype variable)
{
    // write your logic here
}
```

### Example of User-Defined Function

```java
public int add(int a, int b)
{
    return a + b;
}
```

---

## How to Call a Function
If we want to reuse a function, we need to call it. Calling a function executes the code written inside it.

### Ways to Call a Function

#### 1) Function That Does Not Return a Value
Such functions use the `void` return type.
While calling, no variable is used on the left-hand side.

Example:

```java
display();
```

#### 2) Function That Returns a Value
Such functions return a value using `return`.
While calling, we must store the returned value in a variable.
The variable type must match the return type.

Example:

```java
int result = add(10, 20);
```

### Important Points Related to Function Calling
1. Function definition name and calling name must be the same.
2. While calling a function, pass only variables or constant values, not data types.
3. Data type, number, and sequence of parameters must match in definition and calling.
4. If a function returns a value, it must be stored at the calling point.

```java
public class MULAPP
{
    public static void main(String x[])
    {
        calMul(10, 20);  // calling
    }

    public static void calMul(int x, int y) // definition
    {
        int z = x * y;
        System.out.println("Multiplication is " + z);
    }
}
```

### Output
```text
Multiplication is 200
```

---

## How to Return a Value from a Function
If we want to return a value from a function, the return type cannot be `void`.
We must use a data type according to the type of value returned.

```java
public class MLAPP
{
    public static void main(String x[])
    {
        int result = getMul(10, 20); // calling
        System.out.println("Multiplication is " + result);
    }

    public static int getMul(int x, int y) // defining
    {
        int z = x * y;
        return z;
    }
}
```

### Output
```text
Multiplication is 200
```

### Invalid Example
```java
public void add(int a, int b)
{
    return a + b;   // ❌ error
}
```

---

## Example: Power Function
Write a program to accept two values and calculate its power and return it.

```java
import java.util.*;

public class PAPP
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and index value");

        int b = sc.nextInt();
        int ind = sc.nextInt();

        int result = getPower(b, ind); // user-defined calling
        System.out.println("Power is " + result);
    }

    public static int getPower(int base, int index) // function definition
    {
        int p = 1;
        while (index != 0)
        {
            p = p * base;
            --index;
        }
        return p;
    }
}
```

### Output Example
```text
Enter base and index value
2 3
Power is 8
```

---

## Example: Factorial Function
Write a function `getFact(int no)` that accepts a number and calculates its factorial.

```java
import java.util.*;

public class FAPP
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number from keyboard");
        int no = sc.nextInt();

        int result = getFact(no); // calling
        System.out.println("Factorial of number is " + result);
    }

    public static int getFact(int no) // definition
    {
        int f = 1;
        while (no != 0)
        {
            f = f * no;
            --no;
        }
        return f;
    }
}
```

---

## Passing Array to a Function

### Why pass an array to a function?
Sometimes a function requires many parameters of the same data type.
Passing each value separately is not a good programming practice and makes the code long and difficult to manage.

A better approach is to store all values in an array and pass the array as a single parameter.

### Example explanation
Suppose we want to create a function:

```java
getPer(int, int, int, int, int, int)
```

This function accepts 6 integer parameters to calculate percentage.
We must pass all 6 values individually while calling it, which becomes tedious and error-prone as the number of parameters increases.

### Better approach
- Store all values in one array.
- Pass the array variable to the function.
- This reduces the number of parameters and improves readability and reusability.

> When an array is passed to a function, the base address (reference) is passed, not individual elements.

### Syntax

#### Function definition
```java
returnType functionName(dataType[] arrayName)
{
    // logic
}
```

#### Function call
```java
functionName(arrayName);
```

### Simple example
```java
public static int getSum(int[] a)
{
    int sum = 0;
    for (int i = 0; i < a.length; i++)
    {
        sum = sum + a[i];
    }
    return sum;
}
```

Calling:

```java
int arr[] = {10, 20, 30, 40, 50};
int result = getSum(arr);
```

### Extra example
```java
public class PAPP
{
    public static void main(String x[])
    {
        int a[] = new int[]{60, 70, 80, 90, 60, 60};

        int result = getPer(a);  // calling
        System.out.println("Percentage is " + result);
    }

    public static int getPer(int arr[]) // definition
    {
        int agg = 0;

        for (int i = 0; i < arr.length; i++)
        {
            agg = agg + arr[i];
        }

        return (agg / arr.length);
    }
}
```

### Output
```text
Percentage is 70
```

### Important exam points
- Passing many parameters of the same type is not recommended.
- Array helps group multiple values.
- While passing an array, only the reference (base address) is passed.
- Changes made inside a function reflect in the original array.

---

## Function Recursion
Function recursion means a function calls itself again and again in order to solve a problem.

The main goal of recursion is to solve a problem step by step. Instead of solving the whole problem in one go, recursion breaks the problem into smaller sub-problems, solves each small problem, and then combines the results.

Another simple definition:
- When a function calls the same function inside its own definition, it is called recursion.

### Important note: Base case
When working with recursion, we must always define a base case.

- The base case is the condition where recursion stops.
- Without a base case, the function calls itself infinitely and causes a `StackOverflowError`.

### How to perform recursion?

```java
returnType functionName(dataType variableName)
{
    if (baseCondition)
    {
        // stop recursion
        return value;
    }
    else
    {
        // logic
        return functionName(arguments); // recursive call
    }
}
```

### Key points to remember
1. `returnType` = data type of the value returned by the function.
2. `baseCondition` = condition where recursion stops.
3. `recursive call` = function calls itself with modified arguments.
4. `return` = mandatory if the return type is not `void`.

---

## Example: Print “Good Morning” 5 Times Using Recursion

```java
public class RCAPP
{
    public static void show(int x)
    {
        if (x == 0) // base case
        {
            System.out.println("Stop recursion");
            return; // stops recursion
        }
        else
        {
            System.out.println("Good morning");
            show(x - 1); // recursive call
        }
    }

    public static void main(String args[])
    {
        show(5); // initial call
    }
}
```

---

## Why use Recursion and When to Use It?

### Why use recursion?
1. Simplifies complex problems
   - Recursion makes complex problems easier to understand by breaking them into smaller sub-problems and solving them step by step.

2. Natural solution for divide-and-conquer problems
   - Problems that can be divided into similar smaller problems are easier to express using recursion.

Examples:
- Factorial
- Fibonacci series
- Tower of Hanoi
- Tree traversal

### When to use recursion?
- Problems with hierarchical data
  - Trees
  - Graphs
  - Nested lists
- Mathematical problems
- When the iteration count is not fixed

### Problems in recursion
- High memory usage
- Slower execution
- Stack overflow risk
- Repeated calculations
- Complex debugging

---

## Recursion Tree
A recursion tree is a diagrammatic representation used to show how a recursive function executes step by step.

It explains:
- The initial function call
- All recursive inner function calls
- How recursion expands until the base case is reached

Each node in the recursion tree represents one function call, and each branch shows a recursive call.

---

## Example: Sum of Natural Numbers from 1 to n

```java
public class RecAPP
{
    public static int sum(int n)
    {
        if (n <= 1) // base case
        {
            return n; // stops recursion
        }
        else
        {
            return n + sum(n - 1); // recursive call
        }
    }

    public static void main(String x[])
    {
        int result = sum(5);
        System.out.println("Result is " + result);
    }
}
```

### Evaluation
```text
sum(5)
= 5 + sum(4)
= 5 + (4 + sum(3))
= 5 + (4 + (3 + sum(2)))
= 5 + (4 + (3 + (2 + sum(1))))
= 5 + 4 + 3 + 2 + 1
= 15
```

---

## Example: Factorial Using Recursion

```java
public class RecAPP
{
    public static int getFact(int n)
    {
        if (n == 0 || n == 1) // base case
        {
            return 1;
        }
        else
        {
            return n * getFact(n - 1); // recursive call
        }
    }

    public static void main(String x[])
    {
        int result = getFact(5);
        System.out.println("Result is " + result);
    }
}
```

### Evaluation
```text
getFact(5)
= 5 * getFact(4)
= 5 * (4 * getFact(3))
= 5 * (4 * (3 * getFact(2)))
= 5 * (4 * (3 * (2 * getFact(1))))
= 5 * 4 * 3 * 2 * 1
= 120
```

---

## Example: Power of a Number Using Recursion

```java
import java.util.*;

public class PRAPP
{
    public static int getPower(int base, int index)
    {
        if (index == 0) // base case
        {
            return 1;
        }
        else
        {
            return base * getPower(base, index - 1); // recursive call
        }
    }

    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter base and index");
        int base = xyz.nextInt();
        int index = xyz.nextInt();

        int result = getPower(base, index);
        System.out.println("Power is " + result);
    }
}
```

### Evaluation
```text
getPower(2, 3)
= 2 * getPower(2, 2)
= 2 * (2 * getPower(2, 1))
= 2 * (2 * (2 * getPower(2, 0)))
= 2 * 2 * 2 * 1
= 8
```

---

## Example: Reverse a Number Using Recursion

```java
import java.util.*;

public class RNAPP
{
    public static int getRev(int no, int rev)
    {
        if (no == 0)
        {
            return rev;
        }
        else
        {
            int rem = no % 10;
            rev = rev * 10 + rem;
            return getRev(no / 10, rev);
        }
    }

    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int no = sc.nextInt();

        int result = getRev(no, 0);
        System.out.println("Rev number is " + result);
    }
}
```

### Trace
```text
getRev(123, 0)
→ rem = 3 → rev = 3 → getRev(12, 3)
→ rem = 2 → rev = 32 → getRev(1, 32)
→ rem = 1 → rev = 321 → getRev(0, 321)
→ return 321
```

---

## Example: Print Table Using Recursion

```java
public class TAPP
{
    public static void table(int no, int count)
    {
        if (count > 10) // base case
        {
            return;
        }
        else
        {
            System.out.println(no * count);
            table(no, count + 1); // recursive call
        }
    }

    public static void main(String x[])
    {
        table(5, 1); // initial call
    }
}
```

---

## Overlapping Recursion
If we work with recursion, there is a possibility of overlapping.

### Q. What is overlapping in function recursion?
Overlapping means the same calculation is executed multiple times.

This leads to:
- Wasted computation
- Slower performance
- Increased time complexity

### Example: Fibonacci without DP

```java
public class FSER
{
    public static int fibo(int n)
    {
        if (n <= 1) // base case
        {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2); // recursive calls
    }

    public static void main(String x[])
    {
        int limit = 5;

        for (int i = 0; i <= limit; i++)
        {
            int result = fibo(i);
            System.out.println(result);
        }
    }
}
```

### Output
```text
0
1
1
2
3
5
```

### Dry run
```text
fibo(5)
= fibo(4) + fibo(3)
= (fibo(3) + fibo(2)) + (fibo(2) + fibo(1))
```

Notice how `fibo(2)` and `fibo(3)` are calculated many times.
This is called overlapping sub-problems.

---

## Dynamic Programming
Dynamic Programming (DP) is a problem-solving technique used to solve complex problems efficiently by breaking them into smaller overlapping sub-problems.

In Dynamic Programming, the result of each sub-problem is stored (memorized) so it does not need to be recomputed again, which improves performance.

### Key characteristics
1. Overlapping sub-problems
   - The same sub-problems appear multiple times.
2. Optimal substructure
   - The solution of a problem can be built from the solutions of its sub-problems.
3. Storage of results
   - Previously computed results are stored using arrays, tables, or hash maps.

### Example problems
- Fibonacci series
- Factorial optimization
- Knapsack problem
- Longest common subsequence

### Memoization technique

```java
import java.util.*;

public class DPAPP
{
    public static int fibo(int n, int arr[])
    {
        if (arr[n] != 0)
        {
            return arr[n];
        }

        if (n <= 1)
        {
            arr[n] = n;
        }
        else
        {
            arr[n] = fibo(n - 1, arr) + fibo(n - 2, arr);
        }
        return arr[n];
    }

    public static void main(String x[])
    {
        int limit = 5;
        int a[] = new int[limit + 1];
        Arrays.fill(a, 0);

        for (int i = 0; i <= limit; i++)
        {
            System.out.print(fibo(i, a) + " ");
        }
    }
}
```

### Final output
```text
0 1 1 2 3 5
```

### Why DP helps here
- `arr[]` stores already calculated Fibonacci values.
- Before computing `fibo(n)`, we check:

```java
if (arr[n] != 0)
```

If the value already exists, it is returned directly. This avoids overlapping recursion.

### Without DP vs With DP
- Without DP: same values are calculated many times.
  - Time complexity: `O(2^n)`
- With DP: each value is calculated once.
  - Time complexity: `O(n)`
  - Space complexity: `O(n)`

---

## Iteration vs Recursion

| Iteration | Recursion |
| --- | --- |
| Uses loops like `for`, `while`, `do-while` | Function calls itself |
| Executes statements repeatedly | Solves problem by breaking into smaller sub-problems |
| Uses constant memory | Uses stack memory for each call |
| No risk of stack overflow | May cause `StackOverflowError` |
| Usually faster | Usually slower due to function call overhead |
| Easier to debug and trace | Harder to debug |
| Best when loop count is known or fixed | Best when the problem is naturally recursive |
| Code can be longer for complex problems | Code is often shorter and cleaner |

---

## Summary
A function in Java helps us write reusable, modular, and readable code. It may either perform a task without returning a value or return a result after processing input. Understanding function definition, calling, return types, arrays, recursion, and dynamic programming is essential for Java programming.

| Uses **loops** like `for`, `while`, `do-while` | Function **calls itself**                                   |
| Executes statements **repeatedly**             | Solves problem by breaking it into **smaller sub-problems** |
| Uses **constant memory**                       | Uses **stack memory** for each call                         |
| No risk of stack overflow                      | May cause **StackOverflowError**                            |
| Usually **faster**                             | Usually **slower** due to function call overhead            |
| Easier to **debug and trace**                  | Harder to debug                                             |
| Best when loop count is **known or fixed**     | Best when problem is **naturally recursive**                |
| Code can be longer for complex problems        | Code is often **shorter and cleaner**                       |







