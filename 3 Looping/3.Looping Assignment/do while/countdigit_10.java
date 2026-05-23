/*
Q10. Write a java program to count the number of digits in a number.
*/

import java.util.*;

public class countdigit10
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;
        int num = n;

        if (n == 0) 
		{
            count = 1;   // special case for 0
        } 
		else 
		{
            while (n != 0) 
			{
                n = n / 10;   // remove last digit
                count++;      // increase count
            }
        }

        System.out.println("Number of digits in " + num + " is: " + count);
    }
}

/*
>javac countdigit10.java
>java countdigit10
Enter a number: 12345
Number of digits in 12345 is: 5
*/



