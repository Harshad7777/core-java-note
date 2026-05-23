

/* Q12. Write a java program to calculate the product of digits in a number. */


import java.util.*;
public class Productofdigitinnumber_12
{
    // Recursive function
    static int productOfDigits(int num)
    {
        // Handle negative numbers
        if (num < 0)
            num = -num;

        // Base case: when number is a single digit
        if (num < 10)
            return num;

        // Recursive case: multiply last digit with product of remaining digits
        return (num % 10) * productOfDigits(num / 10);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int product = productOfDigits(num);
        System.out.println("Product of digits: " + product);
    }
}


/*
>javac productofdigitinnumber12.java
>java productofdigitinnumber12
enter the number
123
6

>java productofdigitinnumber12
enter the number
1234
24
*/
