/*Q3. Write a java program to print this pattern.
	*	*	*	*	*
	  *	          *
		*       *
	      *   *
			*  
*/

public class Question3
{
	public static void main(String x[])
	{
		boolean flag = true;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if((i==1 || j==i || j==10-i) && flag)
				{
					System.out.print("*  ");
					flag = false;
				}
				else
				{
					System.out.print("   ");
					flag = true;
				}	
			}
			System.out.println();
		}
	}
}