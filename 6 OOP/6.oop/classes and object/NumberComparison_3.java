/* 3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method. */


class NumberComparison
{
	public void compare(int a, int b)
	{
		if(a==b)
			System.out.println("Both numbers are equal");
		else if(a>b)
			System.out.println(a+" is greater than " +b);
		else
			System.out.println(a+" is less than "+b);
	}
}

public class NumberComparison_3
{
	public static void main(String x[])
	{
		NumberComparison obj = new NumberComparison();
		
		obj.compare(10,20);
	}
}
	
/* java NumberComparison_3.java
10 is less than 20 */