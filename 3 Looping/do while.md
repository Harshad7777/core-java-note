# Do-While Loop Programs

## Table of Contents

- [1. Write a java program to print all natural numbers from 1 to n. using do while loop](#1-write-a-java-program-to-print-all-natural-numbers-from-1-to-n-using-do-while-loop)
- [2. Write a java program to count the number of digits in a number](#2-write-a-java-program-to-count-the-number-of-digits-in-a-number)
- [3. Write a java program to calculate the sum of digits in a number](#3-write-a-java-program-to-calculate-the-sum-of-digits-in-a-number)
- [4. Write a java program to calculate the product of digits in a number](#4-write-a-java-program-to-calculate-the-product-of-digits-in-a-number)
- [5. Write a java program to enter a number and print its reverse](#5-write-a-java-program-to-enter-a-number-and-print-its-reverse)
- [6. Write a java program to check whether a number is palindrome or not](#6-write-a-java-program-to-check-whether-a-number-is-palindrome-or-not)
- [7. Write a java program to print all ASCII characters with their values](#7-write-a-java-program-to-print-all-ascii-characters-with-their-values)
- [8. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop](#8-write-a-java-program-to-print-all-natural-numbers-in-reverse-from-n-to-1-using-a-while-loop)
- [9. Write a java program to print all alphabets from a to z. - using while loop](#9-write-a-java-program-to-print-all-alphabets-from-a-to-z-using-while-loop)
- [10. Write a java program to print all even numbers between 1 to 100.- using while loop](#10-write-a-java-program-to-print-all-even-numbers-between-1-to-100-using-while-loop)
- [11. Write a java program to print all odd numbers between 1 to 100](#11-write-a-java-program-to-print-all-odd-numbers-between-1-to-100)
- [12. Write a java program to find the sum of all natural numbers between 1 to n](#12-write-a-java-program-to-find-the-sum-of-all-natural-numbers-between-1-to-n)
- [13. Write a java program to find the sum of all even numbers between 1 to n](#13-write-a-java-program-to-find-the-sum-of-all-even-numbers-between-1-to-n)
- [14. Write a java program to find the sum of all odd numbers between 1 to n](#14-write-a-java-program-to-find-the-sum-of-all-odd-numbers-between-1-to-n)
- [15. Write a java program to print a multiplication table of any number](#15-write-a-java-program-to-print-a-multiplication-table-of-any-number)

## 1. Write a java program to print all natural numbers from 1 to n. using do while loop

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number: ");
		int n = sc.nextInt();
		
		int i=1;
		do
		{
			System.out.print(" "+i);
			i++;
		}while(i<=n);
		
	}
}
```

## 2. Write a java program to count the number of digits in a number

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number: ");
		int n = sc.nextInt();//1456
		
		int count=0;
		do
		{
			count++;
			n=n/10;
	
		}while(n!=0);
		System.out.print(" "+count);
		
	}
}
```

## 3. Write a java program to calculate the sum of digits in a number

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int rem, sum=0;
		do
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}while(n!=0);
		System.out.println("sum is: "+sum);
		
	}
}
```

## 4. Write a java program to calculate the product of digits in a number

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int rem, product=1;
		do
		{
			rem=n%10;
			product=product*rem;
			n=n/10;
		}while(n!=0);
		System.out.println("Product is: "+product);
		
	}
}
```

## 5. Write a java program to enter a number and print its reverse

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		
		int rem, rev=0;
		do
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}while(n!=0);
		System.out.println("Reverse Number is: "+rev);
		
	}
}
```

## 6. Write a java program to check whether a number is palindrome or not

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int temp=n;
		int rem, rev=0;
		do
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}while(n!=0);
		
		if(temp==rev)
		System.out.println("Palindrome Number");
		else
		System.out.println("Not Palindrome Number");
	}
}
```

## 7. Write a java program to print all ASCII characters with their values

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question15
{
	public static void main(String x[])
	{
		char ch = '0';
		do
		{
			System.out.println(ch+"->"+(int)ch);
			ch++;
		}while(ch<=256);
		
	}
}
```

## 8. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number: ");
		int n = sc.nextInt();
		
		int i=n;
		do
		{
			System.out.print(" "+i);
			i--;
		}while(1<=i);
		
	}
}
```

## 9. Write a java program to print all alphabets from a to z. - using while loop

[Back to top](#do-while-loop-programs)

```java
public class Question3
{
	public static void main(String x[])
	{
		
		char ch='a';
		
		do
		{
			System.out.print(" "+ch);
			ch++;
		}while(ch<='z');
		
	}
}
```

## 10. Write a java program to print all even numbers between 1 to 100.- using while loop

[Back to top](#do-while-loop-programs)

```java
public class Question4
{
	public static void main(String x[])
	{
		int i = 1;
		
		int n = 100;
		do
		{
			if(i%2==0)
			System.out.print(" "+i);
			i++;
		}while(i<=n);
		
	}
}
```

## 11. Write a java program to print all odd numbers between 1 to 100

[Back to top](#do-while-loop-programs)

```java
public class Question5
{
	public static void main(String x[])
	{
		int i = 1;
		
		int n = 100;
		do
		{
			if(i%2!=0)
			System.out.print(" "+i);
			i++;
		}while(i<=n);
		
	}
}
```

## 12. Write a java program to find the sum of all natural numbers between 1 to n

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number: ");
		int n = sc.nextInt();
		
		int i=1, sum=0;
		do
		{
			sum+=i;
			i++;
		}while(i<=n);
		System.out.print("Sum is: "+sum);
		
	}
}
```

## 13. Write a java program to find the sum of all even numbers between 1 to n

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int i = 1, sum=0;
		
		do
		{
			if(i%2==0)
			sum+=i;
			i++;
		}while(i<=n);
		System.out.print("Sum is: "+sum);
	}
}
```

## 14. Write a java program to find the sum of all odd numbers between 1 to n

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int i = 1, sum=0;
		
		do
		{
			if(i%2!=0)
			sum+=i;
			i++;
		}while(i<=n);
		System.out.print("Sum is: "+sum);
	}
}
```

## 15. Write a java program to print a multiplication table of any number

[Back to top](#do-while-loop-programs)

```java
import java.util.*;
public class Question9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter your number: ");
		int n = sc.nextInt();
		
		int tab;
		int i=1;
		do
		{
			tab = n * i;
			System.out.println(n+"x"+i+"="+tab);
			i++;
		}while(i<=10);
		
	}
}
```
