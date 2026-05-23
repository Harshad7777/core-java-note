//Q51. Problem 
// Take two integers m and n. Use the ternary operator to print whether the absolute difference between them is greater than 10 or not.
// Example Input
// m = 25, n = 12

 import java.util.*;
 public class absolutedifference10ornot_51
{
	public static void main (String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first 25");
		int m = sc.nextInt();
		
		System.out.println("enter second 12");
		int n = sc.nextInt();
		
		String msg = ((m-n)==10)?"difference is grater than 10":"difference is not grater 10";
		
		System.out.println(msg);	
	}
}

/* >javac absolutedifference10ornot51.java
>java absolutedifference10ornot51
enter first 25
25
enter second 12
12
difference is not grater 10 */