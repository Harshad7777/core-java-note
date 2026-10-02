# Collection Framework in Java

[Overview](#collection-framework-overview) | [Iterable & Collection](#iterable-and-collection) | [List](#list-interface) | [Set](#set-interface) | [Map](#map-interface) | [Cursors](#cursors-in-collection-framework) | [Generics](#generics) | [Wrapper Classes](#wrapper-classes) | [Collections Utility](#collections-class)

---

## Collection Framework Overview

A collection is a ready-made implementation of a data structure provided by Java. It is used to store and manage a group of objects dynamically.

### Why use Collection Framework?

- dynamic storage of objects
- automatic resizing
- built-in operations like add, remove, search, sort
- type safety through generics
- reduces manual data-structure coding

### Limitations of Object Arrays

If we use an `Object[]`, we can store different types of data, but it has drawbacks:

- fixed size
- no built-in methods for search, sort, and manipulation
- type safety is poor
- code becomes messy and less reusable

Because of these limitations, Java provides the Collection Framework.

### Main hierarchy

```java
java.lang.Iterable
    |
java.util.Collection
    |
    +-- List
    +-- Set
    +-- Queue
```

`Map` is separate from the Collection hierarchy but is very commonly used with collections.

---

## Iterable and Collection

### Iterable Interface

`Iterable` is the root interface of the Java Collection Framework.

It is present in `java.lang` and is used to iterate through elements of a collection.

```java
public interface Iterable<T>
{
    Iterator<T> iterator();
}
```

### Iterator Interface

`Iterator` is present in `java.util` and is used to fetch collection elements one by one.

```java
public interface Iterator<E>
{
    boolean hasNext();
    E next();
    default void remove();
}
```

#### Important methods

- `hasNext()` → checks if more elements exist
- `next()` → returns the next element
- `remove()` → removes current element during iteration

### Example

```java
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
```

Output:

```java
10
20
30
```

### Collection Interface

`Collection` is a root interface of the framework (except `Map`).

It extends `Iterable` and provides common methods like:

- `int size()`
- `boolean isEmpty()`
- `boolean contains(Object o)`
- `Iterator<E> iterator()`
- `Object[] toArray()`
- `boolean add(E e)`
- `boolean remove(Object o)`
- `boolean containsAll(Collection<?> c)`
- `boolean addAll(Collection<? extends E> c)`
- `boolean removeAll(Collection<?> c)`

### Example of collection methods

```java
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.size());
        System.out.println(list.contains(20));
        System.out.println(list.isEmpty());
    }
}
```

---

## List Interface

`List` is an ordered collection that allows duplicate elements.

### Features

- maintains insertion order
- allows duplicates
- supports index-based access
- supports `ListIterator`

### Common list implementations

- `ArrayList`
- `LinkedList`
- `Vector`
- `Stack`

### Example

```java
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
        System.out.println(list.get(1));
    }
}
```

### Important List Methods

- `indexOf(Object obj)` → first matching index
- `lastIndexOf(Object obj)` → last matching index
- `subList(int fromIndex, int toIndex)` → returns a sublist
- `listIterator()` → traverses in both directions

### Example of `subList()`

```java
List<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);
list.add(40);

System.out.println(list.subList(1, 3));
```

Output:

```java
[20, 30]
```

---

## ArrayList

`ArrayList` is a dynamic array implementation of `List`.

### Features

- dynamic size
- non-legacy collection
- insertion order is maintained
- faster for retrieval
- slower for insertion/deletion in middle

### Constructors

```java
ArrayList<Integer> list1 = new ArrayList<>();
ArrayList<Integer> list2 = new ArrayList<>(10);
ArrayList<Integer> list3 = new ArrayList<>(list1);
```

### Example

```java
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}
```

### ArrayList vs Array

| Feature | ArrayList | Array |
| ------- | --------- | ----- |
| Size | Dynamic | Fixed |
| Package | java.util | java.lang |
| Data type | Objects only | Primitive + objects |
| Memory | Resizable | Fixed |
| Methods | Many built-in methods | Few methods |

---

## LinkedList

`LinkedList` is a doubly linked list implementation of `List`.

### Features

- each node stores data and pointer to next/previous node
- fast insertion/deletion
- slower searching than ArrayList

### Time complexity

- insertion/deletion: O(1) if node position is known
- searching: O(n)

### Example

```java
import java.util.*;

public class TestLinkedList
{
    public static void main(String[] args)
    {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
    }
}
```

### ArrayList vs LinkedList

| Feature | ArrayList | LinkedList |
| ------- | --------- | ---------- |
| Structure | Dynamic array | Doubly linked list |
| Memory | Contiguous | Non-contiguous |
| Insert/Delete | Slow | Fast |
| Search | Fast | Slow |

---

## Vector

`Vector` is a legacy class and is thread-safe.

### Features

- dynamic array
- synchronized methods
- legacy collection
- introduced before Java 1.2

### Why Vector is thread-safe?

Its methods are synchronized, so multiple threads can use it safely.

### Constructors

```java
Vector<Integer> v1 = new Vector<>();
Vector<Integer> v2 = new Vector<>(5);
Vector<Integer> v3 = new Vector<>(5, 2);
```

### Example

```java
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println(v);
    }
}
```

### Vector vs ArrayList

| Feature | Vector | ArrayList |
| ------- | ------ | --------- |
| Thread-safe | Yes | No |
| Performance | Slower | Faster |
| Legacy | Yes | No |
| Capacity growth | Doubles | 1.5x |

---

## Stack

`Stack` is a subclass of `Vector` and follows the LIFO principle.

### Methods

- `push(E item)`
- `pop()`
- `peek()`
- `empty()`
- `search(Object o)`

### Example

```java
import java.util.*;

public class StackExample
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
```

### Stack is thread-safe?

Yes, because it extends `Vector`, and `Vector` methods are synchronized.

---

## Cursors in Collection Framework

A cursor is used to traverse elements of a collection one by one.

### Types of cursors

- `Iterator`
- `ListIterator`
- `Enumeration`
- `for-each` loop

### Iterator

Used for forward traversal only.

```java
Iterator<Integer> it = list.iterator();
while (it.hasNext())
{
    System.out.println(it.next());
}
```

### Enumeration

Read-only cursor; mainly used with legacy classes like `Vector`.

```java
Enumeration<Integer> e = v.elements();
while (e.hasMoreElements())
{
    System.out.println(e.nextElement());
}
```

### ListIterator

Used with `List` implementations and allows both forward and backward traversal.

```java
ListIterator<Integer> it = list.listIterator();
while (it.hasNext())
{
    System.out.println(it.next());
}
```

### Enhanced for loop

```java
for (int n : list)
{
    System.out.println(n);
}
```

---

## Iterator vs Enumeration vs ListIterator

| Cursor | Direction | Modification | Works With |
| ------ | --------- | ------------ | ---------- |
| Iterator | Forward only | Remove allowed | All collections |
| Enumeration | Forward only | Read-only | Legacy collections |
| ListIterator | Forward + backward | Add, remove, set | List only |

---

## Fail-Fast vs Fail-Safe

### Fail-Fast

Fail-fast iterators throw `ConcurrentModificationException` if the collection is modified during iteration.

Example:

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);
list.add(20);

Iterator<Integer> it = list.iterator();
while (it.hasNext())
{
    list.add(30);   // modification during iteration
    System.out.println(it.next());
}
```

### Fail-Safe

Fail-safe collections work on a copy of the data; modification during iteration does not cause exception.

Examples:

- `CopyOnWriteArrayList`
- `ConcurrentHashMap`

---

## Set Interface

`Set` stores unique elements only.

### Features

- no duplicate elements
- no index-based access
- some implementations maintain order

### Common implementations

- `HashSet`
- `LinkedHashSet`
- `TreeSet`

### Example

```java
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20); // duplicate, ignored
        System.out.println(set);
    }
}
```

---

## HashSet

`HashSet` stores unique elements using hashing.

### Features

- no duplicates
- no insertion order guarantee
- allows one null value
- average O(1) for add/search/remove

```java
Set<String> set = new HashSet<>();
set.add("Java");
set.add("Python");
set.add("Java");
System.out.println(set);
```

---

## LinkedHashSet

`LinkedHashSet` extends `HashSet` and preserves insertion order.

### Features

- unique elements
- maintains insertion order
- slightly slower than `HashSet`

---

## TreeSet

`TreeSet` stores unique elements in sorted order.

### Features

- sorted ascending order
- uses tree structure
- no null key in most cases
- O(log n)

```java
TreeSet<Integer> set = new TreeSet<>();
set.add(30);
set.add(10);
set.add(20);
System.out.println(set);
```

### HashSet vs LinkedHashSet vs TreeSet

| Feature | HashSet | LinkedHashSet | TreeSet |
| ------- | ------- | ------------- | ------- |
| Order | Random | Insertion order | Sorted order |
| Null | One null | One null | Usually not allowed |
| Performance | O(1) average | O(1) average | O(log n) |
| Data structure | HashMap | LinkedHashMap | TreeMap |

---

## NavigableSet

`NavigableSet` is used for sorted data with extra operations.

### Useful methods

- `descendingSet()`
- `ceiling(E e)`
- `floor(E e)`
- `higher(E e)`
- `lower(E e)`

Example:

```java
NavigableSet<Integer> set = new TreeSet<>();
set.add(5);
set.add(10);
set.add(20);
set.add(30);

System.out.println(set.higher(10));
System.out.println(set.lower(20));
```

---

## Why duplicate user-defined objects are allowed in Set

`Set` does not allow duplicates only when `equals()` and `hashCode()` are properly overridden.

If not overridden, every object may look different even if their fields are same.

```java
class Employee
{
    int id;

    Employee(int id)
    {
        this.id = id;
    }

    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return this.id == e.id;
    }

    public int hashCode()
    {
        return Integer.hashCode(id);
    }
}
```

---

## Map Interface

`Map` stores data as key-value pairs.

### Features

- key must be unique
- value can be duplicate
- not part of `Collection`

### Common methods

- `put(K, V)`
- `get(K)`
- `remove(K)`
- `containsKey(K)`
- `containsValue(V)`
- `keySet()`
- `values()`
- `entrySet()`

### Example

```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "Java");
map.put(2, "Python");
System.out.println(map.get(1));
```

---

## HashMap

`HashMap` is a class that implements `Map`.

### Features

- stores key-value pairs
- unique keys
- duplicate values allowed
- no insertion order guarantee
- one null key allowed
- average O(1) performance

### Internal working

- key is passed to `hashCode()`
- bucket is selected
- collision is handled using linked list / tree

### Example

```java
Map<Integer, String> map = new HashMap<>();
map.put(1, "A");
map.put(2, "B");
map.put(3, "C");
System.out.println(map);
```

### Collision in HashMap

Collision happens when different keys generate the same bucket index.

Java handles collisions with:

- linked list
- Red-Black Tree in Java 8+

---

## LinkedHashMap

`LinkedHashMap` is a `HashMap` variant that maintains insertion order.

### Features

- unique keys
- insertion order preserved
- one null key allowed
- duplicate values allowed

---

## TreeMap

`TreeMap` stores keys in sorted order.

### Features

- sorted ascending order by default
- unique keys
- duplicate values allowed
- null key is not allowed
- O(log n)

### Example

```java
TreeMap<Integer, String> map = new TreeMap<>();
map.put(50, "A");
map.put(10, "B");
map.put(30, "C");
System.out.println(map);
```

### HashMap vs LinkedHashMap vs TreeMap

| Feature | HashMap | LinkedHashMap | TreeMap |
| ------- | ------- | ------------- | ------- |
| Order | No order | Insertion order | Sorted order |
| Null key | Yes | Yes | No |
| Null value | Yes | Yes | Yes |
| Speed | O(1) avg | O(1) avg | O(log n) |

---

## Generics

Generics allow type-safe code and avoid unnecessary casting.

### Syntax

```java
List<String> list = new ArrayList<>();
Map<Integer, String> map = new HashMap<>();
```

### Benefits

- type safety
- compile-time checking
- fewer runtime errors
- cleaner code

### Example

```java
List<Integer> list = new ArrayList<>();
list.add(10);
// list.add("Java");  // compile-time error
```

---

## Why use Generics?

Generics help avoid:

- `ClassCastException`
- incorrect data storage
- manual type casting

---

## ClassCastException

This happens when wrong object type is cast to another type.

```java
Object obj = "Java";
Integer num = (Integer) obj; // ClassCastException
```

Generics reduce this risk by making the type explicit.

---

## Wrapper Classes

Wrapper classes convert primitive values into objects.

| Primitive | Wrapper |
| --------- | ------- |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

### Example

```java
int num = 10;
Integer obj = Integer.valueOf(num);
```

### Why use wrapper classes?

- collections store objects
- useful utility methods available
- supports autoboxing and unboxing

### Autoboxing

```java
Integer i = 10; // primitive int converted to Integer automatically
```

### Unboxing

```java
int x = i; // Integer converted to primitive automatically
```

---

## Collections Class

`Collections` is a utility class in `java.util`.

It contains static methods to operate on collections.

### Common methods

- `Collections.sort(List)`
- `Collections.reverse(List)`
- `Collections.max(Collection)`
- `Collections.min(Collection)`
- `Collections.shuffle(List)`
- `Collections.synchronizedList(List)`
- `Collections.synchronizedMap(Map)`

### Example

```java
import java.util.*;

public class Test
{
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(20);

        Collections.sort(list);
        System.out.println(list);
    }
}
```

### Collection vs Collections

| Collection | Collections |
| ---------- | ----------- |
| Interface | Utility class |
| Stores objects | Operates on collections |
| Part of framework | Helper class |

---

## Comparable vs Comparator

### Comparable

- package: `java.lang`
- used for natural sorting
- method: `compareTo()`

### Comparator

- package: `java.util`
- used for custom sorting
- method: `compare()`

### Use case

- `Comparable` → default sorting inside the class
- `Comparator` → custom sorting outside the class

---

## Final Quick Revision

- `Collection` = interface for storing groups of objects
- `Collections` = utility class for operations
- `List` = ordered, duplicates allowed
- `Set` = unique elements only
- `Map` = key-value pairs
- `ArrayList` = dynamic list, fast retrieval
- `LinkedList` = fast insert/delete
- `Vector` = legacy, synchronized
- `HashSet` = unique, unordered
- `LinkedHashSet` = unique, insertion order
- `TreeSet` = unique, sorted order
- `HashMap` = key-value, fast lookup
- `LinkedHashMap` = insertion order preserved
- `TreeMap` = keys sorted automatically
- `Generics` improve type safety
- `Wrapper classes` allow primitives to be stored in collections

---

## Interview Summary

- Collection Framework helps store and manipulate groups of objects efficiently.
- `List` allows duplicates and maintains order.
- `Set` avoids duplicates.
- `Map` stores key-value pairs.
- `Collections` class provides helper methods.
- Generics and wrapper classes are essential for type safety in Java collections.
