/* Q7. Create a Car class with:
      brand, mileage
      Use a constructor to set values.

      Write a method getMileageRating():
      mileage < 10    → “Poor”
      10 to 15        → “Average”
      15 to 20        → “Good”
      > 20            → “Excellent”

      Explanation:
      Use if-else ladder inside a class method.
*/

import java.util.*;

class Car
{
    private String brand;
    private double mileage;

    // Parameterized Constructor
    public Car(String brand, double mileage)
    {
        this.brand = brand;
        this.mileage = mileage;
    }

    // Method to return mileage rating
    public void getMileageRating()
    {
        if(mileage < 10)
        {
            System.out.println("Poor");
        }
        else if(mileage >= 10 && mileage < 15)
        {
            System.out.println("Average");
        }
        else if(mileage >= 15 && mileage < 20)
        {
            System.out.println("Good");
        }
        else
        {
            System.out.println("Excellent");
        }
    }
}

public class carrating_7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car brand: ");
        String brand = sc.next();

        System.out.print("Enter mileage: ");
        double mil = sc.nextDouble();

        Car c = new Car(brand, mil);
        c.getMileageRating();
    }
}


/* >java carrating_7.java
Enter car brand: rollesroyel
Enter mileage: 3
Poor */