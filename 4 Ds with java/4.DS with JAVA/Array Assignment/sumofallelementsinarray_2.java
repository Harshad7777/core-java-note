/* Q2. Write a Java program to calculate the sum of all elements in an array.

Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
 
Output:
 Sum of array elements = 30
 
Explanation:

Initialize a variable sum = 0.
Traverse the array and keep adding each element to sum.
After the loop ends, sum will hold the total of all array elements.
 */

 /* import java.util.*;
 
 public class sumofallelementsinarray2
 {
	 public static void main(String x[])
	 {
		 Scanner sc = new Scanner(System.in);
		 
		// take array size
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		//create an array for input size
		int arr[] = new int[size];
		
		// input array element
		System.out.println("enter "+size+" elements :");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//output sum
		
		int sum=0;
		System.out.println("Array elements are:"); 
		for(int i=0; i<size; i++)
		{
			sum += arr[i];
			System.out.print(" " + arr[i]);
		}

		System.out.println("\nsum of array " + sum);
	 }
 } */
 
 import java.util.*;
 public class sumofallelementsinarray2
 {
	 public static void main(String x[])
	 {
		 int a[];
		 int sum = 0;
		 a = new int[5];
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the values");
		 
		 for(int i=0; i<a.length; i++)
		 {
			 a[i]=sc.nextInt();
			 sum+=a[i];
		 }
		 System.out.print("sum ="+sum);
	 }
 }