/*
Q33. Write a java program to display 1 to nth Armstrong Number.
Example : A strong number is one in which the factorial sum of the digits equals the number itself. 1, 2
Example : A number is thought of as an Armstrong number if the sum of its own digits raised to the power number of digits gives the number itself.
      For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
*/
import java.util.*;
public class Armstrong1tonthNumber_33
{
	public static void main(String x[])
	{
		int n, temp, rem=0, sum=0, count=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the number: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			temp = i;
			count = 0;
			int no = temp;
			while(no!=0)
			{			
				no=no/10;
				count++;
			}
				
				sum=0;
				no = temp;
				while(no!=0)
				{
					rem = no%10;
					int p=1;
					for(int j=1; j<=count; j++)
					{
						p = p*rem;
					}
					
					sum=sum+p;
					no = no/10;
				}
		
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}
}

/* 
C:\Users\harsh\Downloads\java course notes\java\3.Looping Assignment\day2>java Armstrong1tonthNumber33.java
Enter the number:
10000
Armstrong numbers from 1 to 10000 are:
1
2
3
4
5
6
7
8
9
153
370
371
407
1634
8208
9474
 */