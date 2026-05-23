/*Q5. Write a java program to print this pattern.

	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1
*/

public class Question5
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j%2==1 && j<=6-i)
				{
					System.out.print(" "+(6-i));
				}
				else if(j<=6-i)
				{
					System.out.print(" *");
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