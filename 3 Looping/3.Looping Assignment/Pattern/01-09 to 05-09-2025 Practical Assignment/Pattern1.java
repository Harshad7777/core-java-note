/*Q1. Write a java program to print this pattern.
	
	*	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*
	*	*	*	*	*
*/

public class Pattern1
{
	public static void main(String x[])
	{	
		int i,j;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=5; j++)
			{
				System.out.print(" * ");
			}
		System.out.print("\n");	
		}
	}
}