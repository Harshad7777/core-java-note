/*Q1. Move all zeros in an array to the end while maintaining the relative order of non-zero elements.
	Input :- arr = [0, 1, 0, 3, 12]
	Output :- arr = [1, 3, 12, 0, 0]
Explanation:
All non-zero elements [1, 3, 12] retain their original order.
All zeros are moved to the end of the array.
*/
import java.util.*;
public class Moveallzerostoend_21
{
	public static void main(String x[])
	{
		
		
		int a[] = new int[]{0,1,0,3,12};
		int b[] = new int [a.length];
		int i,j=0;
		
		for(i=0; i<a.length; i++)
		{
			if (a[i]!=0)
			{
				b[j] = a[i];
				j++;
			}
		}
		
		for(i=0; i<a.length; i++)
		{
			System.out.print(b[i]+" ");
		}
	}
}