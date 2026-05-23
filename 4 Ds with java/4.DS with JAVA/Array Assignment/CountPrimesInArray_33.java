/* Q8. Count the number of prime numbers in an array.
Input: arr = [2, 5, 6, 9, 11]
Output: Count of prime numbers = 3
Explanation: Check each element if it is prime (only divisible by 1 and itself), and count such elements.
 */

public class CountPrimesInArray33
{
	public static void main(String x[])
	{
		int a[] = new int[]{2, 5, 6, 9, 11};
		int c=0;
		System.out.print("All Prime Number = ");	
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=1; j<=a[i]; j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(a[i]+" ");
				c++;
			}
		}
			
		System.out.println();
		System.out.print("Count of prime numbers = "+c);
	}
}
/* 
public class CountPrimesInArray33
{
    public static void main(String[] args) 
	{
        int[] arr = {2, 5, 6, 9, 11};

        int count = 0;

        for (int i = 0; i < arr.length; i++) 
		{
            if (isPrime(arr[i])) 
			{
                count++;
            }
        }

        System.out.println("Count of prime numbers = " + count);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0, 1, negatives are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
 */