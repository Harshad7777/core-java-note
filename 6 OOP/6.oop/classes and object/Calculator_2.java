/* 2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods. */

class Calculator
{
	//method for addition	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	//method for subtraction
	public int subtract(int a,int b)
	{
		return a-b;
	}
	//method for multiplication
	public int multiply(int a, int b)
	{
			return a*b;
	}
	public double divide(int a, int b){
		if(b==0)
		{
			System.out.println("Error : Cannot divide bby Zero!");
			return 0;
		}
		return (double)a/b;
	}
}

public class Calculator_2
{
	public static void main(String x[])
	{
		Calculator calc = new Calculator();
		
		int a = 20;
		int b = 10;
		
		System.out.println("Additon: "+calc.add(a,b));
		System.out.println("Subtration "+ calc.subtract(a,b));
		System.out.println("multiplication :"+calc.multiply(a,b));
		System.out.println("Division: "+ calc.divide(a,b));
	}
}

