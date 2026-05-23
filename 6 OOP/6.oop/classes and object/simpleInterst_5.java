/* 5. Calculate Simple Interest Create a class SimpleInterest with a method calculate that computes simple interest given principal, rate, and time. Explanation: Demonstrates mathematical formula implementation. */

public class simpleInterst
{
	public double calculate(double p,double r, double t)
	{
		return(p*r*t)/100;
	}
}
	
public class simpleInterst_5
{
	public static void main (String[] args)
	{
		simpleInterst obj = new simpleInterst();
		
		System.out.println("simple intrest :" +obj.calculate(1000, 5 ,2));
	}
}


/* java simpleInterst_5.java
simple intrest :100.0 */
