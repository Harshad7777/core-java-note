/*Q14. Write a java program to print this pattern.
A	B	C	D	E	D	C	B	A	
A	B	C	D	  	D	C	B	A	
A	B	C    			C	B	A
A	B     					B	A
A       						A
A	B     					B	A
A	B	C   			C	B	A
A	B	C	D 		D	C	B	A
A	B	C	D	E	D	C	B	A
*/


public class Question14
{
	public static void main(String x[])
	{
		for(int i=1; i<=9; i++)
		{
			char ch='A';
			for(int j=1; j<=9; j++)
			{
				if((j<=6-i && j<=5 && i<=5) || (j<=i-4 && i>5 && j<=5))
				{
					System.out.print(ch);
					ch++;
				}
				else if((j>=4+i && j>5 && i<=5) || (j>=14-i && i>5 && j>5))
				{
					--ch;
					System.out.print(ch);
					//ch++;
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