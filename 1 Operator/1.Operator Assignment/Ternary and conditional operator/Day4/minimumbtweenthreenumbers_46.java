/*
Q46. Write a java program to find a minimum between three numbers
*/
import java.util.*;
public class minimumbtweenthreenumbers_46
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Enter third number:");
        int c = sc.nextInt();

        int min;

        if(a <= b && a <= c) {
            min = a;
        }
        else if(b <= a && b <= c) {
            min = b;
        }
        else {
            min = c;
        }

        System.out.println("Minimum number is " + min);
    }
}

/* 
> java minimumbtweenthreenumbers
enter first numbers
10
enter second numbers
20
enter third numbers
30
 minimum number is 10
 */