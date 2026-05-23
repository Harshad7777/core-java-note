/* Q42. Write a Java program to check whether a given number is a Kaprekar number or not, and to display all Kaprekar numbers up to n.

A Kaprekar number is a non-negative integer, the representation of whose square can be split into two parts that add up to the original number itself.
 For example:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45  

 */
 
/* import java.util.*;

public class Kaprekarnumberornot_42 
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt(); 

        int original = num; 

      //digits
        int count = 0;
        int temp = num;
        while (temp > 0) 
		{
            count++;
            temp /= 10;
        }

      
        long square = (long) num * num;
		
        long pow = 1;
        for (int i = 1; i <= count; i++) {
            pow *= 10;
        }

       
        long right = square % pow;
        long left = square / pow;

        if ((left + right) == num) {
            System.out.println(original + " is a Kaprekar number");
        } else {
            System.out.println(original + " is NOT a Kaprekar number");
        }
    }
} */
/* 
java Kaprekarnumberornot_42.java
Enter number:
9
9 is a Kaprekar number */


/* 
Q42. Write a Java program to check whether a given number is a Kaprekar number 
and to display all Kaprekar numbers up to n.

A Kaprekar number is a number whose square can be split into two parts which 
add up to the original number.

Examples:
9² = 81 → split as 8 and 1 → 8 + 1 = 9
45² = 2025 → split as 20 and 25 → 20 + 25 = 45  
*/
import java.util.*;

public class Kaprekarnumberornot_42 
{
    public static void main(String x[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();   // we print all Kaprekar numbers from 1 to num

        System.out.println("Kaprekar numbers from 1 to " + num + " are:");

        for (int j = 1; j <= num; j++) 
        {
            int temp = j;
            int count = 0;


            // Count digits
            while (temp > 0) {
                count++;
                temp /= 10;
            }

            long square = (long) j * j;

            long pow = 1;
            for (int i = 1; i <= count; i++) {
                pow *= 10; // 10^count
            }

            long right = square % pow;
            long left = square / pow;

            if (left + right == j) 
            {
                System.out.println(j);
            }
        }
    }
}



/* java Kaprekarnumberornot_42.java
Enter a number: 1000
1000 is NOT a Kaprekar number

Kaprekar numbers from 1 to 1000:
1 9 45 55 99 297 703 999 */