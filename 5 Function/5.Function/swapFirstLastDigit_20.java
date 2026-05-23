/* Q20. Write a java program to swap first and last digits of a number.
 */
 import java.util.*;

public class swapFirstLastDigit_20 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); //12345
		
		swapfirstandlast(num);
	}
		public static void swapfirstandlast(int num)
		{
			int first,last,middle,temp,digit;
			int count = 0;
			temp = num ;
			
			while(num!=0)//findindg digits in given num
			{
				num = num/10 ;//1234 123 12 1 0 false
				count++;
			}
				System.out.println("total count of digit : "+count);
				
				int i = 1;
				int power = 1;
				
				while(i <= count-1)
				//findindg power of num to place last digit to first digit
				{
					 power = power * 10 ;
					 i++;
				}
				
				System.out.println("total count of power : "+power);
				
				num=temp;
				
				last = num%10;
				first = num/power;
				middle = (num%power)/10;
				int total = last*power + middle*10 + first;
				
				System.out.println("last : "+last);
				System.out.println("first: "+first);
				System.out.println("middle : "+middle);
				System.out.println(temp+"reverse number is : "+total);
			}
}
 

/* java SwapFirstLastDigit_20.java
Enter a number:
1212
total count of digit : 4
total count of power : 1000
last : 2
first: 1
middle : 21
1212reverse number is : 2211 */
		
		
		
		
		


