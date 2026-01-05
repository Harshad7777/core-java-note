Function 
----------------------------------------------
A function is a block of statements that is used to write logic once and reuse it multiple times by calling the function.

🔹 Why we use a function ?
    To reduce code repetition
    To make code easy to read
    To reuse logic
    To make program modular

Q. Why use function?

1) Reusability
Reusability means we can define the logic of a function only once and reuse it more than one time by calling the function whenever required.

2) Modularity
Modularity means we can divide a large program into smaller functions or sub-modules, which makes the code easy to understand, manage, and reuse.

Types of Function

1) Library Function
Library functions are the functions provided by Java for common operations.
Examples: nextInt(), Math.pow(), sqrt()

2) User-Defined Function
User-defined functions are the functions created by the user for their own requirement or purpose.
-------------------------------------------------
How to Work with a User-Defined Function

1) Define Function
Function definition means writing the logic inside a function.
This is where we decide what task the function will perform.
-------------------------------------------------
Important Rules While Defining a Function

1. Do not use semicolon (;) before the opening brace {
❌ public void fun(); { }
✅ public void fun() { }
2. If function return type is void, we cannot use return keyword with value
(return; alone is allowed, but not required)
3. If function return type is not void, then:
4. We must use return keyword
5. We must return a value
6. When a function returns a value, the value must be stored (caught) at the calling point
7. After the return statement, no code is executed
(logic written after return is unreachable)
----------------------------------------------
Function Definition Syntax

    accessSpecifier returnType functionName(datatype variable, datatype variable)
    {
        // write your logic here
    }

Example of User-Defined Function

    public int add(int a, int b)
    {
        return a + b;
    }

-------------------------------------------------------------------
2) Call Function
    If we want to reuse a function, we need to call it.
    Calling a function executes the code written inside the function.

Ways to Call a Function

1) Function That Does Not Return a Value
    Such functions use void return type.
    While calling, no variable is used on the left-hand side.

Example:
display();

2) Function That Returns a Value
    Such functions return a value using return.
    While calling, we must store the returned value in a variable.
    The variable type must match the return type.

Example:

    int result = add(10, 20);

Important Points Related to Function Calling
    1. Function definition name and calling name must be the same  
    2. While calling a function, pass only variables or constant values, not data types
    3. Data type, number, and sequence of parameters must match in definition and calling
    4. If a function returns a value, it must be stored at the calling point

 public class MULAPP
    {
        public static void main(String x[])
            {
                calMul(10,20);  //calling
            }
        public static void calMul(int x, int y) //definition
            {
                int z=x*y;
                System.out.println("Multiplication is "+z);
            }
    }

output
Multiplication is 200
-------------------------------------------------------------------------
How to return value from a function 
-------------------------------------------------------------------------
Note
If we want to return a value from a function, the return type cannot be void.
We must use a data type with the function name according to the type of value returned.

public calss MLAPP
{
    public static void main(String x[])
    { 
        int result = getMul(10,20); //calling
        System.out.println("Multiplication is "+result);
    }
    public static int getMul(int x, int y) //defining
    {
        int z=x*y;
        return z;
    }
}

output
Multiplication is 200

Invalid Example
public void add(int a, int b)
{
    return a + b;   // ❌ error
}
-------------------------------------------------------------------------
Example: WAP to accept two values and calculate its power and return it.

import java.util.*;
public class PAPP
{
    public static void main(String x[])
        {
            Scanner sc = new Scanner(System.in); //input
            System.out.println("Enter base and index value");

            int b = sc.nextInt();
            int ind = sc.nextInt();
            
            int result = getPower(b,ind); //user define calling
            System.out.println("Power is "+result);
        }
    public static int getPower(int base, int index) //function definaton
        {
            int p=1;
            while(index!=0)
            {
                p=p*base;
                --index;
            }
            return p;
        }
}

Output Exampl
Enter base and index value
2 3
Power is 8
-------------------------------------------------------------------------
Example: WAP to create function name as getFact(int no): this function can accept number as input and calculate its factorial


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
        while(no != 0)
        {
            f = f * no;
            --no;
        }
        return f;
    }
}

-------------------------------------------------------------------------
How to pass array as parameter to function
-------------------------------------------------------------------------
Q. Why do we need to pass an array as a parameter in a function?
-------------------------------------------------------------------------
Sometimes, a function requires many parameters of the same data type.
Passing each value separately is not a good programming practice and makes the code lengthy and difficult to manage.

A better approach is to store all values in an array and pass the array as a single parameter to the function.

Example Explanation
Suppose we want to create a function:

    getPer(int, int, int, int, int, int)


This function accepts 6 integer parameters to calculate percentage.
We must pass all 6 values individually while calling the function
This becomes tedious and error-prone, especially when the number of parameters increases

Better Approach
Store all 6 values in one array
Pass the array variable to the function
This reduces the number of parameters and improves readability and reusability

Important Note

👉 When we pass an array as a parameter to a function, the base address (reference) of the array is passed, not individual elements.
Syntax: Passing Array to Function

Function Definition
    returnType functionName(dataType[] arrayName)
    {
        // logic
    }

Function Calling
    functionName(arrayName);

    Simple Example
    public static int getSum(int[] a)
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            sum = sum + a[i];
        }
        return sum;
    }
Calling:

int arr[] = {10, 20, 30, 40, 50};
int result = getSum(arr);


Important Exam Points

    Passing many parameters of same type is not recommended
    Array helps to group multiple values
    While passing an array, only the reference (base address) is passed
    Changes made inside function reflect in the original array
    One-Line Exam Definition


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

        for(int i = 0; i < arr.length; i++)
        {
            agg = agg + arr[i];
        }

        return (agg / arr.length);
    }
}

📝 Output
Percentage is 70
----------------------------------------------------
Function Recursion
----------------------------------------------------
    Function recursion means a function calls itself again and again in order to solve a problem.

    The main goal of recursion is to solve a problem step by step. Instead of solving the whole problem in one go, recursion breaks the problem into smaller sub-problems, solves each small problem, and then combines the results to get the final answer.
    Or
    When a function calls the same function inside its own definition, it is called recursion.

🔹 Important Note (Base Case)

When working with recursion, we must always define a base case.

    The base case is the condition where recursion stops
    Without a base case, the function will call itself infinitely and cause a StackOverflowError

Q. How to perform recursion?

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

Key Points to Remember 🧠
    1️⃣ returnType
    → The data type of value returned by the function (int, void, double, etc.)
    2️⃣ baseCondition
    → Condition where recursion stops
    3️⃣ recursive call
    → Function calls itself with modified arguments
    4️⃣ return statement
    → Mandatory if return type is not void

Example: Example WAP to print good morning 5 times using recursion?

public class RCAPP
{
    public static void show(int x)
    {
        if(x == 0) // base case
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

Q. Why use Recursion & When to Use It?
Why use Recursion?

1️⃣ Simplifies complex problems
    Recursion makes complex problems easier to understand by breaking them into smaller sub-problems and solving them step by step.

2️⃣ Natural solution for divide-and-conquer problems
    Problems that can be divided into similar smaller problems are easier to express using recursion.

Examples:
    Factorial
    Fibonacci series
    Tower of Hanoi
    Tree traversal

When to Use Recursion?

I. Problems with hierarchical data
Recursion is very useful when working with tree-like or nested structures, such as:
    Trees
    Graphs
    Nested lists
    
II. Mathematical problems
Many mathematical formulas are naturally recursive, making recursion a clean solution.

III. When iteration count is not fixed
If the number of repetitions is unknown in advance, recursion is often more suitable than loops.

Q. What are the Problems in Recursion?

    High memory usage
    Slower execution
    Stack overflow risk
    Repeated calculations
    Complex debugging

Q. What is a Recursion Tree?

A recursion tree is a diagrammatic representation used to show how a recursive function executes step by step.

It explains:

    The initial function call
    All recursive (inner) function calls 
    How recursion expands until the base case is reached  

Each node in the recursion tree represents one function call, and each branch shows a recursive call.

Example: WAP to create a function to calculate the sum of natural numbers between 1 to n?

public class RecAPP
{
    public static int sum(int n)
    {
        if(n <= 1)          // base case
        { 
            return n;       // stops recursion
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

output:

sum(5)
= 5 + sum(4)
= 5 + (4 + sum(3))
= 5 + (4 + (3 + sum(2)))
= 5 + (4 + (3 + (2 + sum(1))))
= 5 + 4 + 3 + 2 + 1
= 15

Example: WAP to create function name int getFact(int) this function accept number as a parameter and calculates its factorial?

public calss RecAPP
{
    public static int getFact(int n)
    {
        if(n==0 || n==1) //base case
        {
            return 1;
        }
        else
        {
            return n*getFact(n-1); // recursive call
        }
    }
    public static void main(String x[])
    {
        int result = getFact(5);
        System.out.println("Result is "+result);
    }
}

getFact(5)
= 5 * getFact(4)
= 5 * (4 * getFact(3))
= 5 * (4 * (3 * getFact(2)))
= 5 * (4 * (3 * (2 * getFact(1))))
= 5 * 4 * 3 * 2 * 1
= 120

Example: WAP to input two values consider first as base and second as index and calcualte the power of number

import java.util.*;

public class PRAPP
{   
  
    public static int getPower(int base,int index)
	{
	 
	   if(index == 0)  //base case
	   {  
            return 1;
	   }
       else
       {
        return base * getPower(base, index-1); //recursive call
       }
	}
    public static void main(String x[])
	{ 
       Scanner xyz  = new Scanner(System.in);
	   
	   System.out.println("Enter base and index");
	   int base=xyz.nextInt();
	   int index=xyz.nextInt();

	   int result = getPower(base,index);
	   System.out.println("Power is  "+result);
	}
}

output
getPower(2,3)
= 2 * getPower(2,2)
= 2 * (2 * getPower(2,1))
= 2 * (2 * (2 * getPower(2,0)))
= 2 * 2 * 2 * 1
= 8

Example: WAP to input number from keyboard and reverse it using a recursion

public class RNAPP
{
    public static int getRev(int no, int rev)
    {
        if(no == 0)
        {
            return rev;
        }
        else
        {
            int rem = no % 10;
            rev = rev*10+rem;
            return getRev(no/10,rev);
        }
        return rev;
    }
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int no = sc.nextInt();

        int result = getRev(no,0);
        System.out.println("Rev number is "+result);
    }
}

<!-- getRev(123, 0)
→ rem = 3 → rev = 3 → getRev(12, 3)
→ rem = 2 → rev = 32 → getRev(1, 32)
→ rem = 1 → rev = 321 → getRev(0, 321)
→ return 321 -->

Example: WAP to input number and print its table using a recursion?

public class TAPP
{
    public static void table(int no, int count)
    {
        if(count > 10)   // base case
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
        table(5, 1); //initial call
    }
}

Note: if we work with recursion there is possibility of overlapping 
------------------------------------------------------------------------
Q. What is overlapping in function recursion?
------------------------------------------------------------------------
Overlapping execute same calculation multiple time called as overlapping in recursion

This leads to:

    Wasted computation
    Slower performance
    Increased time complexity

public class FSER
{
    public static int fibo(int n)
    {
        if(n <= 1)   // base case
        {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2); // recursive calls
    }

    public static void main(String x[])
    {
        int limit = 5;

        for(int i = 0; i <= limit; i++)
        {
            int result = fibo(i);
            System.out.println(result);
        }
    }
}

output
0
1
1
2
3
5

🔹 Dry Run (Step-by-Step Execution)
Loop in main()
for(int i = 0; i <= 5; i++)

✅ i = 0
fibo(0)
n <= 1 → return 0
Output: 0

✅ i = 1
fibo(1)
n <= 1 → return 1
Output: 1

✅ i = 2
fibo(2)
= fibo(1) + fibo(0)
= 1 + 0
= 1
Output: 1

✅ i = 3
fibo(3)
= fibo(2) + fibo(1)
= (fibo(1) + fibo(0)) + 1
= (1 + 0) + 1
= 2
Output: 2

✅ i = 4
fibo(4)
= fibo(3) + fibo(2)
= (fibo(2) + fibo(1)) + (fibo(1) + fibo(0))
= (1 + 1) + (1 + 0)
= 3
Output: 3

✅ i = 5
fibo(5)
= fibo(4) + fibo(3)
= 3 + 2
= 5
Output: 5

🧠 Important Concept: Overlapping in This Program
This Fibonacci program has overlapping recursion.

Example:
fibo(5)
 ├─ fibo(4)
 │   ├─ fibo(3)
 │   │   ├─ fibo(2)
 │   │   │   ├─ fibo(1)
 │   │   │   └─ fibo(0)
 │   │   └─ fibo(1)
 │   └─ fibo(2)
 │       ├─ fibo(1)
 │       └─ fibo(0)
 └─ fibo(3)
     ├─ fibo(2)
     │   ├─ fibo(1)
     │   └─ fibo(0)
     └─ fibo(1)
👉 Notice how fibo(2) and fibo(3) are calculated multiple times → overlapping recursion

➡ Same sub-problems are solved again and again
➡ This is called overlapping sub-problems

If we want to solve this problem of overlapping using a function recursion we have 
Solution dynamic programming 

------------------------------------------------------------------
Q. What is dynamic programming?
-----------------------------------------------------------------
Dynamic Programming (DP) is a problem-solving technique used to solve complex problems efficiently by breaking them into smaller overlapping sub-problems.

In Dynamic Programming, the result of each sub-problem is stored (memorized) so that it does not need to be recomputed again, which improves performance.

🔹 Key Characteristics of Dynamic Programming
    1️⃣ Overlapping sub-problems
        The same sub-problems appear multiple times.
    2️⃣ Optimal substructure
         The solution of a problem can be built using the solutions of its sub-problems.
    3️⃣ Storage of results
         Previously computed results are stored using:
            Arrays
            Tables
            Hash maps

🔹 Example Problems
    Fibonacci series
    Factorial optimization
    Knapsack problem
    Longest common subsequence

code using a memorizstion techniqueCode using a memorization technique
____________________________________________________________
import java.util.*;

public class DPAPP
{ 
    public static int fibo(int n, int arr[])
    {
        // if value already calculated
        if(arr[n] != 0)
        {
            return arr[n];
        }

        // base case
        if(n <= 1)//2<=1>
        {
            arr[n] = n;//1
        }
        else
        {   
            arr[n] = fibo(n - 1, arr) + fibo(n - 2, arr); // If already stored in arr, it is returned directly
        }

        return arr[n];
    }

    public static void main(String x[])
    {
        int limit = 5;
        int a[] = new int[limit + 1];

        Arrays.fill(a, 0); // Arrays.fill(arrayName, value);

        for(int i = 0; i <= limit; i++)//2<=5
        {
            System.out.print(fibo(i, a) + " ");//0 1 1
        }
    }
}

🔹 Dry Run (Loop Execution)
✅ i = 0
fibo(0)
n <= 1 → arr[0] = 0
return 0
arr = [0, 0, 0, 0, 0, 0]
Output: 0

✅ i = 1
fibo(1)
n <= 1 → arr[1] = 1
return 1
arr = [0, 1, 0, 0, 0, 0]
Output: 1

✅ i = 2
fibo(2)
arr[2] == 0
→ fibo(1) + fibo(0)
→ 1 + 0 = 1
arr[2] = 1
return 1
arr = [0, 1, 1, 0, 0, 0]
Output: 1

✅ i = 3
fibo(3)
arr[3] == 0
→ fibo(2) + fibo(1)
→ 1 + 1 = 2
arr[3] = 2
return 2
arr = [0, 1, 1, 2, 0, 0]
Output: 2

✅ i = 4
fibo(4)
arr[4] == 0
→ fibo(3) + fibo(2)
→ 2 + 1 = 3
arr[4] = 3
return 3
arr = [0, 1, 1, 2, 3, 0]
Output: 3

✅ i = 5
fibo(5)
arr[5] == 0
→ fibo(4) + fibo(3)
→ 3 + 2 = 5
arr[5] = 5
return 5
arr = [0, 1, 1, 2, 3, 5]
Output: 5

🖨 Final Output
0 1 1 2 3 5


🧠 How Dynamic Programming Works Here

    arr[] stores already calculated Fibonacci values
    Before computing fibo(n), we check:

    if(arr[n] != 0)

    If value exists → return it (no recalculation)
    This avoids overlapping recursion

🌳 Without DP (Normal Recursion)

    Same Fibonacci values calculated many times
    Time complexity: O(2ⁿ) ❌

🌳 With DP (Memoization)

    Each value calculated once
    Time complexity: O(n) ✅
    Space complexity: O(n)

Q. What is the difference between Iteration and Recursion?

| **Iteration**                                  | **Recursion**                                               |
| ---------------------------------------------- | ----------------------------------------------------------- |
| Uses **loops** like `for`, `while`, `do-while` | Function **calls itself**                                   |
| Executes statements **repeatedly**             | Solves problem by breaking it into **smaller sub-problems** |
| Uses **constant memory**                       | Uses **stack memory** for each call                         |
| No risk of stack overflow                      | May cause **StackOverflowError**                            |
| Usually **faster**                             | Usually **slower** due to function call overhead            |
| Easier to **debug and trace**                  | Harder to debug                                             |
| Best when loop count is **known or fixed**     | Best when problem is **naturally recursive**                |
| Code can be longer for complex problems        | Code is often **shorter and cleaner**                       |







