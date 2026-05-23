/*Q4. Write a java program to print this pattern.
	A	1	2	3	4
	A	B	1	2	3
	A	B	C	1	2
	A	B	C	D	1
	A	B	C	D	E
*/

public class Question4
{
	public static void main(String x[])
	{
		int count=1;
		for(int i=1; i<=5; i++)
		{ 
			char ch='A';
			count=1;
			for(int j=1; j<=5; j++)
			{
				if(i>=j)
				{
					System.out.print(" "+ch);
					ch++;
				}
				else
				{
					
					System.out.print(" "+count++);
				}
			}
			System.out.println();
			
		}
	}
}