/* Q4. Write a Java class VolumeCalculator with overloaded methods named volume() to calculate:
volume of a cube (using side),
volume of a cuboid (using length, breadth, height),
volume of a cylinder (using radius, height).
Hint: Apply formulas :
Cube → side³
Cuboid → l×b×h
Cylinder → 3.14×r×r×h */

import java.util.*;
public class VolumeCalculator_4
{
	static void volume(int side)
	{
		int cube = side*side*side;
		System.out.println("volume of a cube  is : "+cube);
	}
	static void volume(int length, int breadth, int height)
	{
		int cuboid = length*breadth*height;
		System.out.println("volume of a cuboid is: "+cuboid);
	}
	static void volume(double radius, double height)
	{
		double cylinder = 3.14*radius*radius*height;
		System.out.println("volume of a cylinder is : "+cylinder);
	}
	
	public static void main(String x[])
	{
		volume(2);
		volume(2, 3, 4);		
		volume(2d, 4d);
	}

}
/* 
java VolumeCalculator_4.java
volume of a cube  is : 8
volume of a cuboid is: 24
volume of a cylinder is : 50.24


 */