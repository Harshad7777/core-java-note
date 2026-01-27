# Java Functions and Recursion

## 🔹 Function

A function is a block of statements used to write logic once and reuse it multiple times by calling the function.

### 🔹 Why Use a Function?

* Reduce code repetition
* Make code easy to read
* Reuse logic
* Make program modular

### Q. Why use function?

1. **Reusability**: Define logic once, reuse multiple times.
2. **Modularity**: Divide a large program into smaller, manageable sub-modules.

## 🔹 Types of Functions

1. **Library Function**: Provided by Java for common operations. Examples: `nextInt()`, `Math.pow()`, `sqrt()`
2. **User-Defined Function**: Created by the user for custom purposes.

---

## 🔹 User-Defined Function Workflow

### 1) Define Function

Syntax:

```java
accessSpecifier returnType functionName(datatype variable1, datatype variable2) {
    // logic
}
```

**Example:**

```java
public int add(int a, int b) {
    return a + b;
}
```

**Rules:**

1. No semicolon before `{`
2. `void` functions cannot return a value
3. Non-void functions must use `return` and return a value
4. After `return`, no code executes

### 2) Call Function

* **Void Function**: `display();`
* **Returning Function**: Store value in variable `int result = add(10, 20);`

**Important Points:**

* Function name in definition & calling must be the same
* Pass only values or variables, not data types
* Parameter data type, number, sequence must match
* Store returned value if function is not `void`

**Example:**

```java
public class MULAPP {
    public static void main(String x[]) {
        calMul(10,20);  // calling
    }
    public static void calMul(int x, int y) {
        int z = x * y;
        System.out.println("Multiplication is " + z);
    }
}
```

Output: `Multiplication is 200`

---

## 🔹 Returning Values from Functions

```java
public static int getMul(int x, int y) {
    return x * y;
}
```

Calling:

```java
int result = getMul(10, 20);
System.out.println(result); // 200
```

Invalid Example:

```java
public void add(int a, int b) {
    return a + b; // ❌ error
}
```

---

## 🔹 Example: Power Function

```java
public static int getPower(int base, int index) {
    int p = 1;
    while(index != 0) {
        p *= base;
        --index;
    }
    return p;
}
```

---

## 🔹 Factorial Function

```java
public static int getFact(int no) {
    int f = 1;
    while(no != 0) {
        f *= no;
        --no;
    }
    return f;
}
```

---

## 🔹 Passing Array as Function Parameter

* Pass array reference to avoid multiple parameters

```java
public static int getPer(int arr[]) {
    int sum = 0;
    for(int i = 0; i < arr.length; i++) sum += arr[i];
    return sum / arr.length;
}
```

Calling:

```java
int arr[] = {60, 70, 80, 90, 60, 60};
int result = getPer(arr);
System.out.println(result); // 70
```

---

## 🔹 Recursion

* Function calls itself to solve smaller sub-problems
* Must have **base case** to stop recursion

### Syntax

```java
returnType functionName(datatype var) {
    if(baseCondition) return value;
    else return functionName(modifiedArg);
}
```

### Example: Print "Good morning" 5 times

```java
public static void show(int x) {
    if(x == 0) return;
    System.out.println("Good morning");
    show(x - 1);
}
```

### Example: Sum of Natural Numbers

```java
public static int sum(int n) {
    if(n <= 1) return n;
    return n + sum(n - 1);
}
```

### Example: Factorial using Recursion

```java
public static int getFact(int n) {
    if(n == 0 || n == 1) return 1;
    return n * getFact(n-1);
}
```

### Example: Power using Recursion

```java
public static int getPower(int base, int index) {
    if(index == 0) return 1;
    return base * getPower(base, index-1);
}
```

### Example: Reverse a Number

```java
public static int getRev(int no, int rev) {
    if(no == 0) return rev;
    int rem = no % 10;
    return getRev(no / 10, rev * 10 + rem);
}
```

### Example: Print Table of Number

```java
public static void table(int no, int count) {
    if(count > 10) return;
    System.out.println(no * count);
    table(no, count + 1);
}
```

---

## 🔹 Overlapping in Recursion

* Same sub-problems computed multiple times
* Example: Fibonacci recursive function

```java
public static int fibo(int n) {
    if(n <= 1) return n;
    return fibo(n-1) + fibo(n-2);
}
```

* Leads to slow execution and high memory usage

---

## 🔹 Dynamic Programming (DP)

* Stores results of sub-problems to avoid recomputation (memoization)

### Fibonacci using DP

```java
public static int fibo(int n, int arr[]) {
    if(arr[n] != 0) return arr[n];
    if(n <= 1) arr[n] = n;
    else arr[n] = fibo(n-1, arr) + fibo(n-2, arr);
    return arr[n];
}
```

* Time Complexity: O(n) ✅
* Space Complexity: O(n)

---

## 🔹 Iteration vs Recursion

| Iteration            | Recursion                             |
| -------------------- | ------------------------------------- |
| Uses loops           | Function calls itself                 |
| Constant memory      | Stack memory for calls                |
| Usually faster       | Slower due to call overhead           |
| Easy to debug        | Harder to debug                       |
| Best for fixed loops | Best for naturally recursive problems |
