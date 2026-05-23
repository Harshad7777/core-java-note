/* 15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping. */

class Swapper
{

    public void swap(int a, int b) 
	{
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
public class Swapper_15 
{
	public static void main(String[] args) 
	{
        Swapper obj = new Swapper();
		
        obj.swap(10, 20);
    }
}
	



/* java Swapper_15.java
After swap: a = 20, b = 10 */