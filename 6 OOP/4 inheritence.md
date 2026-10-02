# Inheritance in Java

[Definition](#definition) | [Benefits](#why-use-inheritance) | [Types](#types-of-inheritance) | [Object Class](#object-class) | [Constructors](#constructor-with-inheritance) | [Method Overriding](#method-overriding) | [Abstract Classes](#abstract-class-and-abstract-method) | [Interfaces](#interface)

---

## Definition

Inheritance is a mechanism in Java where one class acquires the properties and behaviors of another class.

- Parent class / Super class / Base class: the class whose members are inherited
- Child class / Sub class / Derived class: the class that inherits those members

Definition:

Inheritance means transferring the properties (variables) and behaviors (methods) of one class into another class.

### IS-A Relationship

When inheritance is performed between two classes, they are connected by an IS-A relationship.

Examples:

- Car IS-A Vehicle
- Dog IS-A Animal
- Math IS-A Subject

---

## Why use Inheritance?

Inheritance is used to:

- reuse existing code
- extend functionality
- establish relationships between classes

### Benefits of Inheritance

#### 1. Reusability

Reusability means using the properties and methods of an existing class in another class.

Common logic is written once in the parent class and reused by child classes.

#### 2. Extensibility

The child class can add new features without modifying the parent class.

#### 3. Abstraction

Inheritance helps hide unnecessary details and show only relevant features.

#### 4. Dynamic Polymorphism

Inheritance is required to achieve runtime polymorphism through method overriding.

| Benefit | Description |
| ------- | ----------- |
| Reusability | Write once, use multiple times |
| Extensibility | Add new features without changing parent |
| Abstraction | Hides implementation details |
| Polymorphism | Enables dynamic behavior |

---

## Types of Inheritance

Inheritance can be performed in the following ways:

### 1. Single-Level Inheritance

One parent class is inherited by one child class.

```java
class A
{
}

class B extends A
{
}
```

### 2. Multilevel Inheritance

A class is derived from another class that is already derived.

```java
class A
{
}

class B extends A
{
}

class C extends B
{
}
```

### 3. Hierarchical Inheritance

One parent class has more than one child class.

```java
class A
{
}

class B extends A
{
}

class C extends A
{
}
```

### 4. Multiple Inheritance

One child class inherits from more than one parent class.

Java does not support multiple inheritance using classes because of the Diamond Problem and ambiguity.

Java supports multiple inheritance using interfaces.

```java
interface A
{
}

interface B
{
}

class C implements A, B
{
}
```

### 5. Hybrid Inheritance

Hybrid inheritance is a combination of two or more inheritance types.

Java does not support hybrid inheritance with classes, but it can be achieved using interfaces.

### Important Exam Note

| Type | Supported in Java (Classes) |
| ---- | --------------------------- |
| Single Level | ✅ Yes |
| Multilevel | ✅ Yes |
| Hierarchical | ✅ Yes |
| Multiple | ❌ No |
| Hybrid | ❌ No |

---

## How to implement inheritance in Java?

Inheritance is implemented using the extends keyword.

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
    void display()
    {
        System.out.println("Child");
    }
}
```

---

## Can we create a Java program without inheritance?

No, it is not possible to create a Java program without inheritance.

Reason:

Every class in Java is implicitly inherited from the Object class.

```java
class A
{
}

// compiler-generated code
class A extends java.lang.Object
{
}
```

---

## Object Class

The Object class is the root class of Java.

Every class in Java directly or indirectly inherits from Object.

It contains common methods needed by every Java class.

### Important methods of Object class

| Method | Purpose |
| ------ | ------- |
| boolean equals(Object obj) | Compares two objects |
| int hashCode() | Returns hash value |
| String toString() | Returns string representation |
| Object clone() | Creates a copy |
| Class getClass() | Returns runtime class information |
| void wait() | Causes thread to wait |
| void notify() | Wakes up one waiting thread |
| void notifyAll() | Wakes up all waiting threads |
| void finalize() | Called before garbage collection |

### One-line exam answer

Object class is the superclass of all Java classes and provides common methods required for basic object operations.

---

## Is Java a pure object-oriented language?

No, Java is not a pure object-oriented language.

Why?

- Java supports primitive data types such as int, float, char, and boolean
- Primitive types are not objects
- Java is strongly object-oriented, but not 100% pure OOP

---

## Constructor with Inheritance

When a parent class has a default constructor and the child class has its own constructor, the parent constructor executes first, followed by the child constructor.

```java
class A
{
    A()
    {
        System.out.println("I am parent constructor");
    }
}

class B extends A
{
    B()
    {
        System.out.println("I am child constructor");
    }
}
```

Output:

```java
I am parent constructor
I am child constructor
```

### Parameterized Parent Constructor

If a parent class has a parameterized constructor, then the child class must call it using super().

```java
class A
{
    A(int x)
    {
        System.out.println("I am parent constructor " + x);
    }
}

class B extends A
{
    B()
    {
        super(100);
        System.out.println("I am child constructor");
    }
}
```

Important points:

- super() calls the parent constructor
- It is used when the parent has a parameterized constructor
- It helps initialize parent class data
- Constructor chaining happens automatically

---

## What is super() constructor and why is it used?

super() is used inside a child class constructor to call the parent class constructor.

Why do we use it?

- to invoke the parent constructor
- to pass values to the parent constructor
- to initialize parent class members
- to maintain constructor chaining

### this() vs super()

| this() | super() |
| ------ | ------- |
| Refers to current class constructor | Refers to parent class constructor |
| Used for constructor chaining in same class | Used for chaining between parent and child classes |
| Calls another constructor of same class | Calls constructor of immediate parent class |

---

## Method Overriding

Method overriding is when a child class defines a method with the same name and same signature as the parent class.

Conditions:

- same method name
- same parameter list
- same return type or covariant return type
- access modifier cannot be more restrictive than parent

Example:

```java
class A
{
    void show()
    {
        System.out.println("I am in A");
    }
}

class B extends A
{
    void show()
    {
        System.out.println("I am in B");
    }
}
```

When we call the method using a child object, the child version executes.

### Why use method overriding?

- customize parent logic
- achieve runtime polymorphism
- provide child-specific behavior

### Dynamic Polymorphism

Dynamic polymorphism occurs when the method call is resolved at runtime based on the object, not the reference type.

This is achieved through method overriding and upcasting.

```java
class Value
{
    int x, y;

    void setValue(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    int getResult()
    {
        return 0;
    }
}

class Add extends Value
{
    int getResult()
    {
        return x + y;
    }
}

class Mul extends Value
{
    int getResult()
    {
        return x * y;
    }
}

public class DPAPP
{
    public static void main(String[] args)
    {
        Value v = new Add();
        v.setValue(10, 20);
        System.out.println(v.getResult());

        v = new Mul();
        v.setValue(5, 4);
        System.out.println(v.getResult());
    }
}
```

---

## Coupling in OOP

Coupling is the degree of dependency between two classes.

### Tight Coupling

When one class depends directly on a concrete class, it is tightly coupled.

### Loose Coupling

When code depends on a parent class or interface instead of a concrete class, it is loosely coupled.

Loose coupling is preferred because it is more flexible and reusable.

---

## final keyword

final can be used with:

- variables
- methods
- classes

### final variable

A final variable cannot be changed once assigned.

### final method

A final method cannot be overridden.

### final class

A final class cannot be inherited.

```java
final class A
{
    final void show()
    {
        System.out.println("Final method");
    }
}
```

---

## static vs final

| Aspect | static | final |
| ------ | ------ | ----- |
| Belongs to | Class | Constant/fixed value |
| Used for | Shared behavior | Restrict modification |
| Method overriding | Cannot override (method hiding) | Cannot override |
| Class inheritance | Inherited with rules | Prevents inheritance |

---

## Method Hiding

Static methods cannot be overridden. If the child class defines a static method with the same signature, it is called method hiding.

```java
class Parent
{
    static void show()
    {
        System.out.println("Parent show");
    }
}

class Child extends Parent
{
    static void show()
    {
        System.out.println("Child show");
    }
}

public class Test
{
    public static void main(String[] args)
    {
        Parent p = new Child();
        p.show();
    }
}
```

Output:

```java
Parent show
```

This happens because static methods are resolved at compile time based on the reference type, not at runtime based on the object type.

---

## Abstract Class and Abstract Method

An abstract class is a class whose object cannot be created.

An abstract method is a method without a body.

### Rules

- abstract class may contain abstract and non-abstract methods
- abstract method must be implemented in the child class
- if a class contains an abstract method, the class must be abstract
- abstract class cannot be instantiated

```java
abstract class Employee
{
    abstract void skill();
}

class Developer extends Employee
{
    void skill()
    {
        System.out.println("Coding");
    }
}
```

### Purpose of abstract class

- achieve abstraction
- achieve dynamic polymorphism
- achieve loose coupling

---

## Interface

An interface is a reference type in Java that contains abstract methods and constants.

### Why use an interface?

- multiple inheritance support
- loose coupling
- full abstraction
- dynamic polymorphism

### Example

```java
interface Test
{
    void show();
}

class Demo implements Test
{
    public void show()
    {
        System.out.println("Interface implemented");
    }
}
```

### Why Java does not support multiple inheritance with classes

Because of the Diamond Problem.

If two parent classes contain methods with the same name, the child class becomes confused about which method to call.

Java solves this by allowing multiple inheritance through interfaces.

---

## Key Points Summary

- Inheritance means reusing parent class members in child class
- extends keyword is used for inheritance
- Java supports single, multilevel, and hierarchical inheritance with classes
- Multiple inheritance with classes is not allowed
- super() calls the parent constructor
- Method overriding supports runtime polymorphism
- final prevents modification and inheritance
- abstract classes help achieve abstraction
- interfaces provide multiple inheritance and loose coupling

---

## Short Exam Revision

- Inheritance = parent properties + child extension
- IS-A relationship is the basis of inheritance
- Object is the root class of all Java classes
- super() is used to call parent constructor
- Overriding allows runtime behavior change
- final method/class cannot be changed
- abstract class cannot be instantiated
- interface is used for abstraction and multiple inheritance
