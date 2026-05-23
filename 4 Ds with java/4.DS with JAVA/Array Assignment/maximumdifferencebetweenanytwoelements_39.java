/* Q4. Write a program in java to find out the maximum difference between any two elements such that larger element appears after the smaller number.
	Expected Output :
	The given array is : 7 9 5 6 13 2
	The elements which provide maximum difference is: 5, 13
	The Maximum difference between two elements in the array is: 8
 */
 
public class maximumdifferencebetweenanytwoelements_39
{
	public static void main(String x[])
	{
		int a[]= new int[]{7,9, 5, 6, 13, 2};
		
		int maxdiff = 0;
		int start = a[0], end = a[0];
		for(int i=1; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				int diff = a[j]-a[i];
				if(diff>maxdiff)
				{
					maxdiff = diff;
					start=a[i];
					end = a[j];
				}
			}
		}
		System.out.println("The given array is : 7 9 5 6 13 2");
        System.out.println("The elements which provide maximum difference is: " + start + ", " + end);
        System.out.println("The Maximum difference between two elements in the array is: " + maxdiff);
    }	
}

/* 
The given array is : 7 9 5 6 13 2
The elements which provide maximum difference is: 5, 13
The Maximum difference between two elements in the array is: 8

 */