// Q3. Write a java program to enter temperature in Celsius and convert it into Fahrenheit.
// 	Formula :- fah = (cel * 9 / 5) + 32;

import java.util.*;
public class CelsiusToFahrenheit_7 
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temperature in Celsius:");
        double Cel= sc.nextDouble();

        double fah = (cel * 9 / 5) + 32;

        System.out.println{cel+" Celsius is convert it into Fahrenheit "+fah};

    }   
}
// java FahrenheitToCelsius_7.java
// Enter tempterature in Fahrenheit:
// 100
// 100.0 Fahrenheit is equal to 37.77777777777778 Celsius.