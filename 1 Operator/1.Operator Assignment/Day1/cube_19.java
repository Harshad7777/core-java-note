/*
Q19. Write a Java program that reads a number and display the cube.
*/

import java.util.*;
public class cube_19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter number");
		double nu = sc.nextInt();
		
		double cube = (nu*nu*nu);

		System.out.println("the cube of "+nu+" is " +cube);
		
		
	}
}

/* >java cube
enter number
3
the cube of 3.0 is 27.0
 */