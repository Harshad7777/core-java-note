/*Q13. Write a java program to print this pattern.
	A	B	C	D	E
	B	C	D	E	F
	C	D	E	F	G
	D	E	F	G	H
	E	F	G	H	I
*/

public class Question13
{	
	public static void main(String x[])
	{
		int count=1;
		for(int i=65; i<=69; i++)
		{
			count=i;
			for(int j=1; j<=5; j++)
			{
				System.out.print((char)count++);
			}
			System.out.println("");
			
		}
		
	}
}