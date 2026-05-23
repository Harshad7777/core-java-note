/*Q2. Write a java program to print this pattern.
	1
	3	3	3
	5	5	5	5	5	
	3	3	3
	1
*/

public class Question2
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==3)
				{
					System.out.print("5");
				}
				else if((i==2 || i==4) && j<=3)
				{
					System.out.print("3");
				}
				else if((i==1 && j==1) || (i==5 && j==1))
				{
					System.out.print("1");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}