# Interfaces in Java

[Core Concepts (Q1-Q5)](#part-1-core-concepts-of-interface) | [Rules & Modifiers (Q6-Q16)](#part-2-interface-rules-modifier-restrictions) | [Inheritance & Diamond Problem (Q17-Q20)](#part-3-interface-inheritance-diamond-problem) | [Java 8 & 9 Features (Q21-Q23)](#part-4-java-8-java-9-interface-features) | [Built-in Functional Interfaces](#part-5-standard-functional-interfaces-in-java) | [Overriding & Access Modifiers (Q24-Q27)](#part-6-method-overriding-access-modifier-rules) | [Quick Revision](#quick-interview-revision)

---

## Part 1: Core Concepts of Interface

### Q1. What is an Interface?

In Java, an interface is a contract that specifies a set of methods a class must implement



> [!IMPORTANT]
> **Key Characteristics of an Interface:**
> - **Cannot be instantiated directly:** `new MyInterface()` causes a compile-time error.
> - **Implemented via `implements`:** Concrete classes provide method bodies for interface methods.
> - **Fields are constants:** All variables declared in an interface are implicitly **`public static final`**.
> - **Methods are abstract by default:** Ordinary methods without bodies are implicitly **`public abstract`**.
> - **Supports Multiple Inheritance:** A class can implement multiple interfaces simultaneously.
> - **Interface Inheritance:** An interface can extend another interface (or multiple interfaces) using **`extends`**.

#### Example: Basic Interface Implementation
```java
interface Vehicle {
    void start(); // Implicitly public abstract
}

class Bike implements Vehicle {
    @Override
    public void start() { // Must be public (cannot reduce visibility)
        System.out.println("Bike is starting");
    }
}

public class InterfaceBasicApp {
    public static void main(String[] args) {
        Vehicle v = new Bike(); // Upcasting
        v.start();
    }
}
```

**Output:**
```text
Bike is starting
```

> [!TIP]
> **Interview Answer:** *An interface in Java is a reference type that defines a contract of behavior. It specifies what operations implementing classes must provide, achieving total separation of contract from implementation.*

---

### Q2. Why Use an Interface If We Already Have Abstract Classes?

While abstract classes allow shared state and partial implementation, interfaces solve distinct architectural requirements:

| Architectural Requirement | Abstract Class | Interface |
| :--- | :--- | :--- |
| **Multiple Inheritance** | ❌ A class can extend only one class. | ✅ A class can implement multiple interfaces. |
| **Loose Coupling** | Partially coupled (shares state/constructors). | Completely decoupled (defines pure contracts). |
| **State / Variables** | Can have instance fields with changing state. | Only constants (`public static final`). |
| **Constructors** | Has constructors (invoked via `super()`). | ❌ No constructors. |
| **Standardization** | Best for related classes (IS-A hierarchy). | Best for unrelated classes sharing behavior (CAN-DO). |

#### Example: Standardizing Payment Implementations
```java
interface Payment {
    void pay(double amount);
}

class GooglePay implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Google Pay");
    }
}

class PhonePe implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PhonePe");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        Payment p;

        p = new GooglePay();
        p.pay(150.0);

        p = new PhonePe();
        p.pay(250.0);
    }
}
```

**Output:**
```text
Paid $150.0 using Google Pay
Paid $250.0 using PhonePe
```

---

### Q3. Does an Interface Achieve 100% Abstraction?

Historically, yes. However, **in modern Java (Java 8+), this statement is no longer 100% accurate.**

- **Before Java 8:** Interfaces contained **only** abstract methods and constants &rarr; **Achieved 100% pure abstraction**.
- **Java 8:** Introduced **`default`** methods and **`static`** methods with concrete bodies.
- **Java 9:** Introduced **`private`** and **`private static`** methods with concrete bodies.

> [!NOTE]
> **Interview Clarification:** Today, interfaces define behavioral contracts and support abstraction, but they can also contain concrete implementations (`default`, `static`, `private` methods). Therefore, modern interfaces do not strictly guarantee 100% abstraction.

---

### Q4. Why Does Java Disallow Multiple Inheritance with Classes?

Java disallows a class from extending multiple classes to avoid the **Diamond Problem** (method signature collisions and ambiguity):

```text
       Class A (defines show())
       /     \
  Class B     Class C (both override show() with different code)
       \     /
       Class D (extends B, C) -> Which show() should D inherit?
```

- If `Class D` extends both `B` and `C`, and both provide different implementations of `show()`, the compiler cannot determine which version `D` should inherit.
- To eliminate this ambiguity and simplify runtime behavior, Java disallows multiple inheritance of classes.
- **Why Interfaces Avoid This Problem:** Historically, interfaces only declared abstract methods without bodies. If an implementing class inherits the same abstract method from multiple interfaces, there is only **one** body to provide (inside the implementing class), eliminating any execution conflict.

---

### Q5. Where Can We Write Method Implementations in an Interface?

In modern Java, method logic can be written in two distinct locations:

1. **Inside the Implementing Class:** The traditional approach where the class overrides the abstract method.
2. **Inside the Interface Itself:**
   - **`default` methods (Java 8+):** Instance methods with bodies, inherited by implementing classes.
   - **`static` methods (Java 8+):** Utility methods belonging to the interface itself.
   - **`private` methods (Java 9+):** Helper routines shared between default/static methods inside the interface.

```java
interface Vehicle {
    // 1. Abstract method: logic implemented in child class
    void start();

    // 2. Default method: logic inside interface (can be inherited/overridden)
    default void stop() {
        System.out.println("Vehicle stopped");
    }

    // 3. Static method: logic inside interface (called via Vehicle.info())
    static void info() {
        System.out.println("Vehicle interface utility");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }
}

public class InterfaceLogicApp {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
        b.stop(); // Inherited default method

        Vehicle.info(); // Static interface method
    }
}
```

**Output:**
```text
Bike started
Vehicle stopped
Vehicle interface utility
```

---

## Part 2: Interface Rules & Modifier Restrictions

### Q6. Can We Create an Object of an Interface?

**Answer:** **No.** An interface cannot be instantiated directly using `new`.

```java
interface A {
    void show();
}

public class TestInstantiation {
    public static void main(String[] args) {
        // A obj = new A(); // Compile-time error: A is abstract; cannot be instantiated
    }
}
```

However, we can create an **interface reference variable** and assign it an object of any implementing class:
```java
A obj = new ImplementingClass(); // Upcasting
```

We can also use an **Anonymous Inner Class** to provide an inline implementation on-the-fly.

---

### Q7. Can We Write the Logic of an Interface Method?

**Answer:** **Yes, depending on the method modifier.**

| Method Type | Implementation Body Permitted? | Introduced In |
| :--- | :---: | :---: |
| **Abstract Method** | ❌ No (Signature only, ends with `;`) | Java 1.0 |
| **Default Method** | ✅ Yes (`default void name() { ... }`) | Java 8 |
| **Static Method** | ✅ Yes (`static void name() { ... }`) | Java 8 |
| **Private Method** | ✅ Yes (`private void name() { ... }`) | Java 9 |
| **Private Static Method** | ✅ Yes (`private static void name() { ... }`) | Java 9 |

```java
interface ModernInterface {
    void abstractMethod();

    default void defaultMethod() {
        System.out.println("Default method running");
        privateHelper(); // Reusing private logic
    }

    static void staticMethod() {
        System.out.println("Static method running");
    }

    private void privateHelper() {
        System.out.println("Private helper method executed");
    }
}
```

---

### Q8. Are Interface Variables Implicitly public static final?

**Answer:** **Yes.**

Every variable declared in an interface is implicitly:
```java
public static final
```

```java
interface AppConstants {
    int TIMEOUT = 5000; // Treated as: public static final int TIMEOUT = 5000;
}
```

- **`public`:** Accessible everywhere.
- **`static`:** Belongs to the interface; accessed as `AppConstants.TIMEOUT` without creating an object.
- **`final`:** Cannot be reassigned; must be initialized at declaration time.

```java
public class ConstantApp {
    public static void main(String[] args) {
        System.out.println("Timeout: " + AppConstants.TIMEOUT);
        // AppConstants.TIMEOUT = 10000; // Compile-time error: cannot assign a value to final variable
    }
}
```

**Output:**
```text
Timeout: 5000
```

---

### Q9. Can We Define a Constructor Inside an Interface?

**Answer:** **No.**

Interfaces **cannot have constructors**.

**Reasons:**
1. Interfaces cannot be instantiated directly with `new`.
2. Constructors exist to initialize an object's instance state. Interface fields are `static final` (class-level constants), not instance state.
3. Interfaces do not participate in constructor chaining.

```java
interface Demo {
    // Demo() { } // Compile-time error: Interfaces cannot have constructors
}
```

---

### Q10. Can One Interface Inherit Another Interface?

**Answer:** **Yes, using the `extends` keyword.**

An interface can inherit another interface (or multiple interfaces) using `extends`.

```java
interface ParentInterface {
    void show();
}

// Interface extending another interface
interface ChildInterface extends ParentInterface {
    void display();
}

class Implementation implements ChildInterface {
    @Override
    public void show() {
        System.out.println("Show method");
    }

    @Override
    public void display() {
        System.out.println("Display method");
    }
}

public class InterfaceInheritApp {
    public static void main(String[] args) {
        ChildInterface obj = new Implementation();
        obj.show();
        obj.display();
    }
}
```

**Output:**
```text
Show method
Display method
```

#### Inheritance Keyword Matrix:

| Relationship | Keyword Used | Example |
| :--- | :---: | :--- |
| **Class extends Class** | `extends` | `class B extends A` |
| **Interface extends Interface** | `extends` | `interface B extends A` |
| **Class implements Interface** | `implements` | `class B implements A` |
| **Interface extends Multiple Interfaces**| `extends` | `interface C extends A, B` |
| **Class implements Multiple Interfaces** | `implements` | `class C implements A, B` |
| **Interface extends Class** | ❌ **Illegal** | Causes compile-time error |

---

### Q11. Can We Declare Interface Methods as private?

**Answer:** **Yes, starting from Java 9.**

Private methods in interfaces are used to **encapsulate shared helper logic** between default and static methods without exposing those helpers to implementing classes or outside callers.

```java
interface Loggable {
    default void logInfo(String msg) {
        log("INFO", msg);
    }

    default void logError(String msg) {
        log("ERROR", msg);
    }

    // Java 9 private method for shared logic
    private void log(String level, String msg) {
        System.out.println("[" + level + "] " + msg);
    }
}

class Service implements Loggable { }

public class PrivateInterfaceApp {
    public static void main(String[] args) {
        Service s = new Service();
        s.logInfo("System initialized");
        s.logError("Database connection timed out");
    }
}
```

**Output:**
```text
[INFO] System initialized
[ERROR] Database connection timed out
```

> [!NOTE]
> Private interface methods **cannot be abstract**, **cannot be default**, and **cannot be overridden** by implementing classes.

---

### Q12. Can We Declare Interface Methods as protected?

**Answer:** **No.**

Interface methods **cannot be `protected`**.

- Ordinary abstract methods in an interface are implicitly **`public abstract`**.
- An interface defines a public API specification. Restricting contract methods to `protected` defeats the purpose of an open interface contract.

```java
interface Demo {
    // protected void show(); // Compile-time error: Illegal modifier for interface method
}
```

---

### Q13. Can We Declare Abstract Methods in an Abstract Class as protected?

**Answer:** **Yes.**

Abstract classes can declare abstract methods using the **`protected`** modifier.

```java
abstract class Parent {
    // Legal in abstract class
    protected abstract void process();
}

class Child extends Parent {
    @Override
    protected void process() {
        System.out.println("Processing in Child");
    }
}

public class ProtectedAbstractApp {
    public static void main(String[] args) {
        Child c = new Child();
        c.process();
    }
}
```

**Output:**
```text
Processing in Child
```

---

### Q14. Why Can an Abstract Method Be protected in an Abstract Class but Not in an Interface?

| Context | Accessibility Scope | Purpose |
| :--- | :--- | :--- |
| **Abstract Class** | Supports `public`, `protected`, and package-private. | Designed for internal inheritance hierarchies where only subclasses need access to hook methods. |
| **Interface** | Implicitly `public`. | Designed as a universal public API contract intended to be exposed to external consumers. |

---

### Q15. Can We Declare an Interface Method as final?

**Answer:** **No.**

Interface methods **cannot be declared `final`**.

**Reasons:**
1. Abstract methods **must be overridden**; `final` **forbids overriding**. They are polar opposites.
2. Default methods are designed to be customizable by implementing classes; Java explicitly disallows declaring them `final` inside interfaces.

```java
interface Demo {
    // final void show(); // Compile-time error: Illegal modifier for the interface method
}
```

---

### Q16. If an Interface Contains Multiple Abstract Methods, Must All Methods Be Overridden?

**Answer:**
- **In a Concrete Class:** **Yes.** Every unimplemented abstract method must be implemented.
- **In an Abstract Class:** **No.** An abstract class implementing an interface can implement some methods and leave the rest for its concrete subclasses.

#### Example: Partial Implementation by Abstract Class
```java
interface MultiOperation {
    void op1();
    void op2();
}

// Abstract class implements only op1()
abstract class PartialService implements MultiOperation {
    @Override
    public void op1() {
        System.out.println("Operation 1 implemented");
    }
    // op2() is left for concrete subclasses
}

// Concrete subclass completes the contract
class FullService extends PartialService {
    @Override
    public void op2() {
        System.out.println("Operation 2 implemented");
    }
}

public class PartialImplApp {
    public static void main(String[] args) {
        FullService s = new FullService();
        s.op1();
        s.op2();
    }
}
```

**Output:**
```text
Operation 1 implemented
Operation 2 implemented
```

#### The Adapter Class Pattern:
An **Adapter Class** implements an interface with empty default bodies `{ }`, allowing subclasses to override **only** the methods they need:

```java
interface EventListener {
    void onClick();
    void onHover();
    void onDrag();
}

// Adapter provides empty default bodies
abstract class EventAdapter implements EventListener {
    public void onClick() { }
    public void onHover() { }
    public void onDrag() { }
}

// Subclass overrides ONLY onClick()
class ButtonClicker extends EventAdapter {
    @Override
    public void onClick() {
        System.out.println("Button was clicked!");
    }
}
```

---

## Part 3: Interface Inheritance & Diamond Problem

### Q17. Can an Interface Inherit an Abstract Class?

**Answer:** **No.**

An interface **cannot extend or implement a class** (whether abstract or concrete).

```java
abstract class BaseClass { }

// Compile-time error: Syntax error on token "extends", Interface expected
// interface MyInterface extends BaseClass { }
```

**Rule:** An interface can only extend other interfaces.

---

### Q18. Can an Abstract Class Implement an Interface?

**Answer:** **Yes.**

An abstract class can implement one or more interfaces without being forced to provide bodies for all their abstract methods.

---

### Q19. Can We Use an Interface Without Implementing It in a Separate Named Class?

**Answer:** **Yes, using an Anonymous Inner Class or a Lambda Expression (if functional).**

```java
interface Task {
    void execute();
}

public class AnonymousInterfaceApp {
    public static void main(String[] args) {
        // Anonymous inner class
        Task t1 = new Task() {
            @Override
            public void execute() {
                System.out.println("Task executed via Anonymous Inner Class");
            }
        };
        t1.execute();

        // Lambda expression (since Task is a functional interface)
        Task t2 = () -> System.out.println("Task executed via Lambda Expression");
        t2.execute();
    }
}
```

**Output:**
```text
Task executed via Anonymous Inner Class
Task executed via Lambda Expression
```

---

### Q20. How Do We Solve the Diamond Problem with Interfaces?

#### Scenario 1: Multiple Interfaces with Same Abstract Method
When two interfaces declare the same abstract method signature:
```java
interface A { void show(); }
interface B { void show(); }

class C implements A, B {
    // One single implementation satisfies both interfaces!
    @Override
    public void show() {
        System.out.println("Unified implementation of show()");
    }
}
```
There is no ambiguity because neither interface provides code.

---

#### Scenario 2: Multiple Interfaces with Conflicting Default Methods
If two interfaces provide conflicting **`default`** method bodies:

```java
interface Alpha {
    default void log() {
        System.out.println("Alpha log");
    }
}

interface Beta {
    default void log() {
        System.out.println("Beta log");
    }
}

// The compiler forces Class Combined to explicitly resolve the conflict!
class Combined implements Alpha, Beta {
    @Override
    public void log() {
        System.out.println("Combined custom log");

        // Explicitly invoking specific interface default methods:
        Alpha.super.log();
        Beta.super.log();
    }
}

public class DiamondResolveApp {
    public static void main(String[] args) {
        Combined c = new Combined();
        c.log();
    }
}
```

**Output:**
```text
Combined custom log
Alpha log
Beta log
```

> [!IMPORTANT]
> **Resolution Rule:** If a class implements two interfaces that declare identical default methods, the class **must override the method**. Inside the overridden method, it can call `InterfaceName.super.methodName()` to invoke specific interface logic.

---

## Part 4: Java 8 & Java 9 Interface Features

### Q21. Can We Define Methods with Bodies Inside an Interface?

**Answer:** **Yes (from Java 8 and Java 9).**

1. **`default` methods (Java 8):** Added to allow interfaces to evolve with new methods without breaking existing implementing classes (backward compatibility).
2. **`static` methods (Java 8):** Utility methods belonging to the interface namespace. Cannot be overridden.
3. **`private` methods (Java 9):** Internal helper methods for code reuse inside the interface.

---

### Q22. What is a Functional Interface in Java?

A **Functional Interface** is an interface that contains **exactly one abstract method**.
- Also known as a **SAM (Single Abstract Method)** interface.
- Marked optionally with the **`@FunctionalInterface`** annotation (compiler validates single abstract method rule).
- Can contain any number of `default`, `static`, or `private` methods without violating the single abstract method constraint.

```java
@FunctionalInterface
interface Calculator {
    int operate(int a, int b); // Single abstract method

    default void info() {
        System.out.println("Performing arithmetic calculation");
    }
}
```

---

### Q23. What is a Lambda Expression and What is its Purpose?

A **Lambda Expression** is an anonymous function (concise block of code) that provides an inline implementation for a functional interface.

#### Syntax:
```java
(parameters) -> { body }
```

#### Before Java 8 (Anonymous Inner Class):
```java
Calculator add = new Calculator() {
    @Override
    public int operate(int a, int b) {
        return a + b;
    }
};
```

#### Java 8+ (Lambda Expression):
```java
Calculator add = (a, b) -> a + b;
```

#### Complete Lambda Program:
```java
@FunctionalInterface
interface MathOperation {
    int compute(int x, int y);
}

public class LambdaApp {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Add: " + addition.compute(10, 20));
        System.out.println("Multiply: " + multiplication.compute(10, 20));
    }
}
```

**Output:**
```text
Add: 30
Multiply: 200
```

---

## Part 5: Standard Functional Interfaces in Java

Java provides core pre-defined functional interfaces in the **`java.util.function`** package:

| Interface | Method Signature | Purpose | Real-World Example |
| :--- | :--- | :--- | :--- |
| **`Predicate<T>`** | `boolean test(T t)` | Evaluates a boolean condition on input `T`. | Filter active users. |
| **`Consumer<T>`** | `void accept(T t)` | Accepts input `T` and performs an action with no return. | Print each element in a list. |
| **`Function<T, R>`** | `R apply(T t)` | Transforms input `T` into output `R`. | Convert String to Integer length. |
| **`Supplier<T>`** | `T get()` | Produces/supplies a value of type `T` with no input. | Generate random OTP or UUID. |
| **`BiFunction<T, U, R>`**| `R apply(T t, U u)` | Takes two arguments (`T`, `U`) and produces output `R`. | Add two numbers together. |

---

## Part 6: Method Overriding & Access Modifier Rules

> [!IMPORTANT]
> **The Golden Rule of Method Overriding Visibility:**  
> When overriding a method, the child class can **maintain or increase (widen)** visibility, but **can NEVER decrease (narrow)** visibility.
>
> **Access Visibility Spectrum (Narrowest to Widest):**  
> `private` &rarr; `package-private (default)` &rarr; `protected` &rarr; `public`

---

### Q24. Can We Override a protected Method as public?

**Answer:** **Yes.**

Visibility is widened (`protected` &rarr; `public`), which is completely legal.

```java
class Parent {
    protected void display() {
        System.out.println("Parent protected method");
    }
}

class Child extends Parent {
    @Override
    public void display() { // Legal: Widened to public
        System.out.println("Child public method");
    }
}
```

---

### Q25. Can We Override a Package-Private Method as protected?

**Answer:** **Yes.**

Visibility is widened (`package-private` &rarr; `protected`), which is legal.

```java
class Parent {
    void show() { // Package-private
        System.out.println("Parent default visibility");
    }
}

class Child extends Parent {
    @Override
    protected void show() { // Legal: Widened to protected
        System.out.println("Child protected visibility");
    }
}
```

---

### Q26. Can We Override a protected Method as Package-Private?

**Answer:** **No.**

Visibility would be reduced (`protected` &rarr; `package-private`), causing a compile-time error:  
*Cannot reduce the visibility of the inherited method from Parent*.

```java
class Parent {
    protected void show() { }
}

class Child extends Parent {
    // void show() { } // Compile-time error: Cannot reduce visibility!
}
```

---

### Q27. Can We Override a public Method as protected?

**Answer:** **No.**

Visibility would be reduced (`public` &rarr; `protected`), causing a compile-time error.  
*All methods implementing interface methods must be declared `public` because interface methods are public by default!*

```java
class Parent {
    public void show() { }
}

class Child extends Parent {
    // protected void show() { } // Compile-time error: Cannot reduce visibility!
}
```

---

## Quick Interview Revision

### 1. Rapid-Fire Concept Table

| Concept | Key Interview Rule |
| :--- | :--- |
| **Interface Instantiation** | Cannot be instantiated directly with `new`. |
| **Interface Variables** | Implicitly `public static final` (constants). |
| **Ordinary Interface Methods**| Implicitly `public abstract`. |
| **Interface Constructors** | Not permitted. |
| **Interface Inheritance** | An interface uses `extends` to inherit other interfaces. |
| **Multiple Inheritance** | Classes can implement multiple interfaces. |
| **Diamond Problem Resolution**| Implementing class must override conflicting default methods. |
| **Default Methods (Java 8)** | Concrete instance methods; backward-compatible API evolution. |
| **Static Methods (Java 8)** | Utility methods belonging to the interface. |
| **Private Methods (Java 9)** | Helper methods shared between default/static methods. |
| **Protected Interface Methods**| ❌ Forbidden in interfaces; allowed in abstract classes. |
| **Functional Interface** | Contains exactly one abstract method (SAM). |
| **Lambda Expression** | Concise anonymous function implementing a functional interface. |
| **Overriding Visibility Rule** | Can maintain or widen visibility; can never reduce visibility. |

---

### 2. The 10 Most Important Interface Rules to Remember

1. **Pure Contract:** Interfaces define what implementing classes must do without tying them to an inheritance hierarchy.
2. **Implicit Modifiers:** Interface variables are always `public static final`; abstract methods are always `public abstract`.
3. **No Instance State:** Interfaces cannot declare non-static, non-final fields or constructors.
4. **Multiple Interfaces:** A class can implement multiple interfaces: `class C implements A, B`.
5. **Interface Extends Interface:** An interface can extend multiple interfaces: `interface C extends A, B`.
6. **Diamond Conflict Resolution:** Use `InterfaceName.super.method()` when resolving identical default methods.
7. **Java 8 Enhancements:** Default and static methods enable interfaces to provide concrete method implementations.
8. **Java 9 Private Methods:** Encapsulate common code shared between default methods.
9. **Single Abstract Method (SAM):** Functional interfaces enable clean, modern lambda expressions.
10. **Public Overrides:** Every class method implementing an interface method **must be declared `public`**.
