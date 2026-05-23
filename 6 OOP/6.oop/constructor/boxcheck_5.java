/* Q5. Create a Box class with fields length, width, height.
   Initialize them with a constructor.
   Write a method isValidVolume() that checks volume:
   If volume > 0 → Print “Valid box”
   Else → Print “Invalid dimensions”

   Concepts Used:
   ✔ Constructor
   ✔ Logical condition (volume > 0)
   ✔ Multiplication operation
   Explanation:
   A box is valid only if all dimensions are positive.
*/

import java.util.*;

class Box
{
    private int length;
    private int width;
    private int height;

    // parameterized constructor
    public Box(int length, int width, int height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // method to check volume validity
    public void isValidVolume()
    {
        int volume = length * width * height; // corrected spelling

        if(volume > 0)
        {
            System.out.println("Valid box");
        }
        else
        {
            System.out.println("Invalid dimensions");
        }
    }
}

public class boxcheck_5
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter the width: ");
        int w = sc.nextInt();

        System.out.print("Enter the height: ");
        int h = sc.nextInt();

        Box b = new Box(l, w, h);
        b.isValidVolume();
    }
}


/* >java boxcheck_5.java
Enter length: 10
Enter the width: 10
Enter the height: 10
Valid box */