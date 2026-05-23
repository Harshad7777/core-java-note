/*Q1. Write a java program to print this pattern.
				*
			*	*	*
		*		*		*
	*			*			*
*	*	*	*	*	*	*	*	*
	*			*			*
		*		*		*
			*	*	*
				*
*/

public class Pattern10
{
	public static void main(String x[])
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(i==5 || j==5 || (j==6-i && j<=5) || (j==4+i && j>5))
				{
					System.out.print("*  ");
				}
				else if((i==4+j || j==14-i) && i>=6)
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