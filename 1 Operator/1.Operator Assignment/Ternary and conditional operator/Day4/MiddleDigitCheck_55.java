/*
Q55. Take a three-digit number and print whether the middle digit is greater than the sum of the first and last digits using the ternary operator.
*/
import java.util.*;

public class MiddleDigitCheck_55
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a three-digit number: ");
        int num = sc.nextInt();

        int first = num / 100;          // first digit
        int middle = (num / 10) % 10;   // middle digit
        int last = num % 10;            // last digit

        String result = (middle > (first + last))
                        ? "Middle digit is greater than sum of first and last digits"
                        : "Middle digit is NOT greater than sum of first and last digits";

        System.out.println(result);
    }
}


/* 
>javac chacksumoffirstandlastisgreaterornot55.java

>java chacksumoffirstandlastisgreaterornot55
enter the three-digit number
123
middle digit is  NOT GREATER than the sum of the first and last digits

>java chacksumoffirstandlastisgreaterornot55
enter the three-digit number
132
middle digit is  NOT GREATER than the sum of the first and last digits */