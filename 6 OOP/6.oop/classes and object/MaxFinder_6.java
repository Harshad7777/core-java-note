/* 6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
 */

class MaxFinder
{
	public int findMax(int a,int b,int c)
	{
		if(a>=b && a>=c)
			return a;
		else if(b>=c)
			return b;
		else
			return c;	
	}
}
public class MaxFinder_6
{
	public static void main (String x[])
	{
		MaxFinder obj = new MaxFinder();
		
		System.out.println("max :"+obj.findMax(10,20,30));
	}
}

/* 
java MaxFinder_6.java
max :30 */

