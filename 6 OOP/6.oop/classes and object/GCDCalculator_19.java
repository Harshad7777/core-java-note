/* 
19. Find GCD of Two Numbers  
Create a class GCDCalculator with a method findGCD to compute the greatest common divisor of two numbers.
Explanation: Uses the Euclidean algorithm.
*/

public class GCDCalculator 
{
    public int findGCD(int a, int b) 
    {
        // Euclidean Algorithm
        while (b != 0) 
        {
            int temp = b;
            b = a % b;  // remainder becomes new 'b'
            a = temp;    // old 'b' becomes new 'a'
        }
        return a;       // when b becomes 0, 'a' is the GCD
    }
}
public class GCDCalculator_19 
{
	public static void main(String[] args) 
    {
        GCDCalculator obj = new GCDCalculator();
        
        System.out.println("GCD: " + obj.findGCD(48, 18));  // Output: 6
    }
}
/* 
java GCDCalculator_19.java
GCD: 6 */

/* 
a = 48
b = 18

temp = b = 18
b = a % b = 48 % 18 = 12
a = temp = 18

a = 18
b = 12

temp = b = 12
b = a % b = 18 % 12 = 6
a = temp = 12

a = 12
b = 6

temp = b = 6
b = a % b = 12 % 6 = 0
a = temp = 6

a = 6
b = 0

GCD = a = 6 
*/


/* 
java GCDCalculator_19.java
GCD: 6 */