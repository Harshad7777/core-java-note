/*Q76. Write a java program to print this pattern.
					A
				#	#	#
			A	B	C	B	A
		#	#	#	#	#	#	#
	A	B	C	D	E	D	C	B	A
		#	#	#	#	#	#	#
			A	B	C	B	A
				#	#	#
					A
*/

public class Question12
{
	public static void main(String x[])
	{
		int j;
		for(int i=1; i<=9; i++)
		{
			char ch='A';
			int count=1;
			for(j=1; j<=9; j++)
			{
				if(j>=6-i && j<=i+4 && j>=i-4 && j<=14-i)
				{
					if(i%2==1)
					{
						System.out.print(ch);
						if(j<5)
							ch++;
						else
							--ch;
					}
					else
					System.out.print("#");
				
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