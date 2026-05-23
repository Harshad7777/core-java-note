/* 
Q20. Swap First and Last Digits of a Number (Using Recursion
 */
 
import java.util.*;

public class SwapFirstLastDigit_20
{
    // Recursive function to find first digit
	
    static int firstDigit(int num)
    {
        if (num < 10)
            return num;
		
        return firstDigit(num / 10);
    }

    // Recursive function to count total digits
	
    static int countDigits(int num)
    {
        if (num == 0)
            return 0;
        return 1 + countDigits(num / 10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int first = firstDigit(num);
		
        int last = num % 10;
        int digits = countDigits(num);

        // Remove first digit
		
        int middle = num % (int)Math.pow(10, digits - 1);
        middle = middle / 10;

        // Construct swapped number
		
        int swapped = last * (int)Math.pow(10, digits - 1) + middle * 10 + first;

        System.out.println("Original number: " + num);
		
        System.out.println("Swapped number: " + swapped);
    }
}

/* first = 1
last = 5
digits = 5

middle = 12345 % 10000 = 2345
middle = 2345 / 10 = 234

swapped = 5 * 10000 + 234 * 10 + 1
         = 50000 + 2340 + 1
         = 52341 */
