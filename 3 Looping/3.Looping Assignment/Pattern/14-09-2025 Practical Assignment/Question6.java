/*Q6. Write a java program to print this pattern.
					1
				1	2	1	
            1	2	3	2	1
		1	2	3	4	3	2	1
 			1	2	3	2	1	
				1	2	1	
					1
*/

public class Question6
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=7; i++)
		{
			int count=0;
			for(int j=1; j<=7; j++)
			{
				if(i<=4)
				{
					if(j>=5-i && j<=4)
					{
						System.out.print(++count);	
					}
					else if(j<=3+i && j>=4)
					{
						System.out.print(--count);	
					}
					else
					{
						System.out.print(" ");	
					}
				}
				else
				{
					if(i<=j+3 && j<=4)
					{
						System.out.print(++count);	
					}
					else if(j<=11-i && j>=4)
					{
						System.out.print(--count);	
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
	}
}