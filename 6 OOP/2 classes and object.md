Q1. What is class?
Q2. Why use class or Benefits of class?
Q3. How to reuse class more than one time?
Q4. What is an object and how to create an object in Java?
Q5. What is the difference between reference and object?
Q6. How to pass parameters to call function?
Q7. How to pass an array as a parameter to class function?
Q8. What is a method with variable argument concepts?
Q9. What is POJO class & Why use POJO class?
Q10. Static variable & static methods ?
Q11. Local Variable , instance variable?
Q12. What is the difference between local variable ,instance variable and static variable?
Q13. Array of objects?
Q14. What is encapsulation & Benefit of Encapsulation?
Q15. What are nested classes and why use nested class?
Q16. What is a simple nested class?
Q17. What is a static nested class?
Q18. What is the local nested class?
Q19. What are anonymous nested classes?


Q1. What is a Class?

Definition 1

A class is a combination of Variables and Methods.
State → Variables
Behavior → Methods (functions)

Definition 2
A class is a collection of data members and member functions.

Definition 3 (Detailed / Technical)

A class is a blueprint that may contain:
    Instance variables
    Static (class-level) variables
    Methods
    Constructors
    Instance initializer blocks
    Static initializer blocks
    Nested classes

Important Components of a Class
1. Instance Variable

    An instance variable is a variable declared inside a class but outside any method without the static keyword.
    Each object has its own copy of instance variables.

    int id;   // instance variable
 
2. Class Variable (Static Variable)

    A class variable is a variable declared inside a class using the static keyword.
    It is shared among all objects of the class.

    static int count;   // class variable

3. Method

    When a function is defined inside a class, it is called a method.
    Methods define the behavior of a class.

    void show()
    {
        System.out.println("Hello");
    }

4. Constructor

    Name is same as class name
    Has no return type
    Used to initialize objects

    ClassName()
    {
        // constructor
    }

5. Instance Initializer Block

    An instance initializer is a block defined inside a class without the static keyword.
    It executes every time an object is created, before the constructor.

    {
        System.out.println("Instance initializer");
    }

6. Static Initializer Block

    A static initializer is a block defined using the static keyword.
    It executes only once when the class is loaded.

    static
    {
        System.out.println("Static initializer");
    }
-------------------------------------------------------------------------
Nested Class
-------------------------------------------------------------------------
A nested class is a class declared inside another class.
It is used to logically group related classes, improve encapsulation, and increase code readability.

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

Q.How to declare class in JAVA?

access_specifier class ClassName
{
    access_specifier dataType variableName;
    access_specifier returnType methodName(dataType variableName)
    {
        // write your logic here
    }
}

Example: 
public class Student
{
    private int id;        // data member

    public void show(int x)
    {
        System.out.println(x);
    }
}
-------------------------------------------------------------------------
Q2. Why use a Class? / Benefits of Class
-------------------------------------------------------------------------
1. Ability to Store Different Types of Data

    A class can store different types of data in a single unit.
    Hence, a class is called a complex or heterogeneous data structure.

        For example
        class Employee
        {
            private int id;
            private String name;
            private long sal;
        //function
        }
    So, a class has the ability to store multiple data types together.

2. Reusability

    A class is declared only once and can be reused multiple times, which reduces code duplication.

    A class can be reused in two ways:
        1. By creating objects of the class
        2. By using inheritance (discussed in later chapters)

3. Encapsulation

    A class supports encapsulation, which means binding data and methods together and hiding data using access specifiers.
    (This concept is discussed in detail in a later chapter.)

4. Abstraction

    A class also supports abstraction, which means showing only necessary details and hiding implementation.
    (This concept is explained in the inheritance chapter.)

Q3. How to reuse class more than one time?
   A class can be reused in two ways:
        1. By creating objects of the class
        2. By using inheritance (discussed in later chapters)


Q4. What is an Object and how to create an Object in Java?

Definitions of Object

    Definition 1:
    An object is an instance of a class.
    Definition 2:
    An object is a runtime entity, because it is created during program execution.
    Definition 3:
    An object is a block of memory where class data is stored.
    It can be considered a photocopy of a class, because when an object is created, all non-static (instance) variables of the class get memory.

Extra clarity (optional for exams):
    Memory is allocated separately for each object
    Static variables do not get separate memory per object
    Instance variables are stored in the heap memory

How to Create an Object in Java
    To create an object in Java, we use the new keyword.

    Syntax
    ClassName ref = new ClassName();

Explanation

    Employee emp = new Employee();

    Employee → Class name
    emp → Reference variable
    new Employee() → Actual object (allocates memory in heap)

The reference variable emp stores the address of the object.

Important Points (Exam Ready)

    Objects are created at runtime
    Memory is allocated in the heap
    Each object has its own copy of instance variables
    Multiple objects can be created from the same class

-------------------------------------------------------------------------
Q5. Difference Between Reference and Object
-------------------------------------------------------------------------
| **Reference**                                                          | **Object**                                                                         |
| ---------------------------------------------------------------------- | ---------------------------------------------------------------------------------- |
| A reference is a **variable** that stores the **address of an object** | An object is a **block of memory** that stores **class data (instance variables)** |
| It does **not store actual data**                                      | It stores **actual data of the class**                                             |
| Created in **stack memory**                                            | Created in **heap memory**                                                         |
| Used to **access an object**                                           | Represents a **real instance of a class**                                          |
| Can be reassigned or set to `null`                                     | Exists until garbage collected                                                     |


Q. Why use references with objects?
Q. What happens if we do not use references with objects?

Note: before this question we need to how to use class practically 

Step 1: Declare a Class
    class Add
    {
    }


Step 2: Declare Variables Inside the Class
    import java.util.Scanner;
    class Add
    {
        private int a, b;               // instance variables
        private Scanner xyz = new Scanner(System.in);
    }

Step 3: Define Methods Inside the Class
    class Add
    {
        private int a, b;
        private Scanner xyz = new Scanner(System.in);

        public void setValue()
        {
            System.out.println("Enter two values:");
            a = xyz.nextInt();
            b = xyz.nextInt();
        }
    }

Step 4: Create an Object of the Class
    public class ADDAPP
    {
        public static void main(String x[])
        {
            Add ad = new Add();   // object creation
        }
    }

Step 5: Use Class Variables and Methods Using the Object

import java.util.Scanner;
    class Add   //stap 1
    {
        private int a, b;  //stap 2 - variable declaration 
        private Scanner xyz = new Scanner(System.in);

        public void setValue()  //step 3 - function defination
        {
            System.out.println("Enter two values:");
            a = xyz.nextInt();
            b = xyz.nextInt();
        }

        public void showAdd()  //step 3 - function defination
        {
            System.out.println("Addition is: " + (a + b));
        }
    }

public class ADDAPP
    {
        public static void main(String x[])
        {
            Add ad = new Add();   // Step 4
            ad.setValue();       // Step 5
            ad.showAdd();        // Step 5
        }
    }


Example: WAP to create class name as Square with two values with two function 
    void setNum():accept number as parameter 
    int getSquare(): calculate square and return it 

import java.util.*;
class Square   // Step 1: class declaration
{
    private int no;                    // Step 2: variable declaration
    private Scanner xyz = new Scanner(System.in);

    public void setNum()               // Step 3: function definition
    {
        System.out.println("Enter number:");
        no = xyz.nextInt();
    }

    public int getSquare()
    {
        return no * no;
    }
}

public class SQApplication
{
    public static void main(String x[])  // Step 4: main method
    {
        Square s1 = new Square();       // Step 5: object creation
        s1.setNum();                   // using method
        int result = s1.getSquare();   // using method
        System.out.println("Square is " + result);
    }
}

⭐ Output
Enter number:
5
Square is 25

Q6. How to pass parameters to class functions?

Example: WAP to create class name as Cube with two functions 
    void setValue(int x) : this function can accept number as parameter 
    int getCube(): this function can calculate the cube of a variable and return it.

class Cube   // step 1
{
    void setValue(int n)
    {
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
        int result = c.getCube();
        System.out.println("Cube is " + result);
    }
}

What is the problem?

    If we think about the above code, we have two functions:
        void setValue(int n) → this function accepts a number as a parameter
        int getCube() → this function tries to access n
    But the variable n is declared as a parameter of setValue(int n), therefore n is a local variable of the setValue() method.
    A local variable (i.e., a variable declared inside a method or as a method parameter) has scope only within that method block.
    It cannot be accessed directly inside another method of the same class.
    Since getCube() tries to access n, which is not declared within its scope, this violates Java scope rules, and hence the program produces a compile-time error (cannot find symbol).

How can we solve this type of problem?
(Accessing local variable value in another method)

To solve this type of error, we must not use the local variable directly in another method.
Instead, we should copy the value of the local variable into:
   1. Instance variable (without static) OR
   2. Static variable (with static)
Because instance variables and static variables are declared directly inside the class block, they are accessible by all methods of that class.

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

Why this works?

    n (instance variable) is part of the object state
    All non-static methods can access it
    Best approach for object-oriented programming

Solution 2: Using Static Variable

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

Key Rule to Remember ⭐

Local variable → copy into instance/static variable → access in other methods
--------------------------------------------------------------------------
Q. What happens if we do not use references with objects?

If we do not use a reference with an object, then such an object is called an anonymous object (object without reference).

When an object is created without a reference, the JVM:
    Creates the object in heap memory
    Allows it to be used only once
    Makes it unreachable immediately after use

If we create an object without a reference multiple times, the JVM will create a new object every time, meaning:
    A new memory block is allocated for each object
    Each object has its own separate data (content)

Since there is no reference pointing to these objects, they become eligible for garbage collection after execution.

Example
new Cube().setValue(5);   // anonymous object
new Cube().setValue(10);  // another anonymous object

✔ Two different objects are created
✔ Two different memory blocks
✔ Data is not shared

Key Points ⭐

    Object without reference → Anonymous object
    Used only once
    Cannot be reused
    New object = new memory every time
    Eligible for Garbage Collection

Conclusion:reference hold address of object and motive of reference is reuse same object more than one time 

Q. Can we use more than one reference on a single object and what happens if we use a reference ?

Yes, we can use more than one reference for a single object.

An object is created in the heap memory, and heap memory is shared, which means the same object can be accessed by multiple references.

When multiple references point to the same object:
    They all refer to the same memory location
    They share the same object state (data / variables)

Important Behavior

If we modify the object’s content (state, variables, or data) using any one reference, then:

    The actual object state changes
    All other references will see the updated value
    The previous object content is lost (overwritten)

This happens because references do not store data, they only point to the object.

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

✅ Output
Cube is 1000

🧠 What Is Happening Internally?

Cube c = new Cube();
→ One object is created in heap memory

Cube c1 = c;
→ No new object is created
→ c and c1 point to the same object

c1.setValue(10);
→ Object state (no) becomes 10
→ Previous value (5) is overwritten

c.getCube();
→ Uses the same object, so cube of 10 is printed

-------------------------------------------------------------------------
Q7. How to pass an array as a parameter to a class function?
-------------------------------------------------------------------------
If we want to pass an array as a parameter to a class function, we pass the base address (reference) of the array to that function.

In Java, an array is an object, so when we pass an array to a method, its reference is passed, not a copy of elements. Using this reference, the method can access all array values.

Example
WAP to create a class Sum with two functions:

void setValue(int arr[]) → accepts array as parameter
int getSum() → calculates and returns sum of array elements

class Sum
{
    int m[];   // instance variable to store array reference

    void setValue(int arr[])
    {
        m = arr;   // copying base address
    }

    int getSum()
    {
        int sum = 0;
        for(int i = 0; i < m.length; i++)
        {
            sum = sum + m[i];   // correct logic
        }
        return sum;
    }
}

public class ArrsumApplication
{
    public static void main(String x[])
    {
        int a[] = new int[]{10, 20, 30, 40, 50};

        Sum s = new Sum();
        s.setValue(a);   // passing array

        int result = s.getSum();
        System.out.println("Sum is " + result);
    }
}
---------------------------------------------------------
Q8. What is a method with variable argument concepts?
---------------------------------------------------------
A method with variable arguments (var-args) is a method that can accept zero or more arguments of the same type.

This concept is used when the number of parameters is not fixed (i.e., infinite or variable).
In Java, variable arguments are represented using three dots (...).

Syntax
returnType methodName(dataType... variableName)

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
output
10
10
20
30
1
2
3
4
5


Important Points ⭐
    Var-args internally treated as an array
    Only one var-args allowed per method
    Var-args must be the last parameter
    Used to avoid method overloading

Important Rules for Variable Arguments (Var-Args)

1️⃣ Position of triple dots (...)
    The triple dots must be written after the data type and before the variable name.
    ✅ Correct:
    void show(int... a)

    ❌ Incorrect:
    void show(int a...)

2️⃣ Only one variable argument is allowed
    We cannot declare more than one var-args parameter in a single method.

    ❌ Invalid:
    void show(int... a, int... b)

3️⃣ Var-args must be the last parameter
    If a method contains normal parameters along with var-args, then the var-args parameter must be the last one in the method definition.

    ✅ Correct:
    void show(int x, int y, int... a)


    ❌ Incorrect:
    void show(int... a, int x)

Example Demonstrating All Rules

    class Sum
    {
        void calSum(String name, int... x)
        {
            System.out.println("Name is " + name);
            int s = 0;
            for(int i = 0; i < x.length; i++)
            {
                s += x[i];
            }
            System.out.println("Sum of all value is = " + s);
        }
    }
    public class SumVarApplication
    {
        public static void main(String x[])
        {
            Sum s = new Sum();
            s.calSum("Ram", 10, 20, 30, 40, 50);
        }
    }
✅ Output   

Name is Ram
Sum of all value is = 150

Key Point ⭐
    Variable arguments are internally treated as an array.

Note (Important)
    If a function is defined with a variable argument (var-args), then we can pass an array as a parameter from the function calling point.

class Sum
{
    void calSum(int ...x)
    {
        int s = 0;
        for(int i = 0; i < x.length; i++)
        {
            s = s + x[i];
        }
        System.out.println("Sum of all value is  " + s);
    }
}
public class SumVarApplication
{
    public static void main(String x[])
    {
        Sum s = new Sum();
        int a[] = new int[]{10,20,30,40,50};
        s.calSum(a);   // passing array to var-args method
    }
}

✅ Output
Sum of all value is  150

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

Output of your program
1 2 3 
4 5 6 
7 8 9 

-----------------------------------------------------------------------
Q9. What is POJO class & Why use POJO class?
-----------------------------------------------------------------------
What is POJO Class?

POJO stands for Plain Old Java Object.
A POJO class is a simple Java class that is not dependent on any framework and is mainly used to store data.

A POJO class generally contains:

    Private data members (variables)
    Public getter and setter methods
    Constructors (optional)
    No business logic or framework-specific code

Why use POJO Class?

POJO classes are used to:

    Store data
    Transfer data between different layers of an application
    (Controller → Service → Repository)
    Pass objects as parameters between methods and classes
    Maintain encapsulation, readability, and reusability

Important Points of POJO Class
    All variables should be declared as private
    Getter and setter methods should be public
    Setter methods are used to store data in the object
    Getter methods are used to retrieve data from the object
    POJO class should not extend or implement framework-specific classes/interfaces
    POJO class does not contain business logic

Example with source code 

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

📝 Output
Name is Ram
Id is 1

Q. Why use POJO class? / What are the benefits of POJO class?

Why POJO Class is Used

    When a method contains many parameters of different data types, passing values one-by-one is not a good approach.

    It becomes difficult to remember:
        Parameter count
        Parameter order
        Parameter data types

To solve this problem, Java suggests using a POJO class.

A POJO class allows us to group related data into a single object and pass that object as one parameter.

Benefits of POJO Class
    Reduces number of method parameters
    Improves code readability
    Avoids confusion of parameter order
    Easy to modify (add/remove fields)
    Supports data transfer between layers
    Follows encapsulation (data security)

❌ Example Without POJO Class
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

Problems in Above Approach
    Developer must remember parameter sequence
    Developer must pass all parameters
    Cannot skip any parameter
    Difficult to maintain and modify

✅ Example With POJO Class (Recommended)
POJO Class

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

⭐ Final Conclusion (Exam Ready)
POJO class is used to group multiple related data into a single object so that it can be passed as one parameter, which improves readability, maintainability, and reduces complexity of method calls.
------------------------------------------------------------------------
Q10. What is Array of Objects?
-----------------------------------------------------------------------
An array of objects is a concept in Java where multiple objects of the same class are stored using a single array reference.

Instead of creating many separate object variables, we use an array to manage multiple objects efficiently.

Why use Array of Objects?
    To store data of multiple objects
    To avoid creating many separate object variables
    Easy to iterate, search, and manage objects
    Used in real-world applications (Student list, Employee list, Product list)

How to Create an Array of Objects?
Steps:
    Step 1: Create array of reference
    Employee[] emp = new Employee[3];

    Step 2: Create objects and assign to array
    emp[0] = new Employee();
    emp[1] = new Employee();
    emp[2] = new Employee();

    Step 3: Store data in each object
    emp[0].setId(1);
    emp[0].setName("Ram");

    emp[1].setId(2);
    emp[1].setName("Shyam");

    emp[2].setId(3);
    emp[2].setName("Amit");

    Step 4: Access object data using loop
    for(int i = 0; i < emp.length; i++)
    {
        System.out.println(emp[i].getId() + " " + emp[i].getName());
    }

Complete Example

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

    public class ArrayOfObjectsApp
    {
        public static void main(String[] args)
        {
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

            for(int i = 0; i < emp.length; i++)
            {
                System.out.println("Id: " + emp[i].getId() +
                                ", Name: " + emp[i].getName());
            }
        }
    }

Output
Id: 1, Name: Ram
Id: 2, Name: Shyam
Id: 3, Name: Amit

One-Line Exam Answer
Array of objects is an array that stores references of multiple objects of the same class using a single variable name.

-----------------------------------------------------------------------
Q11. What is Static Variable & Static Method?
-----------------------------------------------------------------------
🔹 Static Variable
A static variable is also called a class-level variable.

It is:
    Declared using the static keyword
    Common for all objects of the class
    Created only once
    Loaded when the class is loaded by the JVM

Static variables are allocated memory at class loading time by the Class Loader, before any object is created.

They can be accessed using:

    Class name (recommended)
    Object reference (allowed but not recommended)

Memory location: Static variables are stored in the Method Area (MetaSpace) of JVM memory.

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

🖨️ Output
X = 100
Y = 200
X = 100