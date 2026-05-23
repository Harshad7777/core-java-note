/*Q1. Write a java program to print this pattern.
	5	4	3	2	1
		4	3	2	1
			3	2	1	
				2	1	
					1
*/

public class Question1
{
	public static void main(String x[])
	{
		for(int i=5; i>=1; i--)
		{
			for(int j=5; j>=1; j--)
			{
				if(i>=j)
				{
					System.out.printf(j+"\t");
				}
				else
				{
					System.out.printf("\t"); 
				}
			}
			System.out.println("");
			
		}
	}
}