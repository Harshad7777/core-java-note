/*
Q10. Count the number of duck numbers in an array.
*/

public class ducknumbercount_35
{
	public static void main(String x[])
	{
		int a[] = new int[]{1, 10, 5, 20, 15,30};
		int count = 0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%10==0)
			{
				count++;
			}
		}
		System.out.print("total duck count is = "+count);
	}
}

/* total duck count is = 3 */
