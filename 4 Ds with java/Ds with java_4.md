🔹 What is a Data Structure?
-----------------------------------------------
Data Structure is a technique to organize, store, and manage data in memory efficiently and to define relationships between data elements.

-------------------------------------------------------------
🔹 Why is Data Structure Important?
-------------------------------------------------------------
1️⃣ Interview Perspective
Searching & Sorting
Arrays, Stack, Queue   
Time & Space Complexity
Real-world problem solving

2️⃣ Efficiency
Data Structures help us write:  
Faster code → Minimum Time Complexity
Optimized memory usage → Minimum Space Complexity

Example:
Linear Search → O(n)
Binary Search → O(log n)
(Binary search is faster due to data structure + logic)

3️⃣ Reusability
Once a data structure is implemented, it can be reused.
 
Example:
👉 Java Collection Framework
ArrayList
HashMap
Stack
Queue

Developers don’t need to rewrite logic every time.

4️⃣ Abstraction

Data Structures hide implementation details and expose only operations.

Example:
stack.push();
stack.pop();

5️⃣ Scalability

Efficient data structures handle large data without performance issues.

---------------------------------------------------------------------------------
🔹 Real-World Applications of Data Structures
---------------------------------------------------------------------------------
| Application             | Data Structure         | Purpose                    |
| ----------------------- | ---------------------- | -------------------------- |
| Facebook / Twitter Feed | Heap / PriorityQueue   | Show relevant/latest posts |
| Google Maps / Waze      | Graph                  | Shortest / fastest path    |
| Browser Navigation      | Stack                  | Back & Forward             |
| CPU Scheduling          | Queue / Priority Queue | Process execution          |
| Database Indexing       | B-Tree / HashTable     | Fast search                |
| Cache Systems           | HashMap                | Fast access                |
---------------------------------------------------------------------------------

🔹 Types of Data Structures
-----------------------------------------------------------------------------------
1️⃣ Linear Data Structures
Data stored sequentially

Array – Fixed size, index based
LinkedList – Dynamic, node based
Stack – LIFO
Queue – FIFO
Deque – Insert/Delete from both ends

2️⃣ Non-Linear Data Structures
Hierarchical or interconnected data

Tree – File system
Graph – Maps, Social Networks
Heap – Priority based processing
Trie – Autocomplete, Spell check

3️⃣ Hash-Based Data Structures
Key-Value based access

HashTable
HashMap
HashSet

4️⃣ Special Data Structures
Matrix
Segment Tree
Fenwick Tree
Disjoint Set
Bloom Filter

----------------------------------------------------------------------------------------
🔹 Array Data Structure

Array is a collection of same type elements stored contiguously with index starting from 0.
Array Declaration

Syntax: datatype   variablename[  ];
	 Or
	Datatype [] variablename;

Example:  int a[]; //reference variable 


int a[];
// or
int[] a;

📌 Reference variable default value = null
Memory Allocation
a = new

Reference Variable
A variable that stores the base address of the array.

Base Address
Address of the 0th index element.
Meaning of a[i]
Base Address + (index × size of datatype)

Q. How to access base address or hashcode of base address?
If we want to access hashcode then we can access it using 

Syntax: System.identityHashCode(array variable /ref of class );

public class ARRAPP
{
    static int a[];

    public static void main(String x[])
    {
        a = new int[5];
        System.out.println("A is " + System.identityHashCode(a));
    }
}

A is 622488023

import java.util.*;
public class ADSAPP
{
    public static void main(String x[])
    {
        int a[];   // reference variable with default value null
        a = new int[5]; // allocate memory for array of size 5

        Scanner xyz = new Scanner(System.in);

        System.out.println("Enter values in array");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = xyz.nextInt();
        }

        System.out.println("Display array data");
        for(int i = 0; i < a.length; i++)
        {
            System.out.printf("%d\t", a[i]);
        }
    }
}

Output
Display array data
10    20    30    40    50


public class AAPP
{
    public static void main(String x[])
    {
        int a[] = new int[]{10,20,30,40,50};
        int b[];
        b = a;
        b[2] = 2000;

        System.out.println("Display array");
        for(int i = 0; i < a.length; i++)
        {
            System.out.printf("%d\t", a[i]);
        }
    }
}

🔹 Output
Display array
10    20    2000    40    50

🔹 One-Line Exam Answer

In Java, arrays are reference types. When multiple references point to the same array object, modification through one reference affects the array accessed by all other references.

b = a;  // creates new array //wrong
b = a;  // copies address only //right


public class AAPP
{
    public static void main(String x[])
    {
        int a[] = new int[]{10,20,30,40,50};

        int b = a[0 + 2 >> 2];   // b = a[0] = 10
        int c = a[0 + 1 ^ 2];    // c = a[1 ^ 2] = a[3] = 40
        int d = a[1 & 2 ^ 3];    // d = a[(1&2)^3] = a[3] = 40
        int e[] = a;

        e[2] = b + c + d;   // e[2] = 10 + 40 + 40 // e[2] = 90

        System.out.println("display a array");
        for(int i = 0; i < a.length; i++)
        {
            System.out.printf("%d\t", a[i]);
        }
    }
}
🔹 Program Output
display a array
10    20    90    40    50

Example: 
WAP to input five values in array and find the max value from array

import java.util.*;
public class AAPP
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];

        System.out.println("Enter five value in array");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        int max = a[0];
        for(int i = 1; i < a.length; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        System.out.println("Max is " + max);
    }
}

Enter five value in array
10 20 30 40 50 
Max is 50

Example: WAP to insert value in array on specified index and move other index by 1.

import java.util.*;
public class AIAPP
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);
        int a[] = new int[6];

        System.out.println("Enter five values in array");
        for(int i = 0; i < (a.length - 1); i++)
        {
            a[i] = xyz.nextInt();
        }

        System.out.println("Display array before insertion");
        for(int i = 0; i < a.length; i++)
        {
            System.out.println("a[" + i + "] ----> " + a[i]);
        }

        System.out.println("Enter index and value");
        int index = xyz.nextInt();
        int value = xyz.nextInt();

        for(int i = (a.length - 2); i >= index; i--)
        // 4; 4>=2; 4--
        {
            a[i + 1] = a[i]; // right sifting 
        }

        a[index] = value;

        System.out.println("Display array after insertion");
        for(int i = 0; i < a.length; i++)
        {
            System.out.println("a[" + i + "] ----> " + a[i]);
        }
    }
}

▶ Output

Display array before insertion
a[0] ----> 10
a[1] ----> 20
a[2] ----> 30
a[3] ----> 40
a[4] ----> 50
a[5] ----> 0
Enter index and value
Display array after insertion
a[0] ----> 10
a[1] ----> 20
a[2] ----> 99
a[3] ----> 30
a[4] ----> 40
a[5] ----> 50

<!-- | i | Statement |       Array       |
     | - | --------- | ----------------- |
     | 4 | a[5]=a[4] | 10 20 30 40 50 50 |
     | 3 | a[4]=a[3] | 10 20 30 40 40 50 |
     | 2 | a[3]=a[2] | 10 20 30 30 40 50 | -->
----------------------------------------------------
🔹 Basic Array Operations
----------------------------------------------------
1. Searching
2. Sorting
3. Insertion / Deletion
4. Merging
5. Finding duplicates
6. Rotation
7. Sub-array
8. Reverse

Approaches 
1. Brute force approach 
2. Two pointer approach 
3. Sliding window 

----------------------------------------------------
🔹 Searching Algorithms
----------------------------------------------------
1.  Linear Search(brute force approach)
Linear search is a type of horizontal search in which we compare the search key with each element of the array one by one.
    If the element is found, its index is returned.
    If the element is not found, -1 is returned.

    Works on sorted and unsorted arrays
    Simple but slow for large data
    Time Complexity: O(n)
    Space Complexity: O(1)
----------------------------------------------------
✅ Algorithm for Linear Search
Step 1: START
Step 2: Declare an array a[]
Step 3: Declare a variable pos and initialize it with -1
Step 4: Declare variable key (search element)
Step 5: Store values in the array
Step 6: Input the search key
Step 7: Compare the search key with each element of the array one by one
Step 8:
If the search key matches any element
Store its index in pos
Stop searching
Step 9:
If pos != -1, element is found
Else, element is not found
Step 10: STOP
----------------------------------------------------

import java.util.*;
public class LSAPP
{  
    public static void main(String x[])
   {     
        Scanner xyz  = new Scanner(System.in);
	    int a[]=new int[5];

	    int index=-1 , skey , i;

        System.out.println("Enter values in array");
        for(i=0;i<a.length;i++)
        {  
            a[i]=xyz.nextInt();
        }

        System.out.println("Enter search key");
        skey=xyz.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]==skey)
            {  
                index=i;
            }
        }
        if(index!=-1)
        { 
            System.out.println("Value found");
        }
        else
        { 
            System.out.println("Value not found");
        }
   }
}


Q. What is the brute force approach ?

✅ Brute Force Approach (Simple Explanation)
Linear Search → Brute Force

This approach indicates that there is no shortcut method used in searching, sorting, or any other operation on arrays, strings, collections, or loops.
We simply try all possible ways to get the result.

In this approach:
We focus only on getting the correct result
Efficiency of the code is ignored
Time complexity may increase

---------------------------------------------------------------------------------
Binary Search
---------------------------------------------------------------------------------
Requirement: The array must be sorted (ascending or descending order).
Goal: Efficiently find a specific element (search key) in the array.

Binary Search Logic
1. Divide the array:
    Find the middle element of the array.

2. Compare with search key:
    If the middle element equals the search key → element found.
    If the search key is less than the middle element → search in the left half of the array.
    If the search key is greater than the middle element → search in the right half of the array.

3. Repeat the process:
    Continue dividing the chosen half into two sections and comparing the middle element with the search key.
    Stop when the element is found or the subarray becomes empty (element not present).

Advantages
    Much faster than linear search for large arrays.
    Time Complexity: O(log n) (because array is divided in half each time).

| Algorithm      | Best Case  | Worst Case |
| -------------- | ---------- | ---------- |
| Bubble Sort    | O(n)       | O(n²)      |
| Selection Sort | O(n²)      | O(n²)      |
| Insertion Sort | O(n)       | O(n²)      |
| Merge Sort     | O(n log n) | O(n log n) |
| Heap Sort      | O(n log n) | O(n log n) |


Example 
import java.util.*;

public class BSAPP
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        int skey, l = 0, r = a.length - 1, mid, index = -1;

        System.out.println("Enter values in array (sorted order preferred)");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }

        // Binary Search requires sorted array
        Arrays.sort(a);

        System.out.println("Enter search key");
        skey = sc.nextInt();

        while (l <= r)
        {
            mid = l + (r - l) / 2; // (l+r)/2

            if (a[mid] == skey)
            {
                index = mid;
                break;
            }
            else if (a[mid] < skey)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }

        if (index != -1)
        {
            System.out.println("Element found at index: " + index);
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}

Enter values in array (sorted order preferred)
10 20 30 40 50 60 70 80 90 100
Enter search key
100
Element found at index: 9

Example: WAP to merge two array of same size in third array

import java.util.*;
public class MAAPP
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[a.length + b.length];

        System.out.println("Enter value in first array");
        for(int i=0; i<a.length; i++)
        {   
            a[i] = sc.nextInt();
        }

        System.out.println("Enter value in second array");
        for(int i=0; i<b.length; i++)
        {
            b[i] = sc.nextInt();
        }

        //merging logics
        for(int i = 0, j = a.length; i<a.length; i++, j++)
        {
            c[i] = a[i];
            c[j] = b[i]; 
        }

        System.out.println("display resultant array");
        {
            for(int i=0; i<c.length; i++)
            {
                System.out.print(c[i]);
            }
        }
    }
}

Example: WAP to store 5 values in array in ascending and find missing elements from array 

import java.util.*;
public class MEAPP
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter value in ascending order");
        for(int i=0; i<a.length; i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=1; i<a.length; i++)
	    {
	       int diff = a[i] - a[i-1];
		   if(diff>1)
		   {   
               int count = a[i-1];//first element a[0]
			   while(count<(a[i]-1))
			   {   
                  System.out.printf("%d\t",++count);
			   }
		   }
	   }
	}
}

<!-- i = 1
a[i] = 4
a[i-1] = 2
diff = 4 - 2 = 2
✔ diff > 1 → missing numbers exist

count = 2
while(count < 3)
while loop

++count → 3
print 3 -->

Enter value in ascending order
2 4 7 10 11

Output
3    5    6    8    9

import java.util.*;
public class MEAPP
{   
    public static void main(String x[])
	{  
       Scanner xyz  = new Scanner(System.in);
	   int a[]=new int[5];
	   System.out.println("Enter values in ascending order");
	   for(int i=0; i<a.length; i++)
	   { 
        a[i]=xyz.nextInt();
	   } 
	   Arrays.sort(a);//log n

	   for(int i=a[0],count=0; i<a[a.length-1];i++)
	   {
	        if(i!=a[count])
			{ 
                System.out.printf("%d\t",i);
		    }
			else
            {
				++count; 
			}
	   }
	}
}

Example: WAP to create array size of 10 find occurence of every elements 

import java.util.*;
public class FOOAPP
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        System.out.println("Enter value in array");
        for(int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();   
        }

        Arrays.sort(a);

        int count = 1, i;
        for(i = 1; i < a.length; i++)
        {
            if(a[i] == a[i-1])
            {
                ++count;
            }
            else
            {
                System.out.println(a[i-1] + " ---> " + count);
                count = 1;
            }
        }

        // printing last element frequency
        System.out.println(a[i-1] + " ---> " + count);
    }
}
🔹 Sample Input
5 2 3 5 2 5 3 2 4 2
a = [2, 2, 2, 2, 3, 3, 4, 5, 5, 5]

🔹 Output
2 ---> 4
3 ---> 2
4 ---> 1
5 ---> 3

| i | a[i-1] | a[i] | Condition | Action           | count |
| - | ------ | ---- | --------- | ---------------- | ----- |
| 1 | 2      | 2    | equal     | count++          | 2     |
| 2 | 2      | 2    | equal     | count++          | 3     |
| 3 | 2      | 2    | equal     | count++          | 4     |
| 4 | 2      | 3    | not equal | print `2 ---> 4` | 1     |
| 5 | 3      | 3    | equal     | count++          | 2     |
| 6 | 3      | 4    | not equal | print `3 ---> 2` | 1     |
| 7 | 4      | 5    | not equal | print `4 ---> 1` | 1     |
| 8 | 5      | 5    | equal     | count++          | 2     |
| 9 | 5      | 5    | equal     | count++          | 3     |

Example: Find duplicated values from array

import java.util.*;
public class FOAPP
{  
    public static void main(String x[])
	  { 
        Scanner xyz  = new Scanner(System.in);
	    int a[]=new int[10];
		System.out.println("Enter values in array");

		for(int i=0;i<a.length; i++)
		{
		    a[i]=xyz.nextInt();
		}

		Arrays.sort(a);
		int count=1,i;

		for(i=1; i<a.length;i++)
		{
			 if(a[i]==a[i-1])
			 { 
                ++count;
			 }
			 else
             {
				if(count>1)
				{
				   System.out.printf("%d --->%d\n",a[i-1],count);
				}
				 count=1;
			}
		}
		if(count>1) 
        {
		  System.out.printf("%d --->%d\n",a[i-1],count);
        }  
	}
}


Example for finding union two arrays 
To merge two arrays, remove duplicate elements, and display the union of arrays.

import java.util.*;
public class UAAPP
{    
    public static void main(String x[])
	{ 
       int a[]=new int[]{1,2,3};
	   int b[]=new int[]{2,3,4,5};
	   int c[]=new int[a.length+b.length];

       //Step 1: Merge arrays into c
	    for(int i = 0; i < a.length; i++)
        {
         c[i] = a[i];
        }

        for(int i = 0; i < b.length; i++)
        {
            c[a.length + i] = b[i];
        }
        
       //Step 2: Sort array c
	    Arrays.sort(c);

        // Step 3: Remove duplicates
		int i,count;
		for(i=1,count=0; i<c.length; i++)
		{
			if(c[i]!=c[i-1])
			{ 
                c[count++]=c[i-1];
			}
		}
		c[count]=c[i-1];//printing lastelement

       // Step 4: Create new array d
		int d[]=new int[count+1]; //4+1

		System.out.println("Display c array");
		for(i=0; i<=count; i++)
		{ 
            d[i]=c[i];
		} 

        //Step 5: Garbage Collection
		c=null;
		System.gc();//garbage collection

        for(i=0; i<d.length; i++)
		{
            System.out.print(d[i]+" ");
		} 
	}
}

output 

Enter values in array
2 2 2 3 4 5 4 5 6 7

2 --->3
4 --->2
5 --->2

------------------------------------------------------------------------
Sorting algorithm 
A sorting algorithm arranges elements of an array or list in a specific order
(ascending or descending).
______________________________________________________________________
Types of Sorting Algorithms

1️⃣ Selection Sort 
Selection : selection sort is a simple comparison based sorting algorithm.
🔹 Idea:

Select the smallest element and place it at the correct position.
🔹 Steps:
1. Find the minimum element in the array
2. Swap it with the first position
3. Repeat for remaining elements

🔹 Time Complexity:
Best: O(n²)
Worst: O(n²)

🔹 Space:
O(1) (in-place)

Example with source code

import java.util.*;
public class SSORTAPP
{ 
    public static void main(String x[])
  { 
    Scanner xyz  = new Scanner(System.in);
    int a[] = new int[5];

	System.out.println("enter five values in array");
	for(int i=0;i<a.length;i++)
	{
		a[i]=xyz.nextInt();
	}

	System.out.println("Display array before sorting");
	for(int i=0;i<a.length; i++)
	{ 
        System.out.printf(a[i]+" ");
	}

	System.out.println("\n");

	//sorting logics 
	for(int i=0; i<a.length; i++)
	{
		for(int j = (i+1); j<a.length; j++)
		{
			if(a[i]>a[j])
			{ 
                int temp = a[i]; //swap using 3rd variable
				a[i] = a[j];
				a[j] = temp;
		    }
		}
	}

	System.out.println("Display array after sorting");
	for(int i=0; i<a.length; i++)
	{ 
        System.out.printf("%d\t",a[i]);
	}
  }
}

Sample Input
5 3 1 4 2

Final Sorted Array
1 2 3 4 5

<!--🔹 Dry Run (Step by Step)
▶ Pass 1 (i = 0)

 Compare a[0] = 5 with remaining elements:

| j | Comparison | Action  | Array     |
| - | ---------- | ------- | --------- |
| 1 | 5 > 3      | swap    | 3 5 1 4 2 |
| 2 | 3 > 1      | swap    | 1 5 3 4 2 |
| 3 | 1 > 4      | no swap | 1 5 3 4 2 |
| 4 | 1 > 2      | no swap | 1 5 3 4 2 |


✔ Smallest element placed at index 0

▶ Pass 2 (i = 1)

Compare a[1] = 5

| j | Comparison | Action  | Array     |
| - | ---------- | ------- | --------- |
| 2 | 5 > 3      | swap    | 1 3 5 4 2 |
| 3 | 3 > 4      | no swap | 1 3 5 4 2 |
| 4 | 3 > 2      | swap    | 1 2 5 4 3 |

▶ Pass 3 (i = 2)

Compare a[2] = 5
| j | Comparison | Action | Array     |
| - | ---------- | ------ | --------- |
| 3 | 5 > 4      | swap   | 1 2 4 5 3 |
| 4 | 4 > 3      | swap   | 1 2 3 5 4 |


▶ Pass 4 (i = 3)

Compare a[3] = 5
| j | Comparison | Action | Array     |
| - | ---------- | ------ | --------- |
| 4 | 5 > 4      | swap   | 1 2 3 4 5 |


-->

2️⃣ Bubble Sort
🔹 Idea:
Repeatedly swap adjacent elements if they are in wrong order.

🔹 Steps:
1. Compare first two elements
2. Swap if needed
3. Largest element “bubbles” to the end

🔹 Time Complexity:
Best: O(n)
Worst: O(n²)

🔹 Space:
O(1)

import java.util.*;
public class BSAPP
{  
   public static void main(String x[])
   {
      Scanner xyz  = new Scanner(System.in);
	  int a[]=new int[5];

	  System.out.println("Enter values in array");
	  for(int i=0; i<a.length;i++)
	  { 
        a[i]=xyz.nextInt();
	  }
      
	  System.out.println("display array before sort");
	  for(int i=0;i<a.length;i++)
	  { 
        System.out.printf("%d\t",a[i]);
	  }

	  //apply sorting algorithm
	  for(int i=0; i<(a.length-1); i++) //No comparison possible in last pass
	  {  
        boolean flag = false;
	    for(int j=0; j<(a.length-1)-i;j++) //Last i elements are already sorted
		{
		    if(a[j]>a[j+1])
			{
			  int temp = a[j];
			  a[j] = a[j+1];
			  a[j+1] = temp;

			  flag = true;
			}
		}
		if(!flag)
		{
            break;
		}
	  }
	  
	  System.out.println("\ndisplay array after sort");
	  for(int i=0;i<a.length;i++)
	  { 
        System.out.printf("%d\t",a[i]);
	  }
   }
}

<!-- 
🔸 OUTER LOOP – Pass 1 (i = 0)
flag = false
| j | Compare | Swap | Array after swap | flag |
| - | ------- | ---- | ---------------- | ---- |
| 0 | 5 > 3   | Yes  | 3 5 1 4 2        | true |
| 1 | 5 > 1   | Yes  | 3 1 5 4 2        | true |
| 2 | 5 > 4   | Yes  | 3 1 4 5 2        | true |
| 3 | 5 > 2   | Yes  | 3 1 4 2 5        | true |
flag = true → continue
🔸 Pass 2 (i = 1)
flag = false
| j | Compare | Swap | Array     | flag |
| - | ------- | ---- | --------- | ---- |
| 0 | 3 > 1   | Yes  | 1 3 4 2 5 | true |
| 1 | 3 > 4   | No   | 1 3 4 2 5 | true |
| 2 | 4 > 2   | Yes  | 1 3 2 4 5 | true |
flag = true → continue
🔸 Pass 3 (i = 2)
| j | Compare | Swap | Array     | flag  |
| - | ------- | ---- | --------- | ----- |
| 0 | 1 > 3   | No   | 1 3 2 4 5 | false |
| 1 | 3 > 2   | Yes  | 1 2 3 4 5 | true  |
flag = true → continue
Pass 4 (i = 3)
| j | Compare | Swap |
| - | ------- | ---- |
| 0 | 1 > 2   | No   |

if(!flag)
    break; -->
output
display array before sort
5 3 1 4 2

display array after sort
1 2 3 4 5

3️⃣ Insertion Sort
🔹 Idea:
Insert each element into its correct position in the sorted part.
🔹 Steps:
Assume first element is sorted
Take next element and insert it properly
🔹 Time Complexity:
Best: O(n)
Worst: O(n²)

🔹 Space:
O(1)


4️⃣ Merge Sort
🔹 Idea:
Divide and Conquer
Divide array into halves
Sort halves
Merge them
Heap sort 

🔹 Time Complexity:
Best/Worst: O(n log n)

🔹 Space:
O(n)

5️⃣ Heap Sort
🔹 Idea:
Uses Heap Data Structure
Build max heap
Remove max element repeatedly
Counter sort 

🔹 Time Complexity:
Best/Worst: O(n log n)

🔹 Space:
O(1)

6️⃣ Counting Sort
🔹 Idea:
Counts frequency of elements and rebuilds sorted array.

🔹 Time Complexity:
O(n + k)
(k = range of values)

🔹 Space:
O(k)

---------------------------------------------------------------------
🔹 Stack
Definition
Stack follows LIFO (Last In First Out).
------------------------------------------------------------------------
Stack Operations

1. Push

    Push means insert an element into the stack.
    When an element is pushed → top increases by 1
    If stack is full → Stack Overflow

🔹 Push Code (Java)

if(top == size - 1)
{
    System.out.println("Stack Overflow");
}
else
{
    top++;
    stack[top] = item;
}

🔸 Stack Overflow
Trying to insert data when stack is already full.
------------------------------------------------------------------------

2. Pop

Pop means remove the top element from stack.
After removing → top decreases by 1
Initially top = -1
If stack is empty → Stack Underflow

🔹 Pop Algorithm (Practical Steps)
1. Check if top == -1
    If yes → Underflow
2. Else
item = stack[top]
    top = top - 1

🔹 Pop Code (Java)

if(top == -1)
{
    System.out.println("Stack Underflow");
}
else
{
    int item = stack[top];
    top--;
    System.out.println("Removed: " + item);
}


🔸 Stack Underflow
Trying to remove data when stack is empty.
------------------------------------------------------------------------

3. Peek

Peek retrieves the top element of stack without removing it.
top does not decrease
🔹 Peek Algorithm

    1. Check if top == -1
    If yes → Underflow

    2. Else
    Display stack[top]

Peek Code

if(top == -1)
{
    System.out.println("Stack is Empty");
}
else
{
    System.out.println("Top element: " + stack[top]);
}
------------------------------------------------------------------------

4. Display

Displays all elements of stack from top to bottom.
🔹 Display Algorithm

    1. Check if top == -1
    If yes → Underflow

    2. Else
    Print elements from top to 0

Display Code

if(top == -1)
{
    System.out.println("Stack is Empty");
}
else
{
    for(int i = top; i >= 0; i--)
    {
        System.out.print(stack[i] + " ");
    }
}
------------------------------------------------------------------------

5. Search

Used to find an element in the stack.

    🔹 Search Algorithm
    1. Check if top == -1
    If yes → Stack Empty

    2. Else
    Traverse from top to 0
    If found → print position

int key = 20;
boolean found = false;

for(int i = top; i >= 0; i--)
{
    if(stack[i] == key)
    {
        System.out.println("Element found at position: " + (top - i + 1));
        found = true;
        break;
    }
}
if(!found)
{
    System.out.println("Element not found");
}
------------------------------------------------------------------------
Stack Applications
1. Undo / Redo
2. Browser Navigation
3. Call Stack
4. Expression Evaluation
5. Backtracking
6. Stack Implementation
7. Using Array
8. Using LinkedList

📌 Overflow → Stack full
📌 Underflow → Stack empty
------------------------------------------------------------------------
Example using stack 
import java.util.*;

public class SApplication
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);
        int a[] = new int[5];
        int top = -1;
        int choice;

        do
        {
            System.out.println("1 : PUSH");
            System.out.println("2 : POP");
            System.out.println("3 : DISPLAY");
            System.out.println("4 : PEEK");
            System.out.println("5 : SEARCH");
            System.out.println("6 : EXIT");
            System.out.print("Enter your choice : ");

            choice = xyz.nextInt();

            switch(choice)
            {
                // PUSH
                case 1:
                    if(top == a.length - 1)
                    {
                        System.out.println("Stack Overflow");
                    }
                    else
                    {
                        System.out.print("Enter value : ");
                        int value = xyz.nextInt();
                        top++;
                        a[top] = value;
                        System.out.println("Element pushed");
                    }
                    break;

                // POP
                case 2:
                    if(top == -1)
                    {
                        System.out.println("Stack Underflow");
                    }
                    else
                    {
                        System.out.println("Popped value : " + a[top]);
                        top--;
                    }
                    break;

                // DISPLAY
                case 3:
                    if(top == -1)
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.println("Stack elements:");
                        for(int i = top; i >= 0; i--)
                        {
                            System.out.println(a[i]);
                        }
                    }
                    break;

                // PEEK
                case 4:
                    if(top == -1)
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.println("Top element : " + a[top]);
                    }
                    break;
                
                // SEARCH
                case 5:
                    if(top == -1)
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.print("Enter value to search : ");
                        int key = xyz.nextInt();
                        int index = -1;

                        for(int i = 0; i <= top; i++)
                        {
                            if(a[i] == key)
                            {
                                index = i;
                                break;
                            }
                        }

                        if(index != -1)
                        {
                            System.out.println("Element found at position from top : " + (top - index));
                        }
                        else
                        {
                            System.out.println("Element not found");
                        }
                    }
                    break;

                // EXIT
                case 6:
                    System.out.println("Program terminated");
                    xyz.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
        while(true);
    }
}
<!-- 
>java SApplication.java
1 : PUSH
2 : POP
3 : DISPLAY
4 : PEEK
5 : SEARCH
6 : EXIT
Enter your choice : 1
Enter value : 10

Element pushed
1 : PUSH
2 : POP
3 : DISPLAY
4 : PEEK
5 : SEARCH
6 : EXIT
Enter your choice : 1
Enter value : 20

Element pushed
1 : PUSH
2 : POP
3 : DISPLAY
4 : PEEK
5 : SEARCH
6 : EXIT
Enter your choice : 1
Enter value : 30

Element pushed
1 : PUSH
2 : POP
3 : DISPLAY
4 : PEEK
5 : SEARCH
6 : EXIT
Enter your choice : 1
Enter value : 40

Element pushed
1 : PUSH
2 : POP
3 : DISPLAY
4 : PEEK
5 : SEARCH
6 : EXIT
Enter your choice : 1
Enter value : 50

Element pushed
1 : PUSH
2 : POP
3 : DISPLAY
4 : PEEK
5 : SEARCH
6 : EXIT
Enter your choice : 3
Stack elements:
50
40
30
20
10

1 : PUSH
2 : POP
3 : DISPLAY
4 : PEEK
5 : SEARCH
6 : EXIT
Enter your choice : 2
Popped value : 50

1 : PUSH
2 : POP
3 : DISPLAY
4 : PEEK
5 : SEARCH
6 : EXIT
Enter your choice : 4
Top element : 40

1 : PUSH
2 : POP
3 : DISPLAY
4 : PEEK
5 : SEARCH
6 : EXIT
Enter your choice : 5
Enter value to search : 10

Element found at position from top : 3
1 : PUSH
2 : POP
3 : DISPLAY
4 : PEEK
5 : SEARCH
6 : EXIT
Enter your choice : 6
Program terminated -->
---------------------------------------------
🔹 Queue
Queue follows FIFO (First In First Out).
This means:
The element that is inserted first will be removed first.

Pointers in Queue
A queue uses two pointers:

1. Rear
    Used to insert data into the queue
    Insertion operation is called Enqueue

2.Front
    Used to remove data from the queue
    Removal operation is called Dequeue

Queue Limitation
Linear Queue wastes memory space.
There are two ways to implement Queue 
______________________________________________
1. Using array 
2. Using linked list

Basic Operations on Queue
    Insert / Enqueue – Insert element from the rear
    Remove / Dequeue – Remove element from the front
    Display / Peek – View front element
    
    IsEmpty – Check queue is empty or not
    IsFull – Check queue is full or not
   
1) Insert Operation (Enqueue)
    Insert operation is used to store data in the queue.
    During insertion, the rear pointer increases by 1.
    The new element is added at the rear end of the queue.

    Queue Full / Overflow Condition

    Queue full condition occurs when we try to insert an element but no space is available in the queue
    This condition is also called Queue Overflow

    Example
    If queue size = 5
    and rear = 4 (last index)

    Trying to insert a new element → Queue Overflow
    ✅ Solution → Circular Queue
    🔹 Two-Dimensional Array
    Used to represent tables / matrices
    (Not true matrix mathematically, but logical structure)

2) Delete Operation (Dequeue)

Delete operation is used to remove data from the queue.
    Deletion is performed using the front pointer
    First, the element at the front is removed
    After deletion, the front pointer increases by 1.

Queue Empty / Underflow Condition
    Queue empty condition occurs when we try to delete an element but no element is present in the queue
    This condition is called Queue Underflow

Example
If:
  front > rear
    or queue has no elements  
    Trying to delete → Queue Underflow

3) Display : 
Display operation is used to show all elements of the queue.

Steps:
    1. First, check queue empty condition
    If the queue is empty, display “Queue is Empty”
    2. If the queue is not empty:
    Display elements from front to rear

Explanation:
    1.Data is fetched starting from the front pointer
    2. Data is displayed up to the rear pointer
    3.Order of display follows FIFO

import java.util.Scanner;
public class QAPP
{
    public static void main(String x[])
    {
        int q[] = new int[5];
        int front = 0, rear = -1;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1: // INSERT
                    if(rear == q.length - 1)
                    {
                        System.out.println("Queue is Full (Overflow)");
                    }
                    else
                    {
                        rear++;
                        System.out.print("Enter value: ");
                        q[rear] = sc.nextInt();
                        System.out.println("Inserted Successfully");
                    }
                    break;

                case 2: // DELETE
                    if(front > rear)
                    {
                        System.out.println("Queue is Empty (Underflow)");
                    }
                    else
                    {
                        System.out.println("Deleted value: " + q[front]);
                        front++;
                    }
                    break;

                case 3: // DISPLAY

                    if( front > rear )
                    {
                        System.out.println("Queue is Empty");
                    }
                    else
                    {
                        System.out.print("Queue Elements: ");

                        for(int i = front; i <= rear; i++)
                        {
                            System.out.print(q[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4: // EXIT
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");
            }
        }
        while(true);
    }
}

The main limitation of a Linear Queue occurs when the rear pointer reaches the last index of the queue, while the front pointer is not at zero.
In this condition:
The queue appears to be full
Even though there is empty space available before the front pointer
This available space cannot be used to store new elements

Queue size = 5
Front = 2
Rear = 4
Queue:
[ _ , _ , 30 , 40 , 50 ]
Here, the queue is treated as full, but index 0 and 1 are still empty.

----------------------------------------------------------
Two dimensional array 
----------------------------------------------------------

A two-dimensional array represents data in row and column form, but internally it is stored sequentially in memory, so it is not a true matrix.

Example: WAP to create 3  matrix of 3 x 3 

import java.util.*;
public class TDAPP
{   
    public static void main(String x[])
	{   
        int a[][][] = new int[3][3][3];

	    Scanner xyz  = new Scanner(System.in);
		System.out.println("Enter values in matrices");

		for(int i=0; i<a.length; i++) //matrix number
		{
			for(int j=0; j<a[i].length; j++) //row number
			{
				for(int k=0; k<a[i][j].length; k++) //columns 3
				{
					a[i][j][k] = xyz.nextInt();
				}
			}
		}

		System.out.println("display matrices");
		for(int i=0; i<a.length; i++)

		{  
            System.out.println("Matrix Number "+(i+1));
			for(int j=0; j<a[i].length; j++)
		    {   
				for(int k=0; k<a[i][j].length; k++)
				{ 
                     System.out.print(a[i][j][k] + "\t"); //column 
				}
				System.out.println(); // next row
			}
			System.out.println(); // next matrix
		}
	}
}

Output Format Example
Matrix Number 1
1   2   3
4   5   6
7   8   9

example : sum of col
import java.util.*;

public class TDAPP
{
    public static void main(String[] args)
    {
        Scanner xyz = new Scanner(System.in);

        int a[][] = new int[3][3];
        int cols[] = new int[3];

        // INPUT
        System.out.println("Enter values in matrix:");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                a[i][j] = xyz.nextInt();
            }
        }

        // DISPLAY MATRIX
        System.out.println("\nMatrix:");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // SUM OF COLUMNS
        for(int j = 0; j < 3; j++)   // column
        {
            int sum = 0;
            for(int i = 0; i < 3; i++) // row
            {
                sum = sum + a[i][j];
            }
            cols[j] = sum;
        }

        // DISPLAY COLUMN SUM
        System.out.println("\nSum of Columns:");
        for(int j = 0; j < cols.length; j++)
        {
            System.out.print(cols[j] + " ");
        }
    }
}

Output
Matrix:
1   2   3
4   5   6
7   8   9
Sum of Columns:
12 15 18

Example:  WAP to create a 3 x 3 matrix and sort its column using ascending order.

import java.util.*;
public class SCMAPP
{
   public static void main(String x[])
   {
      int a[][] = new int[3][3]; //1️⃣ Matrix Declaration
      
	  Scanner xyz = new Scanner(System.in); //2️⃣ Input 
	  System.out.println("Enter values in matrix");
	  for(int i=0; i<a.length; i++)
	  {
	    for(int j=0; j<a[i].length; j++)
		{
		    a[i][j]=xyz.nextInt();
		}
	  }
      
	  System.out.println("Original matrix is ");
	  for(int i=0; i<a.length; i++)
	  {
	      for(int j=0; j<a[i].length; j++)
		  {
		    System.out.printf("%d\t",a[i][j]);
		  }
		  System.out.printf("\n");  
	  }

	  //apply sorting logics 
	  for(int i = 0; i<a.length; i++)
	  {  
        int cols[] = new int[3];
	      for(int j=0, k=0; j<a[i].length; j++ , k++)
		  { 
		    cols[k]=a[j][i];
		  }
		  Arrays.sort(cols);
	      for(int m=0; m<a.length; m++)
          {
			a[m][i] = cols[m];
          }		  
	  }

	  System.out.println("Sorted matrix is ");
	  for(int i=0; i<a.length; i++)
	  {
	      for(int j=0; j<a[i].length; j++)
		  {
		     System.out.printf("%d\t",a[i][j]);
		  }
		  System.out.printf("\n");
	  }
   }
}
<!-- 
Input Matrix (Given by User)
9  3  5
6  1  8
4  7  2

This matrix is stored as:

a[0][0]=9   a[0][1]=3   a[0][2]=5
a[1][0]=6   a[1][1]=1   a[1][2]=8
a[2][0]=4   a[2][1]=7   a[2][2]=2

DRY RUN – COLUMN SORTING LOGIC
🔁 Outer Loop
for(int i = 0; i < a.length; i++)

i represents column number

▶ i = 0 (Column 0)
Step 1: Copy column into array cols[]
cols[0] = a[0][0] = 9
cols[1] = a[1][0] = 6
cols[2] = a[2][0] = 4

cols = {9, 6, 4}

Step 2: Sort column
Arrays.sort(cols);

cols = {4, 6, 9}

Step 3: Copy back to matrix
a[0][0] = 4
a[1][0] = 6
a[2][0] = 9

Matrix now:

4  3  5
6  1  8
9  7  2

▶ i = 1 (Column 1)
Copy column
cols = {3, 1, 7}

Sort
cols = {1, 3, 7}

Copy back
a[0][1] = 1
a[1][1] = 3
a[2][1] = 7

Matrix now:

4  1  5
6  3  8
9  7  2

▶ i = 2 (Column 2)
Copy column
cols = {5, 8, 2}

Sort
cols = {2, 5, 8}

Copy back
a[0][2] = 2
a[1][2] = 5
a[2][2] = 8

FINAL SORTED MATRIX
4  1  2
6  3  5
9  7  8
-->


Example: WAP create two matrix of 3 x 3 and calculate its addition and store in 3 matrix

import java.util.*;
public class MAAPP
{
    public static void main(String[] args)
    {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        // Input first matrix
        System.out.println("Enter values in first matrix:");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter values in second matrix:");
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        // Addition of matrices
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        // Display first matrix
        System.out.println("\nFirst Matrix:");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        // Display second matrix
        System.out.println("\nSecond Matrix:");
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        // Display resultant matrix
        System.out.println("\nResultant Matrix (Addition):");
        for(int i = 0; i < c.length; i++)
        {
            for(int j = 0; j < c[i].length; j++)
            {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

<!-- First Matrix:
1 2 3
4 5 6
7 8 9

Second Matrix:
9 8 7
6 5 4
3 2 1

Resultant Matrix:
10 10 10
10 10 10
10 10 10 -->

Example: WAP to create 3 x 3 matrix and perform its multiplication 
__________________________________________________________
import java.util.*;
public class MAAPP
{
    public static void main(String x[])
    {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        // Input first matrix
        System.out.println("Enter values in first matrix");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter values in second matrix");
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                b[i][j] = sc.nextInt(); 
            }
        }

        // Matrix multiplication
        for(int i = 0; i < a.length; i++)  //row
        {
            for(int j = 0; j < a[i].length; j++) //number of columns in row i
            {
                int sum = 0;
                for(int k = 0; k < a.length; k++) //k → connects row of a with column of b
                {
                    sum = sum + a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }

        // Display first matrix
        System.out.println("Display first matrix");
        for(int i = 0; i < a.length; i++) 
        {
            for(int j = 0; j < a[i].length; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Display second matrix
        System.out.println("Display second matrix");
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // Display resultant matrix
        System.out.println("Display resultant matrix");
        for(int i = 0; i < c.length; i++)
        {
            for(int j = 0; j < c[i].length; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
------------------------------------------------------------------------
Jagged Array 
------------------------------------------------------------------------
A Jagged Array is an array of arrays where each row can have a different number of columns.
It is also called an irregular array.

Declaration of Jagged Array
int a[][] = new int[3][];

Here:
3 → number of rows
Columns are not fixed

Initialization
a[0] = new int[2];  // Row 0 has 2 columns
a[1] = new int[4];  // Row 1 has 4 columns
a[2] = new int[3];  // Row 2 has 3 columns

example wit source code

import java.util.*;
public class JARRAPP
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][];

        a[0] = new int[3];
        a[1] = new int[4];
        a[2] = new int[5];

        System.out.println("Dispaly the matrix");
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Display the matrix");

        for(int i=0; i<a.length; i++)
        {   
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}

<!-- 📌 Output
1 2 3
4 5 6 7
8 9 10 11 12 -->

------------------------------------------------------------------------
Sliding window concept 
------------------------------------------------------------------------
Sliding Window is a technique used to reduce the time complexity of algorithms that work on sequential data such as arrays, strings, and linked lists.

In this technique, we create a window (subarray or substring) of fixed size and slide it step by step over the data to find an optimal solution (maximum, minimum, sum, count, etc).

Key Exam Points

Avoids nested loops
Reuses previous window sum
Best optimization over brute force
Works for fixed-size subarray problems
------------------------------------------------------------------------
Example : suppose we have an array and we want to find the maximum sum sub array of size k.

solving problem using brute force approach
time complexity is O(n*k)

import java.util.*;
public class MSARRAPP
{
    public static void main(String x[])
    {
        int a[] = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 3;

        int max = Integer.MIN_VALUE;
        int start = 0, end = 0;

        // Brute force approach
        for(int i = 0; i <= a.length - k; i++)
        {
            int currentSum = 0;
            for(int j = i; j < i + k; j++)
            {
                currentSum = currentSum + a[j];
            }

            if(currentSum > max)
            {
                max = currentSum;
                start = i;
                end = i + k;
            }
        }

        // Print subarray
        System.out.print("Subarray: [ ");
        for(int i = start; i < end; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");

        System.out.println("Max sum of subarray = " + max);
    }
}

<!-- Subarray: [ 4 1 8 ]
Max sum of subarray = 13 -->

<!-- 🔹 Dry Run
Array: {1, 3, 2, 6, -1, 4, 1, 8, 2}
k = 3
| Subarray   | Sum    |
| ---------- | ------ |
| {1, 3, 2}  | 6      |
| {3, 2, 6}  | 11     |
| {2, 6, -1} | 7      |
| {6, -1, 4} | 9      |
| {-1, 4, 1} | 4      |
| {4, 1, 8}  | **13** |
| {1, 8, 2}  | 11     | -->

Note: if we think about above it required time complexity O(n*k) but we can manage the above code using time complexity  O(n) with the help of sliding window concept
------------------------------------------------------------------------
Example with source code

import java.util.*;
public class MSARRAPP
{  
    public static void main(String x[])
   {  
       Scanner xyz  = new Scanner(System.in);
       int a[]=new int[]{1,3,2,6,-1,4,1,8,2}; 

	   int k=3;
	   int sum=0;
	   int max;

	   for(int i=0; i<k; i++)
	   { 
          sum = sum + a[i];
	   }
	   max=sum;
	   for(int i=k; i<a.length; i++)
	   {
		    sum = sum + a[i]-a[i-k];
			if(sum>max)
			{ 
                max=sum;
			} 
	   }
	   System.out.printf("Sum of max sub array is  %d\n",max);
   }
}

<!-- Sum of max sub array is 13 -->
------------------------------------------------------------------------
Example: Average of all sub array of size K 

import java.util.*;
public class SAAPP
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[]{1,3,2,6,-1,4,1,8,2};
        int sum = 0;
        int k=3;

        //First window
        for(int i=0; i<k; i++)
        {
            sum = sum + a[i];
        }

        float avg = (float)sum/k;
        System.out.print(sum+"--->"+avg);

        //sliding window
        for(int i=k; i<a.length; i++)
        {
            sum = sum + a[i] - a[i-k];
            avg = (float)sum/k;
            System.out.print(sum+"--->"+avg);
        }
    }
}

output
6---> 2.0
11--->3.67
7--->2.33
9--->3.0
4--->1.33
13--->4.33
11--->3.67 
------------------------------------------------------------------------
Smallest subarray length with sum >= target(variable window)

import java.util.*;
public class SAAPP
{
    public static void main(String x[])
    {
        int target = 7;
        int a[] = {2, 3, 1, 2, 4, 3};

        int sum = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;
        
        for(int end = 0; end < a.length; end++)
        {
            sum = sum + a[end];

            while(sum >= target)
            {
                int currLen = (end - start) + 1; //3-0+1=4

                if(currLen < minLen)
                {
                    minLen = currLen;
                }
                sum -= a[start];
                start++;
            }
        }
        int result = (minLen == Integer.MAX_VALUE) ? 0 : minLen;
        System.out.println(result);
    }
}
<!-- 2 -->

<!-- 
| end | a[end] | sum (after add) | start | while(sum>=7)  | currLen | minLen | sum(after remove) |
| --- | ------ | --------------- | ----- | -------------  | ------- | ------ | ----------------- |
| 0   | 2      | 2               | 0     | ❌             | –       | ∞      | –                 |
| 1   | 3      | 5               | 0     | ❌             | –       | ∞      | –                 |
| 2   | 1      | 6               | 0     | ❌             | –       | ∞      | –                 |
| 3   | 2      | 8               | 0     | ✅             | 4       | 4      | 6                 |
| 4   | 4      | 10              | 1     | ✅             | 4       | 4      | 7                 |
|     |        |                 | 2     | ✅             | 3       | 3      | 6                 |
| 5   | 3      | 9               | 3     | ✅             | 3       | 3      | 7                 |
|     |        |                 | 4     | ✅             | 2       | **2**  | 3                 |
 -->

------------------------------------------------------------------------

You want to print the subarray itself (not just the length) for
👉 Smallest subarray with sum ≥ target 👍

import java.util.*;

public class SmallestSubarray 
{
    public static void main(String[] args) 
    {
        int target = 7;
        int[] a = {2, 3, 1, 2, 4, 3};

        int sum = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        int bestStart = 0;
        int bestEnd = 0;

        for (int end = 0; end < a.length; end++) 
        {
            sum += a[end];

            // Try to shrink the window
            while (sum >= target) 
            {
                int currLen = (end - start) + 1; //3-0+1=4
                if (currLen < minLen) 
                {
                    minLen = currLen;
                    
                    bestStart = start;
                    bestEnd = end;
                }
                sum -= a[start];
                start++;
            }
        }

        // Print result
        if (minLen == Integer.MAX_VALUE) 
        {
            System.out.println("No subarray found");
        } 
        else 
        {
            System.out.print("Smallest subarray: ");
            for (int i = bestStart; i <= bestEnd; i++) 
            {
                System.out.print(a[i] + " ");
            }
            System.out.println("\nLength: " + minLen);
        }
    }
}

<!--
 Smallest subarray: 4 3
Length: 2 -->
