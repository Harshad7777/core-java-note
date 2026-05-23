/*Q2. Write a java program to print this pattern.
			A
		  A   B
		A	B	C
	  A	  B	  C	  D
	A	B	C	D	E
*/


public class Question2
{
	public static void main(String x[])
	{
		boolean flag=true;
		for(int i=1; i<=5; i++)
		{
			char ch='A';
			for(int j=1; j<=9; j++)
			{
				if((j>=6-i && j<=5) || (j<=6-i && j>=5))
				{
					System.out.print("   "+ch);
					ch++;	
					flag=false;
				}
				else
				{
					System.out.print("  ");
					flag=true;
				}
			}
			System.out.println("");
		
		
		}
	}
}