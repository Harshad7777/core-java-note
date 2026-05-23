/* Q4. WAP to create class name as Rev with two functions 
   void setValue(): this function is used for accept number 
   void showRev(): this function is used for reverse the number
*/

import java.util.*;

class Rev
{
    private int num;
    
    public void setValue(int n)
    {
        num = n;
    }

    public void showRev()
    {
        int rev = 0;
        int temp = num;
        
        while(temp > 0)
        {
            rev = rev * 10 + (temp % 10);
            temp = temp / 10;
        }

        System.out.println("Reverse of " + num + " is: " + rev);
    }
}

public class Reversenumber_4     // corrected class name
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        Rev r = new Rev();
        r.setValue(num);
        r.showRev();
    }
}


/* java Reversenumber_4.java
Enter a number:
1234
Reverse of 1234 is: 4321 */