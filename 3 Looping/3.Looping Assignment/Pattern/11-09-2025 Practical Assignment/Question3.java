/*Q3. Write a java program to print this pattern.
	1	2	3	4	5
	6	7	8	1	2
	3	4	5	6	7
	8	1	2	3	4	
	5	6	7	8	1
*/
public class Question3
{
	public static void main(String x[])
	{
		int count=1;
		for(int i=1; i<=5; i++)
		{	
			for(int j=1; j<=5; j++)
			{
				if(count>8)
				{
					count=1;
				}
				System.out.print(count++);

			}
			System.out.println(" ");
			
		}
	}
}