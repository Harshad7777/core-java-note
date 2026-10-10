# ArrayList Programs in Java

## Code Links

1. [Q1. Add and Display Elements in ArrayList](#q1-add-and-display-elements-in-arraylist)
2. [Q2. Calculate Sum of All Elements in ArrayList](#q2-calculate-sum-of-all-elements-in-arraylist)
3. [Q3. Find Maximum Value in ArrayList](#q3-find-maximum-value-in-arraylist)
4. [Q4. Find Minimum Element in ArrayList](#q4-find-minimum-element-in-arraylist)
5. [Q5. Count Even and Odd Numbers in ArrayList](#q5-count-even-and-odd-numbers-in-arraylist)
6. [Q6. Check Number Existence in ArrayList](#q6-check-number-existence-in-arraylist)
7. [Q7. Remove All Even Numbers from ArrayList](#q7-remove-all-even-numbers-from-arraylist)
8. [Q8. Reverse ArrayList Without Inbuilt Method](#q8-reverse-arraylist-without-inbuilt-method)
9. [Q9. Copy All Elements to Another ArrayList](#q9-copy-all-elements-to-another-arraylist)
10. [Q10. Display Duplicate Numbers in ArrayList](#q10-display-duplicate-numbers-in-arraylist)
11. [Q11. Count Prime Numbers in ArrayList](#q11-count-prime-numbers-in-arraylist)
12. [Q12. Remove All Odd Numbers from ArrayList](#q12-remove-all-odd-numbers-from-arraylist)
13. [Q13. Insert Element at Specific Index in ArrayList](#q13-insert-element-at-specific-index-in-arraylist)
14. [Q14. Find Second Largest Number in ArrayList](#q14-find-second-largest-number-in-arraylist)
15. [Q15. Check Palindrome List in ArrayList](#q15-check-palindrome-list-in-arraylist)
16. [Q16. Find First Non-Repeating Element in ArrayList](#q16-find-first-non-repeating-element-in-arraylist)
17. [Q17. Majority Element in ArrayList (Appears > n/2 times)](#q17-majority-element-in-arraylist-appears--n2-times)
18. [Q18. Rotate ArrayList Left by K Positions](#q18-rotate-arraylist-left-by-k-positions)
19. [Q19. Check If ArrayList Reads Same Forward and Backward](#q19-check-if-arraylist-reads-same-forward-and-backward)
20. [Q20. Find Element Occurring Odd Number of Times](#q20-find-element-occurring-odd-number-of-times)


## Q1. Add and Display Elements in ArrayList

**Problem Statement:**  
Create an `ArrayList` of integers. Add 5 numbers and display all elements using a loop.

```java
import java.util.*;
public class Q1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		
		for (int i = 0; i < al.size(); i++) 
		{
            System.out.print(al.get(i) + " ");
        }
			
	}
}
```

## Q2. Calculate Sum of All Elements in ArrayList

**Problem Statement:**  
Create an `ArrayList` of integers and calculate the sum of all elements.

```java
import java.util.*;
public class Q2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int sum=0;
		for(int i=0; i<al.size(); i++)
		{
			sum = sum + al.get(i);
		}
		
		System.out.print("Sum: "+sum);
		
	}
}
```

## Q3. Find Maximum Value in ArrayList

**Problem Statement:**  
Write a Java program to find the maximum value from an integer `ArrayList`.

```java
import java.util.*;
public class Q3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int max=al.get(0);
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i) > max)
				max = al.get(i);
		}
		
		System.out.print("Max: "+max);
	}
}
```

## Q4. Find Minimum Element in ArrayList

**Problem Statement:**  
Create an `ArrayList` of integers and find the minimum element.

```java
import java.util.*;
public class Q4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int min = al.get(0);
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i) < min)
				min = al.get(i);
		}
		
		System.out.print("Min: "+min);
		
	}
}
```

## Q5. Count Even and Odd Numbers in ArrayList

**Problem Statement:**  
Store numbers in an `ArrayList` and count how many are even and how many are odd.

```java
import java.util.*;
public class Q5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int even=0,odd=0;
		
		for(int i=0; i<al.size(); i++)
		{	
			if(al.get(i)%2==0)
				even++;
			else
				odd++;
		}
		
		System.out.print("Even Count: "+even+"\t"+"Odd Count: "+odd);
	}
}
```

## Q6. Check Number Existence in ArrayList

**Problem Statement:**  
Write a Java program to check whether a given number exists in an `ArrayList`.

```java
import java.util.*;
public class Q6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		boolean flag = false;
		System.out.print("enter a number: ");
		int number = sc.nextInt();
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i)==number)
			{
				flag=true;
				break;
			}
		}
		
		if(flag)
			System.out.println("Number Found");
		else
			System.out.println("Number Not Found");
	}
}
```

## Q7. Remove All Even Numbers from ArrayList

**Problem Statement:**  
Write a Java program to remove all even numbers from an integer `ArrayList`.

```java
import java.util.*;
public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		
		for(int i=al.size()-1; i>=0; i--)
		{
			if(al.get(i)%2==0)
			{
				al.remove(i);
			}
		}
		
		System.out.println("New List: "+al);
	}
}
```

## Q8. Reverse ArrayList Without Inbuilt Method

**Problem Statement:**  
Write a Java program to reverse an integer `ArrayList` without using the inbuilt `Collections.reverse()` method.

```java
import java.util.*;
public class Q8
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int start=0, end=al.size()-1;
		while(start < end)
		{
			int temp = al.get(start);
			al.set(start, al.get(end));
			al.set(end,temp);
			start++;
			end--;
		}
		
		System.out.print("Reverse List: "+al);
	}
}
```

## Q9. Copy All Elements to Another ArrayList

**Problem Statement:**  
Write a Java program to copy all elements from one integer `ArrayList` to another.

```java
import java.util.*;
public class Q9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		
		for(int i=0; i<al.size(); i++)
		{
			al2.add(al.get(i));
		}
		
		System.out.print("New List: "+al2);
		
	}
}
```

## Q10. Display Duplicate Numbers in ArrayList

**Problem Statement:**  
Write a Java program to identify and display duplicate numbers in an integer `ArrayList`.

```java
import java.util.*;
public class Q10
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		System.out.print("Duplicate Number: ");
		boolean visit[] = new boolean[al.size()];
		for(int i=0; i<al.size(); i++)
		{
			if(visit[i])
				continue;
			
			int count=0;
			for(int j=0; j<al.size(); j++)
			{
				if(al.get(i).equals(al.get(j)))
				{
					count++;
					visit[j]=true;
				}
			}
			
			if(count>1)
				System.out.print(al.get(i)+" ");
		}
	}
}
```

## Q11. Count Prime Numbers in ArrayList

**Problem Statement:**  
Write a Java program to count how many prime numbers are present in an `ArrayList`.

```java
import java.util.*;
public class Q11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		
		System.out.print("Enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int primeCount=0;
		for(int i=0; i<al.size(); i++)
		{
			int count=0;
			for(int j=1; j<=al.get(i); j++)
			{
				if(al.get(i)%j==0)
					count++;
			}
			
			if(count==2)
				primeCount++;
		}
		
		System.out.print("Prime Count in List: "+primeCount);
	}
}
```

## Q12. Remove All Odd Numbers from ArrayList

**Problem Statement:**  
Write a Java program to remove all odd numbers from an `ArrayList`.

```java
import java.util.*;
public class Q12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i)%2!=0)
			{
				al.remove(i);
				i--;
			}
		}
		
		System.out.print("New List: "+al);
	}
}
```

## Q13. Insert Element at Specific Index in ArrayList

**Problem Statement:**  
Write a Java program to insert a number at a given index in an `ArrayList`.

```java
import java.util.*;
public class Q13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		System.out.println("Old List: "+al);
		System.out.print("enter index: ");
		int index = sc.nextInt();
		System.out.print("enter element: ");
		int element = sc.nextInt();
		
		al.add(index,element);
		
		System.out.print("New List: "+al);
	}
}
```

## Q14. Find Second Largest Number in ArrayList

**Problem Statement:**  
Write a Java program to find the second largest number in an `ArrayList`.

```java
import java.util.*;
public class Q14
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int fmax=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		
		for(int i=0; i<al.size(); i++)
		{
			if(al.get(i) > fmax)
			{
				smax=fmax;
				fmax=al.get(i);
			}
			else if(al.get(i) != fmax && al.get(i) > smax)
			{
				smax=al.get(i);
			}
		}
		
		System.out.print("Second Max: "+smax);
	}
}
```

## Q15. Check Palindrome List in ArrayList

**Problem Statement:**  
Write a Java program to check whether elements of an `ArrayList` form a palindrome.

```java
import java.util.*;
public class Q15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		boolean flag=true;
		int start=0, end = al.size()-1;
		for(int i=0; i<al.size()/2; i++)
		{
			if(al.get(start)!=al.get(end))
			{
				flag=false;
				break;
			}
			start++;
			end--;
		}
		
		if(flag)
			System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");
	}
}
```

## Q16. Find First Non-Repeating Element in ArrayList

**Problem Statement:**  
Given an `ArrayList` of integers, find the first element that occurs only once.

**Explanation:**  
For each element, count how many times it appears. The first element with count 1 is the answer.  
*Example Input:* `[4, 5, 1, 2, 0, 4]` ➔ *Output:* `5`

```java
import java.util.*;
public class Q16
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>(); 
		System.out.print("enter element: ");
		for(int i=0; i<6; i++)
		{
			al.add(sc.nextInt());
		}
		
		for(int i=0; i<al.size(); i++)
		{
			int count=0;
			for(int j=0; j<al.size(); j++)
			{
				if(al.get(i)==al.get(j))
					count++;
			}
			
			if(count==1)
			{
				System.out.print(al.get(i));
				break;
			}
		}
	}
}
```

## Q17. Majority Element in ArrayList (Appears > n/2 times)

**Problem Statement:**  
Find the element that appears more than `n/2` times in an `ArrayList`.

**Explanation:**  
Count frequency of each element. If `frequency > size/2` ➔ majority element.  
*Example Input:* `[2, 2, 1, 2, 3, 2, 2]` ➔ *Output:* `2`

```java
import java.util.*;
public class Q17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter number: ");
		for(int i=0; i<7; i++)
		{
			al.add(sc.nextInt());
		}
		
		
		int majorityCount=al.size()/2;
		int majorityElement=0;
		for(int i=0; i<al.size(); i++)
		{
			int count=0;
			for(int j=0; j<al.size(); j++)
			{
				if(al.get(i)==al.get(j))
					count++;
			}
			
			if(count > majorityCount)
			{
				majorityElement=al.get(i);
			}
		}
		
		System.out.print("Element: "+majorityElement);
	}
}
```

## Q18. Rotate ArrayList Left by K Positions

**Problem Statement:**  
Write a Java program to rotate the elements of an `ArrayList` left by `K` positions.

**Explanation:**  
Remove first element and add it at the end. Repeat `K` times.  
*Example Input:* `[1, 2, 3, 4, 5]`, `K = 2` ➔ *Output:* `[3, 4, 5, 1, 2]`

```java
import java.util.*;
public class Q18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter element: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		ArrayList<Integer> al2 = new ArrayList<>();
		System.out.print("enter rotate size(k): ");
		int k=sc.nextInt();
		
		for(int i=k; i<al.size(); i++)
		{
			al2.add(al.get(i));
		}
		
		for(int i=0; i<k; i++)
		{
			al2.add(al.get(i));
		}
		
		
		System.out.print("New List: "+al2);
	}
}
```

## Q19. Check If ArrayList Reads Same Forward and Backward

**Problem Statement:**  
Check whether the `ArrayList` reads the same forward and backward using start & end index pointers.  
*Example Input:* `[1, 2, 3, 2, 1]` ➔ *Output:* `Palindrome`

```java
import java.util.*;
public class Q19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("enter number: ");
		for(int i=0; i<5; i++)
		{
			al.add(sc.nextInt());
		}
		
		int start=0, end=al.size()-1;
		boolean flag=true;
		for(int i=0; i<al.size()/2; i++)
		{
			if(al.get(start)!=al.get(end))
			{
				flag=false;
				break;
			}
			start++;
			end--;
		}
		
		if(flag)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
```

## Q20. Find Element Occurring Odd Number of Times

**Problem Statement:**  
Given an `ArrayList` where every element occurs an even number of times except one, find that element.  
*Example Input:* `[2, 3, 5, 4, 5, 2, 4, 3, 5]` ➔ *Output:* `5`

```java
import java.util.*;
public class Q20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("enter element: ");
		for(int i=0; i<9; i++)
		{
			al.add(sc.nextInt());
		}
		
		int element=0;
		for(int i=0; i<al.size(); i++)
		{
			int count=0;
			for(int j=0; j<al.size(); j++)
			{
				if(al.get(i)==al.get(j))
					count++;
			}
			
			if(count%2!=0)
			{
				element=al.get(i);
			}
		}
		
		System.out.print("Element: "+element);
	}
}
```
