/*Q3. Write a java program to print this pattern.

			 *******
			 ******
 			 *****
 			 ****
 			 ***
 			 **
 			 *
 			 **
 			 ***
 			 ****
 			 *****
 			 ******
 			 *******
*/

public class Question3
{
	public static void main(String x[])
	{
		for(int i=1; i<=13; i++)
		{
			for(int j=1; j<=7; j++)
			{ 
				
				if(j<=8-i || j<=i-6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}