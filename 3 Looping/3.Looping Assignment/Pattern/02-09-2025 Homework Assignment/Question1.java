/*Q1. Write a java program to print this pattern.
	#	# 	#	#	#
	*	*	*	*
	#	#	#
	*	*
	#
*/

public class Question1
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i%2==1 && j<=6-i)
				{
					System.out.print("\t#");
				}
				else if(i%2==0 && i<=6-j)
				{
					System.out.print("\t*");
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