/* 4. Check Even or Odd Create a class NumberChecker with a method isEven that checks if a number is even or odd. Explanation: Focuses on using modulus operator in logic.
 */
import java.util.*;

class NumberChecker
{
	public void isEven(int n)
	{
		if(n%2 == 0)
		{
			System.out.println(n+ " is even");
		}
		else
		{
			System.out.println(n+ " is odd");
		}
	}
}

public class NumberChecker_4
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		NumberChecker obj = new NumberChecker();
		obj.isEven(n);
	}
}
	
/* java NumberChecker_4.java
7 is odd */
	