# Vector Programs in Java

## Code Links

1. [Q1. Add Integer Elements to Vector](#q1-add-integer-elements-to-vector)
2. [Q2. Find Number of Elements in Vector](#q2-find-number-of-elements-in-vector)
3. [Q3. Access and Print Each Element of Vector using Index](#q3-access-and-print-each-element-of-vector-using-index)
4. [Q4. Remove Specific Element from Vector](#q4-remove-specific-element-from-vector)
5. [Q5. Check if Vector is Empty](#q5-check-if-vector-is-empty)
6. [Q6. Search Given Element in Vector](#q6-search-given-element-in-vector)
7. [Q7. Remove All Elements from Vector](#q7-remove-all-elements-from-vector)
8. [Q8. Calculate Sum of All Elements in Vector](#q8-calculate-sum-of-all-elements-in-vector)
9. [Q9. Copy Elements from One Vector to Another](#q9-copy-elements-from-one-vector-to-another)



## Q1. Add Integer Elements to Vector

**Problem Statement:**

Write a Java program to add integer elements to a `Vector` and display all elements.

*Example Input:* `10 20 30 40 50`

*Example Output:* `Vector elements: [10, 20, 30, 40, 50]`

```java
import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter elements: ");
		for(int i=0; i<5; i++)
		{
			v.add(sc.nextInt());
		}
		
		
		System.out.print("Vector Element: "+v);
		
	}
}
```

## Q2. Find Number of Elements in Vector

**Problem Statement:**

Write a Java program to find the number of elements (size) in a `Vector`.

*Example Input:* `5 25 15 35`

*Example Output:* `Size of Vector: 4`

```java
import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter the elements: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		System.out.print("Size of Vector: "+v.size());
	}
}
```

## Q3. Access and Print Each Element of Vector using Index

**Problem Statement:**

Write a Java program to access and print each element of a `Vector` using its index.

*Example Input:* `100 200 300 400`

*Example Output:* `100 200 300 400`

```java
import java.util.*;
public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter element: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		for(int i = 0; i < v.size(); i++)
		{
			System.out.print(v.get(i) + " ");
		}
	}
}
```

## Q4. Remove Specific Element from Vector

**Problem Statement:**

Write a Java program to remove a specific element from a `Vector` by index.

*Example Input:* `Elements = 10 20 30 40 | Remove index = 1`

*Example Output:* `Vector after removal: [10, 30, 40]`

```java
import java.util.*;
public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter element: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		System.out.print("enter index: ");
		int index = sc.nextInt();

		v.remove(index);
		
		System.out.print("Vector after removal: "+v);
	}
}
```

## Q5. Check if Vector is Empty

**Problem Statement:**

Write a Java program to check whether a `Vector` is empty using `isEmpty()`.

*Example Input:* `No Values`

*Example Output:* `Vector is empty`

```java
import java.util.*;
public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		
		if(v.isEmpty())
		{
			System.out.print("Vector is empty");
		}
		else
		{
			System.out.print("Vector is not empty");
		}
			
	}
}
```

## Q6. Search Given Element in Vector

**Problem Statement:**

Write a Java program to search for a given element in a `Vector` using `contains()`.

*Example Input:* `Elements = 5 10 15 20 | Search = 10`

*Example Output:* `Element found`

```java
import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter element: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		if(v.contains(10))
		{
			System.out.print("Element found");
		}
		else
		{
			System.out.print("Element not found");
		}
	}
}
```

## Q7. Remove All Elements from Vector

**Problem Statement:**

Write a Java program to remove all elements from a `Vector` using `clear()`.

*Example Input:* `10 20 30 40`

*Example Output:* `Vector after clear: []`

```java
import java.util.*;
public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter elements: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		v.clear();
		
		System.out.print("Vector after clear: "+v);
	}
}
```

## Q8. Calculate Sum of All Elements in Vector

**Problem Statement:**

Write a Java program to store integer elements in a `Vector` and calculate the sum of all elements.

*Example Input:* `10 20 30 40`

*Example Output:* `Sum of Vector elements: 100`

```java
import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter elements: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		int sum=0;
		for(int i=0; i<v.size(); i++)
		{
			sum+=v.get(i);
		}
		
		System.out.print("Sum: "+sum);
	}
}
```

## Q9. Copy Elements from One Vector to Another

**Problem Statement:**  
Write a Java program to copy elements from one `Vector` to another using `clone()`.

*Example Input:* `Vector1 = 5 10 15 20`  
*Example Output:* `Vector2 = [5, 10, 15, 20]`

```java
import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		System.out.print("enter elements: ");
		for(int i=0; i<4; i++)
		{
			v.add(sc.nextInt());
		}
		
		System.out.println("Vector1: "+v);
		
		Vector<Integer> v2 = (Vector<Integer>) v.clone();
		
		System.out.println("Vector2: "+v2);
	}
}
```
