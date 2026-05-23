/*Q3. Write a java program to print this pattern.
	*	*	*	*   *   *	
      *   *   *   *   *        
		*	*   *   *
		  *   *   *
			*   *
			  *
*/

public class Pattern9
{
	public static void main(String x[])
	{
		for(int i=1; i<=6; i++)
		{	
			boolean flag = true;
			for(int j=1; j<=11; j++)
			{
				if(i<=j && j<=12-i && flag)
				{
					System.out.print("*  ");
					flag=false;
				}
				else
				{
					System.out.print("   ");
					flag=true;
				}
			}
			System.out.println();
		}
	}
}