# Collection Framework in Java

[Overview](#1-collection-framework-overview) | [Iterable & Collection](#2-iterable-and-collection) | [List](#3-list-interface) | [Cursors & Fail-Fast/Safe](#4-cursors-in-collection-framework) | [Set](#5-set-interface) | [Queue & Deque](#6-queue-and-deque-interface) | [Map](#7-map-interface) | [Generics](#8-generics) | [Wrapper Classes](#9-wrapper-classes) | [Collections Utility](#10-collections-utility-class) | [Comparable vs Comparator](#11-comparable-vs-comparator) | [Quick Revision](#quick-interview-revision)

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

```java
import java.util.*;
import java.util.concurrent.*;

public class FailSafeExample {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

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
```

**Output:**
```text
10
20
30
Updated List: [10, 20, 30, 40, 40, 40]
```

> [!NOTE]
> The iterator traverses the original snapshot `[10, 20, 30]`, so additions (`list.add(40)`) modify a new copy of the array and do not disrupt the active traversal.

#### Fail-Fast vs. Fail-Safe Comparison
| Feature | Fail-Fast Iterators | Fail-Safe Iterators |
| :--- | :--- | :--- |
| **Exception** | Throws `ConcurrentModificationException` | Never throws `ConcurrentModificationException` |
| **Data Source** | Operates directly on the original collection | Operates on a cloned snapshot / copy |
| **Memory Overhead** | Low (no copying) | Higher (allocates a new array on modification) |
| **Modification During Traversal** | ❌ Not allowed | ✅ Allowed |
| **Examples** | `ArrayList`, `Vector`, `HashSet`, `HashMap` | `CopyOnWriteArrayList`, `ConcurrentHashMap` |

---

### How to Safely Modify Collections During Iteration

#### 1. Use Fail-Safe / Concurrent Collections
Use fail-safe collections like `CopyOnWriteArrayList` or `ConcurrentHashMap` that operate on a snapshot of the data.

#### 2. Use `ListIterator`
For `List` implementations, we can use `ListIterator` to add, remove, or replace elements while iterating without throwing an exception.

```java
import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));

        ListIterator<Integer> itr = list.listIterator();

        while (itr.hasNext()) {
            int value = itr.next();
            if (value == 20) {
                itr.add(25); // Safely adds element during iteration
            }
        }

        System.out.println(list);
    }
}
```

**Output:**
```text
[10, 20, 25, 30]
```

#### 3. Use Concurrent Collection API
We can use concurrent collection classes when multiple threads need to access or modify collections.

**Examples:**
- `CopyOnWriteArrayList`
- `ConcurrentHashMap`
- `ConcurrentLinkedQueue`

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

### `NavigableSet` Interface
`NavigableSet` (in `java.util`) is a child interface of `SortedSet` that provides navigation methods for locating closest-matching elements (such as `higher`, `lower`, `ceiling`, and `floor`) and supports bidirectional traversal.

#### Key Features & Characteristics
- **Extends `SortedSet`:** Inherits all sorted set properties and adds directional search capabilities.
- **Unique Elements:** Disallows duplicate elements.
- **Maintains Sorted Order:** Elements are stored in natural ascending order by default (or using a custom `Comparator`).
- **Descending Views:** Can produce a reverse-order view via `descendingSet()` or `descendingIterator()`.
- **Primary Implementation:** `TreeSet` is the standard concrete class implementing `NavigableSet`.

#### Useful Navigation Methods
| Method | Description | Return If Absent |
| :--- | :--- | :--- |
| `ceiling(E e)` | Returns the least element greater than or equal to `e` (`>= e`) | `null` |
| `floor(E e)` | Returns the greatest element less than or equal to `e` (`<= e`) | `null` |
| `higher(E e)` | Returns the least element strictly greater than `e` (`> e`) | `null` |
| `lower(E e)` | Returns the greatest element strictly less than `e` (`< e`) | `null` |
| `pollFirst()` | Retrieves and removes the first (lowest) element | `null` |
| `pollLast()` | Retrieves and removes the last (highest) element | `null` |
| `descendingSet()` | Returns a reverse-order view of the elements contained in this set | — |

> [!TIP]
> **Interview Rule of Thumb:**
> - `ceiling` & `floor` are **inclusive** (`>=` and `<=`).
> - `higher` & `lower` are **exclusive** (`>` and `<`).

#### Example: Complete `NavigableSet` Operations
```java
import java.util.*;

public class NavigableSetExample {
    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        // 1. Ascending order traversal
        System.out.println("Ascending Order:");
        for (Integer obj : set) {
            System.out.println(obj);
        }

        // 2. Descending order view
        NavigableSet<Integer> nset = set.descendingSet();
        System.out.println("Descending Order:");
        for (Integer obj : nset) {
            System.out.println(obj);
        }

        // 3. Navigation queries
        System.out.println("Ceiling (>= 25): " + set.ceiling(25));
        System.out.println("Floor   (<= 25): " + set.floor(25));
        System.out.println("Higher  (> 30):  " + set.higher(30));
        System.out.println("Lower   (< 30):  " + set.lower(30));

        // 4. Polling first and last elements
        System.out.println("Poll First: " + set.pollFirst());
        System.out.println("Poll Last:  " + set.pollLast());

        // 5. Remaining set
        System.out.println("Updated Set: " + set);
    }
}
```

**Output:**
```text
Ascending Order:
10
20
30
40
50
Descending Order:
50
40
30
20
10
Ceiling (>= 25): 30
Floor   (<= 25): 20
Higher  (> 30):  40
Lower   (< 30):  20
Poll First: 10
Poll Last:  50
Updated Set: [20, 30, 40]
```

---

### Why Duplicate User-Defined Objects Appear in a `Set`

In Java, hash-based collections such as `HashSet` and `LinkedHashSet` rely on both **`hashCode()`** and **`equals()`** to identify duplicate elements. 

When you insert custom objects without overriding these methods, **duplicate objects with identical field values will appear in the `Set`**.

---

#### 1. Root Cause: Default `Object` Class Behavior

Every user-defined class implicitly inherits from `java.lang.Object`. If `equals()` and `hashCode()` are not overridden:
- **`Object.equals(Object obj)`** uses **reference equality (`==`)** — it returns `true` only if both references point to the exact same memory address.
- **`Object.hashCode()`** generates an integer hash value derived from the object's **internal memory address**.

Consequently, two separate instances (e.g., `new Employee(101, "Rahul")` and `new Employee(101, "Rahul")`) reside at different memory addresses, produce different hash codes, and evaluate to `false` during equality checks. As a result, the `Set` treats them as distinct objects.

---

#### 2. How `HashSet.add()` Identifies Duplicates Internally

When you call `set.add(element)`:

```text
                  set.add(newElement)
                           │
                           ▼
                 Compute hashCode()
                           │
                           ▼
          Does another object exist in bucket?
                 ├── No  ──► Store element (Unique)
                 │
                 └── Yes ──► Check existingObj.equals(newElement)
                               ├── Returns true  ──► Reject duplicate
                               └── Returns false ──► Store element (Hash collision)
```

1. **Step 1 (`hashCode()`):** Java invokes `newElement.hashCode()` to locate the corresponding bucket index.
2. **Step 2 (`equals()`):**
   - If the bucket is empty &rarr; the element is added.
   - If the bucket already contains one or more elements (matching hash code) &rarr; Java compares them using `existingObj.equals(newElement)`.
   - If `equals()` returns `true` &rarr; duplicate detected; addition is rejected.
   - If `equals()` returns `false` &rarr; hash collision occurred; the element is appended to the bucket chain/tree.

---

#### 3. Code Demonstration

##### Scenario A: Without Overriding `equals()` & `hashCode()` (Duplicates Allowed)
```java
import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class DuplicateStudentDemo {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();

        set.add(new Student(101, "Rahul"));
        set.add(new Student(101, "Rahul"));

        // Both are added because their memory addresses differ
        System.out.println("Set Size: " + set.size());
    }
}
```

**Output:**
```text
Set Size: 2
```

---

##### Scenario B: Properly Overriding `equals()` & `hashCode()` (Duplicates Prevented)
```java
import java.util.*;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee other = (Employee) obj;
        return this.id == other.id && Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class EmployeeApplication {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();

        Employee e1 = new Employee(101, "Rahul");
        Employee e2 = new Employee(101, "Rahul");

        set.add(e1);
        set.add(e2); // Duplicate detected via hashCode() & equals() -> rejected

        System.out.println("Total Employees: " + set.size());
        System.out.println("Set Elements:    " + set);
    }
}
```

**Output:**
```text
Total Employees: 1
Set Elements:    [Employee{id=101, name='Rahul'}]
```

---

#### 4. The `equals()` and `hashCode()` Contract

> [!IMPORTANT]
> **Key Rules for Hash-Based Collections:**
> 1. **If `a.equals(b)` is `true`**, then `a.hashCode()` **MUST** equal `b.hashCode()`.
> 2. **If `a.hashCode() == b.hashCode()`**, `a.equals(b)` **MAY or MAY NOT** be `true` (due to hash collisions).
> 3. **Consistency:** Overriding `equals()` without overriding `hashCode()` (or vice-versa) violates this contract and causes hash-based collections (`HashSet`, `HashMap`) to behave unpredictably.

---

## 6. Queue and Deque Interface

A **Queue** is a collection designed for holding elements prior to processing. Along with basic `Collection` operations, queues provide specialized insertion, extraction, and inspection operations.

### Key Characteristics of `Queue`
- **FIFO Ordering (Default):** Elements are typically ordered in **First-In, First-Out (FIFO)** order (except priority queues).
- **Head & Tail:** Elements are inserted at the **tail** (rear) and retrieved from the **head** (front).
- **Duplicates Allowed:** Allows multiple duplicate elements.
- **Null Element Restriction:** Most `Queue` implementations (such as `ArrayDeque` and `PriorityQueue`) disallow `null` elements because `null` is used as a sentinel return value by `poll()` and `peek()`.

---

### Core Queue Methods (Interview Essential)

The `Queue` interface defines two distinct forms for each core operation:
1. One form **throws an exception** if the operation fails.
2. The other form **returns a special value** (`false` or `null`) if the operation fails.

| Operation | Throws Exception (if operation fails) | Returns Special Value (`false` or `null`) |
| :--- | :--- | :--- |
| **Insert (at tail)** | `add(e)` — throws `IllegalStateException` if queue is full | `offer(e)` — returns `false` if queue is full |
| **Remove (from head)** | `remove()` — throws `NoSuchElementException` if queue is empty | `poll()` — returns `null` if queue is empty |
| **Examine (head)** | `element()` — throws `NoSuchElementException` if queue is empty | `peek()` — returns `null` if queue is empty |

> [!TIP]
> **When to use which?**
> In capacity-restricted queues or robust production code, prefer `offer()`, `poll()`, and `peek()` over `add()`, `remove()`, and `element()` to avoid unexpected runtime exceptions under normal empty/full conditions.

---

### `PriorityQueue`

`PriorityQueue` is an unbounded priority queue based on a **binary heap (min-heap by default)**. Elements are ordered according to their **natural ordering** (`Comparable`) or by a custom **`Comparator`** supplied during construction.

#### Key Features
- **Min-Heap by Default:** The head of the queue is always the *least* element with respect to the specified ordering.
- **No Null Elements:** Does **not** permit `null` (`NullPointerException`).
- **Iteration Order:** An iterator does **not** guarantee traversing elements in sorted order; only `peek()` and `poll()` retrieve elements in strict priority order.
- **Time Complexity:**
  - Enqueue (`offer` / `add`) and Dequeue (`poll` / `remove`): `O(log n)`
  - Retrieval (`peek` / `element`): `O(1)`
  - Arbitrary element removal (`remove(Object)`): `O(n)`

#### Example: Min-Heap (Natural) vs. Max-Heap (Custom Comparator)
```java
import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // 1. Default Min-Heap (Ascending Natural Order)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.offer(40);
        minHeap.offer(10);
        minHeap.offer(30);
        minHeap.offer(20);

        System.out.print("Min-Heap Poll Order: ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();

        // 2. Custom Max-Heap (Descending Order using Collections.reverseOrder())
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.offer(40);
        maxHeap.offer(10);
        maxHeap.offer(30);
        maxHeap.offer(20);

        System.out.print("Max-Heap Poll Order: ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
    }
}
```

**Output:**
```text
Min-Heap Poll Order: 10 20 30 40 
Max-Heap Poll Order: 40 30 20 10 
```

---

### `Deque` Interface (Double-Ended Queue)

`Deque` (pronounced *"deck"*, short for **Double-Ended Queue**) extends `Queue` and supports element insertion, removal, and retrieval at **both ends**.

#### Dual Nature of `Deque`
- **As a FIFO Queue:** Insert at tail (`addLast` / `offerLast`), remove from head (`pollFirst` / `removeFirst`).
- **As a LIFO Stack:** Insert at head (`push` / `addFirst`), remove from head (`pop` / `pollFirst`).

#### Deque Methods Summary Table
| Operation | First Element (Head) — Throws / Special | Last Element (Tail) — Throws / Special |
| :--- | :--- | :--- |
| **Insert** | `addFirst(e)` / `offerFirst(e)` | `addLast(e)` / `offerLast(e)` |
| **Remove** | `removeFirst()` / `pollFirst()` | `removeLast()` / `pollLast()` |
| **Examine** | `getFirst()` / `peekFirst()` | `getLast()` / `peekLast()` |

---

### `ArrayDeque`

`ArrayDeque` is a resizable, circular array implementation of the `Deque` interface. It is the modern standard for stack and queue operations in Java.

#### Key Features
- **Unbounded Resizable Array:** Grows dynamically as elements are added without capacity limits.
- **Null Forbidden:** Throws `NullPointerException` if attempting to add `null`.
- **Not Synchronized:** Not thread-safe (faster than legacy classes).
- **High Performance:** Faster than `Stack` when used as a stack, and faster than `LinkedList` when used as a queue.

#### Why `ArrayDeque` is Preferred Over `Stack` and `LinkedList`
1. **Vs. `java.util.Stack`:**
   - `Stack` is a legacy class that extends `Vector`. Every method in `Stack` is `synchronized`, adding unnecessary locking overhead in single-threaded environments.
   - `ArrayDeque` provides stack operations (`push`, `pop`, `peek`) with zero synchronization overhead.
2. **Vs. `LinkedList`:**
   - `LinkedList` allocates a separate `Node` object for every element inserted, leading to memory overhead and garbage collection pauses.
   - `ArrayDeque` stores elements in a contiguous circular array, providing superior **CPU cache locality** and lower memory overhead.

#### Example: `ArrayDeque` as a FIFO Queue and a LIFO Stack
```java
import java.util.*;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // 1. Used as a FIFO Queue
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");

        System.out.println("--- FIFO Queue Processing ---");
        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }

        // 2. Used as a Modern LIFO Stack (replaces java.util.Stack)
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("\n--- LIFO Stack Processing ---");
        System.out.println("Top element (peek): " + stack.peek());
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
```

**Output:**
```text
--- FIFO Queue Processing ---
Processing: Task 1
Processing: Task 2
Processing: Task 3

--- LIFO Stack Processing ---
Top element (peek): 30
Popped: 30
Popped: 20
Popped: 10
```

---

### `LinkedList` as a Queue / Deque

`LinkedList` implements both `List` and `Deque`. It is a doubly-linked list that can act as a list, a queue, or a deque.

#### Features
- Permits `null` elements (unlike `ArrayDeque` and `PriorityQueue`).
- Constant-time `O(1)` insertions and removals at both ends.
- Higher memory overhead per element due to node pointer storage.

---

### Key Comparisons

#### 1. `List` vs. `Set` vs. `Queue`
| Feature | `List` | `Set` | `Queue` |
| :--- | :--- | :--- | :--- |
| **Ordering** | Insertion order maintained | Unordered or sorted | FIFO / Priority order |
| **Duplicates** | Allowed | ❌ Not allowed | Allowed |
| **Index Access** | Yes (`get(index)`) | ❌ No | ❌ No |
| **Null Elements** | Allowed | At most one (`HashSet`) or none (`TreeSet`) | Typically disallowed |
| **Primary Use** | Storing ordered sequences | Ensuring uniqueness | Holding tasks before processing |

#### 2. `ArrayDeque` vs. `PriorityQueue`
| Feature | `ArrayDeque` | `PriorityQueue` |
| :--- | :--- | :--- |
| **Ordering** | FIFO / LIFO (insertion order) | Priority order (Min-Heap / Custom) |
| **Data Structure** | Resizable circular array | Binary heap |
| **Time Complexity** | `O(1)` amortized for insert/remove | `O(log n)` for insert/remove |
| **Primary Use** | Buffers, stacks, standard queues | Scheduling by priority, Dijkstra, Prim |

---

## 7. Map Interface

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

`HashMap` is the most widely used hash-table-based implementation of the `Map` interface. It stores data as key-value pairs using hashing for high-speed retrieval.

#### Key Features
- **Key-Value Pairs:** Stores associations between unique keys and corresponding values.
- **Unordered:** Does **not guarantee any specific order** of keys or values (the order can change over time upon rehashing).
- **Null Handling:** Allows **at most one `null` key** (stored at bucket index 0) and multiple `null` values.
- **Not Synchronized:** Not thread-safe (for concurrent use, prefer `ConcurrentHashMap`).
- **Time Complexity:**
  - Average Case: `O(1)` for `get()` and `put()`.
  - Worst Case (high collision rate): `O(log n)` with Red-Black Tree (or `O(n)` prior to Java 8).

---

#### Internal Architecture & Data Structure

Internally, `HashMap` is built on an array of buckets:

```text
Node<K, V>[] table
```

Each bucket slot contains either `null` or a reference to a `Node<K, V>` (or `TreeNode<K, V>` in Java 8+).

##### Node Structure
Each entry in a bucket is represented by an internal static class:
```java
static class Node<K, V> implements Map.Entry<K, V> {
    final int hash;    // Cached hash code of the key
    final K key;       // The key object
    V value;           // The value object
    Node<K, V> next;   // Reference to the next node in the bucket
}
```

##### Critical Constants & Parameters
| Parameter | Default Value | Description |
| :--- | :--- | :--- |
| **Initial Capacity** | `16` (`1 << 4`) | Default number of bucket slots in the array. Must be a power of 2. |
| **Maximum Capacity** | `2^30` (`1 << 30`) | Upper bound on array size. |
| **Load Factor** | `0.75` (`75%`) | Measure of how full the hash table can get before resizing. |
| **Threshold** | `Capacity * Load Factor` | Capacity limit before resizing (`16 * 0.75 = 12`). |
| **`TREEIFY_THRESHOLD`** | `8` | Number of nodes in a bucket chain that triggers conversion to a Red-Black Tree. |
| **`UNTREEIFY_THRESHOLD`** | `6` | Number of nodes in a tree that triggers conversion back to a linked list upon deletion. |
| **`MIN_TREEIFY_CAPACITY`** | `64` | Minimum total hash table capacity required before treeifying a bucket (otherwise table resizes instead). |

---

#### How `put(K key, V value)` Works Internally

```text
                           map.put(key, value)
                                    │
                                    ▼
                      Compute Hash of Key
                      hash = (h = key.hashCode()) ^ (h >>> 16)
                                    │
                                    ▼
                      Calculate Bucket Index
                      index = (n - 1) & hash
                                    │
                                    ▼
                      Is table[index] empty?
                         ├── Yes ──► Create Node and store at table[index]
                         │
                         └── No  ──► Hash Collision!
                                       │
                                       ▼
                       Does key already exist in bucket?
                       (p.hash == hash && key.equals(p.key))
                         ├── Yes ──► Overwrite existing value (oldValue returned)
                         │
                         └── No  ──► Traverse Linked List / Red-Black Tree
                                       │
                                       ├── If List Length >= 8 and Capacity >= 64:
                                       │   Convert to Red-Black Tree (TreeNode)
                                       │
                                       └── Append new Node at end
                                    │
                                    ▼
                      Is size > threshold?
                         └── Yes ──► Resize table to 2x capacity (Rehash)
```

1. **Hash Calculation:** If `key == null`, hash is `0`. Otherwise, computes `(h = key.hashCode()) ^ (h >>> 16)` to spread higher bits into lower bits, minimizing collisions.
2. **Index Calculation:** Uses bitwise AND operation `index = (n - 1) & hash` (which is functionally equivalent to `hash % n` because capacity `n` is always a power of 2, but bitwise AND is significantly faster).
3. **Empty Bucket:** If `table[index]` is empty, a new `Node` is directly placed in that bucket slot.
4. **Collision Handling:** If `table[index]` already contains nodes:
   - Checks if the new key matches an existing key using `hash` equality and `equals()`.
   - If a matching key is found &rarr; replaces the existing value with the new value.
   - If no match is found &rarr; traverses the linked list and appends the new node at the tail.
5. **Treeification:** If the number of nodes in a single bucket reaches **8** and total capacity is at least **64**, the linked list is converted into a balanced **Red-Black Tree** (`TreeNode`), reducing lookup time from `O(n)` to `O(log n)`.
6. **Resizing (Rehashing):** If the total number of entries exceeds `threshold` (`capacity * 0.75`), the table array doubles in size (`capacity * 2`), and all existing entries are re-indexed.

---

#### How `get(Object key)` Works Internally

1. Computes the hash and bucket index for the given key: `index = (n - 1) & hash`.
2. Inspects the first node at `table[index]`:
   - If its hash and key match (`p.hash == hash && key.equals(p.key)`), returns `p.value`.
3. If the bucket has multiple nodes:
   - If it is a **Linked List** &rarr; traverses sequentially checking each node with `equals()`.
   - If it is a **Red-Black Tree** &rarr; searches in `O(log n)` time.
4. If no matching key is found, returns `null`.

---

#### Collision Visual Representation

```text
Table Array (Capacity = 16)
[0]  ──► null
[1]  ──► [Hash: 101 | Key: "A" | Value: 10] ──► [Hash: 101 | Key: "B" | Value: 20] ──► null
[2]  ──► null
[3]  ──► [Hash: 305 | Key: "C" | Value: 30] ──► null
...
[15] ──► null
```

> [!TIP]
> **Summary for Interviews:**
> - **`hashCode()`** determines the bucket index.
> - **`equals()`** resolves which key inside the bucket matches.
> - **Hash Collision:** When two distinct keys produce the same bucket index.
> - **Why Load Factor = 0.75?** Offers an optimal balance between time performance (fewer collisions) and space consumption.
> - **Why Power of 2?** Allows the fast bitwise index calculation `(n - 1) & hash` instead of slow modulus `%`.

---

#### Example: Comprehensive `HashMap` Operations
```java
import java.util.*;

public class HashMapCompleteExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 1. Inserting key-value pairs
        map.put("Apple", 50);
        map.put("Banana", 20);
        map.put("Orange", 30);

        // 2. Overwriting existing key
        map.put("Apple", 60); // Replaces old value 50

        // 3. Null key and null values
        map.put(null, 0);
        map.put("Mango", null);

        System.out.println("Map Contents: " + map);

        // 4. Retrieving values
        System.out.println("Price of Apple:  " + map.get("Apple"));
        System.out.println("Price of Banana: " + map.get("Banana"));
        System.out.println("Price of null:   " + map.get(null));
        System.out.println("Unknown Key:     " + map.get("Papaya")); // returns null

        // 5. Checking presence
        System.out.println("Contains 'Orange'? " + map.containsKey("Orange"));
        System.out.println("Contains value 30? " + map.containsValue(30));

        // 6. Iterating using entrySet() (Recommended)
        System.out.println("\n--- Iterating via entrySet() ---");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 7. Iterating keys and values separately
        System.out.println("\nKeys:   " + map.keySet());
        System.out.println("Values: " + map.values());
    }
}
```

**Output:**
```text
Map Contents: {null=0, Apple=60, Mango=null, Orange=30, Banana=20}
Price of Apple:  60
Price of Banana: 20
Price of null:   0
Unknown Key:     null
Contains 'Orange'? true
Contains value 30? true

--- Iterating via entrySet() ---
null -> 0
Apple -> 60
Mango -> null
Orange -> 30
Banana -> 20

Keys:   [null, Apple, Mango, Orange, Banana]
Values: [0, 60, null, 30, 20]
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

## 8. Generics

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

## 9. Wrapper Classes

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

## 10. Collections Utility Class

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

## 11. Comparable vs. Comparator

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
| **`Queue`** | Holds elements for processing; standard methods return special value (`offer`, `poll`, `peek`) or throw exception. |
| **`PriorityQueue`** | Unbounded min-heap by default; ordered by natural sort or custom `Comparator`; no `null`. |
| **`Deque`** | Double-ended queue; supports operations at head and tail (e.g. `addFirst`, `addLast`). |
| **`ArrayDeque`** | Resizable circular array; modern replacement for `Stack` and faster than `LinkedList`. |
| **`Map`** | Stores key-value pairs (unique keys, duplicate values allowed); not part of `Collection`. |
| **`ArrayList`** | Dynamic array (`1.5x` growth); fast retrieval (`O(1)`), slow middle insert/delete. |
| **`LinkedList`** | Doubly linked list; fast insert/delete (`O(1)`), slow random access (`O(n)`). |
| **`Vector` & `Stack`** | Legacy, synchronized (thread-safe) collections; `Vector` doubles capacity (`2x`). |
| **`HashSet`** | Unique elements, unordered, one `null` allowed, average `O(1)`. |
| **`LinkedHashSet`** | Unique elements, preserves insertion order, average `O(1)`. |
| **`TreeSet`** | Unique elements, sorted ascending order, no `null`, `O(log n)`. |
| **`NavigableSet`** | Sub-interface of `SortedSet`; provides closest-match navigation methods (`ceiling`, `floor`, `higher`, `lower`). |
| **`HashMap`** | Key-value pairs, unordered, one `null` key, average `O(1)`, Red-Black Tree for collisions (Java 8+). |
| **`LinkedHashMap`** | Key-value pairs with insertion order preserved. |
| **`TreeMap`** | Key-value pairs sorted by key, no `null` key, `O(log n)`. |
| **`Generics`** | Enforces compile-time type safety and eliminates manual casting. |
| **Wrapper Classes** | Convert primitives to objects for storage in collections (autoboxing/unboxing). |

### 2. Key Interview Takeaways
- Use **`ArrayList`** for frequent lookups and **`LinkedList`** for frequent insertions/deletions at ends or known positions.
- In **`Queue`**, prefer **`offer()`/`poll()`/`peek()`** over `add()`/`remove()`/`element()` to avoid unexpected runtime exceptions when empty or full.
- Prefer **`ArrayDeque`** over `java.util.Stack` for LIFO stacks and over `LinkedList` for standard FIFO queues.
- Always override both **`equals()`** and **`hashCode()`** when storing custom objects in a `HashSet` or using them as keys in a `HashMap`.
- Prefer **fail-safe** concurrent collections (`ConcurrentHashMap`, `CopyOnWriteArrayList`) over legacy synchronized classes (`Vector`, `Hashtable`) in multithreaded environments.
- Use **`Comparable`** for a single natural ordering inside the class, and **`Comparator`** for flexible or multiple external sort orders.
