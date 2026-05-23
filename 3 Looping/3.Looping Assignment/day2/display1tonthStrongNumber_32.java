/* 
Q32. Write a java program to display 1 to nth Strong Number.
*/
import java.util.*;
public class display1tonthStrongNumber_32
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt(); 

        for(int i = 1; i <= num; i++)
        {
            int sum = 0;
            int temp = i;
            int n = temp;

            while(n != 0)
            {	
                int rem = n % 10;  // extract digit

                // factorial of digit
                int f = 1;
                int r = rem;
                while(r != 0)
                {
                    f = f * r;
                    r--;
                }

                sum += f;
                n /= 10;
            }

            if(sum == i)
            {
                System.out.println(i);
            }
        }
    }
}


/* 
rem = 145 % 10 = 5

Factorial:
f = 1
f = 1 * 5 = 5
f = 5 * 4 = 20
f = 20 * 3 = 60
f = 60 * 2 = 120
f = 120 * 1 = 120

sum = 120
n = 145 / 10 = 14 


rem = 14 % 10 = 4

Factorial:
f = 1
f = 1 * 4 = 4
f = 4 * 3 = 12
f = 12 * 2 = 24
f = 24 * 1 = 24

sum = 120 + 24 = 144
n = 14 / 10 = 1

rem = 1 % 10 = 1

Factorial:
f = 1

sum = 144 + 1 = 145
n = 1 / 10 = 0
*/
/* >
java display1tonthStrongNumber32
 enter number
 1000
1
2
145		 */


// import java.util.*;
// public class Example32
// {
//     public static void main(String x[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt(); // 150

//         for(int i=1; i<=n; i++)
//         {
//             int temp = i;
//             int sum = 0;

//             while(temp > 0) {
//                 int rem = temp % 10;   
//                 int fact = 1;

//                 // factorial of digit
//                 for(int j=1; j<=rem; j++) 
// 				{
//                     fact = fact * j;
//                 }

//                 sum = sum + fact;
//                 temp = temp / 10; 
//             }

//             if(sum == i) {
//                 System.out.println(i);
//             }
//         }
//     }
// }
