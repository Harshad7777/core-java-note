/*Q5. Write a java program to print this pattern.
#
#	*
#	*	#
#	*	#	*
#	*	#	*	#
*/


public class Question5
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j%2==1 && j<=i)
				{
					System.out.print("#");
				}
				if(j%2==0 && j<=i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("");
				}
			}
			System.out.println("");
		}
	}
}