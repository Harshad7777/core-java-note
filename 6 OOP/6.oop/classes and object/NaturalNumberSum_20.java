/* 20. Calculate Sum of 1 to Nth Natural Numbers
Create a class NaturalNumberSum with a method calculateSum that computes the sum of the 1 to Nth natural numbers.
Explanation: Reinforces loops and arithmetic series formula. */

public class NaturalNumberSum
{
    public int calculateSum(int n) 
	{
        return n*(n + 1)/2;
		// Formula method Reinforces loops and arithmetic series formula
    }
}
public class NaturalNumberSum_20
{
	 public static void main(String[] args)
	{
        NaturalNumberSum obj = new NaturalNumberSum();
		
        System.out.println("Sum: " + obj.calculateSum(10));
    }
}
/* 


n * (n + 1) / 2
= 10 * (10 + 1) / 2
= 10 * 11 / 2

10 * 11 = 110

110 / 2 = 55

 
*/
/* java NaturalNumberSum_20.java
Sum: 55 */

