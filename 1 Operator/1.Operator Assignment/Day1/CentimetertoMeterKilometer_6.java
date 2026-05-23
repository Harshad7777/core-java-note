// Q1. Write a java program to enter length in centimeter and convert into meter and kilometer.

import java.util.*;
public class CentimetertoMeterKilometer_6
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length in centimeters: ");
        double centimeters = sc.nextDouble();

        double meters = centimeters / 100;
        double kilometers = centimeters / 100000;

        System.out.println(centimeters + " centimeters is equal to " + meters + " meters.");
        System.out.println(centimeters + " centimeters is equal to " + kilometers + " kilometers.");
    }
}
// javac CentimetertoMeterKilometer_6.java
// java CentimetertoMeterKilometer_6.java
// Enter length in centimeters: 100
// 100.0 centimeters is equal to 1.0 meters.
// 100.0 centimeters is equal to 0.001 kilometers.

