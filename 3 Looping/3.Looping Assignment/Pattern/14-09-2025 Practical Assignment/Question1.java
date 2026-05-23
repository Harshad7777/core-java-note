/*Q1. Write a java program to print this pattern.
				1
			2	2
		3	3	3
	4	4	4	4
		3	3	3	
			2	2
				1
*/

public class Question1
{
	public static void main(String x[])
	{
		for(int i=1; i<=7; i++)
		{
			for(int j=1; j<=4; j++)
			{
				if(j>=5-i && i<=4)
				{
					System.out.print(" "+i);
				}
				else if(j>=i-3 && i>=5)
				{
					System.out.print(" "+(8-i));
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}