/* Question 3:
Given an integer n, find its floor square root using binary search.
Example:
 n = 17
 Output: 4 (since 4² = 16 ≤ 17 < 25)
Explanation:
Apply binary search between 1 and n.
If mid * mid == n, answer found.
If mid * mid < n, move right, but store mid as possible answer.
If mid * mid > n, move left
 */
import java.util.*;
public class FloorSquareRoot_3
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number");
		int n = sc.nextInt();
		
		int l=1, r = n, ans = 0, mid = 0;
		
		while(l<=r)
		{
			mid = l+(r-l)/2;
			
			if((long)mid*mid==n)
			{
				ans = mid;
				break;
			}
			else if((long)mid*mid < n)
			{
				ans = mid;
				l = mid + 1; // move  right
			}
			else
			{
				r = mid - 1; //move left
			}
		}
		System.out.println("floor squar root = "+ans);
	}
}

/* C:\Users\harsh\Downloads\java course notes\java\4.DS with JAVA\Ds Array Assignment>java FloorSquareRoot_3.java
enter the number
67
floor squar root = 8 */