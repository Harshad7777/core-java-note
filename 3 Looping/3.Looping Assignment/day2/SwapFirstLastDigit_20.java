/*
Q20. Write a java program to swap first and last digits of a number.
*/
/*
import java.util.*;

public class SwapFirstLastDigit20 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        // Count number of digits
        int digits = (int)Math.log10(num); 
		// gives highest power of 10
        int power = (int)Math.pow(10, digits);

        // Extract first and last digit
        int first = num / power;
        int last = num % 10;

        // Extract middle part (without first and last digit)
        int middle = (num % power) / 10;

        // Swap and rebuild number
        int swapped = (last * power) + (middle * 10) + first;

        System.out.println("Number after swapping first and last digits: " + swapped);
    }
}
*/

import java.util.*;

public class SwapFirstLastDigit_20 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a number: ");
        int num = sc.nextInt(); //12345
		
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
/*
>javac SwapFirstLastDigit20.java
>java SwapFirstLastDigit20
Enter a number:
123456789
total count of digit : 9
total count of power : 100000000
last : 9
first: 1
middle : 2345678
123456789reverse number is : 923456781
*/
		
		
		
		
		


