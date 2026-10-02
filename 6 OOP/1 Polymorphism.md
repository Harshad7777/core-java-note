# Polymorphism in Java

[Definition](#definition) | [Examples](#examples-of-polymorphism) | [Types](#types-of-polymorphism-in-java) | [Method Overloading](#method-overloading) | [Benefits](#benefits-of-method-overloading) | [Scenarios](#scenarios-where-overloading-is-useful)

---

## Definition

Polymorphism means one thing having many forms.

In programming, when the same method or object behaves differently in different situations, it is called polymorphism.

- Poly = many
- Morph = forms

So, polymorphism = many forms.

> Polymorphism is a concept. In Java, we implement it using specific techniques.

---

## Examples of Polymorphism

### Example 1: Mobile Device
A mobile phone is one device, but it performs different behaviors:

- Phone (calling)
- Calculator
- Calendar
- TV
- Camera

Same object, different behavior based on requirement.

### Example 2: Person
A single person behaves differently:

- Acts as a manager with a team
- Acts as an employee in front of a CEO/VP
- Acts as a child at home

One person, multiple roles and behaviors.

---

## Types of Polymorphism in Java

There are two types of polymorphism in Java:

### 1. Compile-Time Polymorphism

- Binding of method happens at compile time
- Also called Static Polymorphism
- Achieved using Method Overloading
- Method Overloading → Same method name, different parameters

### 2. Runtime Polymorphism

- Binding of method happens at runtime
- Also called Dynamic Polymorphism
- Achieved using Method Overriding
- Requires Inheritance
- We will study overriding in the Inheritance chapter

---

## Method Overloading

### Definition

Method overloading means having more than one method with the same name but with a different parameter list.

### Rules of Method Overloading

Methods must differ by:

- Number of parameters
- Type of parameters
- Sequence (order) of parameters

❌ Return type alone cannot be used for overloading.

### Example of Method Overloading in Java

```java
class MathOperation
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
```

✅ Same method name: `add()`

✅ Different parameter list

✅ This is compile-time polymorphism

---

## Example: WAP to calculate square of integer and float using overloading

```java
public class OAPP
{
    public static void main(String x[])
    {
        int result = square(5);   // call int version
        System.out.println("Square of integer is " + result);

        square(5.5f);             // call float version
    }

    public static int square(int no)
    {
        return no * no;
    }

    public static void square(float x)
    {
        System.out.println("Square of float is " + (x * x));
    }
}
```

Output:

```java
Square of integer is 25
Square of float is 30.25
```

### Concept Used

- Same method name: `square`
- Different parameter types: `int`, `float`
- Decided at compile time
- This is compile-time polymorphism

---

## Why Use Method Overloading?

We need method overloading because:

- We may have multiple logics under the same domain
- Each logic may require different parameters
- If we define different function names for each logic, remembering them becomes difficult

Java solves this by allowing multiple methods with the same name but different parameter lists.

Because of this, the developer needs to remember only one method name, and Java decides which method to call based on the arguments passed.

---

## Best Example of Method Overloading: println()

The `println()` method is a real-time example of method overloading.

```java
System.out.println(10);        // int version
System.out.println(10.5f);     // float version
System.out.println("Java");    // String version
System.out.println(true);      // boolean version
```

Here:

- Domain → Output printing on console
- Different logics → Printing int, float, String, etc.
- Single method name → `println()`

### Conclusion

Method overloading:

- Improves code readability
- Reduces developer effort
- Makes code easy to use and maintain
- Supports compile-time polymorphism

---

## Benefits of Method Overloading

Method overloading is beneficial in many real applications.

### Example: Inventory Control System

```java
class PerformSort
{
    public void sortProduct(String name)
    {
        // sorting product by name logic
    }

    public void sortProduct(int price)
    {
        // sorting product by price logic
    }
}
```

This allows the same method name to handle different data types or requirements.

---

## Scenarios where Overloading is Useful

### Example: Billing Software

Suppose billing software supports two types of bills:

- Without GST
- With GST

```java
public class BAPP
{
    public static void main(String x[])
    {
        bill(10, 100, 18); // call bill with GST
        bill(10, 100);     // call bill without GST
    }

    // bill with GST
    public static void bill(int qty, int rate, int gstRate)
    {
        int gstAmt = (qty * rate) * gstRate / 100;
        int total = (qty * rate) + gstAmt;
        System.out.println("Total bill with GST: " + total);
    }

    // bill without GST
    public static void bill(int qty, int rate)
    {
        int total = qty * rate;
        System.out.println("Total bill without GST: " + total);
    }
}
```

### Example: Sort Integer Array and Character Array

```java
public class SortData
{
    public static void main(String x[])
    {
        int a[] = {5, 6, 3, 2, 1};
        char ch[] = {'d', 'b', 'c', 'a', 'e'};

        sort(a);   // call int array sort
        sort(ch);  // call char array sort
    }

    // sort integer array
    public static void sort(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Integer Array:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // sort character array
    public static void sort(char arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Sorted Character Array:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```

---

## Key Points Summary

- Polymorphism = many forms
- Java supports compile-time and runtime polymorphism
- Method overloading is compile-time polymorphism
- Same method name but different parameters
- Return type alone is not enough for overloading
- Overloading improves readability and reduces confusion



