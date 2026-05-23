/* Q1. WAP to create class name as Table with functions 
 void setValue():  this function is used for accept the number as input parameter 
 void showTable(): this function can display the table of numbers.
  */
import java.util.*;

class Table
{
    private int num;   // variable to store the number

    // Function to accept number as input parameter
   public void setValue(int n)
    {
        num = n;
    }

    // Function to display the table of the number
    public void showTable()
    {
        System.out.println("Table of " + num + ":");
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

public class TableApplication_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int value = sc.nextInt();

		Table t = new Table();
        t.setValue(value);   // pass number to class
        t.showTable();       // show table
    }
}
