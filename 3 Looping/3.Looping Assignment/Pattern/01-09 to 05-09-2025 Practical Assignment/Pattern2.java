/*Q2. Write a java program to print this pattern.
    *	*	*	*	*
	*				*
	*				*
	*				*
	*	*	*	*	*
*/
 
public class Pattern2
{
	public static void main(String x[])
	{	

		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i == 1 || i == 5 || j == 1 || j == 5)
				{
					System.out.print("\t*");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println("");
		}
	}
}