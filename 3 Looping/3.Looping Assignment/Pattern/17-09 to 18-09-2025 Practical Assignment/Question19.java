/*Q83. Write a java program to print this pattern.
	1	A	2	B	3  
      C	  4   D   5  
		6	E	7  
      F   8   G   9  
	H	10	I	11	J
*/

public class Question19
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			char ch='A';
			for(int j=1; j<=9; j++)
			{
				if((i+j)%2==0)
				{
					if()
					System.out.print(count++);
					else
					System.out.print(ch++);	
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