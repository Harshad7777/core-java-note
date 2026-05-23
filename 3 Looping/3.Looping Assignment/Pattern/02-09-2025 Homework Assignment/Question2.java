/*Q2. Write a java program to print this pattern.
*	*	*	*	*
*	*	*	*	#
*	*	*	#	#
*	*	#	#	#
*	#	#	#	#
*/

public class Question2
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j<=6-i)
				{
					System.out.print("\t*");
				}
				else
				{
					System.out.print("\t#");
				}				
			}
			System.out.println();
		}
	}
}