/*Q8. Write a java program to print this pattern.
	    		1
			  1   1
    		1   	1
		  1     	  1
		1	2	3	4	1
*/


public class Question8
{
	public static void main(String x[])
	{
		int count=2;
		boolean flag=true;
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
			
				if((j==6-i || j==4+i) && flag)
				{
					System.out.print("1");
					flag=false;
				}
				else if((j>=3 && j<=7) && i==5 && flag) 
				{
					System.out.print(count++);
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