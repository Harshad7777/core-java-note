# Sliding Window in Java

## Code Links

1. [Q1. Maximum Sum Subarray of Size K](#q1-maximum-sum-subarray-of-size-k)
2. [Q2. Minimum Sum Subarray of Size K](#q2-minimum-sum-subarray-of-size-k)
3. [Q3. Average of All Subarrays of Size K](#q3-average-of-all-subarrays-of-size-k)
4. [Q4. Count Distinct Elements in Every Window of Size K](#q4-count-distinct-elements-in-every-window-of-size-k)
5. [Q5. Longest Subarray with Sum K (positive numbers)](#q5-longest-subarray-with-sum-k-positive-numbers)

## Q1. Maximum Sum Subarray of Size K

```java
public class Q1
{
	public static void main(String x[])
	{
		
		int a[] = new int[]{2,  1, 5, 1, 3, 2};
		int k=3;
		int sum=0, max;
		int start=0,end=0;
		for(int i=0; i<k; i++)
		{
			sum+=a[i];
		}
		max=sum;
		for(int i=k; i<a.length; i++)
		{
			sum+=a[i]-a[i-k];
			if(sum>max)
			{
				max=sum;
				start=i-k+1;
				end=i;
			}
		}
		System.out.print("Sum of max subarray: "+max);
		System.out.print("[");
		for(int i=start; i<=end; i++)
		{
			System.out.print(a[i]);
			if(i<end) System.out.print(", ");
		}
		System.out.print("]");
	}
}
```

## Q2. Minimum Sum Subarray of Size K

```java
public class Q2
{
	public static void main(String x[])
	{
		int a[] = new int[]{2, 1, 5, 1, 3, 2};
		int k=3;
		int min=0;
		int sum=0;
		int start=0,end=0;
		for(int i=0; i<k; i++)
		{
			sum+=a[i];
		}
		min=sum;
		for(int i=k; i<a.length; i++)
		{
			sum+=a[i]-a[i-k];
			if(sum<min)
			{
				min=sum;
				start=i-k+1;
				end=i;
			}
		}
		System.out.print("Sum of min subarray: "+min);
		System.out.print("[");
		for(int i=start; i<=end; i++)
		{
			System.out.print(a[i]);
			if(i<end) System.out.print(", ");
		}
		System.out.print("]");
	}
}
```

## Q3. Average of All Subarrays of Size K

```java
public class Q3
{
	public static void main(String x[])
	{
		int a[] = new int[]{1, 3, 2, 6, -1, 4, 1, 8, 2};
		int k=5;
		int sum=0;
		float avg;
		for(int i=0; i<k; i++)
		{
			sum+=a[i];
		}
		avg = (float)sum/k;
		System.out.print("Average of subarray: "+avg+" ");
		
		for(int i=k; i<a.length; i++)
		{
			sum+=a[i]-a[i-k];
			avg = (float)sum/k;
			System.out.print(avg+" ");
		}
		
		
	}
}
```

## Q4. Count Distinct Elements in Every Window of Size K

```java
public class Q4
{
	public static void main(String x[])
	{
		int a[] = new int[]{1, 2, 1, 3, 4, 2, 3};
		int k=4;
		int count=0;
		int i,j;
		for(i=0; i<=a.length-k; i++)//
		{
			count=0;
			for(j=i; j<i+k; j++)
			{
				boolean flag = true;
				for(int p=i; p<j; p++)
				{
					if(a[j]==a[p])
					{
						flag=false;
						break;
					}
				}
				if(flag)
				{
					count++;
				}
			}
			System.out.print(count+" ");
		}
		
		
	}
}
```

## Q5. Longest Subarray with Sum K (positive numbers)

```java
public class Q5
{
    public static void main(String x[])
    {
        int a[] = {4, 1, 1, 1, 2, 3, 5};
        int K = 5;

        int sum = 0;
        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < a.length; end++)
        {
            sum = sum + a[end];

            while (sum > K)
            {
                sum = sum - a[start];
                start++;
            }

            if (sum == K)
            {
                int len = end - start + 1;
                if (len > maxLen)
                {
                    maxLen = len;
                }
            }
        }

        System.out.println("Longest subarray length with sum " + K + " is: " + maxLen);
    }
}
```
