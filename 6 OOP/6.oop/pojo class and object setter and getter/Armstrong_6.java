/* Q6. WAP to create class name Armstrong with two methods 
void setNum(int no): this function can accept number as parameter 
void checkArm(): this function can check number is armstrong or not  */


import java.util.*;

class Armstrong
{
    private int num;

    public void setNum(int no)
    {
        num = no;
    }

    public void checkArm()
    {
        int temp = num;

        // Step 1: Count digits
        int count = 0;
        int t = num;
        while(t > 0)
        {
            count++;
            t /= 10;
        }

        // Step 2: Calculate Armstrong sum
        int sum = 0;
        temp = num;

        while(temp > 0)
        {
            int digit = temp % 10;

            int power = 1;
            for(int i = 1; i <= count; i++)
            {
                power *= digit;   // digit^count 
            }

            sum += power;
            temp /= 10;
        }

        // Step 3: Compare
        if(sum == num)
            System.out.println(num + " is an Armstrong Number");
        else
            System.out.println(num + " is NOT an Armstrong Number");
    }
}

public class Armstrong_6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

        Armstrong a = new Armstrong();
        a.setNum(n);
        a.checkArm();
    }
}

/* 
java Armstrong_6.java
Enter number:
153
153 is an Armstrong Number */