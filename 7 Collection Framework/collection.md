# Collection Framework in Java

[Overview](#1-collection-framework-overview) | [Iterable & Collection](#2-iterable-and-collection) | [List](#3-list-interface) | [Cursors & Fail-Fast/Safe](#4-cursors-in-collection-framework) | [Set](#5-set-interface) | [Map](#6-map-interface) | [Generics](#7-generics) | [Wrapper Classes](#8-wrapper-classes) | [Collections Utility](#9-collections-utility-class) | [Comparable vs Comparator](#10-comparable-vs-comparator) | [Quick Revision](#quick-interview-revision)

---

## 1. Collection Framework Overview

A **collection** is a ready-made implementation of a data structure provided by Java to store, retrieve, and manipulate a group of objects dynamically.

### Why Use the Collection Framework?
- **Dynamic Storage:** Automatically grows and shrinks at runtime.
- **Built-In Operations:** Ready-to-use methods for adding, removing, searching, and sorting data.
- **Type Safety:** Enforces compile-time type checking through Generics.
- **Reduced Boilerplate:** Eliminates the need to write custom data structures from scratch.

### Limitations of `Object[]` Arrays
While an `Object[]` array can hold different types of objects, it comes with significant drawbacks:
- **Fixed Size:** Cannot grow or shrink once created.
- **No Built-In Operations:** Lacks standard utility methods for searching, sorting, or dynamic manipulation.
- **Poor Type Safety:** Requires explicit downcasting, risking `ClassCastException` at runtime.
- **Low Reusability:** Code becomes verbose and harder to maintain.

### Collection Hierarchy

```text
                      Iterable (Interface)
                               |
                     Collection (Interface)
                               |
          +--------------------+--------------------+
          |                    |                    |
        List                  Set                 Queue
     (Interface)          (Interface)          (Interface)
          |                    |                    |
   +------+------+       +-----+------+      +------+-------+
   |      |      |       |            |      |              |
ArrayList |   Vector  HashSet    SortedSet  PriorityQueue  Deque
 (Class)  |  (Class)  (Class)   (Interface)    (Class)   (Interface)
          |      |       |            |                     |
     LinkedList  |  LinkedHashSet     |              +------+------+
      (Class)    |     (Class)        |              |             |
               Stack             NavigableSet   ArrayDeque    LinkedList
              (Class)            (Interface)     (Class)       (Class)
                                      |
                                   TreeSet
                                   (Class)
```

> [!IMPORTANT]
> **`Map` is NOT a sub-interface of `Collection`**, even though it is a core part of the Java Collection Framework. It operates on key-value pairs rather than single elements.

```text
                     Map (Interface)
                            |
            +---------------+---------------+
            |               |               |
         HashMap      LinkedHashMap      TreeMap
         (Class)         (Class)         (Class)
```

---

## 2. Iterable and Collection

### `Iterable` Interface
`Iterable` is the root interface of the Java Collection Framework. Located in `java.lang`, it enables any implementing class to be traversed sequentially (including with the enhanced `for-each` loop).

```java
public interface Iterable<T> {
    Iterator<T> iterator();
}
```

### `Iterator` Interface
`Iterator` (in `java.util`) is used to fetch and optionally remove collection elements one by one in the forward direction.

```java
public interface Iterator<E> {
    boolean hasNext();
    E next();

    default void remove() {
        throw new UnsupportedOperationException();
    }

    default void forEachRemaining(java.util.function.Consumer<? super E> action) {
        java.util.Objects.requireNonNull(action);
        while (hasNext()) {
            action.accept(next());
        }
    }
}
```

#### Important `Iterator` Methods
| Method | Description |
| :--- | :--- |
| `hasNext()` | Checks whether more elements exist in the iteration. |
| `next()` | Returns the next element in the iteration. |
| `remove()` | Removes the last element returned by `next()` during iteration. |
| `forEachRemaining(Consumer)` | Performs the given action for each remaining element. |

#### Example: Iterating with `Iterator`
```java
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
```

**Output:**
```text
10
20
30
```

---

### `Collection` Interface
`Collection` extends `Iterable` and serves as the root interface for all standard collection types (`List`, `Set`, and `Queue`).

#### Common `Collection` Methods
- `int size()` — returns the number of elements
- `boolean isEmpty()` — returns `true` if the collection has no elements
- `boolean contains(Object o)` — checks if the specified element exists
- `Iterator<E> iterator()` — returns an iterator over the elements
- `Object[] toArray()` — converts the collection into an `Object[]` array
- `boolean add(E e)` — adds an element to the collection
- `boolean remove(Object o)` — removes a single instance of the specified element
- `boolean containsAll(Collection<?> c)` — checks if all elements of `c` are present
- `boolean addAll(Collection<? extends E> c)` — adds all elements from `c`
- `boolean removeAll(Collection<?> c)` — removes all elements that are also in `c`

#### Example: Core `Collection` Methods
```java
import java.util.*;

public class CollectionMethodsExample {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();

        // 1. add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Collection: " + list);

        // 2. size()
        System.out.println("Size: " + list.size());

        // 3. isEmpty()
        System.out.println("Is Empty: " + list.isEmpty());

        // 4. contains()
        System.out.println("Contains 20: " + list.contains(20));

        // 5. iterator()
        Iterator<Integer> itr = list.iterator();
        System.out.print("Iterator Elements: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // 6. toArray()
        Object[] arr = list.toArray();
        System.out.println("Array: " + Arrays.toString(arr));

        // 7. remove()
        list.remove(20);
        System.out.println("After remove(20): " + list);

        // 8. addAll()
        Collection<Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(60);

        list.addAll(list2);
        System.out.println("After addAll(): " + list);

        // 9. containsAll()
        System.out.println("Contains All: " + list.containsAll(list2));

        // 10. removeAll()
        list.removeAll(list2);
        System.out.println("After removeAll(): " + list);
    }
}
```

**Output:**
```text
Collection: [10, 20, 30, 40]
Size: 4
Is Empty: false
Contains 20: true
Iterator Elements: 10 20 30 40 
Array: [10, 20, 30, 40]
After remove(20): [10, 30, 40]
After addAll(): [10, 30, 40, 50, 60]
Contains All: true
After removeAll(): [10, 30, 40]
```

---

## 3. List Interface

`List` is an **ordered** collection (sequence) that allows **duplicate elements** and provides **index-based access**.

### Key Features
- Maintains insertion order
- Allows duplicate elements and `null` values
- Supports positional (index-based) access
- Supports bidirectional traversal via `ListIterator`

### Common Implementations
- `ArrayList`
- `LinkedList`
- `Vector`
- `Stack`

### Important `List` Methods
| Method | Description |
| :--- | :--- |
| `get(int index)` | Returns the element at the specified index. |
| `set(int index, E element)` | Replaces the element at the specified index and returns the old element. |
| `add(int index, E element)` | Inserts an element at the specified index, shifting existing elements right. |
| `remove(int index)` | Removes and returns the element at the specified index, shifting remaining elements left. |
| `indexOf(Object obj)` | Returns the index of the first matching occurrence (or `-1` if absent). |
| `lastIndexOf(Object obj)` | Returns the index of the last matching occurrence (or `-1` if absent). |
| `subList(int fromIndex, int toIndex)` | Returns a view of the portion between `fromIndex` (inclusive) and `toIndex` (exclusive). |
| `listIterator()` | Returns a `ListIterator` for forward and backward traversal. |



#### Example: Complete `List` Operations & `ListIterator`
```java
import java.util.*;

public class ListOperationsExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(40);
        System.out.println("Original List: " + list);

        // get()
        System.out.println("get(1): " + list.get(1));

        // set()
        list.set(1, 25);
        System.out.println("After set(): " + list);

        // add(index, element)
        list.add(2, 50);
        System.out.println("After add(): " + list);

        // remove(index)
        list.remove(2);
        System.out.println("After remove(): " + list);

        // indexOf() & lastIndexOf()
        System.out.println("indexOf(20): " + list.indexOf(20));
        System.out.println("lastIndexOf(20): " + list.lastIndexOf(20));

        // contains(), size(), isEmpty()
        System.out.println("contains(30): " + list.contains(30));
        System.out.println("Size: " + list.size());
        System.out.println("Is Empty: " + list.isEmpty());

        // subList()
        System.out.println("subList: " + list.subList(0, 2));

        // ListIterator - Forward
        ListIterator<Integer> itr = list.listIterator();
        System.out.print("Forward: ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // ListIterator - Backward
        System.out.print("\nBackward: ");
        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }
        System.out.println();

        // remove(Object)
        list.remove(Integer.valueOf(20));
        System.out.println("After remove(Object): " + list);

        // addAll(), containsAll(), removeAll()
        List<Integer> list2 = Arrays.asList(60, 70);
        list.addAll(list2);
        System.out.println("After addAll(): " + list);
        System.out.println("containsAll(): " + list.containsAll(list2));

        list.removeAll(list2);
        System.out.println("After removeAll(): " + list);

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);
    }
}
```

**Output:**
```text
Original List: [10, 20, 30, 20, 40]
get(1): 20
After set(): [10, 25, 30, 20, 40]
After add(): [10, 25, 50, 30, 20, 40]
After remove(): [10, 25, 30, 20, 40]
indexOf(20): 3
lastIndexOf(20): 3
contains(30): true
Size: 5
Is Empty: false
subList: [10, 25]
Forward: 10 25 30 20 40 
Backward: 40 20 30 25 10 
After remove(Object): [10, 25, 30, 40]
After addAll(): [10, 25, 30, 40, 60, 70]
containsAll(): true
After removeAll(): [10, 25, 30, 40]
After clear(): []
```

---

### `ArrayList`
`ArrayList` is a resizable (dynamic) array implementation of the `List` interface.

#### Features
- Dynamic sizing (grows by **0.5x** when capacity is exceeded)
- Non-legacy, unsynchronized collection
- Maintains insertion order
- Fast random access (`O(1)`)
- Slower insertions and deletions in the middle (`O(n)`) due to element shifting

#### Constructors
```java
ArrayList<Integer> list1 = new ArrayList<>();       // Default capacity (10 on first add)
ArrayList<Integer> list2 = new ArrayList<>(10);     // Specified initial capacity
ArrayList<Integer> list3 = new ArrayList<>(list1);  // Copy from another collection
```

#### Example
```java
import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);
    }
}
```

**Output:**
```text
[10, 20, 30]
```

#### `ArrayList` vs. Array
| Feature | `ArrayList` | Array |
| :--- | :--- | :--- |
| **Size** | Dynamic (resizable) | Fixed at creation |
| **Location** | `java.util` package | Core Java language construct |
| **Data Type** | Objects only (uses wrapper classes for primitives) | Both primitives and objects |
| **Memory** | Automatically resized when full | Fixed memory allocation |
| **Methods** | Rich set of built-in methods (`add`, `remove`, etc.) | Minimal built-in support (only `.length`) |

---

### `LinkedList`
`LinkedList` is a **doubly linked list** implementation of both `List` and `Deque`.

#### Features
- Each node stores data along with address/references to the previous and next nodes
- Fast insertion and deletion (`O(1)` when the node reference is known)
- Slower random access / searching (`O(n)`) compared to `ArrayList`

#### Example
```java
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        System.out.println(list);
    }
}
```

**Output:**
```text
[A, B, C]
```

#### `ArrayList` vs. `LinkedList`
| Feature | `ArrayList` | `LinkedList` |
| :--- | :--- | :--- |
| **Underlying Structure** | Dynamic array | Doubly linked list |
| **Memory Layout** | Contiguous | Non-contiguous (nodes with pointers) |
| **Insert / Delete (Middle)** | Slow (`O(n)` due to shifting) | Fast (`O(1)` once node is located) |
| **Random Access / Search** | Fast (`O(1)` via index) | Slow (`O(n)` sequential traversal) |

---

### `Vector`
`Vector` is a legacy, **thread-safe** dynamic array implementation of `List` introduced prior to Java 1.2.

#### Features
- Dynamic array with **synchronized** methods
- Legacy collection (retrofitted into the Collection Framework in Java 1.2)
- Doubles its capacity (`2x`) by default when full

> [!NOTE]
> **Why is `Vector` thread-safe?**
> Every core method in `Vector` is declared `synchronized`, ensuring only one thread can access or modify it at a time. This guarantees thread safety at the cost of reduced single-threaded performance.

#### Constructors
```java
Vector<Integer> v1 = new Vector<>();      // Default initial capacity (10)
Vector<Integer> v2 = new Vector<>(5);     // Initial capacity = 5
Vector<Integer> v3 = new Vector<>(5, 2);  // Initial capacity = 5, capacity increment = 2
```

#### Example
```java
import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println(v);
    }
}
```

**Output:**
```text
[10, 20, 30]
```

#### `Vector` vs. `ArrayList`
| Feature | `Vector` | `ArrayList` |
| :--- | :--- | :--- |
| **Thread Safety** | Yes (synchronized) | No (not synchronized) |
| **Performance** | Slower (synchronization overhead) | Faster |
| **Legacy Class** | Yes (Java 1.0) | No (Java 1.2) |
| **Capacity Growth** | Doubles (`2x`) | Grows by `0.5x` |

---

### `Stack`
`Stack` is a subclass of `Vector` that follows the **LIFO (Last-In, First-Out)** principle.

#### Common `Stack` Methods
- `push(E item)` — pushes an item onto the top of the stack
- `pop()` — removes and returns the top item
- `peek()` — returns the top item without removing it
- `empty()` — tests if the stack is empty
- `search(Object o)` — returns the 1-based position from the top of the stack (or `-1`)

#### Example
```java

package org.payroll.client;

import java.util.*;

public class TestLinkedListApplication {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        Scanner xyz = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1: PUSH");
            System.out.println("2: POP");
            System.out.println("3: DISPLAY");
            System.out.println("4: PEEK");
            System.out.println("5: SEARCH");
            System.out.println("6: EXIT");

            System.out.println("Enter your choice:");
            choice = xyz.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter value in stack:");
                    int value = xyz.nextInt();

                    s.push(value);
                    System.out.println("Element inserted successfully");
                    break;

                case 2:
                    if (s.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        int obj = s.pop();
                        System.out.println("Removed data from stack: " + obj);
                    }
                    break;

                case 3:
                    if (s.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack elements (Top to Bottom):");

                        ListIterator<Integer> li =
                                s.listIterator(s.size());

                        while (li.hasPrevious()) {
                            System.out.println(li.previous());
                        }
                    }
                    break;

                case 4:
                    if (s.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Topmost data: " + s.peek());
                    }
                    break;

                case 5:
                    System.out.println("Enter value to search:");
                    int searchValue = xyz.nextInt();

                    int index = s.search(searchValue);

                    if (index != -1) {
                        System.out.println(
                            "Value found at position: " + index
                        );
                    } else {
                        System.out.println("Value not found");
                    }
                    break;

                case 6:
                    System.out.println("Application terminated");
                    xyz.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (true);
    }
}

```


> [!TIP]
> **Is `Stack` thread-safe?**
> Yes, because `Stack` extends `Vector`, whose methods are synchronized. For single-threaded LIFO stacks in modern Java, `ArrayDeque` is generally preferred for better performance.

---

## 4. Cursors in Collection Framework

A **cursor** is an object used to retrieve elements from a collection one by one.

### Types of Cursors
1. **`Iterator`** — Universal forward-only cursor for all `Collection` classes.
2. **`ListIterator`** — Bidirectional cursor exclusively for `List` implementations.
3. **`Enumeration`** — Legacy read-only forward cursor (e.g., `Vector`, `Hashtable`).
4. **Enhanced `for-each` Loop** — Syntactic sugar backed internally by `Iterator`.

#### 1. `Iterator` (Forward Traversal)
```java
Iterator<Integer> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

#### 2. `Enumeration` (Legacy Read-Only Traversal)
```java
Enumeration<Integer> e = v.elements();
while (e.hasMoreElements()) {
    System.out.println(e.nextElement());
}
```

#### 3. `ListIterator` (Bidirectional Traversal)
```java
ListIterator<Integer> it = list.listIterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

#### 4. Enhanced `for-each` Loop
```java
for (int n : list) {
    System.out.println(n);
}
```

### `Iterator` vs. `Enumeration` vs. `ListIterator`
| Cursor | Direction | Modification Allowed | Applicable To |
| :--- | :--- | :--- | :--- |
| **`Iterator`** | Forward only | `remove()` only | All `Collection` classes |
| **`Enumeration`** | Forward only | Read-only (none) | Legacy classes (`Vector`, `Hashtable`) |
| **`ListIterator`** | Forward & Backward | `add()`, `remove()`, `set()` | `List` implementations only |

---

### Fail-Fast vs. Fail-Safe Iterators

#### Fail-Fast
Fail-fast iterators immediately throw `ConcurrentModificationException` if the underlying collection is structurally modified while iterating (outside of the iterator's own `remove()` method).

```java
import java.util.*;

public class FailFastExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            list.add(30); // Structural modification during iteration
            System.out.println(it.next());
        }
    }
}
```

**Output:**
```text
Exception in thread "main" java.util.ConcurrentModificationException
```

#### Fail-Safe
Fail-safe iterators operate on a clone or snapshot of the underlying collection, so modifying the collection during iteration does **not** throw `ConcurrentModificationException`.

- **Examples:** `CopyOnWriteArrayList`, `ConcurrentHashMap`

import java.util.*;
import java.util.concurrent.*;

public class FailSafeExample {
    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list =
                new CopyOnWriteArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        Iterator<Integer> itr = list.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());

            list.add(40); // Modifying original collection
        }

        System.out.println("Updated List: " + list);
    }
}

Output:
[10, 30, 40]


2. Use ListIterator

For List implementations, we can use ListIterator to add, remove or replace elements while iterating.
import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(10, 20, 30));

        ListIterator<Integer> itr = list.listIterator();

        while (itr.hasNext()) {

            int value = itr.next();

            if (value == 20) {
                itr.add(25);
            }
        }

        System.out.println(list);
    }
}


Output:
[10, 20, 25, 30]


3. Use Concurrent Collection API

We can use concurrent collection classes when multiple threads need to access or modify collections.

Examples:
- CopyOnWriteArrayList
- ConcurrentHashMap
- ConcurrentLinkedQueue

---

## 5. Set Interface

`Set` is a collection that stores **unique elements only** (no duplicates).

### Key Features
- Disallows duplicate elements
- No index-based access
- Ordering depends on the specific implementation

### Common Implementations
- `HashSet`
- `LinkedHashSet`
- `TreeSet`

#### Example: Basic `Set`
```java
import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(20); // Duplicate, ignored

        System.out.println(set);
    }
}
```

**Output:**
```text
[20, 10]
```
*(Note: `HashSet` does not guarantee element order.)*

---

### `HashSet`
`HashSet` stores unique elements internally using a `HashMap` (hashing).

- No duplicates allowed
- No insertion order guarantee
- Allows at most **one `null` value**
- Average `O(1)` time complexity for `add`, `remove`, and `contains`

```java
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java");

        System.out.println(set);
    }
}
```

**Output:**
```text
[Java, Python]
```

---

### `LinkedHashSet`
`LinkedHashSet` extends `HashSet` and uses a doubly linked list alongside a hash table to preserve **insertion order**.

- Stores unique elements
- Preserves exact insertion order
- Allows one `null` value
- Slightly higher memory/time overhead than `HashSet`

```java
import java.util.*;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate ignored

        System.out.println(set);
    }
}
```

**Output:**
```text
[Java, Python, C++]
```

---

### `TreeSet`
`TreeSet` stores unique elements in **sorted (ascending) order** using a self-balancing Red-Black Tree (`TreeMap`).

- Automatically sorts elements in natural ascending order (or via a custom `Comparator`)
- Does **not** allow `null` elements (throws `NullPointerException`)
- `O(log n)` time complexity for `add`, `remove`, and `contains`

```java
import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set);
    }
}
```

**Output:**
```text
[10, 20, 30]
```

### `HashSet` vs. `LinkedHashSet` vs. `TreeSet`
| Feature | `HashSet` | `LinkedHashSet` | `TreeSet` |
| :--- | :--- | :--- | :--- |
| **Ordering** | Unordered | Insertion order | Sorted order |
| **Null Allowed** | One `null` | One `null` | Not allowed (`NullPointerException`) |
| **Performance** | `O(1)` average | `O(1)` average | `O(log n)` |
| **Backing Structure** | `HashMap` | `LinkedHashMap` | `TreeMap` (Red-Black Tree) |

---

### `NavigableSet`
`NavigableSet` extends `SortedSet` and provides navigation methods for locating closest matches in sorted data.

#### Useful Methods
- `descendingSet()` — returns a reverse-order view of the set
- `ceiling(E e)` — least element `>= e` (or `null`)
- `floor(E e)` — greatest element `<= e` (or `null`)
- `higher(E e)` — least element strictly `> e` (or `null`)
- `lower(E e)` — greatest element strictly `< e` (or `null`)

#### Example
```java
import java.util.*;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set.higher(10));
        System.out.println(set.lower(20));
    }
}
```

**Output:**
```text
20
10
```

---

### Why Duplicate User-Defined Objects Appear in a `Set`
A `HashSet` (or `LinkedHashSet`) detects duplicates by calling `hashCode()` and `equals()`. If you do **not** override both methods in your custom class, Java falls back to `Object`'s default memory-address comparison—causing logically identical objects to be treated as distinct.

```java
import java.util.*;

class Employee {
    int id;

    Employee(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee e = (Employee) obj;
        return this.id == e.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}

public class CustomSetExample {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(101));
        employees.add(new Employee(101)); // Recognized as duplicate

        System.out.println("Unique Employees: " + employees.size());
    }
}
```

**Output:**
```text
Unique Employees: 1
```

---

## 6. Map Interface

`Map` stores data as **key-value pairs** (`<K, V>`).

### Key Features
- Keys must be **unique** (inserting an existing key overwrites its old value)
- Values **can be duplicated**
- Not a sub-interface of `Collection`

### Common `Map` Methods
- `put(K key, V value)` — inserts or updates a key-value pair
- `get(Object key)` — returns the value associated with the key
- `remove(Object key)` — removes the entry for the given key
- `containsKey(Object key)` — checks if the key exists
- `containsValue(Object value)` — checks if the value exists
- `keySet()` — returns a `Set` view of all keys
- `values()` — returns a `Collection` view of all values
- `entrySet()` — returns a `Set<Map.Entry<K, V>>` view of all key-value mappings

#### Example: Basic `Map`
```java
import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");

        System.out.println(map.get(1));
    }
}
```

**Output:**
```text
Java
```

---

### `HashMap`
`HashMap` is the most widely used hash-table implementation of `Map`.

#### Features
- Stores key-value pairs with unique keys and duplicate values allowed
- No insertion order guarantee
- Allows **one `null` key** and multiple `null` values
- Average `O(1)` performance for `get()` and `put()`

#### Internal Working & Collisions
1. The key's `hashCode()` is computed and mapped to a bucket index.
2. If multiple distinct keys map to the same bucket index, a **hash collision** occurs.
3. Java resolves collisions inside a bucket using a **Linked List**, automatically converting it into a **Red-Black Tree** (Java 8+) once the bucket exceeds the treeify threshold (8 nodes) for faster `O(log n)` lookup.

#### Example
```java
import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        System.out.println(map);
    }
}
```

**Output:**
```text
{1=A, 2=B, 3=C}
```

---

### `LinkedHashMap`
`LinkedHashMap` extends `HashMap` and preserves the **insertion order** of keys.

- Unique keys, duplicate values allowed
- Preserves insertion order
- Allows one `null` key and multiple `null` values

```java
import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");

        System.out.println(map);
    }
}
```

**Output:**
```text
{30=C, 10=A, 20=B}
```

---

### `TreeMap`
`TreeMap` implements `NavigableMap` and stores entries sorted by **key** in ascending order using a Red-Black Tree.

- Keys are automatically sorted in ascending order (or by custom `Comparator`)
- Unique keys, duplicate values allowed
- **`null` key is NOT allowed** (`NullPointerException`), though `null` values are allowed
- `O(log n)` time complexity for lookup, insertion, and deletion

#### Example
```java
import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(50, "A");
        map.put(10, "B");
        map.put(30, "C");

        System.out.println(map);
    }
}
```

**Output:**
```text
{10=B, 30=C, 50=A}
```

### `HashMap` vs. `LinkedHashMap` vs. `TreeMap`
| Feature | `HashMap` | `LinkedHashMap` | `TreeMap` |
| :--- | :--- | :--- | :--- |
| **Order** | Unordered | Insertion order | Sorted by key |
| **Null Key** | Allowed (one) | Allowed (one) | Not allowed |
| **Null Values** | Allowed | Allowed | Allowed |
| **Performance** | `O(1)` average | `O(1)` average | `O(log n)` |

---

## 7. Generics

**Generics** enable parameterized types in Java, providing compile-time type safety and eliminating manual type casting.

### Syntax
```java
List<String> list = new ArrayList<>();
Map<Integer, String> map = new HashMap<>();
```

### Benefits of Generics
- **Type Safety:** Restricts a collection to hold only a specific type of object.
- **Compile-Time Checking:** Catches type mismatches before runtime.
- **No Explicit Casting:** Eliminates manual downcasting when retrieving elements.
- **Cleaner Code:** Reduces boilerplate and prevents accidental data corruption.

#### Example: Compile-Time Type Safety
```java
List<Integer> list = new ArrayList<>();
list.add(10);
// list.add("Java"); // Compile-time error: incompatible types
```

### Preventing `ClassCastException`
Without Generics, retrieving an object from a raw collection requires manual casting. Casting an object to an incompatible type throws a runtime `ClassCastException`:

```java
Object obj = "Java";
Integer num = (Integer) obj; // Runtime error: ClassCastException
```

> [!TIP]
> Generics prevent `ClassCastException` by making the expected element type explicit at compile time.

---

## 8. Wrapper Classes

Java collections can only store **objects**, not primitive types (`int`, `double`, etc.). **Wrapper classes** encapsulate primitive values inside objects.

| Primitive Type | Wrapper Class |
| :--- | :--- |
| `byte` | `Byte` |
| `short` | `Short` |
| `int` | `Integer` |
| `long` | `Long` |
| `float` | `Float` |
| `double` | `Double` |
| `char` | `Character` |
| `boolean` | `Boolean` |

### Why Use Wrapper Classes?
- Required to store primitive values inside Java Collections (`List<Integer>`, `Map<String, Double>`).
- Provide helpful static utility methods (e.g., `Integer.parseInt()`, `Double.valueOf()`).
- Support automatic conversion via **autoboxing** and **unboxing**.

### Manual Boxing, Autoboxing, and Unboxing
```java
// Manual boxing
int num = 10;
Integer obj = Integer.valueOf(num);

// Autoboxing: primitive int -> Integer automatically
Integer i = 10;

// Unboxing: Integer -> primitive int automatically
int x = i;
```

---

## 9. Collections Utility Class

`Collections` (in `java.util`) is a utility class containing static helper methods to operate on or return collections.

### Common Static Methods
- `Collections.sort(List)` — sorts a list in ascending order
- `Collections.reverse(List)` — reverses the element order
- `Collections.max(Collection)` / `Collections.min(Collection)` — finds maximum / minimum element
- `Collections.shuffle(List)` — randomly permutes list elements
- `Collections.synchronizedList(List)` — returns a thread-safe wrapper around a list
- `Collections.synchronizedMap(Map)` — returns a thread-safe wrapper around a map

#### Example: Sorting a `List`
```java
import java.util.*;

public class CollectionsUtilityExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(10);
        list.add(20);

        Collections.sort(list);
        System.out.println(list);
    }
}
```

**Output:**
```text
[10, 20, 30]
```

### `Collection` vs. `Collections`
| Feature | `Collection` | `Collections` |
| :--- | :--- | :--- |
| **Type** | Interface | Utility class |
| **Purpose** | Represents a group of objects as a single unit | Provides static helper methods (sort, reverse, sync) |
| **Role** | Root interface for `List`, `Set`, `Queue` | Helper class for operating on collections |

---

## 10. Comparable vs. Comparator

Both interfaces are used to define sorting logic for objects in Java.

| Feature | `Comparable<T>` | `Comparator<T>` |
| :--- | :--- | :--- |
| **Package** | `java.lang` | `java.util` |
| **Method** | `compareTo(T o)` | `compare(T o1, T o2)` |
| **Purpose** | Defines **natural (default)** sorting order | Defines **custom / multiple** sorting orders |
| **Modification** | Implemented inside the target class itself | Implemented outside the target class (or via lambda) |

#### Example: Natural vs. Custom Sorting
```java
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Natural sorting by id (Comparable)
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}

public class SortingExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(2, "Bob"));
        students.add(new Student(1, "Charlie"));
        students.add(new Student(3, "Alice"));

        // Natural sorting (by id)
        Collections.sort(students);
        System.out.println("By ID:   " + students);

        // Custom sorting (by name using Comparator)
        students.sort(Comparator.comparing(s -> s.name));
        System.out.println("By Name: " + students);
    }
}
```

**Output:**
```text
By ID:   [1:Charlie, 2:Bob, 3:Alice]
By Name: [3:Alice, 2:Bob, 1:Charlie]
```

---

## Quick Interview Revision

### 1. Rapid-Fire Concept Table

| Concept / Class | Key Interview Rule |
| :--- | :--- |
| **`Collection`** | Root interface for storing groups of objects (`List`, `Set`, `Queue`). |
| **`Collections`** | Utility class containing static helper methods (`sort`, `reverse`, `min`, `max`). |
| **`List`** | Ordered collection; allows duplicates and index-based access. |
| **`Set`** | Unordered or sorted collection; stores unique elements only. |
| **`Map`** | Stores key-value pairs (unique keys, duplicate values allowed); not part of `Collection`. |
| **`ArrayList`** | Dynamic array (`1.5x` growth); fast retrieval (`O(1)`), slow middle insert/delete. |
| **`LinkedList`** | Doubly linked list; fast insert/delete (`O(1)`), slow random access (`O(n)`). |
| **`Vector` & `Stack`** | Legacy, synchronized (thread-safe) collections; `Vector` doubles capacity (`2x`). |
| **`HashSet`** | Unique elements, unordered, one `null` allowed, average `O(1)`. |
| **`LinkedHashSet`** | Unique elements, preserves insertion order, average `O(1)`. |
| **`TreeSet`** | Unique elements, sorted ascending order, no `null`, `O(log n)`. |
| **`HashMap`** | Key-value pairs, unordered, one `null` key, average `O(1)`, Red-Black Tree for collisions (Java 8+). |
| **`LinkedHashMap`** | Key-value pairs with insertion order preserved. |
| **`TreeMap`** | Key-value pairs sorted by key, no `null` key, `O(log n)`. |
| **`Generics`** | Enforces compile-time type safety and eliminates manual casting. |
| **Wrapper Classes** | Convert primitives to objects for storage in collections (autoboxing/unboxing). |

### 2. Key Interview Takeaways
- Use **`ArrayList`** for frequent lookups and **`LinkedList`** for frequent insertions/deletions at ends or known positions.
- Always override both **`equals()`** and **`hashCode()`** when storing custom objects in a `HashSet` or using them as keys in a `HashMap`.
- Prefer **fail-safe** concurrent collections (`ConcurrentHashMap`, `CopyOnWriteArrayList`) over legacy synchronized classes (`Vector`, `Hashtable`) in multithreaded environments.
- Use **`Comparable`** for a single natural ordering inside the class, and **`Comparator`** for flexible or multiple external sort orders.
