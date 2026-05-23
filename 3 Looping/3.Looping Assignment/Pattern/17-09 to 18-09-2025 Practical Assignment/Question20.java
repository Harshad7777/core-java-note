/*Q84. Write a java program to print this pattern.
	D
	D	C
	D	C	B
	D	C	B	A
	D	C	B 
	D	C
	D
*/

public class Question20
{
	public static void main(String x[])
	{
		for(int i=1; i<=7; i++)
		{
			char ch='D';
			for(int j=1; j<=4; j++)
			{
				if(j<=i && j<=4 && i<=4)
				{
					System.out.print(ch--);
				}
				else if(j<=8-i && i>4)
				{
					System.out.print(ch--);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}