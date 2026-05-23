/*
Q24. Write a java program to check whether number is neon or not.
Input : 9
Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
*/
/*
Q24. Write a java program to check whether number is neon or not.
Input : 9
Output : Neon Number 
Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
*/

import java.util.*;

public class neonornot_24
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int number = sc.nextInt();

        int square = number * number;

        int sum = 0;
        int temp = square;

        // Find sum of digits of square
        while(temp > 0)
        {
            sum += temp % 10;
            temp /= 10;
        }

        if(sum == number)
            System.out.println("Number is Neon");
        else
            System.out.println("Number is Not Neon");
    }
}


/* >javac neonornot.java

>java neonornot
enter  number
9
number is neon */