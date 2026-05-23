/*Q81. Write a java program to print this pattern.
A	B	C	D	E	D	C	B	A
A								A
A								A
A								A
A								A
*/

public class Question17
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			char ch='A';
			for(int j=1; j<=9; j++)
			{
				if(i==1 || j==1)
				{				
					if(j<5)
					{	
						System.out.print(ch++);
					}
					else
					{
						System.out.print(ch--);
					}
				}
				else if(j==9)
				{
					System.out.print("A");
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