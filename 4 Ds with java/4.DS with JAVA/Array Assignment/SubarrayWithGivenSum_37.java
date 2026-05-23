/* Q2. Write a program in java to find a subarray with given sum from the given array?
		Expected Output :
		The given array is : 3 4 -7 1 3 3 1 -4
		[0..1] -- { 3 4 }
		[0..5] -- { 3 4 -7 1 3 3 }
		[3..5] -- { 1 3 3 }
		[4..6] -- { 3 3 1 }
		
 */		
public class SubarrayWithGivenSum_37
{
	public static void main(String x[])
	
	{
		int	a[] = new int[] {3, 4, -7, 1, 3, 3, 1, -4};
		
		int target = 7;
		
		for(int i=0; i<a.length; i++)
		{
			int sum = a[i];
		
			for(int j=i+1; j<a.length; j++)
			{
				sum+=a[j];
				if(sum==target)
				{
					System.out.print(i+ ".."+ j + " -- ");
					
					for(int k=i; k<=j; k++)
					{
						System.out.print(" "+a[k]+" ");
					}
					System.out.println("  ");
				}
				if(sum>target)
					break;
			}
		}
	}
}


/* 
🔹 Internal Working (Dry Run)
Pass 1: i = 0 (subarray starts at index 0)

sum = 0

Inner loop:

j=0 → sum=0+3=3 (not equal to 7)

j=1 → sum=3+4=7 ✅
→ print indices [0..1] and subarray {3,4}

j=2 → sum=7+(-7)=0

j=3 → sum=0+1=1

j=4 → sum=1+3=4

j=5 → sum=4+3=7 ✅
→ print indices [0..5] and subarray {3,4,-7,1,3,3}

continue until j=7, sums don’t match.

Pass 2: i = 1 (subarray starts at index 1)

sum=0

Inner loop:

j=1 → sum=4

j=2 → sum=4+(-7)=-3

j=3 → sum=-3+1=-2

j=4 → sum=-2+3=1

… none equals 7.

Pass 3: i = 2

sum=0

Inner loop:

j=2 → sum=-7

j=3 → sum=-7+1=-6

… never hits 7.

Pass 4: i = 3

sum=0

Inner loop:

j=3 → sum=1

j=4 → sum=1+3=4

j=5 → sum=4+3=7 ✅
→ print indices [3..5] and subarray {1,3,3}

Pass 5: i = 4

sum=0

Inner loop:

j=4 → sum=3

j=5 → sum=3+3=6

j=6 → sum=6+1=7 ✅
→ print indices [4..6] and subarray {3,3,1}

Pass 6: i = 5

sum=0

Inner loop:

j=5 → sum=3

j=6 → sum=3+1=4

j=7 → sum=4+(-4)=0
→ no match.

Pass 7: i = 6

sum=0

Inner loop:

j=6 → sum=1

j=7 → sum=1+(-4)=-3
→ no match.

Pass 8: i = 7

sum=0

Inner loop:

j=7 → sum=-4
→ no match. */