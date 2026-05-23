/*Q2. Write a java program to print this pattern.	
		    	1
	        1       2
	    1       2	    3
    1	    2	    3       4
1	    2	    3	    4	    5
*/ 


public class Question2
{
	public static void main(String x[])
	{
		for(int i=1; i<=5; i++)
		{
			int count=1;
			boolean flag=true;
			for(int j=1; j<=9; j++)
			{
				if(((j>=6-i && j<=5) || (j<=6-i && j>=5)) && flag)
				{
					System.out.print("   "+count++);
				}
				else
				{
					System.out.print("  "); 
				}
			}
			System.out.println("");
			
		}
	}
}