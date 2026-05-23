/*Q82. Write a java program to print this pattern.
        1    
	  A	  B   
	2		3  
  B			  C	 	
4	5	6	7	8
*/

public class Question18
{
	public static void main(String x[])
	{
		boolean flag = true;
		int count=1;
		char ch='A';
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				if(((j==6-i || j==4+i || i==5) && i<=5) && flag)
				{
					if(i%2==0)
					{
						if(i==4 && j==2)
						System.out.print(--ch);
						else if(i==4 && j==8)
						System.out.print(++ch);
						else
						System.out.print(ch++);
						
					}
					else
					{
						System.out.print(count++);
					}
					flag = false;
				}
				
				else
				{
					System.out.print(" ");
					flag = true;
				}
			}
			System.out.println();
		}
		
	}
}