# Abstraction in Java (Abstract Classes & Methods)

[Overview & Purpose](#1-what-is-an-abstract-class-and-abstract-method) | [What is Abstraction?](#2-what-is-abstraction) | [Loose Coupling Example](#3-loose-coupling-using-abstract-classes) | [Core Rules & Instantiation (Q1-Q4)](#q1-can-we-create-an-object-of-an-abstract-class) | [Constructors (Q5-Q6)](#q5-can-we-declare-a-constructor-inside-an-abstract-class) | [Modifier Restrictions (Q7-Q9)](#q7-can-we-declare-abstract-methods-as-private) | [Polymorphic References (Q10)](#q10-can-we-create-references-of-an-abstract-class) | [Inheritance Rules (Q11, Q13)](#q11-must-all-abstract-methods-be-overridden) | [Adapter Classes (Q12)](#q12-what-is-an-adapter-class-and-why-do-we-use-it) | [Anonymous Classes (Q14-Q15)](#q14-can-we-use-an-abstract-class-without-creating-a-separate-named-subclass) | [Key Differences (Q16-Q20)](#q16-what-is-the-difference-between-abstract-and-final-keywords) | [Quick Revision](#quick-interview-revision)

---

## 1. What is an Abstract Class and Abstract Method?

### Abstract Class
An **abstract class** is a class declared with the `abstract` keyword. It represents an incomplete concept or blueprint and **cannot be instantiated directly** using the `new` keyword.

### Abstract Method
An **abstract method** is a method that has only a declaration (method signature) and **no implementation (no body)**. It ends with a semicolon `;`.

#### Syntax & Structure
```java
abstract class Demo {
    // Abstract method: no body, must be implemented by concrete subclass
    abstract void show();

    // Concrete (non-abstract) method: shared implementation
    void display() {
        System.out.println("Normal concrete method");
    }
}
```

> [!IMPORTANT]
> **Core Properties of Abstract Classes:**
> 1. **No Direct Instantiation:** An abstract class cannot be instantiated directly (`new Demo()` causes a compile-time error).
> 2. **Mixed Methods:** An abstract class can contain **both abstract and non-abstract (concrete) methods**.
> 3. **Class Must Be Abstract:** If a class contains **at least one abstract method**, the class **must** be declared `abstract`.
> 4. **Reference Variables Allowed:** We can declare reference variables of an abstract class (`Demo d;`).
> 5. **Subclass Contract:** A concrete child class extending an abstract class **must implement all inherited abstract methods**.

---

### Purpose of Abstract Classes and Abstract Methods
1. **Achieve Abstraction:** Hides complex internal execution details while exposing a clean public contract.
2. **Enable Dynamic Polymorphism:** Allows parent references to trigger specialized subclass implementations via dynamic method dispatch.
3. **Achieve Loose Coupling:** Decouples caller code from concrete child implementations.
4. **Enforce Common Standards / Templates:** Mandates that all child classes implement essential business methods.
5. **Share Common Logic:** Allows non-abstract methods to be inherited and reused without code duplication.

---

## 2. What is Abstraction?

**Definition:** Abstraction is the core OOP principle of **hiding internal implementation details** from the outside world and exposing only the essential features or operations to the user.

> [!NOTE]
> **The Golden Rule of Abstraction:**  
> The user knows **WHAT** the system does, but does not need to know **HOW** it works internally.

### Real-World Example: ATM Machine
- **What the user sees / does:** Insert card, enter PIN, withdraw cash, check balance.
- **What is abstracted away (hidden):** Database verification, encrypted transaction packets, network authorization with the banking server, cash dispensing mechanics.

### When Should We Use Abstraction?
Use abstraction when the developer knows **WHAT** operations must exist across all entities, but the specific **HOW-TO** implementation differs based on the entity type or future business requirements.

#### Example: Employee Skill Hierarchy
Consider an HR application where all employees require skills, but the actual skillset varies by role:
- **Developer:** Coding + Communication + Logic
- **Cook:** Cooking skills
- **Tester:** Quality Assurance + Testing skills

```java
abstract class Employee {
    abstract void skill();
}

class Developer extends Employee {
    @Override
    void skill() {
        System.out.println("Coding + Communication + Logic");
    }
}

class Cook extends Employee {
    @Override
    void skill() {
        System.out.println("Cooking skills");
    }
}

class Tester extends Employee {
    @Override
    void skill() {
        System.out.println("Testing skills");
    }
}

public class AbsApplication {
    public static void main(String[] args) {
        Employee e;

        e = new Developer(); // Upcasting
        e.skill();

        e = new Cook();      // Upcasting
        e.skill();

        e = new Tester();    // Upcasting
        e.skill();
    }
}
```

**Output:**
```text
Coding + Communication + Logic
Cooking skills
Testing skills
```

---

## 3. Loose Coupling Using Abstract Classes

By programming to an abstract class reference rather than concrete subclasses, caller code becomes **loosely coupled**:

```java
abstract class Employee {
    abstract void skill();
}

class Developer extends Employee {
    @Override
    void skill() {
        System.out.println("Need coding skills");
    }
}

class Cook extends Employee {
    @Override
    void skill() {
        System.out.println("Need cooking skills");
    }
}

class Hire {
    // Loosely coupled: accepts any subclass of Employee
    void hireEmployee(Employee e) {
        e.skill();
    }
}

public class LooseCouplingApp {
    public static void main(String[] args) {
        Hire h = new Hire();

        Employee e = new Developer();
        h.hireEmployee(e);

        e = new Cook();
        h.hireEmployee(e);
    }
}
```

**Output:**
```text
Need coding skills
Need cooking skills
```

> [!TIP]
> **Why this is Loose Coupling:**  
> The `Hire` class depends exclusively on the common `Employee` abstraction. If we introduce new employee types (`Manager`, `Designer`, `DevOps`), the `Hire` class remains **100% untouched**.

---

## Important Interview Questions & Answers

### Q1. Can we create an object of an abstract class?

**Answer:** **No.** We cannot create an object of an abstract class directly using `new`.

If we attempt to instantiate an abstract class, the compiler raises a compile-time error:

```java
abstract class Demo {
    abstract void show();
}

public class TestInstantiation {
    public static void main(String[] args) {
        // Demo d = new Demo(); // Compile-time error: Demo is abstract; cannot be instantiated
    }
}
```

However, we **can** declare reference variables of an abstract class (`Demo d;`) to hold child class objects.

---

### Q2. Why can't we create an object of an abstract class?

**Reason:**
1. An abstract class is **conceptually incomplete** because it may contain abstract methods with no body (no implementation).
2. If Java allowed direct instantiation, someone could call an abstract method (`d.show();`), but the JVM would have no bytecodes to execute.
3. To prevent undefined runtime behavior, Java enforces a compile-time restriction stopping direct instantiation.

---

### Q3. Can we declare abstract methods in a non-abstract class?

**Answer:** **No.**

If a class defines or inherits an unimplemented abstract method, the class **must be declared `abstract`**.

```java
class Demo {
    // Compile-time error: The abstract method show in type Demo can only be defined by an abstract class
    // abstract void show(); 
}
```

---

### Q4. Can we define non-abstract methods inside an abstract class?

**Answer:** **Yes.**

An abstract class can contain a full range of Java class members:
1. **Abstract methods:** Methods with no body.
2. **Concrete (non-abstract) methods:** Fully implemented methods.
3. **Constructors:** Used during constructor chaining.
4. **Static methods:** Class-level utility methods.
5. **Instance & static variables:** State storage.
6. **Final methods:** Methods that subclasses cannot override.

```java
abstract class Demo {
    // Abstract method
    abstract void show();

    // Concrete method
    void display() {
        System.out.println("Normal concrete method");
    }
}

class Test extends Demo {
    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }
}

public class Application {
    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        t.display();
    }
}
```

**Output:**
```text
Abstract method implemented
Normal concrete method
```

---

### Q5. Can we declare a constructor inside an abstract class?

**Answer:** **Yes.**

Abstract classes can declare default, no-argument, and parameterized constructors.

```java
abstract class Parent {
    Parent() {
        System.out.println("Parent constructor executed");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child constructor executed");
    }
}

public class ConstructorApp {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
```

**Output:**
```text
Parent constructor executed
Child constructor executed
```

---

### Q6. What is the purpose of an abstract class constructor if we cannot create its object?

The constructor of an abstract class is invoked via **Constructor Chaining (`super()`)** whenever an object of its child class is instantiated.

**Primary Purposes:**
1. **Initialize Abstract Class Fields:** Sets up instance variables declared in the abstract class.
2. **Centralize Common Initialization:** Executes shared setup routines once in the parent rather than duplicating them in every child constructor.
3. **Enforce Required Data:** Parameterized constructors force subclasses to provide mandatory values.

```java
abstract class Employee {
    int id;

    Employee(int id) {
        this.id = id;
        System.out.println("Employee ID initialized: " + id);
    }
}

class Developer extends Employee {
    Developer(int id) {
        super(id); // Calling abstract parent constructor
        System.out.println("Developer constructor executed");
    }
}

public class EmployeeInitApp {
    public static void main(String[] args) {
        Developer d = new Developer(101);
    }
}
```

**Output:**
```text
Employee ID initialized: 101
Developer constructor executed
```

---

### Q7. Can we declare abstract methods as private?

**Answer:** **No.**

**Reason:**
- `private` members are accessible **only within the declaring class** and are never inherited by subclasses.
- `abstract` methods **must be inherited and overridden** by concrete child classes.
- Since `private` prevents overriding while `abstract` requires overriding, combining them is an illegal contradiction.

```java
abstract class Demo {
    // Compile-time error: The abstract method show in type Demo can only set a visibility of public or protected
    // private abstract void show(); 
}
```

---

### Q8. Can we declare abstract methods as static?

**Answer:** **No.**

**Reason:**
- `static` methods belong to the **class** and are resolved at compile time using static binding (Method Hiding).
- `abstract` methods belong to **instances** and rely on runtime dynamic method dispatch (Method Overriding).
- A static method cannot be overridden, so it can never fulfill the contract of an abstract method.

```java
abstract class Demo {
    // Compile-time error: The abstract method show in type Demo can only set a visibility of public or protected
    // static abstract void show(); 
}
```

---

### Q9. Can we declare an abstract method as final?

**Answer:** **No.**

**Reason:**
- The `final` modifier **prohibits overriding**.
- The `abstract` modifier **mandates overriding**.
- They are mutually exclusive opposites.

```java
abstract class Demo {
    // Compile-time error: The abstract method show in type Demo can only be defined by an abstract class
    // abstract final void show(); 
}
```

---

### Q10. Can we create references of an abstract class?

**Answer:** **Yes.**

While we cannot instantiate an abstract class directly, creating an abstract reference variable is the foundation of **Dynamic Polymorphism** and **Loose Coupling**.

#### Example: Geometric Calculations with Abstract References
```java
abstract class Circle {
    protected float PI = 3.14f;
    protected float radius;

    void setRadius(float radius) {
        this.radius = radius;
    }

    abstract float getResult();
}

class Area extends Circle {
    @Override
    float getResult() {
        return PI * radius * radius;
    }
}

class Circumference extends Circle {
    @Override
    float getResult() {
        return 2 * PI * radius;
    }
}

public class CircleApp {
    public static void main(String[] args) {
        Circle cir; // Abstract class reference

        cir = new Area(); // Upcasting
        cir.setRadius(3.0f);
        System.out.println("Area is " + cir.getResult());

        cir = new Circumference(); // Upcasting
        cir.setRadius(4.0f);
        System.out.println("Circumference is " + cir.getResult());
    }
}
```

**Output:**
```text
Area is 28.26
Circumference is 25.12
```

---

### Q11. Must all abstract methods be overridden?

**Answer:**
- **In a concrete child class:** **Yes.** Any concrete subclass must provide implementations for **all** inherited abstract methods.
- **In an abstract child class:** **No.** If a subclass does not implement all inherited abstract methods, that subclass **must also be declared `abstract`**.

```java
abstract class ParentContract {
    abstract void op1();
    abstract void op2();
}

// Partial implementation: Must remain abstract
abstract class Intermediate extends ParentContract {
    @Override
    void op1() {
        System.out.println("op1 implemented");
    }
    // op2 is left unimplemented
}

// Concrete subclass: Implements the remaining methods
class FinalImplementation extends Intermediate {
    @Override
    void op2() {
        System.out.println("op2 implemented");
    }
}
```

---

### Q12. What is an Adapter Class and why do we use it?

**Definition:** An **Adapter Class** is an intermediate class that implements all abstract methods of an abstract class or interface with **empty default bodies `{ }`**.

**Purpose:** It allows child classes to override **only the specific methods they need**, eliminating unnecessary boilerplate code.

#### Problem Without an Adapter Class:
If an abstract class has 5 abstract methods (`show()`, `display()`, `test()`, `demo()`, `print()`), a child class needing only `show()` is forced to implement all 5 methods.

#### Solution With an Adapter Class:
```java
abstract class FrameworkContract {
    abstract void show();
    abstract void display();
    abstract void test();
}

// Adapter class providing empty default implementations
class FrameworkAdapter extends FrameworkContract {
    void show() { }
    void display() { }
    void test() { }
}

// Subclasses extend the adapter and override ONLY what they need
class ClientA extends FrameworkAdapter {
    @Override
    void show() {
        System.out.println("ClientA needs only show()");
    }
}

class ClientB extends FrameworkAdapter {
    @Override
    void display() {
        System.out.println("ClientB needs only display()");
    }
}

public class AdapterApp {
    public static void main(String[] args) {
        ClientA a = new ClientA();
        a.show();

        ClientB b = new ClientB();
        b.display();
    }
}
```

**Output:**
```text
ClientA needs only show()
ClientB needs only display()
```

---

### Q13. Can an abstract class extend a non-abstract class?

**Answer:** **Yes.**

An abstract class can extend any concrete (non-abstract) class. In fact, **every abstract class in Java implicitly extends `java.lang.Object`** (which is a concrete class).

```java
class ConcreteParent {
    void baseMethod() {
        System.out.println("Concrete base method");
    }
}

abstract class AbstractChild extends ConcreteParent {
    abstract void abstractMethod();
}

class GrandChild extends AbstractChild {
    @Override
    void abstractMethod() {
        System.out.println("Abstract method implemented");
    }
}

public class ConcreteInheritApp {
    public static void main(String[] args) {
        GrandChild obj = new GrandChild();
        obj.baseMethod();       // Inherited from ConcreteParent
        obj.abstractMethod();   // Inherited from AbstractChild
    }
}
```

**Output:**
```text
Concrete base method
Abstract method implemented
```

---

### Q14. Can we use an abstract class without creating a separate named subclass?

**Answer:** **Yes, using an Anonymous Inner Class.**

An **Anonymous Inner Class** allows us to declare an inline subclass and instantiate it simultaneously in a single expression.

### Q15. What is an Anonymous Inner Class and how is it used with abstract classes?

**Definition:** An anonymous inner class is an unnamed local class defined and instantiated on-the-fly. It is ideal for **one-time ad-hoc implementations** where creating a dedicated `.java` class file is unnecessary.

```java
abstract class Greeting {
    abstract void greet();
}

public class AnonymousApp {
    public static void main(String[] args) {
        // Creating an anonymous subclass of Greeting on-the-fly
        Greeting g = new Greeting() {
            @Override
            void greet() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };

        g.greet();
    }
}
```

**Output:**
```text
Hello from Anonymous Inner Class!
```

---

## Comparison Tables (Q16 - Q20)

### Q16. What is the difference between Abstract and Final keywords?

| Feature | `abstract` Keyword | `final` Keyword |
| :--- | :--- | :--- |
| **Applicability** | Classes and methods. | Classes, methods, and variables. |
| **Class Instantiation** | Cannot be instantiated directly. | Can be instantiated normally. |
| **Inheritance** | **Must** be extended to be useful. | **Cannot** be extended / inherited. |
| **Method Overriding** | **Must** be overridden by concrete subclass. | **Cannot** be overridden. |
| **Core Purpose** | Promotes abstraction and extensibility. | Enforces restriction and immutability. |

---

### Q17. What is the difference between Static and Abstract keywords?

| Feature | `static` Keyword | `abstract` Keyword |
| :--- | :--- | :--- |
| **Scope** | Belongs to the **class** (shared memory). | Relies on **instance inheritance**. |
| **Method Body** | Must have an implementation body. | Has **no** implementation body. |
| **Dispatch / Binding** | Resolved at **compile time** (Early binding). | Resolved at **runtime** (Dynamic dispatch). |
| **Invocation** | Called via class name: `ClassName.method()`. | Called via object instance: `obj.method()`. |
| **Overriding** | Cannot be overridden (Method Hiding). | Must be overridden by concrete subclasses. |

---

### Q18. What is the difference between Static Method and Abstract Method?

| Feature | `static` Method | `abstract` Method |
| :--- | :--- | :--- |
| **Body** | Contains a full method body. | Has no method body (ends with `;`). |
| **Resolution** | Compile-time static binding. | Runtime dynamic dispatch. |
| **Inheritance Effect** | Can be hidden, not overridden. | Must be overridden in concrete subclasses. |
| **Use Case** | Utility / helper functions. | Mandatory contract enforcement. |

---

### Q19. What is the difference between Abstract Method and Final Method?

| Feature | `abstract` Method | `final` Method |
| :--- | :--- | :--- |
| **Method Body** | No method body. | Full method body. |
| **Overriding** | **Must** be overridden. | **Forbidden** from being overridden. |
| **Purpose** | Mandates customized child logic. | Protects critical parent logic from changes. |
| **Declaration Location** | Only inside abstract classes or interfaces. | Inside abstract or concrete classes. |

---

### Q20. What is the difference between Abstract Class and Final Class?

| Feature | `abstract` Class | `final` Class |
| :--- | :--- | :--- |
| **Instantiation** | Cannot be instantiated directly (`new` disallowed). | Can be instantiated directly. |
| **Subclassing** | Designed specifically to be extended. | Forbidden from having any subclasses. |
| **Method Types** | Can contain abstract and concrete methods. | Can only contain concrete methods. |
| **Compatibility** | Conflicting opposites: **A class cannot be both `abstract` and `final`**. | Conflicting opposites: **A class cannot be both `abstract` and `final`**. |

---

## Quick Interview Revision

### 1. Rapid-Fire Concept Table

| Concept | Key Interview Rule |
| :--- | :--- |
| **Abstract Class** | Incomplete class; cannot create direct objects with `new`. |
| **Abstract Method** | Signature only; no body; must be overridden. |
| **Abstraction** | Hiding implementation details, showing essential features. |
| **Constructor** | Permitted; executed via `super()` chaining during child construction. |
| **Abstract Reference** | Permitted; enables runtime polymorphism and loose coupling. |
| **`abstract private`** | ❌ Forbidden (private methods cannot be overridden). |
| **`abstract static`** | ❌ Forbidden (static methods cannot be dynamically overridden). |
| **`abstract final`** | ❌ Forbidden (final methods cannot be overridden). |
| **Concrete Child Class** | Must implement all inherited abstract methods. |
| **Abstract Child Class** | Allowed to leave inherited abstract methods unimplemented. |
| **Adapter Class** | Provides empty `{ }` bodies to reduce boilerplate code. |
| **Anonymous Class** | Inline one-time implementation without declaring a named subclass. |
| **Abstract + Final Class** | ❌ Mutually exclusive; causes compile-time error. |

---

### 2. The 10 Most Important Rules to Remember

1. **No Direct Instantiation:** `new AbstractClass()` is always illegal; use child objects or anonymous inner classes.
2. **References are Legal:** `AbstractClass ref = new ConcreteChild();` is the core pattern for dynamic polymorphism.
3. **Class Declaration Rule:** If a class has even one abstract method, the class must be declared `abstract`.
4. **Concrete Methods Allowed:** An abstract class can have 0% to 100% concrete methods.
5. **Constructors Exist:** Abstract classes have constructors to initialize parent state via `super()`.
6. **Forbidden Modifiers:** Abstract methods cannot be `private`, `static`, or `final`.
7. **Incomplete Subclasses:** A subclass that fails to implement all inherited abstract methods must itself be declared `abstract`.
8. **Adapter Pattern:** Use adapter classes with empty bodies to avoid implementing unused methods.
9. **Single-Use Subclasses:** Use anonymous inner classes when a one-off implementation is needed.
10. **Conflict with Final:** An entity can never be both `abstract` and `final`.

> [!TIP]
> **Pro-Tip for Java Interviews:**  
> When asked about abstract classes, start with a real-world example (e.g., `Employee` or `Shape`), explain that the parent defines the **WHAT** while subclasses define the **HOW**, and demonstrate how an abstract reference (`Shape s = new Circle();`) achieves **Loose Coupling** and **Dynamic Method Dispatch**.
