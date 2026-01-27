# Data Structures Guide

---

## 🔹 What is a Data Structure?
Data Structure is a technique to organize, store, and manage data in memory efficiently and to define relationships between data elements.

---

## 🔹 Why is Data Structure Important?

### 1️⃣ Interview Perspective
Most technical interviews test:
- Searching & Sorting
- Arrays, Stack, Queue
- Time & Space Complexity
- Real-world problem solving

### 2️⃣ Efficiency
Data Structures help us write:
- Faster code → Minimum Time Complexity
- Optimized memory usage → Minimum Space Complexity

**Example:**
- Linear Search → O(n)
- Binary Search → O(log n)

> Binary search is faster due to data structure + logic

### 3️⃣ Reusability
Once a data structure is implemented, it can be reused.

**Example:**
- Java Collection Framework: ArrayList, HashMap, Stack, Queue

### 4️⃣ Abstraction
Data Structures hide implementation details and expose only operations.

**Example:**
```java
stack.push();
stack.pop();
```

### 5️⃣ Scalability
Efficient data structures handle large data without performance issues.

---

## 🔹 Real-World Applications of Data Structures

| Application             | Data Structure         | Purpose                    |
| ----------------------- | -------------------- | -------------------------- |
| Facebook / Twitter Feed | Heap / PriorityQueue  | Show relevant/latest posts |
| Google Maps / Waze      | Graph                 | Shortest / fastest path    |
| Browser Navigation      | Stack                 | Back & Forward             |
| CPU Scheduling          | Queue / PriorityQueue | Process execution          |
| Database Indexing       | B-Tree / HashTable    | Fast search                |
| Cache Systems           | HashMap               | Fast access                |

---

## 🔹 Types of Data Structures

### 1️⃣ Linear Data Structures
Data stored sequentially
- Array – Fixed size, index based
- LinkedList – Dynamic, node based
- Stack – LIFO
- Queue – FIFO
- Deque – Insert/Delete from both ends

### 2️⃣ Non-Linear Data Structures
Hierarchical or interconnected data
- Tree – File system
- Graph – Maps, Social Networks
- Heap – Priority based processing
- Trie – Autocomplete, Spell check

### 3️⃣ Hash-Based Data Structures
Key-Value based access
- HashTable
- HashMap
- HashSet

### 4️⃣ Special Data Structures
- Matrix
- Segment Tree
- Fenwick Tree
- Disjoint Set
- Bloom Filter

---

## 🔹 Array Data Structure
Array is a collection of same type elements stored contiguously with index starting from 0.

**Declaration:**
```java
int a[]; // or int[] a;
```

**Memory Allocation:**
```java
a = new int[5];
```

**Reference Variable:**
A variable that stores the base address of the array.

**Access Base Address Hashcode:**
```java
System.identityHashCode(a);
```

**Example: Input & Display Array**
```java
Scanner sc = new Scanner(System.in);
int a[] = new int[5];
for(int i=0;i<a.length;i++) a[i]=sc.nextInt();
for(int i=0;i<a.length;i++) System.out.printf("%d\t", a[i]);
```

**Example: Copying Arrays**
```java
int b[] = a; // copies address only
b[2] = 2000;
```

**One-Line Exam Answer:**
> In Java, arrays are reference types. Multiple references point to same array, modifications via one reference affect all references.

**Bitwise Array Example**
```java
int b = a[0 + 2 >> 2];
int c = a[0 + 1 ^ 2];
int d = a[1 & 2 ^ 3];
int e[] = a;
e[2] = b + c + d;
```

---

## 🔹 Basic Array Operations
1. Searching
2. Sorting
3. Insertion / Deletion
4. Merging
5. Finding duplicates
6. Rotation
7. Sub-array
8. Reverse

**Approaches:**
- Brute force approach
- Two pointer approach
- Sliding window

---

## 🔹 Searching Algorithms

### 1️⃣ Linear Search
- Compare search key with each element one by one.
- Works on sorted and unsorted arrays.
- Time Complexity: O(n), Space Complexity: O(1)

**Algorithm:**
1. START
2. Declare array a[]
3. Declare pos = -1
4. Input search key
5. Compare with each element
6. If found → store index, stop
7. Check pos → found or not
8. STOP

**Code:**
```java
for(i=0;i<a.length;i++){
  if(a[i]==skey){index=i; break;}
}
```

**Brute Force Approach:**
- Simple trial of all possibilities, ignoring efficiency.

### 2️⃣ Binary Search
- Requirement: Sorted array
- Divide and conquer by middle element
- Time Complexity: O(log n)

**Code:**
```java
Arrays.sort(a);
while(l<=r){
  mid = l + (r-l)/2;
  if(a[mid]==skey){index=mid; break;}
  else if(a[mid]<skey) l=mid+1;
  else r=mid-1;
}
```

---

## 🔹 Sorting Algorithms
| Algorithm      | Best Case  | Worst Case |
| -------------- | ---------- | ---------- |
| Bubble Sort    | O(n)       | O(n²)      |
| Selection Sort | O(n²)      | O(n²)      |
| Insertion Sort | O(n)       | O(n²)      |
| Merge Sort     | O(n log n) | O(n log n) |
| Heap Sort      | O(n log n) | O(n log n) |

### Selection Sort
- Select smallest element and place in correct position.
- Time Complexity: O(n²), Space: O(1)

### Bubble Sort
- Repeatedly swap adjacent elements if in wrong order.
- Time Complexity: Best O(n), Worst O(n²), Space O(1)

### Insertion Sort
- Insert element into correct position in sorted part.
- Time Complexity: Best O(n), Worst O(n²), Space O(1)

### Merge Sort & Heap Sort
- Divide and conquer, O(n log n), Space O(n) / O(1)

### Counting Sort
- Count frequency, rebuild sorted array, O(n+k), Space O(k)

---

## 🔹 Stack
- Follows LIFO (Last In First Out)
- Operations: Push, Pop, Peek, Display, Search

**Push / Pop / Peek** examples provided in Java above.

**Applications:**
- Undo/Redo, Browser navigation, Call Stack, Expression evaluation, Backtracking

---

## 🔹 Queue
- Follows FIFO (First In First Out)
- Pointers: Front (dequeue), Rear (enqueue)
- Limitation: Linear Queue wastes memory
- Implementation: Array, LinkedList

**Operations:**
- Insert/Enqueue
- Remove/Dequeue
- Display/Peek
- IsEmpty / IsFull

**Code Example:** Provided above.

**Limitation Example:**
- Queue appears full but indices before front are empty.

---

## 🔹 Two-Dimensional Arrays
- Represent rows and columns
- Internally stored sequentially
- Operations: Input, Display, Column Sum, Sorting Columns

**Code Examples:** Provided above.

---