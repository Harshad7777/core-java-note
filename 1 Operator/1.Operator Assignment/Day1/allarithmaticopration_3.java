/*Q 3. Write a java program to enter two numbers and perform all arithmetic operations.*/

import java.util.Scanner;

public class allarithmaticopration_3
	{
        public static void main(String x[])
		{
            Scanner sc = new Scanner(System.in);

            System.out.println("enter your first number:");
			long a = sc.nextInt();
            System.out.println("enter your second number:");
            long b = sc.nextInt();
			
			long Add =a+b;
			long Sub =a-b;
			long Mul =a*b;
			long Div =a/b;
			long Mod =a%b;
			
			System.out.println("sum :"+Add);
			System.out.println("subtraction :"+Sub);
			System.out.println("multiplcation :"+Mul);
			System.out.println("Division :"+Div);
			System.out.println("Modulas :"+Mod);
		}	
	}

	
/*
java allarithmaticopration_3.java
enter your first number:
2
enter your second number:
2
sum :4
subtraction :0
multiplcation :4
Division :1
Modulas :0
*/
