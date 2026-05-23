/* Q7. WAP to create class name as Prime with two functions 
void setValue(int no): this function is used for accept number as parameter 
void checkPrime(): this function can check number is prime or not  */

import java.util.*;

class prime
{
	private int num;
	
	public void setValue(int no)
	{
		num = no;
	}
	
	public void checkPrime()
	{
		if(num<=1)
		{
			System.out.println(num+" is Not a prime number");
			
			return;
		}
		
		boolean isprime = true;
		
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				isprime = false;
				break;
			}
		}
		if(isprime)
		{
            System.out.println(num + " is a Prime Number");
		}
        else
		{
            System.out.println(num + " is NOT a Prime Number");
		}
	}
}
public class prime_7
{
	public static void main(String x[])
	{
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		prime p = new prime();
		
		p.setValue(num);
		p.checkPrime();
	}
}



/* 
>java prime_7.java
enter the number
7 */