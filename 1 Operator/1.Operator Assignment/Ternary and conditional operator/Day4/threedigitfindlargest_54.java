/*
Q54. Take a three-digit number and print the larger digit among first and last digit using ternary operator.
*/

/*
Q54. Take a three-digit number and print the larger digit among
first and last digit using ternary operator.
*/

import java.util.*;
public class threedigitfindlargest_54
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a three-digit number:");
        int a = sc.nextInt();
        
        int firstdigit = a / 100;   // extract first digit
        int lastdigit = a % 10;     // extract last digit
        
        String result = (firstdigit > lastdigit) 
                        ? "First digit is larger"
                        : "Last digit is larger";
        
        System.out.println("From this three-digit number, " + result);
    }
}

/* 
>javac threedigitfindlargest54.java
>java threedigitfindlargest54
enter the three-digit number
123
from this three-digit number last digit is  larger

>java threedigitfindlargest54
enter the three-digit number
321
from this three-digit number first digit is  larger

>
 */