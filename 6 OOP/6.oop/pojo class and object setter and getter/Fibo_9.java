/*  Q9. WAP to create class name as Fibo with two functions 
 
void setLimit(int limit): this function is used for set the limit for fibonacci series 

void checkFibo(): this function can print the fibonacci series  */
import java.util.*;

class Fibo
{
    private int limit;

    public void setLimit(int limit)
    {
        this.limit = limit;
    }

    public void checkFibo()
    {
        int a = 0, b = 1;

        System.out.println("Fibonacci series upto " + limit + ":");

        for (int i = 1; i <= limit; i++)
        {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}

public class Fibo_9
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();

        Fibo f = new Fibo();
        f.setLimit(num);
        f.checkFibo();
    }
}

/* 
java Fibo_9.java
Enter the number :
10
Fibonacci series upto 10:
0 1 1 2 3 5 8 13 21 34 */