# Function Overloading in Java

## Code Links

1. [Q1. Create a class Adder that contains overloaded methods named sum() to calculate:](#q1-create-a-class-adder-that-contains-overloaded-methods-named-sum-to-calculate)
2. [Q2. Write a Java program to create a class AreaCalculator that uses function overloading to calculate the area of:](#q2-write-a-java-program-to-create-a-class-areacalculator-that-uses-function-overloading-to-calculate-the-area-of)
3. [Q3. Create an overloaded function analyze() —](#q3-create-an-overloaded-function-analyze)
4. [Q4. Write an overloaded function compare() —](#q4-write-an-overloaded-function-compare)
5. [Q5. Overload operation() —](#q5-overload-operation)
6. [Q6. Overload cleanMerge() —](#q6-overload-cleanmerge)
7. [Q7. Overload a function pairSum() —](#q7-overload-a-function-pairsum)
8. [Q8. Write a Java program with class DistanceCalculator that contains overloaded distance() methods to calculate:](#q8-write-a-java-program-with-class-distancecalculator-that-contains-overloaded-distance-methods-to-calculate)
9. [Q9. Write a program with a class MaxFinder having overloaded max() methods that return the largest value among:](#q9-write-a-program-with-a-class-maxfinder-having-overloaded-max-methods-that-return-the-largest-value-among)
10. [Q10. Write a Java class VolumeCalculator with overloaded methods named volume() to calculate:](#q10-write-a-java-class-volumecalculator-with-overloaded-methods-named-volume-to-calculate)

## Q1. Create a class Adder that contains overloaded methods named sum() to calculate:

```java
import java.util.*;
public class Adder
{
	static void sum(int a, int b)
	{
		int sum = a+b;
		System.out.println("Two Integer Sum: "+sum);
	}
	
	static void sum(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("Three IntegerSum: "+sum);
	}
	
	static void sum(double a, double b)
	{
		double sum = a + b;
		System.out.println("Two Double Sum: "+sum);
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int a = sc.nextInt();
		System.out.print("enter the second number: ");
		int b = sc.nextInt();
		System.out.print("enter the third number: ");
		int c = sc.nextInt();
		
		sum(a, b);
		sum(a, b, c);
		sum((double)a, (double)b);
	}
}
```

## Q2. Write a Java program to create a class AreaCalculator that uses function overloading to calculate the area of:

```java
import java.util.*;
public class AreaCalculator
{
	static void area(int rad)
	{
		double circle = 3.14*rad*rad;
		System.out.println("Circle: "+circle);
	}
	
	static void area(int len, int bred)
	{
		int rectangle = len * bred;
		System.out.println("Rectangle: "+rectangle);
	}
	
	static void area(double base, double height)
	{
		double triangle = 0.5*base*height;
		System.out.println("Triangle: "+triangle);
	}
	public static void main(String x[])
	{
		area(5);
		area(4, 5);
		area(8d, 6d);
	}
}
```

## Q3. Create an overloaded function analyze() —

```java
import java.util.*;
public class ArrayCommon
{
	static void analyze(int a[])
	{
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;
			for(int j = 0; j < a.length; j++)
			{
				if(a[i]==a[j])
					count++;
			}
			
			if(count==1)
				System.out.print(a[i] + " ");
		}
	}
	
	static void analyze(int b[], int c[])
	{
		for(int i = 0; i < b.length; i++)
		{
			for(int j = 0; j < c.length; j++)
			{
				if(b[i]==c[j])
				{
					System.out.print(b[i]+" ");
					break;
				}
			}
			
		}
	}


	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array version 1: ");
		int size1 = sc.nextInt();
		int a[] = new int[size1];
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("enter the two size of array version 2: ");
		int size2 = sc.nextInt();
		int size3 = sc.nextInt();
		int b[] = new int[size2];
		int c[] = new int[size3];
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.print("enter the element arr 2: ");
		for(int i=0; i<c.length; i++)
		{
			c[i]=sc.nextInt();
		}
		
		analyze(a);
		analyze(b, c);
	}
}
```

## Q4. Write an overloaded function compare() —

```java
import java.util.*;
public class ArrayCompare
{
	static boolean compare(int a[])
	{
		boolean flag = false;
		int start=0, end=a.length-1;
		for(int i=0; i<a.length/2; i++)
		{
			if(a[start++]==a[end--])	
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		
		return flag;
	}
	
	
	static boolean compare(int b[], int c[])
	{
		boolean flag = false;
		if(b.length!=c.length)
			return false;
		
		for(int i=0; i<b.length; i++)
		{
				if(b[i]==c[i])
				{
					flag = true;
				}
				else
				{
					flag = false;
					break;
				}
		}
		
		return flag;
	} 

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array function 1: ");
		int size1 = sc.nextInt();
		int a[] = new int[size1];
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<size1; i++)
		{
			a[i]=sc.nextInt();
		}
		
		boolean res1 = compare(a);
		
		if(res1)
			System.out.print("Symmetric Array");
		else
			System.out.print("Asymmetric Array");
		
		System.out.println("\nenter the two size of array function 2: ");
		int size2 = sc.nextInt();
		int size3 = sc.nextInt();
		int b[] = new int[size2];
		int c[] = new int[size3];
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<size2; i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<size3; i++)
		{
			c[i]=sc.nextInt();
		}
		
		boolean res2 = compare(b, c);
		
		if(res2)
			System.out.print("Arrays are identical");
		else
			System.out.print("Arrays are not identical");
	}
}
```

## Q5. Overload operation() —

```java
import java.util.*;
public class ArrayDistinct
{
	static void operation(int a[])
	{
		boolean visit[] = new boolean[a.length];
		for(int i=0; i<a.length; i++)
		{
			if(visit[i])
				continue;
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				visit[j]=true;
			}
		System.out.print(a[i]+" ");
		}
	}
	

	static void operation(int b[], int c[])
	{
		
		//intersection logics
		System.out.print("Intersection: ");
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<c.length; j++)
			{
				if(b[i]==c[j])
				{
					System.out.print(b[i]+" ");
				}
			}
		}
		
		
		//union logic
		int d[] = new int[b.length + c.length];
		int k = 0;

		// copy both arrays
		for(int i=0; i<b.length; i++)
			d[k++] = b[i];
		for(int i=0; i<c.length; i++)
			d[k++] = c[i];

		System.out.print("\nUnion: ");
		boolean visit[] = new boolean[d.length];
		for(int i=0; i<d.length; i++)
		{
			if(visit[i])
				continue;
			
			for(int j=i+1; j<d.length; j++)
			{
				if(d[i]==d[j])
				{
					visit[j]=true;
				}
			}
			System.out.print(d[i]+" ");
		}
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array version 1: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the elements in arr: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the two size of array version 2: ");
		int size2 = sc.nextInt();
		int size3 = sc.nextInt();
		int b[] = new int[size2];
		int c[] = new int[size3];
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.print("enter the element arr 2: ");
		for(int i=0; i<c.length; i++)
		{
			c[i]=sc.nextInt();
		}
		
		
		operation(a);
		operation(b, c);
	}
}
```

## Q6. Overload cleanMerge() —

```java
import java.util.*;
public class ArrayDuplicate
{
	static void cleanMerge(int a[])
	{
		boolean visit[] = new boolean[a.length];
		for(int i=0; i<a.length; i++)
		{
			if(visit[i]==true)
				continue;
				
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					visit[j]=true;
				}
			}
			System.out.print(a[i]+" ");
		}
	}
	
	
	static void cleanMerge(int b[], int c[])
	{
		int d[] = new int[b.length+c.length];
		int k=0;
		for(int i=0; i<b.length; i++)
		{
			d[k++]=b[i];
		}
		for(int i=0; i<c.length; i++)
		{
			d[k++]=c[i];
		}
		
		boolean visit[] = new boolean[d.length];
		for(int i=0; i<d.length; i++)
		{
			if(visit[i]==true)
				continue;
				
			for(int j=i+1; j<d.length; j++)
			{
				if(d[i]==d[j])
				{
					visit[j]=true;
				}
			}
			System.out.print(d[i]+" ");
		}	
	}

	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array version 1: ");
		int size1 = sc.nextInt();
		int a[] = new int[size1];
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("enter the two size of array version 2: ");
		int size2 = sc.nextInt();
		int size3 = sc.nextInt();
		int b[] = new int[size2];
		int c[] = new int[size3];
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.print("enter the element arr 2: ");
		for(int i=0; i<c.length; i++)
		{
			c[i]=sc.nextInt();
		}
		
		cleanMerge(a);
		cleanMerge(b, c);
	}
}
```

## Q7. Overload a function pairSum() —

```java
import java.util.*;
public class ArraySum
{
	static void pairSum(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if((a[i]+a[j])%2==0)
				{
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
	}


	static void pairSum(int b[], int c[])
	{
		for(int i=0; i<b.length; i++)
		{
			for(int j=0; j<c.length; j++)
			{
				if((b[i]+c[j])%5==0)
				{
					System.out.println(b[i]+","+c[j]);
				}
			}
		}
	}
	
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array version 1: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the elements in arr: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the two size of array version 2: ");
		int size2 = sc.nextInt();
		int size3 = sc.nextInt();
		int b[] = new int[size2];
		int c[] = new int[size3];
		System.out.print("enter the element arr 1: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.print("enter the element arr 2: ");
		for(int i=0; i<c.length; i++)
		{
			c[i]=sc.nextInt();
		}
		
		
		pairSum(a);
		pairSum(b, c);
	}
}
```

## Q8. Write a Java program with class DistanceCalculator that contains overloaded distance() methods to calculate:

```java
import java.util.*;
public class DistanceCalculator
{
	static void distance(int speed, int time)
	{
		int distance = speed * time;
		System.out.print("Distance(integer type): "+distance+"\t");
	}
	
	static void distance(double velocity, int time, double accer)
	{
		double distance = velocity * time + 0.5 * accer * (time*time);
		System.out.print("Distance(double type): "+distance+"\t");
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the speed: ");
		int speed = sc.nextInt();
		System.out.print("enter the time: ");
		int time = sc.nextInt();
		
		System.out.print("enter the initial velocity: ");
		double velocity = sc.nextDouble();
		System.out.print("enter the acceleration: ");
		double accer = sc.nextDouble();
		
		distance(speed, time);
		distance((double)velocity, time, (double)accer);
	}
}
```

## Q9. Write a program with a class MaxFinder having overloaded max() methods that return the largest value among:

```java
import java.util.*;
public class MaxFinder
{
	static void max(int a, int b)
	{
		if(a>b)
			System.out.print(a+" is max");
		else if(b>a)
			System.out.print(b+" is max");
		else
			System.out.print("both are equal");
	}
	
	static void max(int a, int b, int c)
	{
		if(a>b && a>c)
			System.out.print(a+" is max");
		else if(b>a && b>c)
			System.out.print(b+" is max");
		else if(c>a && c>b)
			System.out.print(c+" is max");
		else
			System.out.print("both are equal");
	}
	
	static void max(double a, double b)
	{
		if(a>b)
			System.out.print(a+" is max");
		else if(b>a)
			System.out.print(b+" is max");
		else
			System.out.print("both are equal");
	}

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter first number: ");
		int a = sc.nextInt();
		System.out.print("enter second number: ");
		int b = sc.nextInt();
		System.out.print("enter third number: ");
		int c = sc.nextInt();
		
		max(a, b);
		max(a, b, c);
		max((double)a, (double)b);
	}
}
```

## Q10. Write a Java class VolumeCalculator with overloaded methods named volume() to calculate:

```java
import java.util.*;
public class VolumeCalculator
{
	static void volume(int side)
	{
		int cube = side*side*side;
		System.out.print("volume of a cube: "+cube+"\t");
	}
	
	static void volume(int length, int breadth, int height)
	{
		int cuboid = length * breadth * height;
		System.out.print("volume of a cuboid: "+cuboid+"\t");
	}
	
	static void volume(double radius, double cylHegh)
	{
		double cylinder = 3.14 * radius * radius * cylHegh;
		System.out.print("volume of a cylinder: "+cylinder+"\t");
	}
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the side: ");
		int side = sc.nextInt();
		
		System.out.print("enter the length: ");
		int length = sc.nextInt();
		System.out.print("enter the breadth: ");
		int breadth = sc.nextInt();
		System.out.print("enter the height: ");
		int height = sc.nextInt();
		
		System.out.print("enter the radius: ");
		double radius = sc.nextDouble();
		System.out.print("enter the height of cylinder: ");
		double cylHegh = sc.nextDouble();
		
		
		volume(side);
		volume(length, breadth, height);
		volume(radius, cylHegh);
	}
}
```
