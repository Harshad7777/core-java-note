/*Q4. Write a java program to print this pattern.
	*	*	*	*	*	*	*
	*	*				*	*
	*		*		*		*
	*			*			*
	*		*		*		*
	*	*				*	*
	*	*	*	*	*	*	*
*/

public class Question4
{
	public static void main(String x[])
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=7; j++)
			{
				if(i==1 || i==7 || j==1 || j==7 || i==j || i+j==8)
				{
					System.out.print("*  ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
