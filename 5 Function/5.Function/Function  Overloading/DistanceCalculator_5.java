/* Q5. Write a Java program with class DistanceCalculator that contains overloaded distance() methods to calculate:
distance = speed × time (integer type),
distance = initial velocity × time + 0.5 × acceleration × time² (double type). */

import java.util.*;
public class DistanceCalculator_5
{
	static void distance(int speed, int time)
	{
		int distance = speed * time ;
		System.out.println("distance is :"+distance );
	}
	static void distance( double initialvelocity ,double time,double acceleration)
	{
		double distance = initialvelocity * time + 0.5 * acceleration *(time*time) ;
		System.out.println("distance is :"+distance );
	}
	
	public static void main(String x[])
	{
		distance(5,10);
		distance(5d, 10d, 20d);
	}
}

/* java DistanceCalculator_5.java
distance is :50
distance is :1050.0 */
