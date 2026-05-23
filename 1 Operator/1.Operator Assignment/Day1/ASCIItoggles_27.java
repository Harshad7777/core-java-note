 /*
Q27. Write a Java program that takes an alphabet character and toggles its case using ASCII values and operators.
        Example: a → A, Z → z.
*/

import java.util.*;
public class ASCIItoggles_27
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("alphabet character");
		char ch = sc.next().charAt(0);
		
		char result = (ch>='A' && ch<='Z')?(char)(ch+32):(char)(ch-32);
		
		System.out.println(result);
	}
}

/* 
>javac ASCIItoggles.java
>java ASCIItoggles
alphabet character
a
A

>java ASCIItoggles
alphabet character
z
Z */

