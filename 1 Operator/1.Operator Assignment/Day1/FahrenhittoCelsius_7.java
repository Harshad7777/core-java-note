/*
Q2. Write a java program to enter temperature in Fahrenheit and convert to Celsius.
	Formula :- cel = (fah - 32) * 5 / 9;
*/
import java.util.*;
public class FahrenhittoCelsius_7 
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tempterature in Fahrenheit:");
        double Fahrenheit = sc.nextDouble();

        double Celsius = (Fahrenheit - 32) * 5 / 9;

        System.out.println(Fahrenheit + " Fahrenheit is equal to " + Celsius + " Celsius.");

    }
}
//  javac FahrenhittoCelsius_7.java
//  java FahrenhittoCelsius_7.java 
// Enter tempterature in Fahrenheit:
// 100
// 100.0 Fahrenheit is equal to 37.77777777777778 Celsius.