/*Q1. Write a java program to print this pattern.
	*
	*	*
	*	*	*
	*
	*	*
	*	*	*
*/

public class Question1
{
	public static void main(String x[])
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=3; j++)
			{       //part 1            //part 2
				if((j<=i && i<=3) || (i>=j+3 && i>=4))
				{
					System.out.print("* ");
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