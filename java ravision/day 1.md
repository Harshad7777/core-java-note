Q15. What is auxiliary space?

🔹 What is Auxiliary Space?

Definition:
Auxiliary space is the extra memory used by an algorithm, excluding the input data.

🔹 Explanation
It includes temporary variables, data structures, and function call stack
Does not include memory used to store input
🔹 Examples
Temporary arrays
Variables used inside functions
Recursion stack memory
🔹 Example Code
int sum(int[] arr) {
    int total = 0; // auxiliary space
    for(int i = 0; i < arr.length; i++) {
        total += arr[i];
    }
    return total;
}

👉 Uses O(1) auxiliary space

🔹 Key Point
Helps analyze space efficiency of an algorithm

-------------------------------------------

Q1. How would you define a function?

🔹 What is a Function?

Definition:
A function is a reusable block of code that performs a specific task and may return a value.

🔹 Key Points
Helps in code reusability
Improves modularity and readability
Can take input (parameters) and return 
output

🔹 Example (Java)
int add(int a, int b) {
    return a + b;
}


Q2. Difference between a function and a method?

| Feature     | Function                        | Method                              |
| ----------- | ------------------------------- | ----------------------------------- |
| Definition  | Block of code to perform a task | Function inside a class             |
| Association | Not bound to any object/class   | Belongs to a class/object           |
| OOP Concept | General programming concept     | Object-Oriented concept             |
| Example     | Used in C, C++                  | Used in Java, Python (inside class) |

🔹 Explanation
Function → Independent block of code
Method → Function that is part of a class

🔹 Example (Java)
class Test 
{
    void display() 
    {   // method
        System.out.println("Hello");
    }
}

Q3. Function Declaration vs Function Definition (Interview Answer)

Function Declaration:
It tells the compiler about the function’s name, return type, and parameters without providing the actual body.

👉 Example:

int add(int a, int b);  // Declaration

Function Definition:
It provides the actual implementation (body) of the function.

👉 Example:

int add(int a, int b) 
{  // Definition
    return a + b;
}

### **Q4. Call by Value vs Call by Reference (Interview Answer)**

**Call by Value:**
A **copy of the variable’s value** is passed to the function.
Changes inside the function **do NOT affect the original variable**.

👉 Example:

```java

class Test 
{
    static void change(int x) {
        x = 50;
    }

    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a);
    }
}
```
👉 Output: 10
👉 Explanation:
Only a copy of a is passed, so original value does NOT change.

---

**Call by Reference:**
The **address (reference) of the variable** is passed.
Changes inside the function **affect the original variable**.

👉 Example (C++):

```java

class Test {
    static void change(int[] arr) {
        arr[0] = 50;
    }

    public static void main(String[] args) {
        int[] a = {10};
        change(a);
        System.out.println(a[0]);
    }
}
```

👉 Output: 50
👉 Why?

Because object reference is passed by value, but it still modifies original data.

Q5. What are pure functions? (Interview Answer)

A pure function is a function that:

Always returns the same output for the same input
Does not have any side effects (does not modify external state)

✅ Example (Pure Function)

int add(int a, int b) 
{
    return a + b;
}

👉 Same input → same output
👉 No change outside the function

❌ Example (Not Pure Function)
int total = 0;

void add(int a) {
    total = total + a;  // modifies external variable
}

👉 Changes global variable → has side effects


Q6. What are side effects? (Interview Answer)

Side effects are any changes a function makes outside its own scope, other than returning a value.

✅ Examples of Side Effects
Modifying a global variable
Changing an object’s state
Performing I/O operations (printing, file writing)
Updating database or external systems
❌ Example with Side Effect
int total = 0;

void add(int a) {
    total = total + a;   // modifies global variable
}

👉 Function changes external variable → side effect

✅ Example without Side Effect (Pure Function)
int add(int a, int b) {
    return a + b;
}

👉 No external change → no side effect

Q7. What is function overloading? (Interview Answer)

Function overloading is a feature where multiple functions have the same name but different parameters (type, number, or order).

✅ Example (Java)
class Test 
{
    int add(int a, int b) 
    {
        return a + b;
    }

    int add(int a, int b, int c) 
    {
        return a + b + c;
    }
}

👉 Same function name add
👉 Different parameters → valid overloading

✅ Ways to overload
Different number of parameters
Different data types
Different order of parameters
❌ Not Overloading

Changing only return type is not allowed.

⭐ Key Points
Achieved at compile time (compile-time polymorphism)
Improves code readability and reuse

-----------------------------------------------------------
🎯 Recursion

Q8. What is recursion? How does it work? (Interview Answer)

Recursion is a technique where a function calls itself to solve a problem by breaking it into smaller subproblems.

✅ How it works
The function calls itself with a smaller input
This continues until a base case is reached
Then all calls return back step-by-step

✅ Example (Factorial)

int fact(int n) 
{
    if(n == 1) return 1;       // Base case
    return n * fact(n - 1);    // Recursive call
}

👉 fact(3) → 3 × fact(2) → 3 × 2 × fact(1) → 6

✅ Internal Working (Call Stack)
Each function call is stored in stack memory
Calls are pushed → executed → then popped after completion

Q9. What are base case and recursive case in recursion?

Answer:

Base Case:
The condition where recursion stops to avoid infinite calls.

Recursive Case:
The part where the function calls itself with smaller input.

👉 Example:

int fact(int n)
 {
    if(n == 1) return 1;   // Base case
    return n * fact(n-1);  // Recursive case
}

Q10. How does recursion work internally in memory (call stack)?

Answer:
Recursion uses a call stack to store each function call.

Working:

Each time a function is called, a new stack frame is created
These calls are pushed onto the stack (LIFO – Last In First Out)
When the base case is reached, the function starts returning
Stack frames are removed one by one (pop operation)

👉 Example (factorial):

fact(3)
→ 3 * fact(2)
→ 2 * fact(1)
→ return 1

Stack Flow:

Push: fact(3), fact(2), fact(1)
Pop: fact(1) → fact(2) → fact(3)
⭐ Key Point

Each recursive call uses memory, so deep recursion can cause stack overflow.

Q11. What is the difference between recursion and iteration?

Answer:

| Recursion               | Iteration               |
| ----------------------- | ----------------------- |
| Uses function calls     | Uses loops (for, while) |
| Uses stack memory       | Uses less memory        |
| Code is shorter/cleaner | Code is faster          |
| Risk of stack overflow  | No stack overflow       |

Q12. What are the advantages and disadvantages of recursion? (Interview Answer)

✅ Advantages of Recursion
Simpler & cleaner code for complex problems
Easy to solve divide-and-conquer problems (e.g., binary search, merge sort)
Reduces need for explicit loops
Naturally fits problems like trees, graphs, backtracking

❌ Disadvantages of Recursion
High memory usage (uses call stack)
Slower performance due to function calls
Risk of stack overflow for deep recursion
Sometimes harder to debug

Q13. Difference between Tail Recursion and Non-Tail Recursion (Interview Answer) 
✅ Tail Recursion

A recursion where the recursive call is the last operation in the function.
No work is left after the recursive call.

👉 Example:

int fact(int n, int result) 
{
    if(n == 0) return result;
    return fact(n - 1, n * result);  // last operation
}
❌ Non-Tail Recursion

A recursion where some work remains after the recursive call.

👉 Example:

int fact(int n) 
{
    if(n == 0) return 1;
    return n * fact(n - 1);  // multiplication after call
}
✅ Key Differences

| Tail Recursion              | Non-Tail Recursion      |
| --------------------------- | ----------------------- |
| Recursive call is last step | Work remains after call |
| Can be optimized (compiler) | Cannot be optimized     |
| Uses less memory            | Uses more memory        |


Q14. What is stack overflow in recursion and why does it occur? (Interview Answer)

Stack overflow is an error that occurs when the call stack memory is exceeded due to too many recursive function calls.

✅ Why does it occur?
Missing base case → recursion never stops
Very deep recursion → too many function calls
Each call uses stack memory, which is limited

❌ Example (causes stack overflow)
void test() 
{
    test();   // no base case → infinite recursion
}

✅ Q15. What is a Recursion Tree?

A recursion tree is a visual way to represent how recursive calls are made in a program.

👉 It looks like a tree structure where:

Each node = a function call
Each branch = a recursive call made by that function

🌳 Example: Fibonacci

int fib(int n) 
{
    if (n <= 1) return n;   // base case
    return fib(n-1) + fib(n-2);
}

👉 Call: fib(4)

Recursion Tree:
                fib(4)
               /      \
         fib(3)        fib(2)
        /     \       /     \
   fib(2)   fib(1) fib(1)  fib(0)
   /    \
fib(1) fib(0)

🔍 Key Observations
Root Node
First function call → fib(4)

Child Nodes
Each call generates more recursive calls

Leaf Nodes (Base Cases)
fib(1) and fib(0) → stop recursion

Repeated Work
fib(2) is calculated multiple times ❗

👉 This shows inefficiency

🎯 Why Recursion Tree is Useful?

✔ Helps visualize recursion flow
✔ Helps analyze time complexity
✔ Helps find repeated calculations
✔ Useful for optimizing (Dynamic Programming)

⚡ Time Complexity Insight

For Fibonacci:
Tree grows exponentially 🌳
Time Complexity = O(2ⁿ)


### ✅ Q16. Difference Between Backtracking and Recursion

Both **recursion** and **backtracking** are related, but they are **not the same thing**.

---

## 🔹 1. Recursion

👉 **Definition:**
Recursion is a technique where a function **calls itself** to solve a problem.

👉 It breaks a problem into **smaller subproblems**.

### Example:

```java
int factorial(int n) 
{
    if (n == 0) return 1;   // base case
    return n * factorial(n - 1);
}
```

👉 Flow:
`factorial(5) → factorial(4) → factorial(3) → ...`

---

## 🔹 2. Backtracking

👉 **Definition:**
Backtracking is an **algorithmic technique** that tries all possible solutions and **undoes (backtracks)** when a solution is not valid.

👉 It uses recursion, but adds **decision-making + undo steps**.

### Example:

* N-Queens problem
* Sudoku solver
* Maze solving

---

## 🔍 Key Differences

| Feature         | Recursion                 | Backtracking                           |
| --------------- | ------------------------- | -------------------------------------- |
| Meaning         | Function calls itself     | Tries all possibilities and backtracks |
| Purpose         | Solve smaller subproblems | Find all/valid solutions               |
| Nature          | General technique         | Special use of recursion               |
| Decision Making | ❌ No                     | ✅ Yes                                  |
| Undo Step       | ❌ No                     | ✅ Yes (important)                      |
| Example         | Factorial, Fibonacci      | N-Queens, Sudoku                       |

---

## 🧠 Simple Understanding

👉 **Recursion** = “Solve problem step by step”
👉 **Backtracking** = “Try → Fail → Undo → Try again”

---

### ✅ Q17. What is Memoization?

👉 **Memoization** is an optimization technique used in recursion where we **store the results of already solved subproblems** and reuse them instead of recomputing.

---

### 🔹 Simple Idea

👉 “Don’t calculate the same thing again and again — just remember it!”

---

### 🔁 Problem Without Memoization

Example: Fibonacci

```java id="d3q9az"

int fib(int n) 
{
    if (n <= 1) return n;
    return fib(n-1) + fib(n-2);
}
```

❌ Problem:

* `fib(2)`, `fib(3)` etc. are calculated **multiple times**
* Leads to **exponential time O(2ⁿ)**

---

### ⚡ With Memoization

```java id="y6p8kl"

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciMemo 
{
    // Fibonacci function using memoization
    static int fib(int n, int[] dp)
    {
        if (n <= 1) 
        { 
            dp[n] = n;
            return n;
        }

        if (dp[n] != -1)
            return dp[n];

        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }
}

public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] dp = new int[n + 1]; //Why n+1? → because we need index from 0 to n

        // Initialize dp array with -1
        Arrays.fill(dp, -1);

        int result = fib(n, dp);

        System.out.println("Fibonacci Series up to " + n + ":");

        for (int i = 0; i <= n; i++) 
        {
            System.out.print(fib(i, dp) + " ");
        }

        sc.close();
    }
}
```

👉 Here:

* `dp[]` stores computed results
* Each value is calculated **only once**

---

### 🚀 How Memoization Optimizes Recursion

1. **Avoids repeated calculations**
2. **Stores intermediate results**
3. **Reduces time complexity**

---

### 📊 Time Complexity Comparison

| Approach         | Time Complexity   |
| ---------------- | ---------------   |
| Normal Recursion | O(2ⁿ) ❌         |
| Memoization      | O(n) ✅          |

---

### 🧠 Key Concept

👉 Memoization = **Recursion + Storage (Cache)**
-----------------------------------------------------------
OOP 
Interview Question on function overloading and polymorphism 
___________________________________________________________
1. Function Overloading Interview Questions 
-----------------------------------------------------------
### ✅ What is Function Overloading ?

👉 **Function Overloading** means defining **multiple functions with the same name** but with **different parameters** (number, type, or order).

---
## 🔹 Key Idea 

👉 Same function name
👉 Different parameter list

---

## 💻 Example (Java)

```java

class Example 
{
    int add(int a, int b) 
    {
        return a + b;
    }

    int add(int a, int b, int c) 
    {
        return a + b + c;
    }

    double add(double a, double b) 
    {
        return a + b;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Example obj = new Example();

        System.out.println(obj.add(2, 3));        // int, int
        System.out.println(obj.add(2, 3, 4));     // int, int, int
        System.out.println(obj.add(2.5, 3.5));    // double, double
    }
}

```
---
## 🔍 Explanation

* `add(int, int)` → adds 2 integers
* `add(int, int, int)` → adds 3 integers
* `add(double, double)` → adds 2 decimal numbers

👉 All have the **same name** but **different parameters** ✅
---

## ⚠️ Important Rules

✔ Must change **number or type of parameters**
❌ Changing only return type is **NOT allowed**

```java

int add(int a, int b)
double add(int a, int b)  // ❌ Error

```
---

## 🎯 Why Use Function Overloading?

* Improves **code readability**
* Avoids using different names for similar work
* Supports **compile-time polymorphism**

---

How does function overloading work in Java/C++?

Function overloading is a form of **compile-time polymorphism**, where multiple functions have the **same name** but **different parameter lists**. The compiler decides which function to call based on the arguments passed.

---

## 🔹 How it works (Step-by-step)

1. You define multiple functions with the **same name**.
2. Each function must differ in:
   * Number of parameters
   * Type of parameters
   * Order of parameters
3. When you call the function, the **compiler matches the arguments** with the correct function signature.
4. The matching function is executed.

---

## 🔹 Example in C++

```cpp

#include <iostream>
using namespace std;

class Example 
{
public:
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
};

int main() {
    Example obj;

    cout << obj.add(2, 3) << endl;        // calls add(int, int)
    cout << obj.add(2, 3, 4) << endl;     // calls add(int, int, int)
    cout << obj.add(2.5, 3.5) << endl;    // calls add(double, double)

    return 0;
}
```

👉 The compiler decides which `add()` to call based on arguments.

---

## 🔹 Example in Java

```java
class Example 
{
    int add(int a, int b) 
    {
        return a + b;
    }

    int add(int a, int b, int c) 
    {
        return a + b + c;
    }

    double add(double a, double b) 
    {
        return a + b;
    }
}
public class main
{
    public static void main(String[] args) 
    {
        Example obj = new Example();

        System.out.println(obj.add(2, 3));
        System.out.println(obj.add(2, 3, 4));
        System.out.println(obj.add(2.5, 3.5));
    }
}
    
```

---

## 🔹 Key Points

* ✔ Same function name
* ✔ Different parameter list (signature)
* ✔ Decided at **compile time**
* ❌ Cannot overload only by changing return type

---

What are the rules of function overloading?

---
## 🔹 1. Same Function Name
All overloaded functions must have the **same name**.

```cpp
add( )   // same name
```

---

## 🔹 2. Different Parameter List (MUST)

Functions must differ in at least one of these:

### ✔ Number of parameters

```cpp
add(int a, int b)
add(int a, int b, int c)
```

### ✔ Type of parameters

```cpp
add(int a, int b)
add(double a, double b)
```

### ✔ Order of parameters

```cpp
add(int a, double b)
add(double a, int b)
```

---

## 🔹 3. Return Type Alone is NOT Enough ❌

You **cannot overload** functions by changing only the return type.

```cpp
int add(int a, int b)
double add(int a, int b)   // ❌ ERROR
```

👉 Compiler cannot decide which one to call.

---

## 🔹 4. Function Signature Must Be Unique

A function’s **signature = name + parameter list** (not return type).

So each overloaded function must have a **different signature**.

---

## 🔹 5. Automatic Type Conversion (May Cause Confusion)

Compiler may convert types to match a function.

```cpp
add(int, int)
add(double, double)

add(5, 5.5);  // may convert int → double
```

👉 Sometimes this can create **ambiguity errors**.

---

## 🔹 6. Default Arguments Can Cause Ambiguity ⚠️ (C++)

```cpp
void add(int a, int b)
void add(int a, int b, int c = 0)

add(2,3);  // ❌ Confusion
```

---

## 🔹 7. Overloading Works at Compile Time

The compiler decides which function to call **before execution**.

👉 This is why it is called **compile-time polymorphism**.

---

## 🔹 8. Constructors Can Be Overloaded

You can overload constructors as well.

```cpp
class A {
    A() {}
    A(int x) {}
};
```

---

Can we overload functions based only on return type? Why or why not?

❌ No, you cannot overload functions based only on return type in Java or C++.

## 🔹 Why not?

Because the **compiler decides which function to call using the function signature**, and:

> ✅ **Function signature = function name + parameter list**
> ❌ **Return type is NOT part of the signature**

---

## 🔹 Problem Example

```cpp

int add(int a, int b) {
    return a + b;
}

double add(int a, int b) {
    return a + b;
}
```

👉 Both functions have:

* Same name: `add`
* Same parameters: `(int, int)`

💥 **Compiler Error:** It cannot decide which function to call.

---

## 🔹 Ambiguity at Call Time

```cpp
add(2, 3);
```

👉 The compiler asks:

* Should it call `int add(int, int)` ❓
* Or `double add(int, int)` ❓

➡️ There is **no way to decide**, because arguments are the same.

---

## 🔹 Important Point

Even if you do:

```cpp
int x = add(2, 3);
```

👉 Still ❌ NOT allowed, because:

* Function selection happens **before** assigning the return value.

---

## 🔹 Correct Way to Overload

You must change parameters:

```cpp
int add(int a, int b)
double add(double a, double b)
```
--------------------------
## 🔹 What is Compile-Time Polymorphism?

**Compile-time polymorphism** means:

> The decision about **which function to call is made at compile time (before execution)**.
                                                                      
👉 It is also called **static polymorphism**.

---

## 🔹 Example

```cpp

int add(int a, int b) 
{
    return a + b;
}

int add(int a, int b, int c) 
{
    return a + b + c;
}
```

```cpp

add(2, 3);      // decided at compile time → calls add(int, int)
add(2, 3, 4);   // decided at compile time → calls add(int, int, int)

```
👉 The compiler chooses the correct function **before the program runs**.
---

## 🔹 How is it Related to Overloading?

Function overloading is a **type of compile-time polymorphism**.

### ✔ Relation:

* In **function overloading**, multiple functions have the same name.
* The compiler selects the correct one based on:
  * Number of arguments
  * Type of arguments
  * Order of arguments

👉 This selection happens **at compile time**, so it is compile-time polymorphism.

---

## 🔹 Simple Connection

> **Function Overloading = One way to achieve Compile-Time Polymorphism**

---

## 🔹 Quick Comparison

| Concept                   | Meaning                                                |
| ------------------------- | ------------------------------------------------------ |
| Compile-time polymorphism | Decision made before execution                         |
| Function overloading      | Multiple functions with same name                      |
| Relation                  | Overloading is an example of compile-time polymorphism |

---

---------------------------
How does the compiler differentiate between overloaded methods?

The compiler differentiates between overloaded methods using the **function signature**.

---

## 🔹 What is Function Signature?

> **Function signature = function name + parameter list**
It includes:
* Number of parameters
* Type of parameters
* Order of parameters

❌ It does **NOT include return type**

---

## 🔹 How Compiler Chooses the Method

When you call a function, the compiler:
1. Looks at the **function name**
2. Checks the **arguments passed**
3. Matches them with the **best-fit function signature**
4. Calls that specific method

---

## 🔹 Important Points

### ✔ Exact Match First

* Compiler prefers the **exact match**

### ✔ Type Conversion (if needed)

```cpp id="7p6f5v"
show(5);   // int → exact match
show(5.5); // double → exact match
```

If exact match is not found:

* It may convert types (int → double)

---

### ❗ Ambiguity Error

```cpp id="p2m6i1"
void show(int a)
void show(double a)

show('A');  // ❌ may cause confusion (char → int or double)
```

👉 Compiler may not decide → **error**
------------------------------------------------------------------
## 🔹 Can we overload `main()` method?

### ✅ **Yes, we can overload `main()`** in both Java and C++

But ❗ **only one specific version is used as the entry point of the program**

---

## 🔹 Why?

The compiler/runtime looks for a **fixed signature** of `main()` to start execution.

* In **Java**:

  ```java
  public static void main(String[] args)
  ```

👉 Only these are considered as the **starting point**.

---

## 🔹 Example (Java)

```java id="y1w2m3"

class Main
{
    // Original main method (entry point)
    public static void main(String[] args) 
    {
        System.out.println("Original main");
        
        // Calling overloaded main method
        main(10);
    }

    // Overloaded main method
    public static void main(int x) 
    {
        System.out.println("Overloaded main: " + x);
    }
}
```

### ✔ Output:

```
Original main
Overloaded main: 10
```

---

## 🔹 Important Points

* ✔ `main()` can be overloaded like any other function
* ❗ Only the **standard signature** is executed automatically
* ✔ Other versions must be **called manually**

---

## 🔹 Final Answer (Exam Ready)

> Yes, we can overload the `main()` method, but the program execution always starts from the standard `main()` method signature. Overloaded versions can only be executed if they are explicitly called.

---

## 🔹 What is Method Signature in Overloading?

> A **method signature** is the **combination of the method name and its parameter list**.

---

## 🔹 It Includes:

* ✔ Method name
* ✔ Number of parameters
* ✔ Type of parameters
* ✔ Order of parameters

---

## 🔹 It Does NOT Include:

* ❌ Return type
* ❌ Method body
* ❌ Access modifiers (public, private, etc.)

---

## 🔹 Example

```java
void add(int a, int b)        // Signature: add(int, int)
void add(int a, int b, int c) // Signature: add(int, int, int)
void add(double a, double b)  // Signature: add(double, double)
```

👉 All are valid because **signatures are different**.

---

## 🔹 Invalid Overloading ❌

```java
int add(int a, int b)
double add(int a, int b)  // ❌ Same signature
```

👉 Only return type is different → **NOT allowed**

---

## 🔹 Why Method Signature is Important?

👉 The compiler uses the **method signature** to:
* Identify methods
* Differentiate overloaded methods
* Decide which method to call

---

Difference between method overloading and method overriding 

Here’s a **clear and exam-ready difference** between **method overloading** and **method overriding**:

---

## 🔹 Method Overloading vs Method Overriding

| Feature                   | Method Overloading                         | Method Overriding                   |
| ------------------------- | ------------------------------------------ | ----------------------------------- |
| **Definition**            | Same method name with different parameters | Same method in parent & child class |
| **Parameters**            | Must be different (type/number/order)      | Must be same                        |
| **Return Type**           | Can be same or different (but not alone)   | Must be same (or covariant)         |
| **Inheritance Required?** | ❌ No                                       | ✅ Yes                               |
| **Polymorphism Type**     | Compile-time (static)                      | Runtime (dynamic)                   |
| **Method Resolution**     | At compile time                            | At runtime                          |
| **Access Modifiers**      | No restriction                             | Cannot be more restrictive          |
| **Example**               | `add(int,int)` vs `add(int,int,int)`       | Child redefines parent method       |

---

## 🔹 Example: Overloading

```java id="n8q2ra"
class Test 
{
    int add(int a, int b) 
    {
        return a + b;
    }

    int add(int a, int b, int c) 
    {
        return a + b + c;
    }
}
```

👉 Same method name, **different parameters**

---

## 🔹 Example: Overriding

```java id="6h8x1m"

class Parent 
{
    void show() 
    {
        System.out.println("Parent class");
    }
}

class Child extends Parent 
{
    @Override   
    void show() 
    {
        System.out.println("Child class");
    }       
}

public class Test 
{
    public static void main(String[] args) 
    {
        Parent obj = new Child();  // Upcasting
        obj.show();                // Calls Child's method
    }
}


-----------------------------------------------
--- 

## 🔹 What is Polymorphism in OOP?

> **Polymorphism** means **“many forms”**.

In OOP, it refers to:

> The ability of a **single method or object** to behave **differently in different situations**.

---

### 🔹 Simple Example

```java
add(2, 3)        // adds 2 numbers
add(2, 3, 4)     // adds 3 numbers
```
👉 Same method name, different behavior
---

## 🔹 Types of Polymorphism

There are **2 main types**:

---

### 🔸 1. Compile-Time Polymorphism (Static)

* Achieved using **Method Overloading**
* Decision made **at compile time**

#### Example:

```java
int add(int a, int b)
int add(int a, int b, int c)
```

---

### 🔸 2. Runtime Polymorphism (Dynamic)

* Achieved using **Method Overriding**
* Decision made **at runtime**

#### Example:

```java
class Parent 
{
    void show() 
    {
        System.out.println("Parent");
    }
}

class Child extends Parent 
{
    void show() 
    {
        System.out.println("Child");
    }
}
```

---

## 🔹 Key Difference

| Type         | Time             | Technique   |
| ------------ | ---------------- | ----------- |
| Compile-time | Before execution | Overloading |
| Runtime      | During execution | Overriding  |

---



---

# 🔹 1. What is Compile-Time Polymorphism?

> Compile-time polymorphism is a type of polymorphism where the method call is resolved **during compilation**.

✔ Achieved using:

* **Method Overloading**

✔ Example:

```java
add(int a, int b)
add(int a, int b, int c)
```
👉 Compiler decides which method to call.
---

# 🔹 2. What is Runtime Polymorphism?

> Runtime polymorphism is a type of polymorphism where the method call is resolved **during program execution**.

✔ Achieved using:

* **Method Overriding**

👉 JVM decides which method to call at runtime.

---

# 🔹 3. What is Method Overriding?

> Method overriding occurs when a **child class provides its own implementation** of a method already defined in the parent class.

✔ Conditions:

* Same method name
* Same parameters
* Inheritance required

---

# 🔹 4. Rules of Method Overriding

✔ Method name must be same
✔ Parameters must be same
✔ Return type must be same (or covariant)
✔ Cannot reduce access level

* `public` → cannot become `protected/private`

✔ Cannot override:

* `final` methods
* `static` methods (they are hidden, not overridden)
* `private` methods

✔ Must be in **child class**

---

# 🔹 5. What is Dynamic Method Dispatch?

> Dynamic method dispatch is the process by which a call to an overridden method is resolved **at runtime**.

👉 It happens when:

```java
Parent obj = new Child();
obj.show();
```

✔ JVM decides which method to call based on **object type**

---

# 🔹 6. How does Java achieve Runtime Polymorphism?

Java achieves runtime polymorphism using:

### ✔ 1. Method Overriding

### ✔ 2. Upcasting

```java
Parent obj = new Child();  // Upcasting
obj.show();                // Calls Child method
```

👉 Steps:

1. Reference type = Parent
2. Object type = Child
3. JVM calls **Child’s overridden method**

---

# 🔹 Quick Summary Table

| Concept                   | Key Idea                      |
| ------------------------- | ----------------------------- |
| Compile-time polymorphism | Decided at compile time       |
| Runtime polymorphism      | Decided at runtime            |
| Method overriding         | Child redefines parent method |
| Dynamic dispatch          | Runtime method selection      |
| Java runtime polymorphism | Overriding + upcasting        |

---




