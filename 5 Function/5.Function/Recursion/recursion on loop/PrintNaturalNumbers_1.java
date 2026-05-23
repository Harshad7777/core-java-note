/* Q1. Write a java program to print all natural numbers from 1 to n. using while loop */


import java.util.*;

public class printNatPrintNaturalNumbers_1
{
	
		static void Natural(int n)
		{
			if(n==0)
			{
				return;
			}
			Natural (n-1);
			System.out.println(n);//recursive call
			
		}
		
		public static void main(String x[])
		{
			int n = 5;
			Natural(n);//function call
		}
}
/* 
import java.util.*;

public class PrintNaturalNumbers_1
{
    static void printNumbers(int n, int i)
	{
        if (i > n)
            return;
		
        System.out.print(i + " ");
        printNumbers(n, i + 1);
		
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
		
        printNumbers(n, 1);
    }
} */


/* java PrintNaturalNumbers_1.java
5
4
3
2
1
 */
