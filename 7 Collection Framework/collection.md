Collection Framework
Q. What is Collection & Why use Collection Framework ?

Collection:
Collection is a ready-made implementation of data structures provided by Java. It is used to store and manage a group of objects dynamically.

Important Points / Reasons to Use Collection Framework

    1. Store Different Types of Data
    Collections allow us to store different types of objects.

    2. Dynamic Size
    Collections can increase or decrease their size at runtime according to user requirements.

    3. Ready-made Data Structure Implementation
    The Collection Framework provides built-in implementations of data structures and algorithms, so developers do not need to implement them manually.

    4. Thread Safety Support
    Some collection classes provide thread-safe operations.

    5. Generic Support
    Collections support Generics, which provide type safety and help avoid storing the wrong type of data.

Note
If we use an Object class array in Java, we can store different types of data in it.

Example:

public class ObjARRAPP
{
    public static void main(String x[])
    {
        Object arr[] = new Object[5];
        arr[0] = false;
        arr[1] = "good";
        arr[2] = new java.util.Date();
        arr[3] = 5.4f;
        arr[4] = 100L;

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

But this approach has some limitations:

    The array size cannot expand at runtime.
    We must write manual logic for operations such as:
        Searching elements
        Inserting elements
        Deleting elements
 
Because of these limitations, Java provides built-in data structure implementations called the Collection Framework.

Conclusion

If we want to work with the Collection Framework, Java provides a Collection Hierarchy that includes interfaces and classes such as:
These help developers store, manage, and manipulate data easily.

java.lang.Iterable(interface)
        │
java.util.Collection(i)
        |
        ├── List(i)
        │    ├── ArrayList(class)
        │    ├── LinkedList(c)
        │    └── Vector(c) → Stack(c)
        │
        ├── Set(i)
        │    ├── HashSet(c)
        │    ├── LinkedHashSet(c)
        |    └── SortedSet(i)  -> TreeSet(c) 
        │   
        │
        └── Queue(i)
            ├── PriorityQueue (c)
            └── Deque(i) → LinkedList (c)

------------------------------------------------------

Q4. Explain Iterable Interface in Detail

The Iterable interface is the root interface of the Java Collection Framework. It is present in the java.lang package and is used to traverse (iterate) elements of a collection.

It provides the ability to retrieve or fetch data from collection objects such as List, Set, etc.

All collection classes implement the Iterable interface either directly or indirectly.

Main Method of Iterable Interface
The Iterable interface contains one important abstract method:
interface iterable
{
    Iterator<T> iterator();
}

This method returns an object of the Iterator interface, which is used to iterate through the collection elements.

Iterator Interface

The Iterator interface is present in the java.util package and is used to retrieve elements one by one from a collection.

Internal structure:

public interface java.util.Iterator<E> 
{
    public abstract boolean hasNext();
    public abstract E next();
    public default void remove();
    public default void forEachRemaining(java.util.function.Consumer<? super E> action);
}

Methods of Iterator Interface

1. public abstract boolean hasNext()

Checks whether the next element is available in the collection.
Returns true if an element exists, otherwise false.
Example meaning:
If next element exists → true
If no more elements → false

2. public abstract E next()

Retrieves the next element from the collection.
After fetching the element, the cursor moves to the next position.

3. public default void remove()

Removes the current element from the collection during iteration.
It is an optional operation.

4. forEachRemaining(Consumer action)
 public default void forEachRemaining(java.util.function.Consumer<? super E> action);

Introduced in Java 8.
Used to perform an action on all remaining elements.

Example of Iterable and Iterator

import java.util.*;
public class Test 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator<>();

        while(it.hasNext()) 
            {
                System.out.println(it.next());
            }
    }
}
Output
10
20
30
<!-- ArrayList → dynamic array class in Java
<Integer> → Generic type (stores only Integer values)
list → variable name
new ArrayList<>() → creates the object -->
<!-- Iterator is used to traverse (loop through) collection elements
list.iterator() returns an iterator for the ArrayList
it is the iterator variable -->

Important Points (Interview)
    Iterable is the root interface of the Collection framework.
    It allows traversing elements using Iterator.
    It provides the iterator() method.
    The Iterator interface provides methods like hasNext() and next() for fetching data.
---------------------------------------------------------

Q5. Explain the Collection Interface with its Methods

The Collection interface is a part of the java.util package. 
It is the root interface of the Java Collection Framework (except Map) and it extends the Iterable interface.

The Collection interface provides common methods that are required by all collection classes to perform operations such as adding elements, removing elements, checking size, searching elements, etc.

All major collection interfaces like List, Set, and Queue inherit from the Collection interface.

Hierarchy
Iterable
   │
Collection
 ├── List
 ├── Set
 └── Queue

Important Methods of Collection Interface 

1️⃣ int size()
        int size = al.size();   // get number of elements

2️⃣ boolean isEmpty()
        boolean b = al.isEmpty();  // check if list is empty

3️⃣ boolean contains(Object o)
        boolean b = al.contains(20);   // check if 20 exists in list

4️⃣ Iterator<E> iterator()
        Iterator i = al.iterator();  // create Iterator object

5️⃣ Object[] toArray()
        Object[] obj = al.toArray();   // convert ArrayList to array

6️⃣ boolean add(E e)
        boolean b = al.add(10);   // add element and store result
 
7️⃣ boolean remove(Object o)
    1️⃣ boolean b = al.remove(Integer.valueOf(30)); //value
	2️⃣ boolean b = al.remove(30); //index

8️⃣ boolean containsAll(Collection<?> c)
		        boolean b = al.containsAll(c); //all c element prasent in al

9️⃣ boolean addAll(Collection<? extends E> c)
        boolean b = al.addAll(c);   // collection1.addAll(collection2);

🔟 boolean removeAll(Collection<?> c)
        Object value = list.remove(1); // remove(1) removes the element at index 1 //Index 1 = 20

1️⃣1️⃣ indexOf(Object obj)
        int index = list.indexOf(20); // If the element is found, it returns its index otherwise -1

1️⃣2️⃣ lastIndexOf(Object obj) 
        System.out.println(list.lastIndexOf(20));   //If element exists multiple times, it returns last index.

1️⃣3️⃣ listIterator(int index)
        ListIterator it = list.listIterator(1); //starting from the specified index and allows traversal in both forward and backward directions.

1️⃣4️⃣ subList(int fromIndex, int toIndex)
System.out.println(list.subList(1,3)); //new list containing elements between specified indexes.

1️⃣ int size()
    Returns the number of elements present in the collection.
int size = list.size();

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();   // create ArrayList

        al.add(10);   // add element
        al.add(20);   // add element
        al.add(30);   // add element

        int size = al.size();   // get number of elements

        System.out.println("Number of element present in al " + size);
    }
}

2️⃣ boolean isEmpty()
    Checks whether the collection is empty or not.
    Returns true if collection is empty
    Returns false if elements exist

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();   // create ArrayList

        boolean b = al.isEmpty();         // check if list is empty

        if(b)
        {
            System.out.println("Arraylist is empty");
        }
        else
        {
            System.out.println("Arraylist is not empty");
        }
    }
}

3️⃣ boolean contains(Object o)
    Checks whether a specified element exists in the collection.
    Returns true if element is present
    Otherwise returns false

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();   // create ArrayList

        al.add(10);   // add element
        al.add(20);   // add element
        al.add(30);   // add element

        boolean b = al.contains(20);   // check if 20 exists in list

        if(b)
        {
            System.out.println("Element found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}

4️⃣ Iterator<E> iterator()
    Returns an Iterator object used to traverse (retrieve) elements from the collection.

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();   // create ArrayList object
        al.add(10);                       // add element 10
        al.add(20);                       // add element 20
        al.add(30);                       // add element 30

        Iterator i = al.iterator();       // create Iterator object

        while(i.hasNext())                // check if next element exists
        {
            Object obj = i.next();        // get next element from list
            System.out.println(obj);      // print element
        }
    }
}

5️⃣ Object[] toArray()
    Converts the collection into an array of objects.

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);

        Object[] obj = al.toArray();   // convert ArrayList to array

        for(Object o : obj)            // traverse array
        {
            System.out.print(o + "\t");
        }
    }
}

Output
10
20
30

| Feature    | ArrayList                                    | Array                             |
| ---------- | -------------------------------------------- | --------------------------------- |
| Size       | Dynamic (can grow or shrink)                 | Fixed size                        |
| Package    | `java.util` package                          | `java.lang`                       |
| Data Type  | Stores **objects only**                      | Can store **primitive + objects** |
| Memory     | Resizable automatically                      | Fixed memory                      |
| Methods    | Many methods (`add()`, `remove()`, `size()`) | Very few methods                  |
| Conversion | Can convert to Array using `toArray()`       | No conversion needed              |

6️⃣ boolean add(E e)
    Adds a new element to the collection.
    Returns true if element is added successfully.

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();   // create ArrayList

        boolean b = al.add(10);           // add element and store result

        if(b)
        {
            System.out.println("Element added in collection");
        }
        else
        {
            System.out.println("Element not added");
        }
    }
}
7️⃣ boolean remove(Object o)
    Removes the specified element from the collection.
    Returns true if the element is removed.

    1️⃣ boolean b = al.remove(Integer.valueOf(30));
    Meaning:
    Removes the element with value 30 from the ArrayList.
    2️⃣ boolean b = al.remove(30);
    Meaning:
    Removes the element at index 30 (not value 30).

import java.util.*;
public class Test {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);

        boolean b = al.remove(Integer.valueOf(30)); // remove element 30

        if(b)
        {
            System.out.println("Element removed");
        }
        else
        {
            System.out.println("Element not removed");
        }
    }
}


8️⃣ boolean containsAll(Collection<?> c)
    Checks whether all elements of another collection exist in this collection.

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Collection c = new ArrayList();
        c.add(20);
        c.add(30);

        boolean b = al.containsAll(c); //all c element prasent in al

        if(b)
        {
            System.out.println("All elements found");
        }
        else
        {
            System.out.println("Elements not found");
        }
    }
}


9️⃣ boolean addAll(Collection<? extends E> c)
    Adds all elements of another collection into the current collection.

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Collection c = new ArrayList(); // Create Collection c
        c.add(50);
        c.add(60);
        c.add(70);

        boolean b = al.addAll(c);   // collection1.addAll(collection2);

        if(b)
        {
            System.out.println("Elements added");
        }
        else
        {
            System.out.println("Elements not added");
        }
    }
}

🔟 boolean removeAll(Collection<?> c)
    Removes all elements from the current collection that are present in another collection.

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Object value = list.remove(1); // remove(1) removes the element at index 1 //Index 1 = 20

        System.out.println("Removed element: " + value);
        System.out.println("ArrayList after removal: " + list);
    }
}

List → [10, 20, 30]
remove(1) → [10, 30] //
remove(Integer.valueOf(20)) → [10, 30]
-----------------------------------------------------------

1️⃣1️⃣ indexOf(Object obj)

Definition:
This method returns the index of the first occurrence of the specified element in the list.

    If the element is found, it returns its index.
    If the element is not found, it returns -1.

import java.util.*;
public class Test {
    public static void main(String x[]){

        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int index = list.indexOf(20);

        if(index!=-1)
        {
            System.out.println("element found");
        }
        else
        {
            System.out.println("element not found");
        }
    }
}

Output
Element found


1️⃣2️⃣ lastIndexOf(Object obj)

Definition:
This method returns the index of the last occurrence of the specified element in the list.
    If element exists multiple times, it returns last index.
    If element not found, it returns -1.

Syntax

int lastIndexOf(Object obj)

Example

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        System.out.println(list.lastIndexOf(20));
    }
}

Output
3

Explanation:
The last occurrence of 20 is at index 3.

1️⃣3️⃣ listIterator(int index)

Definition:
This method returns a ListIterator object starting from the specified index and allows traversal in both forward and backward directions.

Syntax

ListIterator listIterator(int index)

Example

import java.util.*;

public class Test {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator it = list.listIterator(1); //starts from element 20.

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

Output
20
30

Explanation:
Iteration starts from index 1.

1️⃣4️⃣ subList(int fromIndex, int toIndex)

Definition:
This method returns a new list containing elements between specified indexes.

fromIndex → starting index (included)
toIndex → ending index (excluded)

Syntax

List subList(int fromIndex, int toIndex)

Example

ArrayList list = new ArrayList();
list.add(10);
list.add(20);
list.add(30);
list.add(40);

System.out.println(list.subList(1,3));

Output

[20, 30]

Explanation:
Elements from index 1 to 2 are returned.

--------------------------------------------------------------------------

Q8. Explain Vector Class and Why Vector is Thread Safe and Legacy
Vector Class

Vector is a dynamic array present in the java.util package.
It is a legacy collection and also a thread-safe collection.

Vector stores elements dynamically and automatically increases its capacity when needed.

1️⃣ Legacy Collection

Definition:
Legacy collections are the collection classes that existed before the Collection Framework (before JDK 1.2) and were later included in the framework.

Examples:
    Vector
    Stack
    Hashtable
    Enumeration

Why Vector is legacy?
    Vector was introduced in Java 1.0
    The Collection Framework was introduced in JDK 1.2
    Later Vector was included in the collection framework
    Therefore, Vector is called a legacy collection.

2️⃣ Thread Safe Collection
A collection is thread safe when multiple threads can use the same collection object without data inconsistency.
    Vector methods are synchronized, so:
        Only one thread can access the object at a time
        Threads use the object one by one
        Because of synchronization, Vector is thread safe.

3️⃣ Constructors of Vector
1. Vector()
Creates a vector with default capacity = 10
    Vector v = new Vector();

Internally it creates:
    Object[10]

If capacity is exceeded, Vector doubles its size.

Example:
10 → 20 → 40 → 80

2. Vector(int capacity)

Creates vector with user-defined capacity.
    Vector v = new Vector(5);
    Initial capacity = 5

3. Vector(int initialCapacity, int incrementalCapacity)

Allows user to set:
Initial capacity
Incremental capacity

Vector v = new Vector(5,2);

Meaning:
Initial size = 5
Next increase = +2

Example growth:
5 → 7 → 9 → 11

4. Vector(Collection c)

Copies data from another collection into the vector.

ArrayList list = new ArrayList();
list.add(10);
list.add(20);
Vector v = new Vector(list);

5. Important Points about Vector

    Vector is a dynamic array
    It is a legacy collection
    It is thread safe
    Default capacity = 10
    When capacity exceeds → size doubles
    User can customize capacity using constructors
    Vector internally uses constructor chaining

6 .Example Program

Write a program to store 5 values in Vector and display them

import java.util.*;
public class Test 
{
    public static void main(String[] args) 
    {

        Vector v = new Vector(4,2);

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        System.out.println("Vector elements:");

        for(Object obj : v)
        {
            System.out.println(obj);
        }
        System.out.println("Size is "+v.size());
        System.out.println("Capacity after crossing "+v.capacity());
    }
}
Output
Vector elements:
10
20
30
40
50
Size is 5
Capacity after crossing 6

------------------------------------------------------------------------

Q9. Explain Cursors / Iterators in Collection and Why We Use Them
Cursor in Collection

A Cursor is used to retrieve (fetch) elements from a collection object one by one.

In Java Collection Framework, cursors help us traverse elements of a collection such as:
    ArrayList
    Vector
    LinkedList
    HashSet

Why We Use Cursor
    Cursor is used because:
    Collections store multiple elements
    To read elements one by one
    To traverse the collection

Types of Cursor in Java

There are five types of cursors in Java:
    Iterator
    Enumeration
    ListIterator
    Enhanced For Loop (for-each loop)
    forEach() method (introduced in JDK 1.8)
-------------------------------------------------------------------------
Q10. Explain Iterator Interface
Iterator Interface

Iterator is a cursor interface present in the java.util package.
It is used to traverse elements of a collection in forward direction only.

Iterator works with all collection classes such as:
    ArrayList
    Vector
    HashSet
    LinkedList

Syntax
Iterator i = collection.iterator();

Methods of Iterator Interface
1. boolean hasNext()
    This method checks whether the next element is present in the collection.
    Returns:
    true → if element exists
    false → if element does not exist

Example
while(i.hasNext())

2. Object next()
This method returns the next element and moves the cursor to the next position.

Example
Object obj = i.next();

3. void remove()
This method removes the current element from the collection using iterator.
Example
i.remove();

Example 1
WAP to store values in Vector and calculate sum using Iterator

import java.util.*;
public class VCAPP
{
    public static void main(String x[])
    {
        Vector v = new Vector();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        Iterator i = v.iterator();

        int sum = 0;

        while(i.hasNext())
        {
            Object obj = i.next();

            sum = sum + (int)obj;   // downcasting
            System.out.println(obj);
        }
        System.out.println("Sum is " + sum);
    }
}
Output
10
20
30
40
Sum is 100

Note
Iterator returns Object type.
To perform operations like addition or comparison, we must convert it to its original type using downcasting.

Example 2
WAP to find maximum value from Vector

import java.util.*;
public class MAXVECTAPP
{
    public static void main(String x[])
    {   
        Vector v = new Vector();
         
        v.add(9);
        v.add(2);
        v.add(12);
        v.add(43);
        v.add(5);

        int max = (int)v.get(0);

        Iterator i = v.iterator();

        while(i.hasNext())
        {
            Object obj = i.next();

            if((int)obj > max)
            {
                max = (int)obj;
            }
        }
        System.out.println("MAX value is " + max);
    }
}

Output
MAX value is 43

Example 3
WAP to sort Vector without using built-in sorting method

import java.util.*;
public class MAXVECTAPP
{
    public static void main(String x[])
    {
        Vector v = new Vector();

        v.add(9);
        v.add(2);
        v.add(12);
        v.add(43);
        v.add(5);

        int size = v.size();

        System.out.println("Vector before sort " + v);

        for(int i = 0; i < size; i++)
        {
            for(int j = i + 1; j < size; j++)
            {
                Object prev = v.get(i); 
                Object next = v.get(j);

                if((int)prev > (int)next)
                {
                    v.set(i, next);
                    v.set(j, prev);
                }
            }
        }
        System.out.println("Vector after sort " + v);
    }
}

Output
Vector before sort [9, 2, 12, 43, 5]
Vector after sort [2, 5, 9, 12, 43]

Important Points
    Cursor is used to traverse collection elements
    Iterator is the most commonly used cursor
    Iterator works only in forward direction
    Iterator provides hasNext(), next(), remove() methods
------------------------------------------------------------------------

Q11. Explain Enumeration Interface

Enumeration Interface

Enumeration is a cursor interface present in the java.util package.
It is used to retrieve (fetch) elements from a collection one by one.

Enumeration works mainly with legacy collection classes such as:
    Vector
    Stack
    Hashtable

Why Enumeration is called Read-Only Cursor
    Enumeration is called a read-only cursor because:
    It can only read (fetch) elements
    It cannot add elements
    It cannot remove elements
    So Enumeration is only used for traversal, not modification.

Creating Enumeration Object

To create a reference of Enumeration we use the elements() method available in legacy classes.

Syntax
    Enumeration ref = collection.elements();

Example                             
    Vector v = new Vector();
    Enumeration e = v.elements();

Methods of Enumeration Interface

1️⃣ boolean hasMoreElements()
This method checks whether more elements are available in the collection.
Returns:
true → if element exists
false → if no more elements exist

Example
Vector v = new Vector();
Enumeration e = v.elements();
while(e.hasMoreElements())

2️⃣ Object nextElement()
This method returns the next element from the collection and moves the cursor forward.

Example
Object obj = e.nextElement();

Example Program
WAP to store values in Vector and display them using Enumeration

import java.util.*;
public class EnumExample
{
    public static void main(String args[])
    {
        Vector v = new Vector();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        Enumeration e = v.elements();

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}
Output
10
20
30
40

------------------------------------------------------------------------
Q12. Explain ListIterator Interface
ListIterator Interface
 
ListIterator is a cursor interface present in the java.util package.
It is a child interface of the Iterator interface, so it contains all methods of Iterator along with some additional methods.

ListIterator is used to traverse elements of a List collection in both directions.

It works with List classes only, such as:
    ArrayList
    Vector
    LinkedList

Features of ListIterator
    Traverse elements forward and backward
    Add elements during traversal
    Remove elements
    Replace elements
    Works only with List type collections

Creating ListIterator Object
To create a ListIterator reference we use the listIterator() method.

Syntax
    ListIterator ref = collection.listIterator();
or
    ListIterator ref = collection.listIterator(int index);

Example

ListIterator it = list.listIterator(1);

Methods of ListIterator
1️⃣ boolean hasNext()
    Checks if the next element exists when moving forward.

2️⃣ E next()
    Returns the next element and moves the cursor forward.

3️⃣ boolean hasPrevious()
Checks if the previous element exists when moving backward.

4️⃣ E previous()
Returns the previous element and moves the cursor backward.

5️⃣ int nextIndex()
Returns the index of the next element during forward traversal.

6️⃣ int previousIndex()
Returns the index of the previous element during backward traversal.

7️⃣ void remove()
Removes the current element from the collection.

8️⃣ void set(E e)
Replaces the current element with a new element.

9️⃣ void add(E e)
Adds a new element into the collection during traversal.

Example
WAP to traverse Vector in forward direction using ListIterator

import java.util.*;
public class ListIteratorExample
{
    public static void main(String args[])
    {
        Vector v = new Vector();

        v.add(10);
        v.add(20);
        v.add(30);

        ListIterator it = v.listIterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
Output
10
20
30

Example
WAP to traverse Vector in backward direction

import java.util.*;
public class ListIteratorExample
{
    public static void main(String args[])
    {
        Vector v = new Vector();

        v.add(10);
        v.add(20);
        v.add(30);

        ListIterator it = v.listIterator(v.size());

        while(it.hasPrevious())
        {
            System.out.println(it.previous());
        }
    }
}

Output
30
20
10

Important Points
    ListIterator is a child interface of Iterator
    It allows bidirectional traversal
    It can add, remove, and replace/set  elements
    Works only with List collections
    Provides more functionality than Iterator

-----------------------------------------------------------------------
Example: WAP to perform the following operation on collection?
Case 1: Add New Element 
Case 2: View All Elements 
Case 3: Search element 
Case 4: delete element 
Case 5: return size of collection 
Case 6: search using index 
Etc 

import java.util.*;
public class CollApplication
{  
   public static void main(String x[])
   {  
      Vector v = new Vector();
      Scanner xyz  = new Scanner(System.in);
	  do{
	    System.out.println("1:Add New Element");
		System.out.println("2:View All");
		System.out.println("3:Search using contains");
		System.out.println("4:Delete ");
		System.out.println("5:return size");
		System.out.println("6:Search using index");
		System.out.println("Enter your choice");
		int choice = xyz.nextInt();
		switch(choice)
		{
		   case 1:
		   System.out.println("Enter data");
		   int data = xyz.nextInt();
		   boolean b = v.add(data);
		   if(b)
		   {
                System.out.println("data added");
		   }
		   else
            {
		        System.out.println("Data not added");
		    }
		   break;
		   case 2:
		   Iterator i = v.iterator();
		   while(i.hasNext())
		   { 
                Object obj = i.next();
		        System.out.println(obj);
		   }
		   break;
		   case 3:
		   System.out.println("enter data for search");
		   data = xyz.nextInt();
		   b = v.contains(data);
		   if(b)
		   { 
              System.out.println("Data found");
		   }
		   else
           {
		        System.out.println("data not found");
		   }
		   break;
		   case 4:
		    System.out.println("enter data for delete");
		    data = xyz.nextInt();
		    int index = v.indexOf(data);
			if(index!=-1)
			{  
                v.remove(index);
			}
			else
            {
			   System.out.println("Value not found");
			}
		   break;
		   case 5: 
		   System.out.println("Size of vector  "+v.size());
		   break;
		   case 6:
		   System.out.println("Enter data for search");
		    data = xyz.nextInt();
	        index = v.indexOf(data);
			if(index!=-1)
			{   
                System.out.println("Value found");
			}
			else
            {
			   System.out.println("Value not found");
			}
		   break;
		   case 7:
		   System.exit(0);
		   break;
		   default:
		   System.out.println("Wrong choice");  
		}
	  }
      while(true);//infinite loop 
   }
}
------------------------------------------------------------------------
How to Store User Defined Objects in Collection (Java)

In Java Collections, we can store user-defined objects (objects of our own class) such as Employee, Player, etc. inside collection classes like Vector, ArrayList, LinkedList, etc.

The collection actually stores objects as Object type, so when we retrieve them we must convert (typecast / downcast) them back to the original class.

Steps to Store User Defined Objects in Collection

    Create a user-defined class (POJO class) with fields, getters, and setters.
    Create objects of that class.
    Create a collection object like Vector, ArrayList, etc.
    Add objects to the collection using add() method.
    Retrieve objects using Iterator.
    Downcast the Object into the original class type to use its methods.

Example: Store Employee Objects in Collection
Step 1: Create Employee Class

class Employee 
{
    private int id;
    private String name;
    private int sal;

    public Employee(String name, int id, int sal) {
        this.name = name;
        this.id = id;
        this.sal = sal;
    }
<!-- 
    public void setId(int id)
    {
        this.id = id;
    }
    public void setName()
    {
        this.name = name;
    }
    public void setSal()
    {
        this.sal = sal;
    } -->

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public int getSal()
    {
        return sal;
    }
}

Step 2: Store Objects in Collection

import java.util.*;
public class EmployeeApplication 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();

<!-- Employee emp1 = new Employee();
        emp1.setName("ABC");
        emp1.setId(1);
        emp1.setSal(10000);

        Employee emp2 = new Employee();
        emp2.setName("MNO");
        emp2.setId(2);
        emp2.setSal(20000);

        Employee emp3 = new Employee();
        emp3.setName("STV");
        emp3.setId(3);
        emp3.setSal(14000);

        v.add(emp1);
        v.add(emp2);
        v.add(emp3); -->

<!-- Employee emp1 = new Employee("ABC",1,10000);
        Employee emp2 = new Employee("MNO",2,20000);
        Employee emp3 = new Employee("STV",3,3000);
        v.add(emp1);
        v.add(emp2);
        v.add(emp3); -->

        v.add(new Employee("ABC",1,10000));
        v.add(new Employee("MNO",2,20000));
        v.add(new Employee("STV",3,144000));

        Iterator i = v.iterator();

        while(i.hasNext()) 
        {
            Object obj = i.next();
            Employee e = (Employee)obj;   // Downcasting

            System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSal());
        }
    }
}

Example: Search Player by ID

import java.util.*;
class Player 
{
    private int id;
    private String name;
    private int run;

    public Player(String name, int id, int run) 
    {
        this.name = name;
        this.id = id;
        this.run = run;
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public int getRun() 
    {
        return run;
    }
}
public class PlayerApplication 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();

        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++) 
        {
            System.out.println("Enter name id and run");
            String name = sc.next(); // sc.nextLine();
            int id = sc.nextInt();
            int run = sc.nextInt();

            v.add(new Player(name, id, run));
        }

        System.out.println("Enter player id to search");
        int pid = sc.nextInt();

        Iterator it = v.iterator();
        boolean flag = false;

        while(it.hasNext()) 
        {
            Player p = (Player)it.next();  //downcasting 

            if(pid == p.getId()) 
            {
                flag = true;
                System.out.println("Player Found: "+p.getName()+" "+p.getRun());
                break;
            }
        }

        if(!flag) 
        {
            System.out.println("Player Not Found");
        }
    }
}
<!-- 
import java.util.*;
public class PlayerApplication
{
    public static void main(String x[])
    {
        Vector v = new Vector();

        Scanner sc = new Scanner(System.in);

        Player p[] = new Player[5];

        for(int i=0; i<p.length; i++)
        {
            System.out.println("Enter name, id, run");

            String name = sc.next();
            int id = sc.nextInt();
            int run = sc.nextInt();

            p[i] = new Player(name,id,run);
            v.add(p[i]);
        }

        System.out.println("Display all player records");

        Iterator it = v.iterator();

        while(it.hasNext())
        {
            Object obj = it.next();
            Player p1 = (Player)obj;

            System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getRun());
        }

        System.out.println("Enter the player id");
        int pid = sc.nextInt(); 

        it = v.iterator();
        boolean flag = false;

        while(it.hasNext())
        {
            Object obj = it.next();
            Player p1 = (Player)obj;

            if(pid == p1.getId())
            {
                flag = true;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Player found");
        }
        else
        {
            System.out.println("Player not found");
        }
    }
} -->

----------------------------------------------------------------------------------------------------------------------------------------
Q13. Difference Between Iterator and Enumeration

| Enumeration                                                                 | Iterator                                               |
| --------------------------------------------------------------------------- | ------------------------------------------------------ |
| Works only with **legacy collections** like `Vector`, `Stack`, `Hashtable`. | Works with **both legacy and non-legacy collections**. |
| It is a **read-only cursor** (cannot modify the collection).                | Can **remove elements** from the collection.           |
| Created using **elements()** method.                                        | Created using **iterator()** method.                   |
| Methods: `hasMoreElements()`, `nextElement()`.                              | Methods: `hasNext()`, `next()`, `remove()`.            |
| It is an **older interface**.                                               | It is a **modern and universal cursor**.               |



Q14. Difference Between Iterator and ListIterator
| Iterator                                                      | ListIterator                                                                                 |
| ------------------------------------------------------------- | -------------------------------------------------------------------------------------------- |
| Works with **all collection types** (`Set`, `Queue`, `List`). | Works **only with List collections** like `ArrayList`, `LinkedList`.                         |
| Traverses **only in forward direction**.                      | Traverses **both forward and backward directions**.                                          |
| Can **remove elements only**.                                 | Can **add, remove, and replace elements**.                                                   |
| Created using **iterator()** method.                          | Created using **listIterator()** method.                                                     |
| Methods: `hasNext()`, `next()`, `remove()`.                   | Methods: `hasNext()`, `next()`, `hasPrevious()`, `previous()`, `add()`, `set()`, `remove()`. |
| It is the **parent interface**.                               | It is the **child interface of Iterator**.                                                   |
------------------------------------------------------------------------
Q15. Explain Enhanced For Loop (For-Each Loop)

Enhanced for loop was introduced in Java JDK 1.5.
It is used to traverse elements of arrays and collections easily.

Features

    No need for index variable initialization.
    No need to write condition or increment statement.
    Automatically fetches elements until all elements are processed.
    Traverses only in forward direction.

Syntax
for(datatype variable : collection_or_array)
{
    // statements
}
Example

import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
        <!-- int arr[] = new int(){10,20,30,40,50};  -->
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

<!-- for(int val:arr) -->
        for(int num : list)
        {
            System.out.println(num);
        }
    }
}
Output
10
20
30

import java.util.*;
public class VectApp
{
    public static void main(String x[])
    {
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        for(Object val:v)
        {
            System.out.println(val);
        }
    }
}
------------------------------------------------------------------------
Q17. What is FailFast and FailSafe in Collection?

1. Fail-Fast in Collection
Fail-Fast means when we are reading a collection using Iterator or ListIterator and at the same time we try to modify the collection using the collection object, the program immediately throws a runtime exception called ConcurrentModificationException.

So the collection fails immediately when modification is detected.

Example situation:
    Iterating a list using Iterator
    Modifying the list using list.add() or list.remove() simultaneously

Then Java throws ConcurrentModificationException.

Example

ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);

Iterator<Integer> it = list.iterator();

while(it.hasNext())
{
    list.add(30);   // modification during iteration
    System.out.println(it.next());
}

output:
This will cause ConcurrentModificationException.

Important Point
    Most collections like ArrayList, HashMap, Vector use Fail-Fast iterators.

2. Fail-Safe in Collection

Fail-Safe means we can read and modify the collection at the same time without getting an exception.
Fail-Safe collections work on a copy of the original collection, so modification does not affect the iterator.

Examples of Fail-Safe collections
CopyOnWriteArrayList
ConcurrentHashMap

Example

CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
list.add(10);
list.add(20);

for(Integer n : list)
{
    list.add(30);   // allowed
    System.out.println(n);
}

Here no exception occurs.

3. How to achieve safe operation?
We can achieve safe operation using:
1) Iterator methods
    remove()
    add() (using ListIterator)

example:

import java.util.*;

public class VectApp
{
    public static void main(String x[])
    {
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        ListIterator i = v.listIterator(0);
        System.out.println(v);

        while(i.hasNext())
        {
            Object obj = i.next();
            if((int)obj == 30)
            {
                i.add(100);
            } 
        }
        System.out.println(v);
    }
}

output:
[10, 20, 30, 40, 50]
[10, 20, 30, 100, 40, 50]

2) Concurrent Collection API

CopyOnWriteArrayList 
    is a class in which a new copy of the array is created whenever a modification (add, remove, update) occurs.
ConcurrentHashMap
    is a thread-safe Map class used when multiple threads access and modify a Map at the same time.

import java.util.*;
import java.util.concurrent.*;

public class vectApp
{
    public static void main(String x[])
    {
        CopyOnWriteArrayList v = new CopyOnWriteArrayList();

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        Iterator i = v.iterator();

        System.out.println(v);

        while(i.hasNext())
        {
            Object obj = i.next();

            if((int)obj == 30)
            {
                v.add(100);
            }
        }

        System.out.println(v);
    }
}

Output :
[10, 20, 30, 40]
[10, 20, 30, 40, 100]
---------------------------------------------------------------------
Q18. Explain the ArrayList Class

ArrayList is a class of the Java Collection Framework that implements the List interface.
It works like a dynamic array, meaning its size can grow automatically.

Important Points
    ArrayList is a non-legacy collection.
    It is not thread-safe (methods are not synchronized).
    It is recommended for non-multithreaded environments.
    Default capacity = 10
    When capacity is exceeded, it increases by 50% (1.5 times).
    It allows duplicate elements.
    It maintains insertion order.

Constructors of ArrayList
1. Default Constructor
    Creates an ArrayList with default capacity 10.
    ArrayList list = new ArrayList();

2. Parameterized Constructor
    ArrayList list = new ArrayList(int initialCapacity);
    Used to set initial capacity manually.

3. Collection Constructor
    ArrayList list = new ArrayList(Collection c);
    Creates an ArrayList from another collection.
    this constructor can accept data from another collection and store in ArrayList.


import java.util.*;
public class VectApp
{
    public static void main(String x[])
    {
        ArrayList al = new ArrayList(); //default
        <!-- ArrayList list = new ArrayList(10); --> //parametrized

        al.add(100);
        al.add(200);
        al.add(300);

        Iterator i = al.iterator();

        while(i.hasNext())
        {
            Object obj = i.next();
            System.out.println(obj);
        }
    }
}

import java.util.*;
public class Test 
{
    public static void main(String[] args) 
    {
        Vector v = new Vector();
        v.add(10);
        v.add(20);
        v.add(30);

        ArrayList list = new ArrayList(v); //collection constructor

        System.out.println(list);
    }
}

Q19. Difference between Vector and ArrayList

| Feature           | Vector                                  | ArrayList                                 |
| ----------------- | --------------------------------------- | ----------------------------------------- |
| **Type**          | Legacy class                            | Non-legacy class                          |
| **Package**       | `java.util`                             | `java.util`                               |
| **Thread Safety** | Synchronized (Thread-safe)              | Not synchronized (Not thread-safe)        |
| **Performance**   | Slower (due to synchronization)         | Faster                                    |
| **Memory Growth** | Increases capacity by **double (100%)** | Increases capacity by **50% (1.5 times)** |
| **Usage**         | Used in multi-threaded environment      | Used in single-threaded environment       |
| **Iterator**      | Enumeration + Iterator                  | Iterator + ListIterator                   |


-----------------------------------------------------------------------

Payroll Management Mini Project (Collection Framework)
Objective

To build an application for:
Managing departments
Managing employees
Maintaining attendance
Calculating salary

Features
Add Department
View Department
Delete Department
Update Department

Add Employee and assign to department
View all employees
View department-wise employees
Maintain employee attendance
Calculate employee salary
Find average salary of company
Find department-wise salary expenses

Project Code Structure
1. ClientApplication

Responsible for:
Accepting input
Displaying output

Example:

public class ClientApplication
{
    public static void main(String args[])
    {

    }
}

2. Model Layer
Model classes store data using getter and setter methods.
Example classes:
Employee
Department

Example:

class Employee
{
    private int id;
    private String name;
    private double salary;

    // getter and setter
}

3. Service Layer
Service layer contains business logic.

Examples:
salary calculation
attendance management
average salary

4. Repository Layer
Repository layer handles data storage.

In this project:
Collections are used as a temporary database.

Example collections:
ArrayList
HashMap

Relationship Between Department and Employee
Department HAS-A list of employees.

Example:

class Department
{
    private int deptId;
    private String deptName;
    private ArrayList<Employee> employees;
}

Meaning:
Department → contains → List of Employees
-------------------------------------------------------------------------
✅ Combined Payroll Management Code

import java.util.*;

// -------------------- MODEL CLASSES --------------------

class Employee
{
    private int id;
    private String name;
    private double perDaySalary;
    private int attendance;
    private int deptId;

    public Employee(int id, String name, double perDaySalary, int deptId)
    {
        this.id = id;
        this.name = name;
        this.perDaySalary = perDaySalary;
        this.deptId = deptId;
        this.attendance = 0;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPerDaySalary() { return perDaySalary; }
    public int getAttendance() { return attendance; }
    public int getDeptId() { return deptId; }

    public void setAttendance(int attendance)
    {
        this.attendance = attendance;
    }

    public double calculateSalary()
    {
        return perDaySalary * attendance;
    }
}

// ------------------------------------------------------

class Department
{
    private int deptId;
    private String deptName;
    private ArrayList<Employee> empList;

    public Department(int deptId, String deptName)
    {
        this.deptId = deptId;
        this.deptName = deptName;
        empList = new ArrayList<>();
    }

    public int getDeptId() { return deptId; }
    public String getDeptName() { return deptName; }
    public ArrayList<Employee> getEmpList() { return empList; }
}

// -------------------- REPOSITORY --------------------

class PayrollRepository
{
    private ArrayList<Department> deptList = new ArrayList<>();

    public void addDepartment(Department d)
    {
        deptList.add(d);
    }

    public ArrayList<Department> getDepartments()
    {
        return deptList;
    }

    public Department findDept(int id)
    {
        for(Department d : deptList)
        {
            if(d.getDeptId() == id)
                return d;
        }
        return null;
    }
}

// -------------------- SERVICE --------------------

class PayrollService
{
    private PayrollRepository repo = new PayrollRepository();

    public void addDepartment(int id, String name)
    {
        repo.addDepartment(new Department(id, name));
    }

    public void viewDepartments()
    {
        for(Department d : repo.getDepartments())
        {
            System.out.println(d.getDeptId() + " " + d.getDeptName());
        }
    }

    public void addEmployee(int id, String name, double salary, int deptId)
    {
        Department d = repo.findDept(deptId);
        if(d != null)
        {
            d.getEmpList().add(new Employee(id, name, salary, deptId));
        }
        else
        {
            System.out.println("Department not found!");
        }
    }

    public void viewEmployees()
    {
        for(Department d : repo.getDepartments())
        {
            for(Employee e : d.getEmpList())
            {
                System.out.println(e.getId() + " " + e.getName());
            }
        }
    }

    public void markAttendance(int empId, int days)
    {
        for(Department d : repo.getDepartments())
        {
            for(Employee e : d.getEmpList())
            {
                if(e.getId() == empId)
                {
                    e.setAttendance(days);
                }
            }
        }
    }

    public void calculateSalary(int empId)
    {
        for(Department d : repo.getDepartments())
        {
            for(Employee e : d.getEmpList())
            {
                if(e.getId() == empId)
                {
                    System.out.println("Salary: " + e.calculateSalary());
                }
            }
        }
    }

    public void avgSalary()
    {
        double total = 0;
        int count = 0;

        for(Department d : repo.getDepartments())
        {
            for(Employee e : d.getEmpList())
            {
                total += e.calculateSalary();
                count++;
            }
        }

        if(count > 0)
            System.out.println("Average Salary: " + (total / count));
    }

    public void deptExpense()
    {
        for(Department d : repo.getDepartments())
        {
            double sum = 0;

            for(Employee e : d.getEmpList())
            {
                sum += e.calculateSalary();
            }

            System.out.println(d.getDeptName() + " Expense: " + sum);
        }
    }
}

// -------------------- CLIENT APPLICATION --------------------

public class ClientApplication
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        PayrollService service = new PayrollService();

        while(true)
        {
            System.out.println("\n1.Add Dept");
            System.out.println("2.View Dept");
            System.out.println("3.Add Employee");
            System.out.println("4.View Employees");
            System.out.println("5.Mark Attendance");
            System.out.println("6.Calculate Salary");
            System.out.println("7.Average Salary");
            System.out.println("8.Dept Expense");
            System.out.println("9.Exit");

            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Enter Dept ID and Name:");
                    service.addDepartment(sc.nextInt(), sc.next());
                    break;

                case 2:
                    service.viewDepartments();
                    break;

                case 3:
                    System.out.println("Enter Emp ID, Name, Salary, DeptID:");
                    service.addEmployee(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextInt());
                    break;

                case 4:
                    service.viewEmployees();
                    break;

                case 5:
                    System.out.println("Enter EmpID and Days:");
                    service.markAttendance(sc.nextInt(), sc.nextInt());
                    break;

                case 6:
                    System.out.println("Enter EmpID:");
                    service.calculateSalary(sc.nextInt());
                    break;

                case 7:
                    service.avgSalary();
                    break;

                case 8:
                    service.deptExpense();
                    break;

                case 9:
                    System.exit(0);
            }
        }
    }
}
-------------------------------------------------------------------------
import java.util.*;

// -------------------- MODEL CLASSES --------------------

class Voter
{
    private int voterId;
    private String name;
    private boolean hasVoted;

    public Voter(int voterId, String name)
    {
        this.voterId = voterId;
        this.name = name;
        this.hasVoted = false;
    }

    public int getVoterId() { return voterId; }
    public String getName() { return name; }
    public boolean isHasVoted() { return hasVoted; }

    public void setHasVoted(boolean hasVoted)
    {
        this.hasVoted = hasVoted;
    }
}

// ------------------------------------------------------

class Candidate
{
    private int candidateId;
    private String name;
    private int votes;

    public Candidate(int candidateId, String name)
    {
        this.candidateId = candidateId;
        this.name = name;
        this.votes = 0;
    }

    public int getCandidateId() { return candidateId; }
    public String getName() { return name; }
    public int getVotes() { return votes; }

    public void addVote()
    {
        votes++;
    }
}

// -------------------- REPOSITORY --------------------

class VotingRepository
{
    private ArrayList<Voter> voters = new ArrayList<>();
    private ArrayList<Candidate> candidates = new ArrayList<>();

    public void addVoter(Voter v)
    {
        voters.add(v);
    }

    public void addCandidate(Candidate c)
    {
        candidates.add(c);
    }

    public ArrayList<Voter> getVoters()
    {
        return voters;
    }

    public ArrayList<Candidate> getCandidates()
    {
        return candidates;
    }

    public Voter findVoter(int id)
    {
        for(Voter v : voters)
        {
            if(v.getVoterId() == id)
                return v;
        }
        return null;
    }

    public Candidate findCandidate(int id)
    {
        for(Candidate c : candidates)
        {
            if(c.getCandidateId() == id)
                return c;
        }
        return null;
    }
}

// -------------------- SERVICE --------------------

class VotingService
{
    private VotingRepository repo = new VotingRepository();

    public void addVoter(int id, String name)
    {
        repo.addVoter(new Voter(id, name));
    }

    public void addCandidate(int id, String name)
    {
        repo.addCandidate(new Candidate(id, name));
    }

    public void viewVoters()
    {
        for(Voter v : repo.getVoters())
        {
            System.out.println(v.getVoterId() + " " + v.getName() + " Voted: " + v.isHasVoted());
        }
    }

    public void viewCandidates()
    {
        for(Candidate c : repo.getCandidates())
        {
            System.out.println(c.getCandidateId() + " " + c.getName() + " Votes: " + c.getVotes());
        }
    }

    public void vote(int voterId, int candidateId)
    {
        Voter v = repo.findVoter(voterId);
        Candidate c = repo.findCandidate(candidateId);

        if(v == null || c == null)
        {
            System.out.println("Invalid Voter or Candidate!");
            return;
        }

        if(v.isHasVoted())
        {
            System.out.println("You have already voted!");
        }
        else
        {
            c.addVote();
            v.setHasVoted(true);
            System.out.println("Vote successful!");
        }
    }

    public void showResult()
    {
        Candidate winner = null;

        for(Candidate c : repo.getCandidates())
        {
            if(winner == null || c.getVotes() > winner.getVotes())
            {
                winner = c;
            }
        }

        if(winner != null)
        {
            System.out.println("Winner: " + winner.getName() + " with votes: " + winner.getVotes());
        }
    }
}

// -------------------- CLIENT APPLICATION --------------------

public class VotingApplication
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        VotingService service = new VotingService();

        while(true)
        {
            System.out.println("\n1.Add Voter");
            System.out.println("2.Add Candidate");
            System.out.println("3.View Voters");
            System.out.println("4.View Candidates");
            System.out.println("5.Vote");
            System.out.println("6.Show Result");
            System.out.println("7.Exit");

            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Enter Voter ID and Name:");
                    service.addVoter(sc.nextInt(), sc.next());
                    break;

                case 2:
                    System.out.println("Enter Candidate ID and Name:");
                    service.addCandidate(sc.nextInt(), sc.next());
                    break;

                case 3:
                    service.viewVoters();
                    break;

                case 4:
                    service.viewCandidates();
                    break;

                case 5:
                    System.out.println("Enter VoterID and CandidateID:");
                    service.vote(sc.nextInt(), sc.nextInt());
                    break;

                case 6:
                    service.showResult();
                    break;

                case 7:
                    System.exit(0);
            }
        }
    }
}
-------------------------------------------------------------------
Q20. Explain the LinkedList class of List interface

LinkedList is a class in Java that implements the List interface.
It is implemented as a doubly linked list.
Each node stores:
    Data
    Address of previous node
    Address of next node

Key Features
    Dynamic in size
    Allows duplicate elements
    Maintains insertion order
    Efficient insertion and deletion

Time Complexity
    Insertion/Deletion → O(1) (if position/node is known)
    Searching → O(n)

Constructors
    1. LinkedList()
    → Creates empty linked list
    2.LinkedList(Collection c)
    → Creates list and copies elements from another collection

Q21. Difference between ArrayList and LinkedList
| Feature            | ArrayList       | LinkedList                |
| ------------------ | --------------- | ------------------------- |
| Structure          | Dynamic Array   | Doubly Linked List        |
| Memory             | Continuous      | Non-contiguous            |
| Insertion/Deletion | Slow (O(n))     | Fast (O(1) if node known) |
| Searching          | Fast (O(1))     | Slow (O(n))               |
| Shifting           | Required        | Not required              |
| Performance        | Better for read | Better for insert/delete  |


ArrayList
Uses index-based access → faster retrieval
Needs shifting → slower insert/delete

LinkedList
No shifting needed
Must traverse nodes → slower search

Example Code
import java.util.*;

public class TestLinkedListApplication
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator i = list.iterator();

        while(i.hasNext())
        {
            Object obj = i.next();
            System.out.println(obj);
        }
    }
}
-----------------------------------------------------------------------
Q22. Explain Stack class and relation between Vector and Stack

Stack is a class in Java that follows LIFO (Last In First Out) principle.

It is a child class of Vector
So it inherits all properties of Vector

Stack Hierarchy
Object
   ↓
Vector
   ↓
Stack

Methods of Stack
    1. void push(E) → Add element
    2. Object pop() → Remove top element
    3. Object peek() → View top element
    4. boolean isEmpty() → Check empty or not
    5.int search(Object) → Search element

Example Code

import java.util.*;
public class StackExample
{
    public static void main(String[] args)
    {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top: " + s.peek());

        while(!s.isEmpty())
        {
            System.out.println("Pop: " + s.pop());
        }
    }
}
-----------------------------------------------------------------------
Example Code
import java.util.*;

public class TestLinkedListApplication
{
    public static void main(String args[])
    {
        Stack s = new Stack();
        Scanner sc = new Scanner(System.in);
        int choice;

        do
        {
            System.out.println("\n1:PUSH");
            System.out.println("2:POP");
            System.out.println("3:DISPLAY");
            System.out.println("4:PEEK");
            System.out.println("5:SEARCH");
            System.out.println("6:EXIT");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter value: ");
                    int value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    if(s.isEmpty())
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        Object obj = s.pop();
                        System.out.println("Removed: " + obj);
                    }
                    break;

                case 3:
                    if(s.isEmpty())
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        ListIterator li = s.listIterator(s.size());
                        while(li.hasPrevious())
                        {
                            System.out.println(li.previous());
                        }
                    }
                    break;

                case 4:
                    if(s.isEmpty())
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.println("Top element: " + s.peek());
                    }
                    break;

                case 5:
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();

                    int index = s.search(value);

                    if(index != -1)
                    {
                        System.out.println("Value found at position: " + (s.size() - index));
                    }
                    else
                    {
                        System.out.println("Value not found");
                    }
                    break;

                case 6:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }

        } while(true);
    }
}
----------------------------------------------------------------------

Q23. Is Stack thread safe or not? Why?
Yes, Stack is thread-safe.
Reason:
    Stack is a child of Vector
    Vector methods are synchronized
    Therefore, Stack methods are also synchronized
-----------------------------------------------------------------------
Q24. Explain Set collection and why use Set?
    Set is a collection that stores unique elements.
Key Features
    No duplicate elements allowed
    No index-based access
    Uses hashing internally
    Some implementations maintain order
Why use Set?
    To store unique data
    To remove duplicates
    To maintain sorted or insertion order (depending on implementation)

Q25. Types of Set collection
1. HashSet
    HashSet
        Stores unique elements
        Does not maintain order (random order)
        Uses hashing

2. LinkedHashSet
    LinkedHashSet
        Stores unique elements
        Maintains insertion order

3. sorted set/ TreeSet
    TreeSet
        Stores unique elements
        Maintains sorted order (ascending)
        Uses tree structure

✅ Final Quick Revision
LinkedList → Doubly linked, fast insert/delete
ArrayList → Fast search, slow insert/delete
Stack → LIFO, child of Vector
Stack → Thread-safe
Set → Unique data only
HashSet → Random
LinkedHashSet → Ordered
TreeSet → Sorted
-------------------------------------------------
Q26. Explain the HashSet in detail

HashSet is a class in Java that implements the Set interface.

Key Features
Stores unique elements only (no duplicates)
Does not maintain insertion order (random order)
Allows one null value
Uses hashing mechanism internally
Internally uses HashMap

How HashSet Works
When you add an element:
Hash code is generated
Bucket is selected
Equals method checks duplication

Constructors

HashSet()
→ Default capacity = 16, Load factor = 0.75

HashSet(int initialCapacity)
→ User-defined capacity

HashSet(int initialCapacity, float loadFactor)
→ Custom capacity + load factor

HashSet(Collection c)
→ Copy elements from another collection

Example
import java.util.*;

public class SetApplication
{
    public static void main(String[] args)
    {
        HashSet hs = new HashSet();

        hs.add(5);
        hs.add(100);
        hs.add(55);
        hs.add(22);
        hs.add(24);
        hs.add(24);   // duplicate ignored
        hs.add(100);  // duplicate ignored

        for(Object obj : hs)
        {
            System.out.println(obj);
        }
    }
}

-------------------------------------------------

Q27. Explain LinkedHashSet in detail

LinkedHashSet is a class that extends HashSet.


Key Features
    Stores unique elements
    Maintains insertion order
    Uses LinkedHashMap internally
    Slightly slower than HashSet

Constructors
    LinkedHashSet()
    LinkedHashSet(int capacity)
    LinkedHashSet(int capacity, float loadFactor)
    LinkedHashSet(Collection c)

Example

import java.util.*;
public class SetApplication
{
    public static void main(String[] args)
    {
        LinkedHashSet hs = new LinkedHashSet();

        hs.add(5);
        hs.add(100);
        hs.add(55);
        hs.add(22);
        hs.add(24);

        for(Object obj : hs)
        {
            System.out.println(obj); // maintains insertion order
        }
    }
}
----------------------------------------------------------------

Q28. Explain TreeSet in detail

TreeSet is a class that implements SortedSet.

Key Features
Stores unique elements
Maintains sorted order (ascending by default)
Uses tree structure (Red-Black Tree)
Does not allow null (in most cases)

Constructors
TreeSet()
TreeSet(Comparator c)
TreeSet(Collection c)

Example

import java.util.*;
public class SetApplication
{
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet();

        ts.add(5);
        ts.add(100);
        ts.add(55);
        ts.add(22);
        ts.add(24);

        for(Object obj : ts)
        {
            System.out.println(obj); // sorted output
        }
    }
}

🔴 Important Concept (Very Important for Exams)
Why Set Allows Duplicate User-Defined Objects?
👉 Your statement needs correction:
Set does NOT allow duplicates
But duplicates appear when:
equals() is not overridden
hashCode() is not overridden
Default Behavior
Every object has different hashCode, so Set treats them as different objects.

✅ Solution: Override equals() and hashCode()
Rules
If objects are equal → hashCode must be same
equals() → compare data
hashCode() → generate same hash for same data

Correct Example

import java.util.*;
class Employee
{
    private int id;
    private String name;

    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public boolean equals(Object obj)
    {
        Employee e = (Employee)obj;
        return this.id == e.id && this.name.equals(e.name);
    }

    public int hashCode()
    {
        return id * 100;
    }

    public String toString()
    {
        return id + " " + name;
    }
}

public class SetApplication
{
    public static void main(String[] args)
    {
        HashSet<Employee> hs = new HashSet<>();

        hs.add(new Employee("ABC",1));
        hs.add(new Employee("ABC",1)); // duplicate

        for(Employee e : hs)
        {
            System.out.println(e);
        }
    }
}

👉 Output will contain only one object ✅
⚠️ Important Corrections in Your Theory
❌ Wrong:
JVM cannot generate same hashcode
✔ Correct:

JVM can generate same hashcode (collision possible)

But equals() confirms actual equality

✅ Final Quick Revisio
HashSet → unique + random order
LinkedHashSet → unique + insertion order
TreeSet → unique + sorted order
Duplicate issue → fix using equals() + hashCode()