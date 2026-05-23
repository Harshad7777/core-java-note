/*Q7. Write a java program to print this pattern.
					1
				2		2
			3				3
		4						4
	5								5
		4						4
			3				3
				2		2
					1
*/

public class Question7
{
	public static void main(String x[])
	{
		
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(i+j==6 || i==j-4)
				{
					System.out.print(""+i);
				}
				else if((i==j+4 || i+j==14) && i>5)
				{
					
					System.out.print(""+(10-i));
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