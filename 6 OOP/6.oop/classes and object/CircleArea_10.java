/* 10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius. */


class CircleArea
{
	public double findArea(double r)
	{
		return 3.14159*r*r;
	}
}

public class CircleArea_10
{
	public static void main(String x[])
	{
		CircleArea obj = new CircleArea();
		
		System.out.println("Area :"+obj.findArea(5));
	}
}
	


/* 
java CircleArea_10.java
Area :78.53975 */