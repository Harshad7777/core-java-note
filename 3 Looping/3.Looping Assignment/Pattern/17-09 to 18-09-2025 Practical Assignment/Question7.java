/*Q7. Write a java program to print this pattern.
				1
			A	B	C
		2	3	4	5	6
	D	E	F	G	H	I	J
7	8	9	10	11	12	13	14	15
*/

public class Question7
{
	public static void main(String x[])
	{
		int count=1;
		char ch='A';
		for(int i=1; i<=5; i++)
		{
			
			for(int j=1; j<=9; j++)
			{
				if(i%2==0)
				{
					if((j>=6-i && j<=5) || (j<=4+i && j>5))
					{
						System.out.print("    "+ch);
						ch++;
					}
					else 
					{
						System.out.print("     ");
					}
		
				}
				else if((j>=6-i && j<=5) || (j<=4+i && j>5))
				{
					System.out.print("    "+count++);	
				}
				else 
				{
					System.out.print("     ");
				}
				
			}
			System.out.println();
		}
	}
}