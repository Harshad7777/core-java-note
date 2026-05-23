/*Q5. Write a java program to print this pattern.
	#
	#	*
	#	*	#
	#	*	#	*
	#	*	#	*	#
	#	*	#	*
	#	*	#	
	#	*
	#	
*/
public class Question6
{
	public static void main(String x[])
	{
		for(int i=1; i<=9; i++)
		{
			
			for(int j=1; j<=5; j++)
			{
				if(j%2==1 && i>=j && j<=10-i)
				{
					System.out.print("# ");				
				}
				else if(j%2==0 && i>=j && j<=10-i)
				{
					System.out.print("* ");
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