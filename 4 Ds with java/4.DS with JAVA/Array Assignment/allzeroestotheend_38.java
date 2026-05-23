/*
Q3. Write a program in java to move all zeroes to the end of a given array.
		Expected Output :
		The given array is : 2 5 7 0 4 0 7 -5 8 0
		The new array is:
		2 5 7 8 4 -5 7 0 0 0
*/

public class allzeroestotheend_38
{
	public static void main(String x[])
	{
		int a[] = new int[]{2 ,5, 7, 0, 4, 0, 7, -5, 8, 0};
		int k=0;
		int i,j;
		//move all non zeroes element to the fornt
		for(i=0; i<a.length; i++)
		{
			if(a[i]!=0)
			{
				a[k++]=a[i];
			}
		}
		//fill remaining with zeros
		while(k<a.length)
		{
			a[k++] = 0;
		}
		//print result
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

/* public class allzeroestotheend_38
{
	public static void main(String x[])
	{
		int a[] = new int[]{2 ,5, 7, 0, 4, 0, 7, -5, 8, 0};
		int b[] = new int[a.length];
		int i,j;
		for(i=0; i<a.length; i++)
		{
			for(j=i+1; j<a.length; j++)
			{
				if(a[i]==0)
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
} */
