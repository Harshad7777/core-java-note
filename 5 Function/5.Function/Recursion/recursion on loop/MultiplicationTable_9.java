/* Q9. Write a java program to print a multiplication table of any number. */


import java.util.*;

public class MultiplicationTable_9
{
    

    static void printTable(int num, int i)
    {
        if(i > 10)   // base condition (1 to 10)
            return;

        System.out.println(num + " x " + i + " = " + (num * i));
        printTable(num, i + 1);   // recursive call
    }
	
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiplication Table of " + num + ":");
        printTable(num, 1);
    }
}
