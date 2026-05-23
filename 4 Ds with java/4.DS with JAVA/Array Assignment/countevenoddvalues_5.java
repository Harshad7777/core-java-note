/*
Q5. Write a Java program to count even & odd values from an array.
 Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
Initialize counters: evenCount = 0, oddCount = 0.


For each element in the array:


If divisible by 2 → increase evenCount.
Otherwise → increase oddCount.


Final counts are displayed. */
/* 
import java.util.*;
public class countevenoddvalues5
{
	 public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter "+size+" element");
		for(int i=0; i<size; i++)
		{
			a[i]=sc.nextInt();
		}
		
		int evencount = 0;
		System.out.println("Count of Even Values ");
		for(int i=0; i<size; i++)
		{
			if(a[i]%2==0)
			{
				evencount++;
			}
		}
		System.out.println(evencount);
		
		int oddcount = 0;
		System.out.println("Count of Even Values ");
		for(int i=0; i<size; i++)
		{
			if(a[i]%2==1)
			{
				oddcount++;
			}
		} 
		System.out.println(oddcount);
	}
}
 */
 
import java.util.*;
public class countevenoddvalues5
{
	public static void main(String x[])
	{
		int a[];
		int e_count=0 ,o_count=0;
		a = new int[7];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
				e_count++;
			else
				o_count++;
		}
		System.out.println("Count of Even Values = "+e_count);
		System.out.println("Count of odd Values = "+o_count);
	}
}