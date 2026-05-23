/*
Q18. Write a java program to find the first and last digit of a number.
*/

import java.util.*;

public class FirstLastDigit_18 
{
    public static void main(String x[] )
	{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // Find last digit
        int lastDigit = num % 10; //1234%10=4

        // Find first digit
		//We keep dividing the number by 10 until it becomes a single-digit number.
		//because value of first digit grater than 10 become less then got a fist digit
        int firstDigit = num;
        while (firstDigit >= 10) //1234>=10,123>=10,12>=10,1>=10
		{
            firstDigit = firstDigit / 10;//1234/10=123,123/10=12,12/10=1
        }
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}
/*
>javac FirstLastDigit18.java
>java FirstLastDigit18
Enter a number:
123456
First digit: 1
Last digit: 6
*/



