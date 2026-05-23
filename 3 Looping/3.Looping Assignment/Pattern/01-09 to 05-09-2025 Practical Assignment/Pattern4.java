/*Q1. Write a java program to print this pattern.			
            *
		 *  *  *
      *  *  *  *  *
   *  *  *  *  *  *  *
*  *  *  *  *  *  *  *  *
*/

public class Pattern4
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=9; j++)
			{
				                  
				//((j>=6-i && j<=5) || (j<=i+4 && j>=6))-another technique				  
				if(j>=6-i && j<=4+i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
