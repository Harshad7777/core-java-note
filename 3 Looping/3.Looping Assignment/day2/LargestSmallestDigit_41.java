/* Q41. Write a Java program to find the largest and smallest digit of a given number.
 Explanation:
 Use a while loop to extract digits, compare each digit to track max and min.
  */
 
 
import java.util.*;
public class LargestSmallestDigit_41
	{
		public static void main (String x[])
			{
				Scanner sc = new Scanner (System.in);
				
				System.out.println("enter number");
				int num = sc.nextInt();  //num = 12345
				
				int min = 9;
				int max = -1;
				int n = num;
				
				while (num>0)
				{
					int digit = num%10;  //num = 5,
					
					if(digit>min)
					{
						min=digit ;
					}
					if(digit>max)
					{
						max=digit;
					}	
					num/=10;
				}	
					System.out.println(n+" given enter num");
					System.out.println(max+" minimum digit");
					System.out.println(min+" maximum digit");
			}
}
	

		