
# Classes and Objects in Java

## Contents

- [What Is a Class?](#q1-what-is-a-class)
- [Benefits of a Class](#q2-why-use-a-class-benefits-of-a-class)
- [Reusing a Class](#q3-how-to-reuse-a-class-more-than-once)
- [Objects](#q4-what-is-an-object-and-how-do-you-create-one-in-java)
- [Reference vs. Object](#q5-difference-between-a-reference-and-an-object)
- [Passing Parameters to Methods](#q6-how-to-pass-parameters-to-class-methods)
- [Passing Arrays to Methods](#q7-how-to-pass-an-array-as-a-parameter-to-a-class-method)
- [Variable Arguments](#q8-what-is-a-method-with-variable-arguments)
- [POJO Classes](#q9-what-is-a-pojo-class-and-why-use-one)
- [Arrays of Objects](#q10-what-is-an-array-of-objects)
- [Static Variables](#q11-what-is-a-static-variable)
- [Instance vs. Static Variables](#q12-difference-between-instance-and-static-variables)
- [Static Methods](#q13-what-is-a-static-method)
- [Instance vs. Static Methods](#q14-difference-between-instance-method-and-static-method)
- [Local Variables](#q15-what-is-a-local-variable)
- [Encapsulation](#q16-what-is-encapsulation-and-what-are-its-benefits)
- [Nested Classes](#q17-what-are-nested-classes-and-why-use-nested-classes)
- [Simple Nested Classes](#q18-what-is-a-simple-nested-class)
- [Static Nested Classes](#q19-what-is-a-static-nested-class)
- [Local Nested Classes](#q20-what-is-a-local-nested-class)

## Q1. What Is a Class?

### Definition 1

A class is a combination of Variables and Methods.
- **State:** variables.
- **Behavior:** methods (functions).

### Definition 2

A class is a collection of data members and member functions.

### Definition 3: Detailed / Technical

A class is a blueprint that may contain:

- Instance variables.
- Static (class-level) variables.
- Methods.
- Constructors.
- Instance initializer blocks.
- Static initializer blocks.
- Nested classes.

### Important Components of a Class

#### 1. Instance Variable

An instance variable is declared inside a class but outside any method and does not use the `static` keyword. Each object has its own copy.

```java
int id; // instance variable
```
 
#### 2. Class Variable (Static Variable)

A class variable is declared inside a class using the `static` keyword. It is shared among all objects of the class.

```java
static int count; // class variable
```

#### 3. Method

When a function is defined inside a class, it is called a method. Methods define the behavior of a class.

```java
void show() {
    System.out.println("Hello");
}
```

#### 4. Constructor

- Name is the same as the class name.
- Has no return type.
- Used to initialize objects.

```java
ClassName() {
    // constructor
}
```

#### 5. Instance Initializer Block

An instance initializer is a block defined inside a class without the `static` keyword. It executes every time an object is created, before the constructor.

```java
{
    System.out.println("Instance initializer");
}
```

#### 6. Static Initializer Block

A static initializer is a block defined using the `static` keyword. It executes only once when the class is loaded.

```java
static {
    System.out.println("Static initializer");
}
```

### Nested Class

A nested class is a class declared inside another class.
It is used to logically group related classes, improve encapsulation, and increase code readability.

```java
class ABC
{
    private int x;              // instance variable
    private static int y;       // class (static) variable

    // constructor
    public ABC()
    {
    }

    // instance method
    public void show()
    {
    }

    // instance initializer block
    {
        // instance initializer
    }

    // static initializer block
    static
    {
        // static initializer
    }

    // nested (inner) class
    class Mno
    {
        public void display()
        {
            System.out.println("This is a nested class");
        }
    }
}
```

### How to Declare a Class in Java

```java
access_specifier class ClassName
{
    access_specifier dataType variableName;
    access_specifier returnType methodName(dataType variableName)
    {
        // write your logic here
    }
}
```

Example:

```java
public class Student {
    private int id;

    public void show(int x) {
        System.out.println(x);
    }
}
```

## Q2. Why Use a Class? Benefits of a Class

### 1. Ability to Store Different Types of Data

A class can store different types of data in a single unit. It is therefore a complex or heterogeneous data structure.

For example:

```java
class Employee {
    private int id;
    private String name;
    private long salary;
    // methods
}
```

A class can store multiple data types together.

### 2. Reusability

A class is declared once and can be reused multiple times, reducing duplicated code. It can be reused by:

1. Creating objects of the class.
2. Using inheritance (discussed in later chapters).

### 3. Encapsulation

A class supports encapsulation, which means binding data and methods together and hiding data using access specifiers. This concept is discussed in detail in a later chapter.

### 4. Abstraction

A class also supports abstraction, which means showing only necessary details and hiding implementation. This concept is explained in the inheritance chapter.

## Q3. How to Reuse a Class More Than Once?

A class can be reused in two ways:

1. By creating objects of the class.
2. By using inheritance (discussed in later chapters).

## Q4. What Is an Object and How Do You Create One in Java?

### Definitions of an Object

1. An object is an instance of a class.
2. An object is a runtime entity because it is created during program execution.
3. An object is a block of memory where class data is stored. It can be considered a copy of a class because each non-static (instance) variable gets memory when an object is created.

### Additional Notes

- Memory is allocated separately for each object.
- Static variables do not get a separate copy for each object.
- Instance variables are stored as part of the object in heap memory.

### How to Create an Object in Java

To create an object in Java, use the `new` keyword.

**Syntax**

```java
ClassName ref = new ClassName();
```

**Example**

```java
Employee emp = new Employee();
```

- `Employee` is the class name.
- `emp` is the reference variable.
- `new Employee()` creates the object and allocates memory on the heap.

The reference variable emp stores the address of the object.

### Important Points

- Objects are created at runtime.
- Memory is allocated on the heap.
- Each object has its own copy of instance variables.
- Multiple objects can be created from the same class.

In **Java, there are 5 common ways to create an object.** 🚀

### 1. Using `new` Keyword (Most Common)

Creates an object using the `new` keyword.

```java
class Student {
    void display() {
        System.out.println("Hello Student");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
```

**Output:**

```text
Hello Student
```

---

### 2. Using `Class.forName()` (Reflection)

Creates an object using reflection.

```java
Class<?> c = Class.forName("Student");
Student s = (Student) c.getDeclaredConstructor().newInstance();
```

✅ Used in frameworks like Spring and JDBC.

---

### 3. Using `clone()` Method

Creates a copy of an existing object.

```java
class Student implements Cloneable 
{
    int id=10;

    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    } 
}
class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student();
        Student s2 = s1.clone(); 
        System.out.println(s2.id);
    }
}
```

---

### 4. Using Deserialization

Creates an object by reading it from a serialized file.

```java
ObjectInputStream in =
    new ObjectInputStream(new FileInputStream("student.ser"));

Student s = (Student) in.readObject();
```

✅ Used to restore objects from stored data.

---

### 5. Using a Factory Method

Creates an object through a method.

```java
class Student {
    static Student createStudent() {
        return new Student();
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = Student.createStudent();
    }
}
```

---

### 📌 Interview Short Answer

| No. | Method          | Description                        |
| --- | --------------- | ---------------------------------- |
| 1   | `new` Keyword   | Most common method                 |
| 2   | Reflection      | Using `Class.forName()`            |
| 3   | `clone()`       | Copies an existing object          |
| 4   | Deserialization | Restores an object                 |
| 5   | Factory Method  | Creates an object through a method |

**Interview Tip:** Java commonly teaches 5 ways to create objects, but the exact count depends on how object creation techniques are classified.



## Q5. Difference Between a Reference and an Object

| **Reference**                                                          | **Object**                                                                         |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| A reference is a **variable** that stores the **address of an object** | An object is a **block of memory** that stores **class data (instance variables)** |
| It does **not store actual data**                                      | It stores **actual data of the class**                                             |
| Created in **stack memory**                                            | Created in **heap memory**                                                         |
| Used to **access an object**                                           | Represents a **real instance of a class**                                          |
| Can be reassigned or set to `null`                                     | Exists until garbage collected                                                     |


The following examples show how references let us access and reuse objects.

> **Note:** Before answering, first see how to use a class in practice.

### Step 1: Declare a Class

```java
class Add {
}
```

### Step 2: Declare Variables Inside the Class

```java
import java.util.Scanner;

class Add {
    private int a, b;
    private Scanner xyz = new Scanner(System.in);
}
```

### Step 3: Define Methods Inside the Class

```java
class Add {
    private int a, b;
    private Scanner xyz = new Scanner(System.in);

    public void setValue() {
        System.out.println("Enter two values:");
        a = xyz.nextInt();
        b = xyz.nextInt();
    }
}
```

### Step 4: Create an Object of the Class

```java
public class ADDAPP {
    public static void main(String x[]) {
        Add ad = new Add();
    }
}
```

### Step 5: Use Class Variables and Methods Through the Object

```java
import java.util.Scanner;

class Add {
    private int a, b;
    private Scanner xyz = new Scanner(System.in);

    public void setValue() {
        System.out.println("Enter two values:");
        a = xyz.nextInt();
        b = xyz.nextInt();
    }

    public void showAdd() {
        System.out.println("Addition is: " + (a + b));
    }
}

public class ADDAPP {
    public static void main(String x[]) {
        Add ad = new Add();
        ad.setValue();
        ad.showAdd();
    }
}
```

### Example: Square Class

Create a `Square` class with two methods:

- `setNum()`: accepts a number.
- `getSquare()`: calculates and returns the square.

```java
import java.util.Scanner;

class Square {
    private int no;
    private Scanner xyz = new Scanner(System.in);

    public void setNum() {
        System.out.println("Enter number:");
        no = xyz.nextInt();
    }

    public int getSquare() {
        return no * no;
    }
}

public class SQApplication {
    public static void main(String x[]) {
        Square s1 = new Square();
        s1.setNum();
        int result = s1.getSquare();
        System.out.println("Square is " + result);
    }
}
```

**Output:**

```text
Enter number:
5
Square is 25
```

## Q6. How to Pass Parameters to Class Methods

Create a `Cube` class with these methods:

- `setValue(int x)`: accepts a number.
- `getCube()`: calculates and returns the cube.

```java
class Cube {
    void setValue(int n) {
    }

    int getCube() {
        return n * n * n;
    }
}

public class CubeApplication
{
    public static void main(String x[])
    {
        Cube c = new Cube();
        c.setValue(5);
        int result = c.getCube();
        System.out.println("Cube is " + result);
    }
}
```

### What Is the Problem?

The example contains two methods:

- `setValue(int n)` accepts a number as a parameter.
- `getCube()` tries to access `n`.

However, `n` is a parameter of `setValue(int n)`, so it is local to that method. A local variable cannot be accessed directly by another method. Since `getCube()` uses an undeclared `n`, the code produces a compile-time "cannot find symbol" error.

### How Can We Solve This Problem?

To access a value in another method, store it in a class variable:

To solve this type of error, we must not use the local variable directly in another method.
Instead, copy the value into a class variable:

1. An instance variable (non-static).
2. A static variable.

Instance and static variables are declared in the class, so the class methods can access them.

```java
class Cube
{
    int n;   // instance variable

    void setValue(int n)   // local variable
    {
        this.n = n;        // copy local variable into instance variable
    }

    int getCube()
    {
        return n * n * n;
    }
}

public class CubeApplication
{
    public static void main(String x[])
    {
        Cube c = new Cube();
        c.setValue(5);
        System.out.println("Cube is " + c.getCube());
    }
}
```

### Why This Works

- `n` is part of the object's state.
- All non-static methods can access it.
- This is the preferred approach for object-oriented programming.

### Solution 2: Using a Static Variable

```java
class Cube
{
    static int n;   // instance variable

    void setValue(int n)   // local variable
    {
        Cube.n = n;        // copy local variable into instance variable
    }

    int getCube()
    {
        return n * n * n;
    }
}

public class CubeApplication
{
    public static void main(String x[])
    {
        Cube c = new Cube();
        c.setValue(5);
        System.out.println("Cube is " + c.getCube());
    }
}
```

> **Key rule:** Copy a local variable into an instance or static variable to access it from other methods.

`Local variable` → copy into instance/static variable → access in other methods
## What Happens If We Do Not Use References with Objects?

If we do not use a reference with an object, then such an object is called an anonymous object (object without reference).

When an object is created without a reference, the JVM:

- Creates the object in heap memory.
- Allows it to be used only once.
- Makes it unreachable immediately after use.

If we create an object without a reference multiple times, the JVM will create a new object every time, meaning:

- A new memory block is allocated for each object.
- Each object has its own data.

Since there is no reference pointing to these objects, they become eligible for garbage collection after execution.

**Example:**

```java
new Cube().setValue(5);   // anonymous object
new Cube().setValue(10);  // another anonymous object
```

Two different objects are created, each with its own memory and data.

### Key Points

- An object without a reference is an anonymous object.
- It is used only once and cannot be reused.
- Each new object receives separate memory.
- It becomes eligible for garbage collection after use.

**Conclusion:** A reference holds the address of an object and lets us reuse that object.

### Can Multiple References Refer to the Same Object?

Yes, we can use more than one reference for a single object.

An object is created in the heap memory, and heap memory is shared, which means the same object can be accessed by multiple references.

When multiple references point to the same object:

- They refer to the same memory location.
- They share the same object state (data and variables).

### What Happens When the Object Changes?

If we modify the object’s content (state, variables, or data) using any one reference, then:

- The object's state changes.
- All references see the updated value.
- The previous value is overwritten.

This happens because references do not store data; they only point to the object.

```java
class Cube
{
    int no; // instance variable
    void setValue(int n)
    {
        no = n;
    }

    void getCube()
    {
        System.out.println("Cube is " + (no * no * no));
    }
}

public class CubeApplication
{
    public static void main(String x[])
    {
        Cube c = new Cube(); // object created
        c.setValue(5);

        Cube c1 = c;        // second reference to same object
        c1.setValue(10);    // object state changed

        c.getCube();        // accessed using first reference
    }
}
```

**Output:**

```text
Cube is 1000
```

### What Is Happening Internally?

```text
Cube c = new Cube();
→ One object is created in heap memory.

Cube c1 = c;
→ No new object is created.
→ c and c1 point to the same object.

c1.setValue(10);
→ Object state (no) becomes 10.
→ Previous value (5) is overwritten.

c.getCube();
→ Uses the same object, so the cube of 10 is printed.
```

## Q7. How to Pass an Array as a Parameter to a Class Method?
If we want to pass an array as a parameter to a class function, we pass the base address (reference) of the array to that function.

In Java, an array is an object, so when we pass an array to a method, its reference is passed, not a copy of elements. Using this reference, the method can access all array values.

### Example: Sum of Array Elements

Create a `Sum` class with two methods:

- `setValue(int arr[])` accepts an array as a parameter.
- `getSum()` calculates and returns the sum of the array elements.

```java
class Sum {
    int[] values;

    void setValue(int[] arr) {
        values = arr;
    }

    int getSum() {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }
}

public class ArrsumApplication {
    public static void main(String x[]) {
        int[] values = {10, 20, 30, 40, 50};

        Sum sum = new Sum();
        sum.setValue(values);
        System.out.println("Sum is " + sum.getSum());
    }
}
```

**Output:**

```text
Sum is 150
```

## Q8. What Is a Method with Variable Arguments?

A method with variable arguments (var-args) is a method that can accept zero or more arguments of the same type.

This concept is used when the number of parameters is not fixed (i.e., infinite or variable).
In Java, variable arguments are represented using three dots (...).

**Syntax:**

```java
returnType methodName(dataType... variableName)
```

```java
class Test
{
    void show(int... a)   // variable argument method
    {
        for(int x : a)
        {
            System.out.println(x);
        }
    }
}
public class VarArgDemo
{
    public static void main(String[] args)
    {
        Test t = new Test();
        t.show(10);
        t.show(10, 20, 30);
        t.show(1, 2, 3, 4, 5);
    }
}
```

**Output:**

```text
10
10
20
30
1
2
3
4
5
```

### Important Points

- Varargs are internally treated as an array.
- Only one varargs parameter is allowed per method.
- The varargs parameter must be the last parameter.
- Varargs can reduce the need for method overloading.

### Important Rules for Variable Arguments

#### 1. Position of the Ellipsis (`...`)

The ellipsis goes after the data type and before the variable name.

```java
void show(int... a); // Correct
void show(int a...); // Incorrect
```

#### 2. Only One Varargs Parameter Is Allowed

We cannot declare more than one varargs parameter in a method.

```java
void show(int... a, int... b); // Invalid
```

#### 3. Varargs Must Be the Last Parameter

If a method has regular parameters, the varargs parameter must come after them.

```java
void show(int x, int y, int... a); // Correct
void show(int... a, int x);       // Incorrect
```

### Example Demonstrating the Rules

```java
class Sum {
    void calSum(String name, int... x) {
        System.out.println("Name is " + name);
        int s = 0;
        for (int i = 0; i < x.length; i++) {
            s += x[i];
        }
        System.out.println("Sum of all value is = " + s);
    }
}

public class SumVarApplication {
    public static void main(String x[]) {
        Sum s = new Sum();
        s.calSum("Ram", 10, 20, 30, 40, 50);
    }
}
```

**Output:**

```text
Name is Ram
Sum of all value is = 150
```

> **Key point:** Variable arguments are internally treated as an array.

### Passing an Array to a Varargs Method

An array can be passed to a method that accepts varargs.

```java
class Sum {
    void calSum(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        System.out.println("Sum of all values is " + sum);
    }
}

public class SumVarApplication {
    public static void main(String x[]) {
        Sum s = new Sum();
        int[] values = {10, 20, 30, 40, 50};
        s.calSum(values);
    }
}
```

**Output:**

```text
Sum of all values is 150
```

```java
class Sum
{
    void calSum(int[]... x)   // var-args of int arrays
    {
        for(int i = 0; i < x.length; i++)
        {
            for(int j = 0; j < x[i].length; j++)
            {
                System.out.print(x[i][j] + " ");
            }
            System.out.println(); // new line after each array
        }
    }
}
public class SumVarApplication
{
    public static void main(String[] args)
    {
        Sum s = new Sum();
        s.calSum(
            new int[]{1, 2, 3},
            new int[]{4, 5, 6},
            new int[]{7, 8, 9}
        );
    }
}
```

**Output:**

```text
1 2 3 
4 5 6 
7 8 9 
```

## Q9. What Is a POJO Class and Why Use One?

### What Is a POJO Class?

### What Is a POJO Class?
  
POJO stands for Plain Old Java Object.
A POJO class is a simple Java class that is not dependent on any framework and is mainly used to store data.

A POJO class generally contains:

- Private data members (variables).
- Public getter and setter methods.
- Optional constructors.
- No framework-specific code or business logic.

### Why Use a POJO Class?

POJO classes are used to:

- Store data.
- Transfer data between application layers (Controller → Service → Repository).
- Pass objects as parameters between methods and classes.
- Maintain encapsulation, readability, and reusability.

### Important Points

- Declare variables as `private`.
- Make getter and setter methods `public`.
- Use setters to store data and getters to retrieve it.
- Avoid extending or implementing framework-specific classes or interfaces.
- Keep business logic outside the POJO.

### Example

```java
class Employee
{
    private int id;
    private String name;

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}

public class EmployeePOJOAPP
{
    public static void main(String[] x)
    {
        Employee emp = new Employee();

        emp.setId(1);
        emp.setName("Ram");

        String name = emp.getName();
        int id = emp.getId();

        System.out.println("Name is " + name + "\nId is " + id);
    }
}
```

**Output:**

```text
Name is Ram
Id is 1
```

### Why Use a POJO Class? Benefits

#### Why a POJO Class Is Used

When a method contains many parameters of different data types, passing values one by one is not a good approach.

It becomes difficult to remember:

- The number of parameters.
- The parameter order.
- The parameter data types.

To solve this problem, Java suggests using a POJO class.

A POJO class allows us to group related data into a single object and pass that object as one parameter.

#### Benefits of a POJO Class

- Reduces the number of method parameters.
- Improves code readability.
- Avoids confusion about parameter order.
- Makes it easy to add or remove fields.
- Supports data transfer between layers.
- Follows encapsulation principles.

### Example Without a POJO Class

```java
class Company
{
    String name;
    int id;
    String address;
    String qual;
    int expSal;
    String skill;

    void addNewEmployee(String name, int id, String address,
                        String qual, int expSal, String skill)
    {
        this.name = name;
        this.id = id;
        this.address = address;
        this.qual = qual;
        this.expSal = expSal;
        this.skill = skill;
    }

    void showData()
    {
        System.out.println("Name is " + name);
        System.out.println("Id is " + id);
        System.out.println("Address is " + address);
        System.out.println("Qualification " + qual);
        System.out.println("Expected Salary " + expSal);
        System.out.println("Skill Required " + skill);
    }
}
public class CompApplication
{  public static void main(String x[])
   { 
      Company  c = new Company();
      c.addNewEmployee("ram",1,"PUNE","BTECH",500000,"JDEV");
	  c.showData();
   }
}
```

#### Problems with This Approach

- The developer must remember the parameter sequence.
- The developer must pass all parameters.
- Parameters cannot be skipped.
- The code is difficult to maintain and modify.

### Example with a POJO Class

```java
class Employee
{
    private String name;
    private int id;
    private String address;
    private String qualification;
    private int expectedSalary;
    private String skill;

    // setters
    public void setName(String name) { this.name = name; }
    public void setId(int id) { this.id = id; }
    public void setAddress(String address) { this.address = address; }
    public void setQualification(String qualification) { this.qualification = qualification; }
    public void setExpectedSalary(int expectedSalary) { this.expectedSalary = expectedSalary; }
    public void setSkill(String skill) { this.skill = skill; }

    // getters
    public String getName() { return name; }
    public int getId() { return id; }
    public String getAddress() { return address; }
    public String getQualification() { return qualification; }
    public int getExpectedSalary() { return expectedSalary; }
    public String getSkill() { return skill; }
}
class Company
{
    void addNewEmployee(Employee e)
    {
        System.out.println("Name is " + e.getName());
        System.out.println("Id is " + e.getId());
        System.out.println("Address is " + e.getAddress());
        System.out.println("Qualification " + e.getQualification());
        System.out.println("Expected Salary " + e.getExpectedSalary()); 
        System.out.println("Skill Required " + e.getSkill());
    }
}
```

> **Conclusion:** A POJO class groups related data into one object so it can be passed as a single parameter, improving readability and maintainability while simplifying method calls.

## Q10. What Is an Array of Objects?

An array of objects is a concept in Java where multiple objects of the same class are stored using a single array reference.

Instead of creating many separate object variables, we use an array to manage multiple objects efficiently.

### Why Use an Array of Objects?

- Store data for multiple objects.
- Avoid creating many separate object variables.
- Iterate, search, and manage objects easily.
- Represent real-world collections such as students, employees, or products.

### How to Create an Array of Objects

1. Create an array of references: `Employee[] emp = new Employee[3];`
2. Create and assign objects: `emp[0] = new Employee();` (repeat for each element).
3. Set data in each object, for example: `emp[0].setId(1);` and `emp[0].setName("Ram");`.
4. Access each object in a loop:

   ```java
   for (int i = 0; i < emp.length; i++) {
       System.out.println(emp[i].getId() + " " + emp[i].getName());
   }
   ```

### Complete Example

```java
class Employee {
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class ArrayOfObjectsApp {
    public static void main(String[] args) {
        Employee[] emp = new Employee[3];

        emp[0] = new Employee();
        emp[1] = new Employee();
        emp[2] = new Employee();

        emp[0].setId(1);
        emp[0].setName("Ram");

        emp[1].setId(2);
        emp[1].setName("Shyam");

        emp[2].setId(3);
        emp[2].setName("Amit");

        for (int i = 0; i < emp.length; i++) {
            System.out.println("Id: " + emp[i].getId()
                    + ", Name: " + emp[i].getName());
        }
    }
}
```

**Output:**

```text
Id: 1, Name: Ram
Id: 2, Name: Shyam
Id: 3, Name: Amit
```

> **One-line answer:** An array of objects stores references to multiple objects of the same class under one variable name.

## Q11. What Is a Static Variable?

### Static Variable
A static variable is also called a class-level variable.

It is:

- Declared using the `static` keyword.
- Shared by all objects of the class.
- Created only once.
- Loaded when the class is loaded by the JVM.

Static variables are allocated memory at class loading time by the Class Loader, before any object is created.

They can be accessed using the class name (recommended) or an object reference (allowed, but not recommended).

Memory location: Static variables are stored in the Method Area (MetaSpace) of JVM memory.

```java
class ABC
{
    static int x;   // static (class-level) variable
    int y;          // instance (object-level) variable
}
public class ABCAPP
{
    public static void main(String x[])
    {
        ABC.x = 100;
        System.out.println("X = "+ABC.x);
        ABC a1 = new ABC();
        a1.y = 200;
        System.out.println("Y = "+a1.y);
        System.out.println("X = "+a1.x);
    }
}
```

**Output:**

```text
X = 100
Y = 200
X = 100
```

## Q12. Difference Between Instance and Static Variables

Based on your notes, the main differences are: 

| Point                  | Static Variable                                                     | Instance Variable                                                                                          |
| ---------------------- | ------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| **1. Object required** | Object is **not required** to access it.                            | Object is normally **required** to access it.                                                              |
| **2. Memory**          | Associated with the **class** and available before object creation. | Associated with the **object**, so it is created as part of the object.                                    |
| **3. Copy**            | **One common copy** is shared by all objects of the class.          | **Separate copy** is created for every object.                                                             |
| **4. Lifetime**        | Remains available while the class/application is running.           | Exists as long as its object exists; an unreachable object can later be removed by **Garbage Collection**. |
| **5. Default values**  | Gets Java's default value according to its data type.               | Gets Java's default value according to its data type.                                                      |

### Simple Example

```java
class Student {
    static String college = "ABC College"; // static variable
    int id;                                // instance variable
 
    Student(int id) {
        this.id = id;
    }
}

class Main {
    public static void main(String[] args) {

        Student s1 = new Student(101);
        Student s2 = new Student(102);
        

        System.out.println(Student.college);
        System.out.println(s1.id);
        System.out.println(s2.id);
    }
}
```

### Understand the difference

```text
Student
   |
   |---- static college = "ABC College"
   |       ↑
   |       |---- shared by s1
   |       |---- shared by s2
   |
   |---- s1 → id = 101
   |
   |---- s2 → id = 102
```

**Remember for interview:**

> **Static variable = one common copy for the class.**
> **Instance variable = separate copy for every object.** 

**Default values from your notes:**

* `int` → `0`
* `float` → `0.0f`
* `double` → `0.0`
* `long` → `0`
* `String` → `null`
* `boolean` → `false`
* `char` → blank
* `byte` → `0` 
## Q13. What Is a Static Method?

A **static method** is a method that is declared using the `static` keyword. 

### Important Points

1. **Declared using `static` keyword**

   ```java
   static void show() {
       System.out.println("Hello");
   }
   ```

2. **Can be called without creating an object**

   We can call it using the **class name**:

   ```java
   class Demo {
       static void show() {
           System.out.println("Hello");
       }
   }

   class Main {
       public static void main(String[] args) {
           Demo.show();
       }
   }
   ```

3. **Static method cannot directly access an instance variable**

   ```java
   class Demo {
       int x = 10;              // instance variable
       static int y = 20;       // static variable

       static void show() {
           // System.out.println(x);  // ❌ Cannot directly access
           System.out.println(y);    // ✅ Can access
       }
   }
   ```

### Easy Interview Answer

> **A static method is a method declared with the `static` keyword. It belongs to the class and can be called using the class name without creating an object. A static method cannot directly access instance variables.** 

**Remember:**

```text
Static method
     ↓
Belongs to class
     ↓
Object not required
     ↓
ClassName.method()
     ↓
Can directly access static members
```
## Q14. Difference between Instance Method and Static Method

Your notes give these **5 main differences**: 

| Point                  | Static Method                                                                           | Instance / Non-static Method                        |
| ---------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------- |
| **1. Calling**         | Can be called using the **class name**; an object is not required.                      | Normally called using an **object**.                |
| **2. Variables**       | Can directly access **static variables**. It cannot directly access instance variables. | Can access **both static and instance variables**.  |
| **3. Polymorphism**    | Supports **compile-time polymorphism**.                                                 | Supports **compile-time and runtime polymorphism**. |
| **4. Method behavior** | Supports **method hiding**.                                                             | Supports **method overriding**.                     |
| **5. Abstract**        | A static method **cannot be abstract**.                                                 | An instance method **can be abstract**.             |

### 1. Calling

```java
class Demo {

    static void staticMethod() {
        System.out.println("Static");
    }

    void instanceMethod() {
        System.out.println("Instance");
    }
}

class Main {
    public static void main(String[] args) {

        Demo.staticMethod();       // static method

        Demo d = new Demo();
        d.instanceMethod();       // instance method
    }
}
```

### 2. Variable access

```java
class Demo {

    static int a = 10;
    int b = 20;

    static void showStatic() {
        System.out.println(a);    // ✅
        // System.out.println(b); // ❌
    }

    void showInstance() {
        System.out.println(a);    // ✅
        System.out.println(b);    // ✅
    }
}
```

### 3 & 4. Polymorphism

**Static methods → method hiding**

```java
class Parent {
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child");
    }
}

class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
```

**Output:**

```text
Parent
```

**Instance methods → method overriding**

```java
class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child");
    }
}

class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}

```

**Output:**

```text
Child
```

### 5. Abstract

```java
abstract class Demo {

    abstract void show();        // ✅ instance method

    // static abstract void test(); // ❌ not allowed
}
```

## Q15. What Is a Local Variable?

A **local variable** is a variable declared **inside a method or block**. Its scope is limited to that method or block. 

### Example

```java
class Demo {

    void show() {
        int x = 10;   // local variable
        System.out.println(x);
    }
}
```

Here, `x` can be used only inside the `show()` method.

---

## Important Points about Local Variables

### 1. Cannot access outside its block

```java
void show() {
    int x = 10;
}

void display() {
    // System.out.println(x);  // ❌ Error
}
```

The local variable `x` is accessible only inside the block where it is declared. 

---

### 2. Local variable cannot be `static`

```java
void show() {
    // static int x = 10;  // ❌ Compile-time error
}
```

A local variable cannot be declared using the `static` keyword. 

### Why?

According to your notes:

| Point       | Local Variable                | Static Variable                               |
| ----------- | ----------------------------- | --------------------------------------------- |
| **Life**    | During execution of its block | During program execution                      |
| **Scope**   | Only inside its block         | Can be accessed according to its access level |
| **Storage** | Function/method stack         | Class-level storage                           |



---

### 3. Cannot use access specifiers

We cannot use `public`, `private`, or `protected` with a local variable.

```java
void show() {
    // private int x = 10;  // ❌
    // public int y = 20;   // ❌
}
```

Access specifiers are used with classes and their members, not local variables. 

---

### 4. Local variable must be initialized before use

Java does **not** provide a default value to a local variable.

```java
void show() {

    int x;

    // System.out.println(x); // ❌ Compile-time error

    x = 10;
    System.out.println(x);   // ✅
}
```

Instance and static variables receive default values, but local variables must be initialized before they are read. 

---

## 5. Local Variable and Instance Variable with Same Name

Consider:

```java
class Square {

    int x;

    void setValue(int x) {
        x = x;
    }

    void showSquare() {
        System.out.println(x * x);
    }
}
```

Here there are two `x` variables:

```text
int x              → instance variable
int x in setValue → local/parameter variable
```

Inside:

```java
x = x;
```

both `x` refer to the **local parameter**, so the instance variable does not receive the value.

Therefore, the instance variable remains its default value `0`. 

### Solution: use `this`

```java
class Square {

    int x;

    void setValue(int x) {
        this.x = x;
    }

    void showSquare() {
        System.out.println(x * x);
    }
}
```

Now:

```text
this.x → instance variable
x      → local variable / parameter
```

---

# Q. What is `this` reference?

`this` is a reference that points to the **current object**. In other words, the object that calls the current method is the current/working object. 

### Example

```java
class Student {

    int id;

    void setId(int id) {
        this.id = id;
    }
}
```

Here:

```text
this.id → instance variable
id      → local variable
```

### Two important uses from your notes

**1. When local and instance variable names are the same:**

```java
this.x = x;
```

**2. To refer to the current object's members.** 

---

### 6. Local variable memory

A local variable gets its memory when the **method/function is called** and is associated with the function's stack frame. 

### 7. Re-initialized on every method call

Every time the method is called, its local variables are created again.

```java
class Demo {

    void show() {
        int x = 10;
        System.out.println(x);
    }

    public static void main(String[] args) {
        Demo d = new Demo();

        d.show();  // x created
        d.show();  // x created again
    }
}
```

---

## ⭐ Short Interview Answer

> **A local variable is a variable declared inside a method or block. Its scope is limited to that block. It cannot be static or have an access specifier, and it must be initialized before use because Java does not provide a default value to local variables. Its lifetime is associated with the execution of the method or block.** 


## Q16. What is Encapsulation and What are its Benefits?

**Encapsulation** is the process of **hiding data and implementation details** from outside access. Its main goal is **data security**. 

### How to achieve Encapsulation?

To achieve encapsulation:

1. Declare variables/data as **`private`**.
2. Provide **public methods** such as getters and setters to access or modify the data.
3. Put required validation or logic inside those methods.

```java
class Student {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
```

Now outside code cannot directly do:

```java
// student.id = 10;       // ❌ private
```

Instead, it uses:

```java
Student s = new Student();

s.setId(10);
s.setName("Rahul");

System.out.println(s.getId());
System.out.println(s.getName());
```

So the data is accessed **through controlled public methods**.

---

## Benefits of Encapsulation

### 1. Data Security

Private data cannot be directly accessed from outside the class.

```java
private int fees;
```

The user must access it through methods. 

### 2. Controlled Access

We can decide **how data should be accessed or modified**.

For example:

```java
public void setFees(int fees) {

    if (fees >= 0) {
        this.fees = fees;
    }
}
```

Here, the method controls what value can be assigned.

### 3. Data Hiding

The internal implementation is hidden from the outside code.

The outside code only needs to know:

```java
s.setFees(10000);
```

It does not need to know how `setFees()` internally handles the value.

---

# Your `Candidate` Example

Your notes use a `Candidate` POJO class as an example of encapsulation. 

```java
class Candidate {

    private String name;
    private int id;
    private int fees;
    private boolean status;
    private boolean readyStatus;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getFees() {
        return fees;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setReadyStatus(boolean readyStatus) {
        this.readyStatus = readyStatus;
    }

    public boolean isReadyStatus() {
        return readyStatus;
    }
}
```

Notice the important pattern:

```text
private variable
       ↓
public getter/setter
       ↓
controlled access
```

For example:

```java
private int fees;
```

cannot be accessed directly outside `Candidate`.

Instead:

```java
setFees(10000);   // set value
getFees();        // get value
```

Your `AdmissionProcess` also accesses candidate data through methods such as `getName()`, `getId()`, `setReadyStatus()`, `setFees()`, and `setStatus()` rather than directly accessing the private variables. 

### ⭐ Short Interview Answer

> **Encapsulation is the process of hiding data and implementation details from outside access. We achieve encapsulation by declaring data members as private and providing public getter and setter methods for controlled access. The main benefits are data hiding, data security, and controlled access to data.** 


Yes — this is a good **Q16 interview-ready version**. It keeps the main points from your notes: **data hiding, `private` variables, public getters/setters, controlled access, and POJO example**. 

### ⭐ Remember this formula

```text
Encapsulation
      ↓
private data
      ↓
public getter/setter
      ↓
controlled access
      ↓
data security
```

### One-line example

```java
private int fees;

public void setFees(int fees) {
    if (fees >= 0) {
        this.fees = fees;
    }
}

public int getFees() {
    return fees;
}
```

**Interview keywords:**
`private` → **Data Hiding** → `getter/setter` → **Controlled Access** → **Data Security**

### Admission Process Example

Consider a college admission project with two user roles:

- Admin
- Counceller

Candidate records include an ID, name, qualification, branch, fees paid, contact details, email, and status.

```java
import java.util.Scanner;

class Candidate {
    private String name;
    private int id;
    private int fees;
    private boolean status;
    private boolean readyStatus;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public int getFees() {
        return fees;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setReadyStatus(boolean readyStatus) {
        this.readyStatus = readyStatus;
    }

    public boolean isReadyStatus() {
        return readyStatus;
    }
}

class AdmissionProcess {

    private Candidate cand[];

    void sendToCounceller(Candidate... cand) {
        this.cand = cand;
    }

    void councelling() {

        boolean b = false;

        Scanner xyz = new Scanner(System.in);

        do {
            System.out.println("\nEnter your choice");
            System.out.println("1: Follow up");
            System.out.println("2: Exit");

            int choice = xyz.nextInt();
            xyz.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter candidate name:");
                    String name = xyz.nextLine();

                    System.out.println("Enter candidate id:");
                    int id = xyz.nextInt();

                    for (int i = 0; i < cand.length; i++) {

                        if (cand[i].getName().equals(name)
                                && cand[i].getId() == id) {

                            cand[i].setReadyStatus(true);

                            System.out.println(
                                "Candidate is ready for admission."
                            );

                            break;
                        }
                    }

                    break;

                case 2:
                    b = true;
                    break;

                default:
                    System.out.println("Wrong choice");
            }

            if (b) {
                break;
            }

        } while (true);
    }
    void admission() {

        for (int i = 0; i < cand.length; i++) {

            if (cand[i].isReadyStatus()) {

                cand[i].setFees(10000);
                cand[i].setStatus(true);
            }
        }
    }

    void displayData(String loginType) {

        if (loginType.equals("admin")) {

            System.out.println("\nAdmin Data");
            System.out.println("ID\tName\tFees");

            for (int i = 0; i < cand.length; i++) {

                if (cand[i].isStatus()) {

                    System.out.println(
                        cand[i].getId() + "\t"
                        + cand[i].getName() + "\t"
                        + cand[i].getFees()
                    );
                }
            }
        }
        else if (loginType.equals("counceller")) {

            System.out.println("\nCounceller Data");
            System.out.println("ID\tName\tFees");

            for (int i = 0; i < cand.length; i++) {

                if (!cand[i].isStatus()) {

                    System.out.println(
                        cand[i].getId() + "\t"
                        + cand[i].getName() + "\t"
                        + cand[i].getFees()
                    );
                }
            }
        }

        else {
            System.out.println("Invalid login");
        }
    }
}

public class AdmissionProcessApplication {

    public static void main(String x[]) {

        AdmissionProcess ap = new AdmissionProcess(); 

        Candidate c[] = new Candidate[5];
 
        Scanner xyz = new Scanner(System.in);

        for (int i = 0; i < c.length; i++) {
 
            c[i] = new Candidate();

            System.out.println("\nEnter candidate name:"); 
            String name = xyz.nextLine();

            System.out.println("Enter candidate id:");
            int id = xyz.nextInt();
            xyz.nextLine();

            c[i].setName(name);
            c[i].setId(id);
            c[i].setFees(0);
            c[i].setReadyStatus(false);
            c[i].setStatus(false);
        }

        ap.sendToCounceller(c);

        ap.councelling();

        ap.admission();

        ap.displayData("counceller");

        // To display Admin data:
        // ap.displayData("admin");
    }
}
```


Your next topic is **Q17: Nested Classes**.

## Q17. What are Nested Classes and why use Nested Classes?

### Definition

A **nested class** means a **class declared inside another class**.

```java
class Outer
{
    class Inner
    {
    }
}
```

Here, `Inner` is a nested class inside `Outer`.

### Why do we use Nested Classes?

According to your notes, there are two main reasons:

1. **Access modifiers**
   An outer/top-level class cannot be declared `private`, `protected`, or `static`. A nested class can use these modifiers.

2. **Parent-child relationship without inheritance**
   We can create a relationship between two classes using a nested class without using `extends`. 

---

### 1. Nested class with `private`

```java
class P
{
    private class A
    {
    }
}

public class NestApp
{
    public static void main(String x[])
    {
    }
}
```

Here, `A` is a **private nested class** inside `P`.

---

### 2. Nested class with `static`

```java
class P
{
    static class A
    {
    }
}

public class NestApp
{
    public static void main(String x[])
    {
    }
}
```

Here, `A` is a **static nested class** inside `P`.

---

### 3. Nested class with `protected`

```java
class P
{
    protected class A
    {
    }
}
```

Here, `A` is a **protected nested class** inside `P`.

---

## Types of Nested Classes

There are **4 types**:

| No. | Type                   |
| --- | ---------------------- |
| 1   | Simple Nested Class    |
| 2   | Static Nested Class    |
| 3   | Local Nested Class     |
| 4   | Anonymous Nested Class |

These are the four types listed in your notes. 

### ⭐ Short Interview Answer

> **A nested class is a class declared inside another class. We use nested classes to organize closely related classes and, to use modifiers such as private, protected, and static on the nested class and to establish a relationship between classes without inheritance. There are four types: Simple, Static, Local, and Anonymous nested classes.**

## Q18. What is a Simple Nested Class?

### Definition

When we **declare one class directly inside another class**, it is called a **Simple Nested Class**. 

### Example

```java
class Outer
{
    class Inner
    {
        void display()
        {
            System.out.println("Inside Inner class");
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // First create Outer class object
        Outer obj = new Outer();

        // Then create Inner class object
        Outer.Inner inner = obj.new Inner();

        inner.display();
    }
}
```

### Important Point ⭐

For creating an object of a **simple nested/inner class**, we must first create an **object of the outer class**.

```java
Outer obj = new Outer();
Outer.Inner inner = obj.new Inner();
```

### Easy Flow

```text
Outer class object
       ↓
Inner class object
       ↓
Call inner class method
```

### Interview Answer

> **A simple nested class is a class declared directly inside another class. To create an object of a simple nested class, we first create an object of the outer class and then create the inner class object using that outer object.**


## Q19. What is a Static Nested Class?

### Definition

If we use the **`static` keyword with an inner class**, it is called a **Static Nested Class**. 

### Example

```java
class Outer
{
    static class Inner
    {
        void display()
        {
            System.out.println("Inside static nested class");
        }
    }
}

public class Main
{
    public static void main(String[] args)
    {
        // No need to create Outer class object
        Outer.Inner obj = new Outer.Inner();

        obj.display();
    }
}
```

### Important Point ⭐

For creating a **static nested class object**, we **do not need to create an object of the outer class**.

We directly use the **outer class name**:

```java
Outer.Inner obj = new Outer.Inner();
```

### Difference from Simple Nested Class

| Simple Nested Class      | Static Nested Class          |
| ------------------------ | ---------------------------- |
| Outer object is required | Outer object is not required |
| `obj.new Inner()`        | `new Outer.Inner()`          |
| Non-static inner class   | `static` nested class        |

### Easy Flow

```text
Static Nested Class
        ↓
No Outer object required
        ↓
Use Outer class name
        ↓
Outer.Inner obj = new Outer.Inner();
```

### ⭐ Interview Answer

> **A static nested class is a class declared inside another class using the `static` keyword. To create its object, we don't need to create an object of the outer class; we can directly use the outer class name.**

## Q20. What is a Local Nested Class?

### Definition

A **local nested class** is a class that is **declared inside a method/function of another class**.

The class has **local scope**, so its object cannot be created outside the method/function in which the class is declared. 

### Example

```java
class Outer
{
    void display()
    {
        // Local nested class
        class Inner
        {
            void show()
            {
                System.out.println("Inside Local Nested Class");
            }
        }

        // Object must be created inside this method
        Inner obj = new Inner();

        obj.show();
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Outer outer = new Outer();

        outer.display();
    }
}
```

### Important Point ⭐

The `Inner` class is declared inside the `display()` method:

```java
void display()
{
    class Inner
    {
    }
}
```

Therefore, `Inner` can be used **only inside the `display()` method**.

❌ We cannot do this:

```java
public static void main(String[] args)
{
    Inner obj = new Inner(); // Error
}
```

### Easy Flow

```text
Outer Class
     ↓
  Method()
     ↓
 Local Nested Class
     ↓
Object created inside method
```

### ⭐ Interview Answer

> **A local nested class is a class declared inside a method or function of another class. Its scope is limited to that method, so its object cannot be created outside that method's block.**


## Q21. What Is an Anonymous Nested Class?

### Definition

An **anonymous nested class** (also called an **anonymous inner class**) is a class without a name that is declared and instantiated in one expression.

It is commonly used to provide a one-time implementation or override a method without creating a separate named class.

### Example

```java
class Greeting
{
    void sayHello()
    {
        System.out.println("Hello");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Greeting greeting = new Greeting()
        {
            @Override
            void sayHello()
            {
                System.out.println("Hello from an anonymous class");
            }
        };

        greeting.sayHello();
    }
}
```

**Output:**

```text
Hello from an anonymous class
```

Here, the class body after `new Greeting()` has no class name. It creates an anonymous subclass of `Greeting` and overrides `sayHello()`.

### Important Points

- An anonymous class has no name, so it cannot be used to create another instance later.
- It is declared and instantiated at the same place.
- It can extend one class or implement one interface. 
- It is useful when a class implementation is needed only once.

> **Note:** Anonymous classes are often used with abstract classes and interfaces. We will discuss those examples in the inheritance chapter.

### ⭐ Interview Answer

> **An anonymous nested class is a class without a name that is declared and instantiated in a single expression. It is useful for providing a one-time implementation or overriding a method without declaring a separate named class.**