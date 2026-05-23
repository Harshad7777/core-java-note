/* Q2. WAP to create class name as Power with function 
  void setNum(): this function accept two values first is base and second is index 
  void showPower(): this function can calculate the power of two numbers and display it. */
import java.util.*;

class Power
{
    private int base;
    private int index;

    // Function to accept base and index
    public void setNum(int b, int i)
    {
        base = b;
        index = i;
    }

    // Function to calculate power and display it
    public void showPower()
    {
        int result = 1;

        for(int x = 1; x <= index; x++)
        {
            result = result * base;
        }

        System.out.println(base + " ^ " + index + " = " + result);
    }
}

public class powerApplication_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Power p = new Power();

        System.out.println("Enter base number:");
        int b = sc.nextInt();

        System.out.println("Enter index number:");
        int i = sc.nextInt();

        p.setNum(b, i);   // set values
        p.showPower();    // show result
    }
}


/* java powerApplication_2.java
enter base numbers:
5
enter index numbers:
3
5^3=125 */
