/* Q8. WAP to create class name as Duck with two functions 
  void setValue(int no): this function is used for accept number as parameter 
  void checkDuck(): this function is used for check number is duck or not   */
  
import java.util.*; 
class Duck
{
    private int num;

    // Accept number
   public void setValue(int no)
    {
        this.num = no;
    }

    // Check Duck number
   public void checkDuck()
    {
        int temp = num;
        boolean hasZero = false;

        while(temp!=0)
        {
            int digit = temp % 10;

            if(digit == 0)
            {
                hasZero = true;
                break;
            }

            temp = temp / 10;
        }

        if(hasZero)
            System.out.println(num + " is a Duck Number");
        else
            System.out.println(num + " is NOT a Duck Number");
    }
}

public class Duck_8
{
    public static void main(String[] args)
    {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
        Duck d = new Duck();

        d.setValue(num);   // you can input any number
        d.checkDuck();
    }
}


/* java Duck_8.java
enter the number
0
0 is NOT a Duck Number

java Duck_8.java
enter the number
205
205 is a Duck Number
 */