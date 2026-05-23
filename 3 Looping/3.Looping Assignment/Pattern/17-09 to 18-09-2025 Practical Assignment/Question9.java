/*Q9. Write a java program to print this pattern.		
	A	B	C	D	E
		1	2	3	4
			A	B	C
				1	2
					A
*/

public class Question9
{
	public static void main(String x[])
	{
		int count=1;
		for(int i=1; i<=5; i++)
		{
			count=1;
			char ch='A';
			for(int j=1; j<=5; j++)
			{
				if(i%2==1)
				{
					if(i<=j)
					{
						System.out.print(""+ch); 
						ch++;
					}
					else
					{
						System.out.print(" "); 
					}
				}
				else if(i%2==0 && i<=j)
				{
					System.out.print(""+count++); 
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