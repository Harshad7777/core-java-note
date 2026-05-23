/*Q3. Write a java program to print this pattern.
*
*	*
* 		*
*  			*
*	*	*	*	*
*/

public class Pattern6
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==5 || i==j || j==1) 
				{
					System.out.printf("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}