# Binary Search in Java

## Code Links

1. [Q1. Copy one array to another array](#q1-copy-one-array-to-another-array)
2. [Q2. Search in a rotated sorted array using binary search](#q2-search-in-a-rotated-sorted-array-using-binary-search)
3. [Q3. Find floor square root using binary search](#q3-find-floor-square-root-using-binary-search)
4. [Q4. Search a key in a sorted array](#q4-search-a-key-in-a-sorted-array)
5. [Q5. Find insertion position in a sorted array](#q5-find-insertion-position-in-a-sorted-array)
6. [Q6. Count occurrences of a key in a sorted array](#q6-count-occurrences-of-a-key-in-a-sorted-array)

## Q1. Copy one array to another array

```java
import java.util.*;
public class Question9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int i;
		System.out.println("enter the values of array: ");
		for(i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Array1: ");
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		int b[] = new int[a.length];
		for(i=0; i<a.length; i++)
		{
			b[i]=a[i];
		}
		
		System.out.print("Array2: ");
		for(i=0; i<b.length; i++)
		{
			System.out.print(b[i]+" ");
		}
		
	}
}
```

## Q2. Search in a rotated sorted array using binary search

```java
import java.util.*;
public class Question2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int left=0, right=a.length-1, mid, index=-1;

		System.out.print("enter the values in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();//6, 7, 1, 2, 3, 4, 5
		}
		System.out.print("enter the element for search in array: ");
		int skey = sc.nextInt();//3
		
		 while(left<=right)//0<=6, 4<=6, 4<=3
		 { 
			mid=left+(right-left)/2;//3, 5
	        if(a[mid]==skey)//2=3-f, 4=3-f
			{  
				index=mid;
				break;
			}
			else if(a[mid]<skey)//2<3-t, 4<3-f
			{ 
				left=mid+1;//3+1=4
			}
			else
			{
				 right=mid-1;//4-1=3
			}
			
		 }
		 if(index!=-1)//4!=-1-t
		 { 
			System.out.println("Found at index "+index);
		 }
		 else
		 {
			  System.out.println("Not Found");
		 }

		
		
	}
}
```

## Q3. Find floor square root using binary search

```java
import java.util.*;
public class Question3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number to find its floor square root: ");
		int n = sc.nextInt();
		int left=0 , right=n, mid=0,res=0;
		
		while(left<=right)
		{
			mid=left+(right-left)/2;
			
			if(mid<=n/mid)
			{
				res = mid;
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
			
		}
		
		System.out.print("result: "+res);
	}
}
```

## Q4. Search a key in a sorted array

```java
import java.util.*;
public class Question6
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the values in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.print("enter the search key: ");
		int skey = sc.nextInt();
		
		int left=0, right=a.length-1;
		int index=-1;
		while(left<=right)
		{
		     	int mid = (left+right)/2;
				if(a[mid]==skey)
				{
					index=mid;
					break;
				}
				else if(a[mid]<skey)
				{
					left = mid + 1;
				}
				else
				{
					right = mid - 1;
				}
		}
		
		if(index!=-1)
		{
			System.out.print("Index = "+index);
		}
		else
		{
			System.out.print("key is not found");
		}
	}
}
```

## Q5. Find insertion position in a sorted array

```java
import java.util.*;
public class Question7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the values in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the element: ");
		int key = sc.nextInt();
		
		
		int left=0, right=a.length-1;
		int index=-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			
			if(key>a[mid])
			{
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
		}
		
		System.out.print("Insert Position = "+left);
	
	}

}
```

## Q6. Count occurrences of a key in a sorted array

```java
import java.util.*;
public class Question9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("enter the values in array: ");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the search key: ");
		int key = sc.nextInt();
		int count=0;
		int left=0, right=a.length-1, firstIndex=-1, lastIndex=-1;
	
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(a[mid]==key)
			{
				firstIndex = mid;
				right = mid - 1;
			}
			else if(a[mid]<key)
			{
				left = mid + 1;
			}
			else
			{
				right = mid - 1;
			}
		}
		
		left=0;
		right=a.length-1;
		while(left<=right)
		{
			int mid = (left+right)/2;
			if(a[mid]==key)
			{
				lastIndex = mid;
				left = mid + 1;
			}
			else if(a[mid]>key)
			{
				right = mid - 1;	
			}
			else
			{
				left = mid + 1;
			}
		}
		
		System.out.println("Count ="+(lastIndex - firstIndex + 1));
	}
}
```
