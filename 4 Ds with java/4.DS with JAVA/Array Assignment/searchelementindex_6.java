/* 
Q1. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
 */
 
import java.util.*;
public class searchelementindex6
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
		
		int index = -1;
		System.out.println("enter the skey");
		int skey = sc.nextInt();
		for(int i=0; i<size; i++)
		{
			if(a[i]==skey)
			{	
				index = i;
			}
		}
		if(index!=-1)
		{
			System.out.println("Element "+ a[index] + " found at inndex "+ index);
	
		}
		else
		{
			System.out.println("not matches");
			
		}
		
	}
}

/* 
import java.util.*;
public class searchelementindex6
{
   public static void main(String x[])
   {
      Scanner xyz  = new Scanner(System.in);
	  int a[]=new int[5];
	  int index=-1,skey,i;
	  System.out.println("Enter values in array");
	  for(i=0;i<a.length;i++)
	  {  a[i]=xyz.nextInt();
	  }
	  System.out.println("Enter search key");
	  skey=xyz.nextInt();
	  for(i=0;i<a.length;i++)
	  {
	     if(a[i]==skey)
		 {  index=i;
		 }
	  }
	  if(index!=-1)
	  { System.out.println("Value found");
	  }
	  else
	  { System.out.println("Value not found");
	  }
	  
   }
}
 */