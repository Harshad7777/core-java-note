# Java 8 (JDK 1.8) Lambda Expression Programs

## Code Links

1. [Q1. Print Array Elements using Lambda Expression](#q1-print-array-elements-using-lambda-expression)
2. [Q2. Calculate Sum of Array Elements using Lambda Expression](#q2-calculate-sum-of-array-elements-using-lambda-expression)
3. [Q3. Separate Even and Odd Numbers using Lambda Expression](#q3-separate-even-and-odd-numbers-using-lambda-expression)
4. [Q4. Find Maximum Element in Array using Lambda Expression](#q4-find-maximum-element-in-array-using-lambda-expression)


## Q1. Print Array Elements using Lambda Expression

**Problem Statement:**  
Write a Java program that stores integer values in an array and prints all elements using a Lambda Expression.

*Example Input:* `10 20 30 40 50`
*Example Output:*
```text
10 20 30 40 50
```
```java
import java.util.*;
interface P
{
    void show(int a[]);
}
public class Q1
{
	public static void main(String x[])
	{
		int a[] = {10,20,30,40,50};
		P p = (arr) -> {
			for(int i=0; i<a.length; i++)
			{
				System.out.print(a[i]+" ");
			}
		};
		p.show(a);
		
	}
}
```

## Q2. Calculate Sum of Array Elements using Lambda Expression

**Problem Statement:**  
Write a Java program to store integers in an array and calculate the sum of all elements using a Lambda Expression.

*Example Input:* `5 10 15 20`
*Example Output:*
```text
Sum : 50
```
```java
import java.util.*;
interface S
{
	int show(int a[]);
}

public class Q2
{
	public static void main(String x[])
	{
		int a[] = {5, 10, 15, 20};
		S s = (arr) ->
			{
				int sum=0;
				for(int i=0; i<a.length; i++)
				{
					sum += arr[i];
				}
				return sum;
		};
		int res = s.show(a);
		System.out.println("Sum :"+res);
		
	}
}
```

## Q3. Separate Even and Odd Numbers using Lambda Expression

**Problem Statement:**  
Write a Java program that stores integer values in an array and prints even and odd numbers using a Lambda Expression.

*Example Input:* `11 24 36 41 55 60`
*Example Output:*
```text
Even Number: 24 36 60
Odd Number: 11 41 55
```
```java
import java.util.*;
interface EO
{
	void show(int a[]);
}
public class Q3
{
	public static void main(String x[])
	{
		int a[] = {11, 24, 36, 41, 55, 60};
		EO e =(arr) ->
		{
			
				System.out.print("Even Number: ");
				for(int i=0; i<arr.length; i++)
				{
					if(a[i]%2==0)
					{
						System.out.print(a[i]+" ");
					}
				}
				System.out.print("\n");
				System.out.print("Odd Number: ");
				for(int i=0; i<arr.length; i++)
				{
					if(a[i]%2==1)
					{
						System.out.print(a[i]+" ");
					}
				}
		};
		e.show(a);
	}
}
```

## Q4. Find Maximum Element in Array using Lambda Expression

**Problem Statement:**  
Write a Java program that stores integer values in an array and finds the maximum element using a Lambda Expression.

*Example Input:* `12 45 23 67 34`
*Example Output:*
```text
Maximum Element = 67
```
```java
import java.util.*;
interface M
{
	int show(int a[]);
}
public class Q4
{
	public static void main(String x[])
	{
		int a[] = {12, 45, 23, 67, 34};
		M m = (int[] arr) -> 
			{
				int max=arr[0];
				for(int i=0; i<arr.length; i++)
				{
					if(a[i] > max)
						max=a[i];
				}
				return max;
		};
		
		System.out.print("Max Element: "+m.show(a));
	}
}
```
