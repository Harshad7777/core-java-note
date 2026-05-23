/*Q4.Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd elements is equal.
	Input :- arr = [1, 2, 3, 4, 5, 6]
	Output :-  [2, 1, 4, 3, 6, 5]
*/

import java.util.*;
public class alternateevenandoddnumbers_24
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = new int[]{1, 2, 3, 4, 5, 6};
		int e[] = new int[a.length/2];
		int o[] = new int[a.length/2];
		int ep=0,op=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				e[ep]=a[i];
				ep++;
			}
			else
			{
				o[op]=a[i];
				op++;
			}
		}
		for(int i=0; i<a.length/2; i++)
		{
			System.out.print(e[i]+" "+o[i]+" ");
		}
		
	}
} 
 