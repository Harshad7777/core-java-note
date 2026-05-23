/* Q9. Count the number of Perfect numbers in an array.
Input: arr = [6, 28, 10, 12, 496]
Output: Count of Perfect numbers = 3
Explanation: A Perfect number is equal to the sum of its proper divisors (excluding itself). For each element, find sum of divisors and compare with the number, then count.
 */
 
public class PerfectNumbersInArray34
{
	public static void main(String x[])
	{
		int a[] = new int[]{6, 28, 10, 12, 496};
		int c=0;
		
		System.out.print("All Perfect Number = ");
		for(int i=0; i<a.length; i++)
		{
			int sum=0;
			for(int j=1; j<a[i]; j++)
			{
				if(a[i]%j==0)
				{
					sum+=j; //1, 2, 3 → sum = 1+2+3 = 6.
				}
			}
			
			if(sum==a[i]) //If the sum of divisors = number itself, it’s a Perfect Number.
			{
				System.out.print(a[i]+" ");
				c++;
			}
		}
		
		System.out.println();
		System.out.print("Count of Perfect numbers = "+c);
	}
}

/* >java PerfectNumbersInArray34.java
All Perfect Number = 6 28 496
Count of Perfect numbers = 3
 */
/* 
public class PerfectNumbersInArray34 
{
    public static void main(String[] args) {
        int[] arr = {6, 28, 10, 12, 496};

        int count = 0, i, j;

        for (i = 0; i < arr.length; i++) {
            if (isPerfect(arr[i])) {
                count++;
            }
        }

        System.out.println("Count of Perfect numbers = " + count);
    }

    // Method to check if a number is perfect
    public static boolean isPerfect(int n) {
        if (n <= 1) return false;  // 1 and negatives are not perfect
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
  */
