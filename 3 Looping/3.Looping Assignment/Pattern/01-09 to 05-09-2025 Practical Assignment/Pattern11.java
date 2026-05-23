/*Q2. Write a java program to print this pattern.
	*	*	*	*	*	*	*	*	*
	*	*	*	*		*	*	*	*
	*	*	*				*	*	*
	*	*						*	*
	*								*
	*	*						*	*
	*	*	*				*	*	*
	*	*	*	*		*	*	*	*
	*	*	*	*	*	*	*	*	*
*/

public class Pattern11
{
	public static void main(String x[])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				
				if(i<=j && j<=5 && i<=5)
				{
					System.out.print("*");
				}
			
				else if(j>=i+4 && j>=6 && i<=5)
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}