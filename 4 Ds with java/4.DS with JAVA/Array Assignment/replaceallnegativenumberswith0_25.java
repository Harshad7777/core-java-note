/*Q5. Write a java program to replace all negative numbers in an array with 0.	
	Input :- arr = [2, -3, 4, -1, 5]
	Output :-  [2, 0, 4, 0, 5]
*/
import java.util.*;
public class replaceallnegativenumberswith0_25
{
	public static void main(String x[])
	{
		int	a[] = new int[]{2, -3, 4, -1, 5};
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<0)
			{
				a[i]=0;
			}
			System.out.print(a[i]+" ");
		}
	}
}