/* 13. Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion. */


class powerCalculator
{
	public int power(int base,int exp)
	{
		int result = 1;
		for(int i=1; i<=exp; i++)
		{
			result*= base;
			
		}
		return result;
	}
}
public class powerCalculator_13
{
	public static void main(String x[])
	{
		powerCalculator obj = new powerCalculator();
		
		System.out.println("power :"+obj.power(2,5));
	}
}
	

/* java powerCalculator_13.java
power :32 */