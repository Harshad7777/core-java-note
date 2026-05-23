/* Q9. Write a java program to print a multiplication table of any number.
*/

import java.util.*;
public class multiplicationtableofanynum_9
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter any one value for table making");
		int n = sc.nextInt();
		
		multiplication(n);
	}	
		
		public static void 		multiplication(int n)
		{
			int i = 1 ;
			while(i<=10)
			{
				System.out.println(n+" * "+ i +" = "+( n*i ));
				i++;
			}
		}	
}

/* java multiplicationtableofanynum_9.java
enter any one value for table making
2
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
2 * 10 = 20 */
