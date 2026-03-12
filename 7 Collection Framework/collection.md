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

public class Test {
    public static void main(String[] args) {

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

--------------------------------------------------------------------------

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


