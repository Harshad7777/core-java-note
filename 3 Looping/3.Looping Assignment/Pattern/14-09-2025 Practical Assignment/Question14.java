/*Q14. Write a java program to print this pattern.
	A
	B	B
	C	C	C	
	D	D	D	D
	E	E	E	E	E
*/


public class Question14
{
	public static void main(String x[])
	{
		char ch='A';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j<=i)
				{
					System.out.print(ch);
				}
			}
			System.out.println();
			ch++;
		}
	}
}