# Abstraction in Java

## Quick Navigation
- [Q1. What is Abstraction in Java and What are its Benefits?](#q1-what-is-abstraction-in-java-and-what-are-its-benefits)
- [Q2. How is Abstraction Achieved in Java?](#q2-how-is-abstraction-achieved-in-java)
- [Q3. What is an Abstract Class and an Abstract Method?](#q3-what-is-an-abstract-class-and-an-abstract-method)
- [Q4. What are the Rules of Abstract Classes and Abstract Methods?](#q4-what-are-the-rules-of-abstract-classes-and-abstract-methods)
- [Q5. Can an Abstract Class Have a Constructor?](#q5-can-an-abstract-class-have-a-constructor)
- [Q6. What is an Interface in Java and Why Do We Use It?](#q6-what-is-an-interface-in-java-and-why-do-we-use-it)
- [Q7. Why Does Java Not Support Multiple Inheritance with Classes, and How Do Interfaces Solve It?](#q7-why-does-java-not-support-multiple-inheritance-with-classes-and-how-do-interfaces-solve-it)
- [Q8. What is the Difference Between an Abstract Class and an Interface?](#q8-what-is-the-difference-between-an-abstract-class-and-an-interface)
- [Q9. What are Tight Coupling and Loose Coupling in Abstraction?](#q9-what-are-tight-coupling-and-loose-coupling-in-abstraction)
- [Q10. Practical Real-World Implementation Examples](#q10-practical-real-world-implementation-examples)
- [Summary and Rapid-Fire Interview Revision](#summary-and-rapid-fire-interview-revision)

---

## Q1. What is Abstraction in Java and What are its Benefits?

### Definition
**Abstraction** is the process of **hiding internal implementation details and showing only essential features / services** to the outside world.

- In simple words: **"Focus on what an object does, rather than how it does it."**
- It represents the **outside view** of an object.

```text
User / Caller ---> [ Public Interface / Method ] ---> [ Internal Implementation Hidden ]
```

### Real-World Examples
1. **ATM Machine:**
   - You insert your card, enter your PIN, and withdraw money.
   - You do not know the internal database queries, network calls, or cash dispenser mechanics. You only interact with the provided interface.
2. **Car Driver:**
   - The driver uses the accelerator pedal to speed up and the brake pedal to stop.
   - The driver does not need to know internal fuel injection, combustion chamber firing, or transmission mechanics.
3. **TV Remote:**
   - Pressing volume up increases sound. The internal circuit board signals and infrared encoding remain hidden.

### Benefits of Abstraction
1. **Security & Data Hiding:** Internal implementation logic is protected from unauthorized access or unintended tampering.
2. **Maintainability & Flexibility:** The internal implementation can be modified, optimized, or rewritten without affecting client code that calls it.
3. **Reduced Complexity:** The programmer only needs to understand the method signature, not the complex underlying code.
4. **Loose Coupling:** Client code depends on abstract definitions rather than concrete classes, making systems modular and scalable.

---

## Q2. How is Abstraction Achieved in Java?

In Java, abstraction is achieved in two ways:

| Technique | Level of Abstraction | Description |
| :--- | :--- | :--- |
| **1. Abstract Class** | **0% to 100% (Partial Abstraction)** | Can contain both abstract methods (no body) and concrete methods (with body). |
| **2. Interface** | **100% (Full Abstraction)** | Contains only abstract method signatures (before Java 8) and constants. |

```text
                Abstraction in Java
                       │
         ┌─────────────┴─────────────┐
         ▼                           ▼
   Abstract Class                Interface
(0% to 100% Abstraction)     (100% Full Abstraction)
```

---

## Q3. What is an Abstract Class and an Abstract Method?

### 1. Abstract Class
An **abstract class** is a class declared with the `abstract` keyword **whose object cannot be directly created (instantiated) using the `new` keyword**.

- It acts as a base blueprint for child classes.
- It can have instance variables, static variables, constructors, abstract methods, and regular (concrete) methods.

```java
abstract class Animal
{
    // Abstract class - cannot do: Animal a = new Animal(); // ❌ Compile Error
}
```

### 2. Abstract Method
An **abstract method** is a method that has **no implementation (no body)** and ends with a semicolon (`;`).

- It defines **what** to do, leaving **how** to do it to the child class.

```java
abstract class Employee
{
    // Abstract method: no curly braces {}, ends with semicolon ;
    abstract void skill();
}
```

### Example: Abstract Class & Abstract Method

```java
abstract class Employee
{
    protected int empId;
    protected String name;

    // Concrete method (with body)
    void setDetails(int empId, String name)
    {
        this.empId = empId;
        this.name = name;
    }

    // Abstract method (no body)
    abstract void skill();
}

class Developer extends Employee
{
    // Must implement (override) the abstract method
    void skill()
    {
        System.out.println(name + " skills: Java, Spring Boot, SQL");
    }
}

public class AbstractionDemo
{
    public static void main(String[] args)
    {
        // Employee e = new Employee(); // ❌ Error: Employee is abstract; cannot be instantiated

        // Parent abstract class reference holding child object
        Employee e = new Developer();
        e.setDetails(101, "Rahul");
        e.skill();
    }
}
```

**Output:**
```text
Rahul skills: Java, Spring Boot, SQL
```

---

## Q4. What are the Rules of Abstract Classes and Abstract Methods?

### Rules for Abstract Classes:
1. **Instantiation:** An abstract class **cannot be directly instantiated** using `new` (`new AbstractClass()` is illegal).
2. **Method types:** An abstract class can contain **both abstract methods and non-abstract (concrete) methods**.
3. **Zero abstract methods allowed:** An abstract class does not need to have any abstract methods. Simply putting `abstract class Demo { }` prevents object creation.
4. **Child Implementation Obligation:** Any subclass inheriting an abstract class **must override and implement all abstract methods**. If it fails to implement even one abstract method, the subclass itself must also be declared `abstract`.
5. **Reference variable:** We can declare a reference variable of an abstract class (`Parent p = new Child();`).

### Rules for Abstract Methods:
1. **Class requirement:** If a class contains even **one** abstract method, the class **must** be declared `abstract`.
2. **No body:** An abstract method cannot have curly braces `{}`. It must terminate with a semicolon `;`.
3. **Cannot be `final`:** An abstract method **cannot be final**, because `final` forbids overriding, while `abstract` forces overriding (contradiction).
4. **Cannot be `static`:** An abstract method **cannot be static**, because static methods belong to the class and cannot be overridden, but abstract methods require dynamic runtime polymorphism.
5. **Cannot be `private`:** An abstract method **cannot be private**, because private methods are not visible to child classes for overriding.

```java
abstract class Demo
{
    abstract void show();              // ✅ Valid abstract method

    // final abstract void test1();   // ❌ Compile Error: illegal combination of modifiers
    // static abstract void test2();  // ❌ Compile Error: illegal combination of modifiers
    // private abstract void test3(); // ❌ Compile Error: illegal combination of modifiers
}
```

---

## Q5. Can an Abstract Class Have a Constructor?

### **Yes!**
An abstract class **can have a constructor**, even though we cannot instantiate it directly with `new`.

### Why does an abstract class need a constructor?
- An abstract class typically has fields (instance variables) shared by all its child classes.
- When a child class object is created, the child constructor calls the abstract parent class constructor using `super()` to initialize the parent's fields.

### Can a constructor be abstract?
### **No!**
A constructor cannot be abstract because:
- An abstract method is incomplete (no body) and meant to be overridden in a child class.
- Constructors **cannot be inherited or overridden**, and a constructor's fundamental job is to construct and initialize the object completely.

### Example: Abstract Class with Constructor

```java
abstract class Vehicle
{
    protected String brand;
    protected int wheels;

    // Constructor of abstract class
    Vehicle(String brand, int wheels)
    {
        this.brand = brand;
        this.wheels = wheels;
        System.out.println("Vehicle abstract constructor called");
    }

    abstract void drive();
}

class Car extends Vehicle
{
    private String model;

    Car(String brand, String model)
    {
        // Calling parent abstract class constructor using super()
        super(brand, 4);
        this.model = model;
        System.out.println("Car child constructor called");
    }

    void drive()
    {
        System.out.println("Driving " + brand + " " + model + " with " + wheels + " wheels.");
    }
}

public class AbstractConstructorDemo
{
    public static void main(String[] args)
    {
        Vehicle v = new Car("Toyota", "Camry");
        v.drive();
    }
}
```

**Output:**
```text
Vehicle abstract constructor called
Car child constructor called
Driving Toyota Camry with 4 wheels.
```

---

## Q6. What is an Interface in Java and Why Do We Use It?

### Definition
An **interface** in Java is a reference type &mdash; a formal contract / blueprint &mdash; that contains **abstract method signatures and static constants**.

- Declared using the `interface` keyword.
- Implemented by classes using the `implements` keyword.

### Why Use an Interface?
1. **Full (100%) Abstraction:** Specifies what methods a class must provide without dictating internal details.
2. **Multiple Inheritance Support:** Java does not allow extending multiple classes, but a single class can implement multiple interfaces.
3. **Loose Coupling:** Modules interact through interface contracts, allowing easy swapping of implementations.
4. **Dynamic Polymorphism:** Interface references can point to any implementing class object.

### Standard Rules of an Interface:
1. **Variables:** All variables declared in an interface are implicitly **`public static final`** (constants).
2. **Methods (Pre-Java 8):** All methods are implicitly **`public abstract`**.
3. **No Instantiation:** Cannot create an object of an interface using `new` (`new InterfaceName()` is illegal).
4. **No Constructors:** Interfaces do not have constructors.
5. **Public implementation:** When a class implements an interface method, it **must declare it with `public`**, otherwise it causes a compiler error (*"attempting to assign weaker access privileges"*).

```java
interface Shape
{
    // Implicitly: public static final double PI = 3.14159;
    double PI = 3.14159;

    // Implicitly: public abstract double calculateArea();
    double calculateArea();
}

class Circle implements Shape
{
    private double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    // Must be declared public!
    public double calculateArea()
    {
        return PI * radius * radius;
    }
}

public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Shape s = new Circle(5.0);
        System.out.println("Area of Circle: " + s.calculateArea());
    }
}
```

---

## Q7. Why Does Java Not Support Multiple Inheritance with Classes, and How Do Interfaces Solve It?

### Why multiple inheritance is not supported with classes: The Diamond Problem
If two parent classes contain a method with the exact same name and signature:

```text
         Class A
        /       \
    Class B   Class C     <-- Both B and C override show()
        \       /
         Class D          <-- If D extends B, C: Which show() should D inherit?
```

- If class `D` extends both `B` and `C`, and invokes `d.show()`, the compiler cannot determine whether to execute `B.show()` or `C.show()`.
- This ambiguity is known as the **Diamond Problem**. To prevent this ambiguity, Java disallowed extending multiple classes.

### How Interfaces Solve the Diamond Problem
- Interfaces contain only method **declarations (no implementation body)**.
- If a class implements two interfaces containing the same method signature, the implementing class provides **one single concrete implementation** in its own body.
- Since there is only one implementation, **there is zero ambiguity!**

```java
interface Printable
{
    void print();
}

interface Showable
{
    void print(); // Same method signature
}

// Single class implementing multiple interfaces
class Document implements Printable, Showable
{
    // Only one implementation resolves both interfaces
    public void print()
    {
        System.out.println("Printing document successfully with no ambiguity.");
    }
}

public class MultipleInheritanceDemo
{
    public static void main(String[] args)
    {
        Document doc = new Document();
        doc.print();

        Printable p = doc;
        p.print();

        Showable s = doc;
        s.print();
    }
}
```

**Output:**
```text
Printing document successfully with no ambiguity.
Printing document successfully with no ambiguity.
Printing document successfully with no ambiguity.
```

---

## Q8. What is the Difference Between an Abstract Class and an Interface?

| Feature | Abstract Class | Interface |
| :--- | :--- | :--- |
| **Keyword** | Declared using `abstract class` | Declared using `interface` |
| **Inheritance Keyword** | Inherited using `extends` | Implemented using `implements` |
| **Type of Methods** | Can have both **abstract** and **concrete** methods | Prior to Java 8: only **abstract**.<br>Java 8+: can also have `default` and `static`.<br>Java 9+: can have `private` methods. |
| **Variables / Fields** | Can have instance variables, `static`, `final`, `non-final` variables | Variables are strictly **`public static final`** only. |
| **Constructor** | **Yes**, can have constructors. | **No**, cannot have constructors. |
| **Multiple Inheritance** | **No**, a class can extend only one class. | **Yes**, a class can implement multiple interfaces. |
| **Access Modifiers** | Can have `private`, `protected`, `public` members. | Methods are implicitly `public` (or `private` in Java 9). |
| **Level of Abstraction** | **Partial (0% to 100%)** | **Full (100%)** |
| **Speed** | Slightly faster (direct subclassing). | Slightly slower (requires search in interface table). |
| **Design Use Case** | Use when classes share common code and identity (**IS-A** relationship). | Use to define a contract of capability across unrelated classes (**CAN-DO** relationship). |

---

## Q9. What are Tight Coupling and Loose Coupling in Abstraction?

Coupling refers to the **degree of dependency between software components/classes**.

### 1. Tight Coupling (Without Abstraction)
When a class is directly dependent on a concrete implementation of another class.
- **Problem:** If the dependent class changes, the caller class breaks. Highly rigid and hard to test.

```java
// Tight Coupling: Car directly instantiates PetrolEngine
class PetrolEngine
{
    void start() { System.out.println("Petrol engine starting"); }
}

class Car
{
    private PetrolEngine engine = new PetrolEngine(); // ❌ Tightly coupled

    void drive()
    {
        engine.start();
    }
}
```

### 2. Loose Coupling (Achieved via Abstraction & Interfaces)
When classes interact through an abstract class or interface reference rather than concrete classes.
- **Benefit:** Any new implementation can be plugged in without modifying the consuming class.

```java
// Loose Coupling: Car depends on the Engine interface
interface Engine
{
    void start();
}

class PetrolEngine implements Engine
{
    public void start() { System.out.println("Petrol engine started"); }
}

class ElectricEngine implements Engine
{
    public void start() { System.out.println("Electric engine started silently"); }
}

class Automobile
{
    private Engine engine;

    // Dependency injected via constructor
    Automobile(Engine engine)
    {
        this.engine = engine; // ✅ Loosely coupled
    }

    void drive()
    {
        engine.start();
    }
}

public class CouplingDemo
{
    public static void main(String[] args)
    {
        Automobile petrolCar = new Automobile(new PetrolEngine());
        petrolCar.drive();

        Automobile electricCar = new Automobile(new ElectricEngine());
        electricCar.drive();
    }
}
```

---

## Q10. Practical Real-World Implementation Examples

### Example 1: Bank Account System (Abstract Class Pattern)

*(From your practical assignment notes &mdash; Q1)*

```java
abstract class BankAccount
{
    protected int accountNo;
    protected double balance;

    void setBank(int accountNo, double balance)
    {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    // Abstract method: each account type calculates interest differently
    abstract double calculateInterest();
}

class SavingsAccount extends BankAccount
{
    double calculateInterest()
    {
        // 4% Interest for Savings Account
        double interest = balance * 0.04;
        return balance + interest;
    }
}

class CurrentAccount extends BankAccount
{
    double calculateInterest()
    {
        // 2% Interest for Current Account
        double interest = balance * 0.02;
        return balance + interest;
    }
}

public class BankAccountSystem
{
    public static void main(String x[])
    {
        // Parent abstract class reference
        BankAccount ba = null;

        ba = new SavingsAccount();
        ba.setBank(101, 10000);
        System.out.println("Savings Account Total: " + ba.calculateInterest());

        ba = new CurrentAccount();
        ba.setBank(102, 20000);
        System.out.println("Current Account Total: " + ba.calculateInterest());
    }
}
```

**Output:**
```text
Savings Account Total: 10400.0
Current Account Total: 20400.0
```

---

### Example 2: Online Payment System (Interface Pattern)

*(From your practical assignment notes &mdash; Q6)*

```java
interface Payment
{
    double makePayment(double amount);
}

class CreditCardPayment implements Payment
{
    public double makePayment(double amount)
    {
        double charge = amount * 0.02; // 2% charge
        return amount + charge;
    }
}

class UPIPayment implements Payment
{
    public double makePayment(double amount)
    {
        double charge = amount * 0.01; // 1% charge
        return amount + charge;
    }
}

public class OnlinePaymentSystem
{
    public static void main(String x[])
    {
        // Interface reference holding implementation objects
        Payment p = null;

        p = new CreditCardPayment();
        System.out.println("Credit Card Final Amount: " + p.makePayment(1000));

        p = new UPIPayment();
        System.out.println("UPI Final Amount: " + p.makePayment(1000));
    }
}
```

**Output:**
```text
Credit Card Final Amount: 1020.0
UPI Final Amount: 1010.0
```

---

## Summary and Rapid-Fire Interview Revision

### ⭐ 3-Line Interview Formula
> **Abstraction is the process of hiding internal details and showing only essential functionality to the user.**  
> **We achieve abstraction in Java using Abstract Classes (0%–100% partial abstraction) and Interfaces (100% full abstraction).**  
> **The main benefits are security, maintainability, code reuse, and loose coupling.**

### ⚡ Rapid-Fire Interview Q&A

1. **Can an abstract class be instantiated directly?**  
   &rarr; **No.** You cannot create an object using `new AbstractClass()`.
2. **Can an abstract class have constructors?**  
   &rarr; **Yes.** It is called via `super()` from the child class constructor.
3. **Can a constructor be abstract?**  
   &rarr; **No.** Constructors cannot be inherited or overridden.
4. **Can an abstract method be `static`, `final`, or `private`?**  
   &rarr; **No.** All three prevent overriding, while abstract methods require overriding.
5. **Can an abstract class have zero abstract methods?**  
   &rarr; **Yes.** It simply prevents instantiation.
6. **What are the default modifiers of interface variables?**  
   &rarr; **`public static final`** (constants).
7. **What are the default modifiers of interface methods?**  
   &rarr; **`public abstract`** (prior to Java 8).
8. **Why doesn't Java support multiple inheritance with classes?**  
   &rarr; Due to the **Diamond Problem** (method signature collision/ambiguity). Interfaces solve it because they contain no method bodies.
9. **When should you choose Abstract Class over Interface?**  
   &rarr; Choose **Abstract Class** when classes share common code, fields, and a strict **IS-A** relationship. Choose **Interface** to define a common capability (**CAN-DO**) across completely unrelated classes.
