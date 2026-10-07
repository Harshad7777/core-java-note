# Constructor in Java

## Quick Navigation
- [What Is a Constructor?](#what-is-a-constructor)
- [Implicit Constructor](#implicit-constructor)
- [Types of Constructors](#types-of-constructors)
- [Default Constructor](#default-constructor)
- [Parameterized Constructor](#parameterized-constructor)
- [Constructor Overloading](#constructor-overloading)
- [Constructor Chaining](#constructor-chaining)
- [Can a Constructor Have Return Type?](#can-a-constructor-have-return-type)
- [Can a Constructor Be Static?](#can-a-constructor-be-static)
- [Can a Constructor Be Private?](#can-a-constructor-be-private)
- [Utility Class](#utility-class)
- [Singleton Class](#singleton-class)
- [Can a Constructor Be Final?](#can-a-constructor-be-final)
- [Can a Constructor Be Abstract?](#can-a-constructor-be-abstract)
- [Can a Constructor Be Overridden?](#can-a-constructor-be-overridden)
- [Function vs Constructor](#function-vs-constructor)

---

## What Is a Constructor?
A constructor is a special function in a class.

### Properties of a constructor
1. It has the same name as the class.

```java
class Student
{
    Student()
    {
        // constructor name = class name
    }
}
```

2. It has no return type, not even `void`.
3. It is called automatically when an object is created.
4. It is used to initialize class members (variables).

Example:

```java
Student s = new Student();
```

This automatically calls the constructor.

---

## Syntax of Constructor

### 1. Default / No-argument constructor
```java
class ClassName
{
    ClassName()
    {
        // initialization code
    }
}
```

### 2. Parameterized constructor
```java
class ClassName
{
    ClassName(int x, String y)
    {
        // initialize variables
    }
}
```

### Example
```java
class Circle
{
    float PI, radius;

    Circle() // default constructor
    {
        PI = 3.14f;
    }

    void setRadius(float radius)
    {
        this.radius = radius;
    }

    float getArea()
    {
        return radius * radius * PI;
    }
}

public class CircleApplication
{
    public static void main(String x[])
    {
        Circle c = new Circle();
        c.setRadius(3.0f);
        float result = c.getArea();
        System.out.println("Area of circle is " + result);
    }
}
```

> If we do not declare any constructor in a class, Java automatically adds a default constructor.

---

## Implicit Constructor
If a class does not have any constructor, Java compiler automatically adds a default no-argument constructor.

### Example
```java
class ABC
{
    // code written by developer
}
```

When compiled, it behaves like:

```java
class ABC
{
    ABC();
}
```

This is called an implicit constructor.

---

## Types of Constructors
1. Default constructor (no parameters)
2. Parameterized constructor
3. Overloaded constructors
4. `this()` and `super()` constructor chaining

---

## Default Constructor
A constructor without parameters.

Used to:
- assign default values
- initialize object data with initial values

### Example
```java
class ABC
{
    ABC() // default constructor
    {

    }
}
```

### Example: Fibonacci class
```java
class Fibo
{
    int f1, f2, limit;

    Fibo() // default constructor
    {
        f1 = 0;
        f2 = 1;
    }

    void setLimit(int limit)
    {
        this.limit = limit;
    }

    void display()
    {
        System.out.printf("%d %d\n", f1, f2);

        for (int i = 1; i <= limit; i++)
        {
            int fib = f1 + f2;
            f1 = f2;
            f2 = fib;

            System.out.printf("%d ", fib);
        }
    }
}
```

```java
public class FibApplication
{
    public static void main(String x[])
    {
        Fibo f = new Fibo();
        f.setLimit(5);
        f.display();
    }
}
```

---

## Parameterized Constructor
A constructor that accepts arguments.

Used when:
- object must be initialized with dynamic or user-given values
- avoids using setters

### Example
```java
class Cube
{
    int x;

    Cube(int x) // parameterized constructor
    {
        this.x = x;
    }

    int getCube()
    {
        return x * x * x;
    }
}
```

```java
public class CubeApplication
{
    public static void main(String x[])
    {
        Cube c = new Cube(5);
        int result = c.getCube();
        System.out.println("Cube is " + result);
    }
}
```

### Output
```text
Cube is 125
```

### Example: Array parameter constructor
```java
import java.util.*;

class InitArray
{
    int arr[];

    InitArray(int arr[])
    {
        this.arr = arr;
    }

    int getMax()
    {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    int[] getSortedArray()
    {
        Arrays.sort(arr);
        return arr;
    }
}
```

```java
public class ParamConsApplication
{
    public static void main(String x[])
    {
        int[] m = new int[5];
        Scanner xyz = new Scanner(System.in);

        for (int i = 0; i < m.length; i++)
        {
            m[i] = xyz.nextInt();
        }

        InitArray ia = new InitArray(m);
        int maxValue = ia.getMax();
        System.out.println("Max value is " + maxValue);

        int[] nsarr = ia.getSortedArray();
        System.out.println("\nSorted Array is ");

        for (int i = 0; i < nsarr.length; i++)
        {
            System.out.print(nsarr[i] + " ");
        }
    }
}
```

---

## Parameter Passing Through Object
This is a common pattern in OOP.

### Example using Employee and Company
```java
class Employee
{
    private int id;
    private String name;
    private int sal;

    public Employee(String name, int id, int sal)
    {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getSal()
    {
        return sal;
    }
}

class Company
{
    Employee employee;

    Company(Employee employee)
    {
        this.employee = employee;
    }

    void show()
    {
        System.out.println(employee.getId() + "\t" + employee.getName() + "\t" + employee.getSal());
    }
}

public class ConsPOJOAPP
{
    public static void main(String x[])
    {
        Company c = new Company(new Employee("ABC", 1, 10000));
        c.show();
    }
}
```

> This is better than creating a separate object reference just for passing the value.

---

## Constructor Overloading
When multiple constructors have the same name but different parameters.

### Rules
- Same name
- Different number/order/type of parameters

### Example
```java
class Area
{
    Area(float radius)
    {
        float result = radius * radius * 3.14f;
        System.out.println("Area of circle is " + result);
    }

    Area(int len, int width)
    {
        int result = len * width;
        System.out.println("Area of rectangle is " + result);
    }
}
```

```java
public class AreaApplication
{
    public static void main(String x[])
    {
        Area a1 = new Area(5.4f);
        Area a2 = new Area(5, 4);
    }
}
```

---

## Constructor Chaining
Calling one constructor from another.

Constructor chaining means when a class has multiple constructors and one constructor calls another constructor using `this()` (or parent constructor using `super()`) without using the `new` keyword.

### Why not use `new`?
Because the object is created only once.
Constructors are called in a chain, not new objects.

### Two ways
1. `this()` → calls a constructor in the same class.
2. `super()` → calls a constructor of the parent class.

### Example
```java
class A
{
    A()
    {
        this(5);
        System.out.println("I AM A CONSTRUCTOR");
    }

    A(int x)
    {
        this(5.5f);
        System.out.println("I am int param constructor " + x);
    }

    A(float x)
    {
        System.out.println("I am float constructor " + x);
    }
}
```

```java
public class CChainApp
{
    public static void main(String x[])
    {
        A a1 = new A();
    }
}
```

### Output
```text
I am float constructor 5.5
I am int param constructor 5
I AM A CONSTRUCTOR
```

### Example: Calling a parent constructor with `super()`
Use `super(arguments)` in a child-class constructor to call a matching
constructor in its parent class. The `super(...)` call must be the first
statement in the child constructor.

```java
class Person
{
    String name;

    Person(String name)
    {
        this.name = name;
        System.out.println("Person constructor called");
    }
}

class Employee extends Person
{
    int employeeId;

    Employee(String name, int employeeId)
    {
        super(name); // Calls Person(String name)
        this.employeeId = employeeId;
        System.out.println("Employee constructor called");
    }

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

public class SuperConstructorApp
{
    public static void main(String args[])
    {
        Employee employee = new Employee("Asha", 101);
        employee.display();
    }
}
```

### Output
```text
Person constructor called
Employee constructor called
Name: Asha
Employee ID: 101
```

### Custom stack example
```java
import java.util.Scanner;

class MyStack
{
    int stack[];
    int top;

    // Default constructor
    MyStack()
    {
        this(5); // default size = 5
    }

    // Constructor with user-defined size
    MyStack(int userChoice)
    {
        this(userChoice, 2); // initial size, grow size
    }

    // Constructor with size and increment size
    MyStack(int userChoice, int incSize)
    {
        stack = new int[userChoice];
        top = -1;
    }

    // Push element into stack
    void push(int value)
    {
        // Check whether stack is full
        if (top == stack.length - 1)
        {
            int newStack[] = new int[stack.length * 2];

            // Copy old elements
            for (int i = 0; i < stack.length; i++)
            {
                newStack[i] = stack[i];
            }

            stack = newStack;

            System.out.println("Stack size increased to: " + stack.length);
        }

        top++;
        stack[top] = value;

        System.out.println(value + " pushed into stack.");
    }

    // Remove element from stack
    int pop()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty.");
            return -1;
        }

        int value = stack[top];
        top--;

        return value;
    }

    // Display top element
    int peek()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty.");
            return -1;
        }

        return stack[top];
    }

    // Display stack elements
    void display()
    {
        if (top == -1)
        {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements:");

        for (int i = top; i >= 0; i--)
        {
            System.out.println(stack[i]);
        }
    }
}

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        MyStack s = new MyStack(size);

        int choice;

        do
        {
            System.out.println("\n----- STACK MENU -----");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    s.push(value);
                    break;

                case 2:
                    int popped = s.pop();

                    if (popped != -1)
                    {
                        System.out.println("Popped element: " + popped);
                    }
                    break;

                case 3:
                    int topElement = s.peek();

                    if (topElement != -1)
                    {
                        System.out.println("Top element: " + topElement);
                    }
                    break;

                case 4:
                    s.display();
                    break;

                case 5:
                    System.out.println("Program terminated.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}
```

---

## Can a Constructor Have Return Type?
No.

If you add a return type, it becomes a method, not a constructor.

---

## Can a Constructor Be Static?
No.

A constructor cannot be static because static members are loaded before objects are created, while constructors run only when an object is created.

### Example
```java
class A
{
    static A()
    {
        System.out.println("Hello");
    }
}
```

### Error
```text
error: modifier static not allowed here
```

---

## Can a Constructor Be Private?
Yes.

A private constructor prevents object creation from outside the class.

### Example
```java
class A
{
    private A()
    {
        System.out.println("Hello");
    }
}
```

```java
public class CChainAPP
{
    public static void main(String[] x)
    {
        A a1 = new A();
    }
}
```

### Error
```text
error: A() has private access in A
```

This is useful for:
- utility classes
- singleton classes

---

## Utility Class
A utility class:
- cannot create objects
- has a private constructor
- contains only static methods

### Example
```java
class A
{
    private A()
    {
        System.out.println("Hello");
    }

    static void show()
    {
        System.out.println("I am show method");
    }
}
```

```java
public class CChainAPP
{
    public static void main(String x[])
    {
        A.show();
    }
}
```

### Output
```text
I am show method
```

A static method:
- belongs to the class, not to an object
- can be called using the class name
- does not require an object

---

## Singleton Class
A singleton class allows only one object in the entire application.

### Steps
1. Private constructor
2. Private static object reference
3. Public static method returning that object

### Example
```java
class S
{
    // Only one object reference
    private static S s1 = null;

    // Private constructor
    private S()
    {
        System.out.println("I am constructor");
    }

    // Factory method to create/get the object
    public static S getInstance()
    {
        if (s1 == null)
        {
            s1 = new S();
        }

        return s1;
    }
}

public class SCAPP
{
    public static void main(String x[])
    {
        S s1 = S.getInstance();
        S s2 = S.getInstance();
        S s3 = S.getInstance();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);
    }
}
```

### Output
```text
I am constructor
S@5acf9800
S@5acf9800
S@5acf9800
true
true
true
```

### Memory behavior
Only one object is created in heap memory. All references point to the same object.

```text
new S() -> 10000

Stack:
s1 -> 10000
s2 -> 10000
s3 -> 10000
```

---

## Can a Constructor Be Final?
No.

Reason: `final` prevents overriding, and constructors cannot be overridden.

---

## Can a Constructor Be Abstract?
No.

Reason: abstract means incomplete, but a constructor must be complete.

---

## Can a Constructor Be Overridden?
No.

Constructors are not inherited, so overriding is impossible.

---

## Function vs Constructor

| Function | Constructor |
| --- | --- |
| Can have any name | Must have the same name as the class |
| Must have a return type | No return type |
| Can be static | Cannot be static |
| Called manually | Called automatically |
| Used to write logic | Used to initialize objects |
| Can be final | Cannot be final |
| Can be overridden | Cannot be overridden |
| Supports recursion | Constructor cannot |

---

## Summary
A constructor is a special method used to initialize objects when they are created. It has no return type, must match the class name, and can be default, parameterized, or overloaded. Constructor chaining, private constructors, and singleton/utility class patterns are important advanced concepts in Java OOP.
