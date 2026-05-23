/* Q3. Replace all elements in the array that are multiples of 5 with the number 5 itself.
Input: [10, 12, 15, 17, 20]
Output: [5, 12, 5, 17, 5]


Explanation:


10 is divisible by 5 → replaced with 5.
12 is not divisible by 5 → unchanged.
15 is divisible by 5 → replaced with 5.
17 is not divisible by 5 → unchanged.
20 is divisible by 5 → replaced with 5.
 */
import java.util.*;
public class Replacemultiplesof5with5_28
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		System.out.println("enter "+size+" elements");
		for(int i=0; i<size; i++)
			{
				a[i] = sc.nextInt();
			}
		
		for(int i=0; i<size; i++)
			{
				if(a[i]%5==0)
				{
					a[i]=5;
				}
			}
		
		System.out.println("output :");
		for(int i=0; i<size; i++)
			{
				System.out.print(a[i]+" ");
			}
		
		
	}
}


/* enter the size
5
enter 5 elements
10 12 15 17 20
output :
5 12 5 17 5 */