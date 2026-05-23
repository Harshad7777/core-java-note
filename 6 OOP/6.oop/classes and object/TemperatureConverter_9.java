/* 9. Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
Explanation: Demonstrates unit conversion logic. */


public class TemperatureConverter
{
	public double convertToFahrenheit(double c)
	{
		return(c*9/5)+32;
	}
}
	
public class TemperatureConverter_9
{
	public static void main(String x[])
	{
		TemperatureConverter obj = new TemperatureConverter();
		
		System.out.println("Faherenhite :"+obj.convertToFahrenheit(37));
	}
}
	


/* 
java TemperatureConverter_9.java
Faherenhite :98.6 */