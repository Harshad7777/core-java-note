/* Q5. WAP to create class name as Perfect with two methods 
void setNum(int no): this function can accept number as parameter 
void findPerfect(): this function can check number is perfect or not
 */
import java.util.*;

class Perfect
{
    private int num;
    
    public void setValue(int n)
    {
        num = n;
    }

    public void findPerfect()
    {
		
		int sum = 0;
		
		for(int i = 1; i<=num/2; i++)
		{
			if(num%i==0)
			{
				sum +=i;
			}
		}
		if(sum == num)
		{
			System.out.println(num+" is perfect Number");
		}
			
		else
		{
			System.out.println(num+" is not a perfect NUmber");
		}

    }
}

public class PerfectNumber_5  // corrected class name
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        Perfect p = new Perfect();
        p.setValue(n);
        p.findPerfect();
    }
}

/* java PerfectNumber_5.java
Enter a number:
6
6is perfect Number */