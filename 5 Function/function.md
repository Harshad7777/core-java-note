# Java Functions Practice

## Code Links

1. [Q1. Write a java program to print all natural numbers from 1 to n. using while loop](#q1-write-a-java-program-to-print-all-natural-numbers-from-1-to-n-using-while-loop)
2. [Q2. Write a java program to count the number of digits in a number.](#q2-write-a-java-program-to-count-the-number-of-digits-in-a-number)
3. [Q3. Write a java program to calculate the sum of digits in a number.](#q3-write-a-java-program-to-calculate-the-sum-of-digits-in-a-number)
4. [Q4. Write a java program to calculate the product of digits in a number.](#q4-write-a-java-program-to-calculate-the-product-of-digits-in-a-number)
5. [Q5. Write a java program to calculate the product of digits in a number.](#q5-write-a-java-program-to-calculate-the-product-of-digits-in-a-number)
6. [Q6. Write a java program to enter a number and print its reverse.](#q6-write-a-java-program-to-enter-a-number-and-print-its-reverse)
7. [Q7. Write a java program to check whether a number is palindrome or not.](#q7-write-a-java-program-to-check-whether-a-number-is-palindrome-or-not)
8. [Q8. Write a java program to print all ASCII characters with their values.](#q8-write-a-java-program-to-print-all-ascii-characters-with-their-values)
9. [Q9. Write a java program to find power of a number.](#q9-write-a-java-program-to-find-power-of-a-number)
10. [Q10. Write a java program to find all factors of a number.](#q10-write-a-java-program-to-find-all-factors-of-a-number)
11. [Q11. Write a java program to find the first and last digit of a number.](#q11-write-a-java-program-to-find-the-first-and-last-digit-of-a-number)
12. [Q12. Write a java program to find the sum of the first and last digit of a number.](#q12-write-a-java-program-to-find-the-sum-of-the-first-and-last-digit-of-a-number)
13. [Q13. Write a java program to swap first and last digits of a number.](#q13-write-a-java-program-to-swap-first-and-last-digits-of-a-number)
14. [Q14. Write a java program to check Number Is Prime Number or Not.](#q14-write-a-java-program-to-check-number-is-prime-number-or-not)
15. [Q15. Write a java program to Check Number Is Perfect Number or Not.](#q15-write-a-java-program-to-check-number-is-perfect-number-or-not)
16. [Q16. Write a java program to Check Number Is Duck Number or Not.](#q16-write-a-java-program-to-check-number-is-duck-number-or-not)
17. [Q17. Write a java program to Check Number Is Strong Number or Not.](#q17-write-a-java-program-to-check-number-is-strong-number-or-not)
18. [Q18. Write a java program to Check Number Is Armstrong Number or Not.](#q18-write-a-java-program-to-check-number-is-armstrong-number-or-not)
19. [Q19. Write a java program to Check Number Is Neon Number or Not.](#q19-write-a-java-program-to-check-number-is-neon-number-or-not)
20. [Q20. Write a java program to Check Number Is Spy Number or Not.](#q20-write-a-java-program-to-check-number-is-spy-number-or-not)
21. [Q21. Write a java program to display 1 to nth Prime Number.](#q21-write-a-java-program-to-display-1-to-nth-prime-number)
22. [Q22. Write a java program to print all alphabets from a to z. - using while loop](#q22-write-a-java-program-to-print-all-alphabets-from-a-to-z-using-while-loop)
23. [Q23. Write a java program to print all even numbers between 1 to 100.- using while loop](#q23-write-a-java-program-to-print-all-even-numbers-between-1-to-100-using-while-loop)
24. [Q24. Write a java program to print all odd numbers between 1 to 100.](#q24-write-a-java-program-to-print-all-odd-numbers-between-1-to-100)
25. [Q25. Write a java program to find the sum of all natural numbers between 1 to n.](#q25-write-a-java-program-to-find-the-sum-of-all-natural-numbers-between-1-to-n)
26. [Q26. Write a java program to find the sum of all odd numbers between 1 to n.](#q26-write-a-java-program-to-find-the-sum-of-all-odd-numbers-between-1-to-n)
27. [Q27. Write a java program to print a multiplication table of any number.](#q27-write-a-java-program-to-print-a-multiplication-table-of-any-number)

## Q1. Write a java program to print all natural numbers from 1 to n. using while loop

```java
import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the numbers: ");
		int n = sc.nextInt();
		natNum(n);	
	}
	
	public static void natNum(int n)
	{
		int i=0;
		while(i<n)
		{
			i++;
			System.out.print(i+" ");
		}
	
	}
}
```

## Q2. Write a java program to count the number of digits in a number.

```java
import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int c = getCount(n);	
		System.out.print(c);
	}
	
	public static int getCount(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
}
```

## Q3. Write a java program to calculate the sum of digits in a number.

```java
import java.util.*;
public class Q11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int sum = getSum(n);	
		System.out.print("Sum of Digit: "+sum);
	}
	
	public static int getSum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			sum+=rem;
			n=n/10;
		}
		return sum;
	}
}
```

## Q4. Write a java program to calculate the product of digits in a number.

```java
import java.util.*;
public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int pro = getProduct(n);	
		System.out.print("Product of Digit: "+pro);
	}
	
	public static int getProduct(int n)
	{
		int p=1;
		while(n!=0)
		{
			int rem = n%10;
			p*=rem;
			n=n/10;
		}
		return p;
	}
}
```

## Q5. Write a java program to calculate the product of digits in a number.

```java
import java.util.*;
public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int pro = getProduct(n);	
		System.out.print("Product of Digit: "+pro);
	}
	
	public static int getProduct(int n)
	{
		int p=1;
		while(n!=0)
		{
			int rem = n%10;
			p*=rem;
			n=n/10;
		}
		return p;
	}
}
```

## Q6. Write a java program to enter a number and print its reverse.

```java
import java.util.*;
public class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int rev = getReverse(n);	
		System.out.print("Reverse of Digit: "+rev);
	}
	
	public static int getReverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem = n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
}
```

## Q7. Write a java program to check whether a number is palindrome or not.

```java
import java.util.*;
public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int rev = getReverse(n);	
		if(rev==n)
		System.out.print("Palindrome");
		else
		System.out.print("Not Palindrome");
	}
	
	public static int getReverse(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		return sum;
	}
}
```

## Q8. Write a java program to print all ASCII characters with their values.

```java
public class Q15
{
	public static void main(String x[])
	{
		char ch='a';
		getAscii(ch);	
	}
	
	public static void getAscii(char ch)
	{
		for(int i=1; i<=255; i++)
		{
			System.out.println(i+"--->"+(char)i+" ");
		}

	}
}
```

## Q9. Write a java program to find power of a number.

```java
import java.util.*;
public class Q16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		System.out.print("enter the power: ");
		int p = sc.nextInt();
		int res = getPower(n,p);
		System.out.print("Power of Number: "+res);
	}
	
	public static int getPower(int n, int p)
	{
		int pow=1;
		for(int i=1; i<=p; i++)
		{
			pow = pow*n;
		}
		return pow;
		

	}
}
```

## Q10. Write a java program to find all factors of a number.

```java
import java.util.*;
public class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getFactor(n);
	}
	
	public static int getFactor(int n)
	{
		int i;
		for(i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
			}
		}
		return i;
	}
}
```

## Q11. Write a java program to find the first and last digit of a number.

```java
import java.util.*;
public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getFLD(n);
		
	}
	
	public static void getFLD(int n)
	{
		int last = n % 10;
		int first = n;
		while(first>=10) 
		{
			first = first / 10;
		}
			
		System.out.print("first: "+first+"\tLast: "+last);
		
	}
}
```

## Q12. Write a java program to find the sum of the first and last digit of a number.

```java
import java.util.*;
public class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getSFL(n);
	}
	
	public static void getSFL(int n)
	{
		int last = n%10;
		int first = n;
		while(first>=10)
		{
			first=first/10;
		}
		int sum = first+last;
		System.out.print("Sum: "+sum);
	}
}
```

## Q13. Write a java program to swap first and last digits of a number.

```java
import java.util.*;
public class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getFLSwap(n);
	}
	
	public static void getFLSwap(int n)
	{
		System.out.println("Before Swap: "+n);
		int temp=n;
		int last = n%10;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		int p=1;
		for(int i=1; i<count; i++)
		{
			p = p*10;
		}
		n=temp;
		int first=n/p;
		int mid = n%p;
		mid = mid/10;
		int ans = last*p+mid*10+first;
		System.out.println("After Swap: "+ans);
		
	}
}
```

## Q14. Write a java program to check Number Is Prime Number or Not.

```java
import java.util.*;
public class Q21
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckPrime(n);
	}
	
	public static void getCheckPrime(int n)
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
```

## Q15. Write a java program to Check Number Is Perfect Number or Not.

```java
import java.util.*;
public class Q22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckPerfect(n);
	}
	
	public static void getCheckPerfect(int n)
	{
		int sum=0;
		for(int i=1; i<=n/2; i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
			System.out.print("Perfect Number");
		else
			System.out.print("Not Perfect Number");
	}
}
```

## Q16. Write a java program to Check Number Is Duck Number or Not.

```java
import java.util.*;
public class Q23
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckDuck(n);
	}
	
	public static void getCheckDuck(int n)
	{
		boolean flag = false;
		while(n!=0)
		{
			int rem=n%10;
			if(rem==0)
			{
				flag=true;
				break;
			}
			n=n/10;
		}
		
		if(flag)
			System.out.print("Duck Number");
		else
			System.out.print("Not Duck Number");
	}
}
```

## Q17. Write a java program to Check Number Is Strong Number or Not.

```java
import java.util.*;
public class Q24
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckStrong(n);
	}
	
	public static void getCheckStrong(int n)
	{
		int temp=n;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			int f=1;
			for(int i=1; i<=rem; i++)
			{
				f = f*i;
			}
			sum+=f;
			n=n/10;
		}
		
		if(sum==temp)
			System.out.print("Strong Number");
		else
			System.out.print("Not Strong Number");
	}
}
```

## Q18. Write a java program to Check Number Is Armstrong Number or Not.

```java
import java.util.*;
public class Q25
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckArmstrong(n);
	}
	
	public static void getCheckArmstrong(int n)
	{
		int temp=n;
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		int sum=0;
		n=temp;
		while(n!=0)
		{
			int rem = n%10;
			int p=1;
			for(int i=1; i<=count; i++)
			{
				p = p*rem;
			}
			sum+=p;
			n=n/10;
		}
		if(sum==temp)
			System.out.print("Armstrong Number");
		else
			System.out.print("Not Armstrong Number");
	}
}
```

## Q19. Write a java program to Check Number Is Neon Number or Not.

```java
import java.util.*;
public class Q26
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckNeon(n);
	}
	
	public static void getCheckNeon(int n)
	{
		int sum=0;
		int sq = n*n;
		while(sq!=0)
		{
			int rem = sq%10;
			sum+=rem;
			sq=sq/10;
		}
		
		if(sum==n)
			System.out.print("Neon Number");
		else
			System.out.print("Not Neon Number");
	}
}
```

## Q20. Write a java program to Check Number Is Spy Number or Not.

```java
import java.util.*;
public class Q28
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckSpy(n);
	}
	
	public static void getCheckSpy(int n)
	{
		int product=1, sum=0;
		while(n!=0)
		{
			int rem = n%10;
			product=product*rem;
			sum=sum+rem;
			n=n/10;
		}
		
		if(product==sum)
			System.out.print("Spy Number");
		else
			System.out.print("Not Spy Number");
	}
}
```

## Q21. Write a java program to display 1 to nth Prime Number.

```java
import java.util.*;
public class Q29
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getCheckNthPrime(n);
	}
	
	public static void getCheckNthPrime(int n)
	{	
		for(int i=1; i<=n; i++)
		{
			int count=0;
			for(int j=1; j<=i; j++)
			{
				if(i%j==0)
				 count++;
			}
			if(count==2)
			System.out.print(i+" ");
		}
		
	}
}
```

## Q22. Write a java program to print all alphabets from a to z. - using while loop

```java
public class Q3
{
	public static void main(String x[])
	{
		char ch='a';
		getAlpha(ch);	
	}
	
	public static void getAlpha(char ch)
	{
		for(int i='a'; i<='z'; i++)
		{
			System.out.print((char)i+" ");
		}

	}
}
```

## Q23. Write a java program to print all even numbers between 1 to 100.- using while loop

```java
public class Q4
{
	public static void main(String x[])
	{
		getEven();	
	}
	
	public static void getEven()
	{
		for(int i=1; i<=100; i++)
		{
			if(i%2==0)
			System.out.print(i+" ");
		}

	}
}
```

## Q24. Write a java program to print all odd numbers between 1 to 100.

```java
public class Q5
{
	public static void main(String x[])
	{
		getEven();	
	}
	
	public static void getEven()
	{
		for(int i=1; i<=100; i++)
		{
			if(i%2!=0)
			System.out.print(i+" ");
		}

	}
}
```

## Q25. Write a java program to find the sum of all natural numbers between 1 to n.

```java
import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int res = getSum(n);	
		System.out.print("Sum is: "+res);
	}
	
	public static int getSum(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			sum+=i;
		}
		return sum;
	}
}
```

## Q26. Write a java program to find the sum of all odd numbers between 1 to n.

```java
import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		int res = getSum(n);	
		System.out.print("Sum is: "+res);
	}
	
	public static int getSum(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			if(i%2!=0)
			sum+=i;
		}
		return sum;
	}
}
```

## Q27. Write a java program to print a multiplication table of any number.

```java
import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number: ");
		int n = sc.nextInt();
		getTable(n);	
	
	}
	
	public static int getTable(int n)
	{
		int tab=1;
		for(int i=1; i<=10; i++)
		{
			tab = i*n;
			System.out.println(i+" x "+n+" = "+tab);
		}
		return tab;
		
	}
}
```
