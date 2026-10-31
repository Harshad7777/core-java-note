# Inheritance in Java

[Definition](#definition) | [Why Inheritance?](#why-use-inheritance) | [Types](#types-of-inheritance) | [Object Class](#object-class) | [Constructors & super()](#constructors-in-inheritance-super) | [Method Overriding](#method-overriding) | [Coupling in OOP](#coupling-in-oop) | [final Keyword](#final-keyword) | [static vs final](#static-vs-final-keyword) | [Method Hiding](#method-hiding) | [Abstract Class](#abstract-class-and-abstract-method) | [Interface](#interface) | [Summary & Revision](#summary-interview-revision)

---

## Definition

**Inheritance** is a fundamental mechanism in Java where one class acquires the properties (variables) and behaviors (methods) of another class.

- **Parent class (Super / Base class):** The class whose members are inherited.
- **Child class (Sub / Derived class):** The class that inherits those members using the `extends` keyword.

### IS-A Relationship

Inheritance establishes an **IS-A relationship** between classes:
- `Car` **IS-A** `Vehicle`
- `Dog` **IS-A** `Animal`
- `Developer` **IS-A** `Employee`

#### Basic Syntax
```java
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child class method");
    }
}
```

---

## Why use Inheritance?

Inheritance is used in Java to achieve four primary architectural benefits:

| Benefit | Description |
| :--- | :--- |
| **Reusability** | Common properties and methods are written once in the parent class and reused across child classes. |
| **Extensibility** | Child classes can introduce new specialized features without modifying the existing parent class. |
| **Abstraction** | Allows clients to interact with general parent abstractions while hiding implementation specifics. |
| **Dynamic Polymorphism** | Required to enable runtime polymorphism and dynamic method dispatch via method overriding. |

---

## Types of Inheritance

Java categorizes inheritance into five theoretical types:

### 1. Single-Level Inheritance
A single child class inherits directly from one parent class.
```java
class A { }
class B extends A { }
```

### 2. Multilevel Inheritance
A class is derived from another derived class (forming an inheritance chain).
```java
class A { }
class B extends A { }
class C extends B { }
```

### 3. Hierarchical Inheritance
Multiple child classes inherit from a single parent class.
```java
class A { }
class B extends A { }
class C extends A { }
```

### 4. Multiple Inheritance
A single child class inherits from more than one parent class.
- **Classes:** ❌ **Not supported in Java** due to the **Diamond Problem** (method name collisions and ambiguity).
- **Interfaces:** ✅ **Supported** in Java via `implements`.
```java
interface A { }
interface B { }
class C implements A, B { }
```

### 5. Hybrid Inheritance
A combination of two or more inheritance types.
- **Classes:** ❌ Not supported directly with classes.
- **Interfaces:** ✅ Supported through interface implementations.

### Summary of Support in Java

| Inheritance Type | Supported with Classes? | Supported with Interfaces? |
| :--- | :---: | :---: |
| **Single-Level** | ✅ Yes | ✅ Yes |
| **Multilevel** | ✅ Yes | ✅ Yes |
| **Hierarchical** | ✅ Yes | ✅ Yes |
| **Multiple** | ❌ No (Diamond Problem) | ✅ Yes |
| **Hybrid** | ❌ No | ✅ Yes |

---

## Object Class

The `java.lang.Object` class is the **root superclass** of all classes in Java.

> [!NOTE]
> **Can we create a Java program without inheritance?**  
> **No.** Every Java class that does not explicitly extend another class implicitly extends `java.lang.Object`. Therefore, every class in Java participates in inheritance.

```java
// What you write:
class A { }

// What the Java compiler generates:
class A extends java.lang.Object { }
```

### Important Methods Provided by Object Class

| Method | Return Type | Description |
| :--- | :--- | :--- |
| `equals(Object obj)` | `boolean` | Compares memory addresses (or equality logic if overridden). |
| `hashCode()` | `int` | Returns the hash code value for the object. |
| `toString()` | `String` | Returns a string representation of the object. |
| `getClass()` | `Class<?>` | Returns the runtime `Class` object representing its type. |
| `clone()` | `Object` | Creates and returns a copy of this object (requires `Cloneable`). |
| `wait()` / `notify()` / `notifyAll()` | `void` | Thread synchronization methods for inter-thread communication. |
| `finalize()` | `void` | Called by garbage collector prior to object reclamation (deprecated). |

### Is Java a 100% Pure Object-Oriented Language?
**No.** Java is not a pure OOP language because it supports **primitive data types** (`int`, `float`, `char`, `boolean`, etc.), which are stored directly on the stack rather than as objects on the heap.

---

## Constructors in Inheritance & super()

Constructors are **not inherited** by child classes. Instead, the child constructor **invokes** the parent constructor to ensure parent fields are properly initialized.

### 1. Default Parent Constructor Execution & Compiler Behavior

When creating a child object, the parent class constructor **always executes first**, followed by the child constructor.

> [!NOTE]
> If a developer does not write `super()` explicitly, the Java compiler automatically inserts **`super();`** as the **first statement** inside every child constructor.

```java
class ParentA {
    ParentA() {
        System.out.println("1. Parent constructor executed");
    }
}

class ChildB extends ParentA {
    ChildB() {
        // Compiler automatically inserts: super();
        System.out.println("2. Child constructor executed");
    }
}

public class ConstructorApp {
    public static void main(String[] args) {
        ChildB b = new ChildB();
    }
}
```

**Output:**
```text
1. Parent constructor executed
2. Child constructor executed
```

---

### 2. Parameterized Parent Constructor & Explicit super()

If the parent class defines **only a parameterized constructor**, the compiler cannot insert a default `super()`. The child constructor **must explicitly call `super(arguments)`**, otherwise a compile-time error occurs.

```java
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle brand initialized: " + brand);
    }
}

class Car extends Vehicle {
    int maxSpeed;

    Car(String brand, int maxSpeed) {
        super(brand); // Explicitly calling parent constructor
        this.maxSpeed = maxSpeed;
        System.out.println("Car max speed set: " + maxSpeed + " km/h");
    }
}

public class SuperParamApp {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 220);
    }
}
```

**Output:**
```text
Vehicle brand initialized: Toyota
Car max speed set: 220 km/h
```

---

### 3. this() vs. super()

| Feature | `this()` | `super()` |
| :--- | :--- | :--- |
| **Target** | Calls another constructor in the **same class**. | Calls a constructor in the **immediate parent class**. |
| **Purpose** | Constructor chaining within the same class. | Constructor chaining between parent and child. |
| **Placement** | Must be the **first statement** in constructor. | Must be the **first statement** in constructor. |
| **Coexistence** | Cannot use both `this()` and `super()` in the same constructor. | Cannot use both `this()` and `super()` in the same constructor. |

---

### 4. Can `super()` Call a Grandparent Constructor? (Constructor Chaining)

**Direct Answer:** **No.**  
`super()` directly calls only the **immediate parent class constructor**. A child class cannot skip its parent to call a grandparent constructor directly.

However, the grandparent constructor executes first due to **Constructor Chaining** (the parent constructor calls `super()` on its own parent).

```java
class Grandparent {
    Grandparent(int x) {
        System.out.println("1. Grandparent constructor: " + x);
    }
}

class Parent extends Grandparent {
    Parent(int x) {
        super(200); // Calls Grandparent constructor
        System.out.println("2. Parent constructor: " + x);
    }
}

class Child extends Parent {
    Child() {
        super(100); // Calls immediate Parent constructor
        System.out.println("3. Child constructor executed");
    }
}

public class ChainingApp {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
```

**Output:**
```text
1. Grandparent constructor: 200
2. Parent constructor: 100
3. Child constructor executed
```

#### Execution Flow & Unwinding:
1. `new Child()` invokes `Child()`.
2. First statement `super(100)` pauses `Child()` and invokes `Parent(100)`.
3. First statement `super(200)` pauses `Parent(100)` and invokes `Grandparent(200)`.
4. `Grandparent` finishes &rarr; unwinds back to `Parent` &rarr; unwinds back to `Child`.
5. **Execution Order:** Top-to-Bottom (Grandparent &rarr; Parent &rarr; Child).

---

## Method Overriding

**Method Overriding** occurs when a child class provides a specific implementation of a method that is already defined in its parent class.

### 1. Rules for Method Overriding
1. **Same Method Name:** The overriding method must have the identical name.
2. **Same Parameter List:** Exact same argument types, count, and order.
3. **Compatible Return Type:** Must have the same return type or a **covariant return type** (a subclass of the parent's return type).
4. **Access Modifier:** Cannot be more restrictive than the parent method (e.g., if parent is `protected`, child can be `protected` or `public`, but not `private`).
5. **Private, Static, and Final Methods:** Cannot be overridden.

#### Example: Method Overriding
```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
```

---

### 2. Dynamic Polymorphism (Upcasting & Dynamic Method Dispatch)

- **Upcasting:** Assigning a child class object to a parent class reference variable.
- **Dynamic Method Dispatch:** The mechanism by which a call to an overridden method is resolved at **runtime** based on the actual object type, rather than the reference type.

```java
public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Animal a; // Parent reference

        a = new Dog(); // Upcasting
        a.sound();     // Runtime dispatch to Dog.sound() -> "Dog barks"

        a = new Cat(); // Upcasting
        a.sound();     // Runtime dispatch to Cat.sound() -> "Cat meows"
    }
}
```

**Output:**
```text
Dog barks
Cat meows
```

---

### 3. When is Method Overriding Beneficial (and When Not)?

#### Beneficial When:
- Different child classes require specialized implementations of a common contract.
- Implementing **runtime polymorphism** and flexible business logic.
- Conforming to the **Open-Closed Principle (OCP)** (open for extension, closed for modification).

#### Not Beneficial When:
- Child classes do not need distinct behavior (adds unnecessary boilerplate).
- Core parent logic must be protected from tampering &rarr; Use **`final` methods** to prevent overriding!

---

## Coupling in OOP

**Coupling** refers to the degree of knowledge and dependency that one class has on another class.

- **Tight Coupling:** Classes depend directly on concrete classes. Fragile and hard to maintain.
- **Loose Coupling:** Classes interact through abstractions (interfaces or abstract classes). Flexible, reusable, and easy to test.

---

### 1. Target Class vs. Dependent Class

- **Target Class:** The class that needs another class to perform its functionality (the consumer).
- **Dependent Class:** The class whose functionality is required by the target class (the dependency).

```java
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine e = new Engine(); // TIGHT COUPLING: Car creates and directly depends on concrete Engine

    void drive() {
        e.start();
        System.out.println("Car is moving");
    }
}
```
- `Car` is the **Target Class**.
- `Engine` is the **Dependent Class**.

---

### 2. Case Study: Why Tight Coupling Fails (Calculator Application)

Consider an arithmetic hierarchy where a parent `Value` class is extended by `Add` and `Mul`:

```java
class Value {
    int x, y;

    void setValue(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getResult() {
        return 0;
    }
}

class Add extends Value {
    @Override
    int getResult() {
        return x + y;
    }
}

class Mul extends Value {
    @Override
    int getResult() {
        return x * y;
    }
}

class Calculator {
    // TIGHT COUPLING: Direct dependency on concrete class Add
    void performOperation(Add ad) {
        System.out.println("Result: " + ad.getResult());
    }
}

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        Add a = new Add();
        a.setValue(10, 20);
        calc.performOperation(a); // Works fine: passes an Add object

        Mul m = new Mul();
        m.setValue(5, 4);
        // calc.performOperation(m); // COMPILE-TIME ERROR!
    }
}
```

#### Why Does the Compile-Time Error Occur?
- The method `performOperation(Add ad)` expects strictly an `Add` reference.
- Although `Mul` and `Add` share the common parent `Value`, they are siblings. A `Mul` instance cannot be passed to an `Add` parameter.
- **Flawed Fix (Method Overloading):** Adding `performOperation(Mul m)` fixes compilation, but every new operation (`Sub`, `Div`, `Mod`) forces us to modify `Calculator`. This violates the **Open-Closed Principle (OCP)** and keeps `Calculator` tightly coupled.

---

### 3. The Scalable Solution: Loose Coupling via Upcasting

Instead of concrete types, `Calculator` accepts the **parent reference (`Value v`)**:

```java
class Calculator {
    // Loosely coupled: accepts any child of Value
    void performOperation(Value v) {
        int result = v.getResult(); // Dynamic method dispatch
        System.out.println("Result is " + result);
    }
}

public class CalcApp {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        // Addition
        Value v = new Add(); // Upcasting
        v.setValue(10, 20);
        c.performOperation(v);

        // Multiplication
        v = new Mul(); // Upcasting
        v.setValue(5, 4);
        c.performOperation(v);
    }
}
```

**Output:**
```text
Result is 30
Result is 20
```

#### Dry Run Execution Table

| Statement | Reference Type | Actual Object | Invoked Method | Output |
| :--- | :--- | :--- | :--- | :--- |
| `Value v = new Add()` | `Value` | `Add` | `Add.getResult()` | `Result is 30` |
| `v = new Mul()` | `Value` | `Mul` | `Mul.getResult()` | `Result is 20` |

> [!TIP]
> **Takeaway:** `Calculator` depends exclusively on the common abstraction `Value`. New operations (`Sub`, `Div`) can be added without modifying a single line of `Calculator`.

---

### 4. Loose Coupling via Interfaces & Constructor Injection

In enterprise applications, loose coupling is commonly achieved using **interfaces** and **Dependency Injection (DI)**:

```java
interface Engine {
    void start();
}

class PetrolEngine implements Engine {
    public void start() { System.out.println("Petrol engine started"); }
}

class DieselEngine implements Engine {
    public void start() { System.out.println("Diesel engine started"); }
}

class Car {
    private Engine e; // Depends on abstraction

    // Constructor Injection
    Car(Engine e) {
        this.e = e;
    }

    void drive() {
        e.start();
        System.out.println("Car is moving");
    }
}

public class DiApp {
    public static void main(String[] args) {
        // Implementation can be swapped freely without touching Car
        Engine engine = new PetrolEngine();
        Car car = new Car(engine);
        car.drive();
    }
}
```

**Output:**
```text
Petrol engine started
Car is moving
```

---

### 5. Architectural Improvement: Abstract Classes over Dummy Returns

In the `Value` class, returning a dummy value (`return 0;`) is dangerous because a subclass might forget to override it.

```java
// Better design: forces every subclass to implement calculation
abstract class Value {
    int x, y;
    void setValue(int x, int y) { this.x = x; this.y = y; }
    abstract int getResult();
}
```

---

### 6. Comparison: Tight Coupling vs. Loose Coupling

| Aspect | Tight Coupling | Loose Coupling |
| :--- | :--- | :--- |
| **Dependency** | Directly depends on concrete implementations. | Depends on abstractions (interfaces / abstract classes). |
| **Flexibility** | Inflexible; changes ripple through dependent classes. | Highly flexible; implementations swap without modifying callers. |
| **Maintenance** | High maintenance overhead; hard to scale. | Low maintenance; simple to extend. |
| **Testing** | Hard to unit test (mocking is difficult). | Easy to unit test using mock objects. |
| **OOP Principle** | Violates Open-Closed Principle (OCP). | Conforms to Open-Closed and Dependency Inversion principles. |
| **Example** | `Engine e = new Engine();` inside `Car` | Constructor injection: `Car(Engine e)` |

---

## final Keyword

The `final` keyword in Java is a non-access modifier used to enforce immutability and restrict modifications across variables, methods, and classes.

> [!IMPORTANT]
> **The Three Golden Rules of `final`:**
> 1. **`final` variable** &rarr; Cannot be reassigned (constant).
> 2. **`final` method** &rarr; Cannot be overridden by child classes.
> 3. **`final` class** &rarr; Cannot be inherited / extended.

---

### 1. final Variable
A `final` variable can be assigned only once. Reassignment results in a compile-time error.
- **Blank Final Variable:** A final variable declared without an initial value must be initialized inside the constructor.

```java
final int MAX_LIMIT = 100;
// MAX_LIMIT = 200; // Compile-time error: cannot assign a value to final variable
```

---

### 2. final Method (Locking Implementation)
A `final` method can be inherited and called by child classes, but **cannot be overridden**.

```java
class SecurityService {
    final void authenticate() {
        System.out.println("Standard cryptographic authentication");
    }
}

class CustomService extends SecurityService {
    // Compile-time error: cannot override final method from SecurityService
    // void authenticate() { ... }
}
```

---

### 3. final Class (Preventing Subclassing)
A `final` class cannot be extended by any other class.
- **Why?** Protects architectural integrity, prevents malicious tampering, and forms the basis for immutable designs.
- **Real-World Examples:** `java.lang.String`, `java.lang.Integer`, `java.lang.Math`.

```java
final class DatabaseConfig { }
// class MyConfig extends DatabaseConfig { } // Compile-time error: cannot inherit from final DatabaseConfig
```

---

### 4. How to Create an Immutable Class in Java (Step-by-Step)

An **Immutable Class** is one whose instance state cannot change after construction.

#### The 5 Essential Steps:
1. **Declare the class as `final`:** Prevents subclassing and method tampering.
2. **Make all fields `private` and `final`:** Restricts direct access and ensures one-time initialization.
3. **Do not provide setter methods:** Disallows state alteration.
4. **Initialize all fields via constructor:** Assigns state during construction.
5. **Provide only getter methods:** Allows read-only access.
6. **Defensive Copying:** If fields reference mutable objects (e.g., `Date`, `ArrayList`), perform deep copies in the constructor and getters.

```java
final class Employee {
    private final int id;
    private final String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
}

public class ImmutableApp {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Harshad");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
    }
}
```

**Output:**
```text
ID: 101
Name: Harshad
```

---

### 5. final Method vs. final Class

| Feature | `final` Method | `final` Class |
| :--- | :--- | :--- |
| **Restriction** | Cannot be **overridden**. | Cannot be **inherited / extended**. |
| **Inheritance** | Can be inherited and called by subclasses. | Cannot have any subclasses. |
| **Scope** | Protects specific method logic. | Protects the entire class structure. |
| **Example** | `final void processPayment()` | `final class Employee` |

---

## static vs. final Keyword

- **`static`:** Focuses on **memory sharing** at the class level (single shared copy in Metaspace).
- **`final`:** Focuses on **immutability and restriction** (prevents reassignment, overriding, or inheritance).

### 1. Comparison Table: static vs. final

| Feature | `static` | `final` |
| :--- | :--- | :--- |
| **Scope** | Belongs to the class. | Imposes immutability / restriction. |
| **Variables** | Shared across all instances of the class. | Cannot be reassigned once initialized. |
| **Methods** | Belongs to class; called via `ClassName.method()`. | Cannot be overridden by child classes. |
| **Classes** | Only **inner / nested classes** can be static. | Prevents inheritance (class cannot be extended). |
| **Object Dependency**| Accessible without creating an object instance. | Normal final fields exist per object instance. |

---

### 2. Combining static and final

- **`static final` Variable (Constants):** Shared by all instances and cannot be modified.
  ```java
  public static final double PI = 3.14159265359;
  ```
- **`static final` Method:** Belongs to the class and cannot be hidden in subclasses.
- **`static final` Class:** Top-level classes cannot be static; only **nested / inner classes** can be declared `static final`.

---

## Method Hiding

> [!IMPORTANT]
> **Can we override a `static` method in Java?**  
> **No.** Static methods belong to the class, not individual objects. When a subclass declares a static method with the same signature, it is **Method Hiding**, not method overriding.

### 1. Dynamic Method Dispatch vs. Static Binding
- **Instance Methods (Overriding):** Resolved at **runtime** based on the **actual object type** (Late / Dynamic binding).
- **Static Methods (Hiding):** Resolved at **compile time** based on the **reference variable type** (Early / Static binding).

### 2. Method Hiding Example

```java
class Parent {
    static void show() { System.out.println("Parent static show()"); }
    void display() { System.out.println("Parent instance display()"); }
}

class Child extends Parent {
    static void show() { System.out.println("Child static show()"); } // Method Hiding
    @Override
    void display() { System.out.println("Child instance display()"); } // Method Overriding
}

public class MethodHidingApp {
    public static void main(String[] args) {
        Parent p = new Child(); // Upcasting

        p.show();    // Calls Parent.show() (Resolved by reference type Parent)
        p.display(); // Calls Child.display() (Resolved by runtime object Child)
    }
}
```

**Output:**
```text
Parent static show()
Child instance display()
```

### 3. Comparison: Method Overriding vs. Method Hiding

| Feature | Method Overriding | Method Hiding |
| :--- | :--- | :--- |
| **Method Type** | Instance methods. | Static methods. |
| **Resolution Time** | Runtime (Dynamic dispatch). | Compile-time (Static binding). |
| **Resolution Basis** | Actual runtime object. | Reference variable type. |
| **`@Override` Tag** | Allowed and recommended. | Compile-time error if used. |
| **Polymorphism** | Achieves runtime polymorphism. | Does not achieve polymorphism. |

---

## Abstract Class and Abstract Method

An **abstract class** is a class declared with the `abstract` keyword that cannot be instantiated directly. An **abstract method** is a method declared without an implementation (no body).

### 1. Core Rules
1. An abstract class cannot be instantiated directly using `new`.
2. An abstract class can contain both abstract methods and concrete (implemented) methods.
3. If a class contains at least one abstract method, the class **must** be declared abstract.
4. Any concrete child class extending an abstract class **must implement all inherited abstract methods**.

```java
abstract class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    // Abstract method: defines contract
    abstract void work();

    // Concrete method: shared functionality
    void printDetails() {
        System.out.println("Employee: " + name);
    }
}

class Developer extends Employee {
    Developer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println("Writing and debugging code");
    }
}

public class AbstractApp {
    public static void main(String[] args) {
        Developer dev = new Developer("Harshad");
        dev.printDetails();
        dev.work();
    }
}
```

**Output:**
```text
Employee: Harshad
Writing and debugging code
```

---

## Interface

An **interface** in Java is a reference type that acts as a blueprint of a class, defining an absolute contract of behavior.

### 1. Why use an Interface?
- To achieve **100% total abstraction** (prior to Java 8 default methods).
- To support **Multiple Inheritance** in Java.
- To achieve **Loose Coupling** in enterprise architectures.

```java
interface Printable {
    void print();
}

interface Showable {
    void show();
}

// Multiple interface implementation
class Document implements Printable, Showable {
    public void print() { System.out.println("Printing document..."); }
    public void show() { System.out.println("Showing document preview..."); }
}

public class InterfaceApp {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
```

**Output:**
```text
Printing document...
Showing document preview...
```

### 2. Why Java Does Not Support Multiple Inheritance with Classes
Java avoids multiple inheritance with classes to prevent the **Diamond Problem**. If two parent classes define a method with the same signature, the child class has ambiguity over which version to inherit. Interfaces avoid this because method declarations historically lacked state and implementation.

---

## Summary & Interview Revision

### 1. Rapid-Fire Interview Questions & Answers

| Question | One-Line Exam Answer |
| :--- | :--- |
| **What is inheritance?** | Mechanism where a child class acquires properties and methods of a parent class. |
| **Which class is the root of all Java classes?** | `java.lang.Object`. |
| **Can we call grandparent constructor directly via `super()`?** | No, `super()` only calls immediate parent constructor (chaining handles the rest). |
| **Can we avoid method overriding?** | Yes, declare the method as `final`. |
| **Can a `final` method be inherited?** | Yes, child classes can inherit and invoke it, but cannot override it. |
| **Can a `final` class be inherited?** | No, a final class cannot be extended. |
| **Is every `final` class immutable?** | No, `final` only stops inheritance; immutability requires protecting internal state. |
| **Can static methods be overridden?** | No, re-declaring a static method in a child class is **Method Hiding**. |
| **Can we use `static` and `final` together?** | Yes, commonly used to create constants (`public static final`). |
| **What is the difference between overriding and hiding?** | Overriding is resolved at runtime by object; hiding is resolved at compile time by reference. |
| **What is loose coupling?** | Designing classes to depend on abstractions rather than concrete classes. |
| **Why doesn't Java support multiple inheritance with classes?** | To prevent ambiguity and the Diamond Problem. |

### 2. Essential Revision Checklist

- **IS-A Relationship:** Established via the `extends` keyword (classes) or `implements` keyword (interfaces).
- **Constructor Execution Order:** Top-to-bottom (Parent constructors execute before child constructors).
- **Compiler `super()` insertion:** Automatically added if no explicit constructor call is provided.
- **Dynamic Method Dispatch:** Java selects overridden methods at runtime based on the actual object.
- **The 3 Rules of `final`:** Final variable &rarr; cannot reassign; Final method &rarr; cannot override; Final class &rarr; cannot extend.
- **Immutability Recipe:** Final class + private final fields + no setters + constructor initialization + defensive copying.
- **Method Hiding:** Static methods resolve at compile time by reference type.
- **Abstract Classes vs. Interfaces:** Abstract classes provide partial implementations with state; interfaces provide clean behavioral contracts.
