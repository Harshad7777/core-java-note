/*Q7. Write a java program to print this pattern.
			  	1
			  1	  1
			1	2	1
		  1   3   3   1
		1	4	6	4	1
*/

public class Question7
{
	public static void main(String x[])
	{	
		boolean flag=true;

		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				
				if(j>=6-i && j<=4+i && flag)
				{
					System.out.print("1");
					flag=false;
				}
				else if(i==5 && j>=3 && j<=7 && flag)
				{
					System.out.print(j+1);
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