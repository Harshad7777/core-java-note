/* Q3. Make a NumberCheck class with one field num, initialized by a constructor.
 Write a method checkEvenOdd() that prints whether the number is Even or Odd.
Concepts Used:
 ✔ Constructor
 ✔ Logical % (modulus) operator
Explanation:
 Use num % 2 == 0 to check even; else odd. */
 
 
import java.util.*;

 class NumberCheck
 {
	private int num;
	
	// Parameterized Constructor
	public NumberCheck(int num)
	{
		this.num = num;
	}
	
	   // Method to check result
	   public void checkEvenOdd()
	   {
			if(num%2==0)
			{
				System.out.println(num+" is even");
			}
			
			else
			{
				System.out.println(num+ " is odd");
			}
			
	   }
 }
 
public class evenoroddchack_3
 {
	public static void main(String x[])
	{
       	Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		NumberCheck obj = new NumberCheck(num);
		//call method
		obj.checkEvenOdd();
	}
 }
 /* 
 java ProductTest_2.java

----- Discount Eligibility -----
Laptop Bag - Price: 450.0
--> Not Eligible for Discount

Headphones - Price: 800.0
--> Eligible for Discount

Keyboard - Price: 520.0
--> Eligible for Discount */