/*Q15. Write a java program to print this pattern.
A
B	C
C		D
D			E
E	F	G	H	I
*/

public class Question15
{
	public static void main(String x[])
	{
		char ch='A';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==j || j==1 || i==5)
				{
					System.out.print(ch);
					ch++;
					if(i==j && i>1)
					--ch;
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