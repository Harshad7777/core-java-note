/*Q5. Write a java program to print this pattern.
	#	1	#	2	#
	3	#	4	#	5
	#	6	#	7	#
	8	#	9	#	10
	#	11	#	12	#
*/

public class Question5
{
	public static void main(String x[])
	{
		int count=1;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if((i+j)%2!=0)
				{
					System.out.print(count+"\t");
					count++;
				}
				else
				{
					System.out.print("#\t");
				}
			}
			System.out.println();
		}
	}
}