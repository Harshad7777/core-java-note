/*Q2. Write a java program to print this pattern.
					*
				*		*
			*		*		*
		*		*		*		*
	*		*		*		*		*
		*		*		*		*
			*		*		*
				*		*
					*
*/

public class Question2
{
	public static void main(String x[])
	{
		boolean flag=true;
		for(int i=1; i<=9; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(j>=6-i && j<=4+i && i<=5 && flag)
				{
					System.out.print("*");
					flag=false;
			    }
				else if(j>=8-i && i>=6)
				{
					System.out.print("*");
					flag=false;
				}
				else
				{
					System.out.print(" ");
					flag=true;
				}	
			}
			System.out.println();
		}
	}
}