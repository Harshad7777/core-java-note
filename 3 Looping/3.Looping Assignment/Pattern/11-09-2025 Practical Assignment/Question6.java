/*Q6. Write a java program to print this pattern.
	1
	2	3
	4		5
	6			7
	8	9	10	11	12
*/

public class Question6
{
	public static void main(String x[])
	{
		int count=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j==1 || i==5 || j==i)
				{
					System.out.print(" "+count);
					count++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}