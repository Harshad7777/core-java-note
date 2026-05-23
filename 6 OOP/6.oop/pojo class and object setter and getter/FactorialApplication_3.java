/* Q3. WAP to create class name as Factorial with two functions 
   void setNum(): this function can accept number as parameter 
   void showFactorial(): this function is used for calculate factorial of number and  display it */
   
import java.util.*;

class Factorial
{
	private int num;
	
	public void setNum(int n)
	{
		num = n;
	}
	
	public void showFactorial()
	{
		int fact = 1;
		
		for(int i=1; i<=num; i++)
		{
			fact = fact*i;
			
		}
	 System.out.println("Factorial of " + num + " is: " + fact);	
	}
}

public class FactorialApplication_3
{
	public static void main(String x[])
	{
		Factorial f = new Factorial();
		
		f.setNum(5);
		f.showFactorial();
	}
}
/* 
java FactorialApplication_3.java
Factorial of 5 is: 120 */