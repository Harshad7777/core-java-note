/*
Q43. Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
Explanation:
 Use a loop to count digits. Use another loop to extract each digit and calculate the digit raised to its position power using only loops (no Math.pow()). Check if the sum equals the original number.

 */
 // only for single digit
/* 
import java.util.*;

public class Disariumnumberornot_43
{
    public static void main(String x[]) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt(); 
	
        int original = num;
		
        //digits //poewr
        int count = 0;
        int temp = num;
        while (temp != 0) 
			{
				count++;
				temp /= 10;
			}
		//int power = count;
		int sum = 0;
		temp = num;
		int position = count ;
		
		while(temp != 0)
			{
				int digit = temp%10;
			
				int power = 1;
			
				for(int i=1; i<=position; i++)
				{
					power*=digit;
				}
				sum+=power;
				position--;	
				temp/=10;
			}
      
        if (sum == original) 
		{
            System.out.println(original + " is a Disarium number.");
        } 
		else
		{
            System.out.println(original + " is NOT a Disarium number.");
        }
    }
} */ 


// 1 to n

import java.util.*;

public class Disariumnumberornot43
{
    public static void main(String x[]) 
    {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter number: ");
        int num = sc.nextInt(); 
        
        for(int j = 1; j <= num; j++)
        {
            int original = j;

            // count digits
            int count = 0;
            int temp = j;
            while(temp != 0)
            {
                temp /= 10;
                count++;
            }

                int sum = 0;
                temp = j;
                int position = count; // RIGHT → LEFT positions

                while(temp != 0)
                {
                    int digit = temp % 10;
                    
                    // factorial of digit
                    int pow = 1;
                    for(int i = 1; i <= position; i++)
                    {
                        pow *= digit;
                    }

                    sum += pow;
                    position--;
                    temp /= 10;
                }

            if(sum == j)
            {
                System.out.println(j);
            }
        }
    }
}



 /* 
java Disariumnumberornot_43.java
Enter number:
1000
1
2
3
4
5
6
7
8
9
89
135
175
518
598 */