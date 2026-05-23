/*Q3. Write a java program to print this pattern.
	A	B	C	D	E
	  A	  B	  C   D
		A	B	C
		  A	  B
			A
*/


public class Question3
{
	public static void main(String x[])
	{
		boolean flag=true;
		for(int i=1; i<=5; i++)
		{
			char ch='A';
			for(int j=1; j<=9; j++)
			{
				 if((i<=j && j<=5) && flag)
				{
					System.out.print(""+ch);
					ch++;
					flag=false;
				}
				 else if(j<=10-i && j>5 && flag)
				{
					System.out.print(""+ch);
					ch++;
					flag=false;
				}
				else
				{
					System.out.print(" ");
					flag=true;
				}
			}
			System.out.println("");
		
		
		}
	}
}