/* 12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic. */


class FactorialCalculator
{
	public int findFactorial(int n)
	{
		int fact = 1;
		for(int i=1; i<=n; i++)
		{
			fact*=i;
		}
			return fact;
	}	
}
public class FactorialCalculator_12
{
	public static void main(String x[])
		{
			FactorialCalculator obj = new FactorialCalculator();
			
			System.out.println("Factorial:" +obj.findFactorial(5));
		}
}
/* 
java FactorialCalculator_12.java
Factorial:120 */