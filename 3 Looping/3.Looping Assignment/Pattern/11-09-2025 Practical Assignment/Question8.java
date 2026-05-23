/*Q8. Write a java program to print this pattern.
					1
				1		2
			1		2		3
		1		2		3		4
	1		2		3		4		5
		1		2		3		4
			1		2		3
				1		2
					1
*/

public class Question8
{
	public static void main(String x[])
	{
		boolean flag=true;
		int count=0;
		for(int i=1; i<=9; i++)
		{
			count=0;
			for(int j=1; j<=9; j++)
			{
				if((((j>=6-i && j<=4+i) && i<=5) || ((i<=j+4 && j<=14-i) && i>5)) && flag)
				{
					System.out.print(++count+" ");	
					flag=false;
				}
				else
				{
					System.out.print("  ");	
					flag=true;
				}
			}
			System.out.println("");
			
		}
	}
}