/*
Q23. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
Please note that a number with only leading 0s is not considered a Duck Number.
For example, numbers like 035 or 0012 are not considered as Duck Numbers.

*/
import java.util.*;

public class ducknumber_23
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number (duck number contains at least one zero): ");
        
        boolean flag = false;
        
        int num = sc.nextInt(); 
        int temp = num;

        while(num != 0)
        {
            int rem = num % 10;

            if(rem == 0)
            {
                flag = true;
            }

            num /= 10;
        }

        num = temp;

        if(flag)
        {
            System.out.println(num + " is a Duck Number");
        }
        else
        {
            System.out.println(num + " is NOT a Duck Number");
        }
    }
}


/*
java ducknumber_23.java
Enter number (duck number contains at least one zero):
102
102 is a Duck Number
4

*/
