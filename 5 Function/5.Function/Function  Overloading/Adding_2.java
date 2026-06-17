/*Q2. Create a class Adder that contains overloaded methods named sum() to calculate:
sum of two integers,
sum of three integers, and
sum of two double values.
*/
import java.util.*;
public class Adding_2
{
    static void sum(int a, int b)
    {
        int sum = a+b;
        System.out.println("Two integers sum is: "+sum);
    }
    
    static void sum(int a, int b, int c)
    {
        int sum = a+b+c;
        System.out.println("Three integer sum is: "+sum);
    }

    static void sum(double a, double b)
    {
        double sum = a+b;
        System.out.println("Two double values sum is: "+sum);
    }
    
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int a = sc.nextInt();

        System.out.println("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("Enter third integer: ");
        int c = sc.nextInt();

        sum(a,b);
        sum(a,b,c);
        sum((double)a,(double)b);
    }
}