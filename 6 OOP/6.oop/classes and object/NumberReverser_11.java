/* 11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
 */

public class NumberReverser
{
	public int reverse(int n)
	{
		int rev = 0;
		while (n>0)
		{
			int d=n%10;
			rev = rev *10+d;
			n= n/10;
		}
		return rev;
	}
}
public class NumberReverser_11
{
	public static void main(String x[])
	{
		NumberReverser obj = new NumberReverser();


		System.out.println("Reverse : "+obj.reverse(12345));
	}

}
	
/* 
java NumberReverser_11.java
Reverse : 54321 */