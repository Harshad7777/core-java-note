# Classes and Array Object Assignment

## Code Links

1. [Q1. Create a Class and Print a Message](#create-a-class-and-print-a-message)
2. [Q2. Find the Area of a Circle](#find-the-area-of-a-circle)
3. [Q3. Reverse a Number](#reverse-a-number)
4. [Q4. Find Factorial of a Number](#find-factorial-of-a-number)
5. [Q5. Find Power of a Number](#find-power-of-a-number)
6. [Q6. Check for Prime Numbers](#check-for-prime-numbers)
7. [Q7. Swap Two Numbers](#swap-two-numbers)
8. [Q8. Generate Multiplication Table](#generate-multiplication-table)
9. [Q9. Calculate Sum of Digits](#calculate-sum-of-digits)
10. [Q10. Check Leap Year](#check-leap-year)
11. [Q11. Find GCD of Two Numbers](#find-gcd-of-two-numbers)
12. [Q12. Implement a Calculator](#implement-a-calculator)
13. [Q13. Calculate Sum of 1 to Nth Natural Numbers](#calculate-sum-of-1-to-nth-natural-numbers)
14. [Q14. Find the Maximum Value in an Array](#find-the-maximum-value-in-an-array)
15. [Q15. Calculate the Average of an Array](#calculate-the-average-of-an-array)
16. [Q16. Count Even and Odd Numbers in an Array](#count-even-and-odd-numbers-in-an-array)
17. [Q17. Reverse an Array](#reverse-an-array)
18. [Q18. Find Duplicates in an Array](#find-duplicates-in-an-array)
19. [Q19. Sort an Array (Bubble Sort)](#sort-an-array-bubble-sort)
20. [Q20. Find the Second Largest Element in an Array](#find-the-second-largest-element-in-an-array)
21. [Q21. Shift Array Elements to the Left](#shift-array-elements-to-the-left)
22. [Q22. Check if an Array is Sorted](#check-if-an-array-is-sorted)
23. [Q23. Compare Two Numbers](#compare-two-numbers)
24. [Q24. Merge Two Integer Arrays](#merge-two-integer-arrays)
25. [Q25. Check Even or Odd](#check-even-or-odd)
26. [Q26. Calculate Simple Interest](#calculate-simple-interest)
27. [Q27. Find the Maximum of Three Numbers](#find-the-maximum-of-three-numbers)
28. [Q28. Implement Voting Eligibility](#implement-voting-eligibility)
29. [Q29. Find Square of a Number](#find-square-of-a-number)
30. [Q30. Convert Celsius to Fahrenheit](#convert-celsius-to-fahrenheit)


## Q1. Create a Class and Print a Message

```java
class HelloWorld
{
	public void printMessage()
	{
		System.out.print("Hello, World!");
	}
}

public class Q1
{
	public static void main(String x[])
	{
		HelloWorld h = new HelloWorld();
		h.printMessage();
	}
}
```

## Q2. Find the Area of a Circle

```java
import java.util.*;
class CircleArea
{
	public void findArea(int rad)
	{
		double area = 3.14*rad*rad;
		System.out.print("Area: "+area);
	}
}

public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the radius: ");
		int rad = sc.nextInt();
		
		CircleArea a = new CircleArea();
		a.findArea(rad);		
	}
}
```

## Q3. Reverse a Number

```java
import java.util.*;
class NumberReverser
{
	public int reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem=n%10; 
			rev = rev*10+rem;
			n=n/10;
		}	
		return rev;
	}
}

public class Q11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		NumberReverser r = new NumberReverser();
		int res = r.reverse(n);
		System.out.print("Reverse Number: "+res);
	}
}
```

## Q4. Find Factorial of a Number

```java
import java.util.*;
class FactorialCalculator
{
	public int findFactorial(int n)
	{
		int fact=1;
		for(int i=1; i<=n; i++)
		{	
			fact = fact*i;
		}
		return fact;
	}
}

public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		FactorialCalculator f = new FactorialCalculator();
		int res =f.findFactorial(n);
		System.out.print("Factorial Number: "+res);
	}
}
```

## Q5. Find Power of a Number

```java
import java.util.*;
class PowerCalculator
{
	public int power(int n, int p)
	{
		int power=1;
		for(int i=1; i<=p; i++)
		{
			power = power*n;
		}
		return power;
		
	}
}

public class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		System.out.print("enter the power: ");
		int p = sc.nextInt();
		
		PowerCalculator pow = new PowerCalculator();
		int res = pow.power(n,p);
		System.out.print("Power of Number: "+res);
	}
}
```

## Q6. Check for Prime Numbers

```java
import java.util.*;
class PrimeChecker
{
	public void isPrime(int n)
	{
		int count=0;
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.print("Prime Number");
		else
			System.out.print("Not Prime Number");
	}
}

public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		PrimeChecker p = new PrimeChecker();
		p.isPrime(n);
	}
}
```

## Q7. Swap Two Numbers

```java
import java.util.*;
class Swapper
{
	public void swap(int a, int b)
	{
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap: "+a+","+b);
	}
}

public class Q15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int a = sc.nextInt();
		System.out.print("enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Before Swap: "+a+","+b);
		Swapper s = new Swapper();
		s.swap(a,b);
	}
}
```

## Q8. Generate Multiplication Table

```java
import java.util.*;
class MultiplicationTable
{
	public void printTable(int n)
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}
}

public class Q16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		MultiplicationTable m = new MultiplicationTable();
		m.printTable(n);
	}
}
```

## Q9. Calculate Sum of Digits

```java
import java.util.*;
class DigitSumCalculator
{
	public int calculateSum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			sum+=rem;
			n = n/10;
		}
		return sum;
	}
}

public class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		DigitSumCalculator d = new DigitSumCalculator();
		int res = d.calculateSum(n);
		System.out.print("Sum of Digits: "+res);
	}
}
```

## Q10. Check Leap Year

```java
import java.util.*;
class LeapYearChecker
{
	public void isLeapYear(int year)
	{
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.print("Leap Year");
		else
			System.out.print("Not Leap Year");
	}
}

public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the year: ");
		int year = sc.nextInt();
		
		LeapYearChecker l = new LeapYearChecker();
		l.isLeapYear(year);
	}
}
```

## Q11. Find GCD of Two Numbers

```java
import java.util.*;
class GCDCalculator
{
	public void findGCD(int a, int b)
	{
		while(b!=0)
		{
			int rem = a%b;
			a=b;
			b=rem;
		}
		System.out.println("GCD = "+a);
	}
}

public class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int a = sc.nextInt();
		System.out.print("enter the second number: ");
		int b = sc.nextInt();
		
		GCDCalculator gcd = new GCDCalculator();
		gcd.findGCD(a, b);
	}
}
```

## Q12. Implement a Calculator

```java
class Calculator
{
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("Addition: "+c);
	}
	
	public void subtract(int a, int b)
	{
		int c = a-b;
		System.out.println("Substraction: "+c);
	}
	
	public void multiply(int a, int b)
	{
		int c = a*b;
		System.out.println("Multiplication: "+c);
	}
	
	public void divide(int a, int b)
	{
		int c = a/b;
		System.out.println("Division: "+c);
	}
}

public class Q2
{
	public static void main(String x[])
	{
		Calculator c = new Calculator();
		c.add(1,5);
		c.subtract(5,4);
		c.multiply(4,8);
		c.divide(2,6);
	}
}
```

## Q13. Calculate Sum of 1 to Nth Natural Numbers

```java
import java.util.*;
class NaturalNumberSum
{
	public int calculateSum(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{	
			sum+=i;
		}
		return sum;
	}
}

public class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		NaturalNumberSum ns = new NaturalNumberSum();
		int res = ns.calculateSum(n);
		System.out.print("Sum: "+res);
	}
}
```

## Q14. Find the Maximum Value in an Array

```java
import java.util.*;
class MaximumElement
{
	public int show(int a[])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}

public class Q21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		MaximumElement m = new MaximumElement();
		System.out.print("enter the element in arr: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int res = m.show(a);
		System.out.print("Largest Element: "+res);
	}
}
```

## Q15. Calculate the Average of an Array

```java
import java.util.*;
class AverageArray
{
	public int show(int a[])
	{
		int sum = 0;
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i];
		}
		int avg = sum/a.length;
		return avg;
	}
}

public class Q22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		AverageArray avg = new AverageArray();
		
		int res = avg.show(a);
		System.out.print("Average of Array: "+res);
		
	}
}
```

## Q16. Count Even and Odd Numbers in an Array

```java
import java.util.*;
class EvenOddArray
{
	public void show(int a[])
	{
		int ec=0, oc=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				ec++;
			else
				oc++;
		}
		System.out.print("Even Count: "+ec+"\t"+"Odd Count: "+oc);
	}
}

public class Q23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.print("enter the elements in arr: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		EvenOddArray eo = new EvenOddArray();
		eo.show(a);
	}
}
```

## Q17. Reverse an Array

```java
import java.util.*;
class ReverseArray
{
	public void show(int a[])
	{
		int start=0, end=a.length-1;
		for(int i=0; i<a.length/2; i++)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		
		System.out.print("Reverse Array: ");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

public class Q24
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the elements in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		ReverseArray r = new ReverseArray();
		r.show(a);
	}
}
```

## Q18. Find Duplicates in an Array

```java
import java.util.*;
class DuplicatesArray
{
	public void show(int a[])
	{
		boolean visit[] = new boolean[a.length];
		for(int i=0; i<a.length; i++)
		{
			if(visit[i])
				continue;
			
			int count=1;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
					count++;
					visit[j]=true;
				}
			}
			
			if(count>1)
				System.out.print(a[i]+" ");
			
			visit[i] = true;
		}
	}
}

public class Q25
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[6];
		System.out.print("enter the elements in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		DuplicatesArray d = new DuplicatesArray();
		d.show(a);
	}
}
```

## Q19. Sort an Array (Bubble Sort)

```java
import java.util.*;
class ArraySort
{
	public void show(int a[])
	{
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=0; j<(a.length-1)-i; j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

public class Q26
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the elements in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		ArraySort s = new ArraySort();
		s.show(a);
	}
}
```

## Q20. Find the Second Largest Element in an Array

```java
import java.util.*;
class SecondLargest
{
	public int show(int a[])
	{
		int max=Integer.MIN_VALUE, smax=Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else
			{
				if(a[i]!=max && a[i]>smax)
				{
					smax=a[i];
				}
			}
		}
		return smax;
	}
}

public class Q27
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the element in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		SecondLargest sl = new SecondLargest();
		int res = sl.show(a);
		System.out.print("Second Largest: "+res);
	}
}
```

## Q21. Shift Array Elements to the Left

```java
import java.util.*;
class ShiftArray
{
	public void show(int a[], int index)
	{
		int c[] = new int[a.length];
		int k=0;
		for(int i=index; i<a.length; i++)
		{
			c[k++]=a[i];
		}
		
		for(int i=0; i<index; i++)
		{
			c[k++]=a[i];
		}
		
		System.out.print("Result Array: ");
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}

public class Q28
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the element in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("enter the element to shift: ");
		int index = sc.nextInt();
		ShiftArray sa = new ShiftArray();
		sa.show(a, index);
	}
}
```

## Q22. Check if an Array is Sorted

```java
import java.util.*;
class ArraySort
{
	public void show(int a[])
	{
		boolean flag = true;
		for(int i=0; i<a.length-1; i++)
		{
			if(a[i]>a[i+1])
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
			System.out.print("Array is sorted");
		else
			System.out.print("Array is not sorted");
	}
}

public class Q29
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.print("enter the elements in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		ArraySort as = new ArraySort();
		
		as.show(a);
		
	}
}
```

## Q23. Compare Two Numbers

```java
import java.util.*;
class NumberComparison
{
	public void compare(int a, int b)
	{
		if(a==b)
			System.out.print("Equal");
		else if(a>b)
			System.out.print("Greater");
		else
			System.out.print("Less");
	}
}

public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the first number: ");
		int a = sc.nextInt();
		System.out.print("enter the second number: ");
		int b = sc.nextInt();
		
		NumberComparison n = new NumberComparison();
		n.compare(a, b);
	}
}
```

## Q24. Merge Two Integer Arrays

```java
import java.util.*;
class MergeArray
{
	public void show(int a[], int b[], int c[])
	{
		int k=0;
		for(int i=0; i<a.length; i++)
		{
			c[k++]=a[i];
		}
		for(int i=0; i<b.length; i++)
		{	
			c[k++]=b[i];
		}
		for(int i=0; i<c.length; i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
}

public class Q30
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		int b[] = new int[3];
		int c[] = new int[a.length+b.length];
		System.out.print("enter the elements in arr1: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the elements in arr2: ");
		for(int i=0; i<b.length; i++)
		{
			b[i]=sc.nextInt();
		}
		
		MergeArray ma = new MergeArray();
		
		ma.show(a, b, c);
	}
}
```

## Q25. Check Even or Odd

```java
import java.util.*;
class NumberChecker
{
	public void isEven(int n)
	{
		String msg = (n%2==0)?"Even":"Odd";
		System.out.print(msg);
	}
}

public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		NumberChecker c = new NumberChecker();
		c.isEven(n);
	}
}
```

## Q26. Calculate Simple Interest

```java
class SimpleInterest
{
	public void calculate(int principal, int rate, int time)
	{
		int si = (principal*rate*time)/100;
		System.out.print("Simple Interest: "+si);
	}
}

public class Q5
{
	public static void main(String x[])
	{
		SimpleInterest si = new SimpleInterest();
		si.calculate(1000, 25, 1);
	}
}
```

## Q27. Find the Maximum of Three Numbers

```java
class MaxFinder
{
	public int findMax(int a, int b, int c)
	{
		if(a>b && a>c)
			return a;
		else if(b>a && b>c)
			return b;
		else
			return c;
	}
}

public class Q6
{
	public static void main(String x[])
	{
		MaxFinder m = new MaxFinder();
		int res = m.findMax(10,22,7);
		System.out.print("Largest Number: "+res);
	}
}
```

## Q28. Implement Voting Eligibility

```java
import java.util.*;
class Voter
{
	public void isEligible(int age)
	{
		String res = (age>=18)?"eligible to vote":"not eligible to vote";
		System.out.print(res);
	}
}

public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the age: ");
		int age = sc.nextInt();
		
		Voter v = new Voter();
		v.isEligible(age);
	}
}
```

## Q29. Find Square of a Number

```java
import java.util.*;
class SquareFinder
{
	public void square(int n)
	{
		int square = n*n;
		System.out.print("Square is "+square);
	}
}

public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		SquareFinder sq = new SquareFinder();
		sq.square(n);
	}
}
```

## Q30. Convert Celsius to Fahrenheit

```java
import java.util.*;
class TemperatureConverter
{
	public void convertToFahrenheit(double cel)
	{
		double fah = (cel * 1.8) + 32;
		System.out.print("Fahrenheit: "+fah);
	}
}

public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the temp in celsius: ");
		double cel = sc.nextInt();
		
		TemperatureConverter temp = new TemperatureConverter();
		temp.convertToFahrenheit(cel);
	}
}
```
