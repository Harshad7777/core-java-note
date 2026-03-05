Q. What is Inheritance?

Inheritance is a mechanism in Java where one class acquires (inherits) the properties and behaviors of another class.
    The class whose properties are inherited is called the Parent class / Super class / Base class
    The class that inherits the properties is called the Child class / Sub class / Derived class

Definition (Standard) 
    Inheritance means transferring the properties (variables) and behaviors (methods) of one class into another class.

Note : 
IS–A Relationship
    When inheritance is performed between two classes, they are connected by an IS–A relationship.
    Example:
    Math IS-A Subject
    Dog IS-A Animal
    Car IS-A Vehicle

Q. Why use Inheritance? / What are the benefits of Inheritance?

Inheritance is used in Java to reuse existing code, extend functionality, and establish a relationship between classes.

Benefits of Inheritance
1️⃣ Reusability

Reusability means using the properties and methods of an existing class in another class.
    Common logic is written once in the parent class
    Child classes can reuse that logic
    Reduces code duplication
Example:
If multiple classes require calculator operations (ADD, SUB, MUL, DIV), we can define them in one parent class and reuse them in child classes.

2️⃣ Extensibility

Extensibility means the child class can extend the functionality of the parent class.

    Child class acquires parent properties
    Child class can add new variables and methods
    Existing code remains unchanged

Example:

class Calculator
{
    void add() { }
    void sub() { }
}

class AdvancedCalculator extends Calculator
{
    void mul() { }
    void div() { }
}

3️⃣ Abstraction

Inheritance helps in achieving abstraction by:

    Showing only required features
    Hiding unnecessary details

(Concept explained later using abstract classes and interfaces)

4️⃣ Dynamic Polymorphism

Inheritance is required to achieve runtime polymorphism.

    Parent reference can refer to child object
    Method overriding allows dynamic method binding

(Explained later in polymorphism topic)

Summary Table
| Benefit       | Description                               |
| ------------- | ----------------------------------------- |
| Reusability   | Write once, use multiple times            |
| Extensibility | Add new features without modifying parent |
| Abstraction   | Hides internal implementation             |
| Polymorphism  | Enables dynamic behavior                  |

-------------------------------------------------------------------------Q. Types of Inheritance / How many ways to perform inheritance?

Inheritance can be performed in the following ways:

1️⃣ Single Level Inheritance

    When one parent class is inherited by one child class, it is called single level inheritance.

    Example:
        class A { }
        class B extends A { }

2️⃣ Multilevel Inheritance

    When a class is derived from another derived class, it is called multilevel inheritance.

    Here, a class acts as child of one class and parent of another.

    Example:
        class A { }
        class B extends A { }
        class C extends B { }

3️⃣ Hierarchical Inheritance

    When one parent class has more than one child class, it is called hierarchical inheritance.

    Example:
        class A { }
        class B extends A { }
        class C extends A { }

4️⃣ Multiple Inheritance

    When one child class inherits from more than one parent class, it is called multiple inheritance.

    ⚠️ Java does NOT support multiple inheritance using classes because of ambiguity problems.

    ✔ Java supports multiple inheritance using interfaces.

    Example (Interface-based):
        interface A { }
        interface B { }
        class C implements A, B { }

5️⃣ Hybrid Inheritance

    Hybrid inheritance is a combination of two or more types of inheritance. 

    ⚠️ Java does NOT support hybrid inheritance using classes,
    but it can be achieved using interfaces.

⭐ Important Java Note (Very Important for Exams)
| Type         | Supported in Java (Classes) |
| ------------ | --------------------------- |
| Single Level | ✅ Yes                       |
| Multilevel   | ✅ Yes                       |
| Hierarchical | ✅ Yes                       |
| Multiple     | ❌ No (with classes)         |
| Hybrid       | ❌ No (with classes)         |

-------------------------------------------------------------------------
Q. How to implement inheritance practically in Java?
-------------------------------------------------------------------------
Inheritance in Java is implemented using the *extends* keyword.

Using the extends keyword, a child class can acquire the properties and methods of a parent class.

Syntax of Inheritance
    class Parent
    {
        // variables and methods
    }

    class Child extends Parent
    {
        // child class variables and methods
    }
-------------------------------------------------------------------------
Q. Can we create a Java program without inheritance?
-------------------------------------------------------------------------
No, it is not possible to create a Java program without inheritance.

Reason:
In Java, every class is implicitly inherited from the Object class.
    If a developer does not explicitly extend any class,
    Java automatically provides a default parent class.
    This default parent class is java.lang.Object.
    Hence, inheritance is always present in Java programs.

class A
{

}

// compiler generated code
class A extends java.lang.object
{

}
-------------------------------------------------------------------------
Defined Class → Object Class
   Q. Why does Java provide an Object class as a parent class to every user defined class?

------------------------------------------------------------------------
What is Object Class?
 
The Object class is the root class of Java.
    Every class in Java directly or indirectly inherits from the Object class
    It contains inbuilt methods that are required by every Java class for common operations
The Object class belongs to the java.lang package.

Important Methods of Object Class

| Method                       | Purpose                                 |
| ---------------------------- | --------------------------------------- |
| `boolean equals(Object obj)` | Compares two objects                    |
| `int hashCode()`             | Returns hash value of object            |
| `String toString()`          | Returns string representation of object |
| `Object clone()`             | Creates copy of object                  |
| `Class getClass()`           | Returns runtime class info              |
| `void wait()`                | Causes thread to wait                   |
| `void wait(long ms)`         | Waits for given time                    |
| `void notify()`              | Wakes up one waiting thread             |
| `void notifyAll()`           | Wakes up all waiting threads            |
| `void finalize()`            | Called before garbage collection        |

One-Line Exam Answer
    Object class is the superclass of all Java classes and provides common methods required for basic object operations.
---------------------------------------------------------------------------------
Q. Is Java a Pure Object-Oriented Language?
Short Answer:

❌ No, Java is not a pure object-oriented language.

Explanation:
    Java follows object-oriented principles, but it is not 100% pure OOP because:
    Reasons Java is NOT Pure OOP
        Java supports primitive data types
        (int, float, char, boolean, etc.)
        Primitive types are not objects
        Static methods and variables can exist without objects

        Why Some People Say Java is Pure OOP?
        Because:
            Everything is written inside a class
            Every class inherits from Object class
            Java provides wrapper classes (Integer, Float, etc.)
            No code can run outside a class
            Final Conclusion (Correct Answer)

Java is not a pure object-oriented language because it supports primitive data types, but it is strongly object-oriented.
---------------------------------------------------------------------------------
Example of Hirachical inheritance
---------------------------------------------------------------------------------
class Value 
{ 
    int x,y;
    void setValue(int x,int y)
    {  
        this.x=x;
        this.y=y;
    }
}
class Add extends Value 
{  
    int getAdd()
   { 
      return x+y;
   }
}
class Mul extends Value 
{  int getMul()
   { 
    return this.x*this.y;
   }
}
public class HApplication
{  public static void main(String x[])
   {   
       Add ad = new Add();
	   ad.setValue(10,20);
	   int result=ad.getAdd();
	   System.out.println("Addition is "+result);
	   Mul m = new Mul();
	   m.setValue(5,4);
	   result=m.getMul();
	   System.out.println("Multiplication is "+result);
   }
}

Output
    Addition is 30
    Multiplication is 20

----------------------------------------------------------------
Constructor with Inheritance
----------------------------------------------------------------
When a parent class has a default constructor and the child class has its own constructor, then on creating an object of the child class, the parent class constructor is executed first automatically, followed by the child class constructor.

class A
{
    A()
    {
        System.out.println("I am parent construoctor");
    }
}
class B extends A
{
    B()
    {
        super()
        System.out.println("I am child constructor");
    }
}
public class InhConsApp
{
    public static void main(String x[])
    {
        B b1 = new B();
    }
}

🖨️ Output:
I am parent constructor
I am child constructor

Note: Constructor with Parameterized Parent Class

When a parent class has a parameterized constructor and we create an object of the child class, then the child class constructor must pass parameters to the parent class constructor.
For this purpose, we use the super() constructor.

If parameters are not passed using super(), the program will produce a compile-time error, because Java will try to call a default constructor of the parent class, which does not exist.

class A
{
    A(int x)
    {
        System.out.println("I am parent constructor "+ x);
    }
}
class B extend A
{
    B()
    {
        System.out.println("I am child constructor");
    }
}
public class  InhConsApp
{
    public static void main(String x[])
    {
        B b1 = new b();
    }
}

output:
error

Key Points:
If we look at the left-hand side code, we get a compile-time error because the parent class contains a parameterized constructor.
When a parent class has a parameterized constructor, the Java compiler cannot automatically pass arguments to the parent constructor.

Therefore, it becomes the developer’s responsibility to explicitly pass parameters from the child class constructor to the parent class constructor.

For this purpose, Java provides the super() constructor, which must be used inside the child class constructor to pass the required arguments to the parent constructor.

------------------------------------------------------------------------

Q. What is super() constructor and why is it used?

The super() constructor is an inbuilt constructor call used inside a child class constructor to call or refer to the parent class constructor.

Why do we use super() constructor?

    It is used to invoke the parent class constructor from the child class constructor.
    It is mandatory when the parent class has a parameterized constructor.
    It helps in passing parameters from child to parent constructor.
    It ensures proper initialization of parent class data members.

Important Points:

    super() is written inside the child class constructor.
    super() must be the first statement in the constructor.
    If the parent class has only a default constructor, Java calls super() implicitly.
    Using super() enables constructor chaining in inheritance.

class A
{
    A(int x)
    {
        System.out.println("I am parent constructor "+x);
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
public class InhConsApp
{
    public static void main(String x[])
    {
        B b1 = new B();
    }
}

🖨️ Output
I am constructor 100
I am child constructor

NOTE : super() must be first line of code in child class constructor but jdk 24 we can write super on any line

NOTE: you can compile and run java code as per given format so we can use super() constructor on any line

class A
{
    A(int x)
    {
        System.out.println("I am construtor "+x);
    }
}
class B extends A
{
    B()
    {
        System.out.println("I am child constructor ");
        super(100);
    }
}
public class InchConsApp
{
    public static void main(String x[])
    {
        B b1 = nwe B();
    }
}

🖨️ Output
I am constructor 100
I am child constructor
------------------------------------------------------------------------
Q. How is the default constructor of a parent class called automatically by a child class?
------------------------------------------------------------------------

When the parent class has a default (no-argument) constructor, the Java compiler automatically inserts a super() call as the first line inside the child class constructor.   
Therefore, the developer does not need to call super() manually.
Because of this implicit super() call, the parent class default constructor is executed first, followed by the child class constructor.

Key Points:
    Compiler inserts super() automatically
    super() calls the parent default constructor
    No need to write super() explicitly
    Parent constructor executes before child constructor
-------------------------------------------------------------------------
Q. Is super() called a grandparent class constructor?
-------------------------------------------------------------------------
Answer: No.
    super() does not directly call the grandparent class constructor.
    It can only call the immediate parent class constructor.

Explanation:
    super() is used to invoke the constructor of the immediate parent class only.

Java follows constructor chaining.
    When super() is called in a child class constructor:
    It first calls the parent class constructor
    If that parent constructor contains super(), then it calls its parent constructor, and so on.
    Thus, the grandparent constructor is called indirectly, not directly.

class D
{
    D(int x)
    {
        System.out.println("I am D constructor " + x);
    }
}
class A extends D
{
    A(int x)
    {
       // super(x);   // mandatory
        System.out.println("I am parent constructor " + x);
    }
}
class B extends A
{
    B()
    {
        super(100);   // calls A(int)
        System.out.println("I am child constructor");
    }
}
public class InhConsApp
{
    public static void main(String x[])
    {
        B b1 = new B();
    }
}

Corrected Note:

Note:
    If we look at the left-hand side, we get a compile-time error because we do not pass any parameter to the constructor D(int x) from class A.
    In class B, we call super(100), which invokes the constructor of the immediate parent class A, not the grandparent class D.
    Since super() can call only the immediate parent constructor, and class A does not explicitly call super(x) for class D, the compiler cannot find a valid constructor to execute.
    To resolve this error, we must explicitly call super(x) inside the constructor of class A.

Correct version of above code

class D
{
    D(int x)
    {
        System.out.println("I am D constructor "+x);
    }
}
class A extends D
{
    A(int x)
    {
        super(200); //call D
            System.out.println("I am parent construtor "+x);
    }
}
class B extends A
{
    B()
    {
        super(100); //call A
        System.out.println("I am child constructor");
    }
}
public class InhConsApp
{
    public static void main(String x[])
    {
        B b1 = new B();
    }
}

🖨 Output
I am D constructor 200
I am parent construtor 100
I am child constructor

Q. What is the difference between this() and super() constructors?
| `this()` constructor                                     | `super()` constructor                                              |
| -------------------------------------------------------- | ------------------------------------------------------------------ |
| Refers to the **current class constructor**              | Refers to the **parent class constructor**                         |
| Used for **constructor chaining within the same class**  | Used for **constructor chaining between parent and child classes** |
| Works with **constructor overloading** in the same class | Works with **inheritance**                                         |
| Calls another constructor of the **same class**          | Calls a constructor of the **immediate parent class**              |
| Helps avoid **duplicate initialization code**            | Helps initialize **parent class data**                             |

-------------------------------------------------------------------
Q. Can we use this() and super() at the same time?
-------------------------------------------------------------------
Answer: No.
    We cannot use this() and super() together in the same constructor.

Explanation:
    Both this() and super() must be the first statement in a constructor.
    Java allows only one first statement in a constructor.

Note: but if we  use – - enable-preview option with new JDK version then it is possible 
 
Final keyword : final keyword can use with variable, with function and with class and final is non access specifier 

-------------------------------------------------------------------------
Q. What is a non-access specifier?
-------------------------------------------------------------------------
Answer:
    Non-access specifiers are Java keywords used to define the behavior or restrictions of a class, method, or variable.
    They control how a member works, not who can access it.

Types of non-access specifiers:
    a. static
    b. final
    c. abstract
    d. synchronized
    e. volatile
    f. transient
    g. strictfp
    h. assert
------------------------------------------------------------------------
Q. What is an access specifier?
Answer:
    Access specifiers are Java keywords used to control the accessibility (visibility) of classes and their members.

Types of access specifiers:
    public
    protected
    default (no keyword)
    private

Difference in One Line (Exam Tip):
    Access specifiers → control visibility
    Non-access specifiers → control behavior

Final Variable

A final variable is a variable whose value cannot be changed once it is assigned.
It is used to create constants in Java.

Example:
calss A
{
    private int m;
    final int n = 10;
}
public class InhConsApp
{ 
    public static void main(String x[])
    {
        A a1 = new A();
        a1.n++;
        System.out.printf("N = %n"a1.n);
    }
}
NOTE : we get compile time errror because we try to modifiy value of final variable which is not possible
means final can use for only constnat declaration purpose

------------------------------------------------------------------------
Q. What is method overriding?
-----------------------------------------------------------------------
Answer:
    Method overriding means when define method in parent class and redefine same method again in child class with same signature /syntax  called as overriding 

    Method overriding occurs when a child class provides its own implementation of a method that is already defined in the parent class, using the same method signature.

Conditions for Method Overriding:
    For overriding, the following must be same in both parent and child classes:
    1.Method name
    2.Parameter list (number, type, and sequence)

🔹 Return type must be the same or covariant (subclass type).
🔹 Access modifier cannot be more restrictive than the parent’s.

Important Points:
    Method overriding supports runtime polymorphism.
    Overriding happens only in inheritance.
    Only non-static methods can be overridden.
    final, static, and private methods cannot be overridden.

class A
{
    void show()
    {
        System.out.println("I am show in A");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("I am show in B");
    }
}

NOTE: same Syntax or signature in parent and child it is overriding
------------------------------------------------------------------------
NOTE: in the case of method overriding when we create an object of child class and try to call an overridden method then by default child logics get executed.

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
        System.out.println("I am show in B");
    }
}
public class InhConsApp
{
    public static void main(String x[])
    {
        B b1 = new B();
        b1.show();
    }
}

✔ Output
I am show in B
-----------------------------------------------------------------------
Q. Why do we use method overriding? / What are the benefits of overriding?
------------------------------------------------------------------------
Method overriding is used to:
    1. Customize parent class method logic in the child class according to child requirements.
    2. Achieve dynamic (runtime) polymorphism.
    3. Provide specific behavior for different child classes while keeping a common interface.

Explanation with Real-World Example (Loan Module)

    Suppose we have a Loan module in a banking application.
    There are different types of loans:
        Home Loan
        Car Loan
    Some rules are common for all loans (documents, eligibility, etc.).
    But loan tenure differs:
        Home Loan → maximum 30 years
        Car Loan → maximum 7 years

    To implement this:
        Create a parent class Loan
        Define a method like getTenure()
        Override this method in child classes to customize logic

example with source code

class Loan
{
   void loanCompDoc()
   {   
        System.out.println("Need to submit salary sleep or 3 year tax returns");
   }
   void loanFlexDoc()
   {
   }
   int getTenuar()
   {
        return 0;
   }
}
class Home extends Loan 
{  
    int getTenuar()
    {
        return 30;
    }
}
class Car extends Loan 
{
    int getTenuar()
    {
        return 7;
    }
}
public class LoanApplication
{   
    public static void main(String x[])
    {
	   Home h = new Home();
	   h.loanCompDoc();
	   int max = h.getTenuar();
	   System.out.println("Max Tenuar for Home loan refundation "+max);
	   Car c = new Car();
	   c.loanCompDoc();
	   max = c.getTenuar();
	   System.out.println("Max tenuar for Car loan refundation "+max);
	}
}
------------------------------------------------------------------------
How can we achieve dynamic polymorphism using overriding?
------------------------------------------------------------------------
Q. What is dynamic polymorphism?
Answer:
    Dynamic polymorphism occurs when the method call is resolved at runtime based on the object, not the reference type.
    It is achieved through method overriding.
    In dynamic polymorphism, which child class method is executed is decided at program runtime.  

Important Points:
    Also called runtime polymorphism
    Achieved using method overriding
    Requires inheritance
    Method binding happens at runtime
    Implemented using upcasting

Upcasting (Very Important)
Upcasting:
When a parent class reference refers to a child class object, it is called upcasting.

    Parent p = new Child(); // upcasting 

Benefit of Upcasting:
    We can change child object at runtime 
    Enables dynamic polymorphism 
-----------------------------------------------------------------------
Example: Calculator using Dynamic Polymorphism

class Value 
{   
   int x,y;
   void setValue(int x,int y) 
   {
        this.x=x;
        this.y=y;
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
        return x+y;
    }
}

class Mul extends Value 
{  
    int getResult()
    {
      return x*y;
    }
}

public class DPAPP
{ 
  public static void main(String x[])
  {
	  Value v = null;
      
	  v = new Add();
	  v.setValue(10,20);
	  int result = v.getResult();
	  System.out.println("Addition is "+result);

	  v = new Mul();
	  v.setValue(5,4);
	  result = v.getResult();
	  System.out.println("Multiplication is "+result);
  }
}

Example: we want to calculate area  and circum of circle and we have following class hierarchy 

class Circle
{
    float radius;

    void setRadius(float radius)
    {
        this.radius = radius;
    }

    float getResult()
    {
        return 0;
    }
}

class Area extends Circle
{
    float getResult()
    {
        return radius * radius * 3.14f;
    }
}

class Cirm extends Circle
{
    float getResult()
    {
        return radius * 2 * 3.14f;
    }
}

public class CircleApplication
{
    public static void main(String x[])
    {
        Circle c = null;

        c = new Area();          // parent reference → child object
        c.setRadius(3.0f);
        float result = c.getResult();   // calls Area.getResult()
        System.out.println("Area " + result);

        c = new Cirm();          // parent reference → different child
        c.setRadius(4.0f);
        result = c.getResult();  // calls Cirm.getResult()
        System.out.println("Circumference " + result);
    }
}

Q. What is the benefit of dynamic polymorphism with upcasting technique?

Answer:
The main benefit of dynamic polymorphism with upcasting is to achieve loose coupling.

Using upcasting, a parent class reference can refer to different child class objects, and the method call is resolved at runtime.
This allows us to write flexible and extensible code without depending on concrete implementations.

-------------------------------------------------------------------
Q. What is coupling in OOP?

Answer:
Coupling in Object-Oriented Programming refers to the degree of dependency between two classes.

If one class depends heavily on another class to perform its operations, then those classes are said to be tightly coupled.

In other words, when:
    One class cannot work independently
    Or one class directly creates or uses another class object
    then coupling exists.

Types of Classes in Coupling
1️⃣ Target Class
    A target class is the class whose object is created and which internally uses another class.
    ➡ When an object of the target class is created, another class object gets used automatically.
  
2️⃣ Dependent Class
    A dependent class is the class that is used by the target class.
    ➡ The dependent class cannot function independently and always works in association with the target class.

class Parcel
{
    private int id;
    private String name;
    private int weight;

    // setters
    void setId(int id)
    {
        this.id = id;
    }

    void setName(String name)
    { 
        this.name = name;
    }

    void setWeight(int weight)
    {
        this.weight = weight;
    }

    // getters
    int getId()
    {
        return id;
    }

    String getName()
    {
        return name;
    }

    int getWeight()
    {
        return weight;
    }
}

class Courier   // Target class
{
    private Parcel parcel;

    void setParcel(Parcel parcel)
    {
        this.parcel = parcel;   // dependency injected
    }
 
    void show()
    {
        System.out.println("Parcel Id: " + parcel.getId());
        System.out.println("Parcel Name: " + parcel.getName());
        System.out.println("Parcel Weight: " + parcel.getWeight()); 
    }
}

public class CoupApplication
{
    public static void main(String x[])
    {
        Parcel p = new Parcel();
        p.setId(1);
        p.setName("ABC");
        p.setWeight(100);

        Courier c = new Courier();
        c.setParcel(p);   // object association
        c.show();
    }
}
output:
Parcel Id: 1
Parcel Name: ABC
Parcel Weight: 100
----------------------------------
Types of Coupling

1️⃣ Tight Coupling
Definition:
Tight coupling occurs when a target class  is completely dependent (100%) on a specific dependent class. Any change in the dependent class directly affects the target class.

Key Points:
    Direct object creation using new
    Target class depends on concrete class
    Hard to modify, test, or extend
    Low reusability

2️⃣ Loose Coupling
Definition:
Loose coupling occurs when a target class is partially dependent on another class, usually through a parent class reference  as parameter in target class.(interface or superclass).

Key Points:
    Uses interface or superclass reference
    Object passed via constructor or method
    Easy to change implementation
    High flexibility and reusability

example of Tight coupling?

![alt text](image-1.png)
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

class Calculator
{
    void performOperation(Add ad)
    {
        int result = v.getResult();
        System.out.println("Result is " + result);
    }
}

public class CalcApplication
{
    public static void main(String x[])
    {
        Calculator c = new Calculator();

        Add a = new Add();
        a.setValue(10, 20);
        c.performOperation(a);

        Mul m = new Mul();
        m.setValue(5, 4);
        c.performOperation(m);
    }
}

🖨️ Output
Result is 30
Result is 20

✅ Correct Explanation (Improved & Structured)

In the given code, compile-time error occurs because the Calculator class contains the method:
    performOperation(Add ad)
This method accepts only an Add class reference.
Now, from the main() method, we try to pass a Mul class object:
    c.performOperation(m);   // m is Mul object
This is not allowed, because:
Mul is not of type Add
Java does not support implicit conversion between sibling classes
As a result, the compiler throws a compile-time error.

❌ Why this is Tight Coupling
    Calculator is directly dependent on the concrete class Add
    performOperation(Add ad) cannot work with any other operation
    If we want multiplication, subtraction, etc., we must change Calculator code

📌 Key Points (Exam Friendly)
    performOperation(Add ad) works only with Add objects
    Cannot accept Mul, Sub, or any other class
    Causes compile-time error
    Violates polymorphism
    Reduces reusability and flexibility

If we want to resolve the problem of tight coupling we have two solutions or two ways 
--------------------------------------------------------
a.Using compile time polymorphism

    🔹 Resolving tight coupling using Compile-Time Polymorphism (Method Overloading)

    One way to reduce the tight coupling problem in the given program is by using compile-time polymorphism, i.e., method overloading.

    In this approach, we overload the performOperation() method in the Calculator class:

    One version accepts an Add object

    Another version accepts a Mul object

    This allows the Calculator class to work with both Add and Mul objects.
-------------------------------------------------
```java
class Value
{ 
  int x,y;
  void setValue(int x,int y)
  {  
    this.x=x;
    this.y=y;
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
     return x+y;
   }
}
class Mul extends Value
{
    int getResult()
   { 
     return x*y;
   }
}
class Calculator 
{
   void performOperation(Add ad)
   {  
      int result=ad.getResult();
      System.out.printf("Result is %d\n",result);
   }
    void performOperation(Mul m)
   {  
      int result = m.getResult();
      System.out.printf("Result is %d\n",result);
   }
}
public class CalcApplication
{ 
   public static void main(String x[])
   {
      Calculator c = new Calculator();
	  Add ad = new Add();
	  ad.setValue(10,20);
	  c.performOperation(ad);
	  Mul m = new Mul();
	  m.setValue(5,4);
	  c.performOperation(m);
   }
}

🖨️ Output of the Program
Result is 30
Result is 20
```

✅ Limitation of Compile-Time Polymorphism (Method Overloading)

Although we can resolve the tight coupling problem using compile-time polymorphism (method overloading), this approach has serious limitations.

🔹 Problem Scenario
Suppose:
    The Calculator class supports 100 different operations
    Add, Mul, Div, Sub, Pow, Square, etc.  
    Each operation is implemented in a separate class
    To support all operations using method overloading, the Calculator class must define:

performOperation(Add a)
performOperation(Mul m)
performOperation(Div d)
performOperation(Sub s)
...
// nearly 100 overloaded methods

❌ Why this approach fails in real-world systems
    Calculator becomes very bulky
    High code duplication
    Violates Open–Closed Principle
    Every new operation requires
    Modifying Calculator
    Adding another overloaded method

Not scalable
Difficult to maintain and test

👉 Hence, method overloading is not practical for large systems.

✅ Why Dynamic Polymorphism is the Best Solution    
To solve this limitation, we use dynamic (runtime) polymorphism.

🔹 Key idea:
    Use parent class reference to refer to child class objects
    Use method overriding
    Create one generic method that behaves like 100 methods
    void performOperation(Value v)

At runtime:
    If v refers to Add → addition is performed
    If v refers to Mul → multiplication is performed
    If v refers to Div → division is performed
    ✔ Method selection happens at runtime
    ✔ Achieves true loose coupling
----------------------------------------------
class Circle
{  
   float radius;
   void setRadius(float radius)
   {    
      this.radius = radius;
   }
   float getResult()
   {  
      return 0.0f;
   }
}
class Area extends Circle 
{
   float getResult()
   {
      return radius*radius*3.14f;
   }
}
class Cirm extends Circle 
{
   float getResult()
   {
      return 2*radius*3.14f;
   }
}
class CircleCalculator
{
    void calResult(Circle c)
	{  
       float result = c.getResult();
	   System.out.println("Result is "+result);
	}
}

public class CircleCalculatorApplication
{
    public static void main(String x[])
	{
	   CircleCalculator cc = new CircleCalculator();
	   Circle c = new Area();
	   c.setRadius(3.0f);
	   cc.calResult(c);// behave as circle area 
	   c = new Cirm();
	   c.setRadius(4.0f);
	   cc.calResult(c);//behave as cirm 
	}
}
Output:
Result is 28.26
Result is 25.12

-------------------------------------------------------------------
Q. Is method overriding beneficial or not?

Answer:
Some time is beneficial and some time not it is dependent on requirement of project 
-----------------------------------------------------------------
Q. How can we avoid method overriding or What is the goal of the final method ?

We can avoid method overriding by declaring the parent class method as final.

A final method cannot be overridden, so the child class cannot modify the logic of the parent class method.

👉 The main goal of a final method is to protect the parent class logic from being changed by child classes.

Class A
{
    final void show()
    {
        System.out.println("I am show in A");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("I am show in B");
    }
}
public class InhConsApp
{
    public static void main(String x[])
    {
        B b1 = new B();
        b1.show();
    }
}

output:
show() in B cannot override show() in A
overridden method is final
---------------------------------------------------------------
❓ Q. What is a Final Class?

    A final class is a class that cannot be inherited.
    No other class can extend a final class.
    Final class has no child class.

🔹 Purpose / Goal
    To create immutable classes
    Immutable class → its state/value cannot be changed once assigned
    To provide security
    Prevents modification by inheritance
    To ensure consistency
    Useful when you want stable behavior that cannot be overridden

If we think about JAVA API String class is final class so in java string is immutable class 

final class A
{
    void show()
    {
        System.out.println("I am show method");
    }
}
class B extend A
{

}
public class FCAPP
{
    public static void main(String x[])
    {
        B b1 = new B();
        b1.show();
    }
}

output
❌ Compile-time Errors You’ll Get
cannot inherit from final A
cannot find symbol: extend


✅ Option 1: If you WANT inheritance → remove final
✅ Option 2: If class MUST be final → no inheritance  allowed

Note: final class is recommended in two cases 
    1.When we avoid inheritance 
    2.When developer want to create immutable classes in  JAVA
---------------------------------------------------------
Steps to create immutable class in java 
✅ Steps to Create an Immutable Class in Java

An immutable class is a class whose objects cannot be modified after creation.

🔹 Step 1: Declare the class as final

    This prevents inheritance, so no subclass can change the behavior.

    final class Employee
    {
    }

🔹 Step 2: Make all fields private and final

    private → fields cannot be accessed directly
    final → fields cannot be changed once initialized

    final class Employee
    {
        private final int id;
        private final String name;
    }

🔹 Step 3: Do NOT provide setter methods

    Setters allow modification, which breaks immutability.
    ❌ No setId()
    ❌ No setName()

🔹 Step 4: Initialize all fields using a constructor

    All values must be assigned only once, during object creation.

    final class Employee
    {
        private final int id;
        private final String name;

        public Employee(int id, String name)
        {
            this.id = id;
            this.name = name;
        }
    }

🔹 Step 5: Provide only getter methods

    Getters allow read-only access to data.

    final class Employee
    {
        private final int id;
        private final String name;

        public Employee(int id, String name)
        {
            this.id = id;
            this.name = name;
        }

        public int getId()
        {
            return id;
        }

        public String getName()
        {
            return name;
        }
    }

Q. What is the difference between final method and final class?
________________________________________________________
| Aspect                | **final method**                                             | **final class**                                       |
| --------------------- | ------------------------------------------------------------ | ----------------------------------------------------- |
| Meaning               | A method declared with `final` cannot be **overridden**      | A class declared with `final` cannot be **inherited** |
| Purpose               | To prevent **method overriding**                             | To prevent **class inheritance**                      |
| Effect on inheritance | Class can be inherited, but the final method stays unchanged | No subclass can be created at all                     |
| Overriding            | ❌ Not allowed                                               | ❌ Not applicable (no child class)                     |
| Use case              | When you want to fix the behavior of a specific method       | When you want to stop extending the class completely  |
class                  |


Q. What is the difference between static and final methods?

Static Method vs Final Method in Java
🔹 Static Method
    A static method belongs to the class, not to the object.
    Memory for a static method is allocated at class loading time, before any object of the class is created.
    A static method can only access static variables and static methods directly.
    It cannot access instance variables directly because instance variables belong to objects.

Static Method & Overriding
    Static methods cannot be overridden.
    If a child class defines a static method with the same signature as the parent class, it is called method hiding, not method overriding.
    There is no compile-time error, but runtime polymorphism does not work for static methods.
    ✅ This is why static methods are said to support method hiding, not overriding.

🔹 Final Method
    A final method is used to prevent method overriding.
    A final method cannot be overridden in the child class.
    If we try to override a final method, we get a compile-time error.
    A final method can be:
        Static variables
        Instance variables
        (if the final method itself is not static)

| Aspect            | **static method**                              | **final method**                            |
| ----------------- | ---------------------------------------------- | ------------------------------------------- |
| Belongs to        | Class                                          | Object (instance)                           |
| Memory allocation | Memory allocated at **class loading time**     | Memory allocated when **object is created** |
| Overriding        | ❌ Cannot be overridden (method hiding happens) | ❌ Cannot be overridden                      |
| Polymorphism      | ❌ Compile-time binding                         | ✔ Runtime binding (but not overridden)      |
| Inheritance       | Can be inherited                               | Can be inherited                            |
| Main purpose      | Common logic shared by all objects             | To prevent method overriding                |
| Access            | Called using class name                        | Called using object reference               |


 class A
 {
    static void show()
    {
    }
 }
 class B extend A
 {
    static void show()
    {
    }
 }

 Note:it look like as overriding but it is method hiding concept and no compile time error

 class A
 {
    final void show()
    {
    }
 }
 class B extends A
 {
    void show()
    {
    }
 }

 NOTE: we get compile time error because we try to override show() in child class B.

 class A
 {
    static int m;
    int n;
    final void show()
    {
        System.out.println("M is "+m+"\t N is"+n);
    }
 }

 Note: if we think about above code ther is no compile time error because final non static method can allow static as well as instance variable in his block


 class A
 {
    static int m;
    int n;

    static void show()
    {
        System.out.println("M is "+m+"\t N is "+n)
    }
 }
 Note: you can use static and final keyword at same time with variable as well as method also 
 ------------------------------------------------------------------------------
 Difference Between static and final keywords in Java

| Aspect             | **static keywords**                        | **final keywords**                          |
| ------------------ | ----- ------------------------------------- | ------------------------------------------- |
| Meaning            | Belongs to the **class**                   | Makes something **constant / fixed**        | 
| Purpose            | To share one copy among all objects        | To prevent modification                     |
| Applies to         | Variables, methods, blocks, nested classes | Variables, methods, classes                 |
| Memory             | Allocated at **class loading time**        | Allocated once and cannot be changed        |
| Inheritance effect | Static members are inherited (with rules)  | Final restricts inheritance or modification |
| Polymorphism       | Supports **method hiding**                 | Prevents overriding / inheritance           |
-------------------------------------------------------------------------------------------
Q. Can we override a static method?

❌ No, static methods cannot be overridden.

✔️ If a child class defines a static method with the same name and same parameters as a static method in the parent class, then method hiding occurs — not overriding.

Why static methods cannot be overridden?
    Overriding depends on runtime polymorphism
    Static methods are bound at compile time
    Static methods belong to the class, not to objects
 So Java does not support overriding for static methods.
---------------------------------------------------------------------------------
Q. What is method hiding?

What actually happens? 
    ✔️ Method Hiding
    Parent class static method is hidden by child class static method
    Method call depends on reference type, not object type

Example (method hiding)
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
        p.show();   // Parent show (method hiding)
    }
}

output :
Parent show

Note:
If we think about the above code, it indicates method hiding because we have a parent class reference, and the logic executed belongs to the parent class.

This happens because static methods cannot be overridden. When a static method in the child class has the same signature as one in the parent class, it does not override the method—it hides it.

Method selection for static methods is done at compile time based on the reference type, not the object type.
Therefore, the parent class method is called, and this behavior is known as method hiding.

💡 Key Point (easy to remember):

Instance method → Runtime → Method Overriding
Static method → Compile time → Method Hiding
----------------------------------------------
example (method overriding)
class Parent 
{
    void show() 
    {
        System.out.println("Parent show");
    }
}

class Child extends Parent 
{
    void show() 
    {
        System.out.println("Child show");
    }
}

public class Test 
{
    public static void main(String[] args) 
    {
        Parent p = new Child();
        p.show();   // Parent show (method overriding)
    }
}

output:
Child show

Note:
This code indicates the implementation of method overriding because we have a parent class reference pointing to a child class object.
When we call the overridden method using the parent reference, the child class implementation is executed at runtime.
This means the overridden logic of the child class is called, which is known as method overriding (runtime polymorphism).

----------------------------------------------
Q. What is Abstract Class & Abstract Method?

Abstract Class:
    An abstract class is a class whose object cannot be created.

    It is used to achieve partial abstraction in Java.
    An abstract class can contain:
        Abstract methods (without logic)
        Concrete methods (with logic)
        Instance variables and constructors
    To declare an abstract class, we use the abstract keyword.

Abstract Method:
    An abstract method is a method that does not have a body (logic).
    It only contains the method declaration and ends with a semicolon.
    The child class must override the abstract method and provide its implementation.

---------------------------------------------
abstrct class A
{
}
public class MApplication
{
    public staic void main(String x[])
    {
        A a1 = new a();
    }
}
output:
A is abstract ; cannot be istantiated

Note:
❌ You cannot create an object of an abstract class
---------------------------------------------
abstract class A
{
    abstract void show()
    {

    }
    public class MApllication
    {
        public staic void main(String x[])
        {
            
        }
    }
}

output:
An abstract method canNOT have a body.

Note:
We get a compile-time error because we are trying to write the definition (body) of an abstract method, which is not allowed in Java.

An abstract method must contain only the declaration, not the implementation.
Its body is provided by the child class.
--------------------------------------------
Q. What is the purpose of abstract class and abstract methods?

To achieve abstraction 
To achieve dynamic polymorphism 
To achieve loose coupling 

---------------------------------------------
Q. What is Abstraction?

Abstraction means hiding implementation details from the end user at the design level and showing only the essential features.

The end user knows what to do, but does not know how it is done internally.

Goal of Abstraction

    To hide implementation details from the end user at the design level
    To expose only functionality, not internal logic
    To support future flexibility in implementation

When Abstraction is Recommended
Abstraction is recommended when:
    The developer knows what to do
    But does not know how to do it yet
    The implementation will be decided later based on requirements

How Abstraction is Achieved in Java
Abstraction is practically achieved using:
    Abstract classes
    Abstract methods

An abstract method acts as a template/prototype:
    The developer only declares the method
    The logic is written later in the child class
    This is done using method overriding

Real-Time Example (HR Management System)
Consider an HR Management System in a hiring portal.

The goal is to:
    Generate requirements
    Post jobs
    Hire suitable candidates

When hiring a candidate:
    The candidate must have skills
    But the type of skill cannot be predicted
    It depends on the job requirement or position

So here:
    What to do → Acquire skill
    How to do → Depends on job requirement

👉 Therefore, skill is an example of abstraction.

Conclusion

Abstraction focuses on what to do, not how to do, and in Java, it is implemented using abstract classes, abstract methods, and dynamic polymorphism (method overriding).

example:
Example : abstraction and dynamic polymorphism using abstract class 

abstract class Employee 
{
    abstract void skill(); // abstraction
}

class Developer extends Employee 
{
    // abstraction implemented using method overriding
    void skill()
    {
        System.out.println("Need good coding + communication + logic");
    }
}

class Cook extends Employee 
{
    void skill() 
    {
        System.out.println("Need cooking skill");
    }
}

public class AbsApplication 
{
    public static void main(String[] args) 
    {

        Employee e = new Developer();  // Dynamic polymorphism (upcasting)
        e.skill();

        e = new Cook();                // Dynamic polymorphism
        e.skill();
    }
}

🔥 Output
Need good coding + communication + logic
Need cooking skill
------------------------------------------------------------------------
Example of loose coupling using abstract class and abstract methods

abstract class Employee 
{
    abstract void skill(); // abstraction
}

class Developer extends Employee 
{
    // abstraction implementation using overriding
    void skill() 
    {
        System.out.println("Need good coding + communication + logic");
    }
}

class Cook extends Employee 
{
    void skill() 
    {
        System.out.println("Need cooking skill");
    }
}

class Hire 
{
    void hireEmployee(Employee e) //4️⃣ Loose Coupling (Best Practice)
    {
        e.skill(); // runtime polymorphism
    }
}

public class AbsApplication 
{
    public static void main(String[] args) 
    {

        Hire h = new Hire();

        Employee e = new Developer();
        h.hireEmployee(e); // behaves as Developer

        e = new Cook();
        h.hireEmployee(e); // behaves as Cook
    }
}

Output
Need good coding + communication + logic
Need cooking skill

------------------------------------------------------------------------
Q1. Can we create an object of an abstract class?
    ❌ No, we cannot create an object of an abstract class.
    If we try to create an object of an abstract class, we get a compile-time error
------------------------------------------------------------------------
Q2. Why can’t we create an object of an abstract class?

An abstract class can contain:
    Abstract methods (without body)
    Non-abstract methods (with body)
An abstract method does not have a method body (logic).

If Java allowed us to create an object of an abstract class, then:[]
    We could call an abstract method using that object
    But abstract methods do not have implementations
    A method cannot be executed without a definition

👉 To avoid this situation, Java does not allow object creation of an abstract class.

Abstract methods must be overridden in a subclass, and only then can they be executed through the subclass object.

abstract class A
{
    abstract void show(); //abstract method
    void display() //non abstract method
    {
        
    }
}
public class AbsApp
{
    public static void main(String x[])
    {
        A a1 = new A();
        a1.display();
        a1.show();
    }
}

output
A a1 = new A();   // ❌ Compile-time error
A is abstract → object creation is not allowed.

------------------------------------------------------------------------------
Q3. Can we declare abstract methods in a non-abstract class?

    ❌ No, we cannot declare an abstract method in a non-abstract class.
    If we try to do so, we get a compile-time error.

Why?
    A non-abstract class can create objects
    Using that object, there is a possibility to call all its methods
    An abstract method has no method body (implementation)
    A method cannot be executed without implementation

👉 To avoid calling a method without a definition, Java does not allow abstract methods inside non-abstract classes.

Therefore:

If a class contains at least one abstract method, the class itself must be declared abstract

class T 
{
    abstract void show();
}

public class TestApp 
{
    public static void main(String[] args) 
    {
        // Cannot create object of abstract class
    }
}

output:
error: T is not abstract and does not override abstract method show() in T
class T
------------------------------------------------------------------------------
Q4. Can we define non-abstract methods in an abstract class?

✅ Yes, we can define non-abstract methods in an abstract class.

Explanation
An abstract class can contain:
    Abstract methods (without body)
    Non-abstract methods (with implementation)

When another class inherits an abstract class:
    It must implement all abstract methods
    It automatically inherits non-abstract methods
This allows code reuse and partial abstraction.

⚠️ Important Correction (Interview Point)
    A class that extends an abstract class and implements all abstract methods is called a concrete class,
    NOT an interface implementer class.

abstract class T 
{
    abstract void show();   // abstract method

    void display()
    {        // non-abstract method
        // method body
    }
}
public class TNApplication
{
    public static void main (String x[])
    {

    }
}
------------------------------------------------------------------------
Q5. Can we declare a constructor in an abstract class?

✅ Yes, we can declare a constructor in an abstract class.

Explanation
    Even though we cannot create objects of an abstract class,
    Its constructor is still executed when:
        A child class object is created

👉 The constructor of an abstract class is used to:
    Initialize common variables
    Perform setup logic for subclasses

example

abstract class T
{
    T()   // constructor name = class name
    {
        System.out.println("I am abstract class constructor");
    }
}

class B extends T
{
    B()
    {
        System.out.println("I am child class constructor");
    }
}

public class TNApplication
{
    public static void main(String x[])
    {
        B b = new B();
    }
}

✅ Output
I am abstract class constructor
I am child class constructor
----------------------------------------------
Q6. What is the purpose of an abstract class constructor if we do not create its objects?

Abstract class constructor normally call when we create object of its child class 
And the purpose of abstract class constructor is initialize members or variables declared within abstract class.

example

abstract class Circle
{
    protected float PI, radius;

    Circle()
    {
        PI = 3.14f;
    }

    void setRadius(float radius)
    {
        this.radius = radius;
    }
    abstract float getResult();
}

class Area extends Circle
{
    float getResult()
    {
        return PI * radius * radius;
    }
}

class Cirm extends Circle
{
    float getResult()
    {
        return 2 * PI * radius;
    }
}

public class TNApplication
{
    public static void main(String x[])
    {
        Area a = new Area();
        a.setRadius(3.0f);
        float aresult = a.getResult();

        Cirm cm = new Cirm();
        cm.setRadius(4.0f);
        float cmresult = cm.getResult();

        System.out.println("Area of circle is " + aresult);
        System.out.println("Circumference of circle is " + cmresult);
    }
}

✅ Output
Area of circle is 28.26
Circumference of circle is 25.12
----------------------------------------------
Q7. Can we declare abstract methods as private? Explain with reason.
 
❌ No, we cannot declare an abstract method as private.
Reason:
An abstract method must be overri dden in a child (sub) class.
Method overriding requires inheritance.
But a private method does NOT participate in inheritance (it is accessible only within the same class).
Since a private method cannot be inherited or overridden, it cannot be abstract.
👉 Therefore, declaring an abstract method as private violates the purpose of abstraction.

abstract class T
{
    private abstract void show();
}
public class PTApplication
{
    public static void main(String x[])
    {
    }
}

output
🔴 Compile-Time Error
Illegal combination of modifiers: abstract and private
----------------------------------------------
Q8. Can we declare abstract methods as static? Explain with reason.

❌ No, we cannot declare abstract methods as static.
If we try to do so, Java gives a compile-time error.

Reasons:
    Abstract method has no body
        1 An abstract method only provides a method declaration, not a definition.
        2 But a static method must have a complete definition because it belongs to the class itself.
        3 Hence, abstract and static contradict each other.

    Abstract methods are designed for overriding
        1 Abstract methods must be overridden in a subclass.
        2 Static methods cannot be overridden; they only support method hiding.
        3 Therefore, a static method cannot fulfill the requirement of an abstract method.

    Dynamic polymorphism is not supported by static methods
        1 Abstract methods are mainly used to achieve abstraction and dynamic polymorphism.
        2 Static methods are resolved at compile time and support only compile-time binding.
        3 So static methods cannot participate in dynamic polymorphism.

    Opposite behavior
        1 abstract → depends on subclass implementation (runtime behavior)
        2 static → fixed at class level (compile-time behavior)
        3 Because of this opposite nature, they cannot be used together.

abstract class T
{
  static abstract void show();  
}
public class PTApplication
    {
        public static void main(String[] x)
        {
        }
    }
output:
❌ Compiler error (typical)
Illegal combination of modifiers: abstract and static
---------------------------------------------
Q9. Can we declare an abstract method as final?

    ❌ No, we cannot declare an abstract method as final.

    Reason
        1 An abstract method must be overridden in the child class. 
        2 A final method cannot be overridden.
        3 Since their purposes are opposite, Java does not allow using abstract and final together.

    👉 If we try to do this, we get a compile-time error.

abstract class T
{
    final abstract void show();
}
public class PTApplication
{
    public static void main(String x[])
    {
    }
}

output
Compile-time error (typical)
Illegal combination of modifiers: abstract and final
--------------------------------------------
Q10. Can we create references of an abstract class? Why do we use it?

✅ Yes, we can create a reference of an abstract class,
❌ but we cannot create an object of an abstract class.

Why can we create an abstract class reference?

Using upcasting, an abstract class reference can point to an object of its child class.
--------------------------------------------
example of dynamic polymorphism using abstrct class referance

abstract class Circle
{
    protected float Pi, radius;

    Circle()
    {
        Pi = 3.14f;
    }

    void setRadius(float radius)
    {
        this.radius = radius;
    }

    abstract float getResult();
}

// Child class for Area
class Area extends Circle
{
    float getResult()
    {
        return Pi * radius * radius;
    }
}

// Child class for Circumference
class Cirm extends Circle
{
    float getResult()
    {
        return 2 * Pi * radius;
    }
}

public class TNApplication
{
    public static void main(String[] x)
    {
        Circle cir; // abstract class reference

        cir = new Area();   // upcasting
        cir.setRadius(3.0f);
        System.out.println("Area is " + cir.getResult());

        cir = new Cirm();   // upcasting
        cir.setRadius(4.0f);
        System.out.println("Circumference is " + cir.getResult());
    }
}

🎯 Output
Area is 28.26
Circumference is 25.12
----------------------------------------------
Q11. Is it true that if an abstract class contains more than one abstract method, then all methods must be overridden in the child class?

✅ Yes, it is true — with a condition.

✅ Correct rule

If a concrete (non-abstract) child class extends an abstract class,
    👉 it must override all abstract methods of the parent abstract class. Using an abstract class reference allows dynamic polymorphism and loose coupling.

If it does not override all abstract methods,
    👉 the child class must be declared abstract, otherwise a compile-time error occurs.

❌ Small correction to your statement

“define as blank definition of that method”

🔧 This is not correct.
You cannot leave an abstract method blank. You must provide a proper method body, even if it is empty { }.


Example
abstract class T
{
    abstract void show();
    abstract void display();
    abstract void test();
}

class T1 extends T
{
    void show()
    {
        System.out.println("I need show method from T");
    }
    void display() { }
    void test() { }
}

class T2 extends T
{
    void display()
    {
        System.out.println("I need display method from T");
    }
    void show() { }
    void test() { }
}

public class PTApplication
{
    public static void main(String[] x)
    {
        T t;

        t = new T1();
        t.show();

        t = new T2();
        t.display();
    }
}

🎯 Output
I need show method from T
I need display method from T
---------------------------------------------
NOTE
📌 Limitation of Abstract Class & Abstract Methods

Suppose we have an abstract class A with five abstract methods:

abstract class A
{
    abstract void s1();
    abstract void s2();
    abstract void s3();
    abstract void s4();
    abstract void s5();
}

Now assume we have five child classes: B, C, D, E, F

    Class B needs only s1()
    Class C needs only s2()
    Class D needs only s3()
    Class E needs only s4()
    Class F needs only s5()

❌ Problem (Limitation)

Because each child class is concrete, it must override all 5 abstract methods.
So:

    In class B → s1() has logic, s2–s5() are empty
    In class C → s2() has logic, others are empty
    … and so on

👉 Each class writes 4 empty methods.

🔢 Total methods written
    Required logic methods = 5
    Blank overridden methods = 20
    Total overridden methods = 25
This creates a lot of unnecessary code.

⚠️ This causes Boilerplate Code
🧠 Boilerplate Code means:
    Code that is part of the program but does not contain any business logic and exists only to satisfy language rules.
Here, empty overridden methods are boilerplate, not logic.

----------------------------------------------
Q12. What is an Adapter Class and why do we use it?
✅ Definition

An adapter class is an intermediate class that extends an abstract class or implements an interface and provides empty (default) implementations for all its abstract methods.

✅ Why do we use an Adapter Class?
    To avoid overriding unnecessary methods in every child class
    To reduce boilerplate code
    To allow child classes to override only the methods they need

🧠 How it works
    Abstract class / Interface has many abstract methods
    Adapter class overrides all of them with blank definitions
    Concrete child class extends adapter class
    Child class implements only required methods

Example with source code 

abstract class T
{
    abstract void show();
    abstract void display();
    abstract void test();
}
abstract class D extends T
{
    void show() { }
    void display() { }
    void test() { }
}

class T1 extends D
{
    void show()
    {
        System.out.println("I need show method from T");
    }
}

class T2 extends D
{
    void display()
    {
        System.out.println("I need display method from T");
    }
}

public class PTApplication
{
    public static void main(String[] x)
    {
        T1 t1 = new T1();
        t1.show();

        T2 t2 = new T2();
        t2.display();
    }
}
----------------------------------------------
Q13. Can we inherit a non-abstract class in an abstract class?

Yes, we can inherit a non-abstract class in an abstract class.

An abstract class can extend a non-abstract (concrete) class because an abstract class is allowed to contain both abstract and non-abstract methods.
When an abstract class inherits a  non-abstract class, it automatically gets all the concrete methods of the parent class and may also declare its own abstract methods.

So, inheriting a non-abstract class into an abstract class is completely valid in Java.

Exapmle
class X 
{
    void demo() 
    {
        System.out.println("Demo method from class X");
    }
}
abstract class T extends X 
{
    abstract void show();
    abstract void display();
    abstract void test();
}
-----------------------------------------
Q14. Can we use abstract classes without inheritance? How?

    Yes, we can use abstract classes without creating a named subclass.
    This is possible using an anonymous inner class.
    An anonymous inner class allows us to:
    Create an object of an abstract class
    Provide implementations of its abstract methods at the time of object creation
    Avoid writing a separate child class using extends

Example 1: Using a normal class

class A 
{
    void show() 
    {
        System.out.println("Parent class method");
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
        A obj = new A() 
        {   // anonymous inner class
            void show() 
            {
                System.out.println("Anonymous class method");
            }
        };
        obj.show();
    }
}

Output
Anonymous class method

Example 2: Using an abstract class
abstract class B 
{
    abstract void display();
}

public class Test 
{
    public static void main(String[] args) 
    {
        // anonymous inner class
        B obj = new B() 
        {
            void display() 
            {
                System.out.println("Implemented using anonymous class");
            }
        };
        obj.display();
    }
}

Output
Implemented using anonymous class
----------------------------------------------
Q15. What is an Anonymous Inner Class?

An anonymous inner class is a class without a name that is declared and instantiated at the same time.
It is mainly used to  override methods of a class or implement abstract classes or interfaces without creating a separate subclass.

The class definition is written immediately after the new keyword, and its object is created at runtime.

Correct Note

Anonymous inner class is recommended when we want to use an abstract class or interface immediately at runtime without creating a separate named subclass or implementation class.

Even though inheritance/implementation still happens internally, we do not explicitly write the child class.

General Syntax

ClassName reference = new ClassName() 
{   
    access specifier returntype functionname(datatype variablename)
    {
    // override methods here
    }
};

Example of anonymous inner class Using an abstract class

abstract class B 
{
    abstract void display();
}

public class Test 
{
    public static void main(String[] args) 
    {
        // anonymous inner class
        B obj = new B() 
        {
            void display() 
            {
                System.out.println("Implemented using anonymous class");
            }
        };
        obj.display();
    }
}

output:
I am abstract class method

------------------------------------------------------------------------
 
Difference between abstract, final, and static keywords

| Feature            | Abstract                                                    | Final                                 | Static                                               |
| ------------------ | ----------------------------------------------------------- | ------------------------------------- | ---------------------------------------------------- |
| Purpose            | Used to achieve **abstraction** (incomplete implementation) | Used to **restrict modification**     | Used to create **class-level members**               |
| Used with          | Class and methods                                           | Class, methods, and variables         | Variables, methods, blocks, and nested classes       |
| Inheritance        | Abstract class **must be inherited**                        | Final class **cannot be inherited**   | Static is not related to inheritance                 |
| Method behavior    | Abstract method **must be overridden**                      | Final method **cannot be overridden** | Static method **cannot be overridden** (only hidden) |
| Object requirement | Implemented through **subclass objects**                    | Can be used normally by objects       | Can be accessed **without object** using class name  |
| Implementation     | Abstract methods **have no body**                           | Final methods **have complete body**  | Static methods **have implementation**               |
| Variables          | Cannot be abstract                                          | Final variables become **constants**  | Static variables are **shared by all objects**       | 

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Difference between Abstract, Final, and Static Methods      

| Feature            | Abstract Method                     | Final Method             | Static Method                                     |
| ------------------ | ----------------------------------- | ------------------------ | ------------------------------------------------- |
| Keyword            | `abstract`                          | `final`                  | `static`                                          |
| Method body        | **No body** (only declaration)      | **Has body**             | **Has body**                                      |
| Overriding         | **Must be overridden** in subclass  | **Cannot be overridden** | **Cannot be overridden** (only method hiding)     |
| Object requirement | Called using **object of subclass** | Called using **object**  | Can be called **without object** using class name |
| Purpose            | Achieve **abstraction**             | **Restrict overriding**  | Provide **class-level functionality**             |
| Class requirement  | Must be inside **abstract class**   | Can be inside any class  | Can be inside any class                           |
 
-----------------------------------------------------------------------------

Q20. Difference between Abstract Class and Final Class
 
| Abstract Class                                    | Final Class                                                   |
| ------------------------------------------------- | ------------------------------------------------------------- |
| Declared using `abstract` keyword                 | Declared using `final` keyword                                |
| **Cannot create object directly**                 | Object **can be created**                                     |
| Must be **inherited** to provide implementation   | **Cannot be inherited**                                       |
| Used to achieve **abstraction**                   | Used to **prevent inheritance** (often for immutable classes) |
| Can contain **abstract and non-abstract methods** | Contains **only complete methods**                            |

----------------------------------------------

Q1. What is an Interface ?

An interface is a reference type in Java that contains abstract methods (by default public abstract) and constants (public static final). 
We cannot create cannot create its object and methods of interface are by default public abstract 

----------------------------------------------

Q2. Why use an interface if we already have an abstract class?

Interfaces are used because they provide:

Multiple inheritance
    A class can implement multiple interfaces but extend only one class.
Loose coupling  
    Programs depend on interface methods instead of specific class implementations.
Full abstraction (traditionally)
    Methods are abstract by default (except default/static methods in modern Java).
Dynamic polymorphism
    Interface references can refer to different implementing objects.

---------------------------------------------
Q3. How can we say the interface achieves 100% abstraction ?

Because all methods in an interface are abstract by default (until Java 7), meaning the interface contains only method declarations and no method implementation.
Therefore, it represents complete abstraction.

(Note: From Java 8 onward, interfaces can also contain default and static methods with implementation, so practically it is not always 100% abstraction anymore.)

interface Test
{
    void show(); //public abstract void show();
}

output:
javac Test.java
javap Test

interface Test
{
    public abstract void show();
}
---------------------------------------------
Q . Why does Java not support multiple inheritance using classes?
 
Java does not support multiple inheritance using classes because it can create the Diamond Problem (ambiguity).

Diamond Problem Explanation

When a class inherits from two parent classes and both parent classes contain a method with the same name, the child class does not know which parent method should be used, causing ambiguity.

Example (conceptual):
      A
     / \
    B   C
     \ /
      D

If both B and C override a method show() from A, then class D (child of B and C) will be confused about which show() method to call.

Because of this ambiguity, Java does not allow multiple inheritance with classes.

How Java solves this?

Java supports multiple inheritance using interfaces, because interfaces only declare methods (no ambiguity of implementation), and the implementing class provides the method implementation.

Short Interview Answer

Java does not support multiple inheritance with classes to avoid the Diamond Problem (method ambiguity). Instead, Java supports multiple inheritance through interfaces.
----------------------------------------------

Q. Where can we write the logic of interface methods?

Answer:
The logic of interface methods is written in the implementing class.
A class implements an interface using the implements keyword and overrides the interface methods to provide their implementation.

class classname implements interfacename1,interfacename2......interfacename..n
{
    override here methods of interface
}
---------------------------------------------
Example: interface method implementation with dynamic polymorphisum

interface Vehicle
{
    void engine();   // public abstract by default
}

class Bike implements Vehicle
{
    public void engine()
    {
        System.out.println("200 CC");
    }
}

class Car implements Vehicle
{
    public void engine()
    {
        System.out.println("1000 CC");
    }
}

public class VApplication
{
    public static void main(String x[])
    {
        Vehicle v = new Bike();   // dynamic polymorphism
        v.engine();

        v = new Car();            // dynamic polymorphism
        v.engine();
    }
}

Output
200 CC
1000 CC
----------------------------------------------
Important interview question on interface

Q1. Can we create an object of an interface?

No, we cannot create an object of an interface directly because an interface does not contain complete method implementations (it only declares methods). Since objects require fully defined behavior, Java does not allow direct instantiation of an interface, and attempting to do so results in a compile-time error.

interface Vehicle
{
    void engine();   // public abstract by default
}

public class VApplication
{
    public static void main(String x[])
    {
        Vehicle v = new Vehicle(); // ERROR: cannot instantiate interface
    }
}


This gives compile-time error because interfaces cannot be instantiated.

----------------------------------------------
Q2. Why can we not create an object of an abstract class?

An abstract class may contain abstract methods (methods without implementation).
If Java allowed creating objects of an abstract class, then it would be possible to call those abstract methods directly using that object, but abstract methods do not have a method body (implementation).
To avoid this situation, Java does not allow object creation of abstract classes.
Objects can only be created for concrete (non-abstract) subclasses that implement all abstract methods.

abstract class A
{
    abstract void show(); //abstract method
    void display()// non abstract
    {
    }
}
public class AbsAPP
{
    public static void main(String x[])
    {
        A a1 = new A();
        a1.display();
        a1.show();
    }
}

Your program has an error because abstract class object cannot be created.

----------------------------------------------------------

Q2. Can we write the logic of an interface method?

By default, interface methods are public and abstract, so they do not contain method logic. The implementation (logic) must be written in the class that implements the interface.

interface Vehicle
{
    void engine()
    {
        //error
    }
}
public class VApplication
{
    public static void main(String x[])
    {
        // Vehicle v = new Vehicale();
    }
}

NOTE: We get a compile-time error because interface methods are public abstract by default, and abstract methods cannot have method bodies.

However, from Jdk 1.8 onward, interfaces can also contain default methods and static methods, and these methods can have method logic.

interface Vehicle
{
    static void engine()
    {
    }
}
public class VApplication
{
    public static void main(String x[])
    {
        //Vehicle.engine();
    }
}

OUTPUT:
javac Vapplication.java
java VApplication

Note: possible to define Static method within interface from JDK 1.8 so there is no compile time error

 OR

 interface Vehicle
 {
    default void engine()
    {
    }
 }
 public class VApplication
 {
    public static void main(String x[])
    {
        //Vehicle v = new Vehicle(); 
    }
 }

OUTPUT:
javac Vapplication.java
java VApplication

Note: possible to define Default method in interface from JDK 1.8 so there is no compile time error

 -------------------------------------------------------
Q3. Are interface variables by default public static final?

Yes. All variables declared inside an interface are implicitly public, static, and final.
Because they are final (constants), they must be initialized at the time of declaration, otherwise a compile-time error occurs.

interface Circle
{
    float PI; //public static final PI
}
public class VApplication
{
    public static void main(String x[])
    {
    }
}

Note: Variables in an interface are public static final by default.
Since they are final, they must be initialized at the time of declaration.
Here PI is not initialized, so the compiler shows an error.

interface Circle
{
    float PI = 3.14f; // public static final PI
}

public class VAppliaction
{
    public static void main(String x[])
    {
        System.out.println(Circle.PI);
    }
}

Output
3.14
----------------------------------------------

Q4. Can we define a constructor inside an interface?

No, interfaces cannot contain constructors. If we try to declare a constructor inside an interface, we get a compile-time error.

Reason:
A constructor is used to initialize objects when a class object is created.
An interface cannot be instantiated (cannot create objects), therefore it does not require constructors, and Java does not allow constructors inside interfaces.

interface Circle
{
    float PI = 3.14f;
    Circle()   // ✔ constructor 
    {
    }
}
public class VApplication
{
    public static void main(String x[])
    {
        Circle c = new Circle();   // constructor called
        System.out.println(c.PI);
    }
}

Output
You also cannot create an object of an interface:

Circle c = new Circle();   // ❌ interface cannot be instantiated
---------------------------------------------
Q5. Can one interface inherit another interface? How?
Yes, one interface can inherit another interface using the extends keyword.
This is called interface-to-interface inheritance.

Important rules

| Inheritance Type      | Keyword Used |
| --------------------- | ------------ |
| Class → Class         | `extends`    |
| Interface → Interface | `extends`    |
| Class → Interface     | `implements` |
| Interface → Class     | Not allowed  |

interface A
{
    void show();
}

interface B extends A
{
    void display();
}

public class Test
{
    public static void main(String x[])
    {
        // program runs (no output)
    }
}

output:
javac VApplication.java
----------------------------------------------
Q6. Can we declare interface methods as private?

Before Java 9, declaring a private method in an interface produced a compile-time error.

Yes, from Java 9 onward, interfaces can contain private methods, but these methods are used only inside the interface (typically to support default or static methods). They cannot be accessed by implementing classes.

Example

interface A
{
    private void show();
}
public class VApplication
{
    public static void main(String x[])
    {
    }
}

output:
error: missing method body , or declare abstract
{
    private void show();
}

Reason 
Interface methods cannot be private because they must be overridden in implementing classes, and private methods cannot be overridden. 
Also, interface methods are by default public and abstract.
----------------------------------------------
Q7. Can we declare interface methods as protected?

No, we cannot declare interface methods as protected.
✅ Correct Reason (Improved Explanation)
Interface methods are implicitly public abstract.
protected means the method is accessible only within:
same package, or subclassesa
But interface methods are meant to be implemented by any class, possibly from any package.
Therefore, interface methods must be public, not protected.

interface ABC
{
    protected void show();//protected public abstract void show();
}
output
modifier protected not allowed here
----------------------------------------------
Q8. Can we declare abstract methods in an abstract class as protected?
✅ Correct Answer

Yes, we can declare abstract methods in an abstract class as protected.

✅ Correct Reason
Methods in a class or abstract class can have any valid access modifier:
private
default
protected
public

Since an abstract class is a normal class (with abstract methods), its abstract methods can be protected.

A protected abstract method can be overridden by subclasses.

abstract class ABC
{
    abstract void show();   // default    // default access
}

when we write like as
abstract class ABC
{
    protected abstract void show();   // protected abstract void show();
}
---------------------------------------------
Q9. Why can an abstract method be protected in an abstract class but not in an interface?

Correct Explanation

1. Interface case
Methods in an interface are implicitly public abstract.
Language rule: interface methods must be public (except private helper methods which are not abstract).

interface A
{
    protected void show();   // compile-time error
}
is illegal because protected is not allowed for interface abstract methods.
The compiler does not treat it as “protected public”; it simply reports modifier not allowed.


2. Abstract class case
An abstract class is a normal class.
Methods in classes can use any valid access modifier:
    default
    protected
    public

Therefore:
abstract class A
{
    protected abstract void show();   // valid
}
is allowed.

----------------------------------------------
Q10. Can we declare the interface method as final?
No we cannot declare interface method as final because interface method is abstract method and cannot declare abstract method as final because abstract method must be override and interface method cannot override so compiler will generate compile time error.

----------------------------------------------
Q10. Can we declare an interface method as final?
✅ Correct Answer:
No, we cannot declare an interface method as final.

✅ Correct Reason:
Interface methods are implicitly public abstract.
An abstract method must be overridden by the implementing class.
A final method cannot be overridden.
Therefore, a method cannot be both abstract and final at the same time.

interface ABC
{
    final void show();
}
output:
This will give a compile-time error.
----------------------------------------------
Q11. Is it true that if an interface contains more than one method, then all methods must be overridden in the implementing class?

Answer:
Yes. When a class implements an interface, it must override all abstract methods of that interface.
If the class does not override all methods, then the class must be declared abstract; otherwise, a compile-time error occurs.

If we do not want to implement all methods, we can create an adapter class (an abstract class that implements the interface and provides empty method bodies). Then child classes can override only the required methods.

Example 
abstract class T
{
    abstract void show();
    abstract void display();
    abstract void test();
}

class T1 extends T
{
    void show()
    {
        System.out.println("i need show the method from T");
    }

    void display()
    {
        // empty implementation
    }

    void test()
    {
        // empty implementation
    }
}

class T2 extends T
{
    void display()
    {
        System.out.println("i need display method from T");
    }

    void show()
    {
        // empty implementation
    }

    void test()
    {
        // empty implementation
    }
}

public class PTApplication
{
    public static void main(String x[])
    {
        T1 t1 = new T1();
        t1.show();

        T2 t2 = new T2();
        t2.display();
    }
}

Output
i need show the method from T
i need display method from T''

-----------------------------------------------------------------------
📘 Limitation of Abstract Class & Abstract Methods

Suppose we have an abstract class A with five abstract methods:

s1(), s2(), s3(), s4(), s5()

And five child classes:

B, C, D, E, F

Each child class needs only one specific method, but Java forces us to override all abstract methods.

🔴 Problem

Class B needs only s1()
→ must override s2(), s3(), s4(), s5() as empty methods

Class C needs only s2()
→ must override s1(), s3(), s4(), s5() as empty methods

Same for other classes

👉 So each class writes many unused methods.

❌ Result

Total methods overridden = 25

Useful methods = only 5

Remaining = 20 empty methods

This unnecessary code is called boilerplate code.

📦 What is Boilerplate Code?

Boilerplate code = Code written only to satisfy syntax/rules,
but contains no actual logic.

👉 It increases code size without adding functionality.

✅ Solution in OOP → Adapter Class

An Adapter Class provides default (empty) implementations
for all methods.

Then child classes override only the methods they need.

🧠 How Adapter Class Works
Step 1 — Create abstract class
abstract class A
{
    abstract void s1();
    abstract void s2();
    abstract void s3();
    abstract void s4();
    abstract void s5();
}
Step 2 — Create Adapter Class
abstract class AAdapter extends A
{
    void s1() {}
    void s2() {}
    void s3() {}
    void s4() {}
    void s5() {}
}

👉 All methods implemented as empty
👉 Still abstract (cannot create object)

Step 3 — Child class overrides only required method
class B extends AAdapter
{
    void s1()
    {
        System.out.println("Logic for s1()");
    }
}
🎯 Advantages

✅ Removes boilerplate code
✅ Improves readability
✅ Easy maintenance
✅ Override only required methods
✅ Cleaner design

-----------------------------------------------------------------------
✅ Q12. What is an Adapter Class and why is it used?
📘 Definition

An Adapter Class is an intermediate abstract class that provides empty (default) implementations for all abstract methods of another abstract class or interface.

It allows subclasses to override only the methods they actually need.

🧠 Why is it used?

It is used to:

✅ Avoid implementing unnecessary methods
✅ Reduce boilerplate code
✅ Improve readability and maintenance
✅ Provide selective method overriding
✅ Make code cleaner and easier to extend

abstract class T
{
    abstract void show();
    abstract void display();
    abstract void test();
}
//Adapter class
abstrct class D extend T
{
    void show(){}
    void display(){}
    void test(){}
}
//child class using only show()
class T1 extend D
{
    void show()
    {
        System.out.println("I need show method from T");
    }
}

//child class using only display()
class T2 extends D
{
    void display()
    {
        System.out.println("I need display method from T");
    }
}

public class PTApplication
{
    public staic void main(String x[])
    {
        T1 t1 = new T1();
        t1.show();

        T2 t2 = new T2();
        t2.display();
    }
}

🧾 Output
I need show method from T
I need display method from T

------------------------------------------------------------------------

✅ Q13. Can we inherit a non-abstract class in an abstract class?
📘 Answer

👉 Yes, an abstract class can inherit a non-abstract (concrete) class.

🧠 Why is it possible?

Because:

✅ An abstract class can contain both abstract and non-abstract methods
✅ A non-abstract class contains only concrete (implemented) methods
✅ When an abstract class extends a non-abstract class, it inherits all concrete methods
✅ The abstract class may also declare its own abstract methods

👉 Therefore, inheritance is completely valid.

📦 Explanation in Simple Words

A concrete class already has implementations.

An abstract class can:
    Use those existing methods
    Add new abstract methods
    Add new concrete methods
So there is no restriction.

✔️ Your Example — Correct
class X
{
    void demo()
    {
        System.out.println("Method from non-abstract class X");
    }
}

abstract class T extends X
{
    abstract void show();
    abstract void display();
    abstract void test();
}

🔍 What Happens Here?
    Class X → Non-abstract (concrete class)
    Class T → Abstract class
    T inherits method demo() from X
    T adds new abstract methods
👉 Any concrete subclass of T must implement:

show(), display(), test()
but can directly use demo() from X.

------------------------------------------------------------------------

✅ Q14. Can we use abstract classes without inheritance? How?
📘 Answer

👉 Yes, we can use an abstract class without creating a named subclass.

This is done using an Anonymous Inner Class, which creates an unnamed subclass at runtime and provides implementations for abstract methods.

------------------------------------------------------------------------
 What is an anonymous inner class?
🧠 Simple Explanation

👉 It is a special type of inner class
👉 It has no class name
👉 It is created after the new keyword
👉 It is used for one-time use
👉 We can write method logic inside it
👉 The object can directly use those methods at runtime

⭐ When is it used?

It is recommended when:

✅ You need a class only once
✅ You want to use an abstract class without creating a separate subclass
✅ You want to implement an interface without creating a separate implementation class
✅ To reduce extra code

Note: normally anonymous inner class recommended when want to use abstract class at runtime without inheritance or interface at runtime without implementation 

Syntex 
classname ref = new classname()
{
    access spacifier returntype functionname(datatype variablename)
    {
        write here your logics
    }
};

example

abstract class T
{
    abstract void show();
}
public class PTApplication
{
    public static void main(String x[])
    {
        T t1 = new T()
        {
            void show()
            {
                System.out.println("I am abstract class method");
            }
        }
    };
    t1.show();
}
----------------------------------------------------------------------
Q15. How we can solve diamond problem using interface or How we can achieve multiple inheritance using interface explain with an example?

🔷 What is the Diamond Problem?

The diamond problem occurs in multiple inheritance when a child class inherits from two parent classes that have the same method, causing ambiguity about which method to use.

      A
     / \
    B   C
     \ /
      D

If both B and C inherit from A and D inherits from B and C, then D may get confused about which method implementation to use.

👉 Java avoids this problem by not allowing multiple inheritance with classes.

🔷 How Java Solves It Using Interfaces

Java allows multiple inheritance using interfaces only, not classes.

✔ A class can implement multiple interfaces
✔ Interfaces contain abstract methods (no implementation)
✔ Child class must provide its own implementation
✔ No ambiguity occurs

👉 Therefore, the diamond problem does not arise.

🔷 Rules for Multiple Inheritance in Java

    A class can extend only ONE class
    A class can implement MANY interfaces
    All interface methods must be overridden (unless default methods exist)

🔷 Example: Multiple Inheritance Using Interfaces
Step 1: Create Interfaces
interface A 
{
    void show();
}

interface B 
{
    void show();
}

Both interfaces contain the same method.

Step 2: Implement Both Interfaces in One Class
class D implements A, B 
{
    public void show() 
    {
        System.out.println("Show method implemented in class D");
    }
}

✔ Class D provides ONE implementation
✔ No confusion exists

Step 3: Main Class
public class Test 
{
    public static void main(String[] args) 
    {
        D obj = new D();
        obj.show();
    }
}
✅ Output
Show method implemented in class D
🔷 Why There Is No Diamond Problem Here?

Because:
    Interfaces do not provide method implementation (by default)
    Child class defines the method itself
    Only one final version exists

👉 So ambiguity is removed.

🔷 Important Note (Java 8+)
    If interfaces contain default methods, conflict can occur.
    Then child class must override the method and choose implementation.

Example:

interface A {
    default void show() {
        System.out.println("A show");
    }
}

interface B {
    default void show() {
        System.out.println("B show");
    }
}

class D implements A, B {
    public void show() {
        System.out.println("D show");
    }
}
✅ Short Exam Definition

Java achieves multiple inheritance using interfaces.
When multiple interfaces contain the same method, the implementing class overrides the method, so no ambiguity occurs and the diamond problem is avoided.
-------------------------------------------------------
Q16. Is it possible to define a method within an interface?

Yes ✅, it is possible to define methods inside an interface.

Since Java 8 (JDK 1.8), interfaces can contain:

1️⃣ Abstract Methods (Default behavior before Java 8)

    By default, methods in an interface are public and abstract.
    The implementing class must override them.
    interface Test 
    {
        void show();   // public abstract by default
    }

2️⃣ Default Methods (Introduced in Java 8)

    Defined using the default keyword.
    They have a method body.
    No need to override in implementing class (optional).

interface T
{ 
    default void display() 
    {
        System.out.println("Default method in interface");
    }
}
class T1 implements T
{
}
public class TAPP
{
    public static void main(Strimg x[])
    {
        T1 t1 = new T1();
        t1.show();
    }
}

✔ Used to add new methods to interfaces without breaking existing implementations.

3️⃣ Static Methods (Introduced in Java 8)

    Defined using the static keyword.
    Must be called using the interface name.
    Cannot be overridden.

interface T 
{
    static void show() 
    {
        System.out.println("Static method in interface");
    }
}
public class TAPP
{
    public static void main(String x[])
    {
        T.show();
    }
}


// Calling
Test.message();

4️⃣ Private Methods (Introduced in Java 9)

    Used only inside the interface.
    Cannot be accessed by implementing classes.
    Helps to avoid code duplication inside default methods.

interface Test 
{
    private void helper() 
    {
        System.out.println("Private method");
    }
}

✅ Final Answer (Short Exam Format)

Yes, it is possible to define methods within an interface.
From Java 8 onwards, we can define:

    Abstract methods
    Default methods
    Static methods

    From Java 9 onwards, we can also define private methods.

----------------------------------------------------------

Q17. What is a Functional Interface in Java & Why is it Used ?

✅ Definition

A Functional Interface in Java is an interface that contains only one abstract method.

It may contain:
    Multiple default methods
    Multiple static methods
    But only one abstract method

✅ Annotation Used

@FunctionalInterface

This annotation ensures that the interface has only one abstract method.
If we add another abstract method, it gives a compile-time error.

✅ Example
    @FunctionalInterface
    interface MyInterface 
    {
        void show();   // Only one abstract method
    }
✅ Why Do We Use Functional Interfaces?

Functional interfaces are mainly used for:
---------------------------------------------------------

Q18. What is lambda expression and what is the purpose of lambda expression?

A Lambda Expression is a feature introduced in Java 8.
It is a short and simple way to write an anonymous function.
It is mainly used to implement a Functional Interface (an interface that contains only one abstract method).

1️⃣ Lambda Expressions

    They allow us to write short and clean code using lambda expressions.
    
    @FunctionInterface
    interface T
    {
        void show(); //public abstract void show();
    }

    public class TAPP
    {
        public static void mian(String x[])
        {
            T t1 = ()->System.out.println("I am show method of T");
            t1.show;
        }
    }
    Instead of writing a separate class, we can directly provide implementation using a lambda expression.

2️⃣ Used in Predefined Interfaces

    Java provides many built-in functional interfaces like:
    Runnabl
    Callable
    Comparator
    Predicate
    Function
    Consumer

    These are widely used in:
    Multithreading
    Stream API
    Collection sorting

    Note: we will discuss all interfaces and lambda expression in depth when we learn JDK 1.8 feature 

----------------------------------------------------------
✅ Q20. Can we override a protected method as public?
✔ Yes, it is possible.

If a parent class method is declared as protected, the child class can override it and change the access modifier to public.

🔹 Why is it allowed?
Because in method overriding:
    We can increase visibility (make access more accessible)
    But we cannot decrease visibility

Access Level Order (Low → High)
private < default < protected < public

So:
protected → public ✅ Allowed
public → protected ❌ Not Allowed
protected → private ❌ Not Allowed

class A
{
    protected void show()
    {
        System.out.println("I am a show method");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("I am show method in B");
    }
}
public class TAPP
{
    public static void main(Stirng x[])
    {
        B b1 = new B();
        b1.show();
    }
}

output:
I am show method in B
------------------------------------------------------
Q21. Can we override the default method as protected in child class?
Yes we can override default method as protected in child class because protected has higher priority than default so it is possible 

private < default < protected < public

class A
{
    void show()  //default access
    {
        System.out.println(" I am show method ");
    }
}
class B extends A
{
    protected void show();
    {  
        // overriding with wider access
        System.out.println("I am show method in B");
    }
}
public class TAPP
{
    public static void main(String x[])
    {
        B b1 = new B();
        b1.show();
    }
}
----------------------------------------------------------
Q22. Can we override protected to default?
No if parent method is protected then we cannot override it as default 

private < default < protected < public

class A
{
    protected void show()
    {
        System.out.println(" I am show method ");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("I am show method in B");
    }
}
public class TAPP
{
    public static void main(String x[])
    {
        B b1 = new B();
        b1.show();
    }
}
----------------------------------------------------------
Q23. Can we override public to protected methods?
No if parent method is public then child method must be public cannot override it as protected or default 

private < default < protected < public

class A
{
    public void show()
    {
        System.out.println("I am show method");
    }
}
class B extends A
{
    protectd void show()
    {
        System.out.println("I am show method in B");
    }
}
public class TAPP
{
    public staic void main(String x[])
    {
        B b1 = new B();
        b1.show();
    }
}

ERROR!
Main.java:15: error: show() in B cannot override show() in A
    void show()
         ^
  attempting to assign weaker access privileges; was protected
1 error

----------------------------------------------------------


