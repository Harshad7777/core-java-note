# Q. What is Inheritance?

Inheritance is a mechanism in Java where one class acquires (inherits) the properties and behaviors of another class.

* **Parent class / Super class / Base class**: The class whose properties are inherited
* **Child class / Sub class / Derived class**: The class that inherits the properties

## Definition (Standard)

Inheritance means transferring the properties (variables) and behaviors (methods) of one class into another class.

---

## IS–A Relationship

When inheritance is performed between two classes, they are connected by an **IS–A relationship**.

**Examples:**

* Math IS-A Subject
* Dog IS-A Animal
* Car IS-A Vehicle

---

# Q. Why use Inheritance? / What are the benefits of Inheritance?

Inheritance is used in Java to reuse existing code, extend functionality, and establish a relationship between classes.

## Benefits of Inheritance

### 1️⃣ Reusability

Reusability means using the properties and methods of an existing class in another class.

* Common logic is written once in the parent class
* Child classes can reuse that logic
* Reduces code duplication

**Example:**
If multiple classes require calculator operations (ADD, SUB, MUL, DIV), define them once in a parent class and reuse them.

---

### 2️⃣ Extensibility

Extensibility means the child class can extend the functionality of the parent class.

```java
class Calculator {
    void add() { }
    void sub() { }
}

class AdvancedCalculator extends Calculator {
    void mul() { }
    void div() { }
}
```

---

### 3️⃣ Abstraction

Inheritance helps in achieving abstraction by:

* Showing only required features
* Hiding unnecessary details

---

### 4️⃣ Dynamic Polymorphism

Inheritance is required to achieve runtime polymorphism.

* Parent reference can refer to child object
* Method overriding allows dynamic method binding

---

## Summary Table

| Benefit       | Description                               |
| ------------- | ----------------------------------------- |
| Reusability   | Write once, use multiple times            |
| Extensibility | Add new features without modifying parent |
| Abstraction   | Hides internal implementation             |
| Polymorphism  | Enables dynamic behavior                  |

---

# Q. Types of Inheritance / How many ways to perform inheritance?

## 1️⃣ Single Level Inheritance

```java
class A { }
class B extends A { }
```

## 2️⃣ Multilevel Inheritance

```java
class A { }
class B extends A { }
class C extends B { }
```

## 3️⃣ Hierarchical Inheritance

```java
class A { }
class B extends A { }
class C extends A { }
```

## 4️⃣ Multiple Inheritance (Interfaces)

```java
interface A { }
interface B { }
class C implements A, B { }
```

## 5️⃣ Hybrid Inheritance

Combination of two or more inheritance types (achieved using interfaces).

### ⭐ Important Java Note

| Type         | Supported in Java (Classes) |
| ------------ | --------------------------- |
| Single Level | ✅ Yes                       |
| Multilevel   | ✅ Yes                       |
| Hierarchical | ✅ Yes                       |
| Multiple     | ❌ No                        |
| Hybrid       | ❌ No                        |

---

# Q. How to implement inheritance practically in Java?

Inheritance in Java is implemented using the `extends` keyword.

```java
class Parent {
    // variables and methods
}

class Child extends Parent {
    // child class variables and methods
}
```

---

# Q. Can we create a Java program without inheritance?

❌ No. Every Java class implicitly extends `java.lang.Object`.

```java
class A { }

// Compiler generated
class A extends java.lang.Object { }
```

---

# What is Object Class?

* Root class of Java
* Present in `java.lang` package
* All classes inherit from Object

## Important Methods

| Method           | Purpose               |
| ---------------- | --------------------- |
| equals()         | Compares objects      |
| hashCode()       | Returns hash value    |
| toString()       | String representation |
| clone()          | Copy object           |
| getClass()       | Runtime class info    |
| wait(), notify() | Thread communication  |

**One-Line Answer:** Object class is the superclass of all Java classes.

---

# Is Java a Pure Object-Oriented Language?

❌ No.

**Reason:**

* Supports primitive data types
* Allows static members

**Conclusion:** Java is strongly object-oriented but not pure OOP.

---

# Example: Hierarchical Inheritance

```java
class Value {
    int x,y;
    void setValue(int x,int y) {
        this.x=x;
        this.y=y;
    }
}
class Add extends Value {
    int getAdd() { return x+y; }
}
class Mul extends Value {
    int getMul() { return x*y; }
}
```

---

# Constructor with Inheritance

* Parent constructor executes first
* Then child constructor

```java
class A {
    A() { System.out.println("Parent"); }
}
class B extends A {
    B() { System.out.println("Child"); }
}
```

---

# super() Constructor

Used to call parent class constructor.

**Rules:**

* Must be first statement
* Mandatory for parameterized parent constructor

---

# Method Overriding

Method overriding occurs when child class redefines parent method with same signature.

```java
class A {
    void show() { System.out.println("A"); }
}
class B extends A {
    void show() { System.out.println("B"); }
}
```

---

# Dynamic Polymorphism

Achieved using method overriding and upcasting.

```java
Parent p = new Child();
```

---

# Coupling in OOP

Coupling refers to dependency between classes.

## Types

### Tight Coupling

* Direct dependency
* Hard to modify

### Loose Coupling

* Uses interface or parent reference
* Flexible and reusable

---

# Final Keyword

Used with variable, method, and class.

* Final variable → constant
* Final method → cannot override
* Final class → cannot inherit

---

# Final Conclusion

Inheritance enables **code reuse, extensibility, abstraction, and runtime polymorphism**, and is a core pillar of Java OOP.
