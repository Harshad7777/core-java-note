/*Q75. Write a java program to print this pattern.
								A
						1	2	1
				A	B	C	B	A
		1	2	3	4	3	2	1
A	B	C	D	E	D	C	B	A
*/

public class Question11
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			char ch='A';
			int count=1;
			for(int j=1; j<=9; j++)
			{
				if(i%2==1)
				{
					if(j>=10-i)
					{  
					System.out.print(ch++);
					}
					else
					{
					System.out.print("");
					}
				}
				else
				{
					System.out.print(count++);
				}
			}
			System.out.println();
		}
	}
}