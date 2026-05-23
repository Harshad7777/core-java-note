/*
Q26. Write a java program to Check Number Is Spy Number or Not.
Example :
A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
     Input : 1412
     Output : Spy Number 

Explanation :
sum = (1 + 4 + 1 + 2) = 8
product = (1 * 4 * 1 * 2) = 8
since, sum == product == 8
*/

import java.util.Scanner;

public class Spynumber_26
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0, product = 1;

        while(temp > 0)
        {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        if(sum == product)
            System.out.println("Number is Spy Number");
        else
            System.out.println("Number is Not Spy Number");
    }
}

/* import java.util.Scanner;
public class Spynumber_26
{
 public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("enter the number: ");
 int num = sc.nextInt();
 
	int d4 = num%10;
	int d3= (num/10)%10; 
	int d2= (num/100)%10; 
	int d1= (num/1000);  

	
	int sum =  d4 + d3 + d2 + d1 ;
	int product =  d4 * d3 * d2 * d1 ;
	
	String res = (sum == product) ? " Number Is Spy Number " : " Number Is Not Spy Number  ";
	System.out.println(res); */
	/*
  System.out.println(d5);
  System.out.println(d4);
  System.out.println(d3);
  System.out.println(d2);
  System.out.println(d1);
  */
 }
}

/* >javac Spynumber.java
>java Spynumber
enter the number:
1412
Number Is Spy Number */

