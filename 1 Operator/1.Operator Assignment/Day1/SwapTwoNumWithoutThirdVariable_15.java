import java.util.*;
public class SwapTwoNumWithoutThirdVariable_15
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.println("Enter second number (b): ");
        int b = sc.nextInt();

        // Swapping without third variable
        a = a + b;  
        b = a - b;  
        a = a - b;  

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

