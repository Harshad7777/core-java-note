/*
Q15. Write a java program to print all ASCII characters with their values.
*/


public class PrintASCIICharacters_15
{
	public static void main(String x[])
	{
		System.out.println("all ASCII characters with their values");
		
		int i=0;
		while(i<=127)
		{
			System.out.println(i+":"+(char)i); //use(char)i tofind the characters of perticular value
			i++;
		}
		
	}
}


