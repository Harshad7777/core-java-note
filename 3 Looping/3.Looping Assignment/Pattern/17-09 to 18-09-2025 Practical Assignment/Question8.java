/*Q8. Write a java program to print this pattern.
	A								I
		B						H
			C				G
				D		F
					E
*/

public class Question8
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			char ch='A';
			for(int j=1; j<=9; j++)
			{
				if(i==j && j<=5)	
				{
					System.out.print("  "+ch);
				}
				else if(j==10-i && j>5)
				{
					System.out.print("  "+(++ch));
				}
				else
				{
					System.out.print("   ");
					ch++;
				}
			}
			System.out.println();
			
		}
	}
}