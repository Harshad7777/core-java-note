Q. What is Polymorphism?
-----------------------------------------------------------
Polymorphism means one thing having many forms.
In programming, when the same method or object shows different behavior in different situations, it is called polymorphism.
👉 Poly = many
👉 Morph = forms
So, polymorphism = many forms


Q. Examples of Polymorphism
Example 1: Mobile Device
    A mobile phone is one device, but it performs different behaviors:
    Phone (calling)
    Calculator
    Calendar
    TV
    Camera

👉 Same object, different behavior based on requirement
Example 2: Person
    A single person behaves differently:
    Acts as a manager with team
    Acts as an employee in front of CEO/VP
    Acts as a child at home
👉 One person, multiple roles and behaviors

Note:
    Polymorphism is a concept.
    In programming languages like Java, we implement this concept using specific techniques.

Q. How many types of polymorphism are there in Java & how can we achieve them?

There are two types of polymorphism in Java:

1️⃣ Compile Time Polymorphism
    Binding of method happens at compile time
    Also called Static Polymorphism
    Achieved using Method Overloading
    📌 Method Overloading → Same method name, different parameters

2️⃣ Runtime Polymorphism
    Binding of method happens at runtime
    Also called Dynamic Polymorphism
    Achieved using Method Overriding
    Requires Inheritance
    📌 We will study overriding in the Inheritance chapter

Q. What is Function (Method) Overloading & its Rules?
Definition:
    Function overloading means having more than one method with the same name but with a different parameter list.

Rules of Method Overloading:

    Methods must differ by:
    Number of parameters
    Type of parameters
    Sequence (order) of parameters

❌ Return type alone cannot be used for overloading.

Example of Method Overloading in Java:
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


✔ Same method name add()
✔ Different parameter list
✔ This is Compile Time Polymorphism


Example: WAP to calculate square of integer and float using overloading 

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

Square of integer is 25
Square of float is 30.25

Concept Used: Method Overloading

    Same method name square
    Different parameter types (int, float)
    Decided at compile time
    ✔ This is compile-time polymorphism


Q. Why use function overloading & benefits of function overloading with an example?

Why do we need Function (Method) Overloading?

    Sometimes, we have multiple logics under the same domain, but each logic requires different parameters.
    If we define separate functions with different names for each logic, then the developer must remember many function names while calling them. This becomes a tedious and confusing task in real-time projects.

    To solve this problem, Java provides function (method) overloading.

    In method overloading, we can define multiple methods with the same name but with different parameter lists or data types.
    Because of this, the developer needs to remember only one method name, and Java automatically decides which method to call based on the arguments passed.

Best Example of Method Overloading: println()

The println() method is the best real-time example of function overloading.

    If we pass an integer, println() prints an integer
    If we pass a float, println() prints a float
    If we pass a String, println() prints a String
    If we pass a double, char, boolean, etc., it prints that value

Internally, Java has overloaded the println() method for all data types.

System.out.println(10);        // int version
System.out.println(10.5f);     // float version
System.out.println("Java");    // String version
System.out.println(true);      // boolean version


Here:

    Domain → Output printing on console
    Different logics → Printing int, float, String, etc.
    Single method name → println()

Conclusion

    Method overloading:
    Improves code readability
    Reduces developer effort
    Makes code easy to use and maintain
    Supports compile-time polymorphism

Q. Can you suggest some scenarios where function overloading is beneficial?

Suppose consider we are working of on Inventory control system and we want to sort product data by product name as well as by price 

class PerformSort
{
    public void sortProduct(String name)
    {
        //sorting product by name logic
    }
    public void sortProduct(int price)
    {
        //sorting product by price logic
    }
}

Example: suppose consider we are working billing software and  we have two type or category bill
    a.Without GST
    b.With GST

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

Example: WAP to create two functions one is used for sort integer array and one is used for sort character array

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
