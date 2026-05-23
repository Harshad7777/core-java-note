/* Q35. Write a java program to enter a number and print it in words.
 */
 
 import java.util.*;
 public class numbertowords_35
 {
	 public static void main (String x[])
	 {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int num = sc.nextInt(); //123
	
		int temp = num;
		int rev = 0;
		
		
		//reverse number
		while(temp >0)  
		{
			rev = rev*10+temp%10; //3,32,321
			temp/=10; //12,1 //if digit  become zero stop the while loop only that work
			
		}
		/* System.out.println(rev); */
		
		//num to world
		
		while(rev>0)
		{
			int digit = rev%10;
			
			switch(digit)
			{
				case 0:System.out.println("zero");break;
				case 1:System.out.println("one");break;
				case 2:System.out.println("two");break;
				case 3:System.out.println("three");break;
				case 4:System.out.println("four");break;
				case 5:System.out.println("five");break;
				case 6:System.out.println("six");break;
				case 7:System.out.println("seven");break;
				case 8:System.out.println("eight");break;
				case 9:System.out.println("nine");break;
			}
			
			rev/=10;
		}
	 }
 }
 
 /* >java numbertowords35.java
enter number
123
one
two
three
 */